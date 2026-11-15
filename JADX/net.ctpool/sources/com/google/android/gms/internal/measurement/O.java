package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f14297a;

    static {
        int[] iArr = new int[Z.values().length];
        f14297a = iArr;
        try {
            iArr[Z.FOR_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14297a[Z.FOR_IN_CONST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14297a[Z.FOR_IN_LET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f14297a[Z.FOR_LET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f14297a[Z.FOR_OF.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f14297a[Z.FOR_OF_CONST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f14297a[Z.FOR_OF_LET.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f14297a[Z.WHILE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
