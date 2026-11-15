package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class K4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f15658m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ M5 f15659n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Bundle f15660o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ F4 f15661p;

    K4(F4 f42, AtomicReference atomicReference, M5 m52, Bundle bundle) {
        this.f15658m = atomicReference;
        this.f15659n = m52;
        this.f15660o = bundle;
        this.f15661p = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC2195f interfaceC2195f;
        synchronized (this.f15658m) {
            try {
                try {
                    interfaceC2195f = this.f15661p.f15449d;
                } catch (RemoteException e7) {
                    this.f15661p.d().E().b("Failed to get trigger URIs; remote exception", e7);
                    atomicReference = this.f15658m;
                }
                if (interfaceC2195f == null) {
                    this.f15661p.d().E().a("Failed to get trigger URIs; not connected to service");
                    return;
                }
                Preconditions.checkNotNull(this.f15659n);
                this.f15658m.set(interfaceC2195f.T(this.f15659n, this.f15660o));
                this.f15661p.k0();
                atomicReference = this.f15658m;
                atomicReference.notify();
            } finally {
                this.f15658m.notify();
            }
        }
    }
}
