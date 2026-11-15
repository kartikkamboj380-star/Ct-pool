package R5;

import H5.C0406m;
import H5.InterfaceC0404l;
import i5.m;
import i5.n;
import i5.u;
import java.util.concurrent.CancellationException;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1953h;
import w5.l;
import z3.AbstractC2272l;
import z3.C2262b;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    static final class a implements InterfaceC2266f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0404l f2904a;

        a(InterfaceC0404l interfaceC0404l) {
            this.f2904a = interfaceC0404l;
        }

        @Override // z3.InterfaceC2266f
        public final void a(AbstractC2272l abstractC2272l) {
            Exception excK = abstractC2272l.k();
            if (excK != null) {
                InterfaceC0404l interfaceC0404l = this.f2904a;
                m.a aVar = m.f19973m;
                interfaceC0404l.h(m.a(n.a(excK)));
            } else {
                if (abstractC2272l.n()) {
                    InterfaceC0404l.a.a(this.f2904a, null, 1, null);
                    return;
                }
                InterfaceC0404l interfaceC0404l2 = this.f2904a;
                m.a aVar2 = m.f19973m;
                interfaceC0404l2.h(m.a(abstractC2272l.l()));
            }
        }
    }

    /* JADX INFO: renamed from: R5.b$b, reason: collision with other inner class name */
    static final class C0064b extends l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C2262b f2905m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0064b(C2262b c2262b) {
            super(1);
            this.f2905m = c2262b;
        }

        public final void a(Throwable th) {
            this.f2905m.a();
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return u.f19985a;
        }
    }

    public static final Object a(AbstractC2272l abstractC2272l, InterfaceC1885d interfaceC1885d) {
        return b(abstractC2272l, null, interfaceC1885d);
    }

    private static final Object b(AbstractC2272l abstractC2272l, C2262b c2262b, InterfaceC1885d interfaceC1885d) throws Exception {
        if (!abstractC2272l.o()) {
            C0406m c0406m = new C0406m(AbstractC1930b.b(interfaceC1885d), 1);
            c0406m.C();
            abstractC2272l.b(R5.a.f2903m, new a(c0406m));
            if (c2262b != null) {
                c0406m.k(new C0064b(c2262b));
            }
            Object objZ = c0406m.z();
            if (objZ == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objZ;
        }
        Exception excK = abstractC2272l.k();
        if (excK != null) {
            throw excK;
        }
        if (!abstractC2272l.n()) {
            return abstractC2272l.l();
        }
        throw new CancellationException("Task " + abstractC2272l + " was cancelled normally.");
    }
}
