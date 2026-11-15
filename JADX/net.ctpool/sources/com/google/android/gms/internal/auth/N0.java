package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class N0 extends P0 {
    /* synthetic */ N0(M0 m02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void a(Object obj, long j7) {
        ((E0) B1.f(obj, j7)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void b(Object obj, Object obj2, long j7) {
        E0 e0G = (E0) B1.f(obj, j7);
        E0 e02 = (E0) B1.f(obj2, j7);
        int size = e0G.size();
        int size2 = e02.size();
        if (size > 0 && size2 > 0) {
            if (!e0G.zzc()) {
                e0G = e0G.g(size2 + size);
            }
            e0G.addAll(e02);
        }
        if (size > 0) {
            e02 = e0G;
        }
        B1.p(obj, j7, e02);
    }
}
