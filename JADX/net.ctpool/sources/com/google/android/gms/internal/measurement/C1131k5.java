package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1131k5 implements InterfaceC1229v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1095g5 f14665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L5 f14666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1166o4 f14668d;

    private C1131k5(L5 l52, AbstractC1166o4 abstractC1166o4, InterfaceC1095g5 interfaceC1095g5) {
        this.f14666b = l52;
        this.f14667c = abstractC1166o4.d(interfaceC1095g5);
        this.f14668d = abstractC1166o4;
        this.f14665a = interfaceC1095g5;
    }

    static C1131k5 j(L5 l52, AbstractC1166o4 abstractC1166o4, InterfaceC1095g5 interfaceC1095g5) {
        return new C1131k5(l52, abstractC1166o4, interfaceC1095g5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final Object a() {
        InterfaceC1095g5 interfaceC1095g5 = this.f14665a;
        return interfaceC1095g5 instanceof AbstractC1260z4 ? ((AbstractC1260z4) interfaceC1095g5).x() : interfaceC1095g5.c().n();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final void b(Object obj, InterfaceC1069d6 interfaceC1069d6) {
        Iterator itL = this.f14668d.b(obj).l();
        if (itL.hasNext()) {
            androidx.appcompat.app.y.a(((Map.Entry) itL.next()).getKey());
            throw null;
        }
        L5 l52 = this.f14666b;
        l52.d(l52.k(obj), interfaceC1069d6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final int c(Object obj) {
        L5 l52 = this.f14666b;
        int iE = l52.e(l52.k(obj));
        return this.f14667c ? iE + this.f14668d.b(obj).a() : iE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final boolean d(Object obj) {
        return this.f14668d.b(obj).n();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final int e(Object obj) {
        int iHashCode = this.f14666b.k(obj).hashCode();
        return this.f14667c ? (iHashCode * 53) + this.f14668d.b(obj).hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final void f(Object obj, byte[] bArr, int i7, int i8, Q3 q32) {
        AbstractC1260z4 abstractC1260z4 = (AbstractC1260z4) obj;
        if (abstractC1260z4.zzb == K5.k()) {
            abstractC1260z4.zzb = K5.l();
        }
        androidx.appcompat.app.y.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final void g(Object obj) {
        this.f14666b.l(obj);
        this.f14668d.f(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final void h(Object obj, Object obj2) {
        AbstractC1245x5.n(this.f14666b, obj, obj2);
        if (this.f14667c) {
            AbstractC1245x5.l(this.f14668d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final boolean i(Object obj, Object obj2) {
        if (!this.f14666b.k(obj).equals(this.f14666b.k(obj2))) {
            return false;
        }
        if (this.f14667c) {
            return this.f14668d.b(obj).equals(this.f14668d.b(obj2));
        }
        return true;
    }
}
