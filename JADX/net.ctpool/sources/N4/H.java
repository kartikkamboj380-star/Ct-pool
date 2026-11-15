package N4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final H f2314m = new H();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f2315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static D f2316o;

    private H() {
    }

    public final void a(D d7) {
        f2316o = d7;
        if (d7 == null || !f2315n) {
            return;
        }
        f2315n = false;
        d7.k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        w5.k.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        w5.k.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        w5.k.f(activity, "activity");
        D d7 = f2316o;
        if (d7 != null) {
            d7.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        i5.u uVar;
        w5.k.f(activity, "activity");
        D d7 = f2316o;
        if (d7 != null) {
            d7.k();
            uVar = i5.u.f19985a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            f2315n = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        w5.k.f(activity, "activity");
        w5.k.f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        w5.k.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        w5.k.f(activity, "activity");
    }
}
