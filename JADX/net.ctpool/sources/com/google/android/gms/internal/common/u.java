package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class u implements Iterator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object f14112m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14113n = 2;

    protected u() {
    }

    protected abstract Object c();

    protected final Object d() {
        this.f14113n = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f14113n;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        if (i8 == 0) {
            return true;
        }
        if (i8 != 2) {
            this.f14113n = 4;
            this.f14112m = c();
            if (this.f14113n != 3) {
                this.f14113n = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14113n = 2;
        Object obj = this.f14112m;
        this.f14112m = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
