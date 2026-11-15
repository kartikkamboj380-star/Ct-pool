package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC1529z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f16364a;

    static {
        int[] iArr = new int[w3.r.values().length];
        f16364a = iArr;
        try {
            iArr[w3.r.UNINITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f16364a[w3.r.POLICY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f16364a[w3.r.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f16364a[w3.r.GRANTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
