package com.android.billingclient.api;

import com.android.billingclient.api.C0753g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0753g.c f10159f;

    G(JSONObject jSONObject) {
        this.f10154a = jSONObject.getString("productId");
        this.f10155b = jSONObject.optString("title");
        this.f10156c = jSONObject.optString("name");
        this.f10157d = jSONObject.optString("description");
        this.f10158e = jSONObject.optString("basePlanId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.f10159f = jSONObjectOptJSONObject == null ? null : new C0753g.c(jSONObjectOptJSONObject);
    }
}
