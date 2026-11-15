package K5;

import H5.C0406m;
import i5.m;
import i5.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1953h;

/* JADX INFO: loaded from: classes2.dex */
final class o extends L5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f1930a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state");
    private volatile Object _state;

    @Override // L5.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(m mVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1930a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, n.f1928a);
        return true;
    }

    public final Object e(InterfaceC1885d interfaceC1885d) {
        C0406m c0406m = new C0406m(AbstractC1930b.b(interfaceC1885d), 1);
        c0406m.C();
        if (!androidx.concurrent.futures.b.a(f1930a, this, n.f1928a, c0406m)) {
            m.a aVar = i5.m.f19973m;
            c0406m.h(i5.m.a(u.f19985a));
        }
        Object objZ = c0406m.z();
        if (objZ == AbstractC1930b.c()) {
            AbstractC1953h.c(interfaceC1885d);
        }
        return objZ == AbstractC1930b.c() ? objZ : u.f19985a;
    }

    @Override // L5.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC1885d[] b(m mVar) {
        f1930a.set(this, null);
        return L5.c.f1997a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1930a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == n.f1929b) {
                return;
            }
            if (obj == n.f1928a) {
                if (androidx.concurrent.futures.b.a(f1930a, this, obj, n.f1929b)) {
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f1930a, this, obj, n.f1928a)) {
                m.a aVar = i5.m.f19973m;
                ((C0406m) obj).h(i5.m.a(u.f19985a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = f1930a.getAndSet(this, n.f1928a);
        w5.k.c(andSet);
        return andSet == n.f1929b;
    }
}
