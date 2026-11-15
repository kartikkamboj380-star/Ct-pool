package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1094g4 extends AbstractC1067d4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f14589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14594h;

    private C1094g4(byte[] bArr, int i7, int i8, boolean z6) {
        super();
        this.f14594h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f14589c = bArr;
        this.f14590d = i8 + i7;
        this.f14592f = i7;
        this.f14593g = i7;
    }

    private final void f() {
        int i7 = this.f14590d + this.f14591e;
        this.f14590d = i7;
        int i8 = i7 - this.f14593g;
        int i9 = this.f14594h;
        if (i8 <= i9) {
            this.f14591e = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f14591e = i10;
        this.f14590d = i7 - i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067d4
    public final int d(int i7) throws I4 {
        if (i7 < 0) {
            throw I4.d();
        }
        int iE = i7 + e();
        if (iE < 0) {
            throw I4.e();
        }
        int i8 = this.f14594h;
        if (iE > i8) {
            throw I4.g();
        }
        this.f14594h = iE;
        f();
        return i8;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1067d4
    public final int e() {
        return this.f14592f - this.f14593g;
    }
}
