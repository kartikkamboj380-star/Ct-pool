package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.AbstractC0602w;
import androidx.core.view.C0574a;
import androidx.core.view.C0604y;
import androidx.core.view.H;
import androidx.core.view.InterfaceC0603x;
import androidx.core.view.J;
import androidx.core.view.accessibility.AbstractC0577b;
import androidx.core.view.accessibility.C;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0603x {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private static final int[] f8468I0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    static final boolean f8469J0 = false;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    static final boolean f8470K0 = true;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    static final boolean f8471L0 = true;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    static final boolean f8472M0 = true;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private static final boolean f8473N0 = false;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private static final boolean f8474O0 = false;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private static final Class[] f8475P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    static final Interpolator f8476Q0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final ArrayList f8477A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final int[] f8478A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private r f8479B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private C0604y f8480B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    boolean f8481C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final int[] f8482C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f8483D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private final int[] f8484D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f8485E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    final int[] f8486E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    boolean f8487F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    final List f8488F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f8489G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private Runnable f8490G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f8491H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private final q.b f8492H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f8493I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f8494J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f8495K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    boolean f8496L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final AccessibilityManager f8497M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private List f8498N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f8499O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    boolean f8500P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f8501Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f8502R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private k f8503S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private EdgeEffect f8504T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private EdgeEffect f8505U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private EdgeEffect f8506V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private EdgeEffect f8507W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    l f8508a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f8509b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f8510c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private VelocityTracker f8511d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f8512e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f8513f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f8514g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f8515h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f8516i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private q f8517j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final int f8518k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final int f8519l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final w f8520m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f8521m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final u f8522n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f8523n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private x f8524o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f8525o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    a f8526p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    final B f8527p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    b f8528q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    androidx.recyclerview.widget.e f8529q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final androidx.recyclerview.widget.q f8530r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    e.b f8531r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f8532s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    final z f8533s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Runnable f8534t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private s f8535t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final Rect f8536u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private List f8537u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Rect f8538v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    boolean f8539v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final RectF f8540w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    boolean f8541w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    g f8542x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private l.a f8543x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    o f8544y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    boolean f8545y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ArrayList f8546z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    androidx.recyclerview.widget.l f8547z0;

    public static abstract class A {
    }

    class B implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f8548m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f8549n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        OverScroller f8550o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Interpolator f8551p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f8552q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f8553r;

        B() {
            Interpolator interpolator = RecyclerView.f8476Q0;
            this.f8551p = interpolator;
            this.f8552q = false;
            this.f8553r = false;
            this.f8550o = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i7, int i8, int i9, int i10) {
            int iRound;
            int iAbs = Math.abs(i7);
            int iAbs2 = Math.abs(i8);
            boolean z6 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i9 * i9) + (i10 * i10));
            int iSqrt2 = (int) Math.sqrt((i7 * i7) + (i8 * i8));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i11 = width / 2;
            float f7 = width;
            float f8 = i11;
            float fB = f8 + (b(Math.min(1.0f, (iSqrt2 * 1.0f) / f7)) * f8);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fB / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z6) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f7) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        private float b(float f7) {
            return (float) Math.sin((f7 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            H.h0(RecyclerView.this, this);
        }

        public void c(int i7, int i8) {
            RecyclerView.this.setScrollState(2);
            this.f8549n = 0;
            this.f8548m = 0;
            Interpolator interpolator = this.f8551p;
            Interpolator interpolator2 = RecyclerView.f8476Q0;
            if (interpolator != interpolator2) {
                this.f8551p = interpolator2;
                this.f8550o = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f8550o.fling(0, 0, i7, i8, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            e();
        }

        void e() {
            if (this.f8552q) {
                this.f8553r = true;
            } else {
                d();
            }
        }

        public void f(int i7, int i8, int i9, Interpolator interpolator) {
            if (i9 == Integer.MIN_VALUE) {
                i9 = a(i7, i8, 0, 0);
            }
            int i10 = i9;
            if (interpolator == null) {
                interpolator = RecyclerView.f8476Q0;
            }
            if (this.f8551p != interpolator) {
                this.f8551p = interpolator;
                this.f8550o = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f8549n = 0;
            this.f8548m = 0;
            RecyclerView.this.setScrollState(2);
            this.f8550o.startScroll(0, 0, i7, i8, i10);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f8550o.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i7;
            int i8;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f8544y == null) {
                g();
                return;
            }
            this.f8553r = false;
            this.f8552q = true;
            recyclerView.u();
            OverScroller overScroller = this.f8550o;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i9 = currX - this.f8548m;
                int i10 = currY - this.f8549n;
                this.f8548m = currX;
                this.f8549n = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f8486E0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i9, i10, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f8486E0;
                    i9 -= iArr2[0];
                    i10 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i9, i10);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f8542x != null) {
                    int[] iArr3 = recyclerView3.f8486E0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.f1(i9, i10, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f8486E0;
                    i8 = iArr4[0];
                    i7 = iArr4[1];
                    i9 -= i8;
                    i10 -= i7;
                    y yVar = recyclerView4.f8544y.f8598g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int iB = RecyclerView.this.f8533s0.b();
                        if (iB == 0) {
                            yVar.r();
                        } else {
                            if (yVar.f() >= iB) {
                                yVar.p(iB - 1);
                            }
                            yVar.j(i8, i7);
                        }
                    }
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (!RecyclerView.this.f8546z.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f8486E0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i8, i7, i9, i10, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f8486E0;
                int i11 = i9 - iArr6[0];
                int i12 = i10 - iArr6[1];
                if (i8 != 0 || i7 != 0) {
                    recyclerView6.I(i8, i7);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                y yVar2 = RecyclerView.this.f8544y.f8598g;
                if ((yVar2 == null || !yVar2.g()) && z6) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i13, currVelocity);
                    }
                    if (RecyclerView.f8472M0) {
                        RecyclerView.this.f8531r0.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f8529q0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i8, i7);
                    }
                }
            }
            y yVar3 = RecyclerView.this.f8544y.f8598g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.f8552q = false;
            if (this.f8553r) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.s1(1);
            }
        }
    }

    public static abstract class C {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final List f8555s = Collections.emptyList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f8556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference f8557b;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f8565j;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        RecyclerView f8573r;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8558c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8559d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f8560e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f8561f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f8562g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C f8563h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        C f8564i = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        List f8566k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List f8567l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f8568m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        u f8569n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f8570o = false;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f8571p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f8572q = -1;

        public C(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f8556a = view;
        }

        private void g() {
            if (this.f8566k == null) {
                ArrayList arrayList = new ArrayList();
                this.f8566k = arrayList;
                this.f8567l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i7, boolean z6) {
            if (this.f8559d == -1) {
                this.f8559d = this.f8558c;
            }
            if (this.f8562g == -1) {
                this.f8562g = this.f8558c;
            }
            if (z6) {
                this.f8562g += i7;
            }
            this.f8558c += i7;
            if (this.f8556a.getLayoutParams() != null) {
                ((p) this.f8556a.getLayoutParams()).f8618c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int iZ = this.f8572q;
            if (iZ == -1) {
                iZ = H.z(this.f8556a);
            }
            this.f8571p = iZ;
            recyclerView.i1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.i1(this, this.f8571p);
            this.f8571p = 0;
        }

        void D() {
            this.f8565j = 0;
            this.f8558c = -1;
            this.f8559d = -1;
            this.f8560e = -1L;
            this.f8562g = -1;
            this.f8568m = 0;
            this.f8563h = null;
            this.f8564i = null;
            d();
            this.f8571p = 0;
            this.f8572q = -1;
            RecyclerView.r(this);
        }

        void E() {
            if (this.f8559d == -1) {
                this.f8559d = this.f8558c;
            }
        }

        void F(int i7, int i8) {
            this.f8565j = (i7 & i8) | (this.f8565j & (~i8));
        }

        public final void G(boolean z6) {
            int i7;
            int i8 = this.f8568m;
            int i9 = z6 ? i8 - 1 : i8 + 1;
            this.f8568m = i9;
            if (i9 < 0) {
                this.f8568m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z6 && i9 == 1) {
                i7 = this.f8565j | 16;
            } else if (!z6 || i9 != 0) {
                return;
            } else {
                i7 = this.f8565j & (-17);
            }
            this.f8565j = i7;
        }

        void H(u uVar, boolean z6) {
            this.f8569n = uVar;
            this.f8570o = z6;
        }

        boolean I() {
            return (this.f8565j & 16) != 0;
        }

        boolean J() {
            return (this.f8565j & 128) != 0;
        }

        void K() {
            this.f8569n.J(this);
        }

        boolean L() {
            return (this.f8565j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f8565j) == 0) {
                g();
                this.f8566k.add(obj);
            }
        }

        void b(int i7) {
            this.f8565j = i7 | this.f8565j;
        }

        void c() {
            this.f8559d = -1;
            this.f8562g = -1;
        }

        void d() {
            List list = this.f8566k;
            if (list != null) {
                list.clear();
            }
            this.f8565j &= -1025;
        }

        void e() {
            this.f8565j &= -33;
        }

        void f() {
            this.f8565j &= -257;
        }

        boolean h() {
            return (this.f8565j & 16) == 0 && H.Q(this.f8556a);
        }

        void i(int i7, int i8, boolean z6) {
            b(8);
            A(i8, z6);
            this.f8558c = i7;
        }

        public final int j() {
            RecyclerView recyclerView = this.f8573r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long k() {
            return this.f8560e;
        }

        public final int l() {
            return this.f8561f;
        }

        public final int m() {
            int i7 = this.f8562g;
            return i7 == -1 ? this.f8558c : i7;
        }

        public final int n() {
            return this.f8559d;
        }

        List o() {
            if ((this.f8565j & 1024) != 0) {
                return f8555s;
            }
            List list = this.f8566k;
            return (list == null || list.size() == 0) ? f8555s : this.f8567l;
        }

        boolean p(int i7) {
            return (i7 & this.f8565j) != 0;
        }

        boolean q() {
            return (this.f8565j & 512) != 0 || t();
        }

        boolean r() {
            return (this.f8556a.getParent() == null || this.f8556a.getParent() == this.f8573r) ? false : true;
        }

        boolean s() {
            return (this.f8565j & 1) != 0;
        }

        boolean t() {
            return (this.f8565j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f8558c + " id=" + this.f8560e + ", oldPos=" + this.f8559d + ", pLpos:" + this.f8562g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.f8570o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.f8568m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f8556a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.f8565j & 16) == 0 && !H.Q(this.f8556a);
        }

        boolean v() {
            return (this.f8565j & 8) != 0;
        }

        boolean w() {
            return this.f8569n != null;
        }

        boolean x() {
            return (this.f8565j & 256) != 0;
        }

        boolean y() {
            return (this.f8565j & 2) != 0;
        }

        boolean z() {
            return (this.f8565j & 2) != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC0655a implements Runnable {
        RunnableC0655a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f8487F || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f8481C) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f8493I) {
                recyclerView2.f8491H = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC0656b implements Runnable {
        RunnableC0656b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.f8508a0;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.f8545y0 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    static class InterpolatorC0657c implements Interpolator {
        InterpolatorC0657c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f7) {
            float f8 = f7 - 1.0f;
            return (f8 * f8 * f8 * f8 * f8) + 1.0f;
        }
    }

    class d implements q.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.q.b
        public void a(C c7) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f8544y.m1(c7.f8556a, recyclerView.f8522n);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void b(C c7, l.b bVar, l.b bVar2) {
            RecyclerView.this.l(c7, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void c(C c7, l.b bVar, l.b bVar2) {
            RecyclerView.this.f8522n.J(c7);
            RecyclerView.this.n(c7, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void d(C c7, l.b bVar, l.b bVar2) {
            c7.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z6 = recyclerView.f8499O;
            l lVar = recyclerView.f8508a0;
            if (z6) {
                if (!lVar.b(c7, c7, bVar, bVar2)) {
                    return;
                }
            } else if (!lVar.d(c7, bVar, bVar2)) {
                return;
            }
            RecyclerView.this.L0();
        }
    }

    class e implements b.InterfaceC0167b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public View a(int i7) {
            return RecyclerView.this.getChildAt(i7);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public int b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void c(View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 != null) {
                cF0.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void d() {
            int iB = b();
            for (int i7 = 0; i7 < iB; i7++) {
                View viewA = a(i7);
                RecyclerView.this.z(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public C f(View view) {
            return RecyclerView.f0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void g(int i7) {
            C cF0;
            View viewA = a(i7);
            if (viewA != null && (cF0 = RecyclerView.f0(viewA)) != null) {
                if (cF0.x() && !cF0.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + cF0 + RecyclerView.this.P());
                }
                cF0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i7);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void h(View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 != null) {
                cF0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void i(View view, int i7) {
            RecyclerView.this.addView(view, i7);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void j(int i7) {
            View childAt = RecyclerView.this.getChildAt(i7);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i7);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0167b
        public void k(View view, int i7, ViewGroup.LayoutParams layoutParams) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 != null) {
                if (!cF0.x() && !cF0.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + cF0 + RecyclerView.this.P());
                }
                cF0.f();
            }
            RecyclerView.this.attachViewToParent(view, i7, layoutParams);
        }
    }

    class f implements a.InterfaceC0166a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void a(int i7, int i8) {
            RecyclerView.this.B0(i7, i8);
            RecyclerView.this.f8539v0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void c(int i7, int i8, Object obj) {
            RecyclerView.this.v1(i7, i8, obj);
            RecyclerView.this.f8541w0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public C e(int i7) {
            C cZ = RecyclerView.this.Z(i7, true);
            if (cZ == null || RecyclerView.this.f8528q.n(cZ.f8556a)) {
                return null;
            }
            return cZ;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void f(int i7, int i8) {
            RecyclerView.this.C0(i7, i8, false);
            RecyclerView.this.f8539v0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void g(int i7, int i8) {
            RecyclerView.this.A0(i7, i8);
            RecyclerView.this.f8539v0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0166a
        public void h(int i7, int i8) {
            RecyclerView.this.C0(i7, i8, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f8539v0 = true;
            recyclerView.f8533s0.f8654d += i8;
        }

        void i(a.b bVar) {
            int i7 = bVar.f8732a;
            if (i7 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f8544y.R0(recyclerView, bVar.f8733b, bVar.f8735d);
                return;
            }
            if (i7 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f8544y.U0(recyclerView2, bVar.f8733b, bVar.f8735d);
            } else if (i7 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f8544y.W0(recyclerView3, bVar.f8733b, bVar.f8735d, bVar.f8734c);
            } else {
                if (i7 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f8544y.T0(recyclerView4, bVar.f8733b, bVar.f8735d, 1);
            }
        }
    }

    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f8579a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8580b = false;

        public final void a(C c7, int i7) {
            c7.f8558c = i7;
            if (g()) {
                c7.f8560e = d(i7);
            }
            c7.F(1, 519);
            androidx.core.os.o.a("RV OnBindView");
            j(c7, i7, c7.o());
            c7.d();
            ViewGroup.LayoutParams layoutParams = c7.f8556a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f8618c = true;
            }
            androidx.core.os.o.b();
        }

        public final C b(ViewGroup viewGroup, int i7) {
            try {
                androidx.core.os.o.a("RV CreateView");
                C cK = k(viewGroup, i7);
                if (cK.f8556a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                cK.f8561f = i7;
                return cK;
            } finally {
                androidx.core.os.o.b();
            }
        }

        public abstract int c();

        public long d(int i7) {
            return -1L;
        }

        public int e(int i7) {
            return 0;
        }

        public final boolean f() {
            return this.f8579a.a();
        }

        public final boolean g() {
            return this.f8580b;
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(C c7, int i7);

        public void j(C c7, int i7, List list) {
            i(c7, i7);
        }

        public abstract C k(ViewGroup viewGroup, int i7);

        public void l(RecyclerView recyclerView) {
        }

        public boolean m(C c7) {
            return false;
        }

        public void n(C c7) {
        }

        public void o(C c7) {
        }

        public void p(C c7) {
        }

        public void q(i iVar) {
            this.f8579a.registerObserver(iVar);
        }

        public void r(boolean z6) {
            if (f()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f8580b = z6;
        }

        public void s(i iVar) {
            this.f8579a.unregisterObserver(iVar);
        }
    }

    static class h extends Observable {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }
    }

    public static abstract class i {
    }

    public interface j {
    }

    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i7) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f8581a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f8582b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f8583c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f8584d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f8585e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f8586f = 250;

        interface a {
            void a(C c7);
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f8587a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f8588b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f8589c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f8590d;

            public b a(C c7) {
                return b(c7, 0);
            }

            public b b(C c7, int i7) {
                View view = c7.f8556a;
                this.f8587a = view.getLeft();
                this.f8588b = view.getTop();
                this.f8589c = view.getRight();
                this.f8590d = view.getBottom();
                return this;
            }
        }

        static int e(C c7) {
            int i7 = c7.f8565j;
            int i8 = i7 & 14;
            if (c7.t()) {
                return 4;
            }
            if ((i7 & 4) != 0) {
                return i8;
            }
            int iN = c7.n();
            int iJ = c7.j();
            return (iN == -1 || iJ == -1 || iN == iJ) ? i8 : i8 | 2048;
        }

        public abstract boolean a(C c7, b bVar, b bVar2);

        public abstract boolean b(C c7, C c8, b bVar, b bVar2);

        public abstract boolean c(C c7, b bVar, b bVar2);

        public abstract boolean d(C c7, b bVar, b bVar2);

        public abstract boolean f(C c7);

        public boolean g(C c7, List list) {
            return f(c7);
        }

        public final void h(C c7) {
            r(c7);
            a aVar = this.f8581a;
            if (aVar != null) {
                aVar.a(c7);
            }
        }

        public final void i() {
            if (this.f8582b.size() <= 0) {
                this.f8582b.clear();
            } else {
                androidx.appcompat.app.y.a(this.f8582b.get(0));
                throw null;
            }
        }

        public abstract void j(C c7);

        public abstract void k();

        public long l() {
            return this.f8583c;
        }

        public long m() {
            return this.f8586f;
        }

        public long n() {
            return this.f8585e;
        }

        public long o() {
            return this.f8584d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(C c7) {
        }

        public b s(z zVar, C c7) {
            return q().a(c7);
        }

        public b t(z zVar, C c7, int i7, List list) {
            return q().a(c7);
        }

        public abstract void u();

        void v(a aVar) {
            this.f8581a = aVar;
        }
    }

    private class m implements l.a {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.a
        public void a(C c7) {
            c7.G(true);
            if (c7.f8563h != null && c7.f8564i == null) {
                c7.f8563h = null;
            }
            c7.f8564i = null;
            if (c7.I() || RecyclerView.this.U0(c7.f8556a) || !c7.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(c7.f8556a, false);
        }
    }

    public static abstract class n {
        public void d(Rect rect, int i7, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f8592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f8593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p.b f8594c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p.b f8595d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.p f8596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.p f8597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        y f8598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f8599h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f8600i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f8601j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f8602k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f8603l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f8604m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f8605n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f8606o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f8607p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f8608q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f8609r;

        class a implements p.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i7) {
                return o.this.I(i7);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return o.this.e0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return o.this.o0() - o.this.f0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements p.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i7) {
                return o.this.I(i7);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.U(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public int c() {
                return o.this.g0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int d() {
                return o.this.W() - o.this.d0();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int e(View view) {
                return o.this.O(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i7, int i8);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f8612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f8613b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f8614c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f8615d;
        }

        public o() {
            a aVar = new a();
            this.f8594c = aVar;
            b bVar = new b();
            this.f8595d = bVar;
            this.f8596e = new androidx.recyclerview.widget.p(aVar);
            this.f8597f = new androidx.recyclerview.widget.p(bVar);
            this.f8599h = false;
            this.f8600i = false;
            this.f8601j = false;
            this.f8602k = true;
            this.f8603l = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int K(int i7, int i8, int i9, int i10, boolean z6) {
            int iMax = Math.max(0, i7 - i9);
            if (z6) {
                if (i10 < 0) {
                    if (i10 != -1 || (i8 != Integer.MIN_VALUE && (i8 == 0 || i8 != 1073741824))) {
                        i8 = 0;
                        i10 = 0;
                    } else {
                        i10 = iMax;
                    }
                }
                i8 = 1073741824;
            } else if (i10 >= 0) {
                i8 = 1073741824;
            } else if (i10 != -1) {
                if (i10 == -2) {
                    if (i8 == Integer.MIN_VALUE || i8 == 1073741824) {
                        i10 = iMax;
                        i8 = Integer.MIN_VALUE;
                    } else {
                        i10 = iMax;
                        i8 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i10, i8);
        }

        private int[] L(View view, Rect rect) {
            int iE0 = e0();
            int iG0 = g0();
            int iO0 = o0() - f0();
            int iW = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i7 = left - iE0;
            int iMin = Math.min(0, i7);
            int i8 = top - iG0;
            int iMin2 = Math.min(0, i8);
            int i9 = iWidth - iO0;
            int iMax = Math.max(0, i9);
            int iMax2 = Math.max(0, iHeight - iW);
            if (Z() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i7, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i9);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i8, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void f(View view, int i7, boolean z6) {
            C cF0 = RecyclerView.f0(view);
            if (z6 || cF0.v()) {
                this.f8593b.f8530r.b(cF0);
            } else {
                this.f8593b.f8530r.p(cF0);
            }
            p pVar = (p) view.getLayoutParams();
            if (cF0.L() || cF0.w()) {
                if (cF0.w()) {
                    cF0.K();
                } else {
                    cF0.e();
                }
                this.f8592a.c(view, i7, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f8593b) {
                int iM = this.f8592a.m(view);
                if (i7 == -1) {
                    i7 = this.f8592a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f8593b.indexOfChild(view) + this.f8593b.P());
                }
                if (iM != i7) {
                    this.f8593b.f8544y.B0(iM, i7);
                }
            } else {
                this.f8592a.a(view, i7, false);
                pVar.f8618c = true;
                y yVar = this.f8598g;
                if (yVar != null && yVar.h()) {
                    this.f8598g.k(view);
                }
            }
            if (pVar.f8619d) {
                cF0.f8556a.invalidate();
                pVar.f8619d = false;
            }
        }

        public static d i0(Context context, AttributeSet attributeSet, int i7, int i8) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V.c.f4004f, i7, i8);
            dVar.f8612a = typedArrayObtainStyledAttributes.getInt(V.c.f4005g, 1);
            dVar.f8613b = typedArrayObtainStyledAttributes.getInt(V.c.f4015q, 1);
            dVar.f8614c = typedArrayObtainStyledAttributes.getBoolean(V.c.f4014p, false);
            dVar.f8615d = typedArrayObtainStyledAttributes.getBoolean(V.c.f4016r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i8, i9) : size : Math.min(size, Math.max(i8, i9));
        }

        private boolean t0(RecyclerView recyclerView, int i7, int i8) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iE0 = e0();
            int iG0 = g0();
            int iO0 = o0() - f0();
            int iW = W() - d0();
            Rect rect = this.f8593b.f8536u;
            P(focusedChild, rect);
            return rect.left - i7 < iO0 && rect.right - i7 > iE0 && rect.top - i8 < iW && rect.bottom - i8 > iG0;
        }

        private void v1(u uVar, int i7, View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0.J()) {
                return;
            }
            if (cF0.t() && !cF0.v() && !this.f8593b.f8542x.g()) {
                q1(i7);
                uVar.C(cF0);
            } else {
                x(i7);
                uVar.D(view);
                this.f8593b.f8530r.k(cF0);
            }
        }

        private static boolean w0(int i7, int i8, int i9) {
            int mode = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            if (i9 > 0 && i7 != i9) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i7;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i7;
            }
            return true;
        }

        private void y(int i7, View view) {
            this.f8592a.d(i7);
        }

        void A(RecyclerView recyclerView, u uVar) {
            this.f8600i = false;
            I0(recyclerView, uVar);
        }

        public void A0(View view, int i7, int i8) {
            p pVar = (p) view.getLayoutParams();
            Rect rectJ0 = this.f8593b.j0(view);
            int i9 = i7 + rectJ0.left + rectJ0.right;
            int i10 = i8 + rectJ0.top + rectJ0.bottom;
            int iK = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i9, ((ViewGroup.MarginLayoutParams) pVar).width, k());
            int iK2 = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) pVar).height, l());
            if (F1(view, iK, iK2, pVar)) {
                view.measure(iK, iK2);
            }
        }

        void A1(int i7, int i8) {
            this.f8608q = View.MeasureSpec.getSize(i7);
            int mode = View.MeasureSpec.getMode(i7);
            this.f8606o = mode;
            if (mode == 0 && !RecyclerView.f8470K0) {
                this.f8608q = 0;
            }
            this.f8609r = View.MeasureSpec.getSize(i8);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f8607p = mode2;
            if (mode2 != 0 || RecyclerView.f8470K0) {
                return;
            }
            this.f8609r = 0;
        }

        public View B(View view) {
            View viewR;
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView == null || (viewR = recyclerView.R(view)) == null || this.f8592a.n(viewR)) {
                return null;
            }
            return viewR;
        }

        public void B0(int i7, int i8) {
            View viewI = I(i7);
            if (viewI != null) {
                x(i7);
                h(viewI, i8);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i7 + this.f8593b.toString());
            }
        }

        public void B1(int i7, int i8) {
            this.f8593b.setMeasuredDimension(i7, i8);
        }

        public View C(int i7) {
            int iJ = J();
            for (int i8 = 0; i8 < iJ; i8++) {
                View viewI = I(i8);
                C cF0 = RecyclerView.f0(viewI);
                if (cF0 != null && cF0.m() == i7 && !cF0.J() && (this.f8593b.f8533s0.e() || !cF0.v())) {
                    return viewI;
                }
            }
            return null;
        }

        public void C0(int i7) {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView != null) {
                recyclerView.y0(i7);
            }
        }

        public void C1(Rect rect, int i7, int i8) {
            B1(n(i7, rect.width() + e0() + f0(), c0()), n(i8, rect.height() + g0() + d0(), b0()));
        }

        public abstract p D();

        public void D0(int i7) {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView != null) {
                recyclerView.z0(i7);
            }
        }

        void D1(int i7, int i8) {
            int iJ = J();
            if (iJ == 0) {
                this.f8593b.w(i7, i8);
                return;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MAX_VALUE;
            for (int i13 = 0; i13 < iJ; i13++) {
                View viewI = I(i13);
                Rect rect = this.f8593b.f8536u;
                P(viewI, rect);
                int i14 = rect.left;
                if (i14 < i12) {
                    i12 = i14;
                }
                int i15 = rect.right;
                if (i15 > i9) {
                    i9 = i15;
                }
                int i16 = rect.top;
                if (i16 < i10) {
                    i10 = i16;
                }
                int i17 = rect.bottom;
                if (i17 > i11) {
                    i11 = i17;
                }
            }
            this.f8593b.f8536u.set(i12, i10, i9, i11);
            C1(this.f8593b.f8536u, i7, i8);
        }

        public p E(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void E0(g gVar, g gVar2) {
        }

        void E1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f8593b = null;
                this.f8592a = null;
                height = 0;
                this.f8608q = 0;
            } else {
                this.f8593b = recyclerView;
                this.f8592a = recyclerView.f8528q;
                this.f8608q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f8609r = height;
            this.f8606o = 1073741824;
            this.f8607p = 1073741824;
        }

        public p F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList arrayList, int i7, int i8) {
            return false;
        }

        boolean F1(View view, int i7, int i8, p pVar) {
            return (!view.isLayoutRequested() && this.f8602k && w0(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) pVar).width) && w0(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((p) view.getLayoutParams()).f8617b.bottom;
        }

        public void H0(RecyclerView recyclerView) {
        }

        boolean H1(View view, int i7, int i8, p pVar) {
            return (this.f8602k && w0(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) pVar).width) && w0(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public View I(int i7) {
            androidx.recyclerview.widget.b bVar = this.f8592a;
            if (bVar != null) {
                return bVar.f(i7);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, u uVar) {
            H0(recyclerView);
        }

        public abstract void I1(RecyclerView recyclerView, z zVar, int i7);

        public int J() {
            androidx.recyclerview.widget.b bVar = this.f8592a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public abstract View J0(View view, int i7, u uVar, z zVar);

        public void J1(y yVar) {
            y yVar2 = this.f8598g;
            if (yVar2 != null && yVar != yVar2 && yVar2.h()) {
                this.f8598g.r();
            }
            this.f8598g = yVar;
            yVar.q(this.f8593b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f8593b;
            L0(recyclerView.f8522n, recyclerView.f8533s0, accessibilityEvent);
        }

        void K1() {
            y yVar = this.f8598g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public void L0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z6 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f8593b.canScrollVertically(-1) && !this.f8593b.canScrollHorizontally(-1) && !this.f8593b.canScrollHorizontally(1)) {
                z6 = false;
            }
            accessibilityEvent.setScrollable(z6);
            g gVar = this.f8593b.f8542x;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.c());
            }
        }

        public abstract boolean L1();

        public boolean M() {
            RecyclerView recyclerView = this.f8593b;
            return recyclerView != null && recyclerView.f8532s;
        }

        void M0(androidx.core.view.accessibility.C c7) {
            RecyclerView recyclerView = this.f8593b;
            N0(recyclerView.f8522n, recyclerView.f8533s0, c7);
        }

        public int N(u uVar, z zVar) {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView == null || recyclerView.f8542x == null || !k()) {
                return 1;
            }
            return this.f8593b.f8542x.c();
        }

        public void N0(u uVar, z zVar, androidx.core.view.accessibility.C c7) {
            if (this.f8593b.canScrollVertically(-1) || this.f8593b.canScrollHorizontally(-1)) {
                c7.a(8192);
                c7.B0(true);
            }
            if (this.f8593b.canScrollVertically(1) || this.f8593b.canScrollHorizontally(1)) {
                c7.a(4096);
                c7.B0(true);
            }
            c7.i0(C.b.b(k0(uVar, zVar), N(uVar, zVar), v0(uVar, zVar), l0(uVar, zVar)));
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        void O0(View view, androidx.core.view.accessibility.C c7) {
            C cF0 = RecyclerView.f0(view);
            if (cF0 == null || cF0.v() || this.f8592a.n(cF0.f8556a)) {
                return;
            }
            RecyclerView recyclerView = this.f8593b;
            P0(recyclerView.f8522n, recyclerView.f8533s0, view, c7);
        }

        public void P(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        public void P0(u uVar, z zVar, View view, androidx.core.view.accessibility.C c7) {
            c7.j0(C.c.b(l() ? h0(view) : 0, 1, k() ? h0(view) : 0, 1, false, false));
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i7) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((p) view.getLayoutParams()).f8617b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i7, int i8) {
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).f8617b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i7, int i8, int i9) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i7, int i8) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f8592a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i7, int i8) {
        }

        public int W() {
            return this.f8609r;
        }

        public void W0(RecyclerView recyclerView, int i7, int i8, Object obj) {
            V0(recyclerView, i7, i8);
        }

        public int X() {
            return this.f8607p;
        }

        public abstract void X0(u uVar, z zVar);

        public int Y() {
            RecyclerView recyclerView = this.f8593b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public void Y0(z zVar) {
        }

        public int Z() {
            return H.B(this.f8593b);
        }

        public void Z0(u uVar, z zVar, int i7, int i8) {
            this.f8593b.w(i7, i8);
        }

        public int a0(View view) {
            return ((p) view.getLayoutParams()).f8617b.left;
        }

        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.t0();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return H.C(this.f8593b);
        }

        public boolean b1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i7) {
            f(view, i7, true);
        }

        public int c0() {
            return H.D(this.f8593b);
        }

        public abstract void c1(Parcelable parcelable);

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract Parcelable d1();

        public void e(View view, int i7) {
            f(view, i7, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i7) {
        }

        public int f0() {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void f1(y yVar) {
            if (this.f8598g == yVar) {
                this.f8598g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean g1(int i7, Bundle bundle) {
            RecyclerView recyclerView = this.f8593b;
            return h1(recyclerView.f8522n, recyclerView.f8533s0, i7, bundle);
        }

        public void h(View view, int i7) {
            i(view, i7, (p) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public boolean h1(u uVar, z zVar, int i7, Bundle bundle) {
            int iW;
            int iO0;
            int i8;
            int i9;
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView == null) {
                return false;
            }
            if (i7 == 4096) {
                iW = recyclerView.canScrollVertically(1) ? (W() - g0()) - d0() : 0;
                if (this.f8593b.canScrollHorizontally(1)) {
                    iO0 = (o0() - e0()) - f0();
                    i8 = iW;
                    i9 = iO0;
                }
                i8 = iW;
                i9 = 0;
            } else if (i7 != 8192) {
                i9 = 0;
                i8 = 0;
            } else {
                iW = recyclerView.canScrollVertically(-1) ? -((W() - g0()) - d0()) : 0;
                if (this.f8593b.canScrollHorizontally(-1)) {
                    iO0 = -((o0() - e0()) - f0());
                    i8 = iW;
                    i9 = iO0;
                }
                i8 = iW;
                i9 = 0;
            }
            if (i8 == 0 && i9 == 0) {
                return false;
            }
            this.f8593b.n1(i9, i8, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void i(View view, int i7, p pVar) {
            C cF0 = RecyclerView.f0(view);
            if (cF0.v()) {
                this.f8593b.f8530r.b(cF0);
            } else {
                this.f8593b.f8530r.p(cF0);
            }
            this.f8592a.c(view, i7, pVar, cF0.v());
        }

        boolean i1(View view, int i7, Bundle bundle) {
            RecyclerView recyclerView = this.f8593b;
            return j1(recyclerView.f8522n, recyclerView.f8533s0, view, i7, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public int j0(View view) {
            return ((p) view.getLayoutParams()).f8617b.right;
        }

        public boolean j1(u uVar, z zVar, View view, int i7, Bundle bundle) {
            return false;
        }

        public abstract boolean k();

        public int k0(u uVar, z zVar) {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView == null || recyclerView.f8542x == null || !l()) {
                return 1;
            }
            return this.f8593b.f8542x.c();
        }

        public void k1(u uVar) {
            for (int iJ = J() - 1; iJ >= 0; iJ--) {
                if (!RecyclerView.f0(I(iJ)).J()) {
                    n1(iJ, uVar);
                }
            }
        }

        public abstract boolean l();

        public int l0(u uVar, z zVar) {
            return 0;
        }

        void l1(u uVar) {
            int iJ = uVar.j();
            for (int i7 = iJ - 1; i7 >= 0; i7--) {
                View viewN = uVar.n(i7);
                C cF0 = RecyclerView.f0(viewN);
                if (!cF0.J()) {
                    cF0.G(false);
                    if (cF0.x()) {
                        this.f8593b.removeDetachedView(viewN, false);
                    }
                    l lVar = this.f8593b.f8508a0;
                    if (lVar != null) {
                        lVar.j(cF0);
                    }
                    cF0.G(true);
                    uVar.y(viewN);
                }
            }
            uVar.e();
            if (iJ > 0) {
                this.f8593b.invalidate();
            }
        }

        public boolean m(p pVar) {
            return pVar != null;
        }

        public int m0(View view) {
            return ((p) view.getLayoutParams()).f8617b.top;
        }

        public void m1(View view, u uVar) {
            p1(view);
            uVar.B(view);
        }

        public void n0(View view, boolean z6, Rect rect) {
            Matrix matrix;
            if (z6) {
                Rect rect2 = ((p) view.getLayoutParams()).f8617b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f8593b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f8593b.f8540w;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i7, u uVar) {
            View viewI = I(i7);
            q1(i7);
            uVar.B(viewI);
        }

        public abstract void o(int i7, int i8, z zVar, c cVar);

        public int o0() {
            return this.f8608q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i7, c cVar) {
        }

        public int p0() {
            return this.f8606o;
        }

        public void p1(View view) {
            this.f8592a.p(view);
        }

        public abstract int q(z zVar);

        boolean q0() {
            int iJ = J();
            for (int i7 = 0; i7 < iJ; i7++) {
                ViewGroup.LayoutParams layoutParams = I(i7).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i7) {
            if (I(i7) != null) {
                this.f8592a.q(i7);
            }
        }

        public abstract int r(z zVar);

        public boolean r0() {
            return this.f8600i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z6) {
            return s1(recyclerView, view, rect, z6, false);
        }

        public abstract int s(z zVar);

        public abstract boolean s0();

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z6, boolean z7) {
            int[] iArrL = L(view, rect);
            int i7 = iArrL[0];
            int i8 = iArrL[1];
            if ((z7 && !t0(recyclerView, i7, i8)) || (i7 == 0 && i8 == 0)) {
                return false;
            }
            if (z6) {
                recyclerView.scrollBy(i7, i8);
            } else {
                recyclerView.k1(i7, i8);
            }
            return true;
        }

        public abstract int t(z zVar);

        public void t1() {
            RecyclerView recyclerView = this.f8593b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int u(z zVar);

        public final boolean u0() {
            return this.f8603l;
        }

        public void u1() {
            this.f8599h = true;
        }

        public abstract int v(z zVar);

        public boolean v0(u uVar, z zVar) {
            return false;
        }

        public void w(u uVar) {
            for (int iJ = J() - 1; iJ >= 0; iJ--) {
                v1(uVar, iJ, I(iJ));
            }
        }

        public abstract int w1(int i7, u uVar, z zVar);

        public void x(int i7) {
            y(i7, I(i7));
        }

        public boolean x0() {
            y yVar = this.f8598g;
            return yVar != null && yVar.h();
        }

        public abstract void x1(int i7);

        public boolean y0(View view, boolean z6, boolean z7) {
            boolean z8 = this.f8596e.b(view, 24579) && this.f8597f.b(view, 24579);
            return z6 ? z8 : !z8;
        }

        public abstract int y1(int i7, u uVar, z zVar);

        void z(RecyclerView recyclerView) {
            this.f8600i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i7, int i8, int i9, int i10) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f8617b;
            view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i8 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C f8616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f8617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f8619d;

        public p(int i7, int i8) {
            super(i7, i8);
            this.f8617b = new Rect();
            this.f8618c = true;
            this.f8619d = false;
        }

        public int a() {
            return this.f8616a.m();
        }

        public boolean b() {
            return this.f8616a.y();
        }

        public boolean c() {
            return this.f8616a.v();
        }

        public boolean d() {
            return this.f8616a.t();
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8617b = new Rect();
            this.f8618c = true;
            this.f8619d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8617b = new Rect();
            this.f8618c = true;
            this.f8619d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8617b = new Rect();
            this.f8618c = true;
            this.f8619d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f8617b = new Rect();
            this.f8618c = true;
            this.f8619d = false;
        }
    }

    public static abstract class q {
        public abstract boolean a(int i7, int i8);
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z6);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i7) {
        }

        public abstract void b(RecyclerView recyclerView, int i7, int i8);
    }

    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray f8620a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8621b = 0;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList f8622a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f8623b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f8624c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f8625d = 0;

            a() {
            }
        }

        private a g(int i7) {
            a aVar = (a) this.f8620a.get(i7);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f8620a.put(i7, aVar2);
            return aVar2;
        }

        void a() {
            this.f8621b++;
        }

        public void b() {
            for (int i7 = 0; i7 < this.f8620a.size(); i7++) {
                ((a) this.f8620a.valueAt(i7)).f8622a.clear();
            }
        }

        void c() {
            this.f8621b--;
        }

        void d(int i7, long j7) {
            a aVarG = g(i7);
            aVarG.f8625d = j(aVarG.f8625d, j7);
        }

        void e(int i7, long j7) {
            a aVarG = g(i7);
            aVarG.f8624c = j(aVarG.f8624c, j7);
        }

        public C f(int i7) {
            a aVar = (a) this.f8620a.get(i7);
            if (aVar == null || aVar.f8622a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f8622a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((C) arrayList.get(size)).r()) {
                    return (C) arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z6) {
            if (gVar != null) {
                c();
            }
            if (!z6 && this.f8621b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(C c7) {
            int iL = c7.l();
            ArrayList arrayList = g(iL).f8622a;
            if (((a) this.f8620a.get(iL)).f8623b <= arrayList.size()) {
                return;
            }
            c7.D();
            arrayList.add(c7);
        }

        long j(long j7, long j8) {
            return j7 == 0 ? j8 : ((j7 / 4) * 3) + (j8 / 4);
        }

        boolean k(int i7, long j7, long j8) {
            long j9 = g(i7).f8625d;
            return j9 == 0 || j7 + j9 < j8;
        }

        boolean l(int i7, long j7, long j8) {
            long j9 = g(i7).f8624c;
            return j9 == 0 || j7 + j9 < j8;
        }
    }

    public final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList f8626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f8627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f8628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f8629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f8631f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        t f8632g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.f8626a = arrayList;
            this.f8627b = null;
            this.f8628c = new ArrayList();
            this.f8629d = Collections.unmodifiableList(arrayList);
            this.f8630e = 2;
            this.f8631f = 2;
        }

        private boolean H(C c7, int i7, int i8, long j7) {
            c7.f8573r = RecyclerView.this;
            int iL = c7.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j7 != Long.MAX_VALUE && !this.f8632g.k(iL, nanoTime, j7)) {
                return false;
            }
            RecyclerView.this.f8542x.a(c7, i7);
            this.f8632g.d(c7.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(c7);
            if (!RecyclerView.this.f8533s0.e()) {
                return true;
            }
            c7.f8562g = i8;
            return true;
        }

        private void b(C c7) {
            if (RecyclerView.this.s0()) {
                View view = c7.f8556a;
                if (H.z(view) == 0) {
                    H.z0(view, 1);
                }
                androidx.recyclerview.widget.l lVar = RecyclerView.this.f8547z0;
                if (lVar == null) {
                    return;
                }
                C0574a c0574aN = lVar.n();
                if (c0574aN instanceof l.a) {
                    ((l.a) c0574aN).o(view);
                }
                H.p0(view, c0574aN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z6) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z6) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(C c7) {
            View view = c7.f8556a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i7) {
            a((C) this.f8628c.get(i7), true);
            this.f8628c.remove(i7);
        }

        public void B(View view) {
            C cF0 = RecyclerView.f0(view);
            if (cF0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (cF0.w()) {
                cF0.K();
            } else if (cF0.L()) {
                cF0.e();
            }
            C(cF0);
            if (RecyclerView.this.f8508a0 == null || cF0.u()) {
                return;
            }
            RecyclerView.this.f8508a0.j(cF0);
        }

        void C(C c7) {
            boolean z6;
            boolean z7 = true;
            if (c7.w() || c7.f8556a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c7.w());
                sb.append(" isAttached:");
                sb.append(c7.f8556a.getParent() != null);
                sb.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb.toString());
            }
            if (c7.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c7 + RecyclerView.this.P());
            }
            if (c7.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean zH = c7.h();
            g gVar = RecyclerView.this.f8542x;
            if ((gVar != null && zH && gVar.m(c7)) || c7.u()) {
                if (this.f8631f <= 0 || c7.p(526)) {
                    z6 = false;
                } else {
                    int size = this.f8628c.size();
                    if (size >= this.f8631f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f8472M0 && size > 0 && !RecyclerView.this.f8531r0.d(c7.f8558c)) {
                        int i7 = size - 1;
                        while (i7 >= 0) {
                            if (!RecyclerView.this.f8531r0.d(((C) this.f8628c.get(i7)).f8558c)) {
                                break;
                            } else {
                                i7--;
                            }
                        }
                        size = i7 + 1;
                    }
                    this.f8628c.add(size, c7);
                    z6 = true;
                }
                if (z6) {
                    z7 = false;
                } else {
                    a(c7, true);
                }
                z = z6;
            } else {
                z7 = false;
            }
            RecyclerView.this.f8530r.q(c7);
            if (z || z7 || !zH) {
                return;
            }
            c7.f8573r = null;
        }

        void D(View view) {
            ArrayList arrayList;
            C cF0 = RecyclerView.f0(view);
            if (!cF0.p(12) && cF0.y() && !RecyclerView.this.p(cF0)) {
                if (this.f8627b == null) {
                    this.f8627b = new ArrayList();
                }
                cF0.H(this, true);
                arrayList = this.f8627b;
            } else {
                if (cF0.t() && !cF0.v() && !RecyclerView.this.f8542x.g()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
                }
                cF0.H(this, false);
                arrayList = this.f8626a;
            }
            arrayList.add(cF0);
        }

        void E(t tVar) {
            t tVar2 = this.f8632g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.f8632g = tVar;
            if (tVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f8632g.a();
        }

        void F(A a7) {
        }

        public void G(int i7) {
            this.f8630e = i7;
            K();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f5 A[PHI: r1 r4
          0x00f5: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$C) = (r1v11 androidx.recyclerview.widget.RecyclerView$C), (r1v30 androidx.recyclerview.widget.RecyclerView$C) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
          0x00f5: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01cd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        C I(int i7, boolean z6, long j7) {
            C cL;
            boolean z7;
            C c7;
            boolean z8;
            boolean zH;
            ViewGroup.LayoutParams layoutParams;
            p pVar;
            ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
            RecyclerView recyclerViewV;
            if (i7 < 0 || i7 >= RecyclerView.this.f8533s0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i7 + "(" + i7 + "). Item count:" + RecyclerView.this.f8533s0.b() + RecyclerView.this.P());
            }
            if (RecyclerView.this.f8533s0.e()) {
                cL = h(i7);
                if (cL != null) {
                    z7 = true;
                }
                if (cL == null && (cL = m(i7, z6)) != null) {
                    if (L(cL)) {
                        if (!z6) {
                            cL.b(4);
                            if (cL.w()) {
                                RecyclerView.this.removeDetachedView(cL.f8556a, false);
                                cL.K();
                            } else if (cL.L()) {
                                cL.e();
                            }
                            C(cL);
                        }
                        cL = null;
                    } else {
                        z7 = true;
                    }
                }
                if (cL != null) {
                    c7 = cL;
                } else {
                    int iM = RecyclerView.this.f8526p.m(i7);
                    if (iM < 0 || iM >= RecyclerView.this.f8542x.c()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i7 + "(offset:" + iM + ").state:" + RecyclerView.this.f8533s0.b() + RecyclerView.this.P());
                    }
                    int iE = RecyclerView.this.f8542x.e(iM);
                    if (RecyclerView.this.f8542x.g() && (cL = l(RecyclerView.this.f8542x.d(iM), iE, z6)) != null) {
                        cL.f8558c = iM;
                        z7 = true;
                    }
                    if (cL == null) {
                        C cF = i().f(iE);
                        if (cF != null) {
                            cF.D();
                            if (RecyclerView.f8469J0) {
                                r(cF);
                            }
                        }
                        cL = cF;
                    }
                    if (cL == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j7 != Long.MAX_VALUE && !this.f8632g.l(iE, nanoTime, j7)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        C cB = recyclerView.f8542x.b(recyclerView, iE);
                        if (RecyclerView.f8472M0 && (recyclerViewV = RecyclerView.V(cB.f8556a)) != null) {
                            cB.f8557b = new WeakReference(recyclerViewV);
                        }
                        this.f8632g.e(iE, RecyclerView.this.getNanoTime() - nanoTime);
                        c7 = cB;
                    }
                }
                z8 = z7;
                if (z8 && !RecyclerView.this.f8533s0.e() && c7.p(8192)) {
                    c7.F(0, 8192);
                    if (RecyclerView.this.f8533s0.f8661k) {
                        int iE2 = l.e(c7) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.Q0(c7, recyclerView2.f8508a0.t(recyclerView2.f8533s0, c7, iE2, c7.o()));
                    }
                }
                if (RecyclerView.this.f8533s0.e() || !c7.s()) {
                    if (c7.s() || c7.z() || c7.t()) {
                        zH = H(c7, RecyclerView.this.f8526p.m(i7), i7, j7);
                    }
                    layoutParams = c7.f8556a.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                    } else {
                        if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                            pVar = (p) layoutParams;
                            pVar.f8616a = c7;
                            pVar.f8619d = !z8 && zH;
                            return c7;
                        }
                        layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                    }
                    pVar = (p) layoutParamsGenerateLayoutParams;
                    c7.f8556a.setLayoutParams(pVar);
                    pVar.f8616a = c7;
                    pVar.f8619d = !z8 && zH;
                    return c7;
                }
                c7.f8562g = i7;
                zH = false;
                layoutParams = c7.f8556a.getLayoutParams();
                if (layoutParams == null) {
                }
                pVar = (p) layoutParamsGenerateLayoutParams;
                c7.f8556a.setLayoutParams(pVar);
                pVar.f8616a = c7;
                pVar.f8619d = !z8 && zH;
                return c7;
            }
            cL = null;
            z7 = false;
            if (cL == null) {
                if (L(cL)) {
                }
            }
            if (cL != null) {
            }
            z8 = z7;
            if (z8) {
                c7.F(0, 8192);
                if (RecyclerView.this.f8533s0.f8661k) {
                }
            }
            if (RecyclerView.this.f8533s0.e()) {
                if (c7.s()) {
                }
                zH = H(c7, RecyclerView.this.f8526p.m(i7), i7, j7);
            }
            layoutParams = c7.f8556a.getLayoutParams();
            if (layoutParams == null) {
            }
            pVar = (p) layoutParamsGenerateLayoutParams;
            c7.f8556a.setLayoutParams(pVar);
            pVar.f8616a = c7;
            pVar.f8619d = !z8 && zH;
            return c7;
        }

        void J(C c7) {
            (c7.f8570o ? this.f8627b : this.f8626a).remove(c7);
            c7.f8569n = null;
            c7.f8570o = false;
            c7.e();
        }

        void K() {
            o oVar = RecyclerView.this.f8544y;
            this.f8631f = this.f8630e + (oVar != null ? oVar.f8604m : 0);
            for (int size = this.f8628c.size() - 1; size >= 0 && this.f8628c.size() > this.f8631f; size--) {
                A(size);
            }
        }

        boolean L(C c7) {
            if (c7.v()) {
                return RecyclerView.this.f8533s0.e();
            }
            int i7 = c7.f8558c;
            if (i7 >= 0 && i7 < RecyclerView.this.f8542x.c()) {
                if (RecyclerView.this.f8533s0.e() || RecyclerView.this.f8542x.e(c7.f8558c) == c7.l()) {
                    return !RecyclerView.this.f8542x.g() || c7.k() == RecyclerView.this.f8542x.d(c7.f8558c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c7 + RecyclerView.this.P());
        }

        void M(int i7, int i8) {
            int i9;
            int i10 = i8 + i7;
            for (int size = this.f8628c.size() - 1; size >= 0; size--) {
                C c7 = (C) this.f8628c.get(size);
                if (c7 != null && (i9 = c7.f8558c) >= i7 && i9 < i10) {
                    c7.b(2);
                    A(size);
                }
            }
        }

        void a(C c7, boolean z6) {
            RecyclerView.r(c7);
            View view = c7.f8556a;
            androidx.recyclerview.widget.l lVar = RecyclerView.this.f8547z0;
            if (lVar != null) {
                C0574a c0574aN = lVar.n();
                H.p0(view, c0574aN instanceof l.a ? ((l.a) c0574aN).n(view) : null);
            }
            if (z6) {
                g(c7);
            }
            c7.f8573r = null;
            i().i(c7);
        }

        public void c() {
            this.f8626a.clear();
            z();
        }

        void d() {
            int size = this.f8628c.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((C) this.f8628c.get(i7)).c();
            }
            int size2 = this.f8626a.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((C) this.f8626a.get(i8)).c();
            }
            ArrayList arrayList = this.f8627b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    ((C) this.f8627b.get(i9)).c();
                }
            }
        }

        void e() {
            this.f8626a.clear();
            ArrayList arrayList = this.f8627b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i7) {
            if (i7 >= 0 && i7 < RecyclerView.this.f8533s0.b()) {
                return !RecyclerView.this.f8533s0.e() ? i7 : RecyclerView.this.f8526p.m(i7);
            }
            throw new IndexOutOfBoundsException("invalid position " + i7 + ". State item count is " + RecyclerView.this.f8533s0.b() + RecyclerView.this.P());
        }

        void g(C c7) {
            RecyclerView.this.getClass();
            g gVar = RecyclerView.this.f8542x;
            if (gVar != null) {
                gVar.p(c7);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f8533s0 != null) {
                recyclerView.f8530r.q(c7);
            }
        }

        C h(int i7) {
            int size;
            int iM;
            ArrayList arrayList = this.f8627b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    C c7 = (C) this.f8627b.get(i8);
                    if (!c7.L() && c7.m() == i7) {
                        c7.b(32);
                        return c7;
                    }
                }
                if (RecyclerView.this.f8542x.g() && (iM = RecyclerView.this.f8526p.m(i7)) > 0 && iM < RecyclerView.this.f8542x.c()) {
                    long jD = RecyclerView.this.f8542x.d(iM);
                    for (int i9 = 0; i9 < size; i9++) {
                        C c8 = (C) this.f8627b.get(i9);
                        if (!c8.L() && c8.k() == jD) {
                            c8.b(32);
                            return c8;
                        }
                    }
                }
            }
            return null;
        }

        t i() {
            if (this.f8632g == null) {
                this.f8632g = new t();
            }
            return this.f8632g;
        }

        int j() {
            return this.f8626a.size();
        }

        public List k() {
            return this.f8629d;
        }

        C l(long j7, int i7, boolean z6) {
            for (int size = this.f8626a.size() - 1; size >= 0; size--) {
                C c7 = (C) this.f8626a.get(size);
                if (c7.k() == j7 && !c7.L()) {
                    if (i7 == c7.l()) {
                        c7.b(32);
                        if (c7.v() && !RecyclerView.this.f8533s0.e()) {
                            c7.F(2, 14);
                        }
                        return c7;
                    }
                    if (!z6) {
                        this.f8626a.remove(size);
                        RecyclerView.this.removeDetachedView(c7.f8556a, false);
                        y(c7.f8556a);
                    }
                }
            }
            int size2 = this.f8628c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C c8 = (C) this.f8628c.get(size2);
                if (c8.k() == j7 && !c8.r()) {
                    if (i7 == c8.l()) {
                        if (!z6) {
                            this.f8628c.remove(size2);
                        }
                        return c8;
                    }
                    if (!z6) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        C m(int i7, boolean z6) {
            View viewE;
            int size = this.f8626a.size();
            for (int i8 = 0; i8 < size; i8++) {
                C c7 = (C) this.f8626a.get(i8);
                if (!c7.L() && c7.m() == i7 && !c7.t() && (RecyclerView.this.f8533s0.f8658h || !c7.v())) {
                    c7.b(32);
                    return c7;
                }
            }
            if (z6 || (viewE = RecyclerView.this.f8528q.e(i7)) == null) {
                int size2 = this.f8628c.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    C c8 = (C) this.f8628c.get(i9);
                    if (!c8.t() && c8.m() == i7 && !c8.r()) {
                        if (!z6) {
                            this.f8628c.remove(i9);
                        }
                        return c8;
                    }
                }
                return null;
            }
            C cF0 = RecyclerView.f0(viewE);
            RecyclerView.this.f8528q.s(viewE);
            int iM = RecyclerView.this.f8528q.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f8528q.d(iM);
                D(viewE);
                cF0.b(8224);
                return cF0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + cF0 + RecyclerView.this.P());
        }

        View n(int i7) {
            return ((C) this.f8626a.get(i7)).f8556a;
        }

        public View o(int i7) {
            return p(i7, false);
        }

        View p(int i7, boolean z6) {
            return I(i7, z6, Long.MAX_VALUE).f8556a;
        }

        void s() {
            int size = this.f8628c.size();
            for (int i7 = 0; i7 < size; i7++) {
                p pVar = (p) ((C) this.f8628c.get(i7)).f8556a.getLayoutParams();
                if (pVar != null) {
                    pVar.f8618c = true;
                }
            }
        }

        void t() {
            int size = this.f8628c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C c7 = (C) this.f8628c.get(i7);
                if (c7 != null) {
                    c7.b(6);
                    c7.a(null);
                }
            }
            g gVar = RecyclerView.this.f8542x;
            if (gVar == null || !gVar.g()) {
                z();
            }
        }

        void u(int i7, int i8) {
            int size = this.f8628c.size();
            for (int i9 = 0; i9 < size; i9++) {
                C c7 = (C) this.f8628c.get(i9);
                if (c7 != null && c7.f8558c >= i7) {
                    c7.A(i8, true);
                }
            }
        }

        void v(int i7, int i8) {
            int i9;
            int i10;
            int i11;
            int i12;
            if (i7 < i8) {
                i9 = -1;
                i11 = i7;
                i10 = i8;
            } else {
                i9 = 1;
                i10 = i7;
                i11 = i8;
            }
            int size = this.f8628c.size();
            for (int i13 = 0; i13 < size; i13++) {
                C c7 = (C) this.f8628c.get(i13);
                if (c7 != null && (i12 = c7.f8558c) >= i11 && i12 <= i10) {
                    if (i12 == i7) {
                        c7.A(i8 - i7, false);
                    } else {
                        c7.A(i9, false);
                    }
                }
            }
        }

        void w(int i7, int i8, boolean z6) {
            int i9 = i7 + i8;
            for (int size = this.f8628c.size() - 1; size >= 0; size--) {
                C c7 = (C) this.f8628c.get(size);
                if (c7 != null) {
                    int i10 = c7.f8558c;
                    if (i10 >= i9) {
                        c7.A(-i8, z6);
                    } else if (i10 >= i7) {
                        c7.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z6) {
            c();
            i().h(gVar, gVar2, z6);
        }

        void y(View view) {
            C cF0 = RecyclerView.f0(view);
            cF0.f8569n = null;
            cF0.f8570o = false;
            cF0.e();
            C(cF0);
        }

        void z() {
            for (int size = this.f8628c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f8628c.clear();
            if (RecyclerView.f8472M0) {
                RecyclerView.this.f8531r0.b();
            }
        }
    }

    public interface v {
    }

    private class w extends i {
        w() {
        }
    }

    public static class x extends AbstractC2252a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Parcelable f8635o;

        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public x[] newArray(int i7) {
                return new x[i7];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8635o = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        void b(x xVar) {
            this.f8635o = xVar.f8635o;
        }

        @Override // z.AbstractC2252a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeParcelable(this.f8635o, 0);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static abstract class y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f8637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f8638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f8640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f8641f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f8643h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8636a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f8642g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f8644a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f8645b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f8646c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f8647d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f8648e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f8649f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f8650g;

            public a(int i7, int i8) {
                this(i7, i8, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f8648e != null && this.f8646c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f8646c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f8647d >= 0;
            }

            public void b(int i7) {
                this.f8647d = i7;
            }

            void c(RecyclerView recyclerView) {
                int i7 = this.f8647d;
                if (i7 >= 0) {
                    this.f8647d = -1;
                    recyclerView.v0(i7);
                    this.f8649f = false;
                } else {
                    if (!this.f8649f) {
                        this.f8650g = 0;
                        return;
                    }
                    e();
                    recyclerView.f8527p0.f(this.f8644a, this.f8645b, this.f8646c, this.f8648e);
                    int i8 = this.f8650g + 1;
                    this.f8650g = i8;
                    if (i8 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f8649f = false;
                }
            }

            public void d(int i7, int i8, int i9, Interpolator interpolator) {
                this.f8644a = i7;
                this.f8645b = i8;
                this.f8646c = i9;
                this.f8648e = interpolator;
                this.f8649f = true;
            }

            public a(int i7, int i8, int i9, Interpolator interpolator) {
                this.f8647d = -1;
                this.f8649f = false;
                this.f8650g = 0;
                this.f8644a = i7;
                this.f8645b = i8;
                this.f8646c = i9;
                this.f8648e = interpolator;
            }
        }

        public interface b {
            PointF a(int i7);
        }

        public PointF a(int i7) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).a(i7);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i7) {
            return this.f8637b.f8544y.C(i7);
        }

        public int c() {
            return this.f8637b.f8544y.J();
        }

        public int d(View view) {
            return this.f8637b.d0(view);
        }

        public o e() {
            return this.f8638c;
        }

        public int f() {
            return this.f8636a;
        }

        public boolean g() {
            return this.f8639d;
        }

        public boolean h() {
            return this.f8640e;
        }

        protected void i(PointF pointF) {
            float f7 = pointF.x;
            float f8 = pointF.y;
            float fSqrt = (float) Math.sqrt((f7 * f7) + (f8 * f8));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i7, int i8) {
            PointF pointFA;
            RecyclerView recyclerView = this.f8637b;
            if (this.f8636a == -1 || recyclerView == null) {
                r();
            }
            if (this.f8639d && this.f8641f == null && this.f8638c != null && (pointFA = a(this.f8636a)) != null) {
                float f7 = pointFA.x;
                if (f7 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.f1((int) Math.signum(f7), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f8639d = false;
            View view = this.f8641f;
            if (view != null) {
                if (d(view) == this.f8636a) {
                    o(this.f8641f, recyclerView.f8533s0, this.f8642g);
                    this.f8642g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f8641f = null;
                }
            }
            if (this.f8640e) {
                l(i7, i8, recyclerView.f8533s0, this.f8642g);
                boolean zA = this.f8642g.a();
                this.f8642g.c(recyclerView);
                if (zA && this.f8640e) {
                    this.f8639d = true;
                    recyclerView.f8527p0.e();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f8641f = view;
            }
        }

        protected abstract void l(int i7, int i8, z zVar, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, z zVar, a aVar);

        public void p(int i7) {
            this.f8636a = i7;
        }

        void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f8527p0.g();
            if (this.f8643h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f8637b = recyclerView;
            this.f8638c = oVar;
            int i7 = this.f8636a;
            if (i7 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f8533s0.f8651a = i7;
            this.f8640e = true;
            this.f8639d = true;
            this.f8641f = b(f());
            m();
            this.f8637b.f8527p0.e();
            this.f8643h = true;
        }

        protected final void r() {
            if (this.f8640e) {
                this.f8640e = false;
                n();
                this.f8637b.f8533s0.f8651a = -1;
                this.f8641f = null;
                this.f8636a = -1;
                this.f8639d = false;
                this.f8638c.f1(this);
                this.f8638c = null;
                this.f8637b = null;
            }
        }
    }

    public static class z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f8652b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f8663m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f8664n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f8665o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f8666p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f8667q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8651a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8653c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8654d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8655e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f8656f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f8657g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f8658h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f8659i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f8660j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f8661k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f8662l = false;

        void a(int i7) {
            if ((this.f8655e & i7) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i7) + " but it is " + Integer.toBinaryString(this.f8655e));
        }

        public int b() {
            return this.f8658h ? this.f8653c - this.f8654d : this.f8656f;
        }

        public int c() {
            return this.f8651a;
        }

        public boolean d() {
            return this.f8651a != -1;
        }

        public boolean e() {
            return this.f8658h;
        }

        void f(g gVar) {
            this.f8655e = 1;
            this.f8656f = gVar.c();
            this.f8658h = false;
            this.f8659i = false;
            this.f8660j = false;
        }

        public boolean g() {
            return this.f8662l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f8651a + ", mData=" + this.f8652b + ", mItemCount=" + this.f8656f + ", mIsMeasuring=" + this.f8660j + ", mPreviousLayoutItemCount=" + this.f8653c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f8654d + ", mStructureChanged=" + this.f8657g + ", mInPreLayout=" + this.f8658h + ", mRunSimpleAnimations=" + this.f8661k + ", mRunPredictiveAnimations=" + this.f8662l + '}';
        }
    }

    static {
        Class cls = Integer.TYPE;
        f8475P0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f8476Q0 = new InterpolatorC0657c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V.a.f3995a);
    }

    private void A() {
        int i7 = this.f8495K;
        this.f8495K = 0;
        if (i7 == 0 || !s0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        AbstractC0577b.b(accessibilityEventObtain, i7);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void C() {
        this.f8533s0.a(1);
        Q(this.f8533s0);
        this.f8533s0.f8660j = false;
        p1();
        this.f8530r.f();
        F0();
        N0();
        c1();
        z zVar = this.f8533s0;
        zVar.f8659i = zVar.f8661k && this.f8541w0;
        this.f8541w0 = false;
        this.f8539v0 = false;
        zVar.f8658h = zVar.f8662l;
        zVar.f8656f = this.f8542x.c();
        U(this.f8478A0);
        if (this.f8533s0.f8661k) {
            int iG = this.f8528q.g();
            for (int i7 = 0; i7 < iG; i7++) {
                C cF0 = f0(this.f8528q.f(i7));
                if (!cF0.J() && (!cF0.t() || this.f8542x.g())) {
                    this.f8530r.e(cF0, this.f8508a0.t(this.f8533s0, cF0, l.e(cF0), cF0.o()));
                    if (this.f8533s0.f8659i && cF0.y() && !cF0.v() && !cF0.J() && !cF0.t()) {
                        this.f8530r.c(c0(cF0), cF0);
                    }
                }
            }
        }
        if (this.f8533s0.f8662l) {
            d1();
            z zVar2 = this.f8533s0;
            boolean z6 = zVar2.f8657g;
            zVar2.f8657g = false;
            this.f8544y.X0(this.f8522n, zVar2);
            this.f8533s0.f8657g = z6;
            for (int i8 = 0; i8 < this.f8528q.g(); i8++) {
                C cF02 = f0(this.f8528q.f(i8));
                if (!cF02.J() && !this.f8530r.i(cF02)) {
                    int iE = l.e(cF02);
                    boolean zP = cF02.p(8192);
                    if (!zP) {
                        iE |= 4096;
                    }
                    l.b bVarT = this.f8508a0.t(this.f8533s0, cF02, iE, cF02.o());
                    if (zP) {
                        Q0(cF02, bVarT);
                    } else {
                        this.f8530r.a(cF02, bVarT);
                    }
                }
            }
        }
        s();
        G0();
        r1(false);
        this.f8533s0.f8655e = 2;
    }

    private void D() {
        p1();
        F0();
        this.f8533s0.a(6);
        this.f8526p.j();
        this.f8533s0.f8656f = this.f8542x.c();
        z zVar = this.f8533s0;
        zVar.f8654d = 0;
        zVar.f8658h = false;
        this.f8544y.X0(this.f8522n, zVar);
        z zVar2 = this.f8533s0;
        zVar2.f8657g = false;
        this.f8524o = null;
        zVar2.f8661k = zVar2.f8661k && this.f8508a0 != null;
        zVar2.f8655e = 4;
        G0();
        r1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void E() {
        this.f8533s0.a(4);
        p1();
        F0();
        z zVar = this.f8533s0;
        zVar.f8655e = 1;
        if (zVar.f8661k) {
            for (int iG = this.f8528q.g() - 1; iG >= 0; iG--) {
                C cF0 = f0(this.f8528q.f(iG));
                if (!cF0.J()) {
                    long jC0 = c0(cF0);
                    l.b bVarS = this.f8508a0.s(this.f8533s0, cF0);
                    C cG = this.f8530r.g(jC0);
                    if (cG == null || cG.J()) {
                        this.f8530r.d(cF0, bVarS);
                    } else {
                        boolean zH = this.f8530r.h(cG);
                        boolean zH2 = this.f8530r.h(cF0);
                        if (!zH || cG != cF0) {
                            l.b bVarN = this.f8530r.n(cG);
                            this.f8530r.d(cF0, bVarS);
                            l.b bVarM = this.f8530r.m(cF0);
                            if (bVarN == null) {
                                k0(jC0, cF0, cG);
                            } else {
                                m(cG, cF0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.f8530r.o(this.f8492H0);
        }
        this.f8544y.l1(this.f8522n);
        z zVar2 = this.f8533s0;
        zVar2.f8653c = zVar2.f8656f;
        this.f8499O = false;
        this.f8500P = false;
        zVar2.f8661k = false;
        zVar2.f8662l = false;
        this.f8544y.f8599h = false;
        ArrayList arrayList = this.f8522n.f8627b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.f8544y;
        if (oVar.f8605n) {
            oVar.f8604m = 0;
            oVar.f8605n = false;
            this.f8522n.K();
        }
        this.f8544y.Y0(this.f8533s0);
        G0();
        r1(false);
        this.f8530r.f();
        int[] iArr = this.f8478A0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        R0();
        a1();
    }

    private void I0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8510c0) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f8510c0 = motionEvent.getPointerId(i7);
            int x6 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f8514g0 = x6;
            this.f8512e0 = x6;
            int y6 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f8515h0 = y6;
            this.f8513f0 = y6;
        }
    }

    private boolean K(MotionEvent motionEvent) {
        r rVar = this.f8479B;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        rVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f8479B = null;
        }
        return true;
    }

    private boolean M0() {
        return this.f8508a0 != null && this.f8544y.L1();
    }

    private void N0() {
        boolean z6;
        if (this.f8499O) {
            this.f8526p.u();
            if (this.f8500P) {
                this.f8544y.S0(this);
            }
        }
        if (M0()) {
            this.f8526p.s();
        } else {
            this.f8526p.j();
        }
        boolean z7 = this.f8539v0 || this.f8541w0;
        this.f8533s0.f8661k = this.f8487F && this.f8508a0 != null && ((z6 = this.f8499O) || z7 || this.f8544y.f8599h) && (!z6 || this.f8542x.g());
        z zVar = this.f8533s0;
        zVar.f8662l = zVar.f8661k && z7 && !this.f8499O && M0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void P0(float f7, float f8, float f9, float f10) {
        boolean z6;
        EdgeEffect edgeEffect;
        float width;
        float height;
        boolean z7 = true;
        if (f8 < 0.0f) {
            M();
            edgeEffect = this.f8504T;
            width = (-f8) / getWidth();
            height = 1.0f - (f9 / getHeight());
        } else {
            if (f8 <= 0.0f) {
                z6 = false;
                if (f10 >= 0.0f) {
                    O();
                    androidx.core.widget.d.c(this.f8505U, (-f10) / getHeight(), f7 / getWidth());
                } else if (f10 > 0.0f) {
                    L();
                    androidx.core.widget.d.c(this.f8507W, f10 / getHeight(), 1.0f - (f7 / getWidth()));
                } else {
                    z7 = z6;
                }
                if (z7 && f8 == 0.0f && f10 == 0.0f) {
                    return;
                }
                H.g0(this);
            }
            N();
            edgeEffect = this.f8506V;
            width = f8 / getWidth();
            height = f9 / getHeight();
        }
        androidx.core.widget.d.c(edgeEffect, width, height);
        z6 = true;
        if (f10 >= 0.0f) {
        }
        if (z7) {
        }
        H.g0(this);
    }

    private void R0() {
        View viewFindViewById;
        if (!this.f8525o0 || this.f8542x == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f8474O0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f8528q.n(focusedChild)) {
                    return;
                }
            } else if (this.f8528q.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewW = null;
        C cY = (this.f8533s0.f8664n == -1 || !this.f8542x.g()) ? null : Y(this.f8533s0.f8664n);
        if (cY != null && !this.f8528q.n(cY.f8556a) && cY.f8556a.hasFocusable()) {
            viewW = cY.f8556a;
        } else if (this.f8528q.g() > 0) {
            viewW = W();
        }
        if (viewW != null) {
            int i7 = this.f8533s0.f8665o;
            if (i7 != -1 && (viewFindViewById = viewW.findViewById(i7)) != null && viewFindViewById.isFocusable()) {
                viewW = viewFindViewById;
            }
            viewW.requestFocus();
        }
    }

    private void S0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f8504T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f8504T.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f8505U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f8505U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f8506V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f8506V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f8507W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f8507W.isFinished();
        }
        if (zIsFinished) {
            H.g0(this);
        }
    }

    private boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f8477A.size();
        for (int i7 = 0; i7 < size; i7++) {
            r rVar = (r) this.f8477A.get(i7);
            if (rVar.b(this, motionEvent) && action != 3) {
                this.f8479B = rVar;
                return true;
            }
        }
        return false;
    }

    private void U(int[] iArr) {
        int iG = this.f8528q.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i8 = Integer.MIN_VALUE;
        for (int i9 = 0; i9 < iG; i9++) {
            C cF0 = f0(this.f8528q.f(i9));
            if (!cF0.J()) {
                int iM = cF0.m();
                if (iM < i7) {
                    i7 = iM;
                }
                if (iM > i8) {
                    i8 = iM;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
    }

    static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView recyclerViewV = V(viewGroup.getChildAt(i7));
            if (recyclerViewV != null) {
                return recyclerViewV;
            }
        }
        return null;
    }

    private View W() {
        C cX;
        z zVar = this.f8533s0;
        int i7 = zVar.f8663m;
        if (i7 == -1) {
            i7 = 0;
        }
        int iB = zVar.b();
        for (int i8 = i7; i8 < iB; i8++) {
            C cX2 = X(i8);
            if (cX2 == null) {
                break;
            }
            if (cX2.f8556a.hasFocusable()) {
                return cX2.f8556a;
            }
        }
        int iMin = Math.min(iB, i7);
        do {
            iMin--;
            if (iMin < 0 || (cX = X(iMin)) == null) {
                return null;
            }
        } while (!cX.f8556a.hasFocusable());
        return cX.f8556a;
    }

    private void Z0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f8536u.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f8618c) {
                Rect rect = pVar.f8617b;
                Rect rect2 = this.f8536u;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f8536u);
            offsetRectIntoDescendantCoords(view, this.f8536u);
        }
        this.f8544y.s1(this, view, this.f8536u, !this.f8487F, view2 == null);
    }

    private void a1() {
        z zVar = this.f8533s0;
        zVar.f8664n = -1L;
        zVar.f8663m = -1;
        zVar.f8665o = -1;
    }

    private void b1() {
        VelocityTracker velocityTracker = this.f8511d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        s1(0);
        S0();
    }

    private void c1() {
        View focusedChild = (this.f8525o0 && hasFocus() && this.f8542x != null) ? getFocusedChild() : null;
        C cS = focusedChild != null ? S(focusedChild) : null;
        if (cS == null) {
            a1();
            return;
        }
        this.f8533s0.f8664n = this.f8542x.g() ? cS.k() : -1L;
        this.f8533s0.f8663m = this.f8499O ? -1 : cS.v() ? cS.f8559d : cS.j();
        this.f8533s0.f8665o = h0(cS.f8556a);
    }

    static C f0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f8616a;
    }

    private void g(C c7) {
        View view = c7.f8556a;
        boolean z6 = view.getParent() == this;
        this.f8522n.J(e0(view));
        if (c7.x()) {
            this.f8528q.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        b bVar = this.f8528q;
        if (z6) {
            bVar.k(view);
        } else {
            bVar.b(view, true);
        }
    }

    static void g0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f8617b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private C0604y getScrollingChildHelper() {
        if (this.f8480B0 == null) {
            this.f8480B0 = new C0604y(this);
        }
        return this.f8480B0;
    }

    private int h0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private void h1(g gVar, boolean z6, boolean z7) {
        g gVar2 = this.f8542x;
        if (gVar2 != null) {
            gVar2.s(this.f8520m);
            this.f8542x.l(this);
        }
        if (!z6 || z7) {
            T0();
        }
        this.f8526p.u();
        g gVar3 = this.f8542x;
        this.f8542x = gVar;
        if (gVar != null) {
            gVar.q(this.f8520m);
            gVar.h(this);
        }
        o oVar = this.f8544y;
        if (oVar != null) {
            oVar.E0(gVar3, this.f8542x);
        }
        this.f8522n.x(gVar3, this.f8542x, z6);
        this.f8533s0.f8657g = true;
    }

    private String i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void k0(long j7, C c7, C c8) {
        int iG = this.f8528q.g();
        for (int i7 = 0; i7 < iG; i7++) {
            C cF0 = f0(this.f8528q.f(i7));
            if (cF0 != c7 && c0(cF0) == j7) {
                g gVar = this.f8542x;
                if (gVar == null || !gVar.g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + cF0 + " \n View Holder 2:" + c7 + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + cF0 + " \n View Holder 2:" + c7 + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c8 + " cannot be found but it is necessary for " + c7 + P());
    }

    private void m(C c7, C c8, l.b bVar, l.b bVar2, boolean z6, boolean z7) {
        c7.G(false);
        if (z6) {
            g(c7);
        }
        if (c7 != c8) {
            if (z7) {
                g(c8);
            }
            c7.f8563h = c8;
            g(c7);
            this.f8522n.J(c7);
            c8.G(false);
            c8.f8564i = c7;
        }
        if (this.f8508a0.b(c7, c8, bVar, bVar2)) {
            L0();
        }
    }

    private boolean m0() {
        int iG = this.f8528q.g();
        for (int i7 = 0; i7 < iG; i7++) {
            C cF0 = f0(this.f8528q.f(i7));
            if (cF0 != null && !cF0.J() && cF0.y()) {
                return true;
            }
        }
        return false;
    }

    private void o0() {
        if (H.A(this) == 0) {
            H.A0(this, 8);
        }
    }

    private void p0() {
        this.f8528q = new b(new e());
    }

    private void q() {
        b1();
        setScrollState(0);
    }

    static void r(C c7) {
        WeakReference weakReference = c7.f8557b;
        if (weakReference != null) {
            Object parent = weakReference.get();
            while (true) {
                for (View view = (View) parent; view != null; view = null) {
                    if (view == c7.f8556a) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    }
                }
                c7.f8557b = null;
                return;
            }
        }
    }

    private boolean u0(View view, View view2, int i7) {
        int i8;
        if (view2 == null || view2 == this || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.f8536u.set(0, 0, view.getWidth(), view.getHeight());
        this.f8538v.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f8536u);
        offsetDescendantRectToMyCoords(view2, this.f8538v);
        byte b7 = -1;
        int i9 = this.f8544y.Z() == 1 ? -1 : 1;
        Rect rect = this.f8536u;
        int i10 = rect.left;
        Rect rect2 = this.f8538v;
        int i11 = rect2.left;
        if ((i10 < i11 || rect.right <= i11) && rect.right < rect2.right) {
            i8 = 1;
        } else {
            int i12 = rect.right;
            int i13 = rect2.right;
            i8 = ((i12 > i13 || i10 >= i13) && i10 > i11) ? -1 : 0;
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        if ((i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom) {
            b7 = 1;
        } else {
            int i16 = rect.bottom;
            int i17 = rect2.bottom;
            if ((i16 <= i17 && i14 < i17) || i14 <= i15) {
                b7 = 0;
            }
        }
        if (i7 == 1) {
            return b7 < 0 || (b7 == 0 && i8 * i9 <= 0);
        }
        if (i7 == 2) {
            return b7 > 0 || (b7 == 0 && i8 * i9 >= 0);
        }
        if (i7 == 17) {
            return i8 < 0;
        }
        if (i7 == 33) {
            return b7 < 0;
        }
        if (i7 == 66) {
            return i8 > 0;
        }
        if (i7 == 130) {
            return b7 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i7 + P());
    }

    private void u1() {
        this.f8527p0.g();
        o oVar = this.f8544y;
        if (oVar != null) {
            oVar.K1();
        }
    }

    private void v(Context context, String str, AttributeSet attributeSet, int i7, int i8) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strI0 = i0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strI0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f8475P0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i7), Integer.valueOf(i8)};
                } catch (NoSuchMethodException e7) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e8) {
                        e8.initCause(e7);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strI0, e8);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strI0, e9);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strI0, e10);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strI0, e11);
            } catch (InstantiationException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e13);
            }
        }
    }

    private boolean x(int i7, int i8) {
        U(this.f8478A0);
        int[] iArr = this.f8478A0;
        return (iArr[0] == i7 && iArr[1] == i8) ? false : true;
    }

    void A0(int i7, int i8) {
        int iJ = this.f8528q.j();
        for (int i9 = 0; i9 < iJ; i9++) {
            C cF0 = f0(this.f8528q.i(i9));
            if (cF0 != null && !cF0.J() && cF0.f8558c >= i7) {
                cF0.A(i8, false);
                this.f8533s0.f8657g = true;
            }
        }
        this.f8522n.u(i7, i8);
        requestLayout();
    }

    void B() {
        String str;
        if (this.f8542x == null) {
            str = "No adapter attached; skipping layout";
        } else {
            if (this.f8544y != null) {
                z zVar = this.f8533s0;
                zVar.f8660j = false;
                if (zVar.f8655e != 1) {
                    if (!this.f8526p.q() && this.f8544y.o0() == getWidth() && this.f8544y.W() == getHeight()) {
                        this.f8544y.z1(this);
                    }
                    E();
                    return;
                }
                C();
                this.f8544y.z1(this);
                D();
                E();
                return;
            }
            str = "No layout manager attached; skipping layout";
        }
        Log.e("RecyclerView", str);
    }

    void B0(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int iJ = this.f8528q.j();
        if (i7 < i8) {
            i11 = -1;
            i10 = i7;
            i9 = i8;
        } else {
            i9 = i7;
            i10 = i8;
            i11 = 1;
        }
        for (int i13 = 0; i13 < iJ; i13++) {
            C cF0 = f0(this.f8528q.i(i13));
            if (cF0 != null && (i12 = cF0.f8558c) >= i10 && i12 <= i9) {
                if (i12 == i7) {
                    cF0.A(i8 - i7, false);
                } else {
                    cF0.A(i11, false);
                }
                this.f8533s0.f8657g = true;
            }
        }
        this.f8522n.v(i7, i8);
        requestLayout();
    }

    void C0(int i7, int i8, boolean z6) {
        int i9 = i7 + i8;
        int iJ = this.f8528q.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            C cF0 = f0(this.f8528q.i(i10));
            if (cF0 != null && !cF0.J()) {
                int i11 = cF0.f8558c;
                if (i11 >= i9) {
                    cF0.A(-i8, z6);
                } else if (i11 >= i7) {
                    cF0.i(i7 - 1, -i8, z6);
                }
                this.f8533s0.f8657g = true;
            }
        }
        this.f8522n.w(i7, i8, z6);
        requestLayout();
    }

    public void D0(View view) {
    }

    public void E0(View view) {
    }

    public boolean F(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return getScrollingChildHelper().d(i7, i8, iArr, iArr2, i9);
    }

    void F0() {
        this.f8501Q++;
    }

    public final void G(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    void G0() {
        H0(true);
    }

    void H(int i7) {
        o oVar = this.f8544y;
        if (oVar != null) {
            oVar.e1(i7);
        }
        J0(i7);
        s sVar = this.f8535t0;
        if (sVar != null) {
            sVar.a(this, i7);
        }
        List list = this.f8537u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f8537u0.get(size)).a(this, i7);
            }
        }
    }

    void H0(boolean z6) {
        int i7 = this.f8501Q - 1;
        this.f8501Q = i7;
        if (i7 < 1) {
            this.f8501Q = 0;
            if (z6) {
                A();
                J();
            }
        }
    }

    void I(int i7, int i8) {
        this.f8502R++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i8);
        K0(i7, i8);
        s sVar = this.f8535t0;
        if (sVar != null) {
            sVar.b(this, i7, i8);
        }
        List list = this.f8537u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f8537u0.get(size)).b(this, i7, i8);
            }
        }
        this.f8502R--;
    }

    void J() {
        int i7;
        for (int size = this.f8488F0.size() - 1; size >= 0; size--) {
            C c7 = (C) this.f8488F0.get(size);
            if (c7.f8556a.getParent() == this && !c7.J() && (i7 = c7.f8572q) != -1) {
                H.z0(c7.f8556a, i7);
                c7.f8572q = -1;
            }
        }
        this.f8488F0.clear();
    }

    public void J0(int i7) {
    }

    public void K0(int i7, int i8) {
    }

    void L() {
        int measuredWidth;
        int measuredHeight;
        if (this.f8507W != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f8503S.a(this, 3);
        this.f8507W = edgeEffectA;
        if (this.f8532s) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    void L0() {
        if (this.f8545y0 || !this.f8481C) {
            return;
        }
        H.h0(this, this.f8490G0);
        this.f8545y0 = true;
    }

    void M() {
        int measuredHeight;
        int measuredWidth;
        if (this.f8504T != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f8503S.a(this, 0);
        this.f8504T = edgeEffectA;
        if (this.f8532s) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void N() {
        int measuredHeight;
        int measuredWidth;
        if (this.f8506V != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f8503S.a(this, 2);
        this.f8506V = edgeEffectA;
        if (this.f8532s) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffectA.setSize(measuredHeight, measuredWidth);
    }

    void O() {
        int measuredWidth;
        int measuredHeight;
        if (this.f8505U != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f8503S.a(this, 1);
        this.f8505U = edgeEffectA;
        if (this.f8532s) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffectA.setSize(measuredWidth, measuredHeight);
    }

    void O0(boolean z6) {
        this.f8500P = z6 | this.f8500P;
        this.f8499O = true;
        x0();
    }

    String P() {
        return " " + super.toString() + ", adapter:" + this.f8542x + ", layout:" + this.f8544y + ", context:" + getContext();
    }

    final void Q(z zVar) {
        if (getScrollState() != 2) {
            zVar.f8666p = 0;
            zVar.f8667q = 0;
        } else {
            OverScroller overScroller = this.f8527p0.f8550o;
            zVar.f8666p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.f8667q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void Q0(C c7, l.b bVar) {
        c7.F(0, 8192);
        if (this.f8533s0.f8659i && c7.y() && !c7.v() && !c7.J()) {
            this.f8530r.c(c0(c7), c7);
        }
        this.f8530r.e(c7, bVar);
    }

    public View R(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public C S(View view) {
        View viewR = R(view);
        if (viewR == null) {
            return null;
        }
        return e0(viewR);
    }

    void T0() {
        l lVar = this.f8508a0;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f8544y;
        if (oVar != null) {
            oVar.k1(this.f8522n);
            this.f8544y.l1(this.f8522n);
        }
        this.f8522n.c();
    }

    boolean U0(View view) {
        p1();
        boolean zR = this.f8528q.r(view);
        if (zR) {
            C cF0 = f0(view);
            this.f8522n.J(cF0);
            this.f8522n.C(cF0);
        }
        r1(!zR);
        return zR;
    }

    public void V0(n nVar) {
        o oVar = this.f8544y;
        if (oVar != null) {
            oVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f8546z.remove(nVar);
        if (this.f8546z.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public void W0(r rVar) {
        this.f8477A.remove(rVar);
        if (this.f8479B == rVar) {
            this.f8479B = null;
        }
    }

    public C X(int i7) {
        C c7 = null;
        if (this.f8499O) {
            return null;
        }
        int iJ = this.f8528q.j();
        for (int i8 = 0; i8 < iJ; i8++) {
            C cF0 = f0(this.f8528q.i(i8));
            if (cF0 != null && !cF0.v() && b0(cF0) == i7) {
                if (!this.f8528q.n(cF0.f8556a)) {
                    return cF0;
                }
                c7 = cF0;
            }
        }
        return c7;
    }

    public void X0(s sVar) {
        List list = this.f8537u0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public C Y(long j7) {
        g gVar = this.f8542x;
        C c7 = null;
        if (gVar != null && gVar.g()) {
            int iJ = this.f8528q.j();
            for (int i7 = 0; i7 < iJ; i7++) {
                C cF0 = f0(this.f8528q.i(i7));
                if (cF0 != null && !cF0.v() && cF0.k() == j7) {
                    if (!this.f8528q.n(cF0.f8556a)) {
                        return cF0;
                    }
                    c7 = cF0;
                }
            }
        }
        return c7;
    }

    void Y0() {
        C c7;
        int iG = this.f8528q.g();
        for (int i7 = 0; i7 < iG; i7++) {
            View viewF = this.f8528q.f(i7);
            C cE0 = e0(viewF);
            if (cE0 != null && (c7 = cE0.f8564i) != null) {
                View view = c7.f8556a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    C Z(int i7, boolean z6) {
        int iJ = this.f8528q.j();
        C c7 = null;
        for (int i8 = 0; i8 < iJ; i8++) {
            C cF0 = f0(this.f8528q.i(i8));
            if (cF0 != null && !cF0.v()) {
                if (z6) {
                    if (cF0.f8558c != i7) {
                        continue;
                    } else {
                        if (!this.f8528q.n(cF0.f8556a)) {
                            return cF0;
                        }
                        c7 = cF0;
                    }
                } else if (cF0.m() != i7) {
                    continue;
                }
            }
        }
        return c7;
    }

    void a(int i7, int i8) {
        if (i7 < 0) {
            M();
            if (this.f8504T.isFinished()) {
                this.f8504T.onAbsorb(-i7);
            }
        } else if (i7 > 0) {
            N();
            if (this.f8506V.isFinished()) {
                this.f8506V.onAbsorb(i7);
            }
        }
        if (i8 < 0) {
            O();
            if (this.f8505U.isFinished()) {
                this.f8505U.onAbsorb(-i8);
            }
        } else if (i8 > 0) {
            L();
            if (this.f8507W.isFinished()) {
                this.f8507W.onAbsorb(i8);
            }
        }
        if (i7 == 0 && i8 == 0) {
            return;
        }
        H.g0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean a0(int i7, int i8) {
        o oVar = this.f8544y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f8493I) {
            return false;
        }
        int iK = oVar.k();
        boolean zL = this.f8544y.l();
        if (iK == 0 || Math.abs(i7) < this.f8518k0) {
            i7 = 0;
        }
        if (!zL || Math.abs(i8) < this.f8518k0) {
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return false;
        }
        float f7 = i7;
        float f8 = i8;
        if (!dispatchNestedPreFling(f7, f8)) {
            boolean z6 = iK != 0 || zL;
            dispatchNestedFling(f7, f8, z6);
            q qVar = this.f8517j0;
            if (qVar != null && qVar.a(i7, i8)) {
                return true;
            }
            if (z6) {
                if (zL) {
                    iK = (iK == true ? 1 : 0) | 2;
                }
                q1(iK, 1);
                int i9 = this.f8519l0;
                int iMax = Math.max(-i9, Math.min(i7, i9));
                int i10 = this.f8519l0;
                this.f8527p0.c(iMax, Math.max(-i10, Math.min(i8, i10)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i7, int i8) {
        o oVar = this.f8544y;
        if (oVar == null || !oVar.F0(this, arrayList, i7, i8)) {
            super.addFocusables(arrayList, i7, i8);
        }
    }

    int b0(C c7) {
        if (c7.p(524) || !c7.s()) {
            return -1;
        }
        return this.f8526p.e(c7.f8558c);
    }

    long c0(C c7) {
        return this.f8542x.g() ? c7.k() : c7.f8558c;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f8544y.m((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.f8544y;
        if (oVar != null && oVar.k()) {
            return this.f8544y.q(this.f8533s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.f8544y;
        if (oVar != null && oVar.k()) {
            return this.f8544y.r(this.f8533s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.f8544y;
        if (oVar != null && oVar.k()) {
            return this.f8544y.s(this.f8533s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.f8544y;
        if (oVar != null && oVar.l()) {
            return this.f8544y.t(this.f8533s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.f8544y;
        if (oVar != null && oVar.l()) {
            return this.f8544y.u(this.f8533s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.f8544y;
        if (oVar != null && oVar.l()) {
            return this.f8544y.v(this.f8533s0);
        }
        return 0;
    }

    public int d0(View view) {
        C cF0 = f0(view);
        if (cF0 != null) {
            return cF0.m();
        }
        return -1;
    }

    void d1() {
        int iJ = this.f8528q.j();
        for (int i7 = 0; i7 < iJ; i7++) {
            C cF0 = f0(this.f8528q.i(i7));
            if (!cF0.J()) {
                cF0.E();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return getScrollingChildHelper().a(f7, f8, z6);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f7, float f8) {
        return getScrollingChildHelper().b(f7, f8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i8, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().f(i7, i8, i9, i10, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z6;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.f8546z.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            ((n) this.f8546z.get(i7)).i(canvas, this, this.f8533s0);
        }
        EdgeEffect edgeEffect = this.f8504T;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.f8532s ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.f8504T;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f8505U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f8532s) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f8505U;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f8506V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f8532s ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f8506V;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f8507W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f8532s) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.f8507W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z6 |= z7;
            canvas.restoreToCount(iSave4);
        }
        if ((z6 || this.f8508a0 == null || this.f8546z.size() <= 0 || !this.f8508a0.p()) ? z6 : true) {
            H.g0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    public C e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    boolean e1(int i7, int i8, MotionEvent motionEvent) {
        int i9;
        int i10;
        int i11;
        int i12;
        u();
        if (this.f8542x != null) {
            int[] iArr = this.f8486E0;
            iArr[0] = 0;
            iArr[1] = 0;
            f1(i7, i8, iArr);
            int[] iArr2 = this.f8486E0;
            int i13 = iArr2[0];
            int i14 = iArr2[1];
            i9 = i14;
            i10 = i13;
            i11 = i7 - i13;
            i12 = i8 - i14;
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        if (!this.f8546z.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f8486E0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i10, i9, i11, i12, this.f8482C0, 0, iArr3);
        int[] iArr4 = this.f8486E0;
        int i15 = iArr4[0];
        int i16 = i11 - i15;
        int i17 = iArr4[1];
        int i18 = i12 - i17;
        boolean z6 = (i15 == 0 && i17 == 0) ? false : true;
        int i19 = this.f8514g0;
        int[] iArr5 = this.f8482C0;
        int i20 = iArr5[0];
        this.f8514g0 = i19 - i20;
        int i21 = this.f8515h0;
        int i22 = iArr5[1];
        this.f8515h0 = i21 - i22;
        int[] iArr6 = this.f8484D0;
        iArr6[0] = iArr6[0] + i20;
        iArr6[1] = iArr6[1] + i22;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC0602w.a(motionEvent, 8194)) {
                P0(motionEvent.getX(), i16, motionEvent.getY(), i18);
            }
            t(i7, i8);
        }
        if (i10 != 0 || i9 != 0) {
            I(i10, i9);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z6 && i10 == 0 && i9 == 0) ? false : true;
    }

    void f1(int i7, int i8, int[] iArr) {
        p1();
        F0();
        androidx.core.os.o.a("RV Scroll");
        Q(this.f8533s0);
        int iW1 = i7 != 0 ? this.f8544y.w1(i7, this.f8522n, this.f8533s0) : 0;
        int iY1 = i8 != 0 ? this.f8544y.y1(i8, this.f8522n, this.f8533s0) : 0;
        androidx.core.os.o.b();
        Y0();
        G0();
        r1(false);
        if (iArr != null) {
            iArr[0] = iW1;
            iArr[1] = iY1;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i7) {
        View viewJ0;
        boolean z6;
        View viewQ0 = this.f8544y.Q0(view, i7);
        if (viewQ0 != null) {
            return viewQ0;
        }
        boolean z7 = (this.f8542x == null || this.f8544y == null || t0() || this.f8493I) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z7 && (i7 == 2 || i7 == 1)) {
            if (this.f8544y.l()) {
                int i8 = i7 == 2 ? 130 : 33;
                z6 = focusFinder.findNextFocus(this, view, i8) == null;
                if (f8473N0) {
                    i7 = i8;
                }
            } else {
                z6 = false;
            }
            if (!z6 && this.f8544y.k()) {
                int i9 = (this.f8544y.Z() == 1) ^ (i7 == 2) ? 66 : 17;
                boolean z8 = focusFinder.findNextFocus(this, view, i9) == null;
                if (f8473N0) {
                    i7 = i9;
                }
                z6 = z8;
            }
            if (z6) {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                this.f8544y.J0(view, i7, this.f8522n, this.f8533s0);
                r1(false);
            }
            viewJ0 = focusFinder.findNextFocus(this, view, i7);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i7);
            if (viewFindNextFocus == null && z7) {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                viewJ0 = this.f8544y.J0(view, i7, this.f8522n, this.f8533s0);
                r1(false);
            } else {
                viewJ0 = viewFindNextFocus;
            }
        }
        if (viewJ0 == null || viewJ0.hasFocusable()) {
            return u0(view, viewJ0, i7) ? viewJ0 : super.focusSearch(view, i7);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i7);
        }
        Z0(viewJ0, null);
        return view;
    }

    public void g1(int i7) {
        if (this.f8493I) {
            return;
        }
        t1();
        o oVar = this.f8544y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.x1(i7);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f8544y;
        if (oVar != null) {
            return oVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f8544y;
        if (oVar != null) {
            return oVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f8542x;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f8544y;
        return oVar != null ? oVar.G() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i7, int i8) {
        return super.getChildDrawingOrder(i7, i8);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f8532s;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.f8547z0;
    }

    public k getEdgeEffectFactory() {
        return this.f8503S;
    }

    public l getItemAnimator() {
        return this.f8508a0;
    }

    public int getItemDecorationCount() {
        return this.f8546z.size();
    }

    public o getLayoutManager() {
        return this.f8544y;
    }

    public int getMaxFlingVelocity() {
        return this.f8519l0;
    }

    public int getMinFlingVelocity() {
        return this.f8518k0;
    }

    long getNanoTime() {
        if (f8472M0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return this.f8517j0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f8525o0;
    }

    public t getRecycledViewPool() {
        return this.f8522n.i();
    }

    public int getScrollState() {
        return this.f8509b0;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i7) {
        o oVar = this.f8544y;
        if (oVar != null) {
            oVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f8546z.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i7 < 0) {
            this.f8546z.add(nVar);
        } else {
            this.f8546z.add(i7, nVar);
        }
        w0();
        requestLayout();
    }

    boolean i1(C c7, int i7) {
        if (!t0()) {
            H.z0(c7.f8556a, i7);
            return true;
        }
        c7.f8572q = i7;
        this.f8488F0.add(c7);
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f8481C;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f8493I;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(r rVar) {
        this.f8477A.add(rVar);
    }

    Rect j0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f8618c) {
            return pVar.f8617b;
        }
        if (this.f8533s0.e() && (pVar.b() || pVar.d())) {
            return pVar.f8617b;
        }
        Rect rect = pVar.f8617b;
        rect.set(0, 0, 0, 0);
        int size = this.f8546z.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f8536u.set(0, 0, 0, 0);
            ((n) this.f8546z.get(i7)).e(this.f8536u, view, this, this.f8533s0);
            int i8 = rect.left;
            Rect rect2 = this.f8536u;
            rect.left = i8 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f8618c = false;
        return rect;
    }

    boolean j1(AccessibilityEvent accessibilityEvent) {
        if (!t0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? AbstractC0577b.a(accessibilityEvent) : 0;
        this.f8495K |= iA != 0 ? iA : 0;
        return true;
    }

    public void k(s sVar) {
        if (this.f8537u0 == null) {
            this.f8537u0 = new ArrayList();
        }
        this.f8537u0.add(sVar);
    }

    public void k1(int i7, int i8) {
        l1(i7, i8, null);
    }

    void l(C c7, l.b bVar, l.b bVar2) {
        c7.G(false);
        if (this.f8508a0.a(c7, bVar, bVar2)) {
            L0();
        }
    }

    public boolean l0() {
        return !this.f8487F || this.f8499O || this.f8526p.p();
    }

    public void l1(int i7, int i8, Interpolator interpolator) {
        m1(i7, i8, interpolator, Integer.MIN_VALUE);
    }

    public void m1(int i7, int i8, Interpolator interpolator, int i9) {
        n1(i7, i8, interpolator, i9, false);
    }

    void n(C c7, l.b bVar, l.b bVar2) {
        g(c7);
        c7.G(false);
        if (this.f8508a0.c(c7, bVar, bVar2)) {
            L0();
        }
    }

    void n0() {
        this.f8526p = new a(new f());
    }

    void n1(int i7, int i8, Interpolator interpolator, int i9, boolean z6) {
        o oVar = this.f8544y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f8493I) {
            return;
        }
        if (!oVar.k()) {
            i7 = 0;
        }
        if (!this.f8544y.l()) {
            i8 = 0;
        }
        if (i7 == 0 && i8 == 0) {
            return;
        }
        if (i9 != Integer.MIN_VALUE && i9 <= 0) {
            scrollBy(i7, i8);
            return;
        }
        if (z6) {
            int i10 = i7 != 0 ? 1 : 0;
            if (i8 != 0) {
                i10 |= 2;
            }
            q1(i10, 1);
        }
        this.f8527p0.f(i7, i8, i9, interpolator);
    }

    void o(String str) {
        if (t0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.f8502R > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    public void o1(int i7) {
        if (this.f8493I) {
            return;
        }
        o oVar = this.f8544y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.I1(this, this.f8533s0, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f8501Q = 0;
        this.f8481C = true;
        this.f8487F = this.f8487F && !isLayoutRequested();
        o oVar = this.f8544y;
        if (oVar != null) {
            oVar.z(this);
        }
        this.f8545y0 = false;
        if (f8472M0) {
            ThreadLocal threadLocal = androidx.recyclerview.widget.e.f8828q;
            androidx.recyclerview.widget.e eVar = (androidx.recyclerview.widget.e) threadLocal.get();
            this.f8529q0 = eVar;
            if (eVar == null) {
                this.f8529q0 = new androidx.recyclerview.widget.e();
                Display displayV = H.v(this);
                if (isInEditMode() || displayV == null) {
                    refreshRate = 60.0f;
                    androidx.recyclerview.widget.e eVar2 = this.f8529q0;
                    eVar2.f8832o = (long) (1.0E9f / refreshRate);
                    threadLocal.set(eVar2);
                } else {
                    refreshRate = displayV.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    androidx.recyclerview.widget.e eVar22 = this.f8529q0;
                    eVar22.f8832o = (long) (1.0E9f / refreshRate);
                    threadLocal.set(eVar22);
                }
            }
            this.f8529q0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.f8508a0;
        if (lVar != null) {
            lVar.k();
        }
        t1();
        this.f8481C = false;
        o oVar = this.f8544y;
        if (oVar != null) {
            oVar.A(this, this.f8522n);
        }
        this.f8488F0.clear();
        removeCallbacks(this.f8490G0);
        this.f8530r.j();
        if (!f8472M0 || (eVar = this.f8529q0) == null) {
            return;
        }
        eVar.j(this);
        this.f8529q0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f8546z.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((n) this.f8546z.get(i7)).g(canvas, this, this.f8533s0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f7;
        float axisValue;
        if (this.f8544y != null && !this.f8493I && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f7 = this.f8544y.l() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f8544y.k() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f7 != 0.0f || axisValue != 0.0f) {
                    e1((int) (axisValue * this.f8521m0), (int) (f7 * this.f8523n0), motionEvent);
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f8544y.l()) {
                    f7 = -axisValue2;
                    if (f7 != 0.0f) {
                        e1((int) (axisValue * this.f8521m0), (int) (f7 * this.f8523n0), motionEvent);
                    }
                } else {
                    if (this.f8544y.k()) {
                        axisValue = axisValue2;
                        f7 = 0.0f;
                    } else {
                        f7 = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f7 != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        if (this.f8493I) {
            return false;
        }
        this.f8479B = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.f8544y;
        if (oVar == null) {
            return false;
        }
        boolean zK = oVar.k();
        boolean zL = this.f8544y.l();
        if (this.f8511d0 == null) {
            this.f8511d0 = VelocityTracker.obtain();
        }
        this.f8511d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f8494J) {
                this.f8494J = false;
            }
            this.f8510c0 = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            this.f8514g0 = x6;
            this.f8512e0 = x6;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f8515h0 = y6;
            this.f8513f0 = y6;
            if (this.f8509b0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                s1(1);
            }
            int[] iArr = this.f8484D0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i7 = zK;
            if (zL) {
                i7 = (zK ? 1 : 0) | 2;
            }
            q1(i7, 0);
        } else if (actionMasked == 1) {
            this.f8511d0.clear();
            s1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f8510c0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f8510c0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x7 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y7 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f8509b0 != 1) {
                int i8 = x7 - this.f8512e0;
                int i9 = y7 - this.f8513f0;
                if (!zK || Math.abs(i8) <= this.f8516i0) {
                    z6 = false;
                } else {
                    this.f8514g0 = x7;
                    z6 = true;
                }
                if (zL && Math.abs(i9) > this.f8516i0) {
                    this.f8515h0 = y7;
                    z6 = true;
                }
                if (z6) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.f8510c0 = motionEvent.getPointerId(actionIndex);
            int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f8514g0 = x8;
            this.f8512e0 = x8;
            int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f8515h0 = y8;
            this.f8513f0 = y8;
        } else if (actionMasked == 6) {
            I0(motionEvent);
        }
        return this.f8509b0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        androidx.core.os.o.a("RV OnLayout");
        B();
        androidx.core.os.o.b();
        this.f8487F = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        o oVar = this.f8544y;
        if (oVar == null) {
            w(i7, i8);
            return;
        }
        if (oVar.s0()) {
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f8544y.Z0(this.f8522n, this.f8533s0, i7, i8);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f8542x == null) {
                return;
            }
            if (this.f8533s0.f8655e == 1) {
                C();
            }
            this.f8544y.A1(i7, i8);
            this.f8533s0.f8660j = true;
            D();
            this.f8544y.D1(i7, i8);
            if (this.f8544y.G1()) {
                this.f8544y.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f8533s0.f8660j = true;
                D();
                this.f8544y.D1(i7, i8);
                return;
            }
            return;
        }
        if (this.f8483D) {
            this.f8544y.Z0(this.f8522n, this.f8533s0, i7, i8);
            return;
        }
        if (this.f8496L) {
            p1();
            F0();
            N0();
            G0();
            z zVar = this.f8533s0;
            if (zVar.f8662l) {
                zVar.f8658h = true;
            } else {
                this.f8526p.j();
                this.f8533s0.f8658h = false;
            }
            this.f8496L = false;
            r1(false);
        } else if (this.f8533s0.f8662l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.f8542x;
        if (gVar != null) {
            this.f8533s0.f8656f = gVar.c();
        } else {
            this.f8533s0.f8656f = 0;
        }
        p1();
        this.f8544y.Z0(this.f8522n, this.f8533s0, i7, i8);
        r1(false);
        this.f8533s0.f8658h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f8524o = xVar;
        super.onRestoreInstanceState(xVar.a());
        o oVar = this.f8544y;
        if (oVar == null || (parcelable2 = this.f8524o.f8635o) == null) {
            return;
        }
        oVar.c1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f8524o;
        if (xVar2 != null) {
            xVar.b(xVar2);
        } else {
            o oVar = this.f8544y;
            xVar.f8635o = oVar != null ? oVar.d1() : null;
        }
        return xVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 == i9 && i8 == i10) {
            return;
        }
        r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[PHI: r0
      0x00dd: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:46:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f8493I || this.f8494J) {
            return false;
        }
        if (K(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.f8544y;
        if (oVar == null) {
            return false;
        }
        boolean zK = oVar.k();
        boolean zL = this.f8544y.l();
        if (this.f8511d0 == null) {
            this.f8511d0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f8484D0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f8484D0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.f8510c0 = motionEvent.getPointerId(0);
            int x6 = (int) (motionEvent.getX() + 0.5f);
            this.f8514g0 = x6;
            this.f8512e0 = x6;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f8515h0 = y6;
            this.f8513f0 = y6;
            int i7 = zK;
            if (zL) {
                i7 = (zK ? 1 : 0) | 2;
            }
            q1(i7, 0);
        } else {
            if (actionMasked == 1) {
                this.f8511d0.addMovement(motionEventObtain);
                this.f8511d0.computeCurrentVelocity(1000, this.f8519l0);
                float f7 = zK ? -this.f8511d0.getXVelocity(this.f8510c0) : 0.0f;
                float f8 = zL ? -this.f8511d0.getYVelocity(this.f8510c0) : 0.0f;
                if ((f7 == 0.0f && f8 == 0.0f) || !a0((int) f7, (int) f8)) {
                    setScrollState(0);
                }
                b1();
                motionEventObtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f8510c0);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f8510c0 + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x7 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y7 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.f8514g0 - x7;
                int iMax2 = this.f8515h0 - y7;
                if (this.f8509b0 != 1) {
                    if (zK) {
                        int i8 = this.f8516i0;
                        iMax = iMax > 0 ? Math.max(0, iMax - i8) : Math.min(0, iMax + i8);
                        boolean z6 = iMax != 0;
                        if (zL) {
                            int i9 = this.f8516i0;
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i9) : Math.min(0, iMax2 + i9);
                            if (iMax2 != 0) {
                                z6 = true;
                            }
                        }
                        if (z6) {
                            setScrollState(1);
                        }
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                int i10 = iMax;
                int i11 = iMax2;
                if (this.f8509b0 == 1) {
                    int[] iArr3 = this.f8486E0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (F(zK ? i10 : 0, zL ? i11 : 0, iArr3, this.f8482C0, 0)) {
                        int[] iArr4 = this.f8486E0;
                        i10 -= iArr4[0];
                        i11 -= iArr4[1];
                        int[] iArr5 = this.f8484D0;
                        int i12 = iArr5[0];
                        int[] iArr6 = this.f8482C0;
                        iArr5[0] = i12 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i13 = i11;
                    int[] iArr7 = this.f8482C0;
                    this.f8514g0 = x7 - iArr7[0];
                    this.f8515h0 = y7 - iArr7[1];
                    if (e1(zK ? i10 : 0, zL ? i13 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.e eVar = this.f8529q0;
                    if (eVar != null && (i10 != 0 || i13 != 0)) {
                        eVar.f(this, i10, i13);
                    }
                }
            } else if (actionMasked == 3) {
                q();
            } else if (actionMasked == 5) {
                this.f8510c0 = motionEvent.getPointerId(actionIndex);
                int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f8514g0 = x8;
                this.f8512e0 = x8;
                int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f8515h0 = y8;
                this.f8513f0 = y8;
            } else if (actionMasked == 6) {
                I0(motionEvent);
            }
        }
        this.f8511d0.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    boolean p(C c7) {
        l lVar = this.f8508a0;
        return lVar == null || lVar.g(c7, c7.o());
    }

    void p1() {
        int i7 = this.f8489G + 1;
        this.f8489G = i7;
        if (i7 != 1 || this.f8493I) {
            return;
        }
        this.f8491H = false;
    }

    void q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(V.b.f3996a), resources.getDimensionPixelSize(V.b.f3998c), resources.getDimensionPixelOffset(V.b.f3997b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    public boolean q1(int i7, int i8) {
        return getScrollingChildHelper().p(i7, i8);
    }

    void r0() {
        this.f8507W = null;
        this.f8505U = null;
        this.f8506V = null;
        this.f8504T = null;
    }

    void r1(boolean z6) {
        if (this.f8489G < 1) {
            this.f8489G = 1;
        }
        if (!z6 && !this.f8493I) {
            this.f8491H = false;
        }
        if (this.f8489G == 1) {
            if (z6 && this.f8491H && !this.f8493I && this.f8544y != null && this.f8542x != null) {
                B();
            }
            if (!this.f8493I) {
                this.f8491H = false;
            }
        }
        this.f8489G--;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z6) {
        C cF0 = f0(view);
        if (cF0 != null) {
            if (cF0.x()) {
                cF0.f();
            } else if (!cF0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + cF0 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f8544y.b1(this, this.f8533s0, view, view2) && view2 != null) {
            Z0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f8544y.r1(this, view, rect, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        int size = this.f8477A.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((r) this.f8477A.get(i7)).c(z6);
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f8489G != 0 || this.f8493I) {
            this.f8491H = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int iJ = this.f8528q.j();
        for (int i7 = 0; i7 < iJ; i7++) {
            C cF0 = f0(this.f8528q.i(i7));
            if (!cF0.J()) {
                cF0.c();
            }
        }
        this.f8522n.d();
    }

    boolean s0() {
        AccessibilityManager accessibilityManager = this.f8497M;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void s1(int i7) {
        getScrollingChildHelper().r(i7);
    }

    @Override // android.view.View
    public void scrollBy(int i7, int i8) {
        o oVar = this.f8544y;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f8493I) {
            return;
        }
        boolean zK = oVar.k();
        boolean zL = this.f8544y.l();
        if (zK || zL) {
            if (!zK) {
                i7 = 0;
            }
            if (!zL) {
                i8 = 0;
            }
            e1(i7, i8, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (j1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l lVar) {
        this.f8547z0 = lVar;
        H.p0(this, lVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        h1(gVar, false, true);
        O0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f8532s) {
            r0();
        }
        this.f8532s = z6;
        super.setClipToPadding(z6);
        if (this.f8487F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        androidx.core.util.f.f(kVar);
        this.f8503S = kVar;
        r0();
    }

    public void setHasFixedSize(boolean z6) {
        this.f8483D = z6;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.f8508a0;
        if (lVar2 != null) {
            lVar2.k();
            this.f8508a0.v(null);
        }
        this.f8508a0 = lVar;
        if (lVar != null) {
            lVar.v(this.f8543x0);
        }
    }

    public void setItemViewCacheSize(int i7) {
        this.f8522n.G(i7);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.f8544y) {
            return;
        }
        t1();
        if (this.f8544y != null) {
            l lVar = this.f8508a0;
            if (lVar != null) {
                lVar.k();
            }
            this.f8544y.k1(this.f8522n);
            this.f8544y.l1(this.f8522n);
            this.f8522n.c();
            if (this.f8481C) {
                this.f8544y.A(this, this.f8522n);
            }
            this.f8544y.E1(null);
            this.f8544y = null;
        } else {
            this.f8522n.c();
        }
        this.f8528q.o();
        this.f8544y = oVar;
        if (oVar != null) {
            if (oVar.f8593b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f8593b.P());
            }
            oVar.E1(this);
            if (this.f8481C) {
                this.f8544y.z(this);
            }
        }
        this.f8522n.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        getScrollingChildHelper().m(z6);
    }

    public void setOnFlingListener(q qVar) {
        this.f8517j0 = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f8535t0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f8525o0 = z6;
    }

    public void setRecycledViewPool(t tVar) {
        this.f8522n.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
    }

    void setScrollState(int i7) {
        if (i7 == this.f8509b0) {
            return;
        }
        this.f8509b0 = i7;
        if (i7 != 2) {
            u1();
        }
        H(i7);
    }

    public void setScrollingTouchSlop(int i7) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i7 != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.f8516i0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(A a7) {
        this.f8522n.F(a7);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().o(i7);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z6) {
        if (z6 != this.f8493I) {
            o("Do not suppressLayout in layout or scroll");
            if (z6) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f8493I = true;
                this.f8494J = true;
                t1();
                return;
            }
            this.f8493I = false;
            if (this.f8491H && this.f8544y != null && this.f8542x != null) {
                requestLayout();
            }
            this.f8491H = false;
        }
    }

    void t(int i7, int i8) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f8504T;
        if (edgeEffect == null || edgeEffect.isFinished() || i7 <= 0) {
            zIsFinished = false;
        } else {
            this.f8504T.onRelease();
            zIsFinished = this.f8504T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f8506V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f8506V.onRelease();
            zIsFinished |= this.f8506V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f8505U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f8505U.onRelease();
            zIsFinished |= this.f8505U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f8507W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f8507W.onRelease();
            zIsFinished |= this.f8507W.isFinished();
        }
        if (zIsFinished) {
            H.g0(this);
        }
    }

    public boolean t0() {
        return this.f8501Q > 0;
    }

    public void t1() {
        setScrollState(0);
        u1();
    }

    void u() {
        if (!this.f8487F || this.f8499O) {
            androidx.core.os.o.a("RV FullInvalidate");
            B();
            androidx.core.os.o.b();
            return;
        }
        if (this.f8526p.p()) {
            if (this.f8526p.o(4) && !this.f8526p.o(11)) {
                androidx.core.os.o.a("RV PartialInvalidate");
                p1();
                F0();
                this.f8526p.s();
                if (!this.f8491H) {
                    if (m0()) {
                        B();
                    } else {
                        this.f8526p.i();
                    }
                }
                r1(true);
                G0();
            } else {
                if (!this.f8526p.p()) {
                    return;
                }
                androidx.core.os.o.a("RV FullInvalidate");
                B();
            }
            androidx.core.os.o.b();
        }
    }

    void v0(int i7) {
        if (this.f8544y == null) {
            return;
        }
        setScrollState(2);
        this.f8544y.x1(i7);
        awakenScrollBars();
    }

    void v1(int i7, int i8, Object obj) {
        int i9;
        int iJ = this.f8528q.j();
        int i10 = i7 + i8;
        for (int i11 = 0; i11 < iJ; i11++) {
            View viewI = this.f8528q.i(i11);
            C cF0 = f0(viewI);
            if (cF0 != null && !cF0.J() && (i9 = cF0.f8558c) >= i7 && i9 < i10) {
                cF0.b(2);
                cF0.a(obj);
                ((p) viewI.getLayoutParams()).f8618c = true;
            }
        }
        this.f8522n.M(i7, i8);
    }

    void w(int i7, int i8) {
        setMeasuredDimension(o.n(i7, getPaddingLeft() + getPaddingRight(), H.D(this)), o.n(i8, getPaddingTop() + getPaddingBottom(), H.C(this)));
    }

    void w0() {
        int iJ = this.f8528q.j();
        for (int i7 = 0; i7 < iJ; i7++) {
            ((p) this.f8528q.i(i7).getLayoutParams()).f8618c = true;
        }
        this.f8522n.s();
    }

    void x0() {
        int iJ = this.f8528q.j();
        for (int i7 = 0; i7 < iJ; i7++) {
            C cF0 = f0(this.f8528q.i(i7));
            if (cF0 != null && !cF0.J()) {
                cF0.b(6);
            }
        }
        w0();
        this.f8522n.t();
    }

    void y(View view) {
        int size;
        C cF0 = f0(view);
        D0(view);
        g gVar = this.f8542x;
        if (gVar != null && cF0 != null) {
            gVar.n(cF0);
        }
        if (this.f8498N == null || r2.size() - 1 < 0) {
            return;
        }
        androidx.appcompat.app.y.a(this.f8498N.get(size));
        throw null;
    }

    public void y0(int i7) {
        int iG = this.f8528q.g();
        for (int i8 = 0; i8 < iG; i8++) {
            this.f8528q.f(i8).offsetLeftAndRight(i7);
        }
    }

    void z(View view) {
        int size;
        C cF0 = f0(view);
        E0(view);
        g gVar = this.f8542x;
        if (gVar != null && cF0 != null) {
            gVar.o(cF0);
        }
        if (this.f8498N == null || r2.size() - 1 < 0) {
            return;
        }
        androidx.appcompat.app.y.a(this.f8498N.get(size));
        throw null;
    }

    public void z0(int i7) {
        int iG = this.f8528q.g();
        for (int i8 = 0; i8 < iG; i8++) {
            this.f8528q.f(i8).offsetTopAndBottom(i7);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8520m = new w();
        this.f8522n = new u();
        this.f8530r = new androidx.recyclerview.widget.q();
        this.f8534t = new RunnableC0655a();
        this.f8536u = new Rect();
        this.f8538v = new Rect();
        this.f8540w = new RectF();
        this.f8546z = new ArrayList();
        this.f8477A = new ArrayList();
        this.f8489G = 0;
        this.f8499O = false;
        this.f8500P = false;
        this.f8501Q = 0;
        this.f8502R = 0;
        this.f8503S = new k();
        this.f8508a0 = new c();
        this.f8509b0 = 0;
        this.f8510c0 = -1;
        this.f8521m0 = Float.MIN_VALUE;
        this.f8523n0 = Float.MIN_VALUE;
        this.f8525o0 = true;
        this.f8527p0 = new B();
        this.f8531r0 = f8472M0 ? new e.b() : null;
        this.f8533s0 = new z();
        this.f8539v0 = false;
        this.f8541w0 = false;
        this.f8543x0 = new m();
        this.f8545y0 = false;
        this.f8478A0 = new int[2];
        this.f8482C0 = new int[2];
        this.f8484D0 = new int[2];
        this.f8486E0 = new int[2];
        this.f8488F0 = new ArrayList();
        this.f8490G0 = new RunnableC0656b();
        this.f8492H0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8516i0 = viewConfiguration.getScaledTouchSlop();
        this.f8521m0 = J.b(viewConfiguration, context);
        this.f8523n0 = J.d(viewConfiguration, context);
        this.f8518k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8519l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f8508a0.v(this.f8543x0);
        n0();
        p0();
        o0();
        if (H.z(this) == 0) {
            H.z0(this, 1);
        }
        this.f8497M = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V.c.f4004f, i7, 0);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            saveAttributeDataForStyleable(context, V.c.f4004f, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(V.c.f4013o);
        if (typedArrayObtainStyledAttributes.getInt(V.c.f4007i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f8532s = typedArrayObtainStyledAttributes.getBoolean(V.c.f4006h, true);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(V.c.f4008j, false);
        this.f8485E = z6;
        if (z6) {
            q0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(V.c.f4011m), typedArrayObtainStyledAttributes.getDrawable(V.c.f4012n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(V.c.f4009k), typedArrayObtainStyledAttributes.getDrawable(V.c.f4010l));
        }
        typedArrayObtainStyledAttributes.recycle();
        v(context, string, attributeSet, i7, 0);
        int[] iArr = f8468I0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        if (i8 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i7, 0);
        }
        boolean z7 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z7);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f8544y;
        if (oVar != null) {
            return oVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }
}
