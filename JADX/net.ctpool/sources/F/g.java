package F;

import i5.n;
import i5.u;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1956k;
import v5.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    static final class a extends AbstractC1956k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1063q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f1064r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f1065s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
            this.f1065s = pVar;
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            a aVar = new a(this.f1065s, interfaceC1885d);
            aVar.f1064r = obj;
            return aVar;
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            Object objC = AbstractC1930b.c();
            int i7 = this.f1063q;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                F.a aVar = (F.a) this.f1064r;
                n.b(obj);
                return aVar;
            }
            n.b(obj);
            F.a aVarC = ((d) this.f1064r).c();
            p pVar = this.f1065s;
            this.f1064r = aVarC;
            this.f1063q = 1;
            return pVar.m(aVarC, this) == objC ? objC : aVarC;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(d dVar, InterfaceC1885d interfaceC1885d) {
            return ((a) d(dVar, interfaceC1885d)).s(u.f19985a);
        }
    }

    public static final Object a(C.f fVar, p pVar, InterfaceC1885d interfaceC1885d) {
        return fVar.a(new a(pVar, null), interfaceC1885d);
    }
}
