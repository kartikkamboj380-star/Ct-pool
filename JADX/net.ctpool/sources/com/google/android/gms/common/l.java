package com.google.android.gms.common;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class l extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f13718b;

    l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f13718b = bArr;
    }

    @Override // com.google.android.gms.common.k
    final byte[] j0() {
        return this.f13718b;
    }
}
