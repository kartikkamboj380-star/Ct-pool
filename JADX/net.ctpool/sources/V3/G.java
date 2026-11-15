package V3;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class G implements Comparator {
    protected G() {
    }

    public static G a(Comparator comparator) {
        return comparator instanceof G ? (G) comparator : new C0483k(comparator);
    }

    public static G c() {
        return D.f4046m;
    }

    public AbstractC0487o b(Iterable iterable) {
        return AbstractC0487o.x(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    G d() {
        return e(z.b());
    }

    public G e(U3.c cVar) {
        return new C0478f(cVar, this);
    }
}
