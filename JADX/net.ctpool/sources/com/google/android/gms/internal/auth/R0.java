package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class R0 implements X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X0[] f13849a;

    R0(X0... x0Arr) {
        this.f13849a = x0Arr;
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final W0 b(Class cls) {
        X0[] x0Arr = this.f13849a;
        for (int i7 = 0; i7 < 2; i7++) {
            X0 x02 = x0Arr[i7];
            if (x02.c(cls)) {
                return x02.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.X0
    public final boolean c(Class cls) {
        X0[] x0Arr = this.f13849a;
        for (int i7 = 0; i7 < 2; i7++) {
            if (x0Arr[i7].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
