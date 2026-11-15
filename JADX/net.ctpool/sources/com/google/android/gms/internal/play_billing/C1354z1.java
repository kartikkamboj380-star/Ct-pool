package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1354z1 extends AbstractC1348x1 {
    C1354z1() {
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final /* synthetic */ int a(Object obj) {
        return ((C1351y1) obj).a();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final /* synthetic */ int b(Object obj) {
        return ((C1351y1) obj).b();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final /* bridge */ /* synthetic */ Object c(Object obj) {
        AbstractC1329r0 abstractC1329r0 = (AbstractC1329r0) obj;
        C1351y1 c1351y1 = abstractC1329r0.zzc;
        if (c1351y1 != C1351y1.c()) {
            return c1351y1;
        }
        C1351y1 c1351y1F = C1351y1.f();
        abstractC1329r0.zzc = c1351y1F;
        return c1351y1F;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final /* synthetic */ Object d(Object obj) {
        return ((AbstractC1329r0) obj).zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (C1351y1.c().equals(obj2)) {
            return obj;
        }
        C1351y1 c1351y1 = (C1351y1) obj2;
        if (C1351y1.c().equals(obj)) {
            return C1351y1.e((C1351y1) obj, c1351y1);
        }
        ((C1351y1) obj).d(c1351y1);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final /* bridge */ /* synthetic */ void f(Object obj, int i7, long j7) {
        ((C1351y1) obj).j(i7 << 3, Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final void g(Object obj) {
        ((AbstractC1329r0) obj).zzc.h();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final /* synthetic */ void h(Object obj, Object obj2) {
        ((AbstractC1329r0) obj).zzc = (C1351y1) obj2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final /* synthetic */ void i(Object obj, P1 p12) {
        ((C1351y1) obj).k(p12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1348x1
    final /* synthetic */ void j(Object obj, P1 p12) {
        ((C1351y1) obj).l(p12);
    }
}
