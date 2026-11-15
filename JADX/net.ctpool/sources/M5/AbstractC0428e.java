package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: M5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0428e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2083m = AtomicReferenceFieldUpdater.newUpdater(AbstractC0428e.class, Object.class, "_next");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2084n = AtomicReferenceFieldUpdater.newUpdater(AbstractC0428e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC0428e(AbstractC0428e abstractC0428e) {
        this._prev = abstractC0428e;
    }

    private final AbstractC0428e c() {
        AbstractC0428e abstractC0428eG = g();
        while (abstractC0428eG != null && abstractC0428eG.h()) {
            abstractC0428eG = (AbstractC0428e) f2084n.get(abstractC0428eG);
        }
        return abstractC0428eG;
    }

    private final AbstractC0428e d() {
        AbstractC0428e abstractC0428eE = e();
        w5.k.c(abstractC0428eE);
        while (abstractC0428eE.h()) {
            AbstractC0428e abstractC0428eE2 = abstractC0428eE.e();
            if (abstractC0428eE2 == null) {
                return abstractC0428eE;
            }
            abstractC0428eE = abstractC0428eE2;
        }
        return abstractC0428eE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f2083m.get(this);
    }

    public final void b() {
        f2084n.lazySet(this, null);
    }

    public final AbstractC0428e e() {
        Object objF = f();
        if (objF == AbstractC0427d.f2082a) {
            return null;
        }
        return (AbstractC0428e) objF;
    }

    public final AbstractC0428e g() {
        return (AbstractC0428e) f2084n.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return androidx.concurrent.futures.b.a(f2083m, this, null, AbstractC0427d.f2082a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            AbstractC0428e abstractC0428eC = c();
            AbstractC0428e abstractC0428eD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2084n;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC0428eD);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC0428eD, obj, ((AbstractC0428e) obj) == null ? null : abstractC0428eC));
            if (abstractC0428eC != null) {
                f2083m.set(abstractC0428eC, abstractC0428eD);
            }
            if (!abstractC0428eD.h() || abstractC0428eD.i()) {
                if (abstractC0428eC == null || !abstractC0428eC.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(AbstractC0428e abstractC0428e) {
        return androidx.concurrent.futures.b.a(f2083m, this, null, abstractC0428e);
    }
}
