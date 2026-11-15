package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.C1038a2;
import com.google.android.gms.internal.measurement.C1047b2;
import com.google.android.gms.internal.measurement.C1072e0;
import com.google.android.gms.internal.measurement.C1083f2;
import com.google.android.gms.internal.measurement.M7;
import com.google.android.gms.internal.measurement.Q7;
import com.google.android.gms.internal.measurement.S7;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.measurement.internal.A3;
import com.google.android.gms.measurement.internal.I2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
public final class I2 extends E5 implements InterfaceC1411i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f15622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f15623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f15624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f15625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f15626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f15627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final n.e f15628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Q7 f15629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f15630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f15631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f15632n;

    I2(H5 h52) {
        super(h52);
        this.f15622d = new C1890a();
        this.f15623e = new C1890a();
        this.f15624f = new C1890a();
        this.f15625g = new C1890a();
        this.f15626h = new C1890a();
        this.f15630l = new C1890a();
        this.f15631m = new C1890a();
        this.f15632n = new C1890a();
        this.f15627i = new C1890a();
        this.f15628j = new K2(this, 20);
        this.f15629k = new N2(this);
    }

    private static Map A(C1047b2 c1047b2) {
        C1890a c1890a = new C1890a();
        if (c1047b2 != null) {
            for (C1083f2 c1083f2 : c1047b2.T()) {
                c1890a.put(c1083f2.F(), c1083f2.G());
            }
        }
        return c1890a;
    }

    private final void D(String str, C1047b2.a aVar) {
        HashSet hashSet = new HashSet();
        C1890a c1890a = new C1890a();
        C1890a c1890a2 = new C1890a();
        C1890a c1890a3 = new C1890a();
        if (aVar != null) {
            Iterator it = aVar.A().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.google.android.gms.internal.measurement.Z1) it.next()).F());
            }
            for (int i7 = 0; i7 < aVar.t(); i7++) {
                C1038a2.a aVarU = (C1038a2.a) aVar.u(i7).w();
                if (aVarU.v().isEmpty()) {
                    d().J().a("EventConfig contained null event name");
                } else {
                    String strV = aVarU.v();
                    String strB = w3.s.b(aVarU.v());
                    if (!TextUtils.isEmpty(strB)) {
                        aVarU = aVarU.u(strB);
                        aVar.v(i7, aVarU);
                    }
                    if (aVarU.z() && aVarU.x()) {
                        c1890a.put(strV, Boolean.TRUE);
                    }
                    if (aVarU.A() && aVarU.y()) {
                        c1890a2.put(aVarU.v(), Boolean.TRUE);
                    }
                    if (aVarU.B()) {
                        if (aVarU.t() < 2 || aVarU.t() > 65535) {
                            d().J().c("Invalid sampling rate. Event name, sample rate", aVarU.v(), Integer.valueOf(aVarU.t()));
                        } else {
                            c1890a3.put(aVarU.v(), Integer.valueOf(aVarU.t()));
                        }
                    }
                }
            }
        }
        this.f15623e.put(str, hashSet);
        this.f15624f.put(str, c1890a);
        this.f15625g.put(str, c1890a2);
        this.f15627i.put(str, c1890a3);
    }

    private final void E(final String str, C1047b2 c1047b2) {
        if (c1047b2.j() == 0) {
            this.f15628j.e(str);
            return;
        }
        d().I().b("EES programs found", Integer.valueOf(c1047b2.j()));
        com.google.android.gms.internal.measurement.J2 j22 = (com.google.android.gms.internal.measurement.J2) c1047b2.S().get(0);
        try {
            com.google.android.gms.internal.measurement.C c7 = new com.google.android.gms.internal.measurement.C();
            c7.c("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.J2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.B5("internal.remoteConfig", new M2(this.f15644a, str));
                }
            });
            c7.c("internal.appMetadata", new Callable() { // from class: w3.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final I2 i22 = this.f22689a;
                    final String str2 = str;
                    return new S7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.H2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            I2 i23 = i22;
                            String str3 = str2;
                            C1372c2 c1372c2K0 = i23.o().K0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 106000L);
                            if (c1372c2K0 != null) {
                                String strO = c1372c2K0.o();
                                if (strO != null) {
                                    map.put("app_version", strO);
                                }
                                map.put("app_version_int", Long.valueOf(c1372c2K0.U()));
                                map.put("dynamite_version", Long.valueOf(c1372c2K0.v0()));
                            }
                            return map;
                        }
                    });
                }
            });
            c7.c("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.L2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new M7(this.f15663a.f15629k);
                }
            });
            c7.b(j22);
            this.f15628j.d(str, c7);
            d().I().c("EES program loaded for appId, activities", str, Integer.valueOf(j22.E().j()));
            Iterator it = j22.E().G().iterator();
            while (it.hasNext()) {
                d().I().b("EES program activity", ((com.google.android.gms.internal.measurement.I2) it.next()).F());
            }
        } catch (C1072e0 unused) {
            d().E().b("Failed to load EES program. appId", str);
        }
    }

    private final void e0(String str) {
        s();
        l();
        Preconditions.checkNotEmpty(str);
        if (this.f15626h.get(str) == null) {
            C1432l c1432lM0 = o().M0(str);
            if (c1432lM0 != null) {
                C1047b2.a aVar = (C1047b2.a) y(str, c1432lM0.f16143a).w();
                D(str, aVar);
                this.f15622d.put(str, A((C1047b2) ((AbstractC1260z4) aVar.p())));
                this.f15626h.put(str, (C1047b2) ((AbstractC1260z4) aVar.p()));
                E(str, (C1047b2) ((AbstractC1260z4) aVar.p()));
                this.f15630l.put(str, aVar.y());
                this.f15631m.put(str, c1432lM0.f16144b);
                this.f15632n.put(str, c1432lM0.f16145c);
                return;
            }
            this.f15622d.put(str, null);
            this.f15624f.put(str, null);
            this.f15623e.put(str, null);
            this.f15625g.put(str, null);
            this.f15626h.put(str, null);
            this.f15630l.put(str, null);
            this.f15631m.put(str, null);
            this.f15632n.put(str, null);
            this.f15627i.put(str, null);
        }
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.C x(I2 i22, String str) {
        i22.s();
        Preconditions.checkNotEmpty(str);
        if (!i22.U(str)) {
            return null;
        }
        if (!i22.f15626h.containsKey(str) || i22.f15626h.get(str) == null) {
            i22.e0(str);
        } else {
            i22.E(str, (C1047b2) i22.f15626h.get(str));
        }
        return (com.google.android.gms.internal.measurement.C) i22.f15628j.h().get(str);
    }

    private final C1047b2 y(String str, byte[] bArr) {
        if (bArr == null) {
            return C1047b2.M();
        }
        try {
            C1047b2 c1047b2 = (C1047b2) ((AbstractC1260z4) ((C1047b2.a) Z5.E(C1047b2.K(), bArr)).p());
            d().I().c("Parsed config. version, gmp_app_id", c1047b2.X() ? Long.valueOf(c1047b2.I()) : null, c1047b2.V() ? c1047b2.O() : null);
            return c1047b2;
        } catch (com.google.android.gms.internal.measurement.I4 e7) {
            e = e7;
            d().J().c("Unable to merge remote config. appId", C1449n2.t(str), e);
            return C1047b2.M();
        } catch (RuntimeException e8) {
            e = e8;
            d().J().c("Unable to merge remote config. appId", C1449n2.t(str), e);
            return C1047b2.M();
        }
    }

    private static A3.a z(Y1.e eVar) {
        int i7 = O2.f15715b[eVar.ordinal()];
        if (i7 == 1) {
            return A3.a.AD_STORAGE;
        }
        if (i7 == 2) {
            return A3.a.ANALYTICS_STORAGE;
        }
        if (i7 == 3) {
            return A3.a.AD_USER_DATA;
        }
        if (i7 != 4) {
            return null;
        }
        return A3.a.AD_PERSONALIZATION;
    }

    final w3.r C(String str, A3.a aVar) {
        l();
        e0(str);
        com.google.android.gms.internal.measurement.Y1 y1H = H(str);
        if (y1H == null) {
            return w3.r.UNINITIALIZED;
        }
        for (Y1.a aVar2 : y1H.J()) {
            if (z(aVar2.G()) == aVar) {
                int i7 = O2.f15716c[aVar2.F().ordinal()];
                return i7 != 1 ? i7 != 2 ? w3.r.UNINITIALIZED : w3.r.GRANTED : w3.r.DENIED;
            }
        }
        return w3.r.UNINITIALIZED;
    }

    protected final boolean F(String str, byte[] bArr, String str2, String str3) {
        s();
        l();
        Preconditions.checkNotEmpty(str);
        C1047b2.a aVar = (C1047b2.a) y(str, bArr).w();
        if (aVar == null) {
            return false;
        }
        D(str, aVar);
        E(str, (C1047b2) ((AbstractC1260z4) aVar.p()));
        this.f15626h.put(str, (C1047b2) ((AbstractC1260z4) aVar.p()));
        this.f15630l.put(str, aVar.y());
        this.f15631m.put(str, str2);
        this.f15632n.put(str, str3);
        this.f15622d.put(str, A((C1047b2) ((AbstractC1260z4) aVar.p())));
        o().a0(str, new ArrayList(aVar.z()));
        try {
            aVar.x();
            bArr = ((C1047b2) ((AbstractC1260z4) aVar.p())).i();
        } catch (RuntimeException e7) {
            d().J().c("Unable to serialize reduced-size config. Storing full config instead. appId", C1449n2.t(str), e7);
        }
        C1425k c1425kO = o();
        Preconditions.checkNotEmpty(str);
        c1425kO.l();
        c1425kO.s();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c1425kO.z().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c1425kO.d().E().b("Failed to update remote config (got 0). appId", C1449n2.t(str));
            }
        } catch (SQLiteException e8) {
            c1425kO.d().E().c("Error storing remote config. appId", C1449n2.t(str), e8);
        }
        this.f15626h.put(str, (C1047b2) ((AbstractC1260z4) aVar.p()));
        return true;
    }

    final int G(String str, String str2) {
        Integer num;
        l();
        e0(str);
        Map map = (Map) this.f15627i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final com.google.android.gms.internal.measurement.Y1 H(String str) {
        l();
        e0(str);
        C1047b2 c1047b2J = J(str);
        if (c1047b2J == null || !c1047b2J.U()) {
            return null;
        }
        return c1047b2J.J();
    }

    final A3.a I(String str, A3.a aVar) {
        l();
        e0(str);
        com.google.android.gms.internal.measurement.Y1 y1H = H(str);
        if (y1H == null) {
            return null;
        }
        for (Y1.c cVar : y1H.I()) {
            if (aVar == z(cVar.G())) {
                return z(cVar.F());
            }
        }
        return null;
    }

    protected final C1047b2 J(String str) {
        s();
        l();
        Preconditions.checkNotEmpty(str);
        e0(str);
        return (C1047b2) this.f15626h.get(str);
    }

    final boolean K(String str, A3.a aVar) {
        l();
        e0(str);
        com.google.android.gms.internal.measurement.Y1 y1H = H(str);
        if (y1H == null) {
            return false;
        }
        Iterator it = y1H.H().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Y1.a aVar2 = (Y1.a) it.next();
            if (aVar == z(aVar2.G())) {
                if (aVar2.F() == Y1.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean L(String str, String str2) {
        Boolean bool;
        l();
        e0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f15625g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String M(String str) {
        l();
        return (String) this.f15632n.get(str);
    }

    final boolean N(String str, String str2) {
        Boolean bool;
        l();
        e0(str);
        if (V(str) && d6.H0(str2)) {
            return true;
        }
        if (X(str) && d6.I0(str2)) {
            return true;
        }
        Map map = (Map) this.f15624f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected final String O(String str) {
        l();
        return (String) this.f15631m.get(str);
    }

    final String P(String str) {
        l();
        e0(str);
        return (String) this.f15630l.get(str);
    }

    final Set Q(String str) {
        l();
        e0(str);
        return (Set) this.f15623e.get(str);
    }

    final SortedSet R(String str) {
        l();
        e0(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.Y1 y1H = H(str);
        if (y1H == null) {
            return treeSet;
        }
        Iterator it = y1H.G().iterator();
        while (it.hasNext()) {
            treeSet.add(((Y1.f) it.next()).F());
        }
        return treeSet;
    }

    protected final void S(String str) {
        l();
        this.f15631m.put(str, null);
    }

    final void T(String str) {
        l();
        this.f15626h.remove(str);
    }

    public final boolean U(String str) {
        C1047b2 c1047b2;
        return (TextUtils.isEmpty(str) || (c1047b2 = (C1047b2) this.f15626h.get(str)) == null || c1047b2.j() == 0) ? false : true;
    }

    final boolean V(String str) {
        return "1".equals(i(str, "measurement.upload.blacklist_internal"));
    }

    final boolean W(String str) {
        l();
        e0(str);
        com.google.android.gms.internal.measurement.Y1 y1H = H(str);
        return y1H == null || !y1H.L() || y1H.K();
    }

    final boolean X(String str) {
        return "1".equals(i(str, "measurement.upload.blacklist_public"));
    }

    final boolean Y(String str) {
        l();
        e0(str);
        return this.f15623e.get(str) != null && ((Set) this.f15623e.get(str)).contains("app_instance_id");
    }

    final boolean Z(String str) {
        l();
        e0(str);
        if (this.f15623e.get(str) != null) {
            return ((Set) this.f15623e.get(str)).contains("device_model") || ((Set) this.f15623e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    final boolean a0(String str) {
        l();
        e0(str);
        return this.f15623e.get(str) != null && ((Set) this.f15623e.get(str)).contains("enhanced_user_id");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    final boolean b0(String str) {
        l();
        e0(str);
        return this.f15623e.get(str) != null && ((Set) this.f15623e.get(str)).contains("google_signals");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    final boolean c0(String str) {
        l();
        e0(str);
        if (this.f15623e.get(str) != null) {
            return ((Set) this.f15623e.get(str)).contains("os_version") || ((Set) this.f15623e.get(str)).contains("device_info");
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    final boolean d0(String str) {
        l();
        e0(str);
        return this.f15623e.get(str) != null && ((Set) this.f15623e.get(str)).contains("user_id");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1411i
    public final String i(String str, String str2) {
        l();
        e0(str);
        Map map = (Map) this.f15622d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C1425k o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C1424j5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    final long w(String str) {
        String strI = i(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strI)) {
            return 0L;
        }
        try {
            return Long.parseLong(strI);
        } catch (NumberFormatException e7) {
            d().J().c("Unable to parse timezone offset. appId", C1449n2.t(str), e7);
            return 0L;
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
