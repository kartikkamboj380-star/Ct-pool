package P4;

import G5.a;
import N4.C0440b;
import N4.s;
import android.os.Build;
import android.util.Log;
import i5.n;
import i5.q;
import i5.u;
import j5.AbstractC1787F;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1947b;
import o5.AbstractC1949d;
import o5.AbstractC1956k;
import org.json.JSONException;
import org.json.JSONObject;
import v5.InterfaceC2171a;
import v5.p;
import w5.k;
import w5.l;
import w5.v;
import w5.y;

/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f2638g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1888g f2639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E4.e f2640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0440b f2641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P4.a f2642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f2643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q5.a f2644f;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C.f f2645m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C.f fVar) {
            super(0);
            this.f2645m = fVar;
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(this.f2645m);
        }
    }

    /* JADX INFO: renamed from: P4.c$c, reason: collision with other inner class name */
    static final class C0055c extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f2646p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f2647q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f2648r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f2650t;

        C0055c(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f2648r = obj;
            this.f2650t |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    static final class d extends AbstractC1956k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f2651q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f2652r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f2653s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f2654t;

        d(InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            d dVar = c.this.new d(interfaceC1885d);
            dVar.f2654t = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0195 A[RETURN] */
        @Override // o5.AbstractC1946a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object s(Object obj) throws JSONException {
            v vVar;
            Boolean bool;
            v vVar2;
            v vVar3;
            v vVar4;
            v vVar5;
            u uVar;
            g gVarF;
            Long lC;
            Object objC = AbstractC1930b.c();
            switch (this.f2653s) {
                case 0:
                    n.b(obj);
                    JSONObject jSONObject = (JSONObject) this.f2654t;
                    Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                    v vVar6 = new v();
                    vVar = new v();
                    v vVar7 = new v();
                    if (jSONObject.has("app_quality")) {
                        Object obj2 = jSONObject.get("app_quality");
                        k.d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        try {
                            bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        } catch (JSONException e7) {
                            e = e7;
                            bool = null;
                        }
                        try {
                            if (jSONObject2.has("sampling_rate")) {
                                vVar6.f22740m = (Double) jSONObject2.get("sampling_rate");
                            }
                            if (jSONObject2.has("session_timeout_seconds")) {
                                vVar.f22740m = (Integer) jSONObject2.get("session_timeout_seconds");
                            }
                            if (jSONObject2.has("cache_duration")) {
                                vVar7.f22740m = (Integer) jSONObject2.get("cache_duration");
                            }
                        } catch (JSONException e8) {
                            e = e8;
                            Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                        }
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        g gVarF2 = c.this.f();
                        this.f2654t = vVar6;
                        this.f2651q = vVar;
                        this.f2652r = vVar7;
                        this.f2653s = 1;
                        if (gVarF2.n(bool, this) == objC) {
                            return objC;
                        }
                        vVar4 = vVar6;
                        vVar5 = vVar;
                        vVar3 = vVar7;
                        vVar = vVar5;
                        vVar2 = vVar4;
                        if (((Integer) vVar.f22740m) != null) {
                            g gVarF3 = c.this.f();
                            Integer num = (Integer) vVar.f22740m;
                            this.f2654t = vVar2;
                            this.f2651q = vVar3;
                            this.f2652r = null;
                            this.f2653s = 2;
                            if (gVarF3.m(num, this) == objC) {
                                return objC;
                            }
                        }
                        if (((Double) vVar2.f22740m) != null) {
                            g gVarF4 = c.this.f();
                            Double d7 = (Double) vVar2.f22740m;
                            this.f2654t = vVar3;
                            this.f2651q = null;
                            this.f2652r = null;
                            this.f2653s = 3;
                            if (gVarF4.i(d7, this) == objC) {
                                return objC;
                            }
                        }
                        if (((Integer) vVar3.f22740m) == null) {
                            uVar = null;
                            if (uVar == null) {
                            }
                            gVarF = c.this.f();
                            lC = AbstractC1947b.c(System.currentTimeMillis());
                            this.f2654t = null;
                            this.f2651q = null;
                            this.f2652r = null;
                            this.f2653s = 6;
                            if (gVarF.k(lC, this) == objC) {
                            }
                            return u.f19985a;
                        }
                        g gVarF5 = c.this.f();
                        Integer num2 = (Integer) vVar3.f22740m;
                        this.f2654t = null;
                        this.f2651q = null;
                        this.f2652r = null;
                        this.f2653s = 4;
                        if (gVarF5.j(num2, this) == objC) {
                            return objC;
                        }
                        uVar = u.f19985a;
                        if (uVar == null) {
                            g gVarF6 = c.this.f();
                            Integer numB = AbstractC1947b.b(86400);
                            this.f2654t = null;
                            this.f2651q = null;
                            this.f2652r = null;
                            this.f2653s = 5;
                            if (gVarF6.j(numB, this) == objC) {
                                return objC;
                            }
                        }
                        gVarF = c.this.f();
                        lC = AbstractC1947b.c(System.currentTimeMillis());
                        this.f2654t = null;
                        this.f2651q = null;
                        this.f2652r = null;
                        this.f2653s = 6;
                        if (gVarF.k(lC, this) == objC) {
                            return objC;
                        }
                        return u.f19985a;
                    }
                    vVar2 = vVar6;
                    vVar3 = vVar7;
                    if (((Integer) vVar.f22740m) != null) {
                    }
                    if (((Double) vVar2.f22740m) != null) {
                    }
                    if (((Integer) vVar3.f22740m) == null) {
                    }
                    break;
                case 1:
                    vVar3 = (v) this.f2652r;
                    vVar5 = (v) this.f2651q;
                    vVar4 = (v) this.f2654t;
                    n.b(obj);
                    vVar = vVar5;
                    vVar2 = vVar4;
                    if (((Integer) vVar.f22740m) != null) {
                    }
                    if (((Double) vVar2.f22740m) != null) {
                    }
                    if (((Integer) vVar3.f22740m) == null) {
                    }
                    break;
                case 2:
                    vVar3 = (v) this.f2651q;
                    vVar2 = (v) this.f2654t;
                    n.b(obj);
                    if (((Double) vVar2.f22740m) != null) {
                    }
                    if (((Integer) vVar3.f22740m) == null) {
                    }
                    break;
                case 3:
                    vVar3 = (v) this.f2654t;
                    n.b(obj);
                    if (((Integer) vVar3.f22740m) == null) {
                    }
                    break;
                case 4:
                    n.b(obj);
                    uVar = u.f19985a;
                    if (uVar == null) {
                    }
                    gVarF = c.this.f();
                    lC = AbstractC1947b.c(System.currentTimeMillis());
                    this.f2654t = null;
                    this.f2651q = null;
                    this.f2652r = null;
                    this.f2653s = 6;
                    if (gVarF.k(lC, this) == objC) {
                    }
                    return u.f19985a;
                case 5:
                    n.b(obj);
                    gVarF = c.this.f();
                    lC = AbstractC1947b.c(System.currentTimeMillis());
                    this.f2654t = null;
                    this.f2651q = null;
                    this.f2652r = null;
                    this.f2653s = 6;
                    if (gVarF.k(lC, this) == objC) {
                    }
                    return u.f19985a;
                case 6:
                    n.b(obj);
                    return u.f19985a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(JSONObject jSONObject, InterfaceC1885d interfaceC1885d) {
            return ((d) d(jSONObject, interfaceC1885d)).s(u.f19985a);
        }
    }

    static final class e extends AbstractC1956k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2656q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f2657r;

        e(InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            e eVar = new e(interfaceC1885d);
            eVar.f2657r = obj;
            return eVar;
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            AbstractC1930b.c();
            if (this.f2656q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f2657r));
            return u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object m(String str, InterfaceC1885d interfaceC1885d) {
            return ((e) d(str, interfaceC1885d)).s(u.f19985a);
        }
    }

    public c(InterfaceC1888g interfaceC1888g, E4.e eVar, C0440b c0440b, P4.a aVar, C.f fVar) {
        k.f(interfaceC1888g, "backgroundDispatcher");
        k.f(eVar, "firebaseInstallationsApi");
        k.f(c0440b, "appInfo");
        k.f(aVar, "configsFetcher");
        k.f(fVar, "dataStore");
        this.f2639a = interfaceC1888g;
        this.f2640b = eVar;
        this.f2641c = c0440b;
        this.f2642d = aVar;
        this.f2643e = i5.g.b(new b(fVar));
        this.f2644f = Q5.c.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g f() {
        return (g) this.f2643e.getValue();
    }

    private final String g(String str) {
        return new F5.f("/").b(str, "");
    }

    @Override // P4.h
    public Boolean a() {
        return f().g();
    }

    @Override // P4.h
    public G5.a b() {
        Integer numE = f().e();
        if (numE == null) {
            return null;
        }
        a.C0020a c0020a = G5.a.f1268n;
        return G5.a.h(G5.c.h(numE.intValue(), G5.d.f1278q));
    }

    @Override // P4.h
    public Double c() {
        return f().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b7, B:49:0x00c5, B:52:0x00d0), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b7, B:49:0x00c5, B:52:0x00d0), top: B:64:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // P4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(InterfaceC1885d interfaceC1885d) throws Throwable {
        C0055c c0055c;
        Q5.a aVar;
        c cVar;
        Q5.a aVar2;
        Throwable th;
        Q5.a aVar3;
        String strB;
        if (interfaceC1885d instanceof C0055c) {
            c0055c = (C0055c) interfaceC1885d;
            int i7 = c0055c.f2650t;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0055c.f2650t = i7 - Integer.MIN_VALUE;
            } else {
                c0055c = new C0055c(interfaceC1885d);
            }
        }
        Object obj = c0055c.f2648r;
        Object objC = AbstractC1930b.c();
        int i8 = c0055c.f2650t;
        try {
            if (i8 == 0) {
                n.b(obj);
                if (!this.f2644f.b() && !f().d()) {
                    return u.f19985a;
                }
                aVar = this.f2644f;
                c0055c.f2646p = this;
                c0055c.f2647q = aVar;
                c0055c.f2650t = 1;
                if (aVar.a(null, c0055c) == objC) {
                    return objC;
                }
                cVar = this;
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (Q5.a) c0055c.f2646p;
                        try {
                            n.b(obj);
                            u uVar = u.f19985a;
                            aVar2.c(null);
                            return u.f19985a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.c(null);
                            throw th;
                        }
                    }
                    aVar3 = (Q5.a) c0055c.f2647q;
                    cVar = (c) c0055c.f2646p;
                    try {
                        n.b(obj);
                        strB = ((s) obj).b();
                        if (!k.b(strB, "")) {
                            Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            u uVar2 = u.f19985a;
                            aVar3.c(null);
                            return uVar2;
                        }
                        i5.l lVarA = q.a("X-Crashlytics-Installation-ID", strB);
                        y yVar = y.f22743a;
                        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                        k.e(str, "format(format, *args)");
                        i5.l lVarA2 = q.a("X-Crashlytics-Device-Model", cVar.g(str));
                        String str2 = Build.VERSION.INCREMENTAL;
                        k.e(str2, "INCREMENTAL");
                        i5.l lVarA3 = q.a("X-Crashlytics-OS-Build-Version", cVar.g(str2));
                        String str3 = Build.VERSION.RELEASE;
                        k.e(str3, "RELEASE");
                        Map mapI = AbstractC1787F.i(lVarA, lVarA2, lVarA3, q.a("X-Crashlytics-OS-Display-Version", cVar.g(str3)), q.a("X-Crashlytics-API-Client-Version", cVar.f2641c.f()));
                        Log.d("SessionConfigFetcher", "Fetching settings from server.");
                        P4.a aVar4 = cVar.f2642d;
                        d dVar = cVar.new d(null);
                        e eVar = new e(null);
                        c0055c.f2646p = aVar3;
                        c0055c.f2647q = null;
                        c0055c.f2650t = 3;
                        if (aVar4.a(mapI, dVar, eVar, c0055c) == objC) {
                            return objC;
                        }
                        aVar2 = aVar3;
                        u uVar3 = u.f19985a;
                        aVar2.c(null);
                        return u.f19985a;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = aVar3;
                        aVar2.c(null);
                        throw th;
                    }
                }
                Q5.a aVar5 = (Q5.a) c0055c.f2647q;
                cVar = (c) c0055c.f2646p;
                n.b(obj);
                aVar = aVar5;
            }
            if (!cVar.f().d()) {
                Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                u uVar4 = u.f19985a;
                aVar.c(null);
                return uVar4;
            }
            s.a aVar6 = s.f2392c;
            E4.e eVar2 = cVar.f2640b;
            c0055c.f2646p = cVar;
            c0055c.f2647q = aVar;
            c0055c.f2650t = 2;
            Object objA = aVar6.a(eVar2, c0055c);
            if (objA == objC) {
                return objC;
            }
            aVar3 = aVar;
            obj = objA;
            strB = ((s) obj).b();
            if (!k.b(strB, "")) {
            }
        } catch (Throwable th4) {
            aVar2 = aVar;
            th = th4;
            aVar2.c(null);
            throw th;
        }
    }
}
