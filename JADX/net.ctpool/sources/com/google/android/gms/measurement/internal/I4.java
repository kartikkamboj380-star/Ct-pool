package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class I4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ String f15635m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f15636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f15637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ boolean f15638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f15639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ F4 f15640r;

    I4(F4 f42, String str, String str2, M5 m52, boolean z6, com.google.android.gms.internal.measurement.U0 u02) {
        this.f15635m = str;
        this.f15636n = str2;
        this.f15637o = m52;
        this.f15638p = z6;
        this.f15639q = u02;
        this.f15640r = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            try {
                InterfaceC2195f interfaceC2195f = this.f15640r.f15449d;
                if (interfaceC2195f == null) {
                    this.f15640r.d().E().c("Failed to get user properties; not connected to service", this.f15635m, this.f15636n);
                } else {
                    Preconditions.checkNotNull(this.f15637o);
                    bundle = d6.E(interfaceC2195f.R(this.f15635m, this.f15636n, this.f15638p, this.f15637o));
                    this.f15640r.k0();
                }
            } catch (RemoteException e7) {
                this.f15640r.d().E().c("Failed to get user properties; remote exception", this.f15635m, e7);
            }
        } finally {
            this.f15640r.h().P(this.f15639q, bundle);
        }
    }
}
