package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.N7;
import com.google.android.gms.internal.measurement.Y1;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class O2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f15714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f15715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f15716c;

    static {
        int[] iArr = new int[Y1.d.values().length];
        f15716c = iArr;
        try {
            iArr[Y1.d.DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15716c[Y1.d.GRANTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[Y1.e.values().length];
        f15715b = iArr2;
        try {
            iArr2[Y1.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15715b[Y1.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f15715b[Y1.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f15715b[Y1.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[N7.values().length];
        f15714a = iArr3;
        try {
            iArr3[N7.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f15714a[N7.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f15714a[N7.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f15714a[N7.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
