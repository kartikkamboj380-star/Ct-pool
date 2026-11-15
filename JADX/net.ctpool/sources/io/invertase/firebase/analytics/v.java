package io.invertase.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tenjin.android.config.TenjinConsts;
import java.util.EnumMap;
import java.util.Set;
import java.util.concurrent.Callable;
import z3.AbstractC2272l;
import z3.AbstractC2275o;

/* JADX INFO: loaded from: classes.dex */
public class v extends io.invertase.firebase.common.b {
    v(Context context, String str) {
        super(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void n(String str, Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).c(str, bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void o() {
        FirebaseAnalytics.getInstance(a()).d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void p(Boolean bool) {
        FirebaseAnalytics.getInstance(a()).e(bool.booleanValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void q(Bundle bundle) {
        boolean z6 = bundle.getBoolean("analytics_storage");
        boolean z7 = bundle.getBoolean("ad_storage");
        boolean z8 = bundle.getBoolean(TenjinConsts.TENJIN_GOOGLE_AD_USER_DATA);
        boolean z9 = bundle.getBoolean(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION);
        EnumMap enumMap = new EnumMap(FirebaseAnalytics.b.class);
        enumMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, z6 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_STORAGE, z7 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_USER_DATA, z8 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        enumMap.put(FirebaseAnalytics.b.AD_PERSONALIZATION, z9 ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
        FirebaseAnalytics.getInstance(a()).f(enumMap);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void r(Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).g(bundle);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void s(long j7) {
        FirebaseAnalytics.getInstance(a()).h(j7);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void t(String str) {
        FirebaseAnalytics.getInstance(a()).i(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void u(Bundle bundle) {
        Set<String> setKeySet = bundle.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(a());
        for (String str : setKeySet) {
            firebaseAnalytics.j(str, (String) bundle.get(str));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void v(String str, String str2) {
        FirebaseAnalytics.getInstance(a()).j(str, str2);
        return null;
    }

    AbstractC2272l A(final Bundle bundle) {
        return AbstractC2275o.c(new Callable() { // from class: io.invertase.firebase.analytics.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20095a.r(bundle);
            }
        });
    }

    AbstractC2272l B(final long j7) {
        return AbstractC2275o.c(new Callable() { // from class: io.invertase.firebase.analytics.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20097a.s(j7);
            }
        });
    }

    AbstractC2272l C(final String str) {
        return AbstractC2275o.c(new Callable() { // from class: io.invertase.firebase.analytics.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20087a.t(str);
            }
        });
    }

    AbstractC2272l D(final Bundle bundle) {
        return AbstractC2275o.c(new Callable() { // from class: io.invertase.firebase.analytics.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20080a.u(bundle);
            }
        });
    }

    AbstractC2272l E(final String str, final String str2) {
        return AbstractC2275o.c(new Callable() { // from class: io.invertase.firebase.analytics.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20092a.v(str, str2);
            }
        });
    }

    AbstractC2272l l() {
        return FirebaseAnalytics.getInstance(a()).a();
    }

    AbstractC2272l m() {
        return FirebaseAnalytics.getInstance(a()).b();
    }

    AbstractC2272l w(final String str, final Bundle bundle) {
        return AbstractC2275o.c(new Callable() { // from class: io.invertase.firebase.analytics.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20089a.n(str, bundle);
            }
        });
    }

    AbstractC2272l x() {
        return AbstractC2275o.c(new Callable() { // from class: io.invertase.firebase.analytics.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20082a.o();
            }
        });
    }

    AbstractC2272l y(final Boolean bool) {
        return AbstractC2275o.c(new Callable() { // from class: io.invertase.firebase.analytics.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20085a.p(bool);
            }
        });
    }

    AbstractC2272l z(final Bundle bundle) {
        return AbstractC2275o.c(new Callable() { // from class: io.invertase.firebase.analytics.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20083a.q(bundle);
            }
        });
    }
}
