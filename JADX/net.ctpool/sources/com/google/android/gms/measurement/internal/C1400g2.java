package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.C1168o6;
import com.google.android.gms.internal.measurement.C1195r7;
import com.google.android.gms.internal.measurement.D7;
import com.google.android.gms.measurement.internal.A3;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1400g2 extends AbstractC1525y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f16041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f16043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f16044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f16045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f16046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f16047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f16049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f16050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f16051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f16052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f16053p;

    C1400g2(S2 s22, long j7) {
        super(s22);
        this.f16052o = 0L;
        this.f16053p = null;
        this.f16045h = j7;
    }

    private final String H() {
        C1463p2 c1463p2L;
        String str;
        if (D7.a() && b().r(G.f15558s0)) {
            c1463p2L = d().I();
            str = "Disabled IID for tests.";
        } else {
            try {
                Class<?> clsLoadClass = a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    return null;
                }
                try {
                    Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, a());
                    if (objInvoke == null) {
                        return null;
                    }
                    try {
                        return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    } catch (Exception unused) {
                        c1463p2L = d().K();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    c1463p2L = d().L();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        }
        c1463p2L.a(str);
        return null;
    }

    final int A() {
        t();
        return this.f16048k;
    }

    final int B() {
        t();
        return this.f16042e;
    }

    final String C() {
        t();
        return this.f16050m;
    }

    final String D() {
        t();
        Preconditions.checkNotNull(this.f16040c);
        return this.f16040c;
    }

    final String E() {
        l();
        t();
        Preconditions.checkNotNull(this.f16049l);
        return this.f16049l;
    }

    final List F() {
        return this.f16046i;
    }

    final void G() {
        String str;
        l();
        if (g().K().m(A3.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            h().U0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            d().D().a("Analytics Storage consent is not granted");
            str = null;
        }
        d().D().a(String.format("Resetting session stitching token to %s", str == null ? "null" : "not null"));
        this.f16051n = str;
        this.f16052o = zzb().currentTimeMillis();
    }

    final boolean I(String str) {
        String str2 = this.f16053p;
        boolean z6 = (str2 == null || str2.equals(str)) ? false : true;
        this.f16053p = str;
        return z6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.measurement.internal.AbstractC1525y2
    protected final void w() {
        String str;
        C1463p2 c1463p2I;
        String str2;
        String packageName = a().getPackageName();
        PackageManager packageManager = a().getPackageManager();
        String str3 = "";
        String installerPackageName = "unknown";
        String str4 = "Unknown";
        int i7 = Integer.MIN_VALUE;
        if (packageManager == null) {
            d().E().b("PackageManager is null, app identity information might be inaccurate. appId", C1449n2.t(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                d().E().b("Error retrieving app installer package name. appId", C1449n2.t(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(a().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                    try {
                        str4 = packageInfo.versionName;
                        i7 = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = str4;
                        str4 = string;
                        d().E().c("Error retrieving package info. appId, appName", C1449n2.t(packageName), str4);
                        str4 = str;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "Unknown";
            }
        }
        this.f16040c = packageName;
        this.f16043f = installerPackageName;
        this.f16041d = str4;
        this.f16042e = i7;
        this.f16044g = 0L;
        Object[] objArr = !TextUtils.isEmpty(this.f16325a.K()) && "am".equals(this.f16325a.L());
        int iV = this.f16325a.v();
        C1449n2 c1449n2D = d();
        switch (iV) {
            case 0:
                c1463p2I = c1449n2D.I();
                str2 = "App measurement collection enabled";
                break;
            case 1:
                c1463p2I = c1449n2D.H();
                str2 = "App measurement deactivated via the manifest";
                break;
            case 2:
                c1463p2I = c1449n2D.I();
                str2 = "App measurement deactivated via the init parameters";
                break;
            case 3:
                c1463p2I = c1449n2D.H();
                str2 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                break;
            case 4:
                c1463p2I = c1449n2D.H();
                str2 = "App measurement disabled via the manifest";
                break;
            case 5:
                c1463p2I = c1449n2D.I();
                str2 = "App measurement disabled via the init parameters";
                break;
            case 6:
                c1463p2I = c1449n2D.K();
                str2 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                break;
            case 7:
                c1463p2I = c1449n2D.H();
                str2 = "App measurement disabled via the global data collection setting";
                break;
            case 8:
                c1463p2I = c1449n2D.H();
                str2 = "App measurement disabled due to denied storage consent";
                break;
            default:
                c1449n2D.H().a("App measurement disabled");
                c1463p2I = d().G();
                str2 = "Invalid scion state in identity";
                break;
        }
        c1463p2I.a(str2);
        boolean z6 = iV == 0;
        this.f16049l = "";
        this.f16050m = "";
        if (objArr != false) {
            this.f16050m = this.f16325a.K();
        }
        try {
            String strB = new w3.p(a(), this.f16325a.N()).b("google_app_id");
            if (!TextUtils.isEmpty(strB)) {
                str3 = strB;
            }
            this.f16049l = str3;
            if (!TextUtils.isEmpty(strB)) {
                this.f16050m = new w3.p(a(), this.f16325a.N()).b("admob_app_id");
            }
            if (z6) {
                d().I().c("App measurement enabled for app package, google app id", this.f16040c, TextUtils.isEmpty(this.f16049l) ? this.f16050m : this.f16049l);
            }
        } catch (IllegalStateException e7) {
            d().E().c("Fetching Google App Id failed with exception. appId", C1449n2.t(packageName), e7);
        }
        this.f16046i = null;
        List listH = b().H("analytics.safelisted_events");
        if (listH == null) {
            this.f16046i = listH;
        } else if (listH.isEmpty()) {
            d().K().a("Safelisted event list is empty. Ignoring");
        } else {
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                if (!h().u0("safelisted event", (String) it.next())) {
                }
            }
            this.f16046i = listH;
        }
        if (packageManager != null) {
            this.f16048k = InstantApps.isInstantApp(a()) ? 1 : 0;
        } else {
            this.f16048k = 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1525y2
    protected final boolean y() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final M5 z(String str) {
        List list;
        String str2;
        long j7;
        long j8;
        boolean z6;
        boolean z7;
        String str3;
        int iW0;
        l();
        String strD = D();
        String strE = E();
        t();
        String str4 = this.f16041d;
        long jB = B();
        t();
        Preconditions.checkNotNull(this.f16043f);
        String str5 = this.f16043f;
        t();
        l();
        if (this.f16044g == 0) {
            this.f16044g = this.f16325a.J().x(a(), a().getPackageName());
        }
        long j9 = this.f16044g;
        boolean zN = this.f16325a.n();
        boolean z8 = !g().f16387t;
        l();
        String strH = !this.f16325a.n() ? null : H();
        S2 s22 = this.f16325a;
        long jA = s22.D().f16374g.a();
        long jMin = jA == 0 ? s22.f15769H : Math.min(s22.f15769H, jA);
        int iA = A();
        boolean zS = b().S();
        C1532z2 c1532z2G = g();
        c1532z2G.l();
        boolean z9 = c1532z2G.H().getBoolean("deferred_analytics_collection", false);
        String strC = C();
        Boolean boolValueOf = b().C("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!r1.booleanValue());
        long j10 = this.f16045h;
        List list2 = this.f16046i;
        String strX = g().K().x();
        if (this.f16047j == null) {
            this.f16047j = h().S0();
        }
        String str6 = this.f16047j;
        if (C1168o6.a()) {
            list = list2;
            str2 = str6;
            if (b().r(G.f15505Y0) && !g().K().m(A3.a.ANALYTICS_STORAGE)) {
                j7 = j10;
                z6 = zN;
                z7 = z8;
                j8 = 0;
                str3 = null;
            }
            Boolean boolC = b().C("google_analytics_sgtm_upload_enabled");
            boolean zBooleanValue = boolC != null ? false : boolC.booleanValue();
            long jX0 = h().x0(D());
            int iB = g().K().b();
            String strJ = g().J().j();
            if (C1195r7.a() || !b().r(G.f15475J0)) {
                iW0 = 0;
            } else {
                h();
                iW0 = d6.w0();
            }
            return new M5(strD, strE, str4, jB, str5, 106000L, j9, str, z6, z7, strH, 0L, jMin, iA, zS, z9, strC, boolValueOf, j7, list, (String) null, strX, str2, str3, zBooleanValue, jX0, iB, strJ, iW0, (C1195r7.a() || !b().r(G.f15475J0)) ? j8 : h().O0(), b().R(), new B1(b().z("google_analytics_default_allow_ad_personalization_signals", true)).c());
        }
        list = list2;
        str2 = str6;
        l();
        j7 = j10;
        j8 = 0;
        if (this.f16052o != 0) {
            z6 = zN;
            z7 = z8;
            long jCurrentTimeMillis = zzb().currentTimeMillis() - this.f16052o;
            if (this.f16051n != null && jCurrentTimeMillis > 86400000 && this.f16053p == null) {
                G();
            }
        } else {
            z6 = zN;
            z7 = z8;
        }
        if (this.f16051n == null) {
            G();
        }
        str3 = this.f16051n;
        Boolean boolC2 = b().C("google_analytics_sgtm_upload_enabled");
        if (boolC2 != null) {
        }
        long jX02 = h().x0(D());
        int iB2 = g().K().b();
        String strJ2 = g().J().j();
        if (C1195r7.a()) {
            iW0 = 0;
        }
        return new M5(strD, strE, str4, jB, str5, 106000L, j9, str, z6, z7, strH, 0L, jMin, iA, zS, z9, strC, boolValueOf, j7, list, (String) null, strX, str2, str3, zBooleanValue, jX02, iB2, strJ2, iW0, (C1195r7.a() || !b().r(G.f15475J0)) ? j8 : h().O0(), b().R(), new B1(b().z("google_analytics_default_allow_ad_personalization_signals", true)).c());
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
