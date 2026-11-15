package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.v;

/* JADX INFO: loaded from: classes.dex */
public class t implements l {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final t f8368u = new t();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Handler f8373q;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8369m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8370n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f8371o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8372p = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final m f8374r = new m(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f8375s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    v.a f8376t = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.g();
            t.this.h();
        }
    }

    class b implements v.a {
        b() {
        }

        @Override // androidx.lifecycle.v.a
        public void a() {
            t.this.c();
        }

        @Override // androidx.lifecycle.v.a
        public void b() {
        }

        @Override // androidx.lifecycle.v.a
        public void c() {
            t.this.d();
        }
    }

    class c extends AbstractC0647d {

        class a extends AbstractC0647d {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                t.this.c();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                t.this.d();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC0647d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                v.f(activity).h(t.this.f8376t);
            }
        }

        @Override // androidx.lifecycle.AbstractC0647d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            t.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.AbstractC0647d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            t.this.e();
        }
    }

    private t() {
    }

    public static l i() {
        return f8368u;
    }

    static void j(Context context) {
        f8368u.f(context);
    }

    void a() {
        int i7 = this.f8370n - 1;
        this.f8370n = i7;
        if (i7 == 0) {
            this.f8373q.postDelayed(this.f8375s, 700L);
        }
    }

    void c() {
        int i7 = this.f8370n + 1;
        this.f8370n = i7;
        if (i7 == 1) {
            if (!this.f8371o) {
                this.f8373q.removeCallbacks(this.f8375s);
            } else {
                this.f8374r.h(AbstractC0651h.b.ON_RESUME);
                this.f8371o = false;
            }
        }
    }

    void d() {
        int i7 = this.f8369m + 1;
        this.f8369m = i7;
        if (i7 == 1 && this.f8372p) {
            this.f8374r.h(AbstractC0651h.b.ON_START);
            this.f8372p = false;
        }
    }

    void e() {
        this.f8369m--;
        h();
    }

    void f(Context context) {
        this.f8373q = new Handler();
        this.f8374r.h(AbstractC0651h.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void g() {
        if (this.f8370n == 0) {
            this.f8371o = true;
            this.f8374r.h(AbstractC0651h.b.ON_PAUSE);
        }
    }

    @Override // androidx.lifecycle.l
    public AbstractC0651h getLifecycle() {
        return this.f8374r;
    }

    void h() {
        if (this.f8369m == 0 && this.f8371o) {
            this.f8374r.h(AbstractC0651h.b.ON_STOP);
            this.f8372p = true;
        }
    }
}
