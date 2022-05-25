package com.folen.fixercodingtask.di

import com.folen.fixercodingtask.BuildConfig
import com.folen.fixercodingtask.api.APIService
import com.folen.fixercodingtask.repositories.RatesRepository
import com.folen.fixercodingtask.utilities.Constants
import com.folen.fixercodingtask.utilities.Constants.API_KEY_HEADER
import com.folen.fixercodingtask.viewmodel.RatesViewModel
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val repositoryModule = module {
    fun provideMoviesRepository(apiServices: APIService) = RatesRepository(apiServices)

    single { provideMoviesRepository(get()) }
}

val viewModelModule = module {
    fun provideRatesViewModel(repository: RatesRepository) = RatesViewModel(repository)

    viewModel { provideRatesViewModel(get()) }
}

val restModule = module {
    val connectTimeout: Long = Constants.BASE_TIMEOUT
    val readTimeout: Long = Constants.BASE_TIMEOUT
    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    fun provideHttpClient() = OkHttpClient.Builder()
        .connectTimeout(connectTimeout, TimeUnit.SECONDS)
        .readTimeout(readTimeout, TimeUnit.SECONDS)
        .addInterceptor(loggingInterceptor)
        .addInterceptor {
            it.request().newBuilder()
                .header(API_KEY_HEADER, BuildConfig.API_KEY)
                .build()
                .let { request ->
                    it.proceed(request)
                }
        }.build()

    fun provideRetrofit(client: OkHttpClient, serverUrl: String) = Retrofit.Builder()
        .baseUrl(serverUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .client(client)
        .build()

    single<Gson> { GsonBuilder().create() }
    single { provideHttpClient() }
    single { provideRetrofit(get(), BuildConfig.SERVER_URL) }

    single<APIService> { get<Retrofit>().create(APIService::class.java) }
}

val allModules = repositoryModule + viewModelModule + restModule