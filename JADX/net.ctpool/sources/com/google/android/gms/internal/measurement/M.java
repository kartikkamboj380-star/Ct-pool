package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f14266a;

    static {
        int[] iArr = new int[Z.values().length];
        f14266a = iArr;
        try {
            iArr[Z.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14266a[Z.NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14266a[Z.OR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
