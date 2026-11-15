package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1275d extends AbstractC1346x {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f15167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f15168n;

    protected AbstractC1275d(int i7, int i8) {
        AbstractC1267b.b(i8, i7, "index");
        this.f15167m = i7;
        this.f15168n = i8;
    }

    protected abstract Object c(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f15168n < this.f15167m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f15168n > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f15168n;
        this.f15168n = i7 + 1;
        return c(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15168n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f15168n - 1;
        this.f15168n = i7;
        return c(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15168n - 1;
    }
}
