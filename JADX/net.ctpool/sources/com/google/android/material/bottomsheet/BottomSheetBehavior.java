package com.google.android.material.bottomsheet;

import A.c;
import A3.h;
import A3.i;
import A3.j;
import N3.k;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.y;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;
import androidx.core.view.U;
import androidx.core.view.accessibility.C;
import androidx.core.view.accessibility.F;
import com.google.android.material.internal.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import w.AbstractC2173a;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f16527d0 = i.f260d;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ValueAnimator f16528A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f16529B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f16530C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f16531D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    float f16532E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f16533F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    float f16534G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f16535H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f16536I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f16537J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    int f16538K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f16539L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    A.c f16540M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f16541N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f16542O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f16543P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f16544Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    int f16545R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f16546S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    WeakReference f16547T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    WeakReference f16548U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final ArrayList f16549V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private VelocityTracker f16550W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f16551X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f16552Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    boolean f16553Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16554a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private Map f16555a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16556b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f16557b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16558c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final c.AbstractC0002c f16559c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f16560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private N3.g f16565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f16566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f16568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f16570n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f16571o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16572p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16573q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f16574r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f16575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16576t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f16577u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f16578v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f16579w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private k f16580x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f16581y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final g f16582z;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ View f16583m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f16584n;

        a(View view, int i7) {
            this.f16583m = view;
            this.f16584n = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.J0(this.f16583m, this.f16584n, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f16565i != null) {
                BottomSheetBehavior.this.f16565i.W(fFloatValue);
            }
        }
    }

    class c implements n.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16587a;

        c(boolean z6) {
            this.f16587a = z6;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.n.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public U a(View view, U u6, n.e eVar) {
            boolean z6;
            androidx.core.graphics.b bVarF = u6.f(U.m.f());
            androidx.core.graphics.b bVarF2 = u6.f(U.m.c());
            BottomSheetBehavior.this.f16579w = bVarF.f7121b;
            boolean zE = n.e(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f16571o) {
                BottomSheetBehavior.this.f16578v = u6.i();
                paddingBottom = eVar.f17042d + BottomSheetBehavior.this.f16578v;
            }
            if (BottomSheetBehavior.this.f16572p) {
                paddingLeft = (zE ? eVar.f17041c : eVar.f17039a) + bVarF.f7120a;
            }
            if (BottomSheetBehavior.this.f16573q) {
                paddingRight = (zE ? eVar.f17039a : eVar.f17041c) + bVarF.f7122c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z7 = true;
            if (BottomSheetBehavior.this.f16575s) {
                int i7 = marginLayoutParams.leftMargin;
                int i8 = bVarF.f7120a;
                if (i7 != i8) {
                    marginLayoutParams.leftMargin = i8;
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (BottomSheetBehavior.this.f16576t) {
                int i9 = marginLayoutParams.rightMargin;
                int i10 = bVarF.f7122c;
                if (i9 != i10) {
                    marginLayoutParams.rightMargin = i10;
                    z6 = true;
                }
            }
            if (BottomSheetBehavior.this.f16577u) {
                int i11 = marginLayoutParams.topMargin;
                int i12 = bVarF.f7121b;
                if (i11 != i12) {
                    marginLayoutParams.topMargin = i12;
                } else {
                    z7 = z6;
                }
            }
            if (z7) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f16587a) {
                BottomSheetBehavior.this.f16569m = bVarF2.f7123d;
            }
            if (BottomSheetBehavior.this.f16571o || this.f16587a) {
                BottomSheetBehavior.this.N0(false);
            }
            return u6;
        }
    }

    class d extends c.AbstractC0002c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f16589a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f16546S + bottomSheetBehavior.f0()) / 2;
        }

        @Override // A.c.AbstractC0002c
        public int a(View view, int i7, int i8) {
            return view.getLeft();
        }

        @Override // A.c.AbstractC0002c
        public int b(View view, int i7, int i8) {
            int iF0 = BottomSheetBehavior.this.f0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return AbstractC2173a.b(i7, iF0, bottomSheetBehavior.f16535H ? bottomSheetBehavior.f16546S : bottomSheetBehavior.f16533F);
        }

        @Override // A.c.AbstractC0002c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f16535H ? bottomSheetBehavior.f16546S : bottomSheetBehavior.f16533F;
        }

        @Override // A.c.AbstractC0002c
        public void j(int i7) {
            if (i7 == 1 && BottomSheetBehavior.this.f16537J) {
                BottomSheetBehavior.this.C0(1);
            }
        }

        @Override // A.c.AbstractC0002c
        public void k(View view, int i7, int i8, int i9, int i10) {
            BottomSheetBehavior.this.c0(i8);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // A.c.AbstractC0002c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void l(View view, float f7, float f8) {
            int i7 = 6;
            if (f8 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f16535H && bottomSheetBehavior.G0(view, f8)) {
                    if ((Math.abs(f7) < Math.abs(f8) && f8 > 500.0f) || n(view)) {
                        i7 = 5;
                    } else if (BottomSheetBehavior.this.f16556b || Math.abs(view.getTop() - BottomSheetBehavior.this.f0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f16531D)) {
                    }
                } else if (f8 == 0.0f || Math.abs(f7) > Math.abs(f8)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f16556b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i8 = bottomSheetBehavior2.f16531D;
                        if (top < i8) {
                            if (top >= Math.abs(top - bottomSheetBehavior2.f16533F)) {
                                if (BottomSheetBehavior.this.H0()) {
                                }
                            }
                        } else if (Math.abs(top - i8) >= Math.abs(top - BottomSheetBehavior.this.f16533F) || BottomSheetBehavior.this.H0()) {
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f16530C) < Math.abs(top - BottomSheetBehavior.this.f16533F)) {
                    }
                } else if (!BottomSheetBehavior.this.f16556b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.f16531D) >= Math.abs(top2 - BottomSheetBehavior.this.f16533F) || BottomSheetBehavior.this.H0()) {
                    }
                }
            } else if (BottomSheetBehavior.this.f16556b) {
                i7 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f16589a;
                if (BottomSheetBehavior.this.H0()) {
                    if (!BottomSheetBehavior.this.E0(jCurrentTimeMillis, (top3 * 100.0f) / r10.f16546S)) {
                        i7 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.f16531D) {
                }
                i7 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
            bottomSheetBehavior3.J0(view, i7, bottomSheetBehavior3.I0());
        }

        @Override // A.c.AbstractC0002c
        public boolean m(View view, int i7) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i8 = bottomSheetBehavior.f16538K;
            if (i8 == 1 || bottomSheetBehavior.f16553Z) {
                return false;
            }
            if (i8 == 3 && bottomSheetBehavior.f16551X == i7) {
                WeakReference weakReference = bottomSheetBehavior.f16548U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f16589a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f16547T;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16591a;

        e(int i7) {
            this.f16591a = i7;
        }

        @Override // androidx.core.view.accessibility.F
        public boolean a(View view, F.a aVar) {
            BottomSheetBehavior.this.B0(this.f16591a);
            return true;
        }
    }

    protected static class f extends AbstractC2252a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final int f16593o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f16594p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f16595q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f16596r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        boolean f16597s;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i7) {
                return new f[i7];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16593o = parcel.readInt();
            this.f16594p = parcel.readInt();
            this.f16595q = parcel.readInt() == 1;
            this.f16596r = parcel.readInt() == 1;
            this.f16597s = parcel.readInt() == 1;
        }

        @Override // z.AbstractC2252a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f16593o);
            parcel.writeInt(this.f16594p);
            parcel.writeInt(this.f16595q ? 1 : 0);
            parcel.writeInt(this.f16596r ? 1 : 0);
            parcel.writeInt(this.f16597s ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f16593o = bottomSheetBehavior.f16538K;
            this.f16594p = bottomSheetBehavior.f16561e;
            this.f16595q = bottomSheetBehavior.f16556b;
            this.f16596r = bottomSheetBehavior.f16535H;
            this.f16597s = bottomSheetBehavior.f16536I;
        }
    }

    private class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f16600c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f16599b = false;
                A.c cVar = BottomSheetBehavior.this.f16540M;
                if (cVar != null && cVar.m(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f16598a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f16538K == 2) {
                    bottomSheetBehavior.C0(gVar2.f16598a);
                }
            }
        }

        private g() {
            this.f16600c = new a();
        }

        void c(int i7) {
            WeakReference weakReference = BottomSheetBehavior.this.f16547T;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f16598a = i7;
            if (this.f16599b) {
                return;
            }
            H.h0((View) BottomSheetBehavior.this.f16547T.get(), this.f16600c);
            this.f16599b = true;
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior() {
        this.f16554a = 0;
        this.f16556b = true;
        this.f16558c = false;
        this.f16567k = -1;
        this.f16568l = -1;
        this.f16582z = new g(this, null);
        this.f16532E = 0.5f;
        this.f16534G = -1.0f;
        this.f16537J = true;
        this.f16538K = 4;
        this.f16539L = 4;
        this.f16549V = new ArrayList();
        this.f16557b0 = -1;
        this.f16559c0 = new d();
    }

    private void D0(View view) {
        boolean z6 = (Build.VERSION.SDK_INT < 29 || i0() || this.f16562f) ? false : true;
        if (this.f16571o || this.f16572p || this.f16573q || this.f16575s || this.f16576t || this.f16577u || z6) {
            n.a(view, new c(z6));
        }
    }

    private boolean F0() {
        return this.f16540M != null && (this.f16537J || this.f16538K == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0(View view, int i7, boolean z6) {
        int iG0 = g0(i7);
        A.c cVar = this.f16540M;
        if (cVar == null || (!z6 ? cVar.Q(view, view.getLeft(), iG0) : cVar.O(view.getLeft(), iG0))) {
            C0(i7);
            return;
        }
        C0(2);
        L0(i7);
        this.f16582z.c(i7);
    }

    private void K0() {
        View view;
        int i7;
        C.a aVar;
        WeakReference weakReference = this.f16547T;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        H.j0(view, 524288);
        H.j0(view, 262144);
        H.j0(view, 1048576);
        int i8 = this.f16557b0;
        if (i8 != -1) {
            H.j0(view, i8);
        }
        if (!this.f16556b && this.f16538K != 6) {
            this.f16557b0 = V(view, h.f241a, 6);
        }
        if (this.f16535H && this.f16538K != 5) {
            l0(view, C.a.f7384y, 5);
        }
        int i9 = this.f16538K;
        if (i9 == 3) {
            i7 = this.f16556b ? 4 : 6;
            aVar = C.a.f7383x;
        } else {
            if (i9 != 4) {
                if (i9 != 6) {
                    return;
                }
                l0(view, C.a.f7383x, 4);
                l0(view, C.a.f7382w, 3);
                return;
            }
            i7 = this.f16556b ? 3 : 6;
            aVar = C.a.f7382w;
        }
        l0(view, aVar, i7);
    }

    private void L0(int i7) {
        ValueAnimator valueAnimator;
        if (i7 == 2) {
            return;
        }
        boolean z6 = i7 == 3;
        if (this.f16581y != z6) {
            this.f16581y = z6;
            if (this.f16565i == null || (valueAnimator = this.f16528A) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f16528A.reverse();
                return;
            }
            float f7 = z6 ? 0.0f : 1.0f;
            this.f16528A.setFloatValues(1.0f - f7, f7);
            this.f16528A.start();
        }
    }

    private void M0(boolean z6) {
        Map map;
        int iIntValue;
        WeakReference weakReference = this.f16547T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f16555a0 != null) {
                    return;
                } else {
                    this.f16555a0 = new HashMap(childCount);
                }
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (childAt != this.f16547T.get()) {
                    if (z6) {
                        this.f16555a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f16558c) {
                            iIntValue = 4;
                            H.z0(childAt, iIntValue);
                        }
                    } else if (this.f16558c && (map = this.f16555a0) != null && map.containsKey(childAt)) {
                        iIntValue = ((Integer) this.f16555a0.get(childAt)).intValue();
                        H.z0(childAt, iIntValue);
                    }
                }
            }
            if (!z6) {
                this.f16555a0 = null;
            } else if (this.f16558c) {
                ((View) this.f16547T.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(boolean z6) {
        View view;
        if (this.f16547T != null) {
            W();
            if (this.f16538K != 4 || (view = (View) this.f16547T.get()) == null) {
                return;
            }
            if (z6) {
                B0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private int V(View view, int i7, int i8) {
        return H.c(view, view.getResources().getString(i7), Z(i8));
    }

    private void W() {
        int iY = Y();
        if (this.f16556b) {
            this.f16533F = Math.max(this.f16546S - iY, this.f16530C);
        } else {
            this.f16533F = this.f16546S - iY;
        }
    }

    private void X() {
        this.f16531D = (int) (this.f16546S * (1.0f - this.f16532E));
    }

    private int Y() {
        int i7;
        return this.f16562f ? Math.min(Math.max(this.f16563g, this.f16546S - ((this.f16545R * 9) / 16)), this.f16544Q) + this.f16578v : (this.f16570n || this.f16571o || (i7 = this.f16569m) <= 0) ? this.f16561e + this.f16578v : Math.max(this.f16561e, i7 + this.f16564h);
    }

    private F Z(int i7) {
        return new e(i7);
    }

    private void a0(Context context) {
        if (this.f16580x == null) {
            return;
        }
        N3.g gVar = new N3.g(this.f16580x);
        this.f16565i = gVar;
        gVar.L(context);
        ColorStateList colorStateList = this.f16566j;
        if (colorStateList != null) {
            this.f16565i.V(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f16565i.setTint(typedValue.data);
    }

    private void b0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f16528A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f16528A.addUpdateListener(new b());
    }

    private int e0(int i7, int i8, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i8, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), 1073741824);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    private int g0(int i7) {
        if (i7 == 3) {
            return f0();
        }
        if (i7 == 4) {
            return this.f16533F;
        }
        if (i7 == 5) {
            return this.f16546S;
        }
        if (i7 == 6) {
            return this.f16531D;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i7);
    }

    private float h0() {
        VelocityTracker velocityTracker = this.f16550W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f16560d);
        return this.f16550W.getYVelocity(this.f16551X);
    }

    private boolean j0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && H.S(view);
    }

    private void l0(View view, C.a aVar, int i7) {
        H.l0(view, aVar, null, Z(i7));
    }

    private void m0() {
        this.f16551X = -1;
        VelocityTracker velocityTracker = this.f16550W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16550W = null;
        }
    }

    private void n0(f fVar) {
        int i7 = this.f16554a;
        if (i7 == 0) {
            return;
        }
        if (i7 == -1 || (i7 & 1) == 1) {
            this.f16561e = fVar.f16594p;
        }
        if (i7 == -1 || (i7 & 2) == 2) {
            this.f16556b = fVar.f16595q;
        }
        if (i7 == -1 || (i7 & 4) == 4) {
            this.f16535H = fVar.f16596r;
        }
        if (i7 == -1 || (i7 & 8) == 8) {
            this.f16536I = fVar.f16597s;
        }
    }

    private void o0(View view, Runnable runnable) {
        if (j0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
        this.f16542O = 0;
        this.f16543P = false;
        return (i7 & 2) != 0;
    }

    public void A0(boolean z6) {
        this.f16536I = z6;
    }

    public void B0(int i7) {
        if (i7 == 1 || i7 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i7 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f16535H && i7 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i7);
            return;
        }
        int i8 = (i7 == 6 && this.f16556b && g0(i7) <= this.f16530C) ? 3 : i7;
        WeakReference weakReference = this.f16547T;
        if (weakReference == null || weakReference.get() == null) {
            C0(i7);
        } else {
            View view = (View) this.f16547T.get();
            o0(view, new a(view, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i7) {
        WeakReference weakReference;
        int i8 = 3;
        if (view.getTop() == f0()) {
            C0(3);
            return;
        }
        if (!k0() || ((weakReference = this.f16548U) != null && view2 == weakReference.get() && this.f16543P)) {
            if (this.f16542O > 0) {
                if (!this.f16556b && view.getTop() > this.f16531D) {
                    i8 = 6;
                }
            } else if (this.f16535H && G0(view, h0())) {
                i8 = 5;
            } else if (this.f16542O == 0) {
                int top = view.getTop();
                if (!this.f16556b) {
                    int i9 = this.f16531D;
                    if (top < i9) {
                        if (top >= Math.abs(top - this.f16533F)) {
                            if (H0()) {
                            }
                        }
                    } else if (Math.abs(top - i9) < Math.abs(top - this.f16533F)) {
                    }
                } else if (Math.abs(top - this.f16530C) >= Math.abs(top - this.f16533F)) {
                    i8 = 4;
                }
            } else {
                if (!this.f16556b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f16531D) < Math.abs(top2 - this.f16533F)) {
                    }
                }
                i8 = 4;
            }
            J0(view, i8, false);
            this.f16543P = false;
        }
    }

    void C0(int i7) {
        if (this.f16538K == i7) {
            return;
        }
        this.f16538K = i7;
        if (i7 == 4 || i7 == 3 || i7 == 6 || (this.f16535H && i7 == 5)) {
            this.f16539L = i7;
        }
        WeakReference weakReference = this.f16547T;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i7 == 3) {
            M0(true);
        } else if (i7 == 6 || i7 == 5 || i7 == 4) {
            M0(false);
        }
        L0(i7);
        if (this.f16549V.size() <= 0) {
            K0();
        } else {
            y.a(this.f16549V.get(0));
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f16538K == 1 && actionMasked == 0) {
            return true;
        }
        if (F0()) {
            this.f16540M.F(motionEvent);
        }
        if (actionMasked == 0) {
            m0();
        }
        if (this.f16550W == null) {
            this.f16550W = VelocityTracker.obtain();
        }
        this.f16550W.addMovement(motionEvent);
        if (F0() && actionMasked == 2 && !this.f16541N && Math.abs(this.f16552Y - motionEvent.getY()) > this.f16540M.z()) {
            this.f16540M.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f16541N;
    }

    public boolean E0(long j7, float f7) {
        return false;
    }

    boolean G0(View view, float f7) {
        if (this.f16536I) {
            return true;
        }
        if (view.getTop() < this.f16533F) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f7 * 0.1f)) - ((float) this.f16533F)) / ((float) Y()) > 0.5f;
    }

    public boolean H0() {
        return false;
    }

    public boolean I0() {
        return true;
    }

    void c0(int i7) {
        if (((View) this.f16547T.get()) == null || this.f16549V.isEmpty()) {
            return;
        }
        int i8 = this.f16533F;
        if (i7 <= i8 && i8 != f0()) {
            f0();
        }
        if (this.f16549V.size() <= 0) {
            return;
        }
        y.a(this.f16549V.get(0));
        throw null;
    }

    View d0(View view) {
        if (H.U(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View viewD0 = d0(viewGroup.getChildAt(i7));
            if (viewD0 != null) {
                return viewD0;
            }
        }
        return null;
    }

    public int f0() {
        if (this.f16556b) {
            return this.f16530C;
        }
        return Math.max(this.f16529B, this.f16574r ? 0 : this.f16579w);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f16547T = null;
        this.f16540M = null;
    }

    public boolean i0() {
        return this.f16570n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f16547T = null;
        this.f16540M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        A.c cVar;
        if (!view.isShown() || !this.f16537J) {
            this.f16541N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m0();
        }
        if (this.f16550W == null) {
            this.f16550W = VelocityTracker.obtain();
        }
        this.f16550W.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x6 = (int) motionEvent.getX();
            this.f16552Y = (int) motionEvent.getY();
            if (this.f16538K != 2) {
                WeakReference weakReference = this.f16548U;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.C(view2, x6, this.f16552Y)) {
                    this.f16551X = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f16553Z = true;
                }
            }
            this.f16541N = this.f16551X == -1 && !coordinatorLayout.C(view, x6, this.f16552Y);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16553Z = false;
            this.f16551X = -1;
            if (this.f16541N) {
                this.f16541N = false;
                return false;
            }
        }
        if (!this.f16541N && (cVar = this.f16540M) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f16548U;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f16541N || this.f16538K == 1 || coordinatorLayout.C(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f16540M == null || Math.abs(((float) this.f16552Y) - motionEvent.getY()) <= ((float) this.f16540M.z())) ? false : true;
    }

    public boolean k0() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
        int iF0;
        if (H.y(coordinatorLayout) && !H.y(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f16547T == null) {
            this.f16563g = coordinatorLayout.getResources().getDimensionPixelSize(A3.c.f150b);
            D0(view);
            this.f16547T = new WeakReference(view);
            N3.g gVar = this.f16565i;
            if (gVar != null) {
                H.t0(view, gVar);
                N3.g gVar2 = this.f16565i;
                float fW = this.f16534G;
                if (fW == -1.0f) {
                    fW = H.w(view);
                }
                gVar2.U(fW);
                boolean z6 = this.f16538K == 3;
                this.f16581y = z6;
                this.f16565i.W(z6 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f16566j;
                if (colorStateList != null) {
                    H.u0(view, colorStateList);
                }
            }
            K0();
            if (H.z(view) == 0) {
                H.z0(view, 1);
            }
        }
        if (this.f16540M == null) {
            this.f16540M = A.c.o(coordinatorLayout, this.f16559c0);
        }
        int top = view.getTop();
        coordinatorLayout.K(view, i7);
        this.f16545R = coordinatorLayout.getWidth();
        this.f16546S = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f16544Q = height;
        int i8 = this.f16546S;
        int i9 = i8 - height;
        int i10 = this.f16579w;
        if (i9 < i10) {
            if (this.f16574r) {
                this.f16544Q = i8;
            } else {
                this.f16544Q = i8 - i10;
            }
        }
        this.f16530C = Math.max(0, i8 - this.f16544Q);
        X();
        W();
        int i11 = this.f16538K;
        if (i11 == 3) {
            iF0 = f0();
        } else if (i11 == 6) {
            iF0 = this.f16531D;
        } else if (this.f16535H && i11 == 5) {
            iF0 = this.f16546S;
        } else {
            if (i11 != 4) {
                if (i11 == 1 || i11 == 2) {
                    H.a0(view, top - view.getTop());
                }
                this.f16548U = new WeakReference(d0(view));
                if (this.f16549V.size() > 0) {
                    return true;
                }
                y.a(this.f16549V.get(0));
                throw null;
            }
            iF0 = this.f16533F;
        }
        H.a0(view, iF0);
        this.f16548U = new WeakReference(d0(view));
        if (this.f16549V.size() > 0) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(e0(i7, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, this.f16567k, marginLayoutParams.width), e0(i9, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, this.f16568l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f7, float f8) {
        WeakReference weakReference;
        if (k0() && (weakReference = this.f16548U) != null && view2 == weakReference.get()) {
            return this.f16538K != 3 || super.o(coordinatorLayout, view, view2, f7, f8);
        }
        return false;
    }

    public void p0(boolean z6) {
        this.f16537J = z6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int[] iArr, int i9) {
        int i10;
        if (i9 == 1) {
            return;
        }
        WeakReference weakReference = this.f16548U;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!k0() || view2 == view3) {
            int top = view.getTop();
            int i11 = top - i8;
            if (i8 > 0) {
                if (i11 < f0()) {
                    int iF0 = top - f0();
                    iArr[1] = iF0;
                    H.a0(view, -iF0);
                    i10 = 3;
                    C0(i10);
                } else {
                    if (!this.f16537J) {
                        return;
                    }
                    iArr[1] = i8;
                    H.a0(view, -i8);
                    C0(1);
                }
            } else if (i8 < 0 && !view2.canScrollVertically(-1)) {
                int i12 = this.f16533F;
                if (i11 > i12 && !this.f16535H) {
                    int i13 = top - i12;
                    iArr[1] = i13;
                    H.a0(view, -i13);
                    i10 = 4;
                    C0(i10);
                } else {
                    if (!this.f16537J) {
                        return;
                    }
                    iArr[1] = i8;
                    H.a0(view, -i8);
                    C0(1);
                }
            }
            c0(view.getTop());
            this.f16542O = i8;
            this.f16543P = true;
        }
    }

    public void q0(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f16529B = i7;
    }

    public void r0(boolean z6) {
        if (this.f16556b == z6) {
            return;
        }
        this.f16556b = z6;
        if (this.f16547T != null) {
            W();
        }
        C0((this.f16556b && this.f16538K == 6) ? 3 : this.f16538K);
        K0();
    }

    public void s0(boolean z6) {
        this.f16570n = z6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
    }

    public void t0(float f7) {
        if (f7 <= 0.0f || f7 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f16532E = f7;
        if (this.f16547T != null) {
            X();
        }
    }

    public void u0(boolean z6) {
        if (this.f16535H != z6) {
            this.f16535H = z6;
            if (!z6 && this.f16538K == 5) {
                B0(4);
            }
            K0();
        }
    }

    public void v0(int i7) {
        this.f16568l = i7;
    }

    public void w0(int i7) {
        this.f16567k = i7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        n0(fVar);
        int i7 = fVar.f16593o;
        if (i7 == 1 || i7 == 2) {
            i7 = 4;
        }
        this.f16538K = i7;
        this.f16539L = i7;
    }

    public void x0(int i7) {
        y0(i7, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    public final void y0(int i7, boolean z6) {
        if (i7 == -1) {
            if (this.f16562f) {
                return;
            } else {
                this.f16562f = true;
            }
        } else {
            if (!this.f16562f && this.f16561e == i7) {
                return;
            }
            this.f16562f = false;
            this.f16561e = Math.max(0, i7);
        }
        N0(z6);
    }

    public void z0(int i7) {
        this.f16554a = i7;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i7;
        super(context, attributeSet);
        this.f16554a = 0;
        this.f16556b = true;
        this.f16558c = false;
        this.f16567k = -1;
        this.f16568l = -1;
        this.f16582z = new g(this, null);
        this.f16532E = 0.5f;
        this.f16534G = -1.0f;
        this.f16537J = true;
        this.f16538K = 4;
        this.f16539L = 4;
        this.f16549V = new ArrayList();
        this.f16557b0 = -1;
        this.f16559c0 = new d();
        this.f16564h = context.getResources().getDimensionPixelSize(A3.c.f142J);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f323H);
        if (typedArrayObtainStyledAttributes.hasValue(j.f351L)) {
            this.f16566j = K3.c.a(context, typedArrayObtainStyledAttributes, j.f351L);
        }
        if (typedArrayObtainStyledAttributes.hasValue(j.f473c0)) {
            this.f16580x = k.e(context, attributeSet, A3.a.f103c, f16527d0).m();
        }
        a0(context);
        b0();
        this.f16534G = typedArrayObtainStyledAttributes.getDimension(j.f344K, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(j.f330I)) {
            w0(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f330I, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(j.f337J)) {
            v0(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f337J, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(j.f393R);
        x0((typedValuePeekValue == null || (i7 = typedValuePeekValue.data) != -1) ? typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f393R, -1) : i7);
        u0(typedArrayObtainStyledAttributes.getBoolean(j.f386Q, false));
        s0(typedArrayObtainStyledAttributes.getBoolean(j.f414U, false));
        r0(typedArrayObtainStyledAttributes.getBoolean(j.f372O, true));
        A0(typedArrayObtainStyledAttributes.getBoolean(j.f407T, false));
        p0(typedArrayObtainStyledAttributes.getBoolean(j.f358M, true));
        z0(typedArrayObtainStyledAttributes.getInt(j.f400S, 0));
        t0(typedArrayObtainStyledAttributes.getFloat(j.f379P, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(j.f365N);
        q0((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f365N, 0) : typedValuePeekValue2.data);
        this.f16571o = typedArrayObtainStyledAttributes.getBoolean(j.f442Y, false);
        this.f16572p = typedArrayObtainStyledAttributes.getBoolean(j.f449Z, false);
        this.f16573q = typedArrayObtainStyledAttributes.getBoolean(j.f457a0, false);
        this.f16574r = typedArrayObtainStyledAttributes.getBoolean(j.f465b0, true);
        this.f16575s = typedArrayObtainStyledAttributes.getBoolean(j.f421V, false);
        this.f16576t = typedArrayObtainStyledAttributes.getBoolean(j.f428W, false);
        this.f16577u = typedArrayObtainStyledAttributes.getBoolean(j.f435X, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f16560d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
