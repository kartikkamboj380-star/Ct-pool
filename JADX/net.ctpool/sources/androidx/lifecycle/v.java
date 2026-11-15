package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0651h;

/* JADX INFO: loaded from: classes.dex */
public class v extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f8379m;

    interface a {
        void a();

        void b();

        void c();
    }

    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            v.a(activity, AbstractC0651h.b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            v.a(activity, AbstractC0651h.b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            v.a(activity, AbstractC0651h.b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            v.a(activity, AbstractC0651h.b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            v.a(activity, AbstractC0651h.b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            v.a(activity, AbstractC0651h.b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void a(Activity activity, AbstractC0651h.b bVar) {
        if (activity instanceof l) {
            AbstractC0651h lifecycle = ((l) activity).getLifecycle();
            if (lifecycle instanceof m) {
                ((m) lifecycle).h(bVar);
            }
        }
    }

    private void b(AbstractC0651h.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    static v f(Activity activity) {
        return (v) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public static void g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new v(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    void h(a aVar) {
        this.f8379m = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f8379m);
        b(AbstractC0651h.b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(AbstractC0651h.b.ON_DESTROY);
        this.f8379m = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(AbstractC0651h.b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f8379m);
        b(AbstractC0651h.b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f8379m);
        b(AbstractC0651h.b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(AbstractC0651h.b.ON_STOP);
    }
}
