package P4;

import G5.a;
import N4.A;
import N4.C0440b;
import N4.v;
import N4.w;
import Y3.m;
import android.content.Context;
import android.util.Log;
import i5.n;
import i5.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import w5.k;
import w5.l;
import w5.q;
import z5.InterfaceC2279a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f2672c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final InterfaceC2279a f2673d = E.a.b(w.f2410a.b(), new D.b(a.f2676m), null, null, 12, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f2674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f2675b;

    static final class a extends l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f2676m = new a();

        a() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F.d i(C.a aVar) {
            k.f(aVar, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + v.f2409a.e() + '.', aVar);
            return F.e.a();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ D5.g[] f2677a = {w5.w.e(new q(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final C.f b(Context context) {
            return (C.f) f.f2673d.a(context, f2677a[0]);
        }

        public final f c() {
            Object objK = m.a(Y3.c.f4433a).k(f.class);
            k.e(objK, "Firebase.app[SessionsSettings::class.java]");
            return (f) objK;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class c extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f2678p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f2679q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f2681s;

        c(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f2679q = obj;
            this.f2681s |= Integer.MIN_VALUE;
            return f.this.g(this);
        }
    }

    public f(h hVar, h hVar2) {
        k.f(hVar, "localOverrideSettings");
        k.f(hVar2, "remoteSettings");
        this.f2674a = hVar;
        this.f2675b = hVar2;
    }

    private final boolean e(double d7) {
        return 0.0d <= d7 && d7 <= 1.0d;
    }

    private final boolean f(long j7) {
        return G5.a.F(j7) && G5.a.A(j7);
    }

    public final double b() {
        Double dC = this.f2674a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (e(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f2675b.c();
        if (dC2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dC2.doubleValue();
        if (e(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        G5.a aVarB = this.f2674a.b();
        if (aVarB != null) {
            long J6 = aVarB.J();
            if (f(J6)) {
                return J6;
            }
        }
        G5.a aVarB2 = this.f2675b.b();
        if (aVarB2 != null) {
            long J7 = aVarB2.J();
            if (f(J7)) {
                return J7;
            }
        }
        a.C0020a c0020a = G5.a.f1268n;
        return G5.c.h(30, G5.d.f1279r);
    }

    public final boolean d() {
        Boolean boolA = this.f2674a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.f2675b.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(InterfaceC1885d interfaceC1885d) {
        c cVar;
        f fVar;
        if (interfaceC1885d instanceof c) {
            cVar = (c) interfaceC1885d;
            int i7 = cVar.f2681s;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                cVar.f2681s = i7 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC1885d);
            }
        }
        Object obj = cVar.f2679q;
        Object objC = AbstractC1930b.c();
        int i8 = cVar.f2681s;
        if (i8 == 0) {
            n.b(obj);
            h hVar = this.f2674a;
            cVar.f2678p = this;
            cVar.f2681s = 1;
            if (hVar.d(cVar) == objC) {
                return objC;
            }
            fVar = this;
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
                return u.f19985a;
            }
            fVar = (f) cVar.f2678p;
            n.b(obj);
        }
        h hVar2 = fVar.f2675b;
        cVar.f2678p = null;
        cVar.f2681s = 2;
        if (hVar2.d(cVar) == objC) {
            return objC;
        }
        return u.f19985a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Y3.f fVar, InterfaceC1888g interfaceC1888g, InterfaceC1888g interfaceC1888g2, E4.e eVar) {
        k.f(fVar, "firebaseApp");
        k.f(interfaceC1888g, "blockingDispatcher");
        k.f(interfaceC1888g2, "backgroundDispatcher");
        k.f(eVar, "firebaseInstallationsApi");
        Context contextM = fVar.m();
        k.e(contextM, "firebaseApp.applicationContext");
        this(contextM, interfaceC1888g, interfaceC1888g2, eVar, A.f2270a.b(fVar));
    }

    private f(Context context, InterfaceC1888g interfaceC1888g, InterfaceC1888g interfaceC1888g2, E4.e eVar, C0440b c0440b) {
        this(new P4.b(context), new P4.c(interfaceC1888g2, eVar, c0440b, new d(c0440b, interfaceC1888g, null, 4, null), f2672c.b(context)));
    }
}
