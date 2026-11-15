package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class O0 implements U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U0[] f15089a;

    O0(U0... u0Arr) {
        this.f15089a = u0Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.U0
    public final T0 b(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            U0 u02 = this.f15089a[i7];
            if (u02.c(cls)) {
                return u02.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.U0
    public final boolean c(Class cls) {
        for (int i7 = 0; i7 < 2; i7++) {
            if (this.f15089a[i7].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
