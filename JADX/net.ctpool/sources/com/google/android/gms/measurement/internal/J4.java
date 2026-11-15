package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class J4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f15648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ boolean f15649n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Y5 f15650o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ F4 f15651p;

    J4(F4 f42, M5 m52, boolean z6, Y5 y52) {
        this.f15648m = m52;
        this.f15649n = z6;
        this.f15650o = y52;
        this.f15651p = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2195f interfaceC2195f = this.f15651p.f15449d;
        if (interfaceC2195f == null) {
            this.f15651p.d().E().a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.f15648m);
        this.f15651p.R(interfaceC2195f, this.f15649n ? null : this.f15650o, this.f15648m);
        this.f15651p.k0();
    }
}
