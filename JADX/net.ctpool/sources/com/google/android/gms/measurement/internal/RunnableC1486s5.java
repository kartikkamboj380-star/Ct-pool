package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1486s5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f16271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f16272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ C1493t5 f16273o;

    RunnableC1486s5(C1493t5 c1493t5, long j7, long j8) {
        this.f16273o = c1493t5;
        this.f16271m = j7;
        this.f16272n = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16273o.f16287b.f().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.v5
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC1486s5 runnableC1486s5 = this.f16319m;
                C1493t5 c1493t5 = runnableC1486s5.f16273o;
                long j7 = runnableC1486s5.f16271m;
                long j8 = runnableC1486s5.f16272n;
                c1493t5.f16287b.l();
                c1493t5.f16287b.d().D().a("Application going to the background");
                c1493t5.f16287b.g().f16388u.a(true);
                c1493t5.f16287b.B(true);
                if (!c1493t5.f16287b.b().T()) {
                    if (c1493t5.f16287b.b().r(G.f15489Q0)) {
                        c1493t5.f16287b.C(false, false, j8);
                        c1493t5.f16287b.f16241f.e(j8);
                    } else {
                        c1493t5.f16287b.f16241f.e(j8);
                        c1493t5.f16287b.C(false, false, j8);
                    }
                }
                c1493t5.f16287b.d().H().b("Application backgrounded at: timestamp_millis", Long.valueOf(j7));
                if (c1493t5.f16287b.b().r(G.f15522e1)) {
                    c1493t5.f16287b.p().z0();
                }
            }
        });
    }
}
