package K5;

import H5.InterfaceC0415q0;
import i5.AbstractC1744a;
import i5.u;
import java.util.concurrent.CancellationException;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import v5.q;
import w5.v;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class h {

    public static final class a implements K5.b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ K5.b f1886m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ q f1887n;

        /* JADX INFO: renamed from: K5.h$a$a, reason: collision with other inner class name */
        public static final class C0038a extends AbstractC1949d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f1888p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f1889q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f1891s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f1892t;

            public C0038a(InterfaceC1885d interfaceC1885d) {
                super(interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                this.f1888p = obj;
                this.f1889q |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(K5.b bVar, q qVar) {
            this.f1886m = bVar;
            this.f1887n = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // K5.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(K5.c cVar, InterfaceC1885d interfaceC1885d) {
            C0038a c0038a;
            a aVar;
            if (interfaceC1885d instanceof C0038a) {
                c0038a = (C0038a) interfaceC1885d;
                int i7 = c0038a.f1889q;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c0038a.f1889q = i7 - Integer.MIN_VALUE;
                } else {
                    c0038a = new C0038a(interfaceC1885d);
                }
            }
            Object objB = c0038a.f1888p;
            Object objC = AbstractC1930b.c();
            int i8 = c0038a.f1889q;
            if (i8 == 0) {
                i5.n.b(objB);
                K5.b bVar = this.f1886m;
                c0038a.f1891s = this;
                c0038a.f1892t = cVar;
                c0038a.f1889q = 1;
                objB = d.b(bVar, cVar, c0038a);
                if (objB == objC) {
                    return objC;
                }
                aVar = this;
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(objB);
                    return u.f19985a;
                }
                cVar = (K5.c) c0038a.f1892t;
                aVar = (a) c0038a.f1891s;
                i5.n.b(objB);
            }
            Throwable th = (Throwable) objB;
            if (th != null) {
                q qVar = aVar.f1887n;
                c0038a.f1891s = null;
                c0038a.f1892t = null;
                c0038a.f1889q = 2;
                w5.j.a(6);
                Object objE = qVar.e(cVar, th, c0038a);
                w5.j.a(7);
                if (objE == objC) {
                    return objC;
                }
            }
            return u.f19985a;
        }
    }

    static final class b extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f1893p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f1894q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f1895r;

        b(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f1894q = obj;
            this.f1895r |= Integer.MIN_VALUE;
            return d.b(null, null, this);
        }
    }

    static final class c implements K5.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ K5.c f1896m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ v f1897n;

        static final class a extends AbstractC1949d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f1898p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f1899q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f1901s;

            a(InterfaceC1885d interfaceC1885d) {
                super(interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                this.f1899q = obj;
                this.f1901s |= Integer.MIN_VALUE;
                return c.this.b(null, this);
            }
        }

        c(K5.c cVar, v vVar) {
            this.f1896m = cVar;
            this.f1897n = vVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // K5.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(Object obj, InterfaceC1885d interfaceC1885d) throws Throwable {
            a aVar;
            c cVar;
            if (interfaceC1885d instanceof a) {
                aVar = (a) interfaceC1885d;
                int i7 = aVar.f1901s;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f1901s = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1885d);
                }
            }
            Object obj2 = aVar.f1899q;
            Object objC = AbstractC1930b.c();
            int i8 = aVar.f1901s;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.f1898p;
                try {
                    i5.n.b(obj2);
                    return u.f19985a;
                } catch (Throwable th) {
                    th = th;
                    cVar.f1897n.f22740m = th;
                    throw th;
                }
            }
            i5.n.b(obj2);
            try {
                K5.c cVar2 = this.f1896m;
                aVar.f1898p = this;
                aVar.f1901s = 1;
                if (cVar2.b(obj, aVar) == objC) {
                    return objC;
                }
                return u.f19985a;
            } catch (Throwable th2) {
                th = th2;
                cVar = this;
                cVar.f1897n.f22740m = th;
                throw th;
            }
        }
    }

    public static final K5.b a(K5.b bVar, q qVar) {
        return new a(bVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(K5.b bVar, K5.c cVar, InterfaceC1885d interfaceC1885d) throws Throwable {
        b bVar2;
        v vVar;
        if (interfaceC1885d instanceof b) {
            bVar2 = (b) interfaceC1885d;
            int i7 = bVar2.f1895r;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar2.f1895r = i7 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(interfaceC1885d);
            }
        }
        Object obj = bVar2.f1894q;
        Object objC = AbstractC1930b.c();
        int i8 = bVar2.f1895r;
        if (i8 == 0) {
            i5.n.b(obj);
            v vVar2 = new v();
            try {
                K5.c cVar2 = new c(cVar, vVar2);
                bVar2.f1893p = vVar2;
                bVar2.f1895r = 1;
                if (bVar.a(cVar2, bVar2) == objC) {
                    return objC;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                vVar = vVar2;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) bVar2.f1893p;
            try {
                i5.n.b(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) vVar.f22740m;
        if (d(th, th3) || c(th, bVar2.a())) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            AbstractC1744a.a(th3, th);
            throw th3;
        }
        AbstractC1744a.a(th, th3);
        throw th;
    }

    private static final boolean c(Throwable th, InterfaceC1888g interfaceC1888g) {
        InterfaceC0415q0 interfaceC0415q0 = (InterfaceC0415q0) interfaceC1888g.b(InterfaceC0415q0.f1444b);
        if (interfaceC0415q0 == null || !interfaceC0415q0.isCancelled()) {
            return false;
        }
        return d(th, interfaceC0415q0.w());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && w5.k.b(th2, th);
    }
}
