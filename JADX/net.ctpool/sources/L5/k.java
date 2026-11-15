package L5;

import H5.InterfaceC0415q0;
import M5.B;
import m5.InterfaceC1888g;
import v5.p;
import w5.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    static final class a extends l implements p {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ i f2013m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(2);
            this.f2013m = iVar;
        }

        public final Integer a(int i7, InterfaceC1888g.b bVar) {
            InterfaceC1888g.c key = bVar.getKey();
            InterfaceC1888g.b bVarB = this.f2013m.f2006q.b(key);
            if (key != InterfaceC0415q0.f1444b) {
                return Integer.valueOf(bVar != bVarB ? Integer.MIN_VALUE : i7 + 1);
            }
            InterfaceC0415q0 interfaceC0415q0 = (InterfaceC0415q0) bVarB;
            w5.k.d(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC0415q0 interfaceC0415q0B = k.b((InterfaceC0415q0) bVar, interfaceC0415q0);
            if (interfaceC0415q0B == interfaceC0415q0) {
                if (interfaceC0415q0 != null) {
                    i7++;
                }
                return Integer.valueOf(i7);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0415q0B + ", expected child of " + interfaceC0415q0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // v5.p
        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (InterfaceC1888g.b) obj2);
        }
    }

    public static final void a(i iVar, InterfaceC1888g interfaceC1888g) {
        if (((Number) interfaceC1888g.j(0, new a(iVar))).intValue() == iVar.f2007r) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iVar.f2006q + ",\n\t\tbut emission happened in " + interfaceC1888g + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC0415q0 b(InterfaceC0415q0 interfaceC0415q0, InterfaceC0415q0 interfaceC0415q02) {
        while (interfaceC0415q0 != null) {
            if (interfaceC0415q0 == interfaceC0415q02) {
                return interfaceC0415q0;
            }
            if (!(interfaceC0415q0 instanceof B)) {
                return interfaceC0415q0;
            }
            interfaceC0415q0 = interfaceC0415q0.getParent();
        }
        return null;
    }
}
