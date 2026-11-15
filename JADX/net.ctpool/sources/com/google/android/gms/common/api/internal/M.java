package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class M implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.signin.internal.l f13578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ zact f13579n;

    M(zact zactVar, com.google.android.gms.signin.internal.l lVar) {
        this.f13579n = zactVar;
        this.f13578m = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.zad(this.f13579n, this.f13578m);
    }
}
