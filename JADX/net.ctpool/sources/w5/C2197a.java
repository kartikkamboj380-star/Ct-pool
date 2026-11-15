package w5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x5.InterfaceC2227a;

/* JADX INFO: renamed from: w5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2197a implements Iterator, InterfaceC2227a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f22714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22715n;

    public C2197a(Object[] objArr) {
        k.f(objArr, "array");
        this.f22714m = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22715n < this.f22714m.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f22714m;
            int i7 = this.f22715n;
            this.f22715n = i7 + 1;
            return objArr[i7];
        } catch (ArrayIndexOutOfBoundsException e7) {
            this.f22715n--;
            throw new NoSuchElementException(e7.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
