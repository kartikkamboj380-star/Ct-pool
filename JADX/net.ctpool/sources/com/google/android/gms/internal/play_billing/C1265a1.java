package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1265a1 implements InterfaceC1293h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f15158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1348x1 f15159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f15160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1288g0 f15161d;

    private C1265a1(AbstractC1348x1 abstractC1348x1, AbstractC1288g0 abstractC1288g0, W0 w02) {
        this.f15159b = abstractC1348x1;
        this.f15160c = abstractC1288g0.f(w02);
        this.f15161d = abstractC1288g0;
        this.f15158a = w02;
    }

    static C1265a1 j(AbstractC1348x1 abstractC1348x1, AbstractC1288g0 abstractC1288g0, W0 w02) {
        return new C1265a1(abstractC1348x1, abstractC1288g0, w02);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final void a(Object obj, P1 p12) {
        Iterator itD = this.f15161d.b(obj).d();
        if (itD.hasNext()) {
            androidx.appcompat.app.y.a(((Map.Entry) itD.next()).getKey());
            throw null;
        }
        AbstractC1348x1 abstractC1348x1 = this.f15159b;
        abstractC1348x1.i(abstractC1348x1.d(obj), p12);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final Object b() {
        W0 w02 = this.f15158a;
        return w02 instanceof AbstractC1329r0 ? ((AbstractC1329r0) w02).l() : w02.a().zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final int c(Object obj) {
        AbstractC1348x1 abstractC1348x1 = this.f15159b;
        int iB = abstractC1348x1.b(abstractC1348x1.d(obj));
        return this.f15160c ? iB + this.f15161d.b(obj).c() : iB;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final void d(Object obj, byte[] bArr, int i7, int i8, D d7) {
        AbstractC1329r0 abstractC1329r0 = (AbstractC1329r0) obj;
        if (abstractC1329r0.zzc == C1351y1.c()) {
            abstractC1329r0.zzc = C1351y1.f();
        }
        androidx.appcompat.app.y.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final int e(Object obj) {
        int iHashCode = this.f15159b.d(obj).hashCode();
        return this.f15160c ? (iHashCode * 53) + this.f15161d.b(obj).f15210a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final void f(Object obj) {
        this.f15159b.g(obj);
        this.f15161d.d(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final boolean g(Object obj) {
        return this.f15161d.b(obj).h();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final void h(Object obj, Object obj2) {
        AbstractC1301j1.x(this.f15159b, obj, obj2);
        if (this.f15160c) {
            AbstractC1301j1.w(this.f15161d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final boolean i(Object obj, Object obj2) {
        AbstractC1348x1 abstractC1348x1 = this.f15159b;
        if (!abstractC1348x1.d(obj).equals(abstractC1348x1.d(obj2))) {
            return false;
        }
        if (this.f15160c) {
            return this.f15161d.b(obj).equals(this.f15161d.b(obj2));
        }
        return true;
    }
}
