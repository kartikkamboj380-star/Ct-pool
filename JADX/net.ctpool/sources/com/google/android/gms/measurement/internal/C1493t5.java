package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1493t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RunnableC1486s5 f16286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1466p5 f16287b;

    C1493t5(C1466p5 c1466p5) {
        this.f16287b = c1466p5;
    }

    final void a() {
        this.f16287b.l();
        if (this.f16286a != null) {
            this.f16287b.f16238c.removeCallbacks(this.f16286a);
        }
        this.f16287b.g().f16388u.a(false);
        this.f16287b.B(false);
        if (this.f16287b.b().r(G.f15481M0) && this.f16287b.p().H0()) {
            this.f16287b.d().I().a("Retrying trigger URI registration in foreground");
            this.f16287b.p().F0();
        }
    }

    final void b(long j7) {
        this.f16286a = new RunnableC1486s5(this, this.f16287b.zzb().currentTimeMillis(), j7);
        this.f16287b.f16238c.postDelayed(this.f16286a, 2000L);
    }
}
