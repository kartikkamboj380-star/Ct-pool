package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class N5 extends L5 {
    N5() {
    }

    private static void m(Object obj, K5 k52) {
        ((AbstractC1260z4) obj).zzb = k52;
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ int a(Object obj) {
        return ((K5) obj).a();
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ Object b(Object obj, Object obj2) {
        K5 k52 = (K5) obj;
        K5 k53 = (K5) obj2;
        return K5.k().equals(k53) ? k52 : K5.k().equals(k52) ? K5.c(k52, k53) : k52.b(k53);
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ void c(Object obj, int i7, R3 r32) {
        ((K5) obj).e((i7 << 3) | 2, r32);
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ void d(Object obj, InterfaceC1069d6 interfaceC1069d6) {
        ((K5) obj).g(interfaceC1069d6);
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ int e(Object obj) {
        return ((K5) obj).i();
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ void f(Object obj, int i7, long j7) {
        ((K5) obj).e(i7 << 3, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ void g(Object obj, InterfaceC1069d6 interfaceC1069d6) {
        ((K5) obj).j(interfaceC1069d6);
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (K5) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ Object i(Object obj) {
        K5 k52 = ((AbstractC1260z4) obj).zzb;
        if (k52 != K5.k()) {
            return k52;
        }
        K5 k5L = K5.l();
        m(obj, k5L);
        return k5L;
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ void j(Object obj, Object obj2) {
        m(obj, (K5) obj2);
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final /* synthetic */ Object k(Object obj) {
        return ((AbstractC1260z4) obj).zzb;
    }

    @Override // com.google.android.gms.internal.measurement.L5
    final void l(Object obj) {
        ((AbstractC1260z4) obj).zzb.m();
    }
}
