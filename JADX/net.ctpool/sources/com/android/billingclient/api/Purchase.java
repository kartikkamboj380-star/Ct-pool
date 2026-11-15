package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f10191c;

    public Purchase(String str, String str2) {
        this.f10189a = str;
        this.f10190b = str2;
        this.f10191c = new JSONObject(str);
    }

    private final ArrayList m() {
        ArrayList arrayList = new ArrayList();
        if (this.f10191c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f10191c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i7));
                }
            }
        } else if (this.f10191c.has("productId")) {
            arrayList.add(this.f10191c.optString("productId"));
        }
        return arrayList;
    }

    public C0747a a() {
        JSONObject jSONObject = this.f10191c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new C0747a(strOptString, strOptString2);
    }

    public String b() {
        return this.f10191c.optString("developerPayload");
    }

    public String c() {
        String strOptString = this.f10191c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    public String d() {
        return this.f10189a;
    }

    public String e() {
        return this.f10191c.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f10189a, purchase.d()) && TextUtils.equals(this.f10190b, purchase.j());
    }

    public List f() {
        return m();
    }

    public int g() {
        return this.f10191c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long h() {
        return this.f10191c.optLong("purchaseTime");
    }

    public int hashCode() {
        return this.f10189a.hashCode();
    }

    public String i() {
        JSONObject jSONObject = this.f10191c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String j() {
        return this.f10190b;
    }

    public boolean k() {
        return this.f10191c.optBoolean("acknowledged", true);
    }

    public boolean l() {
        return this.f10191c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f10189a));
    }
}
