package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class N5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f15713a;

    static {
        int[] iArr = new int[w3.r.values().length];
        f15713a = iArr;
        try {
            iArr[w3.r.POLICY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15713a[w3.r.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f15713a[w3.r.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15713a[w3.r.UNINITIALIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
