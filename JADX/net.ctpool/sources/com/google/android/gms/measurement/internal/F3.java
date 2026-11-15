package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.C1168o6;
import com.google.android.gms.internal.measurement.C1195r7;
import com.google.android.gms.internal.measurement.y7;
import com.google.android.gms.measurement.internal.A3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import n.C1890a;
import w3.C2191b;

/* JADX INFO: loaded from: classes.dex */
public final class F3 extends AbstractC1525y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1451n4 f15428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w3.w f15429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f15430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f15432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f15433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f15434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AbstractC1487t f15436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PriorityQueue f15437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private A3 f15439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicLong f15440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f15441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final i6 f15442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f15443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AbstractC1487t f15444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f15445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AbstractC1487t f15446u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final c6 f15447v;

    protected F3(S2 s22) {
        super(s22);
        this.f15430e = new CopyOnWriteArraySet();
        this.f15433h = new Object();
        this.f15434i = false;
        this.f15435j = 1;
        this.f15443r = true;
        this.f15447v = new C1395f4(this);
        this.f15432g = new AtomicReference();
        this.f15439n = A3.f15351c;
        this.f15441p = -1L;
        this.f15440o = new AtomicLong(0L);
        this.f15442q = new i6(s22);
    }

    static /* synthetic */ int A(F3 f32, Throwable th) {
        String message = th.getMessage();
        f32.f15438m = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (message.contains("Background")) {
            f32.f15438m = true;
        }
        return 1;
    }

    public static int C(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0() {
        l();
        String strA = g().f16382o.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                g0("app", "_npa", null, zzb().currentTimeMillis());
            } else {
                g0("app", "_npa", Long.valueOf("true".equals(strA) ? 1L : 0L), zzb().currentTimeMillis());
            }
        }
        if (!this.f16325a.n() || !this.f15443r) {
            d().D().a("Updating Scion state (FE)");
            r().d0();
        } else {
            d().D().a("Recording app launch after enabling measurement for the first time (FE)");
            A0();
            s().f16240e.a();
            f().B(new S3(this));
        }
    }

    private final void L(Bundle bundle, int i7, long j7) {
        t();
        String strH = A3.h(bundle);
        if (strH != null) {
            d().K().b("Ignoring invalid consent setting", strH);
            d().K().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zH = f().H();
        A3 a3C = A3.c(bundle, i7);
        if (a3C.A()) {
            Q(a3C, j7, zH);
        }
        C1501v c1501vB = C1501v.b(bundle, i7);
        if (c1501vB.k()) {
            O(c1501vB, zH);
        }
        Boolean boolE = C1501v.e(bundle);
        if (boolE != null) {
            String str = i7 == -30 ? "tcf" : "app";
            if (b().r(G.f15495T0) && zH) {
                g0(str, "allow_personalized_ads", boolE.toString(), j7);
            } else {
                i0(str, "allow_personalized_ads", boolE.toString(), false, j7);
            }
        }
    }

    static /* synthetic */ void N0(F3 f32, int i7) {
        if (f32.f15436k == null) {
            f32.f15436k = new Q3(f32, f32.f16325a);
        }
        f32.f15436k.b(i7 * 1000);
    }

    static /* synthetic */ void O0(F3 f32, Bundle bundle) {
        f32.l();
        f32.t();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        Preconditions.checkNotNull(bundle.get("value"));
        if (!f32.f16325a.n()) {
            f32.d().I().a("Conditional property not set since app measurement is disabled");
            return;
        }
        Y5 y52 = new Y5(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            E eF = f32.h().F(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            f32.r().F(new C1383e(bundle.getString("app_id"), string2, y52, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), f32.h().F(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), eF, bundle.getLong("time_to_live"), f32.h().F(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void Q0(String str, String str2, long j7, Bundle bundle, boolean z6, boolean z7, boolean z8, String str3) {
        f().B(new X3(this, str, str2, j7, d6.B(bundle), z6, z7, z8, str3));
    }

    static /* synthetic */ void S(F3 f32, Bundle bundle) {
        f32.l();
        f32.t();
        Preconditions.checkNotNull(bundle);
        String strCheckNotEmpty = Preconditions.checkNotEmpty(bundle.getString("name"));
        if (!f32.f16325a.n()) {
            f32.d().I().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            f32.r().F(new C1383e(bundle.getString("app_id"), "", new Y5(strCheckNotEmpty, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean(AppStateModule.APP_STATE_ACTIVE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), f32.h().F(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void T(F3 f32, A3 a32, long j7, boolean z6, boolean z7) {
        f32.l();
        f32.t();
        A3 a3K = f32.g().K();
        if (j7 <= f32.f15441p && A3.l(a3K.b(), a32.b())) {
            f32.d().H().b("Dropped out-of-date consent setting, proposed settings", a32);
            return;
        }
        if (!f32.g().z(a32)) {
            f32.d().H().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(a32.b()));
            return;
        }
        f32.d().I().b("Setting storage consent(FE)", a32);
        f32.f15441p = j7;
        if (f32.r().h0()) {
            f32.r().m0(z6);
        } else {
            f32.r().S(z6);
        }
        if (z7) {
            f32.r().M(new AtomicReference());
        }
    }

    static /* synthetic */ void U(F3 f32, A3 a32, A3 a33) {
        if (C1168o6.a() && f32.b().r(G.f15505Y0)) {
            return;
        }
        A3.a aVar = A3.a.ANALYTICS_STORAGE;
        A3.a aVar2 = A3.a.AD_STORAGE;
        boolean zN = a32.n(a33, aVar, aVar2);
        boolean zS = a32.s(a33, aVar, aVar2);
        if (zN || zS) {
            f32.n().G();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(Boolean bool, boolean z6) {
        l();
        t();
        d().D().b("Setting app measurement enabled (FE)", bool);
        g().u(bool);
        if (z6) {
            g().C(bool);
        }
        if (this.f16325a.o() || !(bool == null || bool.booleanValue())) {
            I0();
        }
    }

    private final void c0(String str, String str2, long j7, Object obj) {
        f().B(new W3(this, str, str2, obj, j7));
    }

    public final void A0() {
        l();
        t();
        if (this.f16325a.q()) {
            Boolean boolC = b().C("google_analytics_deferred_deep_link_enabled");
            if (boolC != null && boolC.booleanValue()) {
                d().D().a("Deferred Deep Link feature enabled.");
                f().B(new Runnable() { // from class: w3.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22709m.D0();
                    }
                });
            }
            r().W();
            this.f15443r = false;
            String strO = g().O();
            if (TextUtils.isEmpty(strO)) {
                return;
            }
            c().n();
            if (strO.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strO);
            Z0("auto", "_ou", bundle);
        }
    }

    public final void B0() {
        if (!(a().getApplicationContext() instanceof Application) || this.f15428c == null) {
            return;
        }
        ((Application) a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f15428c);
    }

    final void C0() {
        if (C1195r7.a() && b().r(G.f15475J0)) {
            if (f().H()) {
                d().E().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C1369c.a()) {
                d().E().a("Cannot get trigger URIs from main thread");
                return;
            }
            t();
            d().I().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            f().t(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.G3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15575m.k0(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                d().E().a("Timed out waiting for get trigger URIs");
            } else {
                f().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.J3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15646m.j0(list);
                    }
                });
            }
        }
    }

    public final void D0() {
        l();
        if (g().f16389v.b()) {
            d().D().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = g().f16390w.a();
        g().f16390w.b(1 + jA);
        if (jA >= 5) {
            d().J().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            g().f16389v.a(true);
        } else {
            if (this.f15444s == null) {
                this.f15444s = new C1360a4(this, this.f16325a);
            }
            this.f15444s.b(0L);
        }
    }

    public final ArrayList E(String str, String str2) {
        if (f().H()) {
            d().E().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C1369c.a()) {
            d().E().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f16325a.f().t(atomicReference, 5000L, "get conditional user properties", new RunnableC1388e4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return d6.r0(list);
        }
        d().E().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final void E0() {
        l();
        d().D().a("Handle tcf update.");
        C1535z5 c1535z5C = C1535z5.c(g().F());
        d().I().b("Tcf preferences read", c1535z5C);
        if (g().A(c1535z5C)) {
            Bundle bundleB = c1535z5C.b();
            d().I().b("Consent generated from Tcf", bundleB);
            if (bundleB != Bundle.EMPTY) {
                L(bundleB, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", c1535z5C.e());
            Z0("auto", "_tcf", bundle);
        }
    }

    public final Map F(String str, String str2, boolean z6) {
        C1463p2 c1463p2E;
        String str3;
        if (f().H()) {
            c1463p2E = d().E();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!C1369c.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f16325a.f().t(atomicReference, 5000L, "get user properties", new RunnableC1381d4(this, atomicReference, null, str, str2, z6));
                List<Y5> list = (List) atomicReference.get();
                if (list == null) {
                    d().E().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z6));
                    return Collections.emptyMap();
                }
                C1890a c1890a = new C1890a(list.size());
                for (Y5 y52 : list) {
                    Object objW = y52.w();
                    if (objW != null) {
                        c1890a.put(y52.f15876n, objW);
                    }
                }
                return c1890a;
            }
            c1463p2E = d().E();
            str3 = "Cannot get user properties from main thread";
        }
        c1463p2E.a(str3);
        return Collections.emptyMap();
    }

    final void F0() {
        B5 b52;
        T.a aVarR0;
        l();
        this.f15438m = false;
        if (y0().isEmpty() || this.f15434i || (b52 = (B5) y0().poll()) == null || (aVarR0 = h().R0()) == null) {
            return;
        }
        this.f15434i = true;
        d().I().b("Registering trigger URI", b52.f15384m);
        X3.d dVarC = aVarR0.c(Uri.parse(b52.f15384m));
        if (dVarC == null) {
            this.f15434i = false;
            y0().add(b52);
            return;
        }
        if (!b().r(G.f15485O0)) {
            SparseArray sparseArrayI = g().I();
            sparseArrayI.put(b52.f15386o, Long.valueOf(b52.f15385n));
            g().t(sparseArrayI);
        }
        X3.b.a(dVarC, new R3(this, b52), new N3(this));
    }

    public final void G(long j7) {
        Y0(null);
        f().B(new Z3(this, j7));
    }

    public final void G0() {
        l();
        d().D().a("Register tcfPrefChangeListener.");
        if (this.f15445t == null) {
            this.f15446u = new U3(this, this.f16325a);
            this.f15445t = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.M3
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f15674a.J(sharedPreferences, str);
                }
            };
        }
        g().F().registerOnSharedPreferenceChangeListener(this.f15445t);
    }

    final void H(long j7, boolean z6) {
        l();
        t();
        d().D().a("Resetting analytics data (FE)");
        C1466p5 c1466p5S = s();
        c1466p5S.l();
        c1466p5S.f16241f.b();
        n().G();
        boolean zN = this.f16325a.n();
        C1532z2 c1532z2G = g();
        c1532z2G.f16374g.b(j7);
        if (!TextUtils.isEmpty(c1532z2G.g().f16391x.a())) {
            c1532z2G.f16391x.b(null);
        }
        c1532z2G.f16385r.b(0L);
        c1532z2G.f16386s.b(0L);
        if (!c1532z2G.b().U()) {
            c1532z2G.E(!zN);
        }
        c1532z2G.f16392y.b(null);
        c1532z2G.f16393z.b(0L);
        c1532z2G.f16369A.b(null);
        if (z6) {
            r().b0();
        }
        s().f16240e.a();
        this.f15443r = !zN;
    }

    final boolean H0() {
        return this.f15438m;
    }

    public final void I(Intent intent) {
        if (y7.a() && b().r(G.f15572z0)) {
            Uri data = intent.getData();
            if (data == null) {
                d().H().a("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                d().H().a("Preview Mode was not enabled.");
                b().J(null);
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            d().H().b("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            b().J(queryParameter2);
        }
    }

    final /* synthetic */ void J(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            d().I().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC1487t) Preconditions.checkNotNull(this.f15446u)).b(500L);
        }
    }

    final /* synthetic */ void K(Bundle bundle) {
        Bundle bundleA;
        if (bundle.isEmpty()) {
            bundleA = bundle;
        } else {
            bundleA = g().f16369A.a();
            if (b().r(G.f15534i1)) {
                bundleA = new Bundle(bundleA);
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    h();
                    if (d6.f0(obj)) {
                        h();
                        d6.W(this.f15447v, 27, null, null, 0);
                    }
                    d().K().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (d6.H0(str)) {
                    d().K().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundleA.remove(str);
                } else if (h().j0("param", str, b().p(null, false), obj)) {
                    h().M(bundleA, str, obj);
                }
            }
            h();
            if (d6.e0(bundleA, b().w())) {
                h();
                d6.W(this.f15447v, 26, null, null, 0);
                d().K().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        g().f16369A.b(bundleA);
        if (!bundle.isEmpty() || b().r(G.f15528g1)) {
            r().A(bundleA);
        }
    }

    final void K0(long j7) {
        H(j7, true);
    }

    public final void L0(Bundle bundle) {
        M0(bundle, zzb().currentTimeMillis());
    }

    final /* synthetic */ void M(Bundle bundle, long j7) {
        if (TextUtils.isEmpty(n().E())) {
            L(bundle, 0, j7);
        } else {
            d().K().a("Using developer consent only; google app id found");
        }
    }

    public final void M0(Bundle bundle, long j7) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            d().J().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        w3.q.a(bundle2, "app_id", String.class, null);
        w3.q.a(bundle2, "origin", String.class, null);
        w3.q.a(bundle2, "name", String.class, null);
        w3.q.a(bundle2, "value", Object.class, null);
        w3.q.a(bundle2, "trigger_event_name", String.class, null);
        w3.q.a(bundle2, "trigger_timeout", Long.class, 0L);
        w3.q.a(bundle2, "timed_out_event_name", String.class, null);
        w3.q.a(bundle2, "timed_out_event_params", Bundle.class, null);
        w3.q.a(bundle2, "triggered_event_name", String.class, null);
        w3.q.a(bundle2, "triggered_event_params", Bundle.class, null);
        w3.q.a(bundle2, "time_to_live", Long.class, 0L);
        w3.q.a(bundle2, "expired_event_name", String.class, null);
        w3.q.a(bundle2, "expired_event_params", Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j7);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (h().p0(string) != 0) {
            d().E().b("Invalid conditional user property name", e().g(string));
            return;
        }
        if (h().u(string, obj) != 0) {
            d().E().c("Invalid conditional user property value", e().g(string), obj);
            return;
        }
        Object objY0 = h().y0(string, obj);
        if (objY0 == null) {
            d().E().c("Unable to normalize conditional user property value", e().g(string), obj);
            return;
        }
        w3.q.b(bundle2, objY0);
        long j8 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j8 > 15552000000L || j8 < 1)) {
            d().E().c("Invalid conditional user property timeout", e().g(string), Long.valueOf(j8));
            return;
        }
        long j9 = bundle2.getLong("time_to_live");
        if (j9 > 15552000000L || j9 < 1) {
            d().E().c("Invalid conditional user property time to live", e().g(string), Long.valueOf(j9));
        } else {
            f().B(new RunnableC1374c4(this, bundle2));
        }
    }

    public final void N(com.google.android.gms.internal.measurement.U0 u02) {
        f().B(new RunnableC1402g4(this, u02));
    }

    final void O(C1501v c1501v, boolean z6) {
        RunnableC1444m4 runnableC1444m4 = new RunnableC1444m4(this, c1501v);
        if (!z6) {
            f().B(runnableC1444m4);
        } else {
            l();
            runnableC1444m4.run();
        }
    }

    final void P(A3 a32) {
        l();
        boolean z6 = (a32.z() && a32.y()) || r().g0();
        if (z6 != this.f16325a.o()) {
            this.f16325a.u(z6);
            Boolean boolM = g().M();
            if (!z6 || boolM == null || boolM.booleanValue()) {
                Y(Boolean.valueOf(z6), false);
            }
        }
    }

    final /* synthetic */ void P0(String str) {
        if (n().I(str)) {
            n().G();
        }
    }

    public final void Q(A3 a32, long j7, boolean z6) {
        A3 a33;
        boolean z7;
        boolean zU;
        boolean z8;
        A3 a3P = a32;
        t();
        int iB = a32.b();
        if (iB != -10) {
            w3.r rVarT = a32.t();
            w3.r rVar = w3.r.UNINITIALIZED;
            if (rVarT == rVar && a32.v() == rVar) {
                d().K().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.f15433h) {
            try {
                a33 = this.f15439n;
                z7 = false;
                if (A3.l(iB, a33.b())) {
                    zU = a32.u(this.f15439n);
                    if (a32.z() && !this.f15439n.z()) {
                        z7 = true;
                    }
                    a3P = a32.p(this.f15439n);
                    this.f15439n = a3P;
                    z8 = z7;
                    z7 = true;
                } else {
                    zU = false;
                    z8 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z7) {
            d().H().b("Ignoring lower-priority consent settings, proposed settings", a3P);
            return;
        }
        long andIncrement = this.f15440o.getAndIncrement();
        if (zU) {
            Y0(null);
            RunnableC1437l4 runnableC1437l4 = new RunnableC1437l4(this, a3P, j7, andIncrement, z8, a33);
            if (!z6) {
                f().E(runnableC1437l4);
                return;
            } else {
                l();
                runnableC1437l4.run();
                return;
            }
        }
        RunnableC1465p4 runnableC1465p4 = new RunnableC1465p4(this, a3P, andIncrement, z8, a33);
        if (z6) {
            l();
            runnableC1465p4.run();
        } else if (iB == 30 || iB == -10) {
            f().E(runnableC1465p4);
        } else {
            f().B(runnableC1465p4);
        }
    }

    public final void R0(String str, String str2, Bundle bundle) {
        f0(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    public final void S0(w3.v vVar) {
        t();
        Preconditions.checkNotNull(vVar);
        if (this.f15430e.remove(vVar)) {
            return;
        }
        d().J().a("OnEventListener had not been registered");
    }

    public final void T0(boolean z6) {
        if (a().getApplicationContext() instanceof Application) {
            Application application = (Application) a().getApplicationContext();
            if (this.f15428c == null) {
                this.f15428c = new C1451n4(this);
            }
            if (z6) {
                application.unregisterActivityLifecycleCallbacks(this.f15428c);
                application.registerActivityLifecycleCallbacks(this.f15428c);
                d().I().a("Registered activity lifecycle callback");
            }
        }
    }

    public final void U0(long j7) {
        f().B(new V3(this, j7));
    }

    public final void V0(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        f().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.I3
            @Override // java.lang.Runnable
            public final void run() {
                this.f15633m.K(bundle2);
            }
        });
    }

    public final void W0(final Bundle bundle, final long j7) {
        f().E(new Runnable() { // from class: com.google.android.gms.measurement.internal.K3
            @Override // java.lang.Runnable
            public final void run() {
                this.f15655m.M(bundle, j7);
            }
        });
    }

    public final void X(Boolean bool) {
        t();
        f().B(new RunnableC1423j4(this, bool));
    }

    final void Y0(String str) {
        this.f15432g.set(str);
    }

    public final void Z(final String str, long j7) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.f16325a.d().J().a("User ID must be non-empty or null");
        } else {
            f().B(new Runnable() { // from class: com.google.android.gms.measurement.internal.L3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15664m.P0(str);
                }
            });
            i0(null, "_id", str, true, j7);
        }
    }

    final void Z0(String str, String str2, Bundle bundle) {
        l();
        a0(str, str2, zzb().currentTimeMillis(), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    final void a0(String str, String str2, long j7, Bundle bundle) {
        l();
        b0(str, str2, j7, bundle, true, this.f15429d == null || d6.H0(str2), true, null);
    }

    public final void a1(boolean z6) {
        t();
        f().B(new T3(this, z6));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    protected final void b0(String str, String str2, long j7, Bundle bundle, boolean z6, boolean z7, boolean z8, String str3) {
        String str4;
        ArrayList arrayList;
        long j8;
        int i7;
        Object obj;
        int length;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        l();
        t();
        if (!this.f16325a.n()) {
            d().D().a("Event not sent since app measurement is disabled");
            return;
        }
        List listF = n().F();
        if (listF != null && !listF.contains(str2)) {
            d().D().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f15431f) {
            this.f15431f = true;
            try {
                try {
                    (!this.f16325a.r() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, a().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, a());
                } catch (Exception e7) {
                    d().J().b("Failed to invoke Tag Manager's initialize() method", e7);
                }
            } catch (ClassNotFoundException unused) {
                d().H().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            g0("auto", "_lgclid", bundle.getString("gclid"), zzb().currentTimeMillis());
        }
        if (z6 && d6.K0(str2)) {
            h().L(bundle, g().f16369A.a());
        }
        if (!z8 && !"_iap".equals(str2)) {
            d6 d6VarJ = this.f16325a.J();
            int i8 = 2;
            if (d6VarJ.A0("event", str2)) {
                if (!d6VarJ.n0("event", w3.s.f22699a, w3.s.f22700b, str2)) {
                    i8 = 13;
                } else if (d6VarJ.h0("event", 40, str2)) {
                    i8 = 0;
                }
            }
            if (i8 != 0) {
                d().F().b("Invalid public event name. Event will not be logged (FE)", e().c(str2));
                this.f16325a.J();
                String strH = d6.H(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f16325a.J();
                d6.W(this.f15447v, i8, "_ev", strH, length);
                return;
            }
        }
        C1520x4 c1520x4A = q().A(false);
        if (c1520x4A != null && !bundle.containsKey("_sc")) {
            c1520x4A.f16349d = true;
        }
        d6.V(c1520x4A, bundle, z6 && !z8);
        boolean zEquals = "am".equals(str);
        boolean zH0 = d6.H0(str2);
        if (z6 && this.f15429d != null && !zH0 && !zEquals) {
            d().D().c("Passing event to registered event handler (FE)", e().c(str2), e().a(bundle));
            Preconditions.checkNotNull(this.f15429d);
            this.f15429d.a(str, str2, bundle, j7);
            return;
        }
        if (this.f16325a.q()) {
            int iT = h().t(str2);
            if (iT != 0) {
                d().F().b("Invalid event name. Event will not be logged (FE)", e().c(str2));
                h();
                String strH2 = d6.H(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f16325a.J();
                d6.X(this.f15447v, str3, iT, "_ev", strH2, length);
                return;
            }
            String str5 = "_o";
            Bundle bundleD = h().D(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z8);
            Preconditions.checkNotNull(bundleD);
            if (q().A(false) != null && "_ae".equals(str2)) {
                C1500u5 c1500u5 = s().f16241f;
                long jElapsedRealtime = c1500u5.f16305d.zzb().elapsedRealtime();
                long j9 = jElapsedRealtime - c1500u5.f16303b;
                c1500u5.f16303b = jElapsedRealtime;
                if (j9 > 0) {
                    h().K(bundleD, j9);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                d6 d6VarH = h();
                String string = bundleD.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, d6VarH.g().f16391x.a())) {
                    d6VarH.d().D().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                d6VarH.g().f16391x.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = h().g().f16391x.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleD.putString("_ffr", strA);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleD);
            boolean zD = b().r(G.f15487P0) ? s().D() : g().f16388u.b();
            if (g().f16385r.a() > 0 && g().x(j7) && zD) {
                d().I().a("Current session is expired, remove the session number, ID, and engagement time");
                arrayList = arrayList2;
                j8 = 0;
                str4 = "_ae";
                g0("auto", "_sid", null, zzb().currentTimeMillis());
                g0("auto", "_sno", null, zzb().currentTimeMillis());
                g0("auto", "_se", null, zzb().currentTimeMillis());
                g().f16386s.b(0L);
            } else {
                str4 = "_ae";
                arrayList = arrayList2;
                j8 = 0;
            }
            if (bundleD.getLong("extend_session", j8) == 1) {
                d().I().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                i7 = 1;
                this.f16325a.I().f16240e.b(j7, true);
            } else {
                i7 = 1;
            }
            ArrayList arrayList3 = new ArrayList(bundleD.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj2 = arrayList3.get(i9);
                i9 += i7;
                String str6 = (String) obj2;
                if (str6 != null) {
                    h();
                    Bundle[] bundleArrV0 = d6.v0(bundleD.get(str6));
                    if (bundleArrV0 != null) {
                        bundleD.putParcelableArray(str6, bundleArrV0);
                    }
                }
                i7 = 1;
            }
            int i10 = 0;
            while (i10 < arrayList.size()) {
                ArrayList arrayList4 = arrayList;
                Bundle bundleC = (Bundle) arrayList4.get(i10);
                String str7 = i10 != 0 ? "_ep" : str2;
                bundleC.putString(str5, str);
                if (z7) {
                    obj = null;
                    bundleC = h().C(bundleC, null);
                } else {
                    obj = null;
                }
                Bundle bundle2 = bundleC;
                String str8 = str5;
                r().G(new E(str7, new D(bundle2), str, j7), str3);
                if (!zEquals) {
                    Iterator it = this.f15430e.iterator();
                    while (it.hasNext()) {
                        ((w3.v) it.next()).a(str, str2, new Bundle(bundle2), j7);
                    }
                }
                i10++;
                arrayList = arrayList4;
                str5 = str8;
            }
            if (q().A(false) == null || !str4.equals(str2)) {
                return;
            }
            s().C(true, true, zzb().elapsedRealtime());
        }
    }

    public final void b1(Bundle bundle, long j7) {
        L(bundle, -20, j7);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    public final void d0(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        f().B(new RunnableC1367b4(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    public final void e0(String str, String str2, Bundle bundle, String str3) {
        k();
        Q0(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    public final void f0(String str, String str2, Bundle bundle, boolean z6, boolean z7, long j7) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            q().G(bundle2, j7);
        } else {
            Q0(str3, str2, j7, bundle2, z7, !z7 || this.f15429d == null || d6.H0(str2), z6, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void g0(String str, String str2, Object obj, long j7) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        l();
        t();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (TextUtils.isEmpty(str3)) {
                    if (obj == null) {
                        g().f16382o.b("unset");
                    }
                    d().I().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                } else {
                    Long lValueOf = Long.valueOf("false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 1L : 0L);
                    g().f16382o.b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                }
                str2 = "_npa";
                d().I().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            }
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.f16325a.n()) {
            d().I().a("User property not set since app measurement is disabled");
        } else if (this.f16325a.q()) {
            r().K(new Y5(str4, j7, obj2, str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    public final void h0(String str, String str2, Object obj, boolean z6) {
        i0(str, str2, obj, z6, zzb().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(String str, String str2, Object obj, boolean z6, long j7) {
        int iP0;
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z6) {
            iP0 = h().p0(str2);
        } else {
            d6 d6VarH = h();
            if (d6VarH.A0("user property", str2)) {
                iP0 = !d6VarH.m0("user property", w3.t.f22703a, str2) ? 15 : !d6VarH.h0("user property", 24, str2) ? 6 : 0;
            }
        }
        if (iP0 != 0) {
            h();
            String strH = d6.H(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.f16325a.J();
            d6.W(this.f15447v, iP0, "_ev", strH, length);
            return;
        }
        if (obj == null) {
            c0(str3, str2, j7, null);
            return;
        }
        int iU = h().u(str2, obj);
        if (iU == 0) {
            Object objY0 = h().y0(str2, obj);
            if (objY0 != null) {
                c0(str3, str2, j7, objY0);
                return;
            }
            return;
        }
        h();
        String strH2 = d6.H(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        this.f16325a.J();
        d6.W(this.f15447v, iU, "_ev", strH2, length);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    final /* synthetic */ void j0(List list) {
        l();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray sparseArrayI = g().I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                B5 b52 = (B5) it.next();
                if (!sparseArrayI.contains(b52.f15386o) || ((Long) sparseArrayI.get(b52.f15386o)).longValue() < b52.f15385n) {
                    y0().add(b52);
                }
            }
            F0();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    final /* synthetic */ void k0(AtomicReference atomicReference) {
        Bundle bundleA = g().f16383p.a();
        F4 f4R = r();
        if (bundleA == null) {
            bundleA = new Bundle();
        }
        f4R.N(atomicReference, bundleA);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final void l0(w3.v vVar) {
        t();
        Preconditions.checkNotNull(vVar);
        if (this.f15430e.add(vVar)) {
            return;
        }
        d().J().a("OnEventListener already registered");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1522y m() {
        return super.m();
    }

    public final void m0(w3.w wVar) {
        w3.w wVar2;
        l();
        t();
        if (wVar != null && wVar != (wVar2 = this.f15429d)) {
            Preconditions.checkState(wVar2 == null, "EventInterceptor already set.");
        }
        this.f15429d = wVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1400g2 n() {
        return super.n();
    }

    public final Application.ActivityLifecycleCallbacks n0() {
        return this.f15428c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1393f2 o() {
        return super.o();
    }

    public final C2191b o0() {
        l();
        return r().T();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ F3 p() {
        return super.p();
    }

    public final Boolean p0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) f().t(atomicReference, 15000L, "boolean test flag value", new P3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1513w4 q() {
        return super.q();
    }

    public final Double q0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) f().t(atomicReference, 15000L, "double test flag value", new RunnableC1430k4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ F4 r() {
        return super.r();
    }

    public final Integer r0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) f().t(atomicReference, 15000L, "int test flag value", new RunnableC1409h4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1466p5 s() {
        return super.s();
    }

    public final Long s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) f().t(atomicReference, 15000L, "long test flag value", new RunnableC1416i4(this, atomicReference));
    }

    public final String t0() {
        return (String) this.f15432g.get();
    }

    public final String u0() {
        C1520x4 c1520x4N = this.f16325a.G().N();
        if (c1520x4N != null) {
            return c1520x4N.f16347b;
        }
        return null;
    }

    public final String v0() {
        C1520x4 c1520x4N = this.f16325a.G().N();
        if (c1520x4N != null) {
            return c1520x4N.f16346a;
        }
        return null;
    }

    public final String w0() {
        if (this.f16325a.K() != null) {
            return this.f16325a.K();
        }
        try {
            return new w3.p(a(), this.f16325a.N()).b("google_app_id");
        } catch (IllegalStateException e7) {
            this.f16325a.d().E().b("getGoogleAppId failed with exception", e7);
            return null;
        }
    }

    public final String x0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) f().t(atomicReference, 15000L, "String test flag value", new Y3(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1525y2
    protected final boolean y() {
        return false;
    }

    final PriorityQueue y0() {
        if (this.f15437l == null) {
            this.f15437l = new PriorityQueue(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.E3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((B5) obj).f15385n);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.H3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f15437l;
    }

    public final void z0() {
        l();
        t();
        if (b().r(G.f15522e1)) {
            F4 f4R = r();
            f4R.l();
            f4R.t();
            if (f4R.i0() && f4R.h().G0() < 242600) {
                return;
            }
            r().V();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1369c zzd() {
        return super.zzd();
    }
}
