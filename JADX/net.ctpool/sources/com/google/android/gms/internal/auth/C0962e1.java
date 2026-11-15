package com.google.android.gms.internal.auth;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0962e1 implements InterfaceC0983l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z0 f13903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0998q1 f13904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC1014w0 f13905c;

    private C0962e1(AbstractC0998q1 abstractC0998q1, AbstractC1014w0 abstractC1014w0, Z0 z02) {
        this.f13904b = abstractC0998q1;
        this.f13905c = abstractC1014w0;
        this.f13903a = z02;
    }

    static C0962e1 a(AbstractC0998q1 abstractC0998q1, AbstractC1014w0 abstractC1014w0, Z0 z02) {
        return new C0962e1(abstractC0998q1, abstractC1014w0, z02);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final int c(Object obj) {
        return this.f13904b.a(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final void d(Object obj) {
        this.f13904b.c(obj);
        this.f13905c.b(obj);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final void e(Object obj, byte[] bArr, int i7, int i8, C0961e0 c0961e0) {
        C0 c02 = (C0) obj;
        if (c02.zzc == C1003s1.a()) {
            c02.zzc = C1003s1.d();
        }
        androidx.appcompat.app.y.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final void f(Object obj, Object obj2) {
        AbstractC0989n1.c(this.f13904b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final boolean g(Object obj) {
        this.f13905c.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final boolean h(Object obj, Object obj2) {
        return this.f13904b.a(obj).equals(this.f13904b.a(obj2));
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final Object zzd() {
        Z0 z02 = this.f13903a;
        boolean z6 = z02 instanceof C0;
        C0 c02 = (C0) z02;
        return z6 ? c02.d() : ((B0) c02.n(5, null, null)).zzd();
    }
}
