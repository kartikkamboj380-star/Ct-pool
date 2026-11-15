package com.google.android.gms.internal.common;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1032i {
    static Object[] a(Object[] objArr, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (objArr[i8] == null) {
                throw new NullPointerException("at index " + i8);
            }
        }
        return objArr;
    }
}
