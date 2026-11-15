package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class Q4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ C1520x4 f15749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F4 f15750n;

    Q4(F4 f42, C1520x4 c1520x4) {
        this.f15749m = c1520x4;
        this.f15750n = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2195f interfaceC2195f = this.f15750n.f15449d;
        if (interfaceC2195f == null) {
            this.f15750n.d().E().a("Failed to send current screen to service");
            return;
        }
        try {
            C1520x4 c1520x4 = this.f15749m;
            if (c1520x4 == null) {
                interfaceC2195f.B(0L, null, null, this.f15750n.a().getPackageName());
            } else {
                interfaceC2195f.B(c1520x4.f16348c, c1520x4.f16346a, c1520x4.f16347b, this.f15750n.a().getPackageName());
            }
            this.f15750n.k0();
        } catch (RemoteException e7) {
            this.f15750n.d().E().b("Failed to send current screen to the service", e7);
        }
    }
}
