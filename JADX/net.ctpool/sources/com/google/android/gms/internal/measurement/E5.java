package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class E5 implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Iterator f14188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ AbstractC1237w5 f14189p;

    private E5(AbstractC1237w5 abstractC1237w5) {
        this.f14189p = abstractC1237w5;
        this.f14186m = -1;
    }

    private final Iterator c() {
        if (this.f14188o == null) {
            this.f14188o = this.f14189p.f14952o.entrySet().iterator();
        }
        return this.f14188o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14186m + 1 < this.f14189p.f14951n || (!this.f14189p.f14952o.isEmpty() && c().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f14187n = true;
        int i7 = this.f14186m + 1;
        this.f14186m = i7;
        return i7 < this.f14189p.f14951n ? (A5) this.f14189p.f14950m[this.f14186m] : (Map.Entry) c().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f14187n) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f14187n = false;
        this.f14189p.r();
        if (this.f14186m >= this.f14189p.f14951n) {
            c().remove();
            return;
        }
        AbstractC1237w5 abstractC1237w5 = this.f14189p;
        int i7 = this.f14186m;
        this.f14186m = i7 - 1;
        abstractC1237w5.i(i7);
    }
}
