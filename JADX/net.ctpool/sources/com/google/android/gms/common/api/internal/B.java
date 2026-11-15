package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class B implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f13552m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ zabq f13553n;

    B(zabq zabqVar, int i7) {
        this.f13553n = zabqVar;
        this.f13552m = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13553n.zaI(this.f13552m);
    }
}
