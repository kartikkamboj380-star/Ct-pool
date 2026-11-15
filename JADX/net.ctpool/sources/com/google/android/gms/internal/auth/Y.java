package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class Y implements Serializable, U {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Object f13871m;

    Y(Object obj) {
        this.f13871m = obj;
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object a() {
        return this.f13871m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Object obj2 = this.f13871m;
        Object obj3 = ((Y) obj).f13871m;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13871m});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f13871m.toString() + ")";
    }
}
