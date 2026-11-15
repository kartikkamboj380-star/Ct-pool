package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
class o0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static o0 f6181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static o0 f6182x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f6183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CharSequence f6184n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f6185o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f6186p = new Runnable() { // from class: androidx.appcompat.widget.m0
        @Override // java.lang.Runnable
        public final void run() {
            this.f6177m.e();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f6187q = new Runnable() { // from class: androidx.appcompat.widget.n0
        @Override // java.lang.Runnable
        public final void run() {
            this.f6180m.d();
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6188r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p0 f6190t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6191u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6192v;

    private o0(View view, CharSequence charSequence) {
        this.f6183m = view;
        this.f6184n = charSequence;
        this.f6185o = androidx.core.view.J.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f6183m.removeCallbacks(this.f6186p);
    }

    private void c() {
        this.f6192v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f6183m.postDelayed(this.f6186p, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(o0 o0Var) {
        o0 o0Var2 = f6181w;
        if (o0Var2 != null) {
            o0Var2.b();
        }
        f6181w = o0Var;
        if (o0Var != null) {
            o0Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        o0 o0Var = f6181w;
        if (o0Var != null && o0Var.f6183m == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new o0(view, charSequence);
            return;
        }
        o0 o0Var2 = f6182x;
        if (o0Var2 != null && o0Var2.f6183m == view) {
            o0Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x6 = (int) motionEvent.getX();
        int y6 = (int) motionEvent.getY();
        if (!this.f6192v && Math.abs(x6 - this.f6188r) <= this.f6185o && Math.abs(y6 - this.f6189s) <= this.f6185o) {
            return false;
        }
        this.f6188r = x6;
        this.f6189s = y6;
        this.f6192v = false;
        return true;
    }

    void d() {
        if (f6182x == this) {
            f6182x = null;
            p0 p0Var = this.f6190t;
            if (p0Var != null) {
                p0Var.c();
                this.f6190t = null;
                c();
                this.f6183m.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f6181w == this) {
            g(null);
        }
        this.f6183m.removeCallbacks(this.f6187q);
    }

    void i(boolean z6) {
        long longPressTimeout;
        long j7;
        long j8;
        if (androidx.core.view.H.S(this.f6183m)) {
            g(null);
            o0 o0Var = f6182x;
            if (o0Var != null) {
                o0Var.d();
            }
            f6182x = this;
            this.f6191u = z6;
            p0 p0Var = new p0(this.f6183m.getContext());
            this.f6190t = p0Var;
            p0Var.e(this.f6183m, this.f6188r, this.f6189s, this.f6191u, this.f6184n);
            this.f6183m.addOnAttachStateChangeListener(this);
            if (this.f6191u) {
                j8 = 2500;
            } else {
                if ((androidx.core.view.H.L(this.f6183m) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j7 = 15000;
                }
                j8 = j7 - longPressTimeout;
            }
            this.f6183m.removeCallbacks(this.f6187q);
            this.f6183m.postDelayed(this.f6187q, j8);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f6190t != null && this.f6191u) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f6183m.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f6183m.isEnabled() && this.f6190t == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f6188r = view.getWidth() / 2;
        this.f6189s = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
