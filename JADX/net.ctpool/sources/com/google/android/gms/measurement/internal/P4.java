package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class P4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ M5 f15738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f15739n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ F4 f15740o;

    P4(F4 f42, M5 m52, com.google.android.gms.internal.measurement.U0 u02) {
        this.f15738m = m52;
        this.f15739n = u02;
        this.f15740o = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strW = null;
        try {
            try {
                if (this.f15740o.g().K().z()) {
                    InterfaceC2195f interfaceC2195f = this.f15740o.f15449d;
                    if (interfaceC2195f == null) {
                        this.f15740o.d().E().a("Failed to get app instance id");
                    } else {
                        Preconditions.checkNotNull(this.f15738m);
                        strW = interfaceC2195f.w(this.f15738m);
                        if (strW != null) {
                            this.f15740o.p().Y0(strW);
                            this.f15740o.g().f16376i.b(strW);
                        }
                        this.f15740o.k0();
                    }
                } else {
                    this.f15740o.d().K().a("Analytics storage consent denied; will not get app instance id");
                    this.f15740o.p().Y0(null);
                    this.f15740o.g().f16376i.b(null);
                }
            } catch (RemoteException e7) {
                this.f15740o.d().E().b("Failed to get app instance id", e7);
            }
        } finally {
            this.f15740o.h().Q(this.f15739n, null);
        }
    }
}
