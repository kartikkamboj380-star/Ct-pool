package com.google.android.gms.common;

/* JADX INFO: renamed from: com.google.android.gms.common.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0947r {
    static int a(int i7) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i8 = 0; i8 < 6; i8++) {
            int i9 = iArr[i8];
            int i10 = i9 - 1;
            if (i9 == 0) {
                throw null;
            }
            if (i10 == i7) {
                return i9;
            }
        }
        return 1;
    }
}
