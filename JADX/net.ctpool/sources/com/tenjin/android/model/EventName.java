package com.tenjin.android.model;

import com.tenjin.android.AttributionInfoCallback;
import com.tenjin.android.BasicCallback;
import com.tenjin.android.Callback;
import com.tenjin.android.config.TenjinConsts;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class EventName {
    private String adImpressionAdNetwork;
    private JSONObject adImpressionData;
    private AttributionInfoCallback attributionInfoCallback;
    private String currencyCode;
    private String dataSignature;
    private Callback deferredDeeplinkCallback;
    private int intValue;
    private String name;
    private String productId;
    private String purchaseData;
    private int quantity;
    private String receiptId;
    private Transaction transactionData;
    private final String type;
    private double unitPrice;
    private String userId;
    private String value;

    public EventName(Transaction transaction) {
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = transaction.transactionEventName();
        this.transactionData = transaction;
    }

    public String getAdImpressionAdNetwork() {
        return this.adImpressionAdNetwork;
    }

    public JSONObject getAdImpressionData() {
        return this.adImpressionData;
    }

    public AttributionInfoCallback getAttributionInfoCallback() {
        return this.attributionInfoCallback;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getDataSignature() {
        return this.dataSignature;
    }

    public Callback getDeferredDeeplinkCallback() {
        return this.deferredDeeplinkCallback;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public String getName() {
        return this.name;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPurchaseData() {
        return this.purchaseData;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getReceiptId() {
        return this.receiptId;
    }

    public Transaction getTransactionData() {
        return this.transactionData;
    }

    public String getType() {
        return this.type;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getValue() {
        return this.value;
    }

    public EventName(String str) {
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = TenjinConsts.EVENT_NAME;
        this.name = str;
    }

    public EventName(String str, int i7) {
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = TenjinConsts.EVENT_NAME_INT_VALUE;
        this.name = str;
        this.intValue = i7;
    }

    public EventName(String str, BasicCallback basicCallback) {
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = str;
        if (basicCallback instanceof Callback) {
            this.deferredDeeplinkCallback = (Callback) basicCallback;
        } else {
            if (!(basicCallback instanceof AttributionInfoCallback)) {
                throw new UnsupportedOperationException("Missing callback implementation");
            }
            this.attributionInfoCallback = (AttributionInfoCallback) basicCallback;
        }
    }

    public EventName(String str, String str2) {
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = TenjinConsts.EVENT_NAME_VALUE;
        this.name = str;
        this.value = str2;
    }

    public EventName(String str, String str2, int i7) {
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = str2;
        this.name = str;
        this.intValue = i7;
    }

    public EventName(String str, String str2, int i7, double d7) {
        this.intValue = 0;
        this.type = TenjinConsts.EVENT_NAME_TRANSACTION;
        this.productId = str;
        this.currencyCode = str2;
        this.quantity = i7;
        this.unitPrice = d7;
    }

    public EventName(String str, String str2, int i7, double d7, String str3, String str4) {
        this.intValue = 0;
        this.type = TenjinConsts.EVENT_NAME_TRANSACTION_DATA;
        this.productId = str;
        this.currencyCode = str2;
        this.quantity = i7;
        this.unitPrice = d7;
        this.purchaseData = str3;
        this.dataSignature = str4;
    }

    public EventName(String str, JSONObject jSONObject) {
        String str2;
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        str.hashCode();
        switch (str) {
            case "ironsource":
                str2 = TenjinConsts.EVENT_AD_IMPRESSION_DATA_IRONSOURCE;
                break;
            case "hyperbid":
                str2 = TenjinConsts.EVENT_AD_IMPRESSION_DATA_HYPERBID;
                break;
            case "admob":
                str2 = TenjinConsts.EVENT_AD_IMPRESSION_DATA_ADMOB;
                break;
            case "topon":
                str2 = TenjinConsts.EVENT_AD_IMPRESSION_DATA_TOPON;
                break;
            case "applovin":
                str2 = TenjinConsts.EVENT_AD_IMPRESSION_DATA_APPLOVIN;
                break;
            default:
                str2 = TenjinConsts.EVENT_AD_IMPRESSION_DATA;
                break;
        }
        this.type = str2;
        this.adImpressionAdNetwork = str;
        this.adImpressionData = jSONObject;
    }
}
