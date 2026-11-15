package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class C5 extends AbstractC1487t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ D5 f15395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5(D5 d52, InterfaceC1526y3 interfaceC1526y3) {
        super(interfaceC1526y3);
        this.f15395e = d52;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1487t
    public final void d() throws Throwable {
        this.f15395e.x();
        this.f15395e.d().I().a("Starting upload from DelayedRunnable");
        this.f15395e.f15455b.C0();
    }
}
