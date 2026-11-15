package com.tenjin.android.utils.adnetwork;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CASHelper extends BaseAdNetworkHelper {
    public static final String KEY_AD_NETWORK = "network_name";
    public static final String KEY_AD_UNIT = "ad_unit_id";
    public static final String KEY_CREATIVE_ID = "creative_id";
    public static final String KEY_FORMAT = "format";
    public static final String KEY_PRECISION = "revenue_precision";
    public static final String KEY_REVENUE = "revenue";
    private static final String METHOD_AD_NETWORK = "getNetwork";
    private static final String METHOD_AD_TYPE = "getAdType";
    private static final String METHOD_AD_UNIT_ID = "getIdentifier";
    private static final String METHOD_CREATIVE_ID = "getCreativeIdentifier";
    private static final String METHOD_PRECISION = "getPriceAccuracy";
    private static final String METHOD_REVENUE = "getCpm";

    static {
        BaseAdNetworkHelper.logTag = IronSourceHelper.class.getSimpleName();
        BaseAdNetworkHelper.helperObjectName = "IronSource";
    }

    public static JSONObject convertToJsonObject(Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_unit_id", getAdUnitId(obj));
            jSONObject.put("creative_id", getCreativeId(obj));
            jSONObject.put("network_name", getAdNetwork(obj));
            jSONObject.put("revenue", getRevenue(obj));
            jSONObject.put("revenue_precision", getPrecision(obj));
            jSONObject.put("format", getFormat(obj));
        } catch (JSONException e7) {
            Log.d(BaseAdNetworkHelper.logTag, "Error while creating JSON object from " + BaseAdNetworkHelper.helperObjectName + " data", e7);
        }
        return jSONObject;
    }

    private static String getAdNetwork(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_NETWORK, "network_name");
    }

    private static String getAdUnitId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_UNIT_ID, "ad_unit_id");
    }

    private static String getCreativeId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_CREATIVE_ID, "creative_id");
    }

    private static String getFormat(Object obj) {
        int intFromEnum = BaseAdNetworkHelper.getIntFromEnum(obj, METHOD_AD_TYPE, "format");
        return intFromEnum != 1 ? intFromEnum != 2 ? intFromEnum != 3 ? intFromEnum != 4 ? "none" : "rewarded" : "native" : "interstitial" : "banner";
    }

    private static String getPrecision(Object obj) {
        int i7 = BaseAdNetworkHelper.getInt(obj, METHOD_PRECISION, "revenue_precision");
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? "none" : "undisclosed" : "bid" : "floor";
    }

    private static double getRevenue(Object obj) {
        return BaseAdNetworkHelper.getDouble(obj, METHOD_REVENUE, "revenue");
    }
}
