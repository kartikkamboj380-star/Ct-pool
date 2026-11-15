package F;

import i5.n;
import i5.u;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1956k;
import v5.p;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements C.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.f f1056a;

    static final class a extends AbstractC1956k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1057q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f1058r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f1059s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
            this.f1059s = pVar;
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            a aVar = new a(this.f1059s, interfaceC1885d);
            aVar.f1058r = obj;
            return aVar;
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            Object objC = AbstractC1930b.c();
            int i7 = this.f1057q;
            if (i7 == 0) {
                n.b(obj);
                d dVar = (d) this.f1058r;
                p pVar = this.f1059s;
                this.f1057q = 1;
                obj = pVar.m(dVar, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            d dVar2 = (d) obj;
            ((F.a) dVar2).f();
            return dVar2;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(d dVar, InterfaceC1885d interfaceC1885d) {
            return ((a) d(dVar, interfaceC1885d)).s(u.f19985a);
        }
    }

    public b(C.f fVar) {
        k.f(fVar, "delegate");
        this.f1056a = fVar;
    }

    @Override // C.f
    public Object a(p pVar, InterfaceC1885d interfaceC1885d) {
        return this.f1056a.a(new a(pVar, null), interfaceC1885d);
    }

    @Override // C.f
    public K5.b getData() {
        return this.f1056a.getData();
    }
}
