package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class S implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f5746m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f5747n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f5748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final View f5749p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Runnable f5750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f5751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f5752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f5754u = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = S.this.f5749p.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            S.this.e();
        }
    }

    public S(View view) {
        this.f5749p = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f5746m = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f5747n = tapTimeout;
        this.f5748o = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f5751r;
        if (runnable != null) {
            this.f5749p.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f5750q;
        if (runnable2 != null) {
            this.f5749p.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        P p6;
        View view = this.f5749p;
        androidx.appcompat.view.menu.p pVarB = b();
        if (pVarB == null || !pVarB.a() || (p6 = (P) pVarB.j()) == null || !p6.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(p6, motionEventObtainNoHistory);
        boolean zE = p6.e(motionEventObtainNoHistory, this.f5753t);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f5749p;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5753t = motionEvent.getPointerId(0);
            if (this.f5750q == null) {
                this.f5750q = new a();
            }
            view.postDelayed(this.f5750q, this.f5747n);
            if (this.f5751r == null) {
                this.f5751r = new b();
            }
            view.postDelayed(this.f5751r, this.f5748o);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f5753t);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f5746m)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return false;
    }

    private static boolean h(View view, float f7, float f8, float f9) {
        float f10 = -f9;
        return f7 >= f10 && f8 >= f10 && f7 < ((float) (view.getRight() - view.getLeft())) + f9 && f8 < ((float) (view.getBottom() - view.getTop())) + f9;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f5754u);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f5754u);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p b();

    protected abstract boolean c();

    protected boolean d() {
        androidx.appcompat.view.menu.p pVarB = b();
        if (pVarB == null || !pVarB.a()) {
            return true;
        }
        pVarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f5749p;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f5752s = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z6;
        boolean z7 = this.f5752s;
        if (z7) {
            z6 = f(motionEvent) || !d();
        } else {
            z6 = g(motionEvent) && c();
            if (z6) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f5749p.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f5752s = z6;
        return z6 || z7;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f5752s = false;
        this.f5753t = -1;
        Runnable runnable = this.f5750q;
        if (runnable != null) {
            this.f5749p.removeCallbacks(runnable);
        }
    }
}
