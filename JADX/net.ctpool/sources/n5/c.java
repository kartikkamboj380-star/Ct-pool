package n5;

import i5.n;
import m5.C1889h;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import o5.AbstractC1946a;
import o5.AbstractC1949d;
import o5.AbstractC1953h;
import o5.AbstractC1955j;
import v5.p;
import w5.k;
import w5.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    public static final class a extends AbstractC1955j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f21438n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ p f21439o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Object f21440p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1885d interfaceC1885d, p pVar, Object obj) {
            super(interfaceC1885d);
            this.f21439o = pVar;
            this.f21440p = obj;
            k.d(interfaceC1885d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o5.AbstractC1946a
        protected Object s(Object obj) {
            int i7 = this.f21438n;
            if (i7 == 0) {
                this.f21438n = 1;
                n.b(obj);
                k.d(this.f21439o, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) z.b(this.f21439o, 2)).m(this.f21440p, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f21438n = 2;
            n.b(obj);
            return obj;
        }
    }

    public static final class b extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f21441p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p f21442q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Object f21443r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1885d interfaceC1885d, InterfaceC1888g interfaceC1888g, p pVar, Object obj) {
            super(interfaceC1885d, interfaceC1888g);
            this.f21442q = pVar;
            this.f21443r = obj;
            k.d(interfaceC1885d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o5.AbstractC1946a
        protected Object s(Object obj) {
            int i7 = this.f21441p;
            if (i7 == 0) {
                this.f21441p = 1;
                n.b(obj);
                k.d(this.f21442q, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) z.b(this.f21442q, 2)).m(this.f21443r, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f21441p = 2;
            n.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1885d a(p pVar, Object obj, InterfaceC1885d interfaceC1885d) {
        k.f(pVar, "<this>");
        k.f(interfaceC1885d, "completion");
        InterfaceC1885d interfaceC1885dA = AbstractC1953h.a(interfaceC1885d);
        if (pVar instanceof AbstractC1946a) {
            return ((AbstractC1946a) pVar).d(obj, interfaceC1885dA);
        }
        InterfaceC1888g interfaceC1888gA = interfaceC1885dA.a();
        return interfaceC1888gA == C1889h.f21267m ? new a(interfaceC1885dA, pVar, obj) : new b(interfaceC1885dA, interfaceC1888gA, pVar, obj);
    }

    public static InterfaceC1885d b(InterfaceC1885d interfaceC1885d) {
        InterfaceC1885d interfaceC1885dU;
        k.f(interfaceC1885d, "<this>");
        AbstractC1949d abstractC1949d = interfaceC1885d instanceof AbstractC1949d ? (AbstractC1949d) interfaceC1885d : null;
        return (abstractC1949d == null || (interfaceC1885dU = abstractC1949d.u()) == null) ? interfaceC1885d : interfaceC1885dU;
    }
}
