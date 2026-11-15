package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1253y5 implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Iterator f14989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ AbstractC1237w5 f14990o;

    private C1253y5(AbstractC1237w5 abstractC1237w5) {
        this.f14990o = abstractC1237w5;
        this.f14988m = abstractC1237w5.f14951n;
    }

    private final Iterator c() {
        if (this.f14989n == null) {
            this.f14989n = this.f14990o.f14955r.entrySet().iterator();
        }
        return this.f14989n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f14988m;
        return (i7 > 0 && i7 <= this.f14990o.f14951n) || c().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (c().hasNext()) {
            return (Map.Entry) c().next();
        }
        Object[] objArr = this.f14990o.f14950m;
        int i7 = this.f14988m - 1;
        this.f14988m = i7;
        return (A5) objArr[i7];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
