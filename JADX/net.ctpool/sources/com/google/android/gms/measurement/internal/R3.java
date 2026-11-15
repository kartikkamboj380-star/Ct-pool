package com.google.android.gms.measurement.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
final class R3 implements X3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ B5 f15754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f15755b;

    R3(F3 f32, B5 b52) {
        this.f15754a = b52;
        this.f15755b = f32;
    }

    private final void c() {
        SparseArray sparseArrayI = this.f15755b.g().I();
        B5 b52 = this.f15754a;
        sparseArrayI.put(b52.f15386o, Long.valueOf(b52.f15385n));
        this.f15755b.g().t(sparseArrayI);
    }

    @Override // X3.a
    public final void a(Throwable th) {
        this.f15755b.l();
        this.f15755b.f15434i = false;
        if (!this.f15755b.b().r(G.f15485O0)) {
            this.f15755b.F0();
            this.f15755b.d().E().b("registerTriggerAsync failed with throwable", th);
            return;
        }
        int iA = (this.f15755b.b().r(G.f15481M0) ? F3.A(this.f15755b, th) : 2) - 1;
        if (iA == 0) {
            this.f15755b.d().J().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C1449n2.t(this.f15755b.n().D()), C1449n2.t(th.toString()));
            this.f15755b.f15435j = 1;
            this.f15755b.y0().add(this.f15754a);
            return;
        }
        if (iA != 1) {
            if (iA != 2) {
                return;
            }
            this.f15755b.d().E().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C1449n2.t(this.f15755b.n().D()), th);
            c();
            this.f15755b.f15435j = 1;
            this.f15755b.F0();
            return;
        }
        this.f15755b.y0().add(this.f15754a);
        if (this.f15755b.f15435j > 32) {
            this.f15755b.f15435j = 1;
            this.f15755b.d().J().c("registerTriggerAsync failed. May try later. App ID, throwable", C1449n2.t(this.f15755b.n().D()), C1449n2.t(th.toString()));
            return;
        }
        this.f15755b.d().J().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C1449n2.t(this.f15755b.n().D()), C1449n2.t(String.valueOf(this.f15755b.f15435j)), C1449n2.t(th.toString()));
        F3 f32 = this.f15755b;
        F3.N0(f32, f32.f15435j);
        this.f15755b.f15435j <<= 1;
    }

    @Override // X3.a
    public final void b(Object obj) {
        this.f15755b.l();
        if (!this.f15755b.b().r(G.f15485O0)) {
            this.f15755b.f15434i = false;
            this.f15755b.F0();
            this.f15755b.d().D().b("registerTriggerAsync ran. uri", this.f15754a.f15384m);
        } else {
            c();
            this.f15755b.f15434i = false;
            this.f15755b.f15435j = 1;
            this.f15755b.d().D().b("Successfully registered trigger URI", this.f15754a.f15384m);
            this.f15755b.F0();
        }
    }
}
