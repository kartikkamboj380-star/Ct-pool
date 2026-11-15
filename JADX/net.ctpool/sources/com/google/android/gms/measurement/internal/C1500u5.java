package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1500u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f16302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected long f16303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1487t f16304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1466p5 f16305d;

    public C1500u5(C1466p5 c1466p5) {
        this.f16305d = c1466p5;
        this.f16304c = new C1521x5(this, c1466p5.f16325a);
        long jElapsedRealtime = c1466p5.zzb().elapsedRealtime();
        this.f16302a = jElapsedRealtime;
        this.f16303b = jElapsedRealtime;
    }

    static /* synthetic */ void c(C1500u5 c1500u5) {
        c1500u5.f16305d.l();
        c1500u5.d(false, false, c1500u5.f16305d.zzb().elapsedRealtime());
        c1500u5.f16305d.m().t(c1500u5.f16305d.zzb().elapsedRealtime());
    }

    final long a(long j7) {
        long j8 = j7 - this.f16303b;
        this.f16303b = j7;
        return j8;
    }

    final void b() {
        this.f16304c.a();
        this.f16302a = this.f16305d.b().r(G.f15516c1) ? this.f16305d.zzb().elapsedRealtime() : 0L;
        this.f16303b = this.f16302a;
    }

    public final boolean d(boolean z6, boolean z7, long j7) {
        this.f16305d.l();
        this.f16305d.t();
        if (this.f16305d.f16325a.n()) {
            this.f16305d.g().f16385r.b(this.f16305d.zzb().currentTimeMillis());
        }
        long jA = j7 - this.f16302a;
        if (!z6 && jA < 1000) {
            this.f16305d.d().I().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jA));
            return false;
        }
        if (!z7) {
            jA = a(j7);
        }
        this.f16305d.d().I().b("Recording user engagement, ms", Long.valueOf(jA));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jA);
        d6.V(this.f16305d.q().A(!this.f16305d.b().T()), bundle, true);
        if (!z7) {
            this.f16305d.p().Z0("auto", "_e", bundle);
        }
        this.f16302a = j7;
        this.f16304c.a();
        this.f16304c.b(((Long) G.f15518d0.a(null)).longValue());
        return true;
    }

    final void e(long j7) {
        this.f16304c.a();
    }

    final void f(long j7) {
        this.f16305d.l();
        this.f16304c.a();
        this.f16302a = j7;
        this.f16303b = j7;
    }
}
