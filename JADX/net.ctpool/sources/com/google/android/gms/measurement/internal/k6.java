package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.T1;
import com.google.android.gms.internal.measurement.V1;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f16141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f16142b;

    static {
        int[] iArr = new int[T1.b.values().length];
        f16142b = iArr;
        try {
            iArr[T1.b.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f16142b[T1.b.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f16142b[T1.b.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f16142b[T1.b.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[V1.b.values().length];
        f16141a = iArr2;
        try {
            iArr2[V1.b.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f16141a[V1.b.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f16141a[V1.b.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f16141a[V1.b.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f16141a[V1.b.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f16141a[V1.b.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
