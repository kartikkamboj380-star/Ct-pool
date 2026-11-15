package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class K extends l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f14093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f14094n;

    protected K(int i7, int i8) {
        D.b(i8, i7, "index");
        this.f14093m = i7;
        this.f14094n = i8;
    }

    protected abstract Object c(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f14094n < this.f14093m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14094n > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f14094n;
        this.f14094n = i7 + 1;
        return c(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14094n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f14094n - 1;
        this.f14094n = i7;
        return c(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14094n - 1;
    }
}
