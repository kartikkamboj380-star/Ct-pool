package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC1299j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0753g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f10265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f10269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f10270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f10271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f10272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f10273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f10274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f10275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f10276m;

    /* JADX INFO: renamed from: com.android.billingclient.api.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10278b;

        a(JSONObject jSONObject) {
            this.f10277a = jSONObject.getInt("commitmentPaymentsCount");
            this.f10278b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.g$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f10280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f10283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f10284f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AbstractC1299j f10285g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Long f10286h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final B f10287i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final F f10288j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final C f10289k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final D f10290l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final E f10291m;

        b(JSONObject jSONObject) {
            this.f10279a = jSONObject.optString("formattedPrice");
            this.f10280b = jSONObject.optLong("priceAmountMicros");
            this.f10281c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f10282d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f10283e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f10284f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i7));
                }
            }
            this.f10285g = AbstractC1299j.p(arrayList);
            this.f10286h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f10287i = jSONObjectOptJSONObject == null ? null : new B(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f10288j = jSONObjectOptJSONObject2 == null ? null : new F(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f10289k = jSONObjectOptJSONObject3 == null ? null : new C(jSONObjectOptJSONObject3);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f10290l = jSONObjectOptJSONObject4 == null ? null : new D(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f10291m = jSONObjectOptJSONObject5 != null ? new E(jSONObjectOptJSONObject5) : null;
        }

        public String a() {
            return this.f10279a;
        }

        public long b() {
            return this.f10280b;
        }

        public String c() {
            return this.f10281c;
        }

        public final String d() {
            return this.f10282d;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.g$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f10293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f10296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f10297f;

        c(JSONObject jSONObject) {
            this.f10295d = jSONObject.optString("billingPeriod");
            this.f10294c = jSONObject.optString("priceCurrencyCode");
            this.f10292a = jSONObject.optString("formattedPrice");
            this.f10293b = jSONObject.optLong("priceAmountMicros");
            this.f10297f = jSONObject.optInt("recurrenceMode");
            this.f10296e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f10296e;
        }

        public String b() {
            return this.f10295d;
        }

        public String c() {
            return this.f10292a;
        }

        public long d() {
            return this.f10293b;
        }

        public String e() {
            return this.f10294c;
        }

        public int f() {
            return this.f10297f;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.g$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f10298a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i7);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f10298a = arrayList;
        }

        public List a() {
            return this.f10298a;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.g$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f10302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f10303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final a f10304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final G f10305g;

        e(JSONObject jSONObject) {
            this.f10299a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f10300b = true == strOptString.isEmpty() ? null : strOptString;
            this.f10301c = jSONObject.getString("offerIdToken");
            this.f10302d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f10304f = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            this.f10305g = jSONObjectOptJSONObject2 != null ? new G(jSONObjectOptJSONObject2) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i7));
                }
            }
            this.f10303e = arrayList;
        }

        public String a() {
            return this.f10299a;
        }

        public String b() {
            return this.f10300b;
        }

        public List c() {
            return this.f10303e;
        }

        public String d() {
            return this.f10301c;
        }

        public d e() {
            return this.f10302d;
        }
    }

    C0753g(String str) {
        this.f10264a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f10265b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f10266c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f10267d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f10268e = jSONObject.optString("title");
        this.f10269f = jSONObject.optString("name");
        this.f10270g = jSONObject.optString("description");
        this.f10272i = jSONObject.optString("packageDisplayName");
        this.f10273j = jSONObject.optString("iconUrl");
        this.f10271h = jSONObject.optString("skuDetailsToken");
        this.f10274k = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                arrayList.add(new e(jSONArrayOptJSONArray.getJSONObject(i7)));
            }
            this.f10275l = arrayList;
        } else {
            this.f10275l = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f10265b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f10265b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i8)));
            }
            this.f10276m = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f10276m = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f10276m = arrayList2;
        }
    }

    public String a() {
        return this.f10270g;
    }

    public String b() {
        return this.f10269f;
    }

    public b c() {
        List list = this.f10276m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f10276m.get(0);
    }

    public String d() {
        return this.f10266c;
    }

    public String e() {
        return this.f10267d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0753g) {
            return TextUtils.equals(this.f10264a, ((C0753g) obj).f10264a);
        }
        return false;
    }

    public List f() {
        return this.f10275l;
    }

    public String g() {
        return this.f10268e;
    }

    public final String h() {
        return this.f10265b.optString("packageName");
    }

    public int hashCode() {
        return this.f10264a.hashCode();
    }

    final String i() {
        return this.f10271h;
    }

    public String j() {
        return this.f10274k;
    }

    public String toString() {
        List list = this.f10275l;
        return "ProductDetails{jsonString='" + this.f10264a + "', parsedJson=" + this.f10265b.toString() + ", productId='" + this.f10266c + "', productType='" + this.f10267d + "', title='" + this.f10268e + "', productDetailsToken='" + this.f10271h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
