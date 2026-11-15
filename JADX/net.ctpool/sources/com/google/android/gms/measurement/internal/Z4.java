package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class Z4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ boolean f15887m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ M5 f15888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ boolean f15889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ C1383e f15890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ C1383e f15891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ F4 f15892r;

    Z4(F4 f42, boolean z6, M5 m52, boolean z7, C1383e c1383e, C1383e c1383e2) {
        this.f15888n = m52;
        this.f15889o = z7;
        this.f15890p = c1383e;
        this.f15891q = c1383e2;
        this.f15892r = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2195f interfaceC2195f = this.f15892r.f15449d;
        if (interfaceC2195f == null) {
            this.f15892r.d().E().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f15887m) {
            Preconditions.checkNotNull(this.f15888n);
            this.f15892r.R(interfaceC2195f, this.f15889o ? null : this.f15890p, this.f15888n);
        } else {
            try {
                if (TextUtils.isEmpty(this.f15891q.f16005m)) {
                    Preconditions.checkNotNull(this.f15888n);
                    interfaceC2195f.y(this.f15890p, this.f15888n);
                } else {
                    interfaceC2195f.F(this.f15890p);
                }
            } catch (RemoteException e7) {
                this.f15892r.d().E().b("Failed to send conditional user property to the service", e7);
            }
        }
        this.f15892r.k0();
    }
}
