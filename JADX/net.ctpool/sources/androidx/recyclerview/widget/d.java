package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.H;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
class d extends RecyclerView.n implements RecyclerView.r {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f8792D = {R.attr.state_pressed};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f8793E = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f8794A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Runnable f8795B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final RecyclerView.s f8796C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f8799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f8800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f8803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f8804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f8805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f8806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f8807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f8808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f8809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f8810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f8811o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f8812p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f8815s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f8822z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8813q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f8814r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f8816t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f8817u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f8818v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8819w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f8820x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f8821y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    class b extends RecyclerView.s {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i7, int i8) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8825a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8825a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8825a) {
                this.f8825a = false;
                return;
            }
            if (((Float) d.this.f8822z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f8794A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.f8794A = 2;
                dVar2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0169d implements ValueAnimator.AnimatorUpdateListener {
        C0169d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f8799c.setAlpha(iFloatValue);
            d.this.f8800d.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i8, int i9) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8822z = valueAnimatorOfFloat;
        this.f8794A = 0;
        this.f8795B = new a();
        this.f8796C = new b();
        this.f8799c = stateListDrawable;
        this.f8800d = drawable;
        this.f8803g = stateListDrawable2;
        this.f8804h = drawable2;
        this.f8801e = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.f8802f = Math.max(i7, drawable.getIntrinsicWidth());
        this.f8805i = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.f8806j = Math.max(i7, drawable2.getIntrinsicWidth());
        this.f8797a = i8;
        this.f8798b = i9;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0169d());
        j(recyclerView);
    }

    private void C(float f7) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f7));
        if (Math.abs(this.f8808l - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f8809m, fMax, iArrP, this.f8815s.computeVerticalScrollRange(), this.f8815s.computeVerticalScrollOffset(), this.f8814r);
        if (iX != 0) {
            this.f8815s.scrollBy(0, iX);
        }
        this.f8809m = fMax;
    }

    private void k() {
        this.f8815s.removeCallbacks(this.f8795B);
    }

    private void l() {
        this.f8815s.V0(this);
        this.f8815s.W0(this);
        this.f8815s.X0(this.f8796C);
        k();
    }

    private void m(Canvas canvas) {
        int i7 = this.f8814r;
        int i8 = this.f8805i;
        int i9 = this.f8811o;
        int i10 = this.f8810n;
        this.f8803g.setBounds(0, 0, i10, i8);
        this.f8804h.setBounds(0, 0, this.f8813q, this.f8806j);
        canvas.translate(0.0f, i7 - i8);
        this.f8804h.draw(canvas);
        canvas.translate(i9 - (i10 / 2), 0.0f);
        this.f8803g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i7 = this.f8813q;
        int i8 = this.f8801e;
        int i9 = i7 - i8;
        int i10 = this.f8808l;
        int i11 = this.f8807k;
        int i12 = i10 - (i11 / 2);
        this.f8799c.setBounds(0, 0, i8, i11);
        this.f8800d.setBounds(0, 0, this.f8802f, this.f8814r);
        if (s()) {
            this.f8800d.draw(canvas);
            canvas.translate(this.f8801e, i12);
            canvas.scale(-1.0f, 1.0f);
            this.f8799c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i9 = this.f8801e;
        } else {
            canvas.translate(i9, 0.0f);
            this.f8800d.draw(canvas);
            canvas.translate(0.0f, i12);
            this.f8799c.draw(canvas);
        }
        canvas.translate(-i9, -i12);
    }

    private int[] o() {
        int[] iArr = this.f8821y;
        int i7 = this.f8798b;
        iArr[0] = i7;
        iArr[1] = this.f8813q - i7;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.f8820x;
        int i7 = this.f8798b;
        iArr[0] = i7;
        iArr[1] = this.f8814r - i7;
        return iArr;
    }

    private void r(float f7) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f7));
        if (Math.abs(this.f8811o - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f8812p, fMax, iArrO, this.f8815s.computeHorizontalScrollRange(), this.f8815s.computeHorizontalScrollOffset(), this.f8813q);
        if (iX != 0) {
            this.f8815s.scrollBy(iX, 0);
        }
        this.f8812p = fMax;
    }

    private boolean s() {
        return H.B(this.f8815s) == 1;
    }

    private void w(int i7) {
        k();
        this.f8815s.postDelayed(this.f8795B, i7);
    }

    private int x(float f7, float f8, int[] iArr, int i7, int i8, int i9) {
        int i10 = iArr[1] - iArr[0];
        if (i10 == 0) {
            return 0;
        }
        int i11 = i7 - i9;
        int i12 = (int) (((f8 - f7) / i10) * i11);
        int i13 = i8 + i12;
        if (i13 >= i11 || i13 < 0) {
            return 0;
        }
        return i12;
    }

    private void z() {
        this.f8815s.h(this);
        this.f8815s.j(this);
        this.f8815s.k(this.f8796C);
    }

    public void A() {
        int i7 = this.f8794A;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                this.f8822z.cancel();
            }
        }
        this.f8794A = 1;
        ValueAnimator valueAnimator = this.f8822z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f8822z.setDuration(500L);
        this.f8822z.setStartDelay(0L);
        this.f8822z.start();
    }

    void B(int i7, int i8) {
        int iComputeVerticalScrollRange = this.f8815s.computeVerticalScrollRange();
        int i9 = this.f8814r;
        this.f8816t = iComputeVerticalScrollRange - i9 > 0 && i9 >= this.f8797a;
        int iComputeHorizontalScrollRange = this.f8815s.computeHorizontalScrollRange();
        int i10 = this.f8813q;
        boolean z6 = iComputeHorizontalScrollRange - i10 > 0 && i10 >= this.f8797a;
        this.f8817u = z6;
        boolean z7 = this.f8816t;
        if (!z7 && !z6) {
            if (this.f8818v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z7) {
            float f7 = i9;
            this.f8808l = (int) ((f7 * (i8 + (f7 / 2.0f))) / iComputeVerticalScrollRange);
            this.f8807k = Math.min(i9, (i9 * i9) / iComputeVerticalScrollRange);
        }
        if (this.f8817u) {
            float f8 = i10;
            this.f8811o = (int) ((f8 * (i7 + (f8 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f8810n = Math.min(i10, (i10 * i10) / iComputeHorizontalScrollRange);
        }
        int i11 = this.f8818v;
        if (i11 == 0 || i11 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f8818v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.f8819w = 1;
                    this.f8812p = (int) motionEvent.getX();
                } else if (zU) {
                    this.f8819w = 2;
                    this.f8809m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f8818v == 2) {
            this.f8809m = 0.0f;
            this.f8812p = 0.0f;
            y(1);
            this.f8819w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f8818v == 2) {
            A();
            if (this.f8819w == 1) {
                r(motionEvent.getX());
            }
            if (this.f8819w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i7 = this.f8818v;
        if (i7 == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.f8819w = 1;
                this.f8812p = (int) motionEvent.getX();
            } else if (zU) {
                this.f8819w = 2;
                this.f8809m = (int) motionEvent.getY();
            }
            y(2);
        } else if (i7 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void c(boolean z6) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f8813q != this.f8815s.getWidth() || this.f8814r != this.f8815s.getHeight()) {
            this.f8813q = this.f8815s.getWidth();
            this.f8814r = this.f8815s.getHeight();
            y(0);
        } else if (this.f8794A != 0) {
            if (this.f8816t) {
                n(canvas);
            }
            if (this.f8817u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f8815s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f8815s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i7) {
        int i8 = this.f8794A;
        if (i8 == 1) {
            this.f8822z.cancel();
        } else if (i8 != 2) {
            return;
        }
        this.f8794A = 3;
        ValueAnimator valueAnimator = this.f8822z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f8822z.setDuration(i7);
        this.f8822z.start();
    }

    boolean t(float f7, float f8) {
        if (f8 >= this.f8814r - this.f8805i) {
            int i7 = this.f8811o;
            int i8 = this.f8810n;
            if (f7 >= i7 - (i8 / 2) && f7 <= i7 + (i8 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f7, float f8) {
        if (!s() ? f7 >= this.f8813q - this.f8801e : f7 <= this.f8801e / 2) {
            int i7 = this.f8808l;
            int i8 = this.f8807k;
            if (f8 >= i7 - (i8 / 2) && f8 <= i7 + (i8 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.f8815s.invalidate();
    }

    void y(int i7) {
        int i8;
        if (i7 == 2 && this.f8818v != 2) {
            this.f8799c.setState(f8792D);
            k();
        }
        if (i7 == 0) {
            v();
        } else {
            A();
        }
        if (this.f8818v != 2 || i7 == 2) {
            i8 = i7 == 1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 1200;
            this.f8818v = i7;
        }
        this.f8799c.setState(f8793E);
        w(i8);
        this.f8818v = i7;
    }
}
