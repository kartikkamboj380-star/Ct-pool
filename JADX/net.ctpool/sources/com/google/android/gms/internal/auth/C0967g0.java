package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0967g0 extends AbstractC0973i0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f13908m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f13909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ AbstractC0997q0 f13910o;

    C0967g0(AbstractC0997q0 abstractC0997q0) {
        this.f13910o = abstractC0997q0;
        this.f13909n = abstractC0997q0.h();
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0982l0
    public final byte a() {
        int i7 = this.f13908m;
        if (i7 >= this.f13909n) {
            throw new NoSuchElementException();
        }
        this.f13908m = i7 + 1;
        return this.f13910o.f(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13908m < this.f13909n;
    }
}
