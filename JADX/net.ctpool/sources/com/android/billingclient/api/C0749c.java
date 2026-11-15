package com.android.billingclient.api;

import C0.C0334a;
import C0.C0337d;
import C0.C0343j;
import C0.C0344k;
import C0.InterfaceC0335b;
import C0.InterfaceC0336c;
import C0.InterfaceC0338e;
import C0.InterfaceC0339f;
import C0.InterfaceC0340g;
import C0.InterfaceC0341h;
import C0.InterfaceC0342i;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.C0750d;
import com.android.billingclient.api.C0754h;
import com.google.android.gms.internal.play_billing.AbstractC1267b;
import com.google.android.gms.internal.play_billing.AbstractC1299j;
import com.google.android.gms.internal.play_billing.AbstractC1319o;
import com.google.android.gms.internal.play_billing.C1274c2;
import com.google.android.gms.internal.play_billing.C1310l2;
import com.google.android.gms.internal.play_billing.C1314m2;
import com.google.android.gms.internal.play_billing.J2;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.W1;
import com.google.android.gms.internal.play_billing.Y1;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* JADX INFO: renamed from: com.android.billingclient.api.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0749c extends AbstractC0748b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f10204A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ExecutorService f10205B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f10206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f10208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile M f10209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f10210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x f10211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile J2 f10212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile u f10213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f10215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f10218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10221p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10222q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10224s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10225t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10226u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10227v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10228w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10229x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10230y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private C0752f f10231z;

    C0749c(String str, Context context, x xVar, ExecutorService executorService) {
        this.f10206a = 0;
        this.f10208c = new Handler(Looper.getMainLooper());
        this.f10216k = 0;
        String strS = S();
        this.f10207b = strS;
        this.f10210e = context.getApplicationContext();
        C1310l2 c1310l2D = C1314m2.D();
        c1310l2D.q(strS);
        c1310l2D.p(this.f10210e.getPackageName());
        this.f10211f = new z(this.f10210e, (C1314m2) c1310l2D.h());
        this.f10210e.getPackageName();
    }

    static /* bridge */ /* synthetic */ C0.D L(C0749c c0749c, String str, int i7) {
        C0.D d7;
        com.google.android.gms.internal.play_billing.A.h("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleC = com.google.android.gms.internal.play_billing.A.c(c0749c.f10219n, c0749c.f10227v, c0749c.f10231z.a(), c0749c.f10231z.b(), c0749c.f10207b);
        List list = null;
        String string = null;
        while (true) {
            try {
                Bundle bundleZ = c0749c.f10219n ? c0749c.f10212g.Z(true != c0749c.f10227v ? 9 : 19, c0749c.f10210e.getPackageName(), str, string, bundleC) : c0749c.f10212g.z(3, c0749c.f10210e.getPackageName(), str, string);
                J jA = K.a(bundleZ, "BillingClient", "getPurchase()");
                C0751e c0751eA = jA.a();
                if (c0751eA != y.f10368l) {
                    c0749c.U(w.a(jA.b(), 9, c0751eA));
                    return new C0.D(c0751eA, list);
                }
                ArrayList<String> stringArrayList = bundleZ.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleZ.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleZ.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z6 = false;
                for (int i8 = 0; i8 < stringArrayList2.size(); i8++) {
                    String str2 = stringArrayList2.get(i8);
                    String str3 = stringArrayList3.get(i8);
                    com.google.android.gms.internal.play_billing.A.h("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i8))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.i())) {
                            com.google.android.gms.internal.play_billing.A.i("BillingClient", "BUG: empty/null token!");
                            z6 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e7) {
                        com.google.android.gms.internal.play_billing.A.j("BillingClient", "Got an exception trying to decode the purchase!", e7);
                        C0751e c0751e = y.f10366j;
                        c0749c.U(w.a(51, 9, c0751e));
                        d7 = new C0.D(c0751e, null);
                    }
                }
                if (z6) {
                    c0749c.U(w.a(26, 9, y.f10366j));
                }
                string = bundleZ.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.A.h("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    d7 = new C0.D(y.f10368l, arrayList);
                    break;
                }
                list = null;
            } catch (Exception e8) {
                C0751e c0751e2 = y.f10369m;
                c0749c.U(w.a(52, 9, c0751e2));
                com.google.android.gms.internal.play_billing.A.j("BillingClient", "Got exception trying to get purchasesm try to reconnect", e8);
                return new C0.D(c0751e2, null);
            }
        }
        return d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler O() {
        return Looper.myLooper() == null ? this.f10208c : new Handler(Looper.myLooper());
    }

    private final C0751e P(final C0751e c0751e) {
        if (Thread.interrupted()) {
            return c0751e;
        }
        this.f10208c.post(new Runnable() { // from class: com.android.billingclient.api.N
            @Override // java.lang.Runnable
            public final void run() {
                this.f10173m.E(c0751e);
            }
        });
        return c0751e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0751e Q() {
        return (this.f10206a == 0 || this.f10206a == 3) ? y.f10369m : y.f10366j;
    }

    private final String R(C0754h c0754h) {
        if (TextUtils.isEmpty(null)) {
            return this.f10210e.getPackageName();
        }
        return null;
    }

    private static String S() {
        try {
            return (String) D0.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "7.0.0";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future T(Callable callable, long j7, final Runnable runnable, Handler handler) {
        if (this.f10205B == null) {
            this.f10205B = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.A.f15014a, new ThreadFactoryC0762p(this));
        }
        try {
            final Future futureSubmit = this.f10205B.submit(callable);
            handler.postDelayed(new Runnable() { // from class: C0.O
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.A.i("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j7 * 0.95d));
            return futureSubmit;
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.A.j("BillingClient", "Async task throws exception!", e7);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(S1 s12) {
        this.f10211f.d(s12, this.f10216k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(W1 w12) {
        this.f10211f.b(w12, this.f10216k);
    }

    private final void W(String str, final InterfaceC0340g interfaceC0340g) {
        C0751e c0751eQ;
        int i7;
        if (!e()) {
            c0751eQ = y.f10369m;
            i7 = 2;
        } else {
            if (T(new r(this, str, interfaceC0340g), 30000L, new Runnable() { // from class: com.android.billingclient.api.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10320m.I(interfaceC0340g);
                }
            }, O()) != null) {
                return;
            }
            c0751eQ = Q();
            i7 = 25;
        }
        U(w.a(i7, 11, c0751eQ));
        interfaceC0340g.a(c0751eQ, null);
    }

    private final void X(String str, final InterfaceC0341h interfaceC0341h) {
        C0751e c0751eQ;
        int i7;
        if (!e()) {
            c0751eQ = y.f10369m;
            i7 = 2;
        } else if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Please provide a valid product type.");
            c0751eQ = y.f10363g;
            i7 = 50;
        } else {
            if (T(new CallableC0763q(this, str, interfaceC0341h), 30000L, new Runnable() { // from class: com.android.billingclient.api.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10312m.J(interfaceC0341h);
                }
            }, O()) != null) {
                return;
            }
            c0751eQ = Q();
            i7 = 25;
        }
        U(w.a(i7, 9, c0751eQ));
        interfaceC0341h.a(c0751eQ, AbstractC1299j.q());
    }

    private final boolean Y() {
        return this.f10227v && this.f10231z.b();
    }

    private final void Z(C0751e c0751e, int i7, int i8) {
        W1 w12 = null;
        S1 s12 = null;
        if (c0751e.b() == 0) {
            int i9 = w.f10349a;
            try {
                V1 v1C = W1.C();
                v1C.p(5);
                r2 r2VarB = t2.B();
                r2VarB.m(i8);
                v1C.m((t2) r2VarB.h());
                w12 = (W1) v1C.h();
            } catch (Exception e7) {
                com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to create logging payload", e7);
            }
            V(w12);
            return;
        }
        int i10 = w.f10349a;
        try {
            R1 r1E = S1.E();
            Y1 y1E = C1274c2.E();
            y1E.q(c0751e.b());
            y1E.p(c0751e.a());
            y1E.r(i7);
            r1E.m(y1E);
            r1E.q(5);
            r2 r2VarB2 = t2.B();
            r2VarB2.m(i8);
            r1E.p((t2) r2VarB2.h());
            s12 = (S1) r1E.h();
        } catch (Exception e8) {
            com.google.android.gms.internal.play_billing.A.j("BillingLogger", "Unable to create logging payload", e8);
        }
        U(s12);
    }

    static /* bridge */ /* synthetic */ v f0(C0749c c0749c, String str) {
        v vVar;
        Bundle bundleO;
        J jA;
        C0751e c0751eA;
        com.google.android.gms.internal.play_billing.A.h("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleC = com.google.android.gms.internal.play_billing.A.c(c0749c.f10219n, c0749c.f10227v, c0749c.f10231z.a(), c0749c.f10231z.b(), c0749c.f10207b);
        String string = null;
        while (c0749c.f10217l) {
            try {
                bundleO = c0749c.f10212g.o(6, c0749c.f10210e.getPackageName(), str, string, bundleC);
                jA = K.a(bundleO, "BillingClient", "getPurchaseHistory()");
                c0751eA = jA.a();
            } catch (RemoteException e7) {
                com.google.android.gms.internal.play_billing.A.j("BillingClient", "Got exception trying to get purchase history, try to reconnect", e7);
                C0751e c0751e = y.f10369m;
                c0749c.U(w.a(59, 11, c0751e));
                vVar = new v(c0751e, null);
            }
            if (c0751eA != y.f10368l) {
                c0749c.U(w.a(jA.b(), 11, c0751eA));
                return new v(c0751eA, null);
            }
            ArrayList<String> stringArrayList = bundleO.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundleO.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundleO.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            boolean z6 = false;
            for (int i7 = 0; i7 < stringArrayList2.size(); i7++) {
                String str2 = stringArrayList2.get(i7);
                String str3 = stringArrayList3.get(i7);
                com.google.android.gms.internal.play_billing.A.h("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i7))));
                try {
                    PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                    if (TextUtils.isEmpty(purchaseHistoryRecord.e())) {
                        com.google.android.gms.internal.play_billing.A.i("BillingClient", "BUG: empty/null token!");
                        z6 = true;
                    }
                    arrayList.add(purchaseHistoryRecord);
                } catch (JSONException e8) {
                    com.google.android.gms.internal.play_billing.A.j("BillingClient", "Got an exception trying to decode the purchase!", e8);
                    C0751e c0751e2 = y.f10366j;
                    c0749c.U(w.a(51, 11, c0751e2));
                    vVar = new v(c0751e2, null);
                }
            }
            if (z6) {
                c0749c.U(w.a(26, 11, y.f10366j));
            }
            string = bundleO.getString("INAPP_CONTINUATION_TOKEN");
            com.google.android.gms.internal.play_billing.A.h("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            if (TextUtils.isEmpty(string)) {
                vVar = new v(y.f10368l, arrayList);
                return vVar;
            }
        }
        com.google.android.gms.internal.play_billing.A.i("BillingClient", "getPurchaseHistory is not supported on current device");
        return new v(y.f10373q, null);
    }

    private void l(Context context, InterfaceC0342i interfaceC0342i, C0752f c0752f, C0.u uVar, String str, x xVar) {
        this.f10210e = context.getApplicationContext();
        C1310l2 c1310l2D = C1314m2.D();
        c1310l2D.q(str);
        c1310l2D.p(this.f10210e.getPackageName());
        if (xVar == null) {
            xVar = new z(this.f10210e, (C1314m2) c1310l2D.h());
        }
        this.f10211f = xVar;
        if (interfaceC0342i == null) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f10209d = new M(this.f10210e, interfaceC0342i, null, uVar, null, this.f10211f);
        this.f10231z = c0752f;
        this.f10204A = uVar != null;
        this.f10210e.getPackageName();
    }

    final /* synthetic */ void D(InterfaceC0335b interfaceC0335b) {
        C0751e c0751e = y.f10370n;
        U(w.a(24, 3, c0751e));
        interfaceC0335b.a(c0751e);
    }

    final /* synthetic */ void E(C0751e c0751e) {
        if (this.f10209d.d() != null) {
            this.f10209d.d().onPurchasesUpdated(c0751e, null);
        } else {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ void F(InterfaceC0338e interfaceC0338e, C0337d c0337d) {
        C0751e c0751e = y.f10370n;
        U(w.a(24, 4, c0751e));
        interfaceC0338e.a(c0751e, c0337d.a());
    }

    final /* synthetic */ void G(InterfaceC0339f interfaceC0339f) {
        C0751e c0751e = y.f10370n;
        U(w.a(24, 7, c0751e));
        interfaceC0339f.a(c0751e, new ArrayList());
    }

    final /* synthetic */ void I(InterfaceC0340g interfaceC0340g) {
        C0751e c0751e = y.f10370n;
        U(w.a(24, 11, c0751e));
        interfaceC0340g.a(c0751e, null);
    }

    final /* synthetic */ void J(InterfaceC0341h interfaceC0341h) {
        C0751e c0751e = y.f10370n;
        U(w.a(24, 9, c0751e));
        interfaceC0341h.a(c0751e, AbstractC1299j.q());
    }

    @Override // com.android.billingclient.api.AbstractC0748b
    public final void a(final C0334a c0334a, final InterfaceC0335b interfaceC0335b) {
        C0751e c0751eQ;
        int i7;
        if (!e()) {
            c0751eQ = y.f10369m;
            i7 = 2;
        } else if (TextUtils.isEmpty(c0334a.a())) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Please provide a valid purchase token.");
            c0751eQ = y.f10365i;
            i7 = 26;
        } else if (!this.f10219n) {
            c0751eQ = y.f10358b;
            i7 = 27;
        } else {
            if (T(new Callable() { // from class: com.android.billingclient.api.P
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f10178a.j0(c0334a, interfaceC0335b);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.Q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10195m.D(interfaceC0335b);
                }
            }, O()) != null) {
                return;
            }
            c0751eQ = Q();
            i7 = 25;
        }
        U(w.a(i7, 3, c0751eQ));
        interfaceC0335b.a(c0751eQ);
    }

    @Override // com.android.billingclient.api.AbstractC0748b
    public final void b(final C0337d c0337d, final InterfaceC0338e interfaceC0338e) {
        C0751e c0751eQ;
        int i7;
        if (!e()) {
            c0751eQ = y.f10369m;
            i7 = 2;
        } else {
            if (T(new Callable() { // from class: com.android.billingclient.api.j
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f10314a.k0(c0337d, interfaceC0338e);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10317m.F(interfaceC0338e, c0337d);
                }
            }, O()) != null) {
                return;
            }
            c0751eQ = Q();
            i7 = 25;
        }
        U(w.a(i7, 4, c0751eQ));
        interfaceC0338e.a(c0751eQ, c0337d.a());
    }

    final /* synthetic */ Bundle b0(int i7, String str, String str2, C0750d c0750d, Bundle bundle) {
        return this.f10212g.N(i7, this.f10210e.getPackageName(), str, str2, null, bundle);
    }

    @Override // com.android.billingclient.api.AbstractC0748b
    public final void c() {
        V(w.c(12));
        try {
            try {
                if (this.f10209d != null) {
                    this.f10209d.f();
                }
                if (this.f10213h != null) {
                    this.f10213h.c();
                }
                if (this.f10213h != null && this.f10212g != null) {
                    com.google.android.gms.internal.play_billing.A.h("BillingClient", "Unbinding from service.");
                    this.f10210e.unbindService(this.f10213h);
                    this.f10213h = null;
                }
                this.f10212g = null;
                ExecutorService executorService = this.f10205B;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f10205B = null;
                }
            } catch (Exception e7) {
                com.google.android.gms.internal.play_billing.A.j("BillingClient", "There was an exception while ending connection!", e7);
            }
            this.f10206a = 3;
        } catch (Throwable th) {
            this.f10206a = 3;
            throw th;
        }
    }

    final /* synthetic */ Bundle c0(String str, String str2) {
        return this.f10212g.A(3, this.f10210e.getPackageName(), str, str2, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    @Override // com.android.billingclient.api.AbstractC0748b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0751e d(String str) {
        if (!e()) {
            C0751e c0751e = y.f10369m;
            if (c0751e.b() != 0) {
                U(w.a(2, 5, c0751e));
            } else {
                V(w.c(5));
            }
            return c0751e;
        }
        C0751e c0751e2 = y.f10357a;
        switch (str) {
            case "subscriptions":
                C0751e c0751e3 = this.f10214i ? y.f10368l : y.f10371o;
                Z(c0751e3, 9, 2);
                return c0751e3;
            case "subscriptionsUpdate":
                C0751e c0751e4 = this.f10215j ? y.f10368l : y.f10372p;
                Z(c0751e4, 10, 3);
                return c0751e4;
            case "priceChangeConfirmation":
                C0751e c0751e5 = this.f10218m ? y.f10368l : y.f10374r;
                Z(c0751e5, 35, 4);
                return c0751e5;
            case "bbb":
                C0751e c0751e6 = this.f10221p ? y.f10368l : y.f10379w;
                Z(c0751e6, 30, 5);
                return c0751e6;
            case "aaa":
                C0751e c0751e7 = this.f10223r ? y.f10368l : y.f10375s;
                Z(c0751e7, 31, 6);
                return c0751e7;
            case "ddd":
                C0751e c0751e8 = this.f10222q ? y.f10368l : y.f10377u;
                Z(c0751e8, 21, 7);
                return c0751e8;
            case "ccc":
                C0751e c0751e9 = this.f10224s ? y.f10368l : y.f10376t;
                Z(c0751e9, 19, 8);
                return c0751e9;
            case "eee":
                C0751e c0751e10 = this.f10224s ? y.f10368l : y.f10376t;
                Z(c0751e10, 61, 9);
                return c0751e10;
            case "fff":
                C0751e c0751e11 = this.f10225t ? y.f10368l : y.f10378v;
                Z(c0751e11, 20, 10);
                return c0751e11;
            case "ggg":
                C0751e c0751e12 = this.f10226u ? y.f10368l : y.f10351A;
                Z(c0751e12, 32, 11);
                return c0751e12;
            case "hhh":
                C0751e c0751e13 = this.f10226u ? y.f10368l : y.f10352B;
                Z(c0751e13, 33, 12);
                return c0751e13;
            case "iii":
                C0751e c0751e14 = this.f10228w ? y.f10368l : y.f10354D;
                Z(c0751e14, 60, 13);
                return c0751e14;
            case "jjj":
                C0751e c0751e15 = this.f10229x ? y.f10368l : y.f10355E;
                Z(c0751e15, 66, 14);
                return c0751e15;
            case "kkk":
                C0751e c0751e16 = this.f10230y ? y.f10368l : y.f10381y;
                Z(c0751e16, 103, 18);
                return c0751e16;
            default:
                com.google.android.gms.internal.play_billing.A.i("BillingClient", "Unsupported feature: ".concat(str));
                C0751e c0751e17 = y.f10382z;
                Z(c0751e17, 34, 1);
                return c0751e17;
        }
    }

    @Override // com.android.billingclient.api.AbstractC0748b
    public final boolean e() {
        return (this.f10206a != 2 || this.f10212g == null || this.f10213h == null) ? false : true;
    }

    @Override // com.android.billingclient.api.AbstractC0748b
    public final C0751e f(Activity activity, final C0750d c0750d) {
        String str;
        String str2;
        Future futureT;
        int i7;
        boolean z6;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z7;
        String str9;
        int i8;
        final int i9;
        if (this.f10209d == null || this.f10209d.d() == null) {
            C0751e c0751e = y.f10356F;
            U(w.a(12, 2, c0751e));
            return c0751e;
        }
        if (!e()) {
            C0751e c0751e2 = y.f10369m;
            U(w.a(2, 2, c0751e2));
            P(c0751e2);
            return c0751e2;
        }
        ArrayList arrayListG = c0750d.g();
        List listH = c0750d.h();
        androidx.appcompat.app.y.a(AbstractC1319o.a(arrayListG, null));
        C0750d.b bVar = (C0750d.b) AbstractC1319o.a(listH, null);
        final String strD = bVar.b().d();
        final String strE = bVar.b().e();
        String str10 = "BillingClient";
        if (strE.equals("subs") && !this.f10214i) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Current client doesn't support subscriptions.");
            C0751e c0751e3 = y.f10371o;
            U(w.a(9, 2, c0751e3));
            P(c0751e3);
            return c0751e3;
        }
        if (c0750d.q() && !this.f10217l) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Current client doesn't support extra params for buy intent.");
            C0751e c0751e4 = y.f10364h;
            U(w.a(18, 2, c0751e4));
            P(c0751e4);
            return c0751e4;
        }
        if (arrayListG.size() > 1 && !this.f10224s) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Current client doesn't support multi-item purchases.");
            C0751e c0751e5 = y.f10376t;
            U(w.a(19, 2, c0751e5));
            P(c0751e5);
            return c0751e5;
        }
        if (!listH.isEmpty() && !this.f10225t) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            C0751e c0751e6 = y.f10378v;
            U(w.a(20, 2, c0751e6));
            P(c0751e6);
            return c0751e6;
        }
        if (this.f10217l) {
            boolean z8 = this.f10219n;
            boolean z9 = this.f10227v;
            boolean zA = this.f10231z.a();
            boolean zB = this.f10231z.b();
            boolean z10 = this.f10204A;
            String str11 = this.f10207b;
            str = "BUY_INTENT";
            final Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str11);
            if (c0750d.b() != 0) {
                bundle.putInt("prorationMode", c0750d.b());
            }
            if (!TextUtils.isEmpty(c0750d.c())) {
                bundle.putString("accountId", c0750d.c());
            }
            if (!TextUtils.isEmpty(c0750d.d())) {
                bundle.putString("obfuscatedProfileId", c0750d.d());
            }
            if (c0750d.p()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c0750d.e())) {
                bundle.putString("oldSkuPurchaseToken", c0750d.e());
            }
            String str12 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(c0750d.f())) {
                bundle.putString("originalExternalTransactionId", c0750d.f());
                str12 = null;
            }
            if (!TextUtils.isEmpty(str12)) {
                bundle.putString("paymentsPurchaseParams", str12);
            }
            if (z8 && zA) {
                z6 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z6 = true;
            }
            if (z9 && zB) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z6);
            }
            if (z10) {
                bundle.putBoolean("enableAlternativeBilling", z6);
            }
            if (arrayListG.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(listH.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listH.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                str3 = strE;
                ArrayList<String> arrayList5 = new ArrayList<>();
                str4 = "proxyPackageVersion";
                str5 = strD;
                int i10 = 0;
                while (i10 < listH.size()) {
                    C0750d.b bVar2 = (C0750d.b) listH.get(i10);
                    C0753g c0753gB = bVar2.b();
                    if (c0753gB.i().isEmpty()) {
                        str7 = str10;
                    } else {
                        str7 = str10;
                        arrayList3.add(c0753gB.i());
                    }
                    arrayList4.add(bVar2.c());
                    if (!TextUtils.isEmpty(c0753gB.j())) {
                        arrayList5.add(c0753gB.j());
                    }
                    if (i10 > 0) {
                        arrayList.add(((C0750d.b) listH.get(i10)).b().d());
                        arrayList2.add(((C0750d.b) listH.get(i10)).b().e());
                    }
                    i10++;
                    str10 = str7;
                }
                str6 = str10;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList6 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it = arrayListG.iterator();
                if (it.hasNext()) {
                    androidx.appcompat.app.y.a(it.next());
                    throw null;
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (arrayListG.size() > 1) {
                    ArrayList<String> arrayList7 = new ArrayList<>(arrayListG.size() - 1);
                    ArrayList<String> arrayList8 = new ArrayList<>(arrayListG.size() - 1);
                    if (1 < arrayListG.size()) {
                        androidx.appcompat.app.y.a(arrayListG.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList7);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList8);
                }
                str4 = "proxyPackageVersion";
                str5 = strD;
                str3 = strE;
                str6 = "BillingClient";
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f10222q) {
                C0751e c0751e7 = y.f10377u;
                U(w.a(21, 2, c0751e7));
                P(c0751e7);
                return c0751e7;
            }
            if (bVar == null || TextUtils.isEmpty(bVar.b().h())) {
                str8 = null;
                z7 = false;
            } else {
                bundle.putString("skuPackageName", bVar.b().h());
                str8 = null;
                z7 = true;
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("accountName", str8);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                str2 = str6;
                com.google.android.gms.internal.play_billing.A.i(str2, "Activity's intent is null.");
            } else {
                str2 = str6;
                if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                    String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                    bundle.putString("proxyPackage", stringExtra);
                    try {
                        str9 = str4;
                        try {
                            bundle.putString(str9, this.f10210e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                        } catch (PackageManager.NameNotFoundException unused) {
                            bundle.putString(str9, "package not found");
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str9 = str4;
                    }
                }
            }
            if (this.f10225t && !listH.isEmpty()) {
                i8 = 17;
            } else if (this.f10223r && z7) {
                i8 = 15;
            } else if (this.f10219n) {
                i9 = 9;
                final String str13 = str5;
                final String str14 = str3;
                futureT = T(new Callable() { // from class: com.android.billingclient.api.o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f10327a.b0(i9, str13, str14, c0750d, bundle);
                    }
                }, 5000L, null, this.f10208c);
                i7 = 78;
            } else {
                i8 = 6;
            }
            i9 = i8;
            final String str132 = str5;
            final String str142 = str3;
            futureT = T(new Callable() { // from class: com.android.billingclient.api.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f10327a.b0(i9, str132, str142, c0750d, bundle);
                }
            }, 5000L, null, this.f10208c);
            i7 = 78;
        } else {
            str = "BUY_INTENT";
            str2 = "BillingClient";
            futureT = T(new Callable() { // from class: com.android.billingclient.api.O
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f10175a.c0(strD, strE);
                }
            }, 5000L, null, this.f10208c);
            i7 = 80;
        }
        try {
            if (futureT == null) {
                C0751e c0751e8 = y.f10369m;
                U(w.a(25, 2, c0751e8));
                P(c0751e8);
                return c0751e8;
            }
            Bundle bundle2 = (Bundle) futureT.get(5000L, TimeUnit.MILLISECONDS);
            int iB = com.google.android.gms.internal.play_billing.A.b(bundle2, str2);
            String strE2 = com.google.android.gms.internal.play_billing.A.e(bundle2, str2);
            if (iB == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                String str15 = str;
                intent2.putExtra(str15, (PendingIntent) bundle2.getParcelable(str15));
                activity.startActivity(intent2);
                return y.f10368l;
            }
            com.google.android.gms.internal.play_billing.A.i(str2, "Unable to buy item, Error response code: " + iB);
            C0751e c0751eA = y.a(iB, strE2);
            if (bundle2 != null) {
                i7 = 23;
            }
            U(w.a(i7, 2, c0751eA));
            P(c0751eA);
            return c0751eA;
        } catch (CancellationException e7) {
            e = e7;
            com.google.android.gms.internal.play_billing.A.j(str2, "Time out while launching billing flow. Try to reconnect", e);
            C0751e c0751e9 = y.f10370n;
            U(w.a(4, 2, c0751e9));
            P(c0751e9);
            return c0751e9;
        } catch (TimeoutException e8) {
            e = e8;
            com.google.android.gms.internal.play_billing.A.j(str2, "Time out while launching billing flow. Try to reconnect", e);
            C0751e c0751e92 = y.f10370n;
            U(w.a(4, 2, c0751e92));
            P(c0751e92);
            return c0751e92;
        } catch (Exception e9) {
            com.google.android.gms.internal.play_billing.A.j(str2, "Exception while launching billing flow. Try to reconnect", e9);
            C0751e c0751e10 = y.f10369m;
            U(w.a(5, 2, c0751e10));
            P(c0751e10);
            return c0751e10;
        }
    }

    @Override // com.android.billingclient.api.AbstractC0748b
    public final void h(final C0754h c0754h, final InterfaceC0339f interfaceC0339f) {
        C0751e c0751eQ;
        ArrayList arrayList;
        if (!e()) {
            c0751eQ = y.f10369m;
            U(w.a(2, 7, c0751eQ));
            arrayList = new ArrayList();
        } else if (!this.f10225t) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Querying product details is not supported.");
            c0751eQ = y.f10378v;
            U(w.a(20, 7, c0751eQ));
            arrayList = new ArrayList();
        } else {
            if (T(new Callable() { // from class: com.android.billingclient.api.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f10322a.l0(c0754h, interfaceC0339f);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10325m.G(interfaceC0339f);
                }
            }, O()) != null) {
                return;
            }
            c0751eQ = Q();
            U(w.a(25, 7, c0751eQ));
            arrayList = new ArrayList();
        }
        interfaceC0339f.a(c0751eQ, arrayList);
    }

    @Override // com.android.billingclient.api.AbstractC0748b
    public final void i(C0343j c0343j, InterfaceC0340g interfaceC0340g) {
        W(c0343j.b(), interfaceC0340g);
    }

    @Override // com.android.billingclient.api.AbstractC0748b
    public final void j(C0344k c0344k, InterfaceC0341h interfaceC0341h) {
        X(c0344k.b(), interfaceC0341h);
    }

    final /* synthetic */ Object j0(C0334a c0334a, InterfaceC0335b interfaceC0335b) {
        C0751e c0751eA;
        try {
            J2 j22 = this.f10212g;
            String packageName = this.f10210e.getPackageName();
            String strA = c0334a.a();
            String str = this.f10207b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle bundleF0 = j22.f0(9, packageName, strA, bundle);
            c0751eA = y.a(com.google.android.gms.internal.play_billing.A.b(bundleF0, "BillingClient"), com.google.android.gms.internal.play_billing.A.e(bundleF0, "BillingClient"));
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.A.j("BillingClient", "Error acknowledge purchase!", e7);
            c0751eA = y.f10369m;
            U(w.a(28, 3, c0751eA));
        }
        interfaceC0335b.a(c0751eA);
        return null;
    }

    @Override // com.android.billingclient.api.AbstractC0748b
    public final void k(InterfaceC0336c interfaceC0336c) {
        if (e()) {
            com.google.android.gms.internal.play_billing.A.h("BillingClient", "Service connection is valid. No need to re-initialize.");
            V(w.c(6));
            interfaceC0336c.a(y.f10368l);
            return;
        }
        int i7 = 1;
        if (this.f10206a == 1) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Client is already in the process of connecting to billing service.");
            C0751e c0751e = y.f10360d;
            U(w.a(37, 6, c0751e));
            interfaceC0336c.a(c0751e);
            return;
        }
        if (this.f10206a == 3) {
            com.google.android.gms.internal.play_billing.A.i("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            C0751e c0751e2 = y.f10369m;
            U(w.a(38, 6, c0751e2));
            interfaceC0336c.a(c0751e2);
            return;
        }
        this.f10206a = 1;
        com.google.android.gms.internal.play_billing.A.h("BillingClient", "Starting in-app billing setup.");
        this.f10213h = new u(this, interfaceC0336c, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f10210e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i7 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.A.i("BillingClient", "The device doesn't have valid Play Store.");
                    i7 = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f10207b);
                    if (this.f10210e.bindService(intent2, this.f10213h, 1)) {
                        com.google.android.gms.internal.play_billing.A.h("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.A.i("BillingClient", "Connection to Billing service is blocked.");
                        i7 = 39;
                    }
                }
            }
        }
        this.f10206a = 0;
        com.google.android.gms.internal.play_billing.A.h("BillingClient", "Billing service unavailable on device.");
        C0751e c0751e3 = y.f10359c;
        U(w.a(i7, 6, c0751e3));
        interfaceC0336c.a(c0751e3);
    }

    final /* synthetic */ Object k0(C0337d c0337d, InterfaceC0338e interfaceC0338e) {
        int iH;
        String strE;
        String strA = c0337d.a();
        try {
            com.google.android.gms.internal.play_billing.A.h("BillingClient", "Consuming purchase with token: " + strA);
            if (this.f10219n) {
                J2 j22 = this.f10212g;
                String packageName = this.f10210e.getPackageName();
                boolean z6 = this.f10219n;
                String str = this.f10207b;
                Bundle bundle = new Bundle();
                if (z6) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                Bundle bundleI = j22.i(9, packageName, strA, bundle);
                iH = bundleI.getInt("RESPONSE_CODE");
                strE = com.google.android.gms.internal.play_billing.A.e(bundleI, "BillingClient");
            } else {
                iH = this.f10212g.h(3, this.f10210e.getPackageName(), strA);
                strE = "";
            }
            C0751e c0751eA = y.a(iH, strE);
            if (iH == 0) {
                com.google.android.gms.internal.play_billing.A.h("BillingClient", "Successfully consumed purchase.");
            } else {
                com.google.android.gms.internal.play_billing.A.i("BillingClient", "Error consuming purchase with token. Response code: " + iH);
                U(w.a(23, 4, c0751eA));
            }
            interfaceC0338e.a(c0751eA, strA);
            return null;
        } catch (Exception e7) {
            com.google.android.gms.internal.play_billing.A.j("BillingClient", "Error consuming purchase!", e7);
            C0751e c0751e = y.f10369m;
            U(w.a(29, 4, c0751e));
            interfaceC0338e.a(c0751e, strA);
            return null;
        }
    }

    final /* synthetic */ Object l0(C0754h c0754h, InterfaceC0339f interfaceC0339f) {
        String strE;
        int iB;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList = new ArrayList();
        String strC = c0754h.c();
        AbstractC1299j abstractC1299jB = c0754h.b();
        int size = abstractC1299jB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                strE = "";
                iB = 0;
                break;
            }
            int i11 = i10 + 20;
            ArrayList arrayList2 = new ArrayList(abstractC1299jB.subList(i10, i11 > size ? size : i11));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(((C0754h.b) arrayList2.get(i12)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f10207b);
            try {
                J2 j22 = this.f10212g;
                int i13 = true != this.f10228w ? 17 : 20;
                String packageName = this.f10210e.getPackageName();
                boolean zY = Y();
                String str = this.f10207b;
                R(c0754h);
                R(c0754h);
                R(c0754h);
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zY) {
                    bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                AbstractC1299j abstractC1299j = abstractC1299jB;
                int i14 = 0;
                boolean z6 = false;
                boolean z7 = false;
                while (i14 < size3) {
                    C0754h.b bVar = (C0754h.b) arrayList2.get(i14);
                    ArrayList arrayList6 = arrayList2;
                    arrayList4.add(null);
                    z6 |= !TextUtils.isEmpty(null);
                    String strC2 = bVar.c();
                    int i15 = size3;
                    if (strC2.equals("first_party")) {
                        AbstractC1267b.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z7 = true;
                    }
                    i14++;
                    size3 = i15;
                    arrayList2 = arrayList6;
                }
                if (z6) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z7 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                i8 = 7;
                try {
                    Bundle bundleF = j22.f(i13, packageName, strC, bundle, bundle2);
                    strE = "Item is unavailable for purchase.";
                    if (bundleF == null) {
                        com.google.android.gms.internal.play_billing.A.i("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        i9 = 44;
                        break;
                    }
                    if (bundleF.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = bundleF.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.A.i("BillingClient", "queryProductDetailsAsync got null response list");
                            i9 = 46;
                            break;
                        }
                        for (int i16 = 0; i16 < stringArrayList.size(); i16++) {
                            try {
                                C0753g c0753g = new C0753g(stringArrayList.get(i16));
                                com.google.android.gms.internal.play_billing.A.h("BillingClient", "Got product details: ".concat(c0753g.toString()));
                                arrayList.add(c0753g);
                            } catch (JSONException e7) {
                                com.google.android.gms.internal.play_billing.A.j("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e7);
                                strE = "Error trying to decode SkuDetails.";
                                i7 = 6;
                                U(w.a(47, 7, y.a(6, "Error trying to decode SkuDetails.")));
                                iB = i7;
                                interfaceC0339f.a(y.a(iB, strE), arrayList);
                                return null;
                            }
                        }
                        i10 = i11;
                        abstractC1299jB = abstractC1299j;
                    } else {
                        iB = com.google.android.gms.internal.play_billing.A.b(bundleF, "BillingClient");
                        strE = com.google.android.gms.internal.play_billing.A.e(bundleF, "BillingClient");
                        if (iB != 0) {
                            com.google.android.gms.internal.play_billing.A.i("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iB);
                            U(w.a(23, 7, y.a(iB, strE)));
                        } else {
                            com.google.android.gms.internal.play_billing.A.i("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                            U(w.a(45, 7, y.a(6, strE)));
                            iB = 6;
                        }
                    }
                } catch (Exception e8) {
                    e = e8;
                    i7 = 6;
                    com.google.android.gms.internal.play_billing.A.j("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    U(w.a(43, i8, y.f10366j));
                    strE = "An internal error occurred.";
                    iB = i7;
                    interfaceC0339f.a(y.a(iB, strE), arrayList);
                    return null;
                }
            } catch (Exception e9) {
                e = e9;
                i7 = 6;
                i8 = 7;
            }
        }
        U(w.a(i9, 7, y.f10353C));
        iB = 4;
        interfaceC0339f.a(y.a(iB, strE), arrayList);
        return null;
    }

    C0749c(String str, C0752f c0752f, Context context, InterfaceC0342i interfaceC0342i, C0.u uVar, x xVar, ExecutorService executorService) {
        String strS = S();
        this.f10206a = 0;
        this.f10208c = new Handler(Looper.getMainLooper());
        this.f10216k = 0;
        this.f10207b = strS;
        l(context, interfaceC0342i, c0752f, null, strS, null);
    }

    C0749c(String str, C0752f c0752f, Context context, C0.A a7, x xVar, ExecutorService executorService) {
        this.f10206a = 0;
        this.f10208c = new Handler(Looper.getMainLooper());
        this.f10216k = 0;
        this.f10207b = S();
        this.f10210e = context.getApplicationContext();
        C1310l2 c1310l2D = C1314m2.D();
        c1310l2D.q(S());
        c1310l2D.p(this.f10210e.getPackageName());
        this.f10211f = new z(this.f10210e, (C1314m2) c1310l2D.h());
        com.google.android.gms.internal.play_billing.A.i("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f10209d = new M(this.f10210e, null, null, null, null, this.f10211f);
        this.f10231z = c0752f;
        this.f10210e.getPackageName();
    }
}
