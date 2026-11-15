package com.google.android.gms.internal.measurement;

import V3.AbstractC0489q;

/* JADX INFO: loaded from: classes.dex */
public final class F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f14194a;

    public F3(E3 e32) {
        U3.h.j(e32, "BuildInfo must be non-null");
        this.f14194a = !e32.a();
    }

    public final boolean a(String str) {
        U3.h.j(str, "flagName must not be null");
        if (this.f14194a) {
            return ((AbstractC0489q) I3.f14222a.get()).a(str);
        }
        return true;
    }
}
