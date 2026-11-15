package com.tenjin.android.model;

import android.text.TextUtils;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.enums.AppStoreTypeEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class Transaction {
    private AppStoreTypeEnum appStore;
    private String currencyCode;
    private String dataSignature;
    private String productId;
    private String purchaseData;
    private int quantity;
    private String receiptId;
    private double unitPrice;
    private String userId;

    public Transaction(AppStoreTypeEnum appStoreTypeEnum, String str, String str2, int i7, double d7, String str3, String str4, String str5, String str6) {
        k.f(appStoreTypeEnum, "appStore");
        k.f(str, "productId");
        k.f(str2, "currencyCode");
        k.f(str3, "receiptId");
        k.f(str4, "userId");
        k.f(str5, "purchaseData");
        k.f(str6, "dataSignature");
        this.appStore = appStoreTypeEnum;
        this.productId = str;
        this.currencyCode = str2;
        this.quantity = i7;
        this.unitPrice = d7;
        this.receiptId = str3;
        this.userId = str4;
        this.purchaseData = str5;
        this.dataSignature = str6;
    }

    public final AppStoreTypeEnum getAppStore() {
        return this.appStore;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getDataSignature() {
        return this.dataSignature;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getPurchaseData() {
        return this.purchaseData;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getReceiptId() {
        return this.receiptId;
    }

    public final double getUnitPrice() {
        return this.unitPrice;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void setAppStore(AppStoreTypeEnum appStoreTypeEnum) {
        k.f(appStoreTypeEnum, "<set-?>");
        this.appStore = appStoreTypeEnum;
    }

    public final void setCurrencyCode(String str) {
        k.f(str, "<set-?>");
        this.currencyCode = str;
    }

    public final void setDataSignature(String str) {
        k.f(str, "<set-?>");
        this.dataSignature = str;
    }

    public final void setProductId(String str) {
        k.f(str, "<set-?>");
        this.productId = str;
    }

    public final void setPurchaseData(String str) {
        k.f(str, "<set-?>");
        this.purchaseData = str;
    }

    public final void setQuantity(int i7) {
        this.quantity = i7;
    }

    public final void setReceiptId(String str) {
        k.f(str, "<set-?>");
        this.receiptId = str;
    }

    public final void setUnitPrice(double d7) {
        this.unitPrice = d7;
    }

    public final void setUserId(String str) {
        k.f(str, "<set-?>");
        this.userId = str;
    }

    public final String transactionEventName() {
        return this.appStore == AppStoreTypeEnum.AMAZON ? TenjinConsts.EVENT_NAME_TRANSACTION_AMAZON : !TextUtils.isEmpty(this.purchaseData) ? TenjinConsts.EVENT_NAME_TRANSACTION_DATA : TenjinConsts.EVENT_NAME_TRANSACTION;
    }

    public /* synthetic */ Transaction(AppStoreTypeEnum appStoreTypeEnum, String str, String str2, int i7, double d7, String str3, String str4, String str5, String str6, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(appStoreTypeEnum, str, str2, i7, d7, (i8 & 32) != 0 ? "" : str3, (i8 & 64) != 0 ? "" : str4, (i8 & 128) != 0 ? "" : str5, (i8 & 256) != 0 ? "" : str6);
    }
}
