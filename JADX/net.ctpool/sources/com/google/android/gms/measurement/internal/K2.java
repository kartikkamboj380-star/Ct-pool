package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class K2 extends n.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final /* synthetic */ I2 f15654i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K2(I2 i22, int i7) {
        super(20);
        this.f15654i = i22;
    }

    @Override // n.e
    protected final /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return I2.x(this.f15654i, str);
    }
}
