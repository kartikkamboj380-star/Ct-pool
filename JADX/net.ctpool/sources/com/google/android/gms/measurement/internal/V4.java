package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class V4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ E f15822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f15823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f15824o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ F4 f15825p;

    V4(F4 f42, E e7, String str, com.google.android.gms.internal.measurement.U0 u02) {
        this.f15822m = e7;
        this.f15823n = str;
        this.f15824o = u02;
        this.f15825p = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrU = null;
        try {
            try {
                InterfaceC2195f interfaceC2195f = this.f15825p.f15449d;
                if (interfaceC2195f == null) {
                    this.f15825p.d().E().a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArrU = interfaceC2195f.U(this.f15822m, this.f15823n);
                    this.f15825p.k0();
                }
            } catch (RemoteException e7) {
                this.f15825p.d().E().b("Failed to send event to the service to bundle", e7);
            }
        } finally {
            this.f15825p.h().T(this.f15824o, bArrU);
        }
    }
}
