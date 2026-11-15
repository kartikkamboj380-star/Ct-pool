package com.facebook.yoga;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public enum k {
    NONE(0),
    STRETCH_FLEX_BASIS(1),
    ABSOLUTE_POSITIONING_INCORRECT(2),
    ABSOLUTE_PERCENT_AGAINST_INNER_SIZE(4),
    ALL(Api.BaseClientBuilder.API_PRIORITY_OTHER),
    CLASSIC(2147483646);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f13405m;

    k(int i7) {
        this.f13405m = i7;
    }

    public int h() {
        return this.f13405m;
    }
}
