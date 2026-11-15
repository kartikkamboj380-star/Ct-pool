package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1328q1 implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f15288m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f15289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Iterator f15290o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ AbstractC1339u1 f15291p;

    /* synthetic */ C1328q1(AbstractC1339u1 abstractC1339u1, AbstractC1325p1 abstractC1325p1) {
        this.f15291p = abstractC1339u1;
    }

    private final Iterator c() {
        if (this.f15290o == null) {
            this.f15290o = this.f15291p.f15311o.entrySet().iterator();
        }
        return this.f15290o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15288m + 1 >= this.f15291p.f15310n.size()) {
            return !this.f15291p.f15311o.isEmpty() && c().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f15289n = true;
        int i7 = this.f15288m + 1;
        this.f15288m = i7;
        return (Map.Entry) (i7 < this.f15291p.f15310n.size() ? this.f15291p.f15310n.get(this.f15288m) : c().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15289n) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f15289n = false;
        this.f15291p.o();
        if (this.f15288m >= this.f15291p.f15310n.size()) {
            c().remove();
            return;
        }
        AbstractC1339u1 abstractC1339u1 = this.f15291p;
        int i7 = this.f15288m;
        this.f15288m = i7 - 1;
        abstractC1339u1.m(i7);
    }
}
