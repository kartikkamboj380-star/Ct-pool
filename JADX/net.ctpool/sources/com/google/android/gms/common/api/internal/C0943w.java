package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0943w extends zabw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f13654a;

    C0943w(zabe zabeVar) {
        this.f13654a = new WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zabe zabeVar = (zabe) this.f13654a.get();
        if (zabeVar == null) {
            return;
        }
        zabe.zai(zabeVar);
    }
}
