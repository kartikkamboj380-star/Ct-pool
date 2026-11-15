package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f14388a;

    static {
        int[] iArr = new int[Z.values().length];
        f14388a = iArr;
        try {
            iArr[Z.ADD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14388a[Z.DIVIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14388a[Z.MODULUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f14388a[Z.MULTIPLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f14388a[Z.NEGATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f14388a[Z.POST_DECREMENT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f14388a[Z.POST_INCREMENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f14388a[Z.PRE_DECREMENT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f14388a[Z.PRE_INCREMENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f14388a[Z.SUBTRACT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
