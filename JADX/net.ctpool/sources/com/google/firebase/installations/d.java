package com.google.firebase.installations;

import Y3.l;

/* JADX INFO: loaded from: classes.dex */
public class d extends l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final a f17481m;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f17481m = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f17481m = aVar;
    }
}
