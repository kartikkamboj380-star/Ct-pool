package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class C implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ D f13554m;

    C(D d7) {
        this.f13554m = d7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabq zabqVar = this.f13554m.f13555a;
        zabqVar.zac.disconnect(zabqVar.zac.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
