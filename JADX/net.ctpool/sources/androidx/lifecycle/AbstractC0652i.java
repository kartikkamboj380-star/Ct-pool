package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0652i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicBoolean f8353a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.i$a */
    static class a extends AbstractC0647d {
        a() {
        }

        @Override // androidx.lifecycle.AbstractC0647d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            v.g(activity);
        }

        @Override // androidx.lifecycle.AbstractC0647d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.AbstractC0647d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Context context) {
        if (f8353a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new a());
    }
}
