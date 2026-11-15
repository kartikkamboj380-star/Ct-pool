package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1012v1 implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Iterator f14043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ C1015w1 f14044n;

    C1012v1(C1015w1 c1015w1) {
        this.f14044n = c1015w1;
        this.f14043m = c1015w1.f14045m.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14043m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f14043m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
