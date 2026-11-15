package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class V implements Serializable, U {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final U f13859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    volatile transient boolean f13860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    transient Object f13861o;

    V(U u6) {
        this.f13859m = u6;
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object a() {
        if (!this.f13860n) {
            synchronized (this) {
                try {
                    if (!this.f13860n) {
                        Object objA = this.f13859m.a();
                        this.f13861o = objA;
                        this.f13860n = true;
                        return objA;
                    }
                } finally {
                }
            }
        }
        return this.f13861o;
    }

    public final String toString() {
        Object obj;
        if (this.f13860n) {
            obj = "<supplier that returned " + String.valueOf(this.f13861o) + ">";
        } else {
            obj = this.f13859m;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }
}
