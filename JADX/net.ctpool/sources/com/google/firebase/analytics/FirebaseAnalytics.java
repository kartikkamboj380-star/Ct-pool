package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;
import com.tenjin.android.config.TenjinConsts;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w3.z;
import z3.AbstractC2272l;
import z3.AbstractC2275o;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f17337c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1073e1 f17338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f17339b;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    private FirebaseAnalytics(C1073e1 c1073e1) {
        Preconditions.checkNotNull(c1073e1);
        this.f17338a = c1073e1;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f17337c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f17337c == null) {
                        f17337c = new FirebaseAnalytics(C1073e1.e(context));
                    }
                } finally {
                }
            }
        }
        return f17337c;
    }

    @Keep
    public static z getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C1073e1 c1073e1F = C1073e1.f(context, null, null, null, bundle);
        if (c1073e1F == null) {
            return null;
        }
        return new d(c1073e1F);
    }

    private final ExecutorService l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f17339b == null) {
                    this.f17339b = new com.google.firebase.analytics.a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.f17339b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public final AbstractC2272l a() {
        try {
            return AbstractC2275o.d(l(), new c(this));
        } catch (RuntimeException e7) {
            this.f17338a.i(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return AbstractC2275o.e(e7);
        }
    }

    public final AbstractC2272l b() {
        try {
            return AbstractC2275o.d(l(), new com.google.firebase.analytics.b(this));
        } catch (RuntimeException e7) {
            this.f17338a.i(5, "Failed to schedule task for getSessionId", null, null, null);
            return AbstractC2275o.e(e7);
        }
    }

    public final void c(String str, Bundle bundle) {
        this.f17338a.s(str, bundle);
    }

    public final void d() {
        this.f17338a.R();
    }

    public final void e(boolean z6) {
        this.f17338a.q(Boolean.valueOf(z6));
    }

    public final void f(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString(TenjinConsts.TENJIN_GOOGLE_AD_USER_DATA, "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString(TenjinConsts.TENJIN_GOOGLE_AD_USER_DATA, "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION, "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString(TenjinConsts.TENJIN_GOOGLE_AD_PERSONALIZATION, "denied");
            }
        }
        this.f17338a.G(bundle);
    }

    public final void g(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f17338a.K(bundle);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) AbstractC2275o.b(com.google.firebase.installations.c.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw new IllegalStateException(e7);
        } catch (ExecutionException e8) {
            throw new IllegalStateException(e8.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void h(long j7) {
        this.f17338a.j(j7);
    }

    public final void i(String str) {
        this.f17338a.L(str);
    }

    public final void j(String str, String str2) {
        this.f17338a.C(str, str2);
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f17338a.k(activity, str, str2);
    }
}
