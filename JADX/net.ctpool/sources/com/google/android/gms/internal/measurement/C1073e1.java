package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import v3.C2169a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1073e1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile C1073e1 f14558j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Clock f14560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f14561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2169a f14562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f14563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f14566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile P0 f14567i;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1$a */
    abstract class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final long f14568m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final long f14569n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final boolean f14570o;

        a(C1073e1 c1073e1) {
            this(true);
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1073e1.this.f14565g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e7) {
                C1073e1.this.r(e7, false, this.f14570o);
                b();
            }
        }

        a(boolean z6) {
            this.f14568m = C1073e1.this.f14560b.currentTimeMillis();
            this.f14569n = C1073e1.this.f14560b.elapsedRealtime();
            this.f14570o = z6;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1$b */
    static class b extends Y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w3.v f14572a;

        b(w3.v vVar) {
            this.f14572a = vVar;
        }

        @Override // com.google.android.gms.internal.measurement.V0
        public final void L(String str, String str2, Bundle bundle, long j7) {
            this.f14572a.a(str, str2, bundle, j7);
        }

        @Override // com.google.android.gms.internal.measurement.V0
        public final int a() {
            return System.identityHashCode(this.f14572a);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1$c */
    class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C1073e1.this.m(new I1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C1073e1.this.m(new N1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C1073e1.this.m(new M1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C1073e1.this.m(new J1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Q0 q02 = new Q0();
            C1073e1.this.m(new O1(this, activity, q02));
            Bundle bundleJ0 = q02.j0(50L);
            if (bundleJ0 != null) {
                bundle.putAll(bundleJ0);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C1073e1.this.m(new K1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C1073e1.this.m(new L1(this, activity));
        }
    }

    private C1073e1(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f14559a = (str == null || !J(str2, str3)) ? "FA" : str;
        this.f14560b = DefaultClock.getInstance();
        this.f14561c = I0.a().a(new ThreadFactoryC1181q1(this), 1);
        this.f14562d = new C2169a(this);
        this.f14563e = new ArrayList();
        if (E(context) && !S()) {
            this.f14566h = null;
            this.f14565g = true;
            Log.w(this.f14559a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (J(str2, str3)) {
            this.f14566h = str2;
        } else {
            this.f14566h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f14559a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f14559a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        m(new C1064d1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f14559a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
    }

    private static boolean E(Context context) {
        return new w3.p(context, w3.p.a(context)).b("google_app_id") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean J(String str, String str2) {
        return (str2 == null || str == null || S()) ? false : true;
    }

    private final boolean S() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static C1073e1 e(Context context) {
        return f(context, null, null, null, null);
    }

    public static C1073e1 f(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f14558j == null) {
            synchronized (C1073e1.class) {
                try {
                    if (f14558j == null) {
                        f14558j = new C1073e1(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f14558j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(a aVar) {
        this.f14561c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Exception exc, boolean z6, boolean z7) {
        this.f14565g |= z6;
        if (z6) {
            Log.w(this.f14559a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z7) {
            i(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f14559a, "Error with data collection. Data lost.", exc);
    }

    private final void u(String str, String str2, Bundle bundle, boolean z6, boolean z7, Long l7) {
        m(new H1(this, l7, str, str2, bundle, z6, z7));
    }

    public final C2169a A() {
        return this.f14562d;
    }

    public final void B(String str) {
        m(new C1198s1(this, str));
    }

    public final void C(String str, String str2) {
        v(null, str, str2, false);
    }

    public final void D(String str, String str2, Bundle bundle) {
        u(str, str2, bundle, true, true, null);
    }

    public final Long F() {
        Q0 q02 = new Q0();
        m(new B1(this, q02));
        return q02.l0(120000L);
    }

    public final void G(Bundle bundle) {
        m(new C1163o1(this, bundle));
    }

    public final void H(String str) {
        m(new C1189r1(this, str));
    }

    public final void K(Bundle bundle) {
        m(new F1(this, bundle));
    }

    public final void L(String str) {
        m(new C1136l1(this, str));
    }

    public final String M() {
        Q0 q02 = new Q0();
        m(new C1(this, q02));
        return q02.m0(120000L);
    }

    public final String N() {
        Q0 q02 = new Q0();
        m(new C1207t1(this, q02));
        return q02.m0(50L);
    }

    public final String O() {
        Q0 q02 = new Q0();
        m(new C1249y1(this, q02));
        return q02.m0(500L);
    }

    public final String P() {
        Q0 q02 = new Q0();
        m(new C1225v1(this, q02));
        return q02.m0(500L);
    }

    public final String Q() {
        Q0 q02 = new Q0();
        m(new C1216u1(this, q02));
        return q02.m0(500L);
    }

    public final void R() {
        m(new C1154n1(this));
    }

    public final int a(String str) {
        Q0 q02 = new Q0();
        m(new A1(this, str, q02));
        Integer num = (Integer) Q0.k0(q02.j0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        Q0 q02 = new Q0();
        m(new C1233w1(this, q02));
        Long lL0 = q02.l0(500L);
        if (lL0 != null) {
            return lL0.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f14560b.currentTimeMillis()).nextLong();
        int i7 = this.f14564f + 1;
        this.f14564f = i7;
        return jNextLong + ((long) i7);
    }

    protected final P0 c(Context context, boolean z6) {
        try {
            return S0.asInterface(DynamiteModule.d(context, DynamiteModule.f13757e, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e7) {
            r(e7, true, false);
            return null;
        }
    }

    public final List g(String str, String str2) {
        Q0 q02 = new Q0();
        m(new C1109i1(this, str, str2, q02));
        List list = (List) Q0.k0(q02.j0(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map h(String str, String str2, boolean z6) {
        Q0 q02 = new Q0();
        m(new C1241x1(this, str, str2, z6, q02));
        Bundle bundleJ0 = q02.j0(5000L);
        if (bundleJ0 == null || bundleJ0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleJ0.size());
        for (String str3 : bundleJ0.keySet()) {
            Object obj = bundleJ0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void i(int i7, String str, Object obj, Object obj2, Object obj3) {
        m(new C1257z1(this, false, 5, str, obj, null, null));
    }

    public final void j(long j7) {
        m(new C1172p1(this, j7));
    }

    public final void k(Activity activity, String str, String str2) {
        m(new C1127k1(this, activity, str, str2));
    }

    public final void l(Bundle bundle) {
        m(new C1082f1(this, bundle));
    }

    public final void q(Boolean bool) {
        m(new C1145m1(this, bool));
    }

    public final void s(String str, Bundle bundle) {
        u(null, str, bundle, false, true, null);
    }

    public final void t(String str, String str2, Bundle bundle) {
        m(new C1118j1(this, str, str2, bundle));
    }

    public final void v(String str, String str2, Object obj, boolean z6) {
        m(new C1100h1(this, str, str2, obj, z6));
    }

    public final void w(w3.v vVar) {
        Preconditions.checkNotNull(vVar);
        synchronized (this.f14563e) {
            for (int i7 = 0; i7 < this.f14563e.size(); i7++) {
                try {
                    if (vVar.equals(((Pair) this.f14563e.get(i7)).first)) {
                        Log.w(this.f14559a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b bVar = new b(vVar);
            this.f14563e.add(new Pair(vVar, bVar));
            if (this.f14567i != null) {
                try {
                    this.f14567i.registerOnMeasurementEventListener(bVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f14559a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m(new G1(this, bVar));
        }
    }

    public final void x(boolean z6) {
        m(new D1(this, z6));
    }
}
