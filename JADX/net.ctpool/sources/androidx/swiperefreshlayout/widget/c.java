package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.core.view.A;
import androidx.core.view.B;
import androidx.core.view.C0604y;
import androidx.core.view.H;
import androidx.core.view.InterfaceC0603x;
import androidx.core.view.InterfaceC0605z;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ViewGroup implements A, InterfaceC0605z, InterfaceC0603x {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f9129e0 = "c";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int[] f9130f0 = {R.attr.enabled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f9131A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f9132B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f9133C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f9134D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f9135E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f9136F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final DecelerateInterpolator f9137G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f9138H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f9139I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected int f9140J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    float f9141K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    protected int f9142L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f9143M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f9144N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.b f9145O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Animation f9146P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Animation f9147Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Animation f9148R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Animation f9149S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Animation f9150T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    boolean f9151U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f9152V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    boolean f9153W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f9154a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Animation.AnimationListener f9155b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final Animation f9156c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final Animation f9157d0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f9158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    j f9159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f9160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f9162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f9163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final B f9164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C0604y f9165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f9166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int[] f9167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int[] f9168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f9169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f9170y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f9171z;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (!cVar.f9160o) {
                cVar.r();
                return;
            }
            cVar.f9145O.setAlpha(255);
            c.this.f9145O.start();
            c cVar2 = c.this;
            if (cVar2.f9151U && (jVar = cVar2.f9159n) != null) {
                jVar.a();
            }
            c cVar3 = c.this;
            cVar3.f9171z = cVar3.f9138H.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            c.this.setAnimationProgress(f7);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.c$c, reason: collision with other inner class name */
    class C0177c extends Animation {
        C0177c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f7);
        }
    }

    class d extends Animation {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f9175m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f9176n;

        d(int i7, int i8) {
            this.f9175m = i7;
            this.f9176n = i8;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            c.this.f9145O.setAlpha((int) (this.f9175m + ((this.f9176n - r0) * f7)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (cVar.f9135E) {
                return;
            }
            cVar.y(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            c cVar = c.this;
            int iAbs = !cVar.f9153W ? cVar.f9143M - Math.abs(cVar.f9142L) : cVar.f9143M;
            c cVar2 = c.this;
            c.this.setTargetOffsetTopAndBottom((cVar2.f9140J + ((int) ((iAbs - r1) * f7))) - cVar2.f9138H.getTop());
            c.this.f9145O.e(1.0f - f7);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            c.this.p(f7);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f7, Transformation transformation) {
            c cVar = c.this;
            float f8 = cVar.f9141K;
            cVar.setAnimationProgress(f8 + ((-f8) * f7));
            c.this.p(f7);
        }
    }

    public interface i {
    }

    public interface j {
        void a();
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final boolean f9182m;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i7) {
                return new k[i7];
            }
        }

        k(Parcel parcel) {
            super(parcel);
            this.f9182m = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f9182m ? (byte) 1 : (byte) 0);
        }

        k(Parcelable parcelable, boolean z6) {
            super(parcelable);
            this.f9182m = z6;
        }
    }

    public c(Context context) {
        this(context, null);
    }

    private void A(Animation.AnimationListener animationListener) {
        this.f9138H.setVisibility(0);
        this.f9145O.setAlpha(255);
        b bVar = new b();
        this.f9146P = bVar;
        bVar.setDuration(this.f9170y);
        if (animationListener != null) {
            this.f9138H.b(animationListener);
        }
        this.f9138H.clearAnimation();
        this.f9138H.startAnimation(this.f9146P);
    }

    private void b(int i7, Animation.AnimationListener animationListener) {
        this.f9140J = i7;
        this.f9156c0.reset();
        this.f9156c0.setDuration(200L);
        this.f9156c0.setInterpolator(this.f9137G);
        if (animationListener != null) {
            this.f9138H.b(animationListener);
        }
        this.f9138H.clearAnimation();
        this.f9138H.startAnimation(this.f9156c0);
    }

    private void c(int i7, Animation.AnimationListener animationListener) {
        if (this.f9135E) {
            z(i7, animationListener);
            return;
        }
        this.f9140J = i7;
        this.f9157d0.reset();
        this.f9157d0.setDuration(200L);
        this.f9157d0.setInterpolator(this.f9137G);
        if (animationListener != null) {
            this.f9138H.b(animationListener);
        }
        this.f9138H.clearAnimation();
        this.f9138H.startAnimation(this.f9157d0);
    }

    private void e() {
        this.f9138H = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f9145O = bVar;
        bVar.l(1);
        this.f9138H.setImageDrawable(this.f9145O);
        this.f9138H.setVisibility(8);
        addView(this.f9138H);
    }

    private void g() {
        if (this.f9158m == null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (!childAt.equals(this.f9138H)) {
                    this.f9158m = childAt;
                    return;
                }
            }
        }
    }

    private void h(float f7) {
        if (f7 > this.f9162q) {
            t(true, true);
            return;
        }
        this.f9160o = false;
        this.f9145O.j(0.0f, 0.0f);
        c(this.f9171z, !this.f9135E ? new e() : null);
        this.f9145O.d(false);
    }

    private boolean i(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void j(float f7) {
        this.f9145O.d(true);
        float fMin = Math.min(1.0f, Math.abs(f7 / this.f9162q));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f7) - this.f9162q;
        int i7 = this.f9144N;
        if (i7 <= 0) {
            i7 = this.f9153W ? this.f9143M - this.f9142L : this.f9143M;
        }
        float f8 = i7;
        double dMax = Math.max(0.0f, Math.min(fAbs, f8 * 2.0f) / f8) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i8 = this.f9142L + ((int) ((f8 * fMin) + (f8 * fPow * 2.0f)));
        if (this.f9138H.getVisibility() != 0) {
            this.f9138H.setVisibility(0);
        }
        if (!this.f9135E) {
            this.f9138H.setScaleX(1.0f);
            this.f9138H.setScaleY(1.0f);
        }
        if (this.f9135E) {
            setAnimationProgress(Math.min(1.0f, f7 / this.f9162q));
        }
        if (f7 < this.f9162q) {
            if (this.f9145O.getAlpha() > 76 && !i(this.f9148R)) {
                x();
            }
        } else if (this.f9145O.getAlpha() < 255 && !i(this.f9149S)) {
            w();
        }
        this.f9145O.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f9145O.e(Math.min(1.0f, fMax));
        this.f9145O.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i8 - this.f9171z);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9134D) {
            this.f9134D = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i7) {
        this.f9138H.getBackground().setAlpha(i7);
        this.f9145O.setAlpha(i7);
    }

    private void t(boolean z6, boolean z7) {
        if (this.f9160o != z6) {
            this.f9151U = z7;
            g();
            this.f9160o = z6;
            if (z6) {
                b(this.f9171z, this.f9155b0);
            } else {
                y(this.f9155b0);
            }
        }
    }

    private Animation u(int i7, int i8) {
        d dVar = new d(i7, i8);
        dVar.setDuration(300L);
        this.f9138H.b(null);
        this.f9138H.clearAnimation();
        this.f9138H.startAnimation(dVar);
        return dVar;
    }

    private void v(float f7) {
        float f8 = this.f9132B;
        float f9 = f7 - f8;
        int i7 = this.f9161p;
        if (f9 <= i7 || this.f9133C) {
            return;
        }
        this.f9131A = f8 + i7;
        this.f9133C = true;
        this.f9145O.setAlpha(76);
    }

    private void w() {
        this.f9149S = u(this.f9145O.getAlpha(), 255);
    }

    private void x() {
        this.f9148R = u(this.f9145O.getAlpha(), 76);
    }

    private void z(int i7, Animation.AnimationListener animationListener) {
        this.f9140J = i7;
        this.f9141K = this.f9138H.getScaleX();
        h hVar = new h();
        this.f9150T = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f9138H.b(animationListener);
        }
        this.f9138H.clearAnimation();
        this.f9138H.startAnimation(this.f9150T);
    }

    @Override // androidx.core.view.A
    public void a(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (i11 != 0) {
            return;
        }
        int i12 = iArr[1];
        f(i7, i8, i9, i10, this.f9167v, i11, iArr);
        int i13 = i10 - (iArr[1] - i12);
        if ((i13 == 0 ? i10 + this.f9167v[1] : i13) >= 0 || d()) {
            return;
        }
        float fAbs = this.f9163r + Math.abs(r1);
        this.f9163r = fAbs;
        j(fAbs);
        iArr[1] = iArr[1] + i13;
    }

    public boolean d() {
        View view = this.f9158m;
        return view instanceof ListView ? androidx.core.widget.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return this.f9165t.a(f7, f8, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f9165t.b(f7, f8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f9165t.c(i7, i8, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f9165t.f(i7, i8, i9, i10, iArr);
    }

    public void f(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        if (i11 == 0) {
            this.f9165t.e(i7, i8, i9, i10, iArr, i11, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i7, int i8) {
        int i9 = this.f9139I;
        return i9 < 0 ? i8 : i8 == i7 + (-1) ? i9 : i8 >= i9 ? i8 + 1 : i8;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f9164s.a();
    }

    public int getProgressCircleDiameter() {
        return this.f9152V;
    }

    public int getProgressViewEndOffset() {
        return this.f9143M;
    }

    public int getProgressViewStartOffset() {
        return this.f9142L;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f9165t.j();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f9165t.l();
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void k(View view, int i7, int i8, int i9, int i10, int i11) {
        a(view, i7, i8, i9, i10, i11, this.f9168w);
    }

    @Override // androidx.core.view.InterfaceC0605z
    public boolean l(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            return onStartNestedScroll(view, view2, i7);
        }
        return false;
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void m(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void n(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void o(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9136F && actionMasked == 0) {
            this.f9136F = false;
        }
        if (!isEnabled() || this.f9136F || d() || this.f9160o || this.f9169x) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f9142L - this.f9138H.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f9134D = pointerId;
            this.f9133C = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f9132B = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f9133C = false;
            this.f9134D = -1;
        } else if (actionMasked == 2) {
            int i7 = this.f9134D;
            if (i7 == -1) {
                Log.e(f9129e0, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i7);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            v(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return this.f9133C;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f9158m == null) {
            g();
        }
        View view = this.f9158m;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f9138H.getMeasuredWidth();
        int measuredHeight2 = this.f9138H.getMeasuredHeight();
        int i11 = measuredWidth / 2;
        int i12 = measuredWidth2 / 2;
        int i13 = this.f9171z;
        this.f9138H.layout(i11 - i12, i13, i11 + i12, measuredHeight2 + i13);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f9158m == null) {
            g();
        }
        View view = this.f9158m;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f9138H.measure(View.MeasureSpec.makeMeasureSpec(this.f9152V, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9152V, 1073741824));
        this.f9139I = -1;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if (getChildAt(i9) == this.f9138H) {
                this.f9139I = i9;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        return dispatchNestedFling(f7, f8, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        return dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        if (i8 > 0) {
            float f7 = this.f9163r;
            if (f7 > 0.0f) {
                float f8 = i8;
                if (f8 > f7) {
                    iArr[1] = (int) f7;
                    this.f9163r = 0.0f;
                } else {
                    this.f9163r = f7 - f8;
                    iArr[1] = i8;
                }
                j(this.f9163r);
            }
        }
        if (this.f9153W && i8 > 0 && this.f9163r == 0.0f && Math.abs(i8 - iArr[1]) > 0) {
            this.f9138H.setVisibility(8);
        }
        int[] iArr2 = this.f9166u;
        if (dispatchNestedPreScroll(i7 - iArr[0], i8 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        a(view, i7, i8, i9, i10, 0, this.f9168w);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f9164s.b(view, view2, i7);
        startNestedScroll(i7 & 2);
        this.f9163r = 0.0f;
        this.f9169x = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f9182m);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f9160o);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return (!isEnabled() || this.f9136F || this.f9160o || (i7 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f9164s.d(view);
        this.f9169x = false;
        float f7 = this.f9163r;
        if (f7 > 0.0f) {
            h(f7);
            this.f9163r = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9136F && actionMasked == 0) {
            this.f9136F = false;
        }
        if (!isEnabled() || this.f9136F || d() || this.f9160o || this.f9169x) {
            return false;
        }
        if (actionMasked == 0) {
            this.f9134D = motionEvent.getPointerId(0);
            this.f9133C = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f9134D);
                if (iFindPointerIndex < 0) {
                    Log.e(f9129e0, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f9133C) {
                    float y6 = (motionEvent.getY(iFindPointerIndex) - this.f9131A) * 0.5f;
                    this.f9133C = false;
                    h(y6);
                }
                this.f9134D = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f9134D);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f9129e0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y7 = motionEvent.getY(iFindPointerIndex2);
                v(y7);
                if (this.f9133C) {
                    float f7 = (y7 - this.f9131A) * 0.5f;
                    if (f7 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    j(f7);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(f9129e0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f9134D = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    void p(float f7) {
        setTargetOffsetTopAndBottom((this.f9140J + ((int) ((this.f9142L - r0) * f7))) - this.f9138H.getTop());
    }

    void r() {
        this.f9138H.clearAnimation();
        this.f9145O.stop();
        this.f9138H.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f9135E) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f9142L - this.f9171z);
        }
        this.f9171z = this.f9138H.getTop();
    }

    public void s(boolean z6, int i7, int i8) {
        this.f9135E = z6;
        this.f9142L = i7;
        this.f9143M = i8;
        this.f9153W = true;
        r();
        this.f9160o = false;
    }

    void setAnimationProgress(float f7) {
        this.f9138H.setScaleX(f7);
        this.f9138H.setScaleY(f7);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        g();
        this.f9145O.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr2[i7] = androidx.core.content.b.c(context, iArr[i7]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i7) {
        this.f9162q = i7;
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        if (z6) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z6) {
        this.f9154a0 = z6;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        this.f9165t.m(z6);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f9159n = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i7) {
        setProgressBackgroundColorSchemeResource(i7);
    }

    public void setProgressBackgroundColorSchemeColor(int i7) {
        this.f9138H.setBackgroundColor(i7);
    }

    public void setProgressBackgroundColorSchemeResource(int i7) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.b.c(getContext(), i7));
    }

    public void setRefreshing(boolean z6) {
        if (!z6 || this.f9160o == z6) {
            t(z6, false);
            return;
        }
        this.f9160o = z6;
        setTargetOffsetTopAndBottom((!this.f9153W ? this.f9143M + this.f9142L : this.f9143M) - this.f9171z);
        this.f9151U = false;
        A(this.f9155b0);
    }

    public void setSize(int i7) {
        if (i7 == 0 || i7 == 1) {
            this.f9152V = (int) (getResources().getDisplayMetrics().density * (i7 == 0 ? 56.0f : 40.0f));
            this.f9138H.setImageDrawable(null);
            this.f9145O.l(i7);
            this.f9138H.setImageDrawable(this.f9145O);
        }
    }

    public void setSlingshotDistance(int i7) {
        this.f9144N = i7;
    }

    void setTargetOffsetTopAndBottom(int i7) {
        this.f9138H.bringToFront();
        H.a0(this.f9138H, i7);
        this.f9171z = this.f9138H.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return this.f9165t.o(i7);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f9165t.q();
    }

    void y(Animation.AnimationListener animationListener) {
        C0177c c0177c = new C0177c();
        this.f9147Q = c0177c;
        c0177c.setDuration(150L);
        this.f9138H.b(animationListener);
        this.f9138H.clearAnimation();
        this.f9138H.startAnimation(this.f9147Q);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9160o = false;
        this.f9162q = -1.0f;
        this.f9166u = new int[2];
        this.f9167v = new int[2];
        this.f9168w = new int[2];
        this.f9134D = -1;
        this.f9139I = -1;
        this.f9155b0 = new a();
        this.f9156c0 = new f();
        this.f9157d0 = new g();
        this.f9161p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f9170y = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f9137G = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f9152V = (int) (displayMetrics.density * 40.0f);
        e();
        setChildrenDrawingOrderEnabled(true);
        int i7 = (int) (displayMetrics.density * 64.0f);
        this.f9143M = i7;
        this.f9162q = i7;
        this.f9164s = new B(this);
        this.f9165t = new C0604y(this);
        setNestedScrollingEnabled(true);
        int i8 = -this.f9152V;
        this.f9171z = i8;
        this.f9142L = i8;
        p(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9130f0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
