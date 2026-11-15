package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.Y6;
import com.tenjin.android.config.TenjinConsts;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1451n4 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ F3 f16200m;

    C1451n4(F3 f32) {
        this.f16200m = f32;
    }

    static /* synthetic */ void a(C1451n4 c1451n4, boolean z6, Uri uri, String str, String str2) {
        Bundle bundleA;
        Uri uri2;
        boolean z7;
        c1451n4.f16200m.l();
        try {
            d6 d6VarH = c1451n4.f16200m.h();
            boolean z8 = Y6.a() && c1451n4.f16200m.b().r(G.f15497U0);
            if (TextUtils.isEmpty(str2)) {
                bundleA = null;
            } else if (str2.contains("gclid") || ((z8 && str2.contains("gbraid")) || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id"))) {
                bundleA = d6VarH.A(Uri.parse("https://google.com/search?" + str2), z8);
                if (bundleA != null) {
                    bundleA.putString("_cis", TenjinConsts.REFERRER_PARAM);
                }
            } else {
                d6VarH.d().D().a("Activity created with data 'referrer' without required params");
                bundleA = null;
            }
            if (z6) {
                d6 d6VarH2 = c1451n4.f16200m.h();
                if (Y6.a() && c1451n4.f16200m.b().r(G.f15497U0)) {
                    uri2 = uri;
                    z7 = true;
                } else {
                    uri2 = uri;
                    z7 = false;
                }
                Bundle bundleA2 = d6VarH2.A(uri2, z7);
                if (bundleA2 != null) {
                    bundleA2.putString("_cis", "intent");
                    if (!bundleA2.containsKey("gclid") && bundleA != null && bundleA.containsKey("gclid")) {
                        bundleA2.putString("_cer", String.format("gclid=%s", bundleA.getString("gclid")));
                    }
                    c1451n4.f16200m.Z0(str, "_cmp", bundleA2);
                    c1451n4.f16200m.f15442q.b(str, bundleA2);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c1451n4.f16200m.d().D().b("Activity created with referrer", str2);
            if (c1451n4.f16200m.b().r(G.f15556r0)) {
                if (bundleA != null) {
                    c1451n4.f16200m.Z0(str, "_cmp", bundleA);
                    c1451n4.f16200m.f15442q.b(str, bundleA);
                } else {
                    c1451n4.f16200m.d().D().b("Referrer does not contain valid parameters", str2);
                }
                c1451n4.f16200m.h0("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                c1451n4.f16200m.d().D().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                c1451n4.f16200m.h0("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e7) {
            c1451n4.f16200m.d().E().b("Throwable caught in handleReferrerForOnActivityCreated", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            try {
                this.f16200m.d().I().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            data = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
                        }
                    }
                    Uri uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        this.f16200m.h();
                        this.f16200m.f().B(new RunnableC1472q4(this, bundle == null, uri, d6.d0(intent) ? "gs" : "auto", uri.getQueryParameter(TenjinConsts.REFERRER_PARAM)));
                    }
                }
            } catch (RuntimeException e7) {
                this.f16200m.d().E().b("Throwable caught in onActivityCreated", e7);
            }
        } finally {
            this.f16200m.q().D(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f16200m.q().C(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f16200m.q().O(activity);
        C1466p5 c1466p5S = this.f16200m.s();
        c1466p5S.f().B(new RunnableC1473q5(c1466p5S, c1466p5S.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1466p5 c1466p5S = this.f16200m.s();
        c1466p5S.f().B(new RunnableC1479r5(c1466p5S, c1466p5S.zzb().elapsedRealtime()));
        this.f16200m.q().Q(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f16200m.q().P(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
