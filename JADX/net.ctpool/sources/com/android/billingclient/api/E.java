package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10153b;

    E(JSONObject jSONObject) {
        this.f10152a = jSONObject.getString("rentalPeriod");
        String strOptString = jSONObject.optString("rentalExpirationPeriod");
        this.f10153b = true == strOptString.isEmpty() ? null : strOptString;
    }
}
