package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1161o implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ Iterator f14757m;

    C1161o(Iterator it) {
        this.f14757m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14757m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new C1214u((String) this.f14757m.next());
    }
}
