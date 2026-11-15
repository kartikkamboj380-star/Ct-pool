package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.C1168o6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import w3.C2191b;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
public final class F4 extends AbstractC1525y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC1382d5 f15448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC2195f f15449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Boolean f15450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC1487t f15451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1528y5 f15452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f15453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractC1487t f15454i;

    protected F4(S2 s22) {
        super(s22);
        this.f15453h = new ArrayList();
        this.f15452g = new C1528y5(s22.zzb());
        this.f15448c = new ServiceConnectionC1382d5(this);
        this.f15451f = new G4(this, s22);
        this.f15454i = new T4(this, s22);
    }

    static /* synthetic */ void I(F4 f42, ComponentName componentName) {
        f42.l();
        if (f42.f15449d != null) {
            f42.f15449d = null;
            f42.d().I().b("Disconnected from device MeasurementService", componentName);
            f42.l();
            f42.X();
        }
    }

    private final void L(Runnable runnable) {
        l();
        if (e0()) {
            runnable.run();
        } else {
            if (this.f15453h.size() >= 1000) {
                d().E().a("Discarding data. Max runnable queue size reached");
                return;
            }
            this.f15453h.add(runnable);
            this.f15454i.b(60000L);
            X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        l();
        d().I().b("Processing queued up service tasks", Integer.valueOf(this.f15453h.size()));
        Iterator it = this.f15453h.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e7) {
                d().E().b("Task exception while flushing queue", e7);
            }
        }
        this.f15453h.clear();
        this.f15454i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        l();
        this.f15452g.c();
        this.f15451f.b(((Long) G.f15480M.a(null)).longValue());
    }

    private final M5 n0(boolean z6) {
        return n().z(z6 ? d().M() : null);
    }

    static /* synthetic */ void p0(F4 f42) {
        f42.l();
        if (f42.e0()) {
            f42.d().I().a("Inactivity, disconnecting from the service");
            f42.Y();
        }
    }

    public final void A(Bundle bundle) {
        l();
        t();
        L(new S4(this, n0(false), bundle));
    }

    public final void B(com.google.android.gms.internal.measurement.U0 u02) {
        l();
        t();
        L(new P4(this, n0(false), u02));
    }

    public final void C(com.google.android.gms.internal.measurement.U0 u02, E e7, String str) {
        l();
        t();
        if (h().s(12451000) == 0) {
            L(new V4(this, e7, str, u02));
        } else {
            d().J().a("Not bundling data. Service unavailable or out of date");
            h().T(u02, new byte[0]);
        }
    }

    protected final void D(com.google.android.gms.internal.measurement.U0 u02, String str, String str2) {
        l();
        t();
        L(new RunnableC1368b5(this, str, str2, n0(false), u02));
    }

    protected final void E(com.google.android.gms.internal.measurement.U0 u02, String str, String str2, boolean z6) {
        l();
        t();
        L(new I4(this, str, str2, n0(false), z6, u02));
    }

    protected final void F(C1383e c1383e) {
        Preconditions.checkNotNull(c1383e);
        l();
        t();
        L(new Z4(this, true, n0(true), o().C(c1383e), new C1383e(c1383e), c1383e));
    }

    protected final void G(E e7, String str) {
        Preconditions.checkNotNull(e7);
        l();
        t();
        L(new W4(this, true, n0(true), o().D(e7), e7, str));
    }

    protected final void H(C1520x4 c1520x4) {
        l();
        t();
        L(new Q4(this, c1520x4));
    }

    protected final void K(Y5 y52) {
        l();
        t();
        L(new J4(this, n0(true), o().E(y52), y52));
    }

    public final void M(AtomicReference atomicReference) {
        l();
        t();
        L(new L4(this, atomicReference, n0(false)));
    }

    protected final void N(AtomicReference atomicReference, Bundle bundle) {
        l();
        t();
        L(new K4(this, atomicReference, n0(false), bundle));
    }

    protected final void O(AtomicReference atomicReference, String str, String str2, String str3) {
        l();
        t();
        L(new Y4(this, atomicReference, str, str2, str3, n0(false)));
    }

    protected final void P(AtomicReference atomicReference, String str, String str2, String str3, boolean z6) {
        l();
        t();
        L(new RunnableC1361a5(this, atomicReference, str, str2, str3, n0(false), z6));
    }

    protected final void Q(InterfaceC2195f interfaceC2195f) {
        l();
        Preconditions.checkNotNull(interfaceC2195f);
        this.f15449d = interfaceC2195f;
        k0();
        j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void R(InterfaceC2195f interfaceC2195f, AbstractSafeParcelable abstractSafeParcelable, M5 m52) {
        int size;
        C1463p2 c1463p2E;
        String str;
        long jElapsedRealtime;
        long j7;
        long jCurrentTimeMillis;
        l();
        t();
        int i7 = 100;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i7 == i9; i9 = 100) {
            ArrayList arrayList = new ArrayList();
            List listA = o().A(i9);
            if (listA != null) {
                arrayList.addAll(listA);
                size = listA.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < i9) {
                arrayList.add(abstractSafeParcelable);
            }
            boolean zR = b().r(G.f15467F0);
            int size2 = arrayList.size();
            int i10 = 0;
            while (i10 < size2) {
                int i11 = i10 + 1;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i10);
                if (abstractSafeParcelable2 instanceof E) {
                    if (zR) {
                        try {
                            jCurrentTimeMillis = this.f16325a.zzb().currentTimeMillis();
                            try {
                                jElapsedRealtime = this.f16325a.zzb().elapsedRealtime();
                            } catch (RemoteException e7) {
                                e = e7;
                                jElapsedRealtime = 0;
                                j7 = jCurrentTimeMillis;
                                d().E().b("Failed to send event to the service", e);
                                if (zR) {
                                }
                                i10 = i11;
                            }
                        } catch (RemoteException e8) {
                            e = e8;
                            jElapsedRealtime = 0;
                            j7 = 0;
                            d().E().b("Failed to send event to the service", e);
                            if (zR) {
                            }
                        }
                    } else {
                        jCurrentTimeMillis = 0;
                        jElapsedRealtime = 0;
                    }
                    try {
                        interfaceC2195f.g0((E) abstractSafeParcelable2, m52);
                        if (zR) {
                            d().I().a("Logging telemetry for logEvent from database");
                            C1435l2.a(this.f16325a).b(36301, 0, jCurrentTimeMillis, this.f16325a.zzb().currentTimeMillis(), (int) (this.f16325a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (RemoteException e9) {
                        e = e9;
                        j7 = jCurrentTimeMillis;
                        d().E().b("Failed to send event to the service", e);
                        if (zR && j7 != 0) {
                            C1435l2.a(this.f16325a).b(36301, 13, j7, this.f16325a.zzb().currentTimeMillis(), (int) (this.f16325a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } else if (abstractSafeParcelable2 instanceof Y5) {
                    try {
                        interfaceC2195f.s((Y5) abstractSafeParcelable2, m52);
                    } catch (RemoteException e10) {
                        e = e10;
                        c1463p2E = d().E();
                        str = "Failed to send user property to the service";
                        c1463p2E.b(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof C1383e) {
                    try {
                        interfaceC2195f.y((C1383e) abstractSafeParcelable2, m52);
                    } catch (RemoteException e11) {
                        e = e11;
                        c1463p2E = d().E();
                        str = "Failed to send conditional user property to the service";
                        c1463p2E.b(str, e);
                    }
                } else {
                    d().E().a("Discarding data. Unrecognized parcel type.");
                }
                i10 = i11;
            }
            i8++;
            i7 = size;
        }
    }

    protected final void S(boolean z6) {
        l();
        t();
        if ((!C1168o6.a() || !b().r(G.f15505Y0)) && z6) {
            o().F();
        }
        if (g0()) {
            L(new X4(this, n0(false)));
        }
    }

    protected final C2191b T() {
        l();
        t();
        InterfaceC2195f interfaceC2195f = this.f15449d;
        if (interfaceC2195f == null) {
            X();
            d().D().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        M5 m5N0 = n0(false);
        Preconditions.checkNotNull(m5N0);
        try {
            C2191b c2191bP = interfaceC2195f.P(m5N0);
            k0();
            return c2191bP;
        } catch (RemoteException e7) {
            d().E().b("Failed to get consents; remote exception", e7);
            return null;
        }
    }

    final Boolean U() {
        return this.f15450e;
    }

    protected final void V() {
        l();
        t();
        L(new R4(this, n0(true)));
    }

    protected final void W() {
        l();
        t();
        M5 m5N0 = n0(true);
        o().G();
        L(new O4(this, m5N0));
    }

    final void X() {
        l();
        t();
        if (e0()) {
            return;
        }
        if (i0()) {
            this.f15448c.a();
            return;
        }
        if (b().V()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = a().getPackageManager().queryIntentServices(new Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            d().E().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
        this.f15448c.b(intent);
    }

    public final void Y() {
        l();
        t();
        this.f15448c.d();
        try {
            ConnectionTracker.getInstance().unbindService(a(), this.f15448c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f15449d = null;
    }

    final /* synthetic */ void Z() {
        InterfaceC2195f interfaceC2195f = this.f15449d;
        if (interfaceC2195f == null) {
            d().E().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            M5 m5N0 = n0(false);
            Preconditions.checkNotNull(m5N0);
            interfaceC2195f.S(m5N0);
            k0();
        } catch (RemoteException e7) {
            d().E().b("Failed to send Dma consent settings to the service", e7);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    final /* synthetic */ void a0() {
        InterfaceC2195f interfaceC2195f = this.f15449d;
        if (interfaceC2195f == null) {
            d().E().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            M5 m5N0 = n0(false);
            Preconditions.checkNotNull(m5N0);
            interfaceC2195f.M(m5N0);
            k0();
        } catch (RemoteException e7) {
            d().E().b("Failed to send storage consent settings to the service", e7);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    protected final void b0() {
        l();
        t();
        M5 m5N0 = n0(false);
        o().F();
        L(new N4(this, m5N0));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    protected final void c0() {
        l();
        t();
        L(new Runnable() { // from class: com.google.android.gms.measurement.internal.H4
            @Override // java.lang.Runnable
            public final void run() {
                this.f15580m.Z();
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    protected final void d0() {
        l();
        t();
        L(new U4(this, n0(true)));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    public final boolean e0() {
        l();
        t();
        return this.f15449d != null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    final boolean f0() {
        l();
        t();
        return !i0() || h().G0() >= 200900;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    final boolean g0() {
        l();
        t();
        return !i0() || h().G0() >= ((Integer) G.f15562u0.a(null)).intValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    final boolean h0() {
        l();
        t();
        return !i0() || h().G0() >= 241200;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean i0() {
        C1463p2 c1463p2I;
        String str;
        boolean z6;
        C1463p2 c1463p2J;
        String str2;
        l();
        t();
        if (this.f15450e == null) {
            l();
            t();
            Boolean boolL = g().L();
            if (boolL == null || !boolL.booleanValue()) {
                boolean z7 = false;
                if (n().A() == 1) {
                    z6 = true;
                    if (z && b().V()) {
                        d().E().a("No way to upload. Consider using the full version of Analytics");
                    } else {
                        z7 = z6;
                    }
                    if (z7) {
                        g().v(z);
                    }
                } else {
                    d().I().a("Checking service availability");
                    int iS = h().s(12451000);
                    if (iS != 0) {
                        if (iS != 1) {
                            if (iS != 2) {
                                if (iS == 3) {
                                    c1463p2J = d().J();
                                    str2 = "Service disabled";
                                } else if (iS == 9) {
                                    c1463p2J = d().J();
                                    str2 = "Service invalid";
                                } else if (iS != 18) {
                                    d().J().b("Unexpected service status", Integer.valueOf(iS));
                                    z6 = false;
                                    z = false;
                                } else {
                                    c1463p2I = d().J();
                                    str = "Service updating";
                                }
                                c1463p2J.a(str2);
                                z6 = false;
                                z = false;
                            } else {
                                d().D().a("Service container out of date");
                                if (h().G0() >= 17443) {
                                    z = boolL == null;
                                    z6 = false;
                                }
                            }
                            if (z) {
                                z7 = z6;
                                if (z7) {
                                }
                            }
                        } else {
                            d().I().a("Service missing");
                        }
                        z6 = true;
                        z = false;
                        if (z) {
                        }
                    } else {
                        c1463p2I = d().I();
                        str = "Service available";
                    }
                    c1463p2I.a(str);
                    z6 = true;
                    if (z) {
                    }
                }
            }
            this.f15450e = Boolean.valueOf(z);
        }
        return this.f15450e.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1522y m() {
        return super.m();
    }

    protected final void m0(boolean z6) {
        l();
        t();
        if ((!C1168o6.a() || !b().r(G.f15505Y0)) && z6) {
            o().F();
        }
        L(new Runnable() { // from class: com.google.android.gms.measurement.internal.E4
            @Override // java.lang.Runnable
            public final void run() {
                this.f15423m.a0();
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1400g2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1393f2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ F3 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1513w4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ F4 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1466p5 s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1525y2
    protected final boolean y() {
        return false;
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
