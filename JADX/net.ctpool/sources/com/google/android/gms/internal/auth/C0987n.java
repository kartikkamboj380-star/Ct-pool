package com.google.android.gms.internal.auth;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0987n extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U f14004b;

    C0987n(Context context, U u6) {
        this.f14003a = context;
        this.f14004b = u6;
    }

    @Override // com.google.android.gms.internal.auth.K
    final Context a() {
        return this.f14003a;
    }

    @Override // com.google.android.gms.internal.auth.K
    final U b() {
        return this.f14004b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            K k7 = (K) obj;
            if (this.f14003a.equals(k7.a()) && this.f14004b.equals(k7.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14003a.hashCode() ^ 1000003) * 1000003) ^ this.f14004b.hashCode();
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f14003a.toString() + ", hermeticFileOverrides=" + this.f14004b.toString() + "}";
    }
}
