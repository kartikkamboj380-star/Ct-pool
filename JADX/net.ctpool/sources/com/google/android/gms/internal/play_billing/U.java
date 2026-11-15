package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
final class U extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f15112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15115e;

    /* synthetic */ U(byte[] bArr, int i7, int i8, boolean z6, T t6) {
        super(null);
        this.f15115e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f15112b = bArr;
        this.f15113c = 0;
    }

    public final int c(int i7) {
        int i8 = this.f15115e;
        this.f15115e = 0;
        int i9 = this.f15113c + this.f15114d;
        this.f15113c = i9;
        if (i9 > 0) {
            this.f15114d = i9;
            this.f15113c = 0;
        } else {
            this.f15114d = 0;
        }
        return i8;
    }
}
