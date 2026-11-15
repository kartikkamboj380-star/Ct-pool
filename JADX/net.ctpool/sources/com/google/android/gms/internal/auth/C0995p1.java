package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0995p1 extends RuntimeException {
    public C0995p1(Z0 z02) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final H0 a() {
        return new H0(getMessage());
    }
}
