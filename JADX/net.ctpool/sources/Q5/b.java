package Q5;

import H5.AbstractC0410o;
import H5.C0406m;
import H5.InterfaceC0404l;
import H5.M;
import H5.P0;
import M5.C;
import androidx.appcompat.app.y;
import i5.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1953h;
import v5.q;
import w5.l;

/* JADX INFO: loaded from: classes2.dex */
public class b extends d implements Q5.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2792i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q f2793h;
    private volatile Object owner;

    private final class a implements InterfaceC0404l, P0 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final C0406m f2794m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f2795n;

        /* JADX INFO: renamed from: Q5.b$a$a, reason: collision with other inner class name */
        static final class C0059a extends l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ b f2797m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ a f2798n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0059a(b bVar, a aVar) {
                super(1);
                this.f2797m = bVar;
                this.f2798n = aVar;
            }

            public final void a(Throwable th) {
                this.f2797m.c(this.f2798n.f2795n);
            }

            @Override // v5.l
            public /* bridge */ /* synthetic */ Object i(Object obj) {
                a((Throwable) obj);
                return u.f19985a;
            }
        }

        /* JADX INFO: renamed from: Q5.b$a$b, reason: collision with other inner class name */
        static final class C0060b extends l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ b f2799m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ a f2800n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0060b(b bVar, a aVar) {
                super(1);
                this.f2799m = bVar;
                this.f2800n = aVar;
            }

            public final void a(Throwable th) {
                b.f2792i.set(this.f2799m, this.f2800n.f2795n);
                this.f2799m.c(this.f2800n.f2795n);
            }

            @Override // v5.l
            public /* bridge */ /* synthetic */ Object i(Object obj) {
                a((Throwable) obj);
                return u.f19985a;
            }
        }

        public a(C0406m c0406m, Object obj) {
            this.f2794m = c0406m;
            this.f2795n = obj;
        }

        @Override // m5.InterfaceC1885d
        public InterfaceC1888g a() {
            return this.f2794m.a();
        }

        @Override // H5.P0
        public void b(C c7, int i7) {
            this.f2794m.b(c7, i7);
        }

        @Override // H5.InterfaceC0404l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(u uVar, v5.l lVar) {
            b.f2792i.set(b.this, this.f2795n);
            this.f2794m.c(uVar, new C0059a(b.this, this));
        }

        @Override // H5.InterfaceC0404l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object q(u uVar, Object obj, v5.l lVar) {
            Object objQ = this.f2794m.q(uVar, obj, new C0060b(b.this, this));
            if (objQ != null) {
                b.f2792i.set(b.this, this.f2795n);
            }
            return objQ;
        }

        @Override // m5.InterfaceC1885d
        public void h(Object obj) {
            this.f2794m.h(obj);
        }

        @Override // H5.InterfaceC0404l
        public void k(v5.l lVar) {
            this.f2794m.k(lVar);
        }

        @Override // H5.InterfaceC0404l
        public boolean p(Throwable th) {
            return this.f2794m.p(th);
        }

        @Override // H5.InterfaceC0404l
        public void r(Object obj) {
            this.f2794m.r(obj);
        }
    }

    /* JADX INFO: renamed from: Q5.b$b, reason: collision with other inner class name */
    static final class C0061b extends l implements q {

        /* JADX INFO: renamed from: Q5.b$b$a */
        static final class a extends l implements v5.l {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ b f2802m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Object f2803n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f2802m = bVar;
                this.f2803n = obj;
            }

            public final void a(Throwable th) {
                this.f2802m.c(this.f2803n);
            }

            @Override // v5.l
            public /* bridge */ /* synthetic */ Object i(Object obj) {
                a((Throwable) obj);
                return u.f19985a;
            }
        }

        C0061b() {
            super(3);
        }

        public final v5.l a(P5.a aVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }

        @Override // v5.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            y.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public b(boolean z6) {
        super(1, z6 ? 1 : 0);
        this.owner = z6 ? null : c.f2804a;
        this.f2793h = new C0061b();
    }

    static /* synthetic */ Object o(b bVar, Object obj, InterfaceC1885d interfaceC1885d) {
        if (bVar.q(obj)) {
            return u.f19985a;
        }
        Object objP = bVar.p(obj, interfaceC1885d);
        return objP == AbstractC1930b.c() ? objP : u.f19985a;
    }

    private final Object p(Object obj, InterfaceC1885d interfaceC1885d) {
        C0406m c0406mB = AbstractC0410o.b(AbstractC1930b.b(interfaceC1885d));
        try {
            d(new a(c0406mB, obj));
            Object objZ = c0406mB.z();
            if (objZ == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objZ == AbstractC1930b.c() ? objZ : u.f19985a;
        } catch (Throwable th) {
            c0406mB.L();
            throw th;
        }
    }

    private final int r(Object obj) {
        while (!j()) {
            if (obj == null) {
                return 1;
            }
            if (n(obj)) {
                return 2;
            }
            if (b()) {
                return 1;
            }
        }
        f2792i.set(this, obj);
        return 0;
    }

    @Override // Q5.a
    public Object a(Object obj, InterfaceC1885d interfaceC1885d) {
        return o(this, obj, interfaceC1885d);
    }

    @Override // Q5.a
    public boolean b() {
        return h() == 0;
    }

    @Override // Q5.a
    public void c(Object obj) {
        while (b()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2792i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != c.f2804a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, c.f2804a)) {
                    i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public boolean n(Object obj) {
        while (b()) {
            Object obj2 = f2792i.get(this);
            if (obj2 != c.f2804a) {
                return obj2 == obj;
            }
        }
        return false;
    }

    public boolean q(Object obj) {
        int iR = r(obj);
        if (iR == 0) {
            return true;
        }
        if (iR == 1) {
            return false;
        }
        if (iR != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public String toString() {
        return "Mutex@" + M.b(this) + "[isLocked=" + b() + ",owner=" + f2792i.get(this) + ']';
    }
}
