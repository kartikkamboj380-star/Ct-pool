package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: M5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0425b extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2080a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0425b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0424a.f2079a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2080a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC0424a.f2079a;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    @Override // M5.y
    public final Object a(Object obj) {
        Object objC = f2080a.get(this);
        if (objC == AbstractC0424a.f2079a) {
            objC = c(d(obj));
        }
        b(obj, objC);
        return objC;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Object d(Object obj);
}
