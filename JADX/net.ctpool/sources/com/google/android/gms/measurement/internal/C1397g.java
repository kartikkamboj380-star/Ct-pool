package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1397g extends AbstractC1512w3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f16036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f16037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1411i f16038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f16039e;

    C1397g(S2 s22) {
        super(s22);
        this.f16038d = new InterfaceC1411i() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.InterfaceC1411i
            public final String i(String str, String str2) {
                return null;
            }
        };
    }

    public static long G() {
        return ((Long) G.f15520e.a(null)).longValue();
    }

    public static long I() {
        return ((Integer) G.f15541l.a(null)).intValue();
    }

    public static long N() {
        return ((Long) G.f15466F.a(null)).longValue();
    }

    public static long O() {
        return ((Long) G.f15456A.a(null)).longValue();
    }

    private final String i(String str, String str2) {
        C1463p2 c1463p2E;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            Preconditions.checkNotNull(str4);
            return str4;
        } catch (ClassNotFoundException e7) {
            e = e7;
            c1463p2E = d().E();
            str3 = "Could not find SystemProperties class";
            c1463p2E.b(str3, e);
            return str2;
        } catch (IllegalAccessException e8) {
            e = e8;
            c1463p2E = d().E();
            str3 = "Could not access SystemProperties.get()";
            c1463p2E.b(str3, e);
            return str2;
        } catch (NoSuchMethodException e9) {
            e = e9;
            c1463p2E = d().E();
            str3 = "Could not find SystemProperties.get() method";
            c1463p2E.b(str3, e);
            return str2;
        } catch (InvocationTargetException e10) {
            e = e10;
            c1463p2E = d().E();
            str3 = "SystemProperties.get() threw an exception";
            c1463p2E.b(str3, e);
            return str2;
        }
    }

    private final Bundle s() {
        try {
            if (a().getPackageManager() == null) {
                d().E().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(a()).getApplicationInfo(a().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            d().E().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            d().E().b("Failed to load metadata: Package name not found", e7);
            return null;
        }
    }

    final long A(String str) {
        return y(str, G.f15511b);
    }

    public final String B(String str, C1365b2 c1365b2) {
        return (String) c1365b2.a(TextUtils.isEmpty(str) ? null : this.f16038d.i(str, c1365b2.b()));
    }

    final Boolean C(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleS = s();
        if (bundleS == null) {
            d().E().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleS.containsKey(str)) {
            return Boolean.valueOf(bundleS.getBoolean(str));
        }
        return null;
    }

    public final boolean D(String str, C1365b2 c1365b2) {
        return F(str, c1365b2);
    }

    final String E(String str) {
        return B(str, G.f15484O);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(String str, C1365b2 c1365b2) {
        Object objA;
        if (TextUtils.isEmpty(str)) {
            objA = c1365b2.a(null);
        } else {
            String strI = this.f16038d.i(str, c1365b2.b());
            if (!TextUtils.isEmpty(strI)) {
                objA = c1365b2.a(Boolean.valueOf("1".equals(strI)));
            }
        }
        return ((Boolean) objA).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List H(String str) {
        Integer numValueOf;
        Preconditions.checkNotEmpty(str);
        Bundle bundleS = s();
        if (bundleS != null) {
            if (bundleS.containsKey(str)) {
                numValueOf = Integer.valueOf(bundleS.getInt(str));
            }
            if (numValueOf != null) {
                return null;
            }
            try {
                String[] stringArray = a().getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    return null;
                }
                return Arrays.asList(stringArray);
            } catch (Resources.NotFoundException e7) {
                d().E().b("Failed to load string array from metadata: resource not found", e7);
                return null;
            }
        }
        d().E().a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
        }
    }

    public final void J(String str) {
        this.f16037c = str;
    }

    final boolean K(String str) {
        return F(str, G.f15482N);
    }

    public final boolean L(String str) {
        return "1".equals(this.f16038d.i(str, "gaia_collection_enabled"));
    }

    public final boolean M(String str) {
        return "1".equals(this.f16038d.i(str, "measurement.event_sampling_enabled"));
    }

    public final String P() {
        return i("debug.firebase.analytics.app", "");
    }

    public final String Q() {
        return i("debug.deferred.deeplink", "");
    }

    public final String R() {
        return this.f16037c;
    }

    public final boolean S() {
        Boolean boolC = C("google_analytics_adid_collection_enabled");
        return boolC == null || boolC.booleanValue();
    }

    public final boolean T() {
        Boolean boolC = C("google_analytics_automatic_screen_reporting_enabled");
        return boolC == null || boolC.booleanValue();
    }

    public final boolean U() {
        Boolean boolC = C("firebase_analytics_collection_deactivated");
        return boolC != null && boolC.booleanValue();
    }

    final boolean V() {
        if (this.f16036b == null) {
            Boolean boolC = C("app_measurement_lite");
            this.f16036b = boolC;
            if (boolC == null) {
                this.f16036b = Boolean.FALSE;
            }
        }
        return this.f16036b.booleanValue() || !this.f16325a.r();
    }

    public final boolean W() {
        if (this.f16039e == null) {
            synchronized (this) {
                try {
                    if (this.f16039e == null) {
                        ApplicationInfo applicationInfo = a().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f16039e = Boolean.valueOf(str != null && str.equals(myProcessName));
                        }
                        if (this.f16039e == null) {
                            this.f16039e = Boolean.TRUE;
                            d().E().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f16039e.booleanValue();
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

    public final double m(String str, C1365b2 c1365b2) {
        if (!TextUtils.isEmpty(str)) {
            String strI = this.f16038d.i(str, c1365b2.b());
            if (!TextUtils.isEmpty(strI)) {
                try {
                    return ((Double) c1365b2.a(Double.valueOf(Double.parseDouble(strI)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) c1365b2.a(null)).doubleValue();
    }

    final int n(String str) {
        return o(str, G.f15476K, 500, 2000);
    }

    public final int o(String str, C1365b2 c1365b2, int i7, int i8) {
        return Math.max(Math.min(u(str, c1365b2), i8), i7);
    }

    final int p(String str, boolean z6) {
        if (z6) {
            return o(str, G.f15496U, 100, 500);
        }
        return 500;
    }

    final void q(InterfaceC1411i interfaceC1411i) {
        this.f16038d = interfaceC1411i;
    }

    public final boolean r(C1365b2 c1365b2) {
        return F(null, c1365b2);
    }

    public final int t(String str) {
        return o(str, G.f15478L, 25, 100);
    }

    public final int u(String str, C1365b2 c1365b2) {
        if (!TextUtils.isEmpty(str)) {
            String strI = this.f16038d.i(str, c1365b2.b());
            if (!TextUtils.isEmpty(strI)) {
                try {
                    return ((Integer) c1365b2.a(Integer.valueOf(Integer.parseInt(strI)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) c1365b2.a(null)).intValue();
    }

    final int v(String str, boolean z6) {
        return Math.max(p(str, z6), 256);
    }

    public final int w() {
        return h().a0(201500000, true) ? 100 : 25;
    }

    public final int x(String str) {
        return u(str, G.f15551p);
    }

    public final long y(String str, C1365b2 c1365b2) {
        if (!TextUtils.isEmpty(str)) {
            String strI = this.f16038d.i(str, c1365b2.b());
            if (!TextUtils.isEmpty(strI)) {
                try {
                    return ((Long) c1365b2.a(Long.valueOf(Long.parseLong(strI)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) c1365b2.a(null)).longValue();
    }

    public final w3.r z(String str, boolean z6) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        Bundle bundleS = s();
        if (bundleS == null) {
            d().E().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleS.get(str);
        }
        if (obj == null) {
            return w3.r.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return w3.r.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return w3.r.DENIED;
        }
        if (z6 && "eu_consent_policy".equals(obj)) {
            return w3.r.POLICY;
        }
        d().J().b("Invalid manifest metadata for", str);
        return w3.r.UNINITIALIZED;
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
