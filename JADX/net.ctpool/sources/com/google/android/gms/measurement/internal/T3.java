package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
final class T3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ boolean f15805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ F3 f15806n;

    T3(F3 f32, boolean z6) {
        this.f15805m = z6;
        this.f15806n = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zN = this.f15806n.f16325a.n();
        boolean zM = this.f15806n.f16325a.m();
        this.f15806n.f16325a.k(this.f15805m);
        if (zM == this.f15805m) {
            this.f15806n.f16325a.d().I().b("Default data collection state already set to", Boolean.valueOf(this.f15805m));
        }
        if (this.f15806n.f16325a.n() == zN || this.f15806n.f16325a.n() != this.f15806n.f16325a.m()) {
            this.f15806n.f16325a.d().K().c("Default data collection is different than actual status", Boolean.valueOf(this.f15805m), Boolean.valueOf(zN));
        }
        this.f15806n.I0();
    }
}
