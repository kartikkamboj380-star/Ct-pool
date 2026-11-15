package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.AbstractC1183q3;
import com.google.android.gms.internal.measurement.C1055c1;
import com.google.android.gms.internal.measurement.C1195r7;
import com.google.android.gms.internal.measurement.Y6;
import com.google.android.gms.measurement.internal.A3;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import w3.C2191b;

/* JADX INFO: loaded from: classes.dex */
public class S2 implements InterfaceC1526y3 {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static volatile S2 f15761I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private volatile Boolean f15762A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Boolean f15763B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Boolean f15764C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile boolean f15765D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f15766E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f15767F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final long f15769H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f15773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f15774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1369c f15775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1397g f15776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1532z2 f15777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1449n2 f15778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final P2 f15779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1466p5 f15780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d6 f15781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1407h2 f15782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Clock f15783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C1513w4 f15784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final F3 f15785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C1522y f15786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1485s4 f15787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f15788s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private C1393f2 f15789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private F4 f15790u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private C1515x f15791v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C1400g2 f15792w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Boolean f15794y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f15795z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f15793x = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private AtomicInteger f15768G = new AtomicInteger(0);

    private S2(D3 d32) {
        Bundle bundle;
        boolean z6 = false;
        Preconditions.checkNotNull(d32);
        C1369c c1369c = new C1369c(d32.f15402a);
        this.f15775f = c1369c;
        AbstractC1379d2.f15985a = c1369c;
        Context context = d32.f15402a;
        this.f15770a = context;
        this.f15771b = d32.f15403b;
        this.f15772c = d32.f15404c;
        this.f15773d = d32.f15405d;
        this.f15774e = d32.f15409h;
        this.f15762A = d32.f15406e;
        this.f15788s = d32.f15411j;
        this.f15765D = true;
        C1055c1 c1055c1 = d32.f15408g;
        if (c1055c1 != null && (bundle = c1055c1.f14534s) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f15763B = (Boolean) obj;
            }
            Object obj2 = c1055c1.f14534s.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f15764C = (Boolean) obj2;
            }
        }
        AbstractC1183q3.l(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.f15783n = defaultClock;
        Long l7 = d32.f15410i;
        this.f15769H = l7 != null ? l7.longValue() : defaultClock.currentTimeMillis();
        this.f15776g = new C1397g(this);
        C1532z2 c1532z2 = new C1532z2(this);
        c1532z2.o();
        this.f15777h = c1532z2;
        C1449n2 c1449n2 = new C1449n2(this);
        c1449n2.o();
        this.f15778i = c1449n2;
        d6 d6Var = new d6(this);
        d6Var.o();
        this.f15781l = d6Var;
        this.f15782m = new C1407h2(new C3(d32, this));
        this.f15786q = new C1522y(this);
        C1513w4 c1513w4 = new C1513w4(this);
        c1513w4.u();
        this.f15784o = c1513w4;
        F3 f32 = new F3(this);
        f32.u();
        this.f15785p = f32;
        C1466p5 c1466p5 = new C1466p5(this);
        c1466p5.u();
        this.f15780k = c1466p5;
        C1485s4 c1485s4 = new C1485s4(this);
        c1485s4.o();
        this.f15787r = c1485s4;
        P2 p22 = new P2(this);
        p22.o();
        this.f15779j = p22;
        C1055c1 c1055c12 = d32.f15408g;
        if (c1055c12 != null && c1055c12.f14529n != 0) {
            z6 = true;
        }
        boolean z7 = !z6;
        if (context.getApplicationContext() instanceof Application) {
            F().T0(z7);
        } else {
            d().J().a("Application context is not an Application");
        }
        p22.B(new Y2(this, d32));
    }

    public static S2 b(Context context, C1055c1 c1055c1, Long l7) {
        Bundle bundle;
        if (c1055c1 != null && (c1055c1.f14532q == null || c1055c1.f14533r == null)) {
            c1055c1 = new C1055c1(c1055c1.f14528m, c1055c1.f14529n, c1055c1.f14530o, c1055c1.f14531p, null, null, c1055c1.f14534s, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f15761I == null) {
            synchronized (S2.class) {
                try {
                    if (f15761I == null) {
                        f15761I = new S2(new D3(context, c1055c1, l7));
                    }
                } finally {
                }
            }
        } else if (c1055c1 != null && (bundle = c1055c1.f14534s) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f15761I);
            f15761I.k(c1055c1.f14534s.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f15761I);
        return f15761I;
    }

    private static void e(AbstractC1525y2 abstractC1525y2) {
        if (abstractC1525y2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC1525y2.x()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC1525y2.getClass()));
    }

    static /* synthetic */ void g(S2 s22, D3 d32) {
        s22.f().l();
        C1515x c1515x = new C1515x(s22);
        c1515x.o();
        s22.f15791v = c1515x;
        C1400g2 c1400g2 = new C1400g2(s22, d32.f15407f);
        c1400g2.u();
        s22.f15792w = c1400g2;
        C1393f2 c1393f2 = new C1393f2(s22);
        c1393f2.u();
        s22.f15789t = c1393f2;
        F4 f42 = new F4(s22);
        f42.u();
        s22.f15790u = f42;
        s22.f15781l.p();
        s22.f15777h.p();
        s22.f15792w.v();
        s22.d().H().b("App measurement initialized, version", 106000L);
        s22.d().H().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strD = c1400g2.D();
        if (TextUtils.isEmpty(s22.f15771b)) {
            if (s22.J().C0(strD, s22.f15776g.R())) {
                s22.d().H().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                s22.d().H().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strD);
            }
        }
        s22.d().D().a("Debug-level message logging enabled");
        if (s22.f15766E != s22.f15768G.get()) {
            s22.d().E().c("Not all components initialized", Integer.valueOf(s22.f15766E), Integer.valueOf(s22.f15768G.get()));
        }
        s22.f15793x = true;
    }

    private static void h(AbstractC1512w3 abstractC1512w3) {
        if (abstractC1512w3 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void i(AbstractC1533z3 abstractC1533z3) {
        if (abstractC1533z3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC1533z3.q()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC1533z3.getClass()));
    }

    private final C1485s4 t() {
        i(this.f15787r);
        return this.f15787r;
    }

    public final C1393f2 A() {
        e(this.f15789t);
        return this.f15789t;
    }

    public final C1407h2 B() {
        return this.f15782m;
    }

    public final C1449n2 C() {
        C1449n2 c1449n2 = this.f15778i;
        if (c1449n2 == null || !c1449n2.q()) {
            return null;
        }
        return this.f15778i;
    }

    public final C1532z2 D() {
        h(this.f15777h);
        return this.f15777h;
    }

    final P2 E() {
        return this.f15779j;
    }

    public final F3 F() {
        e(this.f15785p);
        return this.f15785p;
    }

    public final C1513w4 G() {
        e(this.f15784o);
        return this.f15784o;
    }

    public final F4 H() {
        e(this.f15790u);
        return this.f15790u;
    }

    public final C1466p5 I() {
        e(this.f15780k);
        return this.f15780k;
    }

    public final d6 J() {
        h(this.f15781l);
        return this.f15781l;
    }

    public final String K() {
        return this.f15771b;
    }

    public final String L() {
        return this.f15772c;
    }

    public final String M() {
        return this.f15773d;
    }

    public final String N() {
        return this.f15788s;
    }

    final void O() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void P() {
        this.f15768G.incrementAndGet();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final Context a() {
        return this.f15770a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void c(C1055c1 c1055c1) {
        A3 a3F;
        Boolean boolE;
        F3 f3F;
        C1501v c1501v;
        Boolean boolC;
        f().l();
        if (C1195r7.a() && this.f15776g.r(G.f15475J0) && J().V0()) {
            d6 d6VarJ = J();
            d6VarJ.l();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            androidx.core.content.b.j(d6VarJ.a(), new w3.F(d6VarJ.f16325a), intentFilter, 2);
            d6VarJ.d().D().a("Registered app receiver");
        }
        A3 a3K = D().K();
        int iB = a3K.b();
        w3.r rVarZ = this.f15776g.z("google_analytics_default_allow_ad_storage", false);
        w3.r rVarZ2 = this.f15776g.z("google_analytics_default_allow_analytics_storage", false);
        w3.r rVar = w3.r.UNINITIALIZED;
        if (!(rVarZ == rVar && rVarZ2 == rVar) && D().w(-10)) {
            a3F = A3.f(rVarZ, rVarZ2, -10);
        } else {
            if (!TextUtils.isEmpty(z().E()) && (iB == 0 || iB == 30 || iB == 10 || iB == 30 || iB == 30 || iB == 40)) {
                F().Q(new A3(null, null, -10), this.f15769H, false);
            } else if (TextUtils.isEmpty(z().E()) && c1055c1 != null && c1055c1.f14534s != null && D().w(30)) {
                a3F = A3.c(c1055c1.f14534s, 30);
                if (!a3F.A()) {
                }
            }
            a3F = null;
        }
        if (a3F != null) {
            F().Q(a3F, this.f15769H, true);
            a3K = a3F;
        }
        F().P(a3K);
        int iA = D().J().a();
        w3.r rVarZ3 = this.f15776g.z("google_analytics_default_allow_ad_personalization_signals", true);
        if (rVarZ3 != rVar) {
            d().I().b("Default ad personalization consent from Manifest", rVarZ3);
        }
        w3.r rVarZ4 = this.f15776g.z("google_analytics_default_allow_ad_user_data", true);
        if (rVarZ4 != rVar && A3.l(-10, iA)) {
            f3F = F();
            c1501v = C1501v.d(rVarZ4, -10);
        } else {
            if (TextUtils.isEmpty(z().E()) || !(iA == 0 || iA == 30)) {
                if (TextUtils.isEmpty(z().E()) && c1055c1 != null && c1055c1.f14534s != null && A3.l(30, iA)) {
                    C1501v c1501vB = C1501v.b(c1055c1.f14534s, 30);
                    if (c1501vB.k()) {
                        F().O(c1501vB, true);
                    }
                }
                if (TextUtils.isEmpty(z().E()) && c1055c1 != null && c1055c1.f14534s != null && D().f16382o.a() == null && (boolE = C1501v.e(c1055c1.f14534s)) != null) {
                    F().h0(c1055c1.f14532q, "allow_personalized_ads", boolE.toString(), false);
                }
                boolC = this.f15776g.C("google_analytics_tcf_data_enabled");
                if (boolC != null ? true : boolC.booleanValue()) {
                    d().D().a("TCF client enabled.");
                    F().G0();
                    F().E0();
                }
                if (D().f16374g.a() == 0) {
                    d().I().b("Persisting first open", Long.valueOf(this.f15769H));
                    D().f16374g.b(this.f15769H);
                }
                F().f15442q.c();
                if (!q()) {
                    if (!TextUtils.isEmpty(z().E()) || !TextUtils.isEmpty(z().C())) {
                        J();
                        if (d6.k0(z().E(), D().Q(), z().C(), D().P())) {
                            d().H().a("Rechecking which service to use due to a GMP App Id change");
                            D().R();
                            A().F();
                            this.f15790u.Y();
                            this.f15790u.X();
                            D().f16374g.b(this.f15769H);
                            D().f16376i.b(null);
                        }
                        D().G(z().E());
                        D().D(z().C());
                    }
                    if (!D().K().m(A3.a.ANALYTICS_STORAGE)) {
                        D().f16376i.b(null);
                    }
                    F().Y0(D().f16376i.a());
                    if (!J().W0() && !TextUtils.isEmpty(D().f16391x.a())) {
                        d().J().a("Remote config removed with active feature rollouts");
                        D().f16391x.b(null);
                    }
                    if (!TextUtils.isEmpty(z().E()) || !TextUtils.isEmpty(z().C())) {
                        boolean zN = n();
                        if (!D().B() && !this.f15776g.U()) {
                            D().E(!zN);
                        }
                        if (zN) {
                            F().A0();
                        }
                        I().f16240e.a();
                        H().M(new AtomicReference());
                        H().A(D().f16369A.a());
                    }
                } else if (n()) {
                    if (!J().D0("android.permission.INTERNET")) {
                        d().E().a("App is missing INTERNET permission");
                    }
                    if (!J().D0("android.permission.ACCESS_NETWORK_STATE")) {
                        d().E().a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    if (!Wrappers.packageManager(this.f15770a).isCallerInstantApp() && !this.f15776g.V()) {
                        if (!d6.b0(this.f15770a)) {
                            d().E().a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!d6.c0(this.f15770a, false)) {
                            d().E().a("AppMeasurementService not registered/enabled");
                        }
                    }
                    d().E().a("Uploading is not possible. App measurement disabled");
                }
                if (C1195r7.a() && this.f15776g.r(G.f15475J0) && J().V0()) {
                    final F3 f3F2 = F();
                    Objects.requireNonNull(f3F2);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.W2
                        @Override // java.lang.Runnable
                        public final void run() {
                            f3F2.C0();
                        }
                    }).start();
                }
                D().f16384q.a(true);
            }
            f3F = F();
            c1501v = new C1501v(null, -10);
        }
        f3F.O(c1501v, true);
        boolC = this.f15776g.C("google_analytics_tcf_data_enabled");
        if (boolC != null ? true : boolC.booleanValue()) {
        }
        if (D().f16374g.a() == 0) {
        }
        F().f15442q.c();
        if (!q()) {
        }
        if (C1195r7.a()) {
            final F3 f3F22 = F();
            Objects.requireNonNull(f3F22);
            new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.W2
                @Override // java.lang.Runnable
                public final void run() {
                    f3F22.C0();
                }
            }).start();
        }
        D().f16384q.a(true);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final C1449n2 d() {
        i(this.f15778i);
        return this.f15778i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final P2 f() {
        i(this.f15779j);
        return this.f15779j;
    }

    final /* synthetic */ void j(String str, int i7, Throwable th, byte[] bArr, Map map) {
        if ((i7 != 200 && i7 != 204 && i7 != 304) || th != null) {
            d().J().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i7), th);
            return;
        }
        D().f16389v.a(true);
        if (bArr == null || bArr.length == 0) {
            d().D().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            if (TextUtils.isEmpty(strOptString)) {
                d().D().a("Deferred Deep Link is empty.");
                return;
            }
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            String strOptString4 = jSONObject.optString("gad_source", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            Bundle bundle = new Bundle();
            if (Y6.a() && this.f15776g.r(G.f15497U0)) {
                if (!J().J0(strOptString)) {
                    d().J().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                }
                if (!TextUtils.isEmpty(strOptString3)) {
                    bundle.putString("gbraid", strOptString3);
                }
                if (!TextUtils.isEmpty(strOptString4)) {
                    bundle.putString("gad_source", strOptString4);
                }
            } else if (!J().J0(strOptString)) {
                d().J().c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            if (Y6.a()) {
                this.f15776g.r(G.f15497U0);
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.f15785p.Z0("auto", "_cmp", bundle);
            d6 d6VarJ = J();
            if (TextUtils.isEmpty(strOptString) || !d6VarJ.g0(strOptString, dOptDouble)) {
                return;
            }
            d6VarJ.a().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e7) {
            d().E().b("Failed to parse the Deferred Deep Link response. exception", e7);
        }
    }

    final void k(boolean z6) {
        this.f15762A = Boolean.valueOf(z6);
    }

    final void l() {
        this.f15766E++;
    }

    public final boolean m() {
        return this.f15762A != null && this.f15762A.booleanValue();
    }

    public final boolean n() {
        return v() == 0;
    }

    public final boolean o() {
        f().l();
        return this.f15765D;
    }

    public final boolean p() {
        return TextUtils.isEmpty(this.f15771b);
    }

    protected final boolean q() {
        if (!this.f15793x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        f().l();
        Boolean bool = this.f15794y;
        if (bool == null || this.f15795z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f15783n.elapsedRealtime() - this.f15795z) > 1000)) {
            this.f15795z = this.f15783n.elapsedRealtime();
            boolean z6 = true;
            Boolean boolValueOf = Boolean.valueOf(J().D0("android.permission.INTERNET") && J().D0("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.f15770a).isCallerInstantApp() || this.f15776g.V() || (d6.b0(this.f15770a) && d6.c0(this.f15770a, false))));
            this.f15794y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!J().i0(z().E(), z().C()) && TextUtils.isEmpty(z().C())) {
                    z6 = false;
                }
                this.f15794y = Boolean.valueOf(z6);
            }
        }
        return this.f15794y.booleanValue();
    }

    public final boolean r() {
        return this.f15774e;
    }

    public final boolean s() {
        f().l();
        i(t());
        String strD = z().D();
        if (!this.f15776g.S()) {
            d().I().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair pairS = D().s(strD);
        if (((Boolean) pairS.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairS.first)) {
            d().I().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!t().u()) {
            d().J().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        F4 f4H = H();
        f4H.l();
        f4H.t();
        if (!f4H.i0() || f4H.h().G0() >= 234200) {
            C2191b c2191bO0 = F().o0();
            Bundle bundle = c2191bO0 != null ? c2191bO0.f22687m : null;
            if (bundle == null) {
                int i7 = this.f15767F;
                this.f15767F = i7 + 1;
                boolean z6 = i7 < 10;
                d().D().b("Failed to retrieve DMA consent from the service, " + (z6 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f15767F));
                return z6;
            }
            A3 a3C = A3.c(bundle, 100);
            sb.append("&gcs=");
            sb.append(a3C.w());
            C1501v c1501vB = C1501v.b(bundle, 100);
            sb.append("&dma=");
            sb.append(c1501vB.h() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(c1501vB.i())) {
                sb.append("&dma_cps=");
                sb.append(c1501vB.i());
            }
            int i8 = C1501v.e(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i8);
            d().I().b("Consent query parameters to Bow", sb);
        }
        d6 d6VarJ = J();
        z();
        URL urlI = d6VarJ.I(106000L, strD, (String) pairS.first, D().f16390w.a() - 1, sb.toString());
        if (urlI != null) {
            C1485s4 c1485s4T = t();
            InterfaceC1478r4 interfaceC1478r4 = new InterfaceC1478r4() { // from class: com.google.android.gms.measurement.internal.V2
                @Override // com.google.android.gms.measurement.internal.InterfaceC1478r4
                public final void a(String str, int i9, Throwable th, byte[] bArr, Map map) {
                    this.f15819a.j(str, i9, th, bArr, map);
                }
            };
            c1485s4T.l();
            c1485s4T.n();
            Preconditions.checkNotNull(urlI);
            Preconditions.checkNotNull(interfaceC1478r4);
            c1485s4T.f().x(new RunnableC1499u4(c1485s4T, strD, urlI, null, null, interfaceC1478r4));
        }
        return false;
    }

    public final void u(boolean z6) {
        f().l();
        this.f15765D = z6;
    }

    public final int v() {
        f().l();
        if (this.f15776g.U()) {
            return 1;
        }
        Boolean bool = this.f15764C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!o()) {
            return 8;
        }
        Boolean boolN = D().N();
        if (boolN != null) {
            return boolN.booleanValue() ? 0 : 3;
        }
        Boolean boolC = this.f15776g.C("firebase_analytics_collection_enabled");
        if (boolC != null) {
            return boolC.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f15763B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f15762A == null || this.f15762A.booleanValue()) ? 0 : 7;
    }

    public final C1522y w() {
        C1522y c1522y = this.f15786q;
        if (c1522y != null) {
            return c1522y;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C1397g x() {
        return this.f15776g;
    }

    public final C1515x y() {
        i(this.f15791v);
        return this.f15791v;
    }

    public final C1400g2 z() {
        e(this.f15792w);
        return this.f15792w;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final Clock zzb() {
        return this.f15783n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final C1369c zzd() {
        return this.f15775f;
    }
}
