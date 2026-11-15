package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1002s0 extends AbstractC1008u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f14026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f14027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14029e;

    /* synthetic */ C1002s0(byte[] bArr, int i7, int i8, boolean z6, AbstractC0999r0 abstractC0999r0) {
        super(null);
        this.f14029e = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f14026b = bArr;
        this.f14027c = 0;
    }

    public final int c(int i7) {
        int i8 = this.f14029e;
        this.f14029e = 0;
        int i9 = this.f14027c + this.f14028d;
        this.f14027c = i9;
        if (i9 > 0) {
            this.f14028d = i9;
            this.f14027c = 0;
        } else {
            this.f14028d = 0;
        }
        return i8;
    }
}
