package com.google.android.material.appbar;

import A3.i;
import A3.j;
import N3.g;
import N3.h;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.appcompat.app.y;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.InterfaceC0603x;
import androidx.core.view.U;
import androidx.core.view.accessibility.C;
import androidx.core.view.accessibility.F;
import com.google.android.material.internal.l;
import f.AbstractC1641a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.AbstractC2173a;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int f16417F = i.f259c;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ValueAnimator f16418A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final List f16419B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int[] f16420C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Drawable f16421D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private Behavior f16422E;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16424n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f16425o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f16426p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16427q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16428r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private U f16429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f16430t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f16431u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f16432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f16433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f16434x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f16435y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private WeakReference f16436z;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.b {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f16437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f16438l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ValueAnimator f16439m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private e f16440n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private WeakReference f16441o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f16442p;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f16443a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f16444b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f16443a = coordinatorLayout;
                this.f16444b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f16443a, this.f16444b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends C0574a {
            b() {
            }

            @Override // androidx.core.view.C0574a
            public void g(View view, C c7) {
                super.g(view, c7);
                c7.B0(BaseBehavior.this.f16442p);
                c7.g0(ScrollView.class.getName());
            }
        }

        class c implements F {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f16447a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f16448b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f16449c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f16450d;

            c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7) {
                this.f16447a = coordinatorLayout;
                this.f16448b = appBarLayout;
                this.f16449c = view;
                this.f16450d = i7;
            }

            @Override // androidx.core.view.accessibility.F
            public boolean a(View view, F.a aVar) {
                BaseBehavior.this.q(this.f16447a, this.f16448b, this.f16449c, 0, this.f16450d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class d implements F {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f16452a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f16453b;

            d(AppBarLayout appBarLayout, boolean z6) {
                this.f16452a = appBarLayout;
                this.f16453b = z6;
            }

            @Override // androidx.core.view.accessibility.F
            public boolean a(View view, F.a aVar) {
                this.f16452a.setExpanded(this.f16453b);
                return true;
            }
        }

        protected static class e extends AbstractC2252a {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            boolean f16455o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            boolean f16456p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f16457q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            float f16458r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            boolean f16459s;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel) {
                    return new e(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public e[] newArray(int i7) {
                    return new e[i7];
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f16455o = parcel.readByte() != 0;
                this.f16456p = parcel.readByte() != 0;
                this.f16457q = parcel.readInt();
                this.f16458r = parcel.readFloat();
                this.f16459s = parcel.readByte() != 0;
            }

            @Override // z.AbstractC2252a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i7) {
                super.writeToParcel(parcel, i7);
                parcel.writeByte(this.f16455o ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f16456p ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f16457q);
                parcel.writeFloat(this.f16458r);
                parcel.writeByte(this.f16459s ? (byte) 1 : (byte) 0);
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }
        }

        public BaseBehavior() {
        }

        private boolean T(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            boolean z6 = false;
            if (M() != (-appBarLayout.getTotalScrollRange())) {
                U(coordinatorLayout, appBarLayout, C.a.f7376q, false);
                z6 = true;
            }
            if (M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    U(coordinatorLayout, appBarLayout, C.a.f7377r, true);
                    return true;
                }
                int i7 = -appBarLayout.getDownNestedPreScrollRange();
                if (i7 != 0) {
                    H.l0(coordinatorLayout, C.a.f7377r, null, new c(coordinatorLayout, appBarLayout, view, i7));
                    return true;
                }
            }
            return z6;
        }

        private void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, C.a aVar, boolean z6) {
            H.l0(coordinatorLayout, aVar, null, new d(appBarLayout, z6));
        }

        private void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, float f7) {
            int iAbs = Math.abs(M() - i7);
            float fAbs = Math.abs(f7);
            W(coordinatorLayout, appBarLayout, i7, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8) {
            int iM = M();
            if (iM == i7) {
                ValueAnimator valueAnimator = this.f16439m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f16439m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f16439m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f16439m = valueAnimator3;
                valueAnimator3.setInterpolator(B3.a.f743e);
                this.f16439m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f16439m.setDuration(Math.min(i8, 600));
            this.f16439m.setIntValues(iM, i7);
            this.f16439m.start();
        }

        private int X(int i7, int i8, int i9) {
            return i7 < (i8 + i9) / 2 ? i8 : i9;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.j() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean a0(int i7, int i8) {
            return (i7 & i8) == i8;
        }

        private boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                if (((e) appBarLayout.getChildAt(i7).getLayoutParams()).f16465a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if ((childAt instanceof InterfaceC0603x) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i7) {
            int iAbs = Math.abs(i7);
            int childCount = appBarLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = appBarLayout.getChildAt(i8);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(AppBarLayout appBarLayout, int i7) {
            int childCount = appBarLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = appBarLayout.getChildAt(i8);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (a0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i9 = -i7;
                if (top <= i9 && bottom >= i9) {
                    return i8;
                }
            }
            return -1;
        }

        private View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i7) {
            int iAbs = Math.abs(i7);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i8);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator interpolatorD = eVar.d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i8++;
                } else if (interpolatorD != null) {
                    int iC = eVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= H.C(childAt);
                        }
                    }
                    if (H.y(childAt)) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f7 = topInset;
                        return Integer.signum(i7) * (childAt.getTop() + Math.round(f7 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f7)));
                    }
                }
            }
            return i7;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listT = coordinatorLayout.t(appBarLayout);
            int size = listT.size();
            for (int i7 = 0; i7 < size; i7++) {
                CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) ((View) listT.get(i7)).getLayoutParams()).e();
                if (cVarE instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarE).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(appBarLayout, iM);
            if (iE0 >= 0) {
                View childAt = appBarLayout.getChildAt(iE0);
                e eVar = (e) childAt.getLayoutParams();
                int iC = eVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iC2 = -childAt.getBottom();
                    if (iE0 == 0 && H.y(appBarLayout) && H.y(childAt)) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        iC2 += H.C(childAt);
                    } else if (a0(iC, 5)) {
                        int iC3 = H.C(childAt) + iC2;
                        if (iM < iC3) {
                            topInset2 = iC3;
                        } else {
                            iC2 = iC3;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) eVar).topMargin;
                        iC2 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    V(coordinatorLayout, appBarLayout, AbstractC2173a.b(X(iM, iC2, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View viewF0;
            H.j0(coordinatorLayout, C.a.f7376q.b());
            H.j0(coordinatorLayout, C.a.f7377r.b());
            if (appBarLayout.getTotalScrollRange() == 0 || (viewF0 = f0(coordinatorLayout)) == null || !b0(appBarLayout)) {
                return;
            }
            if (!H.N(coordinatorLayout)) {
                H.p0(coordinatorLayout, new b());
            }
            this.f16442p = T(coordinatorLayout, appBarLayout, viewF0);
        }

        private void y0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8, boolean z6) {
            View viewD0 = d0(appBarLayout, i7);
            boolean zV = false;
            if (viewD0 != null) {
                int iC = ((e) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int iC2 = H.C(viewD0);
                    if (i8 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i7) < (viewD0.getBottom() - iC2) - appBarLayout.getTopInset()) : (-i7) >= (viewD0.getBottom() - iC2) - appBarLayout.getTopInset()) {
                        zV = true;
                    }
                }
            }
            if (appBarLayout.l()) {
                zV = appBarLayout.v(c0(coordinatorLayout));
            }
            boolean zS = appBarLayout.s(zV);
            if (z6 || (zS && v0(coordinatorLayout, appBarLayout))) {
                appBarLayout.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.b
        int M() {
            return E() + this.f16437k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public boolean H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f16441o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
        public int K(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
        public int L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(c0(coordinatorLayout)));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7) {
            int i8;
            boolean zL = super.l(coordinatorLayout, appBarLayout, i7);
            int pendingAction = appBarLayout.getPendingAction();
            e eVar = this.f16440n;
            if (eVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z6 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        i8 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z6) {
                            V(coordinatorLayout, appBarLayout, i8, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, i8);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z6) {
                            V(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (eVar.f16455o) {
                i8 = -appBarLayout.getTotalScrollRange();
                P(coordinatorLayout, appBarLayout, i8);
            } else if (!eVar.f16456p) {
                View childAt = appBarLayout.getChildAt(eVar.f16457q);
                P(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f16440n.f16459s ? H.C(childAt) + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f16440n.f16458r)));
            }
            appBarLayout.o();
            this.f16440n = null;
            G(AbstractC2173a.b(E(), -appBarLayout.getTotalScrollRange(), 0));
            y0(coordinatorLayout, appBarLayout, E(), 0, true);
            appBarLayout.m(E());
            x0(coordinatorLayout, appBarLayout);
            return zL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8, int i9, int i10) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i7, i8, i9, i10);
            }
            coordinatorLayout.L(appBarLayout, i7, i8, View.MeasureSpec.makeMeasureSpec(0, 0), i10);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
        public void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int[] iArr, int i9) {
            int i10;
            int downNestedPreScrollRange;
            if (i8 != 0) {
                if (i8 < 0) {
                    i10 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i10;
                } else {
                    i10 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i11 = i10;
                int i12 = downNestedPreScrollRange;
                if (i11 != i12) {
                    iArr[1] = O(coordinatorLayout, appBarLayout, i8, i11, i12);
                }
            }
            if (appBarLayout.l()) {
                appBarLayout.s(appBarLayout.v(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            if (i10 < 0) {
                iArr[1] = O(coordinatorLayout, appBarLayout, i10, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i10 == 0) {
                x0(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof e) {
                s0((e) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f16440n.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f16440n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            e eVarT0 = t0(parcelableY, appBarLayout);
            return eVarT0 == null ? parcelableY : eVarT0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i7, int i8) {
            ValueAnimator valueAnimator;
            boolean z6 = (i7 & 2) != 0 && (appBarLayout.l() || Z(coordinatorLayout, appBarLayout, view));
            if (z6 && (valueAnimator = this.f16439m) != null) {
                valueAnimator.cancel();
            }
            this.f16441o = null;
            this.f16438l = i8;
            return z6;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7) {
            if (this.f16438l == 0 || i7 == 1) {
                w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
            this.f16441o = new WeakReference(view);
        }

        void s0(e eVar, boolean z6) {
            if (this.f16440n == null || z6) {
                this.f16440n = eVar;
            }
        }

        e t0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iE = E();
            int childCount = appBarLayout.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = appBarLayout.getChildAt(i7);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC2252a.f23232n;
                    }
                    e eVar = new e(parcelable);
                    boolean z6 = iE == 0;
                    eVar.f16456p = z6;
                    eVar.f16455o = !z6 && (-iE) >= appBarLayout.getTotalScrollRange();
                    eVar.f16457q = i7;
                    eVar.f16459s = bottom == H.C(childAt) + appBarLayout.getTopInset();
                    eVar.f16458r = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
        public int Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8, int i9) {
            int iM = M();
            int i10 = 0;
            if (i8 == 0 || iM < i8 || iM > i9) {
                this.f16437k = 0;
            } else {
                int iB = AbstractC2173a.b(i7, i8, i9);
                if (iM != iB) {
                    int iI0 = appBarLayout.h() ? i0(appBarLayout, iB) : iB;
                    boolean zG = G(iI0);
                    int i11 = iM - iB;
                    this.f16437k = iB - iI0;
                    if (zG) {
                        while (i10 < appBarLayout.getChildCount()) {
                            e eVar = (e) appBarLayout.getChildAt(i10).getLayoutParams();
                            c cVarB = eVar.b();
                            if (cVarB != null && (eVar.c() & 1) != 0) {
                                cVarB.a(appBarLayout, appBarLayout.getChildAt(i10), E());
                            }
                            i10++;
                        }
                    }
                    if (!zG && appBarLayout.h()) {
                        coordinatorLayout.h(appBarLayout);
                    }
                    appBarLayout.m(E());
                    y0(coordinatorLayout, appBarLayout, iB, iB < iM ? -1 : 1, false);
                    i10 = i11;
                }
            }
            x0(coordinatorLayout, appBarLayout);
            return i10;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.d
        public /* bridge */ /* synthetic */ boolean G(int i7) {
            return super.G(i7);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7) {
            return super.l(coordinatorLayout, appBarLayout, i7);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i7, int i8, int i9, int i10) {
            return super.m(coordinatorLayout, appBarLayout, i7, i8, i9, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int[] iArr, int i9) {
            super.q(coordinatorLayout, appBarLayout, view, i7, i8, iArr, i9);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i7, i8, i9, i10, i11, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i7, int i8) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i7, i8);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i7) {
            super.C(coordinatorLayout, appBarLayout, view, i7);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.c {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                return ((BaseBehavior) cVarE).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c cVarE = ((CoordinatorLayout.f) view2.getLayoutParams()).e();
            if (cVarE instanceof BaseBehavior) {
                H.a0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarE).f16437k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.c
        float J(View view) {
            int i7;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i7 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i7) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.c
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public AppBarLayout H(List list) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) list.get(i7);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                H.j0(coordinatorLayout, C.a.f7376q.b());
                H.j0(coordinatorLayout, C.a.f7377r.b());
                H.p0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
            return super.l(coordinatorLayout, view, i7);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
            return super.m(coordinatorLayout, view, i7, i8, i9, i10);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z6) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.s(view));
            if (appBarLayoutH != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f16485d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutH.p(false, !z6);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f461a4);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f469b4, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements androidx.core.view.C {
        a() {
        }

        @Override // androidx.core.view.C
        public U a(View view, U u6) {
            return AppBarLayout.this.n(u6);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f16461a;

        b(g gVar) {
            this.f16461a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f16461a.U(fFloatValue);
            if (AppBarLayout.this.f16421D instanceof g) {
                ((g) AppBarLayout.this.f16421D).U(fFloatValue);
            }
            Iterator it = AppBarLayout.this.f16419B.iterator();
            if (it.hasNext()) {
                y.a(it.next());
                this.f16461a.z();
                throw null;
            }
        }
    }

    public static abstract class c {
        public abstract void a(AppBarLayout appBarLayout, View view, float f7);
    }

    public static class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f16463a = new Rect();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f16464b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(AppBarLayout appBarLayout, View view, float f7) {
            b(this.f16463a, appBarLayout, view);
            float fAbs = this.f16463a.top - Math.abs(f7);
            if (fAbs > 0.0f) {
                H.w0(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float fA = 1.0f - AbstractC2173a.a(Math.abs(fAbs / this.f16463a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f16463a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f16464b);
            this.f16464b.offset(0, (int) (-fHeight));
            H.w0(view, this.f16464b);
        }
    }

    public static class e extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f16466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Interpolator f16467c;

        public e(int i7, int i8) {
            super(i7, i8);
            this.f16465a = 1;
        }

        private c a(int i7) {
            if (i7 != 1) {
                return null;
            }
            return new d();
        }

        public c b() {
            return this.f16466b;
        }

        public int c() {
            return this.f16465a;
        }

        public Interpolator d() {
            return this.f16467c;
        }

        boolean e() {
            int i7 = this.f16465a;
            return (i7 & 1) == 1 && (i7 & 10) != 0;
        }

        public void f(c cVar) {
            this.f16466b = cVar;
        }

        public void g(int i7) {
            this.f16465a = i7;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16465a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f610u);
            this.f16465a = typedArrayObtainStyledAttributes.getInt(j.f624w, 0);
            f(a(typedArrayObtainStyledAttributes.getInt(j.f617v, 0)));
            if (typedArrayObtainStyledAttributes.hasValue(j.f631x)) {
                this.f16467c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(j.f631x, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16465a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f16465a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16465a = 1;
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private void c() {
        WeakReference weakReference = this.f16436z;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f16436z = null;
    }

    private View d(View view) {
        int i7;
        if (this.f16436z == null && (i7 = this.f16435y) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i7) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f16435y);
            }
            if (viewFindViewById != null) {
                this.f16436z = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f16436z;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (((e) getChildAt(i7).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        Behavior behavior = this.f16422E;
        BaseBehavior.e eVarT0 = (behavior == null || this.f16424n == -1 || this.f16428r != 0) ? null : behavior.t0(AbstractC2252a.f23232n, this);
        this.f16424n = -1;
        this.f16425o = -1;
        this.f16426p = -1;
        if (eVarT0 != null) {
            this.f16422E.s0(eVarT0, false);
        }
    }

    private void q(boolean z6, boolean z7, boolean z8) {
        this.f16428r = (z6 ? 1 : 2) | (z7 ? 4 : 0) | (z8 ? 8 : 0);
        requestLayout();
    }

    private boolean r(boolean z6) {
        if (this.f16432v == z6) {
            return false;
        }
        this.f16432v = z6;
        refreshDrawableState();
        return true;
    }

    private boolean u() {
        return this.f16421D != null && getTopInset() > 0;
    }

    private boolean w() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || H.y(childAt)) ? false : true;
    }

    private void x(g gVar, boolean z6) {
        float dimension = getResources().getDimension(A3.c.f149a);
        float f7 = z6 ? 0.0f : dimension;
        if (!z6) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f16418A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, dimension);
        this.f16418A = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(A3.f.f221a));
        this.f16418A.setInterpolator(B3.a.f739a);
        this.f16418A.addUpdateListener(new b(gVar));
        this.f16418A.start();
    }

    private void y() {
        setWillNotDraw(!u());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (u()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f16423m);
            this.f16421D.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16421D;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new e((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.f16422E = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iC;
        int i7 = this.f16425o;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i9 = eVar.f16465a;
            if ((i9 & 5) != 5) {
                if (i8 > 0) {
                    break;
                }
            } else {
                int i10 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if ((i9 & 8) != 0) {
                    iC = H.C(childAt);
                } else if ((i9 & 2) != 0) {
                    iC = measuredHeight - H.C(childAt);
                } else {
                    iMin = i10 + measuredHeight;
                    if (childCount == 0 && H.y(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i8 += iMin;
                }
                iMin = i10 + iC;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i8 += iMin;
            }
        }
        int iMax = Math.max(0, i8);
        this.f16425o = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i7 = this.f16426p;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int iC = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            int i9 = eVar.f16465a;
            if ((i9 & 1) == 0) {
                break;
            }
            iC += measuredHeight;
            if ((i9 & 2) != 0) {
                iC -= H.C(childAt);
                break;
            }
            i8++;
        }
        int iMax = Math.max(0, iC);
        this.f16426p = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f16435y;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iC = H.C(this);
        if (iC == 0) {
            int childCount = getChildCount();
            iC = childCount >= 1 ? H.C(getChildAt(childCount - 1)) : 0;
            if (iC == 0) {
                return getHeight() / 3;
            }
        }
        return (iC * 2) + topInset;
    }

    int getPendingAction() {
        return this.f16428r;
    }

    public Drawable getStatusBarForeground() {
        return this.f16421D;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        U u6 = this.f16429s;
        if (u6 != null) {
            return u6.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i7 = this.f16424n;
        if (i7 != -1) {
            return i7;
        }
        int childCount = getChildCount();
        int i8 = 0;
        int iC = 0;
        while (true) {
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            e eVar = (e) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i9 = eVar.f16465a;
            if ((i9 & 1) == 0) {
                break;
            }
            iC += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
            if (i8 == 0 && H.y(childAt)) {
                iC -= getTopInset();
            }
            if ((i9 & 2) != 0) {
                iC -= H.C(childAt);
                break;
            }
            i8++;
        }
        int iMax = Math.max(0, iC);
        this.f16424n = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return this.f16427q;
    }

    boolean j() {
        return getTotalScrollRange() != 0;
    }

    public boolean l() {
        return this.f16434x;
    }

    void m(int i7) {
        this.f16423m = i7;
        if (!willNotDraw()) {
            H.g0(this);
        }
        List list = this.f16430t;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                y.a(this.f16430t.get(i8));
            }
        }
    }

    U n(U u6) {
        U u7 = H.y(this) ? u6 : null;
        if (!androidx.core.util.b.a(this.f16429s, u7)) {
            this.f16429s = u7;
            y();
            requestLayout();
        }
        return u6;
    }

    void o() {
        this.f16428r = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i7) {
        if (this.f16420C == null) {
            this.f16420C = new int[4];
        }
        int[] iArr = this.f16420C;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + iArr.length);
        boolean z6 = this.f16432v;
        int i8 = A3.a.f95A;
        if (!z6) {
            i8 = -i8;
        }
        iArr[0] = i8;
        iArr[1] = (z6 && this.f16433w) ? A3.a.f96B : -A3.a.f96B;
        int i9 = A3.a.f126z;
        if (!z6) {
            i9 = -i9;
        }
        iArr[2] = i9;
        iArr[3] = (z6 && this.f16433w) ? A3.a.f125y : -A3.a.f125y;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        boolean z7 = true;
        if (H.y(this) && w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                H.a0(getChildAt(childCount), topInset);
            }
        }
        k();
        this.f16427q = false;
        int childCount2 = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount2) {
                break;
            }
            if (((e) getChildAt(i11).getLayoutParams()).d() != null) {
                this.f16427q = true;
                break;
            }
            i11++;
        }
        Drawable drawable = this.f16421D;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f16431u) {
            return;
        }
        if (!this.f16434x && !i()) {
            z7 = false;
        }
        r(z7);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i8);
        if (mode != 1073741824 && H.y(this) && w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = AbstractC2173a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i8));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(boolean z6, boolean z7) {
        q(z6, z7, true);
    }

    boolean s(boolean z6) {
        return t(z6, !this.f16431u);
    }

    @Override // android.view.View
    public void setElevation(float f7) {
        super.setElevation(f7);
        h.d(this, f7);
    }

    public void setExpanded(boolean z6) {
        p(z6, H.T(this));
    }

    public void setLiftOnScroll(boolean z6) {
        this.f16434x = z6;
    }

    public void setLiftOnScrollTargetViewId(int i7) {
        this.f16435y = i7;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z6) {
        this.f16431u = z6;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i7) {
        if (i7 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i7);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f16421D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f16421D = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f16421D.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.g(this.f16421D, H.B(this));
                this.f16421D.setVisible(getVisibility() == 0, false);
                this.f16421D.setCallback(this);
            }
            y();
            H.g0(this);
        }
    }

    public void setStatusBarForegroundColor(int i7) {
        setStatusBarForeground(new ColorDrawable(i7));
    }

    public void setStatusBarForegroundResource(int i7) {
        setStatusBarForeground(AbstractC1641a.b(getContext(), i7));
    }

    @Deprecated
    public void setTargetElevation(float f7) {
        f.b(this, f7);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.f16421D;
        if (drawable != null) {
            drawable.setVisible(z6, false);
        }
    }

    boolean t(boolean z6, boolean z7) {
        if (!z7 || this.f16433w == z6) {
            return false;
        }
        this.f16433w = z6;
        refreshDrawableState();
        if (!this.f16434x || !(getBackground() instanceof g)) {
            return true;
        }
        x((g) getBackground(), z6);
        return true;
    }

    boolean v(View view) {
        View viewD = d(view);
        if (viewD != null) {
            view = viewD;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16421D;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f101a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16417F;
        super(O3.a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f16424n = -1;
        this.f16425o = -1;
        this.f16426p = -1;
        this.f16428r = 0;
        this.f16419B = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i9 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            f.a(this);
        }
        f.c(this, attributeSet, i7, i8);
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f536k, i7, i8, new int[0]);
        H.t0(this, typedArrayH.getDrawable(j.f544l));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            g gVar = new g();
            gVar.V(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.L(context2);
            H.t0(this, gVar);
        }
        if (typedArrayH.hasValue(j.f575p)) {
            q(typedArrayH.getBoolean(j.f575p, false), false, false);
        }
        if (typedArrayH.hasValue(j.f568o)) {
            f.b(this, typedArrayH.getDimensionPixelSize(j.f568o, 0));
        }
        if (i9 >= 26) {
            if (typedArrayH.hasValue(j.f560n)) {
                setKeyboardNavigationCluster(typedArrayH.getBoolean(j.f560n, false));
            }
            if (typedArrayH.hasValue(j.f552m)) {
                setTouchscreenBlocksFocus(typedArrayH.getBoolean(j.f552m, false));
            }
        }
        this.f16434x = typedArrayH.getBoolean(j.f582q, false);
        this.f16435y = typedArrayH.getResourceId(j.f589r, -1);
        setStatusBarForeground(typedArrayH.getDrawable(j.f596s));
        typedArrayH.recycle();
        H.C0(this, new a());
    }
}
