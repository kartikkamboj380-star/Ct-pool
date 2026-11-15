package L5;

import m5.InterfaceC1885d;
import v5.q;
import w5.z;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f2011a;

    /* synthetic */ class a extends w5.i implements q {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f2012v = new a();

        a() {
            super(3, K5.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // v5.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public final Object e(K5.c cVar, Object obj, InterfaceC1885d interfaceC1885d) {
            return cVar.b(obj, interfaceC1885d);
        }
    }

    static {
        a aVar = a.f2012v;
        w5.k.d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f2011a = (q) z.b(aVar, 3);
    }
}
