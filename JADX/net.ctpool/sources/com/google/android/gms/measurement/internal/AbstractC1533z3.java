package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1533z3 extends AbstractC1512w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16394b;

    AbstractC1533z3(S2 s22) {
        super(s22);
        this.f16325a.l();
    }

    protected void m() {
    }

    protected final void n() {
        if (!q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void o() {
        if (this.f16394b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (r()) {
            return;
        }
        this.f16325a.P();
        this.f16394b = true;
    }

    public final void p() {
        if (this.f16394b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        m();
        this.f16325a.P();
        this.f16394b = true;
    }

    final boolean q() {
        return this.f16394b;
    }

    protected abstract boolean r();
}
