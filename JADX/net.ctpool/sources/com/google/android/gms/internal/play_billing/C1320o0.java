package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1320o0 implements U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1320o0 f15278a = new C1320o0();

    private C1320o0() {
    }

    public static C1320o0 a() {
        return f15278a;
    }

    @Override // com.google.android.gms.internal.play_billing.U0
    public final T0 b(Class cls) {
        if (!AbstractC1329r0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (T0) AbstractC1329r0.j(cls.asSubclass(AbstractC1329r0.class)).x(3, null, null);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.U0
    public final boolean c(Class cls) {
        return AbstractC1329r0.class.isAssignableFrom(cls);
    }
}
