package E5;

import java.util.Iterator;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f1043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1044b;

    public static final class a implements Iterator, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Iterator f1045m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f1046n;

        a(b bVar) {
            this.f1045m = bVar.f1043a.iterator();
            this.f1046n = bVar.f1044b;
        }

        private final void d() {
            while (this.f1046n > 0 && this.f1045m.hasNext()) {
                this.f1045m.next();
                this.f1046n--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            d();
            return this.f1045m.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            d();
            return this.f1045m.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(d dVar, int i7) {
        w5.k.f(dVar, "sequence");
        this.f1043a = dVar;
        this.f1044b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // E5.c
    public d a(int i7) {
        int i8 = this.f1044b + i7;
        return i8 < 0 ? new b(this, i7) : new b(this.f1043a, i8);
    }

    @Override // E5.d
    public Iterator iterator() {
        return new a(this);
    }
}
