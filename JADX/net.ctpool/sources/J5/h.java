package J5;

import H5.P0;
import M5.C;
import M5.x;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f1820q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicReferenceArray f1821r;

    public h(long j7, h hVar, b bVar, int i7) {
        super(j7, hVar, i7);
        this.f1820q = bVar;
        this.f1821r = new AtomicReferenceArray(c.f1795b * 2);
    }

    private final void z(int i7, Object obj) {
        this.f1821r.lazySet(i7 * 2, obj);
    }

    public final void A(int i7, Object obj) {
        this.f1821r.set((i7 * 2) + 1, obj);
    }

    public final void B(int i7, Object obj) {
        z(i7, obj);
    }

    @Override // M5.C
    public int n() {
        return c.f1795b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = u().f1789c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        M5.x.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // M5.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(int i7, Throwable th, InterfaceC1888g interfaceC1888g) {
        v5.l lVar;
        int i8 = c.f1795b;
        boolean z6 = i7 >= i8;
        if (z6) {
            i7 -= i8;
        }
        Object objV = v(i7);
        while (true) {
            Object objW = w(i7);
            if ((objW instanceof P0) || (objW instanceof n)) {
                if (r(i7, objW, z6 ? c.f1803j : c.f1804k)) {
                    s(i7);
                    x(i7, !z6);
                    if (!z6 || (lVar = u().f1789c) == null) {
                        return;
                    }
                    x.b(lVar, objV, interfaceC1888g);
                    return;
                }
            } else {
                if (objW == c.f1803j || objW == c.f1804k) {
                    break;
                }
                if (objW != c.f1800g && objW != c.f1799f) {
                    if (objW == c.f1802i || objW == c.f1797d || objW == c.y()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objW).toString());
                }
            }
        }
    }

    public final boolean r(int i7, Object obj, Object obj2) {
        return g.a(this.f1821r, (i7 * 2) + 1, obj, obj2);
    }

    public final void s(int i7) {
        z(i7, null);
    }

    public final Object t(int i7, Object obj) {
        return this.f1821r.getAndSet((i7 * 2) + 1, obj);
    }

    public final b u() {
        b bVar = this.f1820q;
        w5.k.c(bVar);
        return bVar;
    }

    public final Object v(int i7) {
        return this.f1821r.get(i7 * 2);
    }

    public final Object w(int i7) {
        return this.f1821r.get((i7 * 2) + 1);
    }

    public final void x(int i7, boolean z6) {
        if (z6) {
            u().w0((this.f2062o * ((long) c.f1795b)) + ((long) i7));
        }
        p();
    }

    public final Object y(int i7) {
        Object objV = v(i7);
        s(i7);
        return objV;
    }
}
