package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1525y2 extends AbstractC1357a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16356b;

    AbstractC1525y2(S2 s22) {
        super(s22);
        this.f16325a.l();
    }

    protected final void t() {
        if (!x()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void u() {
        if (this.f16356b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (y()) {
            return;
        }
        this.f16325a.P();
        this.f16356b = true;
    }

    public final void v() {
        if (this.f16356b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        w();
        this.f16325a.P();
        this.f16356b = true;
    }

    protected void w() {
    }

    final boolean x() {
        return this.f16356b;
    }

    protected abstract boolean y();
}
