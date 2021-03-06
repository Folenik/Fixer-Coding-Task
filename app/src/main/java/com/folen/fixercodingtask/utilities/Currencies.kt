package com.folen.fixercodingtask.utilities

import androidx.annotation.DrawableRes
import com.folen.fixercodingtask.R

enum class Currencies(
    val currencyCode: String,
    val stringResId: Int,
    @DrawableRes val imageResId: Int
) {
    AED("AED", R.string.currency_AED, R.drawable.flag_ae),
    AFN("AFN", R.string.currency_AFN, R.drawable.flag_af),
    ALL("ALL", R.string.currency_ALL, R.drawable.flag_al),
    AMD("AMD", R.string.currency_AMD, R.drawable.flag_am),
    ANG("ANG", R.string.currency_ANG, R.drawable.flag_cw),
    AOA("AOA", R.string.currency_AOA, R.drawable.flag_ao),
    ARS("ARS", R.string.currency_ARS, R.drawable.flag_ar),
    AUD("AUD", R.string.currency_AUD, R.drawable.flag_au),
    AWG("AWG", R.string.currency_AWG, R.drawable.flag_aw),
    AZN("AZN", R.string.currency_AZN, R.drawable.flag_az),
    BAM("BAM", R.string.currency_BAM, R.drawable.flag_ba),
    BBD("BBD", R.string.currency_BBD, R.drawable.flag_bb),
    BDT("BDT", R.string.currency_BDT, R.drawable.flag_bd),
    BGN("BGN", R.string.currency_BGN, R.drawable.flag_bg),
    BHD("BHD", R.string.currency_BHD, R.drawable.flag_bh),
    BIF("BIF", R.string.currency_BIF, R.drawable.flag_bi),
    BMD("BMD", R.string.currency_BMD, R.drawable.flag_bm),
    BND("BND", R.string.currency_BND, R.drawable.flag_bn),
    BOB("BOB", R.string.currency_BOB, R.drawable.flag_bo),
    BRL("BRL", R.string.currency_BRL, R.drawable.flag_br),
    BSD("BSD", R.string.currency_BSD, R.drawable.flag_bs),
    BTC("BTC", R.string.currency_BTC, R.drawable.flag_btc),
    BTN("BTN", R.string.currency_BTN, R.drawable.flag_bt),
    BWP("BWP", R.string.currency_BWP, R.drawable.flag_bw),
    BYN("BYN", R.string.currency_BYN, R.drawable.flag_by),
    BYR("BYR", R.string.currency_BYR, R.drawable.flag_by),
    BZD("BZD", R.string.currency_BZD, R.drawable.flag_bz),
    CAD("CAD", R.string.currency_CAD, R.drawable.flag_ca),
    CDF("CDF", R.string.currency_CDF, R.drawable.flag_cd),
    CHF("CHF", R.string.currency_CHF, R.drawable.flag_ch),
    CLF("CLF", R.string.currency_CLF, R.drawable.flag_cl),
    CLP("CLP", R.string.currency_CLP, R.drawable.flag_cl),
    CNY("CNY", R.string.currency_CNY, R.drawable.flag_cn),
    COP("COP", R.string.currency_COP, R.drawable.flag_co),
    CRC("CRC", R.string.currency_CRC, R.drawable.flag_cr),
    CUC("CUC", R.string.currency_COP, R.drawable.flag_cu),
    CUP("CUP", R.string.currency_CUP, R.drawable.flag_cu),
    CVE("CVE", R.string.currency_CVE, R.drawable.flag_cv),
    CZK("CZK", R.string.currency_CZK, R.drawable.flag_cz),
    DJF("DJF", R.string.currency_DJF, R.drawable.flag_dj),
    DKK("DKK", R.string.currency_DKK, R.drawable.flag_dk),
    DOP("DOP", R.string.currency_DOP, R.drawable.flag_noflag),
    DZD("DZD", R.string.currency_DZD, R.drawable.flag_dz),
    EGP("EGP", R.string.currency_EGP, R.drawable.flag_eg),
    ERN("ERN", R.string.currency_ERN, R.drawable.flag_er),
    ETB("ETB", R.string.currency_ETB, R.drawable.flag_et),
    EUR("EUR", R.string.currency_EUR, R.drawable.flag_eu),
    FJD("FJD", R.string.currency_FJD, R.drawable.flag_fj),
    FKP("FKP", R.string.currency_FKP, R.drawable.flag_fk),
    GBP("GBP", R.string.currency_GBP, R.drawable.flag_gb),
    GEL("GEL", R.string.currency_GEL, R.drawable.flag_ge),
    GGP("GGP", R.string.currency_GGP, R.drawable.flag_gg),
    GHS("GHS", R.string.currency_GHS, R.drawable.flag_gh),
    GIP("GIP", R.string.currency_GIP, R.drawable.flag_gi),
    GMD("GMD", R.string.currency_GMD, R.drawable.flag_gm),
    GNF("GNF", R.string.currency_GNF, R.drawable.flag_gn),
    GTQ("GTQ", R.string.currency_GTQ, R.drawable.flag_noflag),
    GYD("GYD", R.string.currency_GYD, R.drawable.flag_gy),
    HKD("HKD", R.string.currency_HKD, R.drawable.flag_hk),
    HNL("HNL", R.string.currency_HNL, R.drawable.flag_hn),
    HRK("HRK", R.string.currency_HRK, R.drawable.flag_noflag),
    HTG("HTG", R.string.currency_HTG, R.drawable.flag_noflag),
    HUF("HUF", R.string.currency_HUF, R.drawable.flag_hu),
    IDR("IDR", R.string.currency_IDR, R.drawable.flag_id),
    ILS("ILS", R.string.currency_ILS, R.drawable.flag_il),
    IMP("IMP", R.string.currency_IMP, R.drawable.flag_im),
    INR("INR", R.string.currency_INR, R.drawable.flag_in),
    IQD("IQD", R.string.currency_IQD, R.drawable.flag_iq),
    IRR("IRR", R.string.currency_IRR, R.drawable.flag_ir),
    ISK("ISK", R.string.currency_ISK, R.drawable.flag_is),
    JEP("JEP", R.string.currency_JEP, R.drawable.flag_noflag),
    JMD("JMD", R.string.currency_JMD, R.drawable.flag_jm),
    JOD("JOD", R.string.currency_JOD, R.drawable.flag_jo),
    JPY("JPY", R.string.currency_JPY, R.drawable.flag_jp),
    KES("KES", R.string.currency_KES, R.drawable.flag_ke),
    KGS("KGS", R.string.currency_KGS, R.drawable.flag_kg),
    KHR("KHR", R.string.currency_KHR, R.drawable.flag_kh),
    KMF("KMF", R.string.currency_KMF, R.drawable.flag_km),
    KPW("KPW", R.string.currency_KPW, R.drawable.flag_kp),
    KRW("KRW", R.string.currency_KRW, R.drawable.flag_kr),
    KWD("KWD", R.string.currency_KWD, R.drawable.flag_kw),
    KYD("KYD", R.string.currency_KYD, R.drawable.flag_ky),
    KZT("KZT", R.string.currency_KZT, R.drawable.flag_kz),
    LAK("LAK", R.string.currency_LAK, R.drawable.flag_la),
    LBP("LBP", R.string.currency_LBP, R.drawable.flag_lb),
    LKR("LKR", R.string.currency_LKR, R.drawable.flag_lk),
    LRD("LRD", R.string.currency_LRD, R.drawable.flag_lr),
    LSL("LSL", R.string.currency_LSL, R.drawable.flag_ls),
    LTL("LTL", R.string.currency_LTL, R.drawable.flag_lt),
    LVL("LVL", R.string.currency_LVL, R.drawable.flag_lv),
    LYD("LYD", R.string.currency_LYD, R.drawable.flag_ly),
    MAD("MAD", R.string.currency_MAD, R.drawable.flag_ma),
    MDL("MDL", R.string.currency_MDL, R.drawable.flag_md),
    MGA("MGA", R.string.currency_MGA, R.drawable.flag_mg),
    MKD("MKD", R.string.currency_MKD, R.drawable.flag_mk),
    MMK("MMK", R.string.currency_MMK, R.drawable.flag_mm),
    MNT("MNT", R.string.currency_MNT, R.drawable.flag_mn),
    MOP("MOP", R.string.currency_MOP, R.drawable.flag_mo),
    MRO("MRO", R.string.currency_MRO, R.drawable.flag_mr),
    MUR("MUR", R.string.currency_MUR, R.drawable.flag_mu),
    MVR("MVR", R.string.currency_MVR, R.drawable.flag_mv),
    MWK("MWK", R.string.currency_MWK, R.drawable.flag_mw),
    MXN("MXN", R.string.currency_MXN, R.drawable.flag_noflag),
    MYR("MYR", R.string.currency_MYR, R.drawable.flag_my),
    MZN("MZN", R.string.currency_MZN, R.drawable.flag_mz),
    NAD("NAD", R.string.currency_NAD, R.drawable.flag_na),
    NGN("NGN", R.string.currency_NGN, R.drawable.flag_ng),
    NIO("NIO", R.string.currency_NIO, R.drawable.flag_ni),
    NOK("NOK", R.string.currency_NOK, R.drawable.flag_no),
    NPR("NPR", R.string.currency_NPR, R.drawable.flag_np),
    NZD("NZD", R.string.currency_NZD, R.drawable.flag_nz),
    OMR("OMR", R.string.currency_OMR, R.drawable.flag_om),
    PAB("PAB", R.string.currency_PAB, R.drawable.flag_pa),
    PEN("PEN", R.string.currency_PEN, R.drawable.flag_pe),
    PGK("PGK", R.string.currency_PGK, R.drawable.flag_pg),
    PHP("PHP", R.string.currency_PHP, R.drawable.flag_ph),
    PKR("PKR", R.string.currency_PKR, R.drawable.flag_pk),
    PLN("PLN", R.string.currency_PLN, R.drawable.flag_pl),
    PYG("PYG", R.string.currency_PYG, R.drawable.flag_py),
    QAR("QAR", R.string.currency_QAR, R.drawable.flag_qa),
    RON("RON", R.string.currency_RON, R.drawable.flag_ro),
    RSD("RSD", R.string.currency_RSD, R.drawable.flag_noflag),
    RUB("RUB", R.string.currency_RUB, R.drawable.flag_ru),
    RWF("RWF", R.string.currency_RWF, R.drawable.flag_rw),
    SAR("SAR", R.string.currency_SAR, R.drawable.flag_sa),
    SBD("SBD", R.string.currency_SBD, R.drawable.flag_sb),
    SCR("SCR", R.string.currency_SCR, R.drawable.flag_sc),
    SDG("SDG", R.string.currency_SDG, R.drawable.flag_sd),
    SEK("SEK", R.string.currency_SEK, R.drawable.flag_se),
    SGD("SGD", R.string.currency_SGD, R.drawable.flag_sg),
    SHP("SHP", R.string.currency_SHP, R.drawable.flag_sh),
    SLL("SLL", R.string.currency_SLL, R.drawable.flag_sl),
    SOS("SOS", R.string.currency_SOS, R.drawable.flag_so),
    SRD("SRD", R.string.currency_SRD, R.drawable.flag_sr),
    STD("STD", R.string.currency_STD, R.drawable.flag_st),
    SVC("SVC", R.string.currency_SVC, R.drawable.flag_noflag),
    SYP("SYP", R.string.currency_SYP, R.drawable.flag_sy),
    SZL("SZL", R.string.currency_SZL, R.drawable.flag_sz),
    THB("THB", R.string.currency_THB, R.drawable.flag_th),
    TJS("TJS", R.string.currency_TJS, R.drawable.flag_tj),
    TMT("TMT", R.string.currency_TMT, R.drawable.flag_tm),
    TND("TND", R.string.currency_TND, R.drawable.flag_tn),
    TOP("TOP", R.string.currency_TOP, R.drawable.flag_to),
    TRY("TRY", R.string.currency_TRY, R.drawable.flag_tr),
    TTD("TTD", R.string.currency_TTD, R.drawable.flag_tt),
    TWD("TWD", R.string.currency_TWD, R.drawable.flag_tw),
    TZS("TZS", R.string.currency_TZS, R.drawable.flag_tz),
    UAH("UAH", R.string.currency_UAH, R.drawable.flag_ua),
    UGX("UGX", R.string.currency_UGX, R.drawable.flag_ug),
    USD("USD", R.string.currency_USD, R.drawable.flag_us),
    UYU("UYU", R.string.currency_UYU, R.drawable.flag_uy),
    UZS("UZS", R.string.currency_UZS, R.drawable.flag_uz),
    VEF("VEF", R.string.currency_VEF, R.drawable.flag_ve),
    VND("VND", R.string.currency_VND, R.drawable.flag_vn),
    VUV("VUV", R.string.currency_VUV, R.drawable.flag_vu),
    WST("WST", R.string.currency_WST, R.drawable.flag_ws),
    XAF("XAF", R.string.currency_XAF, R.drawable.flag_xaf),
    XAG("XAG", R.string.currency_XAG, R.drawable.flag_xag),
    XAU("XAU", R.string.currency_XAU, R.drawable.flag_xau),
    XCD("XCD", R.string.currency_XCD, R.drawable.flag_xcd),
    XDR("XDR", R.string.currency_XDR, R.drawable.flag_xdr),
    XOF("XOF", R.string.currency_XOF, R.drawable.flag_xof),
    XPF("XPF", R.string.currency_XPF, R.drawable.flag_noflag),
    YER("YER", R.string.currency_YER, R.drawable.flag_ye),
    ZAR("ZAR", R.string.currency_ZAR, R.drawable.flag_za),
    ZMK("ZMK", R.string.currency_ZMK, R.drawable.flag_zm),
    ZMW("ZMW", R.string.currency_ZMW, R.drawable.flag_zm),
    ZWL("ZWL", R.string.currency_ZWL, R.drawable.flag_zw);

    companion object {
        fun getImage(currencyCode: String) = values()
            .find { currencyCode.contains(it.currencyCode) }?.imageResId ?: Constants.NO_RES

        fun getCurrencyName(currencyCode: String) = values()
            .find { currencyCode.contains(it.currencyCode) }?.stringResId ?: Constants.NO_RES
    }
}