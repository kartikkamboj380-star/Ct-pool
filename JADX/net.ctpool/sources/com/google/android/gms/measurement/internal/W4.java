package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class W4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ boolean f15837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ M5 f15838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ boolean f15839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ E f15840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ String f15841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ F4 f15842r;

    W4(F4 f42, boolean z6, M5 m52, boolean z7, E e7, String str) {
        this.f15837m = z6;
        this.f15838n = m52;
        this.f15839o = z7;
        this.f15840p = e7;
        this.f15841q = str;
        this.f15842r = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jElapsedRealtime;
        long j7;
        long jCurrentTimeMillis;
        InterfaceC2195f interfaceC2195f = this.f15842r.f15449d;
        if (interfaceC2195f == null) {
            this.f15842r.d().E().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f15837m) {
            Preconditions.checkNotNull(this.f15838n);
            this.f15842r.R(interfaceC2195f, this.f15839o ? null : this.f15840p, this.f15838n);
        } else {
            boolean zR = this.f15842r.b().r(G.f15467F0);
            try {
                if (TextUtils.isEmpty(this.f15841q)) {
                    Preconditions.checkNotNull(this.f15838n);
                    if (zR) {
                        jCurrentTimeMillis = this.f15842r.f16325a.zzb().currentTimeMillis();
                        try {
                            jElapsedRealtime = this.f15842r.f16325a.zzb().elapsedRealtime();
                        } catch (RemoteException e7) {
                            e = e7;
                            jElapsedRealtime = 0;
                            j7 = jCurrentTimeMillis;
                            this.f15842r.d().E().b("Failed to send event to the service", e);
                            if (zR) {
                                C1435l2.a(this.f15842r.f16325a).b(36301, 13, j7, this.f15842r.f16325a.zzb().currentTimeMillis(), (int) (this.f15842r.f16325a.zzb().elapsedRealtime() - jElapsedRealtime));
                            }
                            this.f15842r.k0();
                        }
                    } else {
                        jCurrentTimeMillis = 0;
                        jElapsedRealtime = 0;
                    }
                    try {
                        interfaceC2195f.g0(this.f15840p, this.f15838n);
                        if (zR) {
                            this.f15842r.d().I().a("Logging telemetry for logEvent");
                            C1435l2.a(this.f15842r.f16325a).b(36301, 0, jCurrentTimeMillis, this.f15842r.f16325a.zzb().currentTimeMillis(), (int) (this.f15842r.f16325a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (RemoteException e8) {
                        e = e8;
                        j7 = jCurrentTimeMillis;
                        this.f15842r.d().E().b("Failed to send event to the service", e);
                        if (zR && j7 != 0) {
                            C1435l2.a(this.f15842r.f16325a).b(36301, 13, j7, this.f15842r.f16325a.zzb().currentTimeMillis(), (int) (this.f15842r.f16325a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } else {
                    interfaceC2195f.J(this.f15840p, this.f15841q, this.f15842r.d().M());
                }
            } catch (RemoteException e9) {
                e = e9;
                jElapsedRealtime = 0;
                j7 = 0;
            }
        }
        this.f15842r.k0();
    }
}
