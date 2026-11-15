package N4;

import F.d;
import H5.AbstractC0398i;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import o5.AbstractC1956k;
import z5.InterfaceC2279a;

/* JADX INFO: loaded from: classes.dex */
public final class x implements com.google.firebase.sessions.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f2414f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final InterfaceC2279a f2415g = E.a.b(w.f2410a.a(), new D.b(b.f2423m), null, null, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1888g f2417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f2418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K5.b f2419e;

    static final class a extends AbstractC1956k implements v5.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2420q;

        /* JADX INFO: renamed from: N4.x$a$a, reason: collision with other inner class name */
        static final class C0046a implements K5.c {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ x f2422m;

            C0046a(x xVar) {
                this.f2422m = xVar;
            }

            @Override // K5.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(l lVar, InterfaceC1885d interfaceC1885d) {
                this.f2422m.f2418d.set(lVar);
                return i5.u.f19985a;
            }
        }

        a(InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            return x.this.new a(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            Object objC = AbstractC1930b.c();
            int i7 = this.f2420q;
            if (i7 == 0) {
                i5.n.b(obj);
                K5.b bVar = x.this.f2419e;
                C0046a c0046a = new C0046a(x.this);
                this.f2420q = 1;
                if (bVar.a(c0046a, this) == objC) {
                    return objC;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5.n.b(obj);
            }
            return i5.u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(H5.I i7, InterfaceC1885d interfaceC1885d) {
            return ((a) d(i7, interfaceC1885d)).s(i5.u.f19985a);
        }
    }

    static final class b extends w5.l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f2423m = new b();

        b() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F.d i(C.a aVar) {
            w5.k.f(aVar, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + v.f2409a.e() + '.', aVar);
            return F.e.a();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ D5.g[] f2424a = {w5.w.e(new w5.q(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C.f b(Context context) {
            return (C.f) x.f2415g.a(context, f2424a[0]);
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f2425a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final d.a f2426b = F.f.f("session_id");

        private d() {
        }

        public final d.a a() {
            return f2426b;
        }
    }

    static final class e extends AbstractC1956k implements v5.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2427q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f2428r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f2429s;

        e(InterfaceC1885d interfaceC1885d) {
            super(3, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            Object objC = AbstractC1930b.c();
            int i7 = this.f2427q;
            if (i7 == 0) {
                i5.n.b(obj);
                K5.c cVar = (K5.c) this.f2428r;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f2429s);
                F.d dVarA = F.e.a();
                this.f2428r = null;
                this.f2427q = 1;
                if (cVar.b(dVarA, this) == objC) {
                    return objC;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5.n.b(obj);
            }
            return i5.u.f19985a;
        }

        @Override // v5.q
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object e(K5.c cVar, Throwable th, InterfaceC1885d interfaceC1885d) {
            e eVar = new e(interfaceC1885d);
            eVar.f2428r = cVar;
            eVar.f2429s = th;
            return eVar.s(i5.u.f19985a);
        }
    }

    public static final class f implements K5.b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ K5.b f2430m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ x f2431n;

        public static final class a implements K5.c {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ K5.c f2432m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ x f2433n;

            /* JADX INFO: renamed from: N4.x$f$a$a, reason: collision with other inner class name */
            public static final class C0047a extends AbstractC1949d {

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f2434p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f2435q;

                public C0047a(InterfaceC1885d interfaceC1885d) {
                    super(interfaceC1885d);
                }

                @Override // o5.AbstractC1946a
                public final Object s(Object obj) {
                    this.f2434p = obj;
                    this.f2435q |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(K5.c cVar, x xVar) {
                this.f2432m = cVar;
                this.f2433n = xVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // K5.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object b(Object obj, InterfaceC1885d interfaceC1885d) {
                C0047a c0047a;
                if (interfaceC1885d instanceof C0047a) {
                    c0047a = (C0047a) interfaceC1885d;
                    int i7 = c0047a.f2435q;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0047a.f2435q = i7 - Integer.MIN_VALUE;
                    } else {
                        c0047a = new C0047a(interfaceC1885d);
                    }
                }
                Object obj2 = c0047a.f2434p;
                Object objC = AbstractC1930b.c();
                int i8 = c0047a.f2435q;
                if (i8 == 0) {
                    i5.n.b(obj2);
                    K5.c cVar = this.f2432m;
                    l lVarI = this.f2433n.i((F.d) obj);
                    c0047a.f2435q = 1;
                    if (cVar.b(lVarI, c0047a) == objC) {
                        return objC;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj2);
                }
                return i5.u.f19985a;
            }
        }

        public f(K5.b bVar, x xVar) {
            this.f2430m = bVar;
            this.f2431n = xVar;
        }

        @Override // K5.b
        public Object a(K5.c cVar, InterfaceC1885d interfaceC1885d) {
            Object objA = this.f2430m.a(new a(cVar, this.f2431n), interfaceC1885d);
            return objA == AbstractC1930b.c() ? objA : i5.u.f19985a;
        }
    }

    static final class g extends AbstractC1956k implements v5.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2437q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f2439s;

        static final class a extends AbstractC1956k implements v5.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2440q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f2441r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ String f2442s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, InterfaceC1885d interfaceC1885d) {
                super(2, interfaceC1885d);
                this.f2442s = str;
            }

            @Override // o5.AbstractC1946a
            public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
                a aVar = new a(this.f2442s, interfaceC1885d);
                aVar.f2441r = obj;
                return aVar;
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                AbstractC1930b.c();
                if (this.f2440q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5.n.b(obj);
                ((F.a) this.f2441r).i(d.f2425a.a(), this.f2442s);
                return i5.u.f19985a;
            }

            @Override // v5.p
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public final Object m(F.a aVar, InterfaceC1885d interfaceC1885d) {
                return ((a) d(aVar, interfaceC1885d)).s(i5.u.f19985a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
            this.f2439s = str;
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            return x.this.new g(this.f2439s, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            Object objC = AbstractC1930b.c();
            int i7 = this.f2437q;
            try {
                if (i7 == 0) {
                    i5.n.b(obj);
                    C.f fVarB = x.f2414f.b(x.this.f2416b);
                    a aVar = new a(this.f2439s, null);
                    this.f2437q = 1;
                    if (F.g.a(fVarB, aVar, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                }
            } catch (IOException e7) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e7);
            }
            return i5.u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(H5.I i7, InterfaceC1885d interfaceC1885d) {
            return ((g) d(i7, interfaceC1885d)).s(i5.u.f19985a);
        }
    }

    public x(Context context, InterfaceC1888g interfaceC1888g) {
        w5.k.f(context, "context");
        w5.k.f(interfaceC1888g, "backgroundDispatcher");
        this.f2416b = context;
        this.f2417c = interfaceC1888g;
        this.f2418d = new AtomicReference();
        this.f2419e = new f(K5.d.a(f2414f.b(context).getData(), new e(null)), this);
        AbstractC0398i.d(H5.J.a(interfaceC1888g), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l i(F.d dVar) {
        return new l((String) dVar.b(d.f2425a.a()));
    }

    @Override // com.google.firebase.sessions.a
    public String a() {
        l lVar = (l) this.f2418d.get();
        if (lVar != null) {
            return lVar.a();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.a
    public void b(String str) {
        w5.k.f(str, "sessionId");
        AbstractC0398i.d(H5.J.a(this.f2417c), null, null, new g(str, null), 3, null);
    }
}
