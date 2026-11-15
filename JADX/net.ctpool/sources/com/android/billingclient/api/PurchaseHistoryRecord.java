package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f10194c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f10192a = str;
        this.f10193b = str2;
        this.f10194c = new JSONObject(str);
    }

    private final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        if (this.f10194c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f10194c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i7));
                }
            }
        } else if (this.f10194c.has("productId")) {
            arrayList.add(this.f10194c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        return this.f10194c.optString("developerPayload");
    }

    public String b() {
        return this.f10192a;
    }

    public List c() {
        return g();
    }

    public long d() {
        return this.f10194c.optLong("purchaseTime");
    }

    public String e() {
        JSONObject jSONObject = this.f10194c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f10192a, purchaseHistoryRecord.b()) && TextUtils.equals(this.f10193b, purchaseHistoryRecord.f());
    }

    public String f() {
        return this.f10193b;
    }

    public int hashCode() {
        return this.f10192a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f10192a));
    }
}
