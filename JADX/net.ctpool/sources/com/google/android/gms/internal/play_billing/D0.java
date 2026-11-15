package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class D0 implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Iterator f15043m;

    public D0(Iterator it) {
        this.f15043m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15043m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f15043m.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15043m.remove();
    }
}
