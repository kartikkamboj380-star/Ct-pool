package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class X implements U {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final U f13867o = new U() { // from class: com.google.android.gms.internal.auth.W
        @Override // com.google.android.gms.internal.auth.U
        public final Object a() {
            throw new IllegalStateException();
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile U f13868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f13869n;

    X(U u6) {
        this.f13868m = u6;
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object a() {
        U u6 = this.f13868m;
        U u7 = f13867o;
        if (u6 != u7) {
            synchronized (this) {
                try {
                    if (this.f13868m != u7) {
                        Object objA = this.f13868m.a();
                        this.f13869n = objA;
                        this.f13868m = u7;
                        return objA;
                    }
                } finally {
                }
            }
        }
        return this.f13869n;
    }

    public final String toString() {
        Object obj = this.f13868m;
        if (obj == f13867o) {
            obj = "<supplier that returned " + String.valueOf(this.f13869n) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }
}
