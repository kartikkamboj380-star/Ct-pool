package T;

import H5.AbstractC0398i;
import H5.I;
import H5.J;
import H5.W;
import U.n;
import U.o;
import X3.d;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import i5.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1956k;
import v5.p;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2977a = new b(null);

    /* JADX INFO: renamed from: T.a$a, reason: collision with other inner class name */
    private static final class C0066a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n f2978b;

        /* JADX INFO: renamed from: T.a$a$a, reason: collision with other inner class name */
        static final class C0067a extends AbstractC1956k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2979q;

            C0067a(U.a aVar, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                return C0066a.this.new C0067a(null, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                Object objC = AbstractC1930b.c();
                int i7 = this.f2979q;
                if (i7 == 0) {
                    i5.n.b(obj);
                    n nVar = C0066a.this.f2978b;
                    this.f2979q = 1;
                    if (nVar.a(null, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                }
                return u.f19985a;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
                return ((C0067a) d(i7, interfaceC1885d)).s(u.f19985a);
            }
        }

        /* JADX INFO: renamed from: T.a$a$b */
        static final class b extends AbstractC1956k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2981q;

            b(InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                return C0066a.this.new b(interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                Object objC = AbstractC1930b.c();
                int i7 = this.f2981q;
                if (i7 == 0) {
                    i5.n.b(obj);
                    n nVar = C0066a.this.f2978b;
                    this.f2981q = 1;
                    obj = nVar.b(this);
                    if (obj == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                }
                return obj;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
                return ((b) d(i7, interfaceC1885d)).s(u.f19985a);
            }
        }

        /* JADX INFO: renamed from: T.a$a$c */
        static final class c extends AbstractC1956k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2983q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Uri f2985s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ InputEvent f2986t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
                this.f2985s = uri;
                this.f2986t = inputEvent;
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                return C0066a.this.new c(this.f2985s, this.f2986t, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                Object objC = AbstractC1930b.c();
                int i7 = this.f2983q;
                if (i7 == 0) {
                    i5.n.b(obj);
                    n nVar = C0066a.this.f2978b;
                    Uri uri = this.f2985s;
                    InputEvent inputEvent = this.f2986t;
                    this.f2983q = 1;
                    if (nVar.c(uri, inputEvent, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                }
                return u.f19985a;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
                return ((c) d(i7, interfaceC1885d)).s(u.f19985a);
            }
        }

        /* JADX INFO: renamed from: T.a$a$d */
        static final class d extends AbstractC1956k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2987q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Uri f2989s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
                this.f2989s = uri;
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                return C0066a.this.new d(this.f2989s, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                Object objC = AbstractC1930b.c();
                int i7 = this.f2987q;
                if (i7 == 0) {
                    i5.n.b(obj);
                    n nVar = C0066a.this.f2978b;
                    Uri uri = this.f2989s;
                    this.f2987q = 1;
                    if (nVar.d(uri, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                }
                return u.f19985a;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
                return ((d) d(i7, interfaceC1885d)).s(u.f19985a);
            }
        }

        /* JADX INFO: renamed from: T.a$a$e */
        static final class e extends AbstractC1956k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2990q;

            e(o oVar, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                return C0066a.this.new e(null, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                Object objC = AbstractC1930b.c();
                int i7 = this.f2990q;
                if (i7 == 0) {
                    i5.n.b(obj);
                    n nVar = C0066a.this.f2978b;
                    this.f2990q = 1;
                    if (nVar.e(null, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                }
                return u.f19985a;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
                return ((e) d(i7, interfaceC1885d)).s(u.f19985a);
            }
        }

        /* JADX INFO: renamed from: T.a$a$f */
        static final class f extends AbstractC1956k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2992q;

            f(U.p pVar, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                return C0066a.this.new f(null, interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                Object objC = AbstractC1930b.c();
                int i7 = this.f2992q;
                if (i7 == 0) {
                    i5.n.b(obj);
                    n nVar = C0066a.this.f2978b;
                    this.f2992q = 1;
                    if (nVar.f(null, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                }
                return u.f19985a;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
                return ((f) d(i7, interfaceC1885d)).s(u.f19985a);
            }
        }

        public C0066a(n nVar) {
            k.f(nVar, "mMeasurementManager");
            this.f2978b = nVar;
        }

        @Override // T.a
        public X3.d b() {
            return S.b.c(AbstractC0398i.b(J.a(W.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // T.a
        public X3.d c(Uri uri) {
            k.f(uri, "trigger");
            return S.b.c(AbstractC0398i.b(J.a(W.a()), null, null, new d(uri, null), 3, null), null, 1, null);
        }

        public X3.d e(U.a aVar) {
            k.f(aVar, "deletionRequest");
            return S.b.c(AbstractC0398i.b(J.a(W.a()), null, null, new C0067a(aVar, null), 3, null), null, 1, null);
        }

        public X3.d f(Uri uri, InputEvent inputEvent) {
            k.f(uri, "attributionSource");
            return S.b.c(AbstractC0398i.b(J.a(W.a()), null, null, new c(uri, inputEvent, null), 3, null), null, 1, null);
        }

        public X3.d g(o oVar) {
            k.f(oVar, "request");
            return S.b.c(AbstractC0398i.b(J.a(W.a()), null, null, new e(oVar, null), 3, null), null, 1, null);
        }

        public X3.d h(U.p pVar) {
            k.f(pVar, "request");
            return S.b.c(AbstractC0398i.b(J.a(W.a()), null, null, new f(pVar, null), 3, null), null, 1, null);
        }
    }

    public static final class b {
        private b() {
        }

        public final a a(Context context) {
            k.f(context, "context");
            n nVarA = n.f3733a.a(context);
            if (nVarA != null) {
                return new C0066a(nVarA);
            }
            return null;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final a a(Context context) {
        return f2977a.a(context);
    }

    public abstract d b();

    public abstract d c(Uri uri);
}
