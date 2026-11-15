package K5;

import i5.u;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import v5.p;
import w5.s;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class i {

    public static final class a implements K5.b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ K5.b f1902m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ p f1903n;

        public a(K5.b bVar, p pVar) {
            this.f1902m = bVar;
            this.f1903n = pVar;
        }

        @Override // K5.b
        public Object a(c cVar, InterfaceC1885d interfaceC1885d) {
            Object objA = this.f1902m.a(new b(new s(), cVar, this.f1903n), interfaceC1885d);
            return objA == AbstractC1930b.c() ? objA : u.f19985a;
        }
    }

    static final class b implements c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ s f1904m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ c f1905n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p f1906o;

        static final class a extends AbstractC1949d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f1907p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f1908q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f1909r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f1911t;

            a(InterfaceC1885d interfaceC1885d) {
                super(interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                this.f1909r = obj;
                this.f1911t |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        b(s sVar, c cVar, p pVar) {
            this.f1904m = sVar;
            this.f1905n = cVar;
            this.f1906o = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // K5.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(Object obj, InterfaceC1885d interfaceC1885d) {
            a aVar;
            b bVar;
            if (interfaceC1885d instanceof a) {
                aVar = (a) interfaceC1885d;
                int i7 = aVar.f1911t;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f1911t = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1885d);
                }
            }
            Object objM = aVar.f1909r;
            Object objC = AbstractC1930b.c();
            int i8 = aVar.f1911t;
            if (i8 == 0) {
                i5.n.b(objM);
                if (this.f1904m.f22737m) {
                    c cVar = this.f1905n;
                    aVar.f1911t = 1;
                    if (cVar.b(obj, aVar) == objC) {
                        return objC;
                    }
                    return u.f19985a;
                }
                p pVar = this.f1906o;
                aVar.f1907p = this;
                aVar.f1908q = obj;
                aVar.f1911t = 2;
                objM = pVar.m(obj, aVar);
                if (objM == objC) {
                    return objC;
                }
                bVar = this;
                if (!((Boolean) objM).booleanValue()) {
                }
            } else {
                if (i8 == 1) {
                    i5.n.b(objM);
                    return u.f19985a;
                }
                if (i8 == 2) {
                    obj = aVar.f1908q;
                    bVar = (b) aVar.f1907p;
                    i5.n.b(objM);
                    if (!((Boolean) objM).booleanValue()) {
                        return u.f19985a;
                    }
                    bVar.f1904m.f22737m = true;
                    c cVar2 = bVar.f1905n;
                    aVar.f1907p = null;
                    aVar.f1908q = null;
                    aVar.f1911t = 3;
                    if (cVar2.b(obj, aVar) == objC) {
                        return objC;
                    }
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(objM);
                }
            }
            return u.f19985a;
        }
    }

    public static final K5.b a(K5.b bVar, p pVar) {
        return new a(bVar, pVar);
    }
}
