package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1365b2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f15917g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Z1 f15919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f15920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f15921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f15922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f15923f;

    private C1365b2(String str, Object obj, Object obj2, Z1 z12) {
        this.f15921d = new Object();
        this.f15922e = null;
        this.f15923f = null;
        this.f15918a = str;
        this.f15920c = obj;
        this.f15919b = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        Z1 z12;
        synchronized (this.f15921d) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC1379d2.f15985a == null) {
            return this.f15920c;
        }
        synchronized (f15917g) {
            try {
                if (C1369c.a()) {
                    return this.f15923f == null ? this.f15920c : this.f15923f;
                }
                try {
                } catch (SecurityException unused) {
                }
                for (C1365b2 c1365b2 : G.f15508a) {
                    if (C1369c.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object objA = null;
                    try {
                        Z1 z13 = c1365b2.f15919b;
                        if (z13 != null) {
                            objA = z13.a();
                        }
                    } catch (IllegalStateException unused2) {
                    }
                    synchronized (f15917g) {
                        c1365b2.f15923f = objA;
                    }
                    z12 = this.f15919b;
                    if (z12 != null) {
                        return this.f15920c;
                    }
                    try {
                        return z12.a();
                    } catch (IllegalStateException unused3) {
                        return this.f15920c;
                    } catch (SecurityException unused4) {
                        return this.f15920c;
                    }
                }
                z12 = this.f15919b;
                if (z12 != null) {
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.f15918a;
    }
}
