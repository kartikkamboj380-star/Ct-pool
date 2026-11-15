package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1231w implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14941m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1214u f14942n;

    C1231w(C1214u c1214u) {
        this.f14942n = c1214u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14941m < this.f14942n.f14920m.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f14941m >= this.f14942n.f14920m.length()) {
            throw new NoSuchElementException();
        }
        String str = this.f14942n.f14920m;
        int i7 = this.f14941m;
        this.f14941m = i7 + 1;
        return new C1214u(String.valueOf(str.charAt(i7)));
    }
}
