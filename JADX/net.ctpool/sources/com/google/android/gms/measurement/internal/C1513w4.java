package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1513w4 extends AbstractC1525y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile C1520x4 f16326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile C1520x4 f16327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected C1520x4 f16328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f16329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Activity f16330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f16331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile C1520x4 f16332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C1520x4 f16333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f16334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Object f16335l;

    public C1513w4(S2 s22) {
        super(s22);
        this.f16335l = new Object();
        this.f16329f = new ConcurrentHashMap();
    }

    private final String B(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > b().p(null, false) ? str2.substring(0, b().p(null, false)) : str2;
    }

    private final void E(Activity activity, C1520x4 c1520x4, boolean z6) {
        C1520x4 c1520x42;
        C1520x4 c1520x43 = this.f16326c == null ? this.f16327d : this.f16326c;
        if (c1520x4.f16347b == null) {
            c1520x42 = new C1520x4(c1520x4.f16346a, activity != null ? B(activity.getClass(), "Activity") : null, c1520x4.f16348c, c1520x4.f16350e, c1520x4.f16351f);
        } else {
            c1520x42 = c1520x4;
        }
        this.f16327d = this.f16326c;
        this.f16326c = c1520x42;
        f().B(new RunnableC1527y4(this, c1520x42, c1520x43, zzb().elapsedRealtime(), z6));
    }

    static /* synthetic */ void H(C1513w4 c1513w4, Bundle bundle, C1520x4 c1520x4, C1520x4 c1520x42, long j7) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c1513w4.L(c1520x4, c1520x42, j7, true, c1513w4.h().D(null, "screen_view", bundle, null, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(C1520x4 c1520x4, C1520x4 c1520x42, long j7, boolean z6, Bundle bundle) {
        l();
        boolean z7 = false;
        boolean z8 = (c1520x42 != null && c1520x42.f16348c == c1520x4.f16348c && Objects.equals(c1520x42.f16347b, c1520x4.f16347b) && Objects.equals(c1520x42.f16346a, c1520x4.f16346a)) ? false : true;
        if (z6 && this.f16328e != null) {
            z7 = true;
        }
        if (z8) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            d6.V(c1520x4, bundle2, true);
            if (c1520x42 != null) {
                String str = c1520x42.f16346a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = c1520x42.f16347b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", c1520x42.f16348c);
            }
            if (z7) {
                long jA = s().f16241f.a(j7);
                if (jA > 0) {
                    h().K(bundle2, jA);
                }
            }
            if (!b().T()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = c1520x4.f16350e ? "app" : "auto";
            long jCurrentTimeMillis = zzb().currentTimeMillis();
            if (c1520x4.f16350e) {
                long j8 = c1520x4.f16351f;
                long j9 = j8 != 0 ? j8 : jCurrentTimeMillis;
                p().a0(str3, "_vs", j9, bundle2);
            }
        }
        if (z7) {
            M(this.f16328e, true, j7);
        }
        this.f16328e = c1520x4;
        if (c1520x4.f16350e) {
            this.f16333j = c1520x4;
        }
        r().H(c1520x4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(C1520x4 c1520x4, boolean z6, long j7) {
        m().t(zzb().elapsedRealtime());
        if (!s().C(c1520x4 != null && c1520x4.f16349d, z6, j7) || c1520x4 == null) {
            return;
        }
        c1520x4.f16349d = false;
    }

    private final C1520x4 R(Activity activity) {
        Preconditions.checkNotNull(activity);
        C1520x4 c1520x4 = (C1520x4) this.f16329f.get(Integer.valueOf(activity.hashCode()));
        if (c1520x4 == null) {
            C1520x4 c1520x42 = new C1520x4(null, B(activity.getClass(), "Activity"), h().P0());
            this.f16329f.put(Integer.valueOf(activity.hashCode()), c1520x42);
            c1520x4 = c1520x42;
        }
        return this.f16332i != null ? this.f16332i : c1520x4;
    }

    public final C1520x4 A(boolean z6) {
        t();
        l();
        if (!z6) {
            return this.f16328e;
        }
        C1520x4 c1520x4 = this.f16328e;
        return c1520x4 != null ? c1520x4 : this.f16333j;
    }

    public final void C(Activity activity) {
        synchronized (this.f16335l) {
            try {
                if (activity == this.f16330g) {
                    this.f16330g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b().T()) {
            this.f16329f.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    public final void D(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!b().T() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f16329f.put(Integer.valueOf(activity.hashCode()), new C1520x4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void F(Activity activity, String str, String str2) {
        if (!b().T()) {
            d().K().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C1520x4 c1520x4 = this.f16326c;
        if (c1520x4 == null) {
            d().K().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f16329f.get(Integer.valueOf(activity.hashCode())) == null) {
            d().K().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = B(activity.getClass(), "Activity");
        }
        boolean zEquals = Objects.equals(c1520x4.f16347b, str2);
        boolean zEquals2 = Objects.equals(c1520x4.f16346a, str);
        if (zEquals && zEquals2) {
            d().K().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > b().p(null, false))) {
            d().K().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > b().p(null, false))) {
            d().K().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        d().I().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C1520x4 c1520x42 = new C1520x4(str, str2, h().P0());
        this.f16329f.put(Integer.valueOf(activity.hashCode()), c1520x42);
        E(activity, c1520x42, true);
    }

    public final void G(Bundle bundle, long j7) {
        String str;
        synchronized (this.f16335l) {
            try {
                if (!this.f16334k) {
                    d().K().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String strB = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > b().p(null, false))) {
                        d().K().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > b().p(null, false))) {
                        d().K().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        strB = string2;
                    }
                } else {
                    str = null;
                }
                if (strB == null) {
                    Activity activity = this.f16330g;
                    strB = activity != null ? B(activity.getClass(), "Activity") : "Activity";
                }
                String str2 = strB;
                C1520x4 c1520x4 = this.f16326c;
                if (this.f16331h && c1520x4 != null) {
                    this.f16331h = false;
                    boolean zEquals = Objects.equals(c1520x4.f16347b, str2);
                    boolean zEquals2 = Objects.equals(c1520x4.f16346a, str);
                    if (zEquals && zEquals2) {
                        d().K().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                d().I().c("Logging screen view with name, class", str == null ? "null" : str, str2 == null ? "null" : str2);
                C1520x4 c1520x42 = this.f16326c == null ? this.f16327d : this.f16326c;
                C1520x4 c1520x43 = new C1520x4(str, str2, h().P0(), true, j7);
                this.f16326c = c1520x43;
                this.f16327d = c1520x42;
                this.f16332i = c1520x43;
                f().B(new RunnableC1534z4(this, bundle, c1520x43, c1520x42, zzb().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1520x4 N() {
        return this.f16326c;
    }

    public final void O(Activity activity) {
        synchronized (this.f16335l) {
            this.f16334k = false;
            this.f16331h = true;
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (!b().T()) {
            this.f16326c = null;
            f().B(new A4(this, jElapsedRealtime));
        } else {
            C1520x4 c1520x4R = R(activity);
            this.f16327d = this.f16326c;
            this.f16326c = null;
            f().B(new D4(this, c1520x4R, jElapsedRealtime));
        }
    }

    public final void P(Activity activity, Bundle bundle) {
        C1520x4 c1520x4;
        if (!b().T() || bundle == null || (c1520x4 = (C1520x4) this.f16329f.get(Integer.valueOf(activity.hashCode()))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c1520x4.f16348c);
        bundle2.putString("name", c1520x4.f16346a);
        bundle2.putString("referrer_name", c1520x4.f16347b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void Q(Activity activity) {
        synchronized (this.f16335l) {
            this.f16334k = true;
            if (activity != this.f16330g) {
                synchronized (this.f16335l) {
                    this.f16330g = activity;
                    this.f16331h = false;
                }
                if (b().T()) {
                    this.f16332i = null;
                    f().B(new C4(this));
                }
            }
        }
        if (!b().T()) {
            this.f16326c = this.f16332i;
            f().B(new B4(this));
        } else {
            E(activity, R(activity), false);
            C1522y c1522yM = m();
            c1522yM.f().B(new Y(c1522yM, c1522yM.zzb().elapsedRealtime()));
        }
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
