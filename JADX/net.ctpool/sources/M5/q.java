package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2104m = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2105n = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2106o = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends AbstractC0425b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f2107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q f2108c;

        public a(q qVar) {
            this.f2107b = qVar;
        }

        @Override // M5.AbstractC0425b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(q qVar, Object obj) {
            boolean z6 = obj == null;
            q qVar2 = z6 ? this.f2107b : this.f2108c;
            if (qVar2 != null && androidx.concurrent.futures.b.a(q.f2104m, qVar, this, qVar2) && z6) {
                q qVar3 = this.f2107b;
                q qVar4 = this.f2108c;
                w5.k.c(qVar4);
                qVar3.p(qVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((M5.z) r5).f2124a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final q l(y yVar) {
        while (true) {
            q qVar = (q) f2105n.get(this);
            q qVar2 = qVar;
            while (true) {
                q qVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2104m;
                    Object obj = atomicReferenceFieldUpdater.get(qVar2);
                    if (obj == this) {
                        if (qVar == qVar2) {
                            return qVar2;
                        }
                        if (androidx.concurrent.futures.b.a(f2105n, this, qVar, qVar2)) {
                            return qVar2;
                        }
                    } else {
                        if (t()) {
                            return null;
                        }
                        if (obj == yVar) {
                            return qVar2;
                        }
                        if (obj instanceof y) {
                            ((y) obj).a(qVar2);
                            break;
                        }
                        if (!(obj instanceof z)) {
                            w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                            qVar3 = qVar2;
                            qVar2 = (q) obj;
                        } else {
                            if (qVar3 != null) {
                                break;
                            }
                            qVar2 = (q) f2105n.get(qVar2);
                        }
                    }
                }
                qVar2 = qVar3;
            }
        }
    }

    private final q n(q qVar) {
        while (qVar.t()) {
            qVar = (q) f2105n.get(qVar);
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(q qVar) {
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2105n;
        do {
            qVar2 = (q) atomicReferenceFieldUpdater.get(qVar);
            if (q() != qVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f2105n, qVar, qVar2, this));
        if (t()) {
            qVar.l(null);
        }
    }

    private final z w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2106o;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this);
        atomicReferenceFieldUpdater.lazySet(this, zVar2);
        return zVar2;
    }

    public final boolean k(q qVar) {
        f2105n.lazySet(qVar, this);
        f2104m.lazySet(qVar, this);
        while (q() == this) {
            if (androidx.concurrent.futures.b.a(f2104m, this, this, qVar)) {
                qVar.p(this);
                return true;
            }
        }
        return false;
    }

    public final Object q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2104m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final q r() {
        return p.b(q());
    }

    public final q s() {
        q qVarL = l(null);
        return qVarL == null ? n((q) f2105n.get(this)) : qVarL;
    }

    public boolean t() {
        return q() instanceof z;
    }

    public String toString() {
        return new w5.o(this) { // from class: M5.q.b
            @Override // D5.e
            public Object get() {
                return H5.M.a(this.f22718n);
            }
        } + '@' + H5.M.b(this);
    }

    public boolean u() {
        return v() == null;
    }

    public final q v() {
        Object objQ;
        q qVar;
        do {
            objQ = q();
            if (objQ instanceof z) {
                return ((z) objQ).f2124a;
            }
            if (objQ == this) {
                return (q) objQ;
            }
            w5.k.d(objQ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            qVar = (q) objQ;
        } while (!androidx.concurrent.futures.b.a(f2104m, this, objQ, qVar.w()));
        qVar.l(null);
        return null;
    }

    public final int x(q qVar, q qVar2, a aVar) {
        f2105n.lazySet(qVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2104m;
        atomicReferenceFieldUpdater.lazySet(qVar, qVar2);
        aVar.f2108c = qVar2;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, qVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
