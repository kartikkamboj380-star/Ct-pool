package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f14197a;

    static {
        int[] iArr = new int[Z.values().length];
        f14197a = iArr;
        try {
            iArr[Z.EQUALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14197a[Z.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14197a[Z.GREATER_THAN_EQUALS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f14197a[Z.IDENTITY_EQUALS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f14197a[Z.IDENTITY_NOT_EQUALS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f14197a[Z.LESS_THAN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f14197a[Z.LESS_THAN_EQUALS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f14197a[Z.NOT_EQUALS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
