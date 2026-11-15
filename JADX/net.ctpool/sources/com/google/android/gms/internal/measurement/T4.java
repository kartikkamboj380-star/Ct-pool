package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class T4 implements InterfaceC1220u5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC1059c5 f14346b = new S4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1059c5 f14347a;

    public T4() {
        this(new U4(A4.c(), f14346b));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1220u5
    public final InterfaceC1229v5 a(Class cls) {
        AbstractC1245x5.o(cls);
        InterfaceC1077e5 interfaceC1077e5A = this.f14347a.a(cls);
        if (interfaceC1077e5A.zzc()) {
            return C1131k5.j(AbstractC1245x5.f(), AbstractC1175p4.a(), interfaceC1077e5A.a());
        }
        return C1122j5.n(cls, interfaceC1077e5A, AbstractC1167o5.a(), R4.a(), AbstractC1245x5.f(), V4.f14400a[interfaceC1077e5A.zzb().ordinal()] != 1 ? AbstractC1175p4.a() : null, AbstractC1041a5.a());
    }

    private T4(InterfaceC1059c5 interfaceC1059c5) {
        this.f14347a = (InterfaceC1059c5) B4.f(interfaceC1059c5, "messageInfoFactory");
    }
}
