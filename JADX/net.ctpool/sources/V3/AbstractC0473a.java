package V3;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: V3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0473a extends T {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f4079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f4080n;

    protected AbstractC0473a(int i7, int i8) {
        U3.h.k(i8, i7);
        this.f4079m = i7;
        this.f4080n = i8;
    }

    protected abstract Object c(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4080n < this.f4079m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4080n > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4080n;
        this.f4080n = i7 + 1;
        return c(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4080n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f4080n - 1;
        this.f4080n = i7;
        return c(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4080n - 1;
    }
}
