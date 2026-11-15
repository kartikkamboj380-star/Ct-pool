package P4;

import F.d;
import H5.AbstractC0396h;
import H5.I;
import android.util.Log;
import i5.n;
import i5.u;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import o5.AbstractC1956k;
import v5.p;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f2682c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d.a f2683d = F.f.a("firebase_sessions_enabled");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d.a f2684e = F.f.b("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d.a f2685f = F.f.d("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d.a f2686g = F.f.d("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d.a f2687h = F.f.e("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.f f2688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f2689b;

    static final class a extends AbstractC1956k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f2690q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f2691r;

        a(InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            return g.this.new a(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            g gVar;
            Object objC = AbstractC1930b.c();
            int i7 = this.f2691r;
            if (i7 == 0) {
                n.b(obj);
                g gVar2 = g.this;
                K5.b data = gVar2.f2688a.getData();
                this.f2690q = gVar2;
                this.f2691r = 1;
                Object objF = K5.d.f(data, this);
                if (objF == objC) {
                    return objC;
                }
                gVar = gVar2;
                obj = objF;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) this.f2690q;
                n.b(obj);
            }
            gVar.l(((F.d) obj).d());
            return u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(I i7, InterfaceC1885d interfaceC1885d) {
            return ((a) d(i7, interfaceC1885d)).s(u.f19985a);
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class c extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f2693p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f2695r;

        c(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f2693p = obj;
            this.f2695r |= Integer.MIN_VALUE;
            return g.this.h(null, null, this);
        }
    }

    static final class d extends AbstractC1956k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2696q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f2697r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f2698s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ d.a f2699t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ g f2700u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, d.a aVar, g gVar, InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
            this.f2698s = obj;
            this.f2699t = aVar;
            this.f2700u = gVar;
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            d dVar = new d(this.f2698s, this.f2699t, this.f2700u, interfaceC1885d);
            dVar.f2697r = obj;
            return dVar;
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            AbstractC1930b.c();
            if (this.f2696q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            F.a aVar = (F.a) this.f2697r;
            Object obj2 = this.f2698s;
            if (obj2 != null) {
                aVar.i(this.f2699t, obj2);
            } else {
                aVar.h(this.f2699t);
            }
            this.f2700u.l(aVar);
            return u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(F.a aVar, InterfaceC1885d interfaceC1885d) {
            return ((d) d(aVar, interfaceC1885d)).s(u.f19985a);
        }
    }

    public g(C.f fVar) {
        k.f(fVar, "dataStore");
        this.f2688a = fVar;
        AbstractC0396h.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(d.a aVar, Object obj, InterfaceC1885d interfaceC1885d) {
        c cVar;
        if (interfaceC1885d instanceof c) {
            cVar = (c) interfaceC1885d;
            int i7 = cVar.f2695r;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar.f2695r = i7 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC1885d);
            }
        }
        Object obj2 = cVar.f2693p;
        Object objC = AbstractC1930b.c();
        int i8 = cVar.f2695r;
        try {
            if (i8 == 0) {
                n.b(obj2);
                C.f fVar = this.f2688a;
                d dVar = new d(obj, aVar, this, null);
                cVar.f2695r = 1;
                if (F.g.a(fVar, dVar, cVar) == objC) {
                    return objC;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj2);
            }
        } catch (IOException e7) {
            Log.w("SettingsCache", "Failed to update cache config value: " + e7);
        }
        return u.f19985a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(F.d dVar) {
        this.f2689b = new e((Boolean) dVar.b(f2683d), (Double) dVar.b(f2684e), (Integer) dVar.b(f2685f), (Integer) dVar.b(f2686g), (Long) dVar.b(f2687h));
    }

    public final boolean d() {
        e eVar = this.f2689b;
        e eVar2 = null;
        if (eVar == null) {
            k.t("sessionConfigs");
            eVar = null;
        }
        Long lB = eVar.b();
        e eVar3 = this.f2689b;
        if (eVar3 == null) {
            k.t("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        Integer numA = eVar2.a();
        return lB == null || numA == null || (System.currentTimeMillis() - lB.longValue()) / ((long) 1000) >= ((long) numA.intValue());
    }

    public final Integer e() {
        e eVar = this.f2689b;
        if (eVar == null) {
            k.t("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final Double f() {
        e eVar = this.f2689b;
        if (eVar == null) {
            k.t("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final Boolean g() {
        e eVar = this.f2689b;
        if (eVar == null) {
            k.t("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    public final Object i(Double d7, InterfaceC1885d interfaceC1885d) {
        Object objH = h(f2684e, d7, interfaceC1885d);
        return objH == AbstractC1930b.c() ? objH : u.f19985a;
    }

    public final Object j(Integer num, InterfaceC1885d interfaceC1885d) {
        Object objH = h(f2686g, num, interfaceC1885d);
        return objH == AbstractC1930b.c() ? objH : u.f19985a;
    }

    public final Object k(Long l7, InterfaceC1885d interfaceC1885d) {
        Object objH = h(f2687h, l7, interfaceC1885d);
        return objH == AbstractC1930b.c() ? objH : u.f19985a;
    }

    public final Object m(Integer num, InterfaceC1885d interfaceC1885d) {
        Object objH = h(f2685f, num, interfaceC1885d);
        return objH == AbstractC1930b.c() ? objH : u.f19985a;
    }

    public final Object n(Boolean bool, InterfaceC1885d interfaceC1885d) {
        Object objH = h(f2683d, bool, interfaceC1885d);
        return objH == AbstractC1930b.c() ? objH : u.f19985a;
    }
}
