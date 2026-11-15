package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes.dex */
abstract class E5 extends F5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15424c;

    E5(H5 h52) {
        super(h52);
        this.f15455b.A0();
    }

    protected final void s() {
        if (!u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (this.f15424c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        v();
        this.f15455b.z0();
        this.f15424c = true;
    }

    final boolean u() {
        return this.f15424c;
    }

    protected abstract boolean v();
}
