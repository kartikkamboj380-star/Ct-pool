package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class T4 extends AbstractC1487t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ F4 f15807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    T4(F4 f42, InterfaceC1526y3 interfaceC1526y3) {
        super(interfaceC1526y3);
        this.f15807e = f42;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1487t
    public final void d() {
        this.f15807e.d().J().a("Tasks have been queued for a long time");
    }
}
