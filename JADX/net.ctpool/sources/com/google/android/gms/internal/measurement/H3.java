package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.K2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f14213a;

    static {
        int[] iArr = new int[K2.a.values().length];
        f14213a = iArr;
        try {
            iArr[K2.a.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14213a[K2.a.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14213a[K2.a.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f14213a[K2.a.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f14213a[K2.a.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
