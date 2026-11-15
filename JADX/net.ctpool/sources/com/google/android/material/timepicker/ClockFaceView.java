package com.google.android.material.timepicker;

import A3.e;
import A3.g;
import A3.i;
import A3.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import com.google.android.material.timepicker.ClockHandView;
import f.AbstractC1641a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.c {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final ClockHandView f17268M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final Rect f17269N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final RectF f17270O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final SparseArray f17271P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final C0574a f17272Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final int[] f17273R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final float[] f17274S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final int f17275T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final int f17276U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final int f17277V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final int f17278W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String[] f17279a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f17280b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ColorStateList f17281c0;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.v(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f17268M.g()) - ClockFaceView.this.f17275T);
            return true;
        }
    }

    class b extends C0574a {
        b() {
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            int iIntValue = ((Integer) view.getTag(e.f208n)).intValue();
            if (iIntValue > 0) {
                c7.J0((View) ClockFaceView.this.f17271P.get(iIntValue - 1));
            }
            c7.j0(C.c.b(0, 1, iIntValue, 1, false, view.isSelected()));
            c7.h0(true);
            c7.b(C.a.f7368i);
        }

        @Override // androidx.core.view.C0574a
        public boolean j(View view, int i7, Bundle bundle) {
            if (i7 != 16) {
                return super.j(view, i7, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            float x6 = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView.this.f17268M.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, x6, height, 0));
            ClockFaceView.this.f17268M.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, x6, height, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f121u);
    }

    private void C() {
        RectF rectFD = this.f17268M.d();
        for (int i7 = 0; i7 < this.f17271P.size(); i7++) {
            TextView textView = (TextView) this.f17271P.get(i7);
            if (textView != null) {
                textView.getDrawingRect(this.f17269N);
                offsetDescendantRectToMyCoords(textView, this.f17269N);
                textView.setSelected(rectFD.contains(this.f17269N.centerX(), this.f17269N.centerY()));
                textView.getPaint().setShader(D(rectFD, this.f17269N, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient D(RectF rectF, Rect rect, TextView textView) {
        this.f17270O.set(rect);
        this.f17270O.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (RectF.intersects(rectF, this.f17270O)) {
            return new RadialGradient(rectF.centerX() - this.f17270O.left, rectF.centerY() - this.f17270O.top, rectF.width() * 0.5f, this.f17273R, this.f17274S, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float E(float f7, float f8, float f9) {
        return Math.max(Math.max(f7, f8), f9);
    }

    private void G(int i7) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f17271P.size();
        for (int i8 = 0; i8 < Math.max(this.f17279a0.length, size); i8++) {
            TextView textView = (TextView) this.f17271P.get(i8);
            if (i8 >= this.f17279a0.length) {
                removeView(textView);
                this.f17271P.remove(i8);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(g.f226d, (ViewGroup) this, false);
                    this.f17271P.put(i8, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f17279a0[i8]);
                textView.setTag(e.f208n, Integer.valueOf(i8));
                H.p0(textView, this.f17272Q);
                textView.setTextColor(this.f17281c0);
                if (i7 != 0) {
                    textView.setContentDescription(getResources().getString(i7, this.f17279a0[i8]));
                }
            }
        }
    }

    public void F(String[] strArr, int i7) {
        this.f17279a0 = strArr;
        G(i7);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void a(float f7, boolean z6) {
        if (Math.abs(this.f17280b0 - f7) > 0.001f) {
            this.f17280b0 = f7;
            C();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C.N0(accessibilityNodeInfo).i0(C.b.b(1, this.f17279a0.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        C();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iE = (int) (this.f17278W / E(this.f17276U / displayMetrics.heightPixels, this.f17277V / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iE, 1073741824);
        setMeasuredDimension(iE, iE);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.b
    public void v(int i7) {
        if (i7 != u()) {
            super.v(i7);
            this.f17268M.j(u());
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17269N = new Rect();
        this.f17270O = new RectF();
        this.f17271P = new SparseArray();
        this.f17274S = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f482d1, i7, i.f272p);
        Resources resources = getResources();
        ColorStateList colorStateListA = K3.c.a(context, typedArrayObtainStyledAttributes, j.f498f1);
        this.f17281c0 = colorStateListA;
        LayoutInflater.from(context).inflate(g.f227e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(e.f203i);
        this.f17268M = clockHandView;
        this.f17275T = resources.getDimensionPixelSize(A3.c.f156h);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f17273R = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC1641a.a(context, A3.b.f128b).getDefaultColor();
        ColorStateList colorStateListA2 = K3.c.a(context, typedArrayObtainStyledAttributes, j.f490e1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f17272Q = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        F(strArr, 0);
        this.f17276U = resources.getDimensionPixelSize(A3.c.f169u);
        this.f17277V = resources.getDimensionPixelSize(A3.c.f170v);
        this.f17278W = resources.getDimensionPixelSize(A3.c.f158j);
    }
}
