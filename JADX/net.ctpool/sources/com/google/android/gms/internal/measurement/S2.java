package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static R2 f14333a;

    public static synchronized R2 a() {
        try {
            if (f14333a == null) {
                b(new U2());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14333a;
    }

    private static synchronized void b(R2 r22) {
        if (f14333a != null) {
            throw new IllegalStateException("init() already called");
        }
        f14333a = r22;
    }
}
