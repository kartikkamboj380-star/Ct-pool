package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1025b extends AbstractC1026c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f14095a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f14096b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f14097c;

    AbstractC1025b(int i7) {
    }

    public final AbstractC1025b a(Object obj) {
        obj.getClass();
        int i7 = this.f14096b;
        int i8 = i7 + 1;
        Object[] objArr = this.f14095a;
        int length = objArr.length;
        if (length >= i8) {
            if (this.f14097c) {
                this.f14095a = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.f14095a;
            int i9 = this.f14096b;
            this.f14096b = i9 + 1;
            objArr2[i9] = obj;
            return this;
        }
        int i10 = length + (length >> 1) + 1;
        if (i10 < i8) {
            int iHighestOneBit = Integer.highestOneBit(i7);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        if (i10 < 0) {
            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f14095a = Arrays.copyOf(objArr, i10);
        this.f14097c = false;
        Object[] objArr22 = this.f14095a;
        int i92 = this.f14096b;
        this.f14096b = i92 + 1;
        objArr22[i92] = obj;
        return this;
    }
}
