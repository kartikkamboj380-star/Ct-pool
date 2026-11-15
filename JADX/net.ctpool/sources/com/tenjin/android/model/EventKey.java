package com.tenjin.android.model;

import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.utils.adnetwork.IronSourceHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class EventKey {
    public static String getEventKey(Transaction transaction) {
        return transaction.getProductId() + "." + transaction.getCurrencyCode() + "." + Integer.toString(transaction.getQuantity()) + "." + Double.toString(transaction.getUnitPrice()) + "." + transaction.getReceiptId() + "." + transaction.getUserId() + "." + transaction.getPurchaseData();
    }

    public static String getEventKey(String str) {
        return str;
    }

    public static String getEventKey(String str, int i7) {
        return str + "." + Integer.toString(i7);
    }

    public static String getEventKey(String str, String str2) {
        return str + "." + str2;
    }

    public static String getEventKey(String str, String str2, int i7, double d7) {
        return str + "." + str2 + "." + Integer.toString(i7) + "." + Double.toString(d7);
    }

    public static String getEventKey(String str, String str2, int i7, double d7, String str3, String str4) {
        return str + "." + str2 + "." + Integer.toString(i7) + "." + Double.toString(d7);
    }

    public static String getEventKey(String str, String str2, int i7, double d7, String str3, String str4, String str5) {
        return str + "." + str2 + "." + Integer.toString(i7) + "." + Double.toString(d7) + "." + str3 + "." + str4 + "." + str5;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getEventKey(String str, JSONObject jSONObject, String str2) {
        byte b7;
        try {
            switch (str.hashCode()) {
                case -927389981:
                    b7 = !str.equals(TenjinConsts.AD_NETWORK_IRONSOURCE) ? (byte) -1 : (byte) 1;
                    break;
                case -114321647:
                    if (str.equals(TenjinConsts.AD_NETWORK_HYPERBID)) {
                        b7 = 2;
                        break;
                    }
                    break;
                case 92668925:
                    if (str.equals(TenjinConsts.AD_NETWORK_ADMOB)) {
                        b7 = 3;
                        break;
                    }
                    break;
                case 110546420:
                    if (str.equals(TenjinConsts.AD_NETWORK_TOPON)) {
                        b7 = 4;
                        break;
                    }
                    break;
                case 1179703863:
                    if (str.equals(TenjinConsts.AD_NETWORK_APPLOVIN)) {
                        b7 = 0;
                        break;
                    }
                    break;
                default:
                    break;
            }
            if (b7 == 0) {
                return "ad_revenue." + str + "." + jSONObject.get("ad_unit_id").toString();
            }
            if (b7 == 1) {
                return "ad_revenue." + str + "." + jSONObject.get(IronSourceHelper.KEY_AUCTION_ID).toString();
            }
            if (b7 == 2) {
                return "ad_revenue." + str + "." + jSONObject.get("adsource_id").toString();
            }
            if (b7 == 3) {
                return "ad_revenue." + str + "." + jSONObject.get("ad_unit_id").toString();
            }
            if (b7 != 4) {
                return "ad_revenue." + str + "." + str2;
            }
            return "ad_revenue." + str + "." + jSONObject.get("adsource_id").toString();
        } catch (JSONException e7) {
            e7.printStackTrace();
            return "ad_revenue." + str + "." + str2;
        }
    }
}
