package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class M4 implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Iterator f14270m;

    public M4(Iterator it) {
        this.f14270m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14270m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f14270m.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14270m.remove();
    }
}
