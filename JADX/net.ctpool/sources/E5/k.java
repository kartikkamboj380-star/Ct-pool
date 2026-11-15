package E5;

import java.util.Iterator;
import v5.l;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f1049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f1050b;

    public static final class a implements Iterator, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Iterator f1051m;

        a() {
            this.f1051m = k.this.f1049a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1051m.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return k.this.f1050b.i(this.f1051m.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k(d dVar, l lVar) {
        w5.k.f(dVar, "sequence");
        w5.k.f(lVar, "transformer");
        this.f1049a = dVar;
        this.f1050b = lVar;
    }

    @Override // E5.d
    public Iterator iterator() {
        return new a();
    }
}
