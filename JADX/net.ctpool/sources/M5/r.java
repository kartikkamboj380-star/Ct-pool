package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2109a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    private volatile Object _cur;

    public r(boolean z6) {
        this._cur = new s(8, z6);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2109a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int iA = sVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f2109a, this, sVar, sVar.i());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2109a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f2109a, this, sVar, sVar.i());
            }
        }
    }

    public final int c() {
        return ((s) f2109a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2109a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object objJ = sVar.j();
            if (objJ != s.f2113h) {
                return objJ;
            }
            androidx.concurrent.futures.b.a(f2109a, this, sVar, sVar.i());
        }
    }
}
