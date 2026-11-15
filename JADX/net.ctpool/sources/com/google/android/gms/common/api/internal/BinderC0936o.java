package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class BinderC0936o extends com.google.android.gms.signin.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f13641a;

    BinderC0936o(zaaw zaawVar) {
        this.f13641a = new WeakReference(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.f
    public final void zab(com.google.android.gms.signin.internal.l lVar) {
        zaaw zaawVar = (zaaw) this.f13641a.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.zaa.zal(new C0935n(this, zaawVar, zaawVar, lVar));
    }
}
