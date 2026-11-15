package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class L4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f15666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ M5 f15667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ F4 f15668o;

    L4(F4 f42, AtomicReference atomicReference, M5 m52) {
        this.f15666m = atomicReference;
        this.f15667n = m52;
        this.f15668o = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f15666m) {
            try {
                try {
                } catch (RemoteException e7) {
                    this.f15668o.d().E().b("Failed to get app instance id", e7);
                    atomicReference = this.f15666m;
                }
                if (!this.f15668o.g().K().z()) {
                    this.f15668o.d().K().a("Analytics storage consent denied; will not get app instance id");
                    this.f15668o.p().Y0(null);
                    this.f15668o.g().f16376i.b(null);
                    this.f15666m.set(null);
                    return;
                }
                InterfaceC2195f interfaceC2195f = this.f15668o.f15449d;
                if (interfaceC2195f == null) {
                    this.f15668o.d().E().a("Failed to get app instance id");
                    return;
                }
                Preconditions.checkNotNull(this.f15667n);
                this.f15666m.set(interfaceC2195f.w(this.f15667n));
                String str = (String) this.f15666m.get();
                if (str != null) {
                    this.f15668o.p().Y0(str);
                    this.f15668o.g().f16376i.b(str);
                }
                this.f15668o.k0();
                atomicReference = this.f15666m;
                atomicReference.notify();
            } finally {
                this.f15666m.notify();
            }
        }
    }
}
