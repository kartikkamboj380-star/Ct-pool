package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1307l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f15213a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f15214b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C1303k f15215c;

    public final C1307l a(Object obj, Object obj2) {
        int i7 = this.f15214b + 1;
        Object[] objArr = this.f15213a;
        int length = objArr.length;
        int i8 = i7 + i7;
        if (i8 > length) {
            int i9 = length + (length >> 1) + 1;
            if (i9 < i8) {
                int iHighestOneBit = Integer.highestOneBit(i8 - 1);
                i9 = iHighestOneBit + iHighestOneBit;
            }
            if (i9 < 0) {
                i9 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            this.f15213a = Arrays.copyOf(objArr, i9);
        }
        AbstractC1279e.a(obj, obj2);
        Object[] objArr2 = this.f15213a;
        int i10 = this.f15214b;
        int i11 = i10 + i10;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f15214b = i10 + 1;
        return this;
    }

    public final AbstractC1311m b() {
        C1303k c1303k = this.f15215c;
        if (c1303k != null) {
            throw c1303k.a();
        }
        C1337u c1337uH = C1337u.h(this.f15214b, this.f15213a, this);
        C1303k c1303k2 = this.f15215c;
        if (c1303k2 == null) {
            return c1337uH;
        }
        throw c1303k2.a();
    }
}
