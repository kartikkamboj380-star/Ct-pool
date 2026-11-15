package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 extends AbstractC0949a0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0 f13781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected C0 f13782n;

    protected B0(C0 c02) {
        this.f13781m = c02;
        if (c02.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f13782n = c02.d();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B0 clone() {
        B0 b02 = (B0) this.f13781m.n(5, null, null);
        b02.f13782n = zzd();
        return b02;
    }

    @Override // com.google.android.gms.internal.auth.Y0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0 zzd() {
        if (!this.f13782n.m()) {
            return this.f13782n;
        }
        this.f13782n.i();
        return this.f13782n;
    }
}
