package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int f7468D = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f7469A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f7470B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f7471C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final View f7474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f7475p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f7478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f7479t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f7483x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f7484y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f7485z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final C0149a f7472m = new C0149a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Interpolator f7473n = new AccelerateInterpolator();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float[] f7476q = {0.0f, 0.0f};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float[] f7477r = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float[] f7480u = {0.0f, 0.0f};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float[] f7481v = {0.0f, 0.0f};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float[] f7482w = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0149a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f7488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f7489d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f7495j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f7496k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f7490e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f7494i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f7491f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f7492g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7493h = 0;

        C0149a() {
        }

        private float e(long j7) {
            if (j7 < this.f7490e) {
                return 0.0f;
            }
            long j8 = this.f7494i;
            if (j8 < 0 || j7 < j8) {
                return a.e((j7 - r0) / this.f7486a, 0.0f, 1.0f) * 0.5f;
            }
            float f7 = this.f7495j;
            return (1.0f - f7) + (f7 * a.e((j7 - j8) / this.f7496k, 0.0f, 1.0f));
        }

        private float g(float f7) {
            return ((-4.0f) * f7 * f7) + (f7 * 4.0f);
        }

        public void a() {
            if (this.f7491f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j7 = jCurrentAnimationTimeMillis - this.f7491f;
            this.f7491f = jCurrentAnimationTimeMillis;
            float f7 = j7 * fG;
            this.f7492g = (int) (this.f7488c * f7);
            this.f7493h = (int) (f7 * this.f7489d);
        }

        public int b() {
            return this.f7492g;
        }

        public int c() {
            return this.f7493h;
        }

        public int d() {
            float f7 = this.f7488c;
            return (int) (f7 / Math.abs(f7));
        }

        public int f() {
            float f7 = this.f7489d;
            return (int) (f7 / Math.abs(f7));
        }

        public boolean h() {
            return this.f7494i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f7494i + ((long) this.f7496k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f7496k = a.f((int) (jCurrentAnimationTimeMillis - this.f7490e), 0, this.f7487b);
            this.f7495j = e(jCurrentAnimationTimeMillis);
            this.f7494i = jCurrentAnimationTimeMillis;
        }

        public void j(int i7) {
            this.f7487b = i7;
        }

        public void k(int i7) {
            this.f7486a = i7;
        }

        public void l(float f7, float f8) {
            this.f7488c = f7;
            this.f7489d = f8;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f7490e = jCurrentAnimationTimeMillis;
            this.f7494i = -1L;
            this.f7491f = jCurrentAnimationTimeMillis;
            this.f7495j = 0.5f;
            this.f7492g = 0;
            this.f7493h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f7469A) {
                if (aVar.f7484y) {
                    aVar.f7484y = false;
                    aVar.f7472m.m();
                }
                C0149a c0149a = a.this.f7472m;
                if (c0149a.h() || !a.this.u()) {
                    a.this.f7469A = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f7485z) {
                    aVar2.f7485z = false;
                    aVar2.c();
                }
                c0149a.a();
                a.this.j(c0149a.b(), c0149a.c());
                H.h0(a.this.f7474o, this);
            }
        }
    }

    public a(View view) {
        this.f7474o = view;
        float f7 = Resources.getSystem().getDisplayMetrics().density;
        float f8 = (int) ((1575.0f * f7) + 0.5f);
        o(f8, f8);
        float f9 = (int) ((f7 * 315.0f) + 0.5f);
        p(f9, f9);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f7468D);
        r(500);
        q(500);
    }

    private float d(int i7, float f7, float f8, float f9) {
        float fH = h(this.f7476q[i7], f8, this.f7477r[i7], f7);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f10 = this.f7480u[i7];
        float f11 = this.f7481v[i7];
        float f12 = this.f7482w[i7];
        float f13 = f10 * f9;
        return fH > 0.0f ? e(fH * f13, f11, f12) : -e((-fH) * f13, f11, f12);
    }

    static float e(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }

    static int f(int i7, int i8, int i9) {
        return i7 > i9 ? i9 : i7 < i8 ? i8 : i7;
    }

    private float g(float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f7478s;
        if (i7 == 0 || i7 == 1) {
            if (f7 < f8) {
                if (f7 >= 0.0f) {
                    return 1.0f - (f7 / f8);
                }
                if (this.f7469A && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f7 < 0.0f) {
            return f7 / (-f8);
        }
        return 0.0f;
    }

    private float h(float f7, float f8, float f9, float f10) {
        float interpolation;
        float fE = e(f7 * f8, 0.0f, f9);
        float fG = g(f8 - f10, fE) - g(f10, fE);
        if (fG < 0.0f) {
            interpolation = -this.f7473n.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f7473n.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f7484y) {
            this.f7469A = false;
        } else {
            this.f7472m.i();
        }
    }

    private void v() {
        int i7;
        if (this.f7475p == null) {
            this.f7475p = new b();
        }
        this.f7469A = true;
        this.f7484y = true;
        if (this.f7483x || (i7 = this.f7479t) <= 0) {
            this.f7475p.run();
        } else {
            H.i0(this.f7474o, this.f7475p, i7);
        }
        this.f7483x = true;
    }

    public abstract boolean a(int i7);

    public abstract boolean b(int i7);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f7474o.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i7, int i8);

    public a k(int i7) {
        this.f7479t = i7;
        return this;
    }

    public a l(int i7) {
        this.f7478s = i7;
        return this;
    }

    public a m(boolean z6) {
        if (this.f7470B && !z6) {
            i();
        }
        this.f7470B = z6;
        return this;
    }

    public a n(float f7, float f8) {
        float[] fArr = this.f7477r;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    public a o(float f7, float f8) {
        float[] fArr = this.f7482w;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f7470B) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            }
            return this.f7471C && this.f7469A;
        }
        this.f7485z = true;
        this.f7483x = false;
        this.f7472m.l(d(0, motionEvent.getX(), view.getWidth(), this.f7474o.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f7474o.getHeight()));
        if (!this.f7469A && u()) {
            v();
        }
        if (this.f7471C) {
            return false;
        }
    }

    public a p(float f7, float f8) {
        float[] fArr = this.f7481v;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    public a q(int i7) {
        this.f7472m.j(i7);
        return this;
    }

    public a r(int i7) {
        this.f7472m.k(i7);
        return this;
    }

    public a s(float f7, float f8) {
        float[] fArr = this.f7476q;
        fArr[0] = f7;
        fArr[1] = f8;
        return this;
    }

    public a t(float f7, float f8) {
        float[] fArr = this.f7480u;
        fArr[0] = f7 / 1000.0f;
        fArr[1] = f8 / 1000.0f;
        return this;
    }

    boolean u() {
        C0149a c0149a = this.f7472m;
        int iF = c0149a.f();
        int iD = c0149a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
