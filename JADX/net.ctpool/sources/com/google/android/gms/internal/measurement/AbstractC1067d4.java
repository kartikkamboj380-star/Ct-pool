package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1067d4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f14550b = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f14551a;

    private AbstractC1067d4() {
        this.f14551a = f14550b;
    }

    public static int a(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long b(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    static AbstractC1067d4 c(byte[] bArr, int i7, int i8, boolean z6) {
        C1094g4 c1094g4 = new C1094g4(bArr, i8);
        try {
            c1094g4.d(i8);
            return c1094g4;
        } catch (I4 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract int d(int i7);

    public abstract int e();
}
