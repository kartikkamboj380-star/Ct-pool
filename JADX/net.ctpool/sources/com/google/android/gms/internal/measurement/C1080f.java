package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1080f implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ Iterator f14576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ Iterator f14577n;

    C1080f(C1089g c1089g, Iterator it, Iterator it2) {
        this.f14576m = it;
        this.f14577n = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14576m.hasNext()) {
            return true;
        }
        return this.f14577n.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f14576m.hasNext()) {
            return new C1214u(((Integer) this.f14576m.next()).toString());
        }
        if (this.f14577n.hasNext()) {
            return new C1214u((String) this.f14577n.next());
        }
        throw new NoSuchElementException();
    }
}
