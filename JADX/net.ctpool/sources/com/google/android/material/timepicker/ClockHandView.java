package com.google.android.material.timepicker;

import A3.i;
import A3.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private double f17284A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f17285B;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f17286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f17288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f17289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f17290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f17291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f17292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f17293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f17294u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Paint f17295v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final RectF f17296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f17297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f17298y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f17299z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f7, boolean z6);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f121u);
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.f17285B * ((float) Math.cos(this.f17284A))) + width;
        float f7 = height;
        float fSin = (this.f17285B * ((float) Math.sin(this.f17284A))) + f7;
        this.f17295v.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f17293t, this.f17295v);
        double dSin = Math.sin(this.f17284A);
        double dCos = Math.cos(this.f17284A);
        this.f17295v.setStrokeWidth(this.f17297x);
        canvas.drawLine(width, f7, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f17295v);
        canvas.drawCircle(width, f7, this.f17294u, this.f17295v);
    }

    private int e(float f7, float f8) {
        int degrees = (int) Math.toDegrees(Math.atan2(f8 - (getHeight() / 2), f7 - (getWidth() / 2)));
        int i7 = degrees + 90;
        return i7 < 0 ? degrees + 450 : i7;
    }

    private Pair h(float f7) {
        float f8 = f();
        if (Math.abs(f8 - f7) > 180.0f) {
            if (f8 > 180.0f && f7 < 180.0f) {
                f7 += 360.0f;
            }
            if (f8 < 180.0f && f7 > 180.0f) {
                f8 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(f8), Float.valueOf(f7));
    }

    private boolean i(float f7, float f8, boolean z6, boolean z7, boolean z8) {
        float fE = e(f7, f8);
        boolean z9 = false;
        boolean z10 = f() != fE;
        if (z7 && z10) {
            return true;
        }
        if (!z10 && !z6) {
            return false;
        }
        if (z8 && this.f17287n) {
            z9 = true;
        }
        l(fE, z9);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float f7, boolean z6) {
        float f8 = f7 % 360.0f;
        this.f17298y = f8;
        this.f17284A = Math.toRadians(f8 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.f17285B * ((float) Math.cos(this.f17284A)));
        float fSin = height + (this.f17285B * ((float) Math.sin(this.f17284A)));
        RectF rectF = this.f17296w;
        int i7 = this.f17293t;
        rectF.set(width - i7, fSin - i7, width + i7, fSin + i7);
        Iterator it = this.f17292s.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(f8, z6);
        }
        invalidate();
    }

    public void b(c cVar) {
        this.f17292s.add(cVar);
    }

    public RectF d() {
        return this.f17296w;
    }

    public float f() {
        return this.f17298y;
    }

    public int g() {
        return this.f17293t;
    }

    public void j(int i7) {
        this.f17285B = i7;
        invalidate();
    }

    public void k(float f7) {
        l(f7, false);
    }

    public void l(float f7, boolean z6) {
        ValueAnimator valueAnimator = this.f17286m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z6) {
            m(f7, false);
            return;
        }
        Pair pairH = h(f7);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairH.first).floatValue(), ((Float) pairH.second).floatValue());
        this.f17286m = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f17286m.addUpdateListener(new a());
        this.f17286m.addListener(new b());
        this.f17286m.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        k(f());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z7;
        boolean z8;
        int actionMasked = motionEvent.getActionMasked();
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f17288o = x6;
            this.f17289p = y6;
            this.f17290q = true;
            this.f17299z = false;
            z6 = true;
            z7 = false;
            z8 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i7 = (int) (x6 - this.f17288o);
            int i8 = (int) (y6 - this.f17289p);
            this.f17290q = (i7 * i7) + (i8 * i8) > this.f17291r;
            z7 = this.f17299z;
            z8 = actionMasked == 1;
            z6 = false;
        } else {
            z7 = false;
            z6 = false;
            z8 = false;
        }
        this.f17299z |= i(x6, y6, z7, z6, z8);
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17292s = new ArrayList();
        Paint paint = new Paint();
        this.f17295v = paint;
        this.f17296w = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f506g1, i7, i.f272p);
        this.f17285B = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f522i1, 0);
        this.f17293t = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f530j1, 0);
        this.f17297x = getResources().getDimensionPixelSize(A3.c.f157i);
        this.f17294u = r6.getDimensionPixelSize(A3.c.f155g);
        int color = typedArrayObtainStyledAttributes.getColor(j.f514h1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.f17291r = ViewConfiguration.get(context).getScaledTouchSlop();
        H.z0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
