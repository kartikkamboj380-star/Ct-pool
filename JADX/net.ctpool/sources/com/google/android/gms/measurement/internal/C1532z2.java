package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.A3;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1532z2 extends AbstractC1533z3 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final Pair f16368B = new Pair("", 0L);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final B2 f16369A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences f16370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f16371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SharedPreferences f16372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D2 f16373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A2 f16374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A2 f16375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2 f16376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f16377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f16378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f16379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A2 f16380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1518x2 f16381n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2 f16382o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B2 f16383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1518x2 f16384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A2 f16385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A2 f16386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16387t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1518x2 f16388u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1518x2 f16389v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public A2 f16390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C2 f16391x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C2 f16392y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final A2 f16393z;

    C1532z2(S2 s22) {
        super(s22);
        this.f16371d = new Object();
        this.f16380m = new A2(this, "session_timeout", 1800000L);
        this.f16381n = new C1518x2(this, "start_new_session", true);
        this.f16385r = new A2(this, "last_pause_time", 0L);
        this.f16386s = new A2(this, "session_id", 0L);
        this.f16382o = new C2(this, "non_personalized_ads", null);
        this.f16383p = new B2(this, "last_received_uri_timestamps_by_source", null);
        this.f16384q = new C1518x2(this, "allow_remote_dynamite", false);
        this.f16374g = new A2(this, "first_open_time", 0L);
        this.f16375h = new A2(this, "app_install_time", 0L);
        this.f16376i = new C2(this, "app_instance_id", null);
        this.f16388u = new C1518x2(this, "app_backgrounded", false);
        this.f16389v = new C1518x2(this, "deep_link_retrieval_complete", false);
        this.f16390w = new A2(this, "deep_link_retrieval_attempts", 0L);
        this.f16391x = new C2(this, "firebase_feature_rollouts", null);
        this.f16392y = new C2(this, "deferred_attribution_cache", null);
        this.f16393z = new A2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f16369A = new B2(this, "default_event_parameters", null);
    }

    protected final boolean A(C1535z5 c1535z5) {
        l();
        String string = H().getString("stored_tcf_param", "");
        String strG = c1535z5.g();
        if (strG.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = H().edit();
        editorEdit.putString("stored_tcf_param", strG);
        editorEdit.apply();
        return true;
    }

    final boolean B() {
        SharedPreferences sharedPreferences = this.f16370c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final void C(Boolean bool) {
        l();
        SharedPreferences.Editor editorEdit = H().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled_from_api");
        }
        editorEdit.apply();
    }

    final void D(String str) {
        l();
        SharedPreferences.Editor editorEdit = H().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    final void E(boolean z6) {
        l();
        d().I().b("App measurement setting deferred collection", Boolean.valueOf(z6));
        SharedPreferences.Editor editorEdit = H().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z6);
        editorEdit.apply();
    }

    protected final SharedPreferences F() {
        l();
        n();
        if (this.f16372e == null) {
            synchronized (this.f16371d) {
                try {
                    if (this.f16372e == null) {
                        String str = a().getPackageName() + "_preferences";
                        d().I().b("Default prefs file", str);
                        this.f16372e = a().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f16372e;
    }

    final void G(String str) {
        l();
        SharedPreferences.Editor editorEdit = H().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    protected final SharedPreferences H() {
        l();
        n();
        Preconditions.checkNotNull(this.f16370c);
        return this.f16370c;
    }

    final SparseArray I() {
        Bundle bundleA = this.f16383p.a();
        if (bundleA == null) {
            return new SparseArray();
        }
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            d().E().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i7 = 0; i7 < intArray.length; i7++) {
            sparseArray.put(intArray[i7], Long.valueOf(longArray[i7]));
        }
        return sparseArray;
    }

    final C1501v J() {
        l();
        return C1501v.c(H().getString("dma_consent_settings", null));
    }

    final A3 K() {
        l();
        return A3.e(H().getString("consent_settings", "G1"), H().getInt("consent_source", 100));
    }

    final Boolean L() {
        l();
        if (H().contains("use_service")) {
            return Boolean.valueOf(H().getBoolean("use_service", false));
        }
        return null;
    }

    final Boolean M() {
        l();
        if (H().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(H().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    final Boolean N() {
        l();
        if (H().contains("measurement_enabled")) {
            return Boolean.valueOf(H().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String O() {
        l();
        String string = H().getString("previous_os_version", null);
        c().n();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = H().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final String P() {
        l();
        return H().getString("admob_app_id", null);
    }

    final String Q() {
        l();
        return H().getString("gmp_app_id", null);
    }

    final void R() {
        l();
        Boolean boolN = N();
        SharedPreferences.Editor editorEdit = H().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolN != null) {
            u(boolN);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1533z3
    protected final void m() {
        SharedPreferences sharedPreferences = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f16370c = sharedPreferences;
        boolean z6 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f16387t = z6;
        if (!z6) {
            SharedPreferences.Editor editorEdit = this.f16370c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f16373f = new D2(this, "health_monitor", Math.max(0L, ((Long) G.f15517d.a(null)).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1533z3
    protected final boolean r() {
        return true;
    }

    final Pair s(String str) {
        l();
        if (!K().m(A3.a.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (this.f16377j != null && jElapsedRealtime < this.f16379l) {
            return new Pair(this.f16377j, Boolean.valueOf(this.f16378k));
        }
        this.f16379l = jElapsedRealtime + b().A(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(a());
            this.f16377j = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f16377j = id;
            }
            this.f16378k = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e7) {
            d().D().b("Unable to get advertising id", e7);
            this.f16377j = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.f16377j, Boolean.valueOf(this.f16378k));
    }

    final void t(SparseArray sparseArray) {
        if (sparseArray == null) {
            this.f16383p.b(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            iArr[i7] = sparseArray.keyAt(i7);
            jArr[i7] = ((Long) sparseArray.valueAt(i7)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f16383p.b(bundle);
    }

    final void u(Boolean bool) {
        l();
        SharedPreferences.Editor editorEdit = H().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void v(boolean z6) {
        l();
        SharedPreferences.Editor editorEdit = H().edit();
        editorEdit.putBoolean("use_service", z6);
        editorEdit.apply();
    }

    final boolean w(int i7) {
        return A3.l(i7, H().getInt("consent_source", 100));
    }

    final boolean x(long j7) {
        return j7 - this.f16380m.a() > this.f16385r.a();
    }

    final boolean y(C1501v c1501v) {
        l();
        if (!A3.l(c1501v.a(), J().a())) {
            return false;
        }
        SharedPreferences.Editor editorEdit = H().edit();
        editorEdit.putString("dma_consent_settings", c1501v.j());
        editorEdit.apply();
        return true;
    }

    final boolean z(A3 a32) {
        l();
        int iB = a32.b();
        if (!w(iB)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = H().edit();
        editorEdit.putString("consent_settings", a32.x());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        return true;
    }
}
