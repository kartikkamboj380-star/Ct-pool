package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class L implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ zact f13577m;

    L(zact zactVar) {
        this.f13577m = zactVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13577m.zah.zae(new ConnectionResult(4));
    }
}
