package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.A;
import androidx.core.view.AbstractC0595o;
import androidx.core.view.B;
import androidx.core.view.C;
import androidx.core.view.H;
import androidx.core.view.InterfaceC0605z;
import androidx.core.view.U;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t.AbstractC2053a;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0605z, A {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final String f6820F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static final Class[] f6821G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final ThreadLocal f6822H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    static final Comparator f6823I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final androidx.core.util.d f6824J;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f6825A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Drawable f6826B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f6827C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private C f6828D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final B f6829E;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f6830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a f6831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f6832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Paint f6833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int[] f6834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int[] f6835r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f6836s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f6837t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int[] f6838u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f6839v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f6840w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f6841x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f6842y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private U f6843z;

    class a implements C {
        a() {
        }

        @Override // androidx.core.view.C
        public U a(View view, U u6) {
            return CoordinatorLayout.this.Z(u6);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
            if (i8 == 0) {
                return z(coordinatorLayout, view, view2, view3, i7);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i7) {
            if (i7 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public U f(CoordinatorLayout coordinatorLayout, View view, U u6) {
            return u6;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i7) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int i10) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f7, float f8, boolean z6) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f7, float f8) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int[] iArr, int i9) {
            if (i9 == 0) {
                p(coordinatorLayout, view, view2, i7, i8, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10, int i11) {
            if (i11 == 0) {
                r(coordinatorLayout, view, view2, i7, i8, i9, i10);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
            iArr[0] = iArr[0] + i9;
            iArr[1] = iArr[1] + i10;
            s(coordinatorLayout, view, view2, i7, i8, i9, i10, i11);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7, int i8) {
            if (i8 == 0) {
                u(coordinatorLayout, view, view2, view3, i7);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z6) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i7) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f6827C;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.J(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f6827C;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f6846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f6847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6853h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f6854i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f6855j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f6856k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f6857l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f6858m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f6859n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f6860o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f6861p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f6862q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6863r;

        public f(int i7, int i8) {
            super(i7, i8);
            this.f6847b = false;
            this.f6848c = 0;
            this.f6849d = 0;
            this.f6850e = -1;
            this.f6851f = -1;
            this.f6852g = 0;
            this.f6853h = 0;
            this.f6862q = new Rect();
        }

        private void m(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f6851f);
            this.f6856k = viewFindViewById;
            if (viewFindViewById != null) {
                if (viewFindViewById != coordinatorLayout) {
                    for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                viewFindViewById = parent;
                            }
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f6857l = viewFindViewById;
                    return;
                }
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f6851f) + " to anchor view " + view);
            }
            this.f6857l = null;
            this.f6856k = null;
        }

        private boolean r(View view, int i7) {
            int iB = AbstractC0595o.b(((f) view.getLayoutParams()).f6852g, i7);
            return iB != 0 && (AbstractC0595o.b(this.f6853h, i7) & iB) == iB;
        }

        private boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f6856k.getId() != this.f6851f) {
                return false;
            }
            View view2 = this.f6856k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f6857l = null;
                    this.f6856k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f6857l = view2;
            return true;
        }

        boolean a() {
            return this.f6856k == null && this.f6851f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f6857l || r(view2, H.B(coordinatorLayout)) || ((cVar = this.f6846a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f6846a == null) {
                this.f6858m = false;
            }
            return this.f6858m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f6851f == -1) {
                this.f6857l = null;
                this.f6856k = null;
                return null;
            }
            if (this.f6856k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f6856k;
        }

        public c e() {
            return this.f6846a;
        }

        boolean f() {
            return this.f6861p;
        }

        Rect g() {
            return this.f6862q;
        }

        boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z6 = this.f6858m;
            if (z6) {
                return true;
            }
            c cVar = this.f6846a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z6;
            this.f6858m = zA;
            return zA;
        }

        boolean i(int i7) {
            if (i7 == 0) {
                return this.f6859n;
            }
            if (i7 != 1) {
                return false;
            }
            return this.f6860o;
        }

        void j() {
            this.f6861p = false;
        }

        void k(int i7) {
            q(i7, false);
        }

        void l() {
            this.f6858m = false;
        }

        public void n(c cVar) {
            c cVar2 = this.f6846a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f6846a = cVar;
                this.f6863r = null;
                this.f6847b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void o(boolean z6) {
            this.f6861p = z6;
        }

        void p(Rect rect) {
            this.f6862q.set(rect);
        }

        void q(int i7, boolean z6) {
            if (i7 == 0) {
                this.f6859n = z6;
            } else {
                if (i7 != 1) {
                    return;
                }
                this.f6860o = z6;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6847b = false;
            this.f6848c = 0;
            this.f6849d = 0;
            this.f6850e = -1;
            this.f6851f = -1;
            this.f6852g = 0;
            this.f6853h = 0;
            this.f6862q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.c.f22272d);
            this.f6848c = typedArrayObtainStyledAttributes.getInteger(t.c.f22273e, 0);
            this.f6851f = typedArrayObtainStyledAttributes.getResourceId(t.c.f22274f, -1);
            this.f6849d = typedArrayObtainStyledAttributes.getInteger(t.c.f22275g, 0);
            this.f6850e = typedArrayObtainStyledAttributes.getInteger(t.c.f22279k, -1);
            this.f6852g = typedArrayObtainStyledAttributes.getInt(t.c.f22278j, 0);
            this.f6853h = typedArrayObtainStyledAttributes.getInt(t.c.f22277i, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(t.c.f22276h);
            this.f6847b = zHasValue;
            if (zHasValue) {
                this.f6846a = CoordinatorLayout.M(context, attributeSet, typedArrayObtainStyledAttributes.getString(t.c.f22276h));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f6846a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6847b = false;
            this.f6848c = 0;
            this.f6849d = 0;
            this.f6850e = -1;
            this.f6851f = -1;
            this.f6852g = 0;
            this.f6853h = 0;
            this.f6862q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6847b = false;
            this.f6848c = 0;
            this.f6849d = 0;
            this.f6850e = -1;
            this.f6851f = -1;
            this.f6852g = 0;
            this.f6853h = 0;
            this.f6862q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f6847b = false;
            this.f6848c = 0;
            this.f6849d = 0;
            this.f6850e = -1;
            this.f6851f = -1;
            this.f6852g = 0;
            this.f6853h = 0;
            this.f6862q = new Rect();
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.J(0);
            return true;
        }
    }

    protected static class h extends AbstractC2252a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        SparseArray f6865o;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i7) {
                return new h[i7];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i7 = parcel.readInt();
            int[] iArr = new int[i7];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f6865o = new SparseArray(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                this.f6865o.append(iArr[i8], parcelableArray[i8]);
            }
        }

        @Override // z.AbstractC2252a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            SparseArray sparseArray = this.f6865o;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = this.f6865o.keyAt(i8);
                parcelableArr[i8] = (Parcelable) this.f6865o.valueAt(i8);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i7);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fM = H.M(view);
            float fM2 = H.M(view2);
            if (fM > fM2) {
                return -1;
            }
            return fM < fM2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f6820F = r02 != null ? r02.getName() : null;
        f6823I = new i();
        f6821G = new Class[]{Context.class, AttributeSet.class};
        f6822H = new ThreadLocal();
        f6824J = new androidx.core.util.e(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private void A(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
        }
        Comparator comparator = f6823I;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean B(View view) {
        return this.f6831n.k(view);
    }

    private void D(View view, int i7) {
        f fVar = (f) view.getLayoutParams();
        Rect rectB = b();
        rectB.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f6843z != null && H.y(this) && !H.y(view)) {
            rectB.left += this.f6843z.j();
            rectB.top += this.f6843z.l();
            rectB.right -= this.f6843z.k();
            rectB.bottom -= this.f6843z.i();
        }
        Rect rectB2 = b();
        AbstractC0595o.a(V(fVar.f6848c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectB, rectB2, i7);
        view.layout(rectB2.left, rectB2.top, rectB2.right, rectB2.bottom);
        R(rectB);
        R(rectB2);
    }

    private void E(View view, View view2, int i7) {
        Rect rectB = b();
        Rect rectB2 = b();
        try {
            u(view2, rectB);
            v(view, i7, rectB, rectB2);
            view.layout(rectB2.left, rectB2.top, rectB2.right, rectB2.bottom);
        } finally {
            R(rectB);
            R(rectB2);
        }
    }

    private void F(View view, int i7, int i8) {
        f fVar = (f) view.getLayoutParams();
        int iB = AbstractC0595o.b(W(fVar.f6848c), i8);
        int i9 = iB & 7;
        int i10 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i8 == 1) {
            i7 = width - i7;
        }
        int iX = x(i7) - measuredWidth;
        if (i9 == 1) {
            iX += measuredWidth / 2;
        } else if (i9 == 5) {
            iX += measuredWidth;
        }
        int i11 = i10 != 16 ? i10 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iX, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private MotionEvent G(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private void H(View view, Rect rect, int i7) {
        boolean z6;
        boolean z7;
        int width;
        int i8;
        int i9;
        int i10;
        int height;
        int i11;
        int i12;
        int i13;
        if (H.T(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            Rect rectB = b();
            Rect rectB2 = b();
            rectB2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarE == null || !cVarE.b(this, view, rectB)) {
                rectB.set(rectB2);
            } else if (!rectB2.contains(rectB)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectB.toShortString() + " | Bounds:" + rectB2.toShortString());
            }
            R(rectB2);
            if (rectB.isEmpty()) {
                R(rectB);
                return;
            }
            int iB = AbstractC0595o.b(fVar.f6853h, i7);
            boolean z8 = true;
            if ((iB & 48) != 48 || (i12 = (rectB.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f6855j) >= (i13 = rect.top)) {
                z6 = false;
            } else {
                Y(view, i13 - i12);
                z6 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectB.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f6855j) < (i11 = rect.bottom)) {
                Y(view, height - i11);
                z6 = true;
            }
            if (!z6) {
                Y(view, 0);
            }
            if ((iB & 3) != 3 || (i9 = (rectB.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f6854i) >= (i10 = rect.left)) {
                z7 = false;
            } else {
                X(view, i10 - i9);
                z7 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectB.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f6854i) >= (i8 = rect.right)) {
                z8 = z7;
            } else {
                X(view, width - i8);
            }
            if (!z8) {
                X(view, 0);
            }
            R(rectB);
        }
    }

    static c M(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f6820F;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f6822H;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f6821G);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e7) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e7);
        }
    }

    private boolean N(c cVar, View view, MotionEvent motionEvent, int i7) {
        if (i7 == 0) {
            return cVar.k(this, view, motionEvent);
        }
        if (i7 == 1) {
            return cVar.D(this, view, motionEvent);
        }
        throw new IllegalArgumentException();
    }

    private boolean O(MotionEvent motionEvent, int i7) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f6832o;
        A(list);
        int size = list.size();
        MotionEvent motionEventG = null;
        boolean zN = false;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) list.get(i8);
            f fVar = (f) view.getLayoutParams();
            c cVarE = fVar.e();
            if (!(zN || z6) || actionMasked == 0) {
                if (!z6 && !zN && cVarE != null && (zN = N(cVarE, view, motionEvent, i7))) {
                    this.f6839v = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i9 = 0; i9 < i8; i9++) {
                            View view2 = (View) list.get(i9);
                            c cVarE2 = ((f) view2.getLayoutParams()).e();
                            if (cVarE2 != null) {
                                if (motionEventG == null) {
                                    motionEventG = G(motionEvent);
                                }
                                N(cVarE2, view2, motionEventG, i7);
                            }
                        }
                    }
                }
                boolean zC = fVar.c();
                boolean zH = fVar.h(this, view);
                z6 = zH && !zC;
                if (zH && !z6) {
                    break;
                }
            } else if (cVarE != null) {
                if (motionEventG == null) {
                    motionEventG = G(motionEvent);
                }
                N(cVarE, view, motionEventG, i7);
            }
        }
        list.clear();
        if (motionEventG != null) {
            motionEventG.recycle();
        }
        return zN;
    }

    private void P() {
        this.f6830m.clear();
        this.f6831n.c();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            f fVarZ = z(childAt);
            fVarZ.d(this, childAt);
            this.f6831n.b(childAt);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (i8 != i7) {
                    View childAt2 = getChildAt(i8);
                    if (fVarZ.b(this, childAt, childAt2)) {
                        if (!this.f6831n.d(childAt2)) {
                            this.f6831n.b(childAt2);
                        }
                        this.f6831n.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f6830m.addAll(this.f6831n.j());
        Collections.reverse(this.f6830m);
    }

    private static void R(Rect rect) {
        rect.setEmpty();
        f6824J.a(rect);
    }

    private void T() {
        View view = this.f6839v;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            if (cVarE != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                cVarE.D(this, this.f6839v, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f6839v = null;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            ((f) getChildAt(i7).getLayoutParams()).l();
        }
        this.f6836s = false;
    }

    private static int U(int i7) {
        if (i7 == 0) {
            return 17;
        }
        return i7;
    }

    private static int V(int i7) {
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        return (i7 & 112) == 0 ? i7 | 48 : i7;
    }

    private static int W(int i7) {
        if (i7 == 0) {
            return 8388661;
        }
        return i7;
    }

    private void X(View view, int i7) {
        f fVar = (f) view.getLayoutParams();
        int i8 = fVar.f6854i;
        if (i8 != i7) {
            H.Z(view, i7 - i8);
            fVar.f6854i = i7;
        }
    }

    private void Y(View view, int i7) {
        f fVar = (f) view.getLayoutParams();
        int i8 = fVar.f6855j;
        if (i8 != i7) {
            H.a0(view, i7 - i8);
            fVar.f6855j = i7;
        }
    }

    private void a0() {
        if (!H.y(this)) {
            H.C0(this, null);
            return;
        }
        if (this.f6828D == null) {
            this.f6828D = new a();
        }
        H.C0(this, this.f6828D);
        setSystemUiVisibility(1280);
    }

    private static Rect b() {
        Rect rect = (Rect) f6824J.b();
        return rect == null ? new Rect() : rect;
    }

    private void d() {
        int childCount = getChildCount();
        MotionEvent motionEventObtain = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (cVarE != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                cVarE.k(this, childAt, motionEventObtain);
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
    }

    private static int e(int i7, int i8, int i9) {
        return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
    }

    private void f(f fVar, Rect rect, int i7, int i8) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i7) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i7 + iMax, i8 + iMax2);
    }

    private U g(U u6) {
        c cVarE;
        if (u6.o()) {
            return u6;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (H.y(childAt) && (cVarE = ((f) childAt.getLayoutParams()).e()) != null) {
                u6 = cVarE.f(this, childAt, u6);
                if (u6.o()) {
                    break;
                }
            }
        }
        return u6;
    }

    private void w(int i7, Rect rect, Rect rect2, f fVar, int i8, int i9) {
        int iB = AbstractC0595o.b(U(fVar.f6848c), i7);
        int iB2 = AbstractC0595o.b(V(fVar.f6849d), i7);
        int i10 = iB & 7;
        int i11 = iB & 112;
        int i12 = iB2 & 7;
        int i13 = iB2 & 112;
        int iWidth = i12 != 1 ? i12 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i13 != 16 ? i13 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i10 == 1) {
            iWidth -= i8 / 2;
        } else if (i10 != 5) {
            iWidth -= i8;
        }
        if (i11 == 16) {
            iHeight -= i9 / 2;
        } else if (i11 != 80) {
            iHeight -= i9;
        }
        rect2.set(iWidth, iHeight, i8 + iWidth, i9 + iHeight);
    }

    private int x(int i7) {
        StringBuilder sb;
        int[] iArr = this.f6838u;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i7);
        } else {
            if (i7 >= 0 && i7 < iArr.length) {
                return iArr[i7];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i7);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public boolean C(View view, int i7, int i8) {
        Rect rectB = b();
        u(view, rectB);
        try {
            return rectB.contains(i7, i8);
        } finally {
            R(rectB);
        }
    }

    void I(View view, int i7) {
        c cVarE;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f6856k != null) {
            Rect rectB = b();
            Rect rectB2 = b();
            Rect rectB3 = b();
            u(fVar.f6856k, rectB);
            r(view, false, rectB2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            w(i7, rectB, rectB3, fVar, measuredWidth, measuredHeight);
            boolean z6 = (rectB3.left == rectB2.left && rectB3.top == rectB2.top) ? false : true;
            f(fVar, rectB3, measuredWidth, measuredHeight);
            int i8 = rectB3.left - rectB2.left;
            int i9 = rectB3.top - rectB2.top;
            if (i8 != 0) {
                H.Z(view, i8);
            }
            if (i9 != 0) {
                H.a0(view, i9);
            }
            if (z6 && (cVarE = fVar.e()) != null) {
                cVarE.h(this, view, fVar.f6856k);
            }
            R(rectB);
            R(rectB2);
            R(rectB3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void J(int i7) {
        int i8;
        boolean zH;
        int iB = H.B(this);
        int size = this.f6830m.size();
        Rect rectB = b();
        Rect rectB2 = b();
        Rect rectB3 = b();
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) this.f6830m.get(i9);
            f fVar = (f) view.getLayoutParams();
            if (i7 != 0 || view.getVisibility() != 8) {
                for (int i10 = 0; i10 < i9; i10++) {
                    if (fVar.f6857l == ((View) this.f6830m.get(i10))) {
                        I(view, iB);
                    }
                }
                r(view, true, rectB2);
                if (fVar.f6852g != 0 && !rectB2.isEmpty()) {
                    int iB2 = AbstractC0595o.b(fVar.f6852g, iB);
                    int i11 = iB2 & 112;
                    if (i11 == 48) {
                        rectB.top = Math.max(rectB.top, rectB2.bottom);
                    } else if (i11 == 80) {
                        rectB.bottom = Math.max(rectB.bottom, getHeight() - rectB2.top);
                    }
                    int i12 = iB2 & 7;
                    if (i12 == 3) {
                        rectB.left = Math.max(rectB.left, rectB2.right);
                    } else if (i12 == 5) {
                        rectB.right = Math.max(rectB.right, getWidth() - rectB2.left);
                    }
                }
                if (fVar.f6853h != 0 && view.getVisibility() == 0) {
                    H(view, rectB, iB);
                }
                if (i7 != 2) {
                    y(view, rectB3);
                    if (!rectB3.equals(rectB2)) {
                        Q(view, rectB2);
                        for (i8 = i9 + 1; i8 < size; i8++) {
                            View view2 = (View) this.f6830m.get(i8);
                            f fVar2 = (f) view2.getLayoutParams();
                            c cVarE = fVar2.e();
                            if (cVarE != null && cVarE.e(this, view2, view)) {
                                if (i7 == 0 && fVar2.f()) {
                                    fVar2.j();
                                } else {
                                    if (i7 != 2) {
                                        zH = cVarE.h(this, view2, view);
                                    } else {
                                        cVarE.i(this, view2, view);
                                        zH = true;
                                    }
                                    if (i7 == 1) {
                                        fVar2.o(zH);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i8 < size) {
                    }
                }
            }
        }
        R(rectB);
        R(rectB2);
        R(rectB3);
    }

    public void K(View view, int i7) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f6856k;
        if (view2 != null) {
            E(view, view2, i7);
            return;
        }
        int i8 = fVar.f6850e;
        if (i8 >= 0) {
            F(view, i8, i7);
        } else {
            D(view, i7);
        }
    }

    public void L(View view, int i7, int i8, int i9, int i10) {
        measureChildWithMargins(view, i7, i8, i9, i10);
    }

    void Q(View view, Rect rect) {
        ((f) view.getLayoutParams()).p(rect);
    }

    void S() {
        if (this.f6837t && this.f6841x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f6841x);
        }
        this.f6842y = false;
    }

    final U Z(U u6) {
        if (androidx.core.util.b.a(this.f6843z, u6)) {
            return u6;
        }
        this.f6843z = u6;
        boolean z6 = false;
        boolean z7 = u6 != null && u6.l() > 0;
        this.f6825A = z7;
        if (!z7 && getBackground() == null) {
            z6 = true;
        }
        setWillNotDraw(z6);
        U uG = g(u6);
        requestLayout();
        return uG;
    }

    @Override // androidx.core.view.A
    public void a(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        c cVarE;
        boolean z6;
        int iMin;
        int childCount = getChildCount();
        boolean z7 = false;
        int iMax = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i11) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f6834q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.t(this, childAt, view, i7, i8, i9, i10, i11, iArr2);
                    int[] iArr3 = this.f6834q;
                    iMax = i9 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    if (i10 > 0) {
                        z6 = true;
                        iMin = Math.max(i12, this.f6834q[1]);
                    } else {
                        z6 = true;
                        iMin = Math.min(i12, this.f6834q[1]);
                    }
                    i12 = iMin;
                    z7 = z6;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + i12;
        if (z7) {
            J(1);
        }
    }

    void c() {
        if (this.f6837t) {
            if (this.f6841x == null) {
                this.f6841x = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f6841x);
        }
        this.f6842y = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f6846a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f6833p == null) {
                    this.f6833p = new Paint();
                }
                this.f6833p.setColor(fVar.f6846a.c(this, view));
                this.f6833p.setAlpha(e(Math.round(fD * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f6833p);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6826B;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    final List<View> getDependencySortedChildren() {
        P();
        return Collections.unmodifiableList(this.f6830m);
    }

    public final U getLastWindowInsets() {
        return this.f6843z;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f6829E.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f6826B;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void h(View view) {
        ArrayList arrayListH = this.f6831n.h(view);
        if (arrayListH == null || arrayListH.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < arrayListH.size(); i7++) {
            View view2 = (View) arrayListH.get(i7);
            c cVarE = ((f) view2.getLayoutParams()).e();
            if (cVarE != null) {
                cVarE.h(this, view2, view);
            }
        }
    }

    void i() {
        int childCount = getChildCount();
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            if (B(getChildAt(i7))) {
                z6 = true;
                break;
            }
            i7++;
        }
        if (z6 != this.f6842y) {
            if (z6) {
                c();
            } else {
                S();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void k(View view, int i7, int i8, int i9, int i10, int i11) {
        a(view, i7, i8, i9, i10, 0, this.f6835r);
    }

    @Override // androidx.core.view.InterfaceC0605z
    public boolean l(View view, View view2, int i7, int i8) {
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarE = fVar.e();
                if (cVarE != null) {
                    boolean zA = cVarE.A(this, childAt, view, view2, i7, i8);
                    z6 |= zA;
                    fVar.q(i8, zA);
                } else {
                    fVar.q(i8, false);
                }
            }
        }
        return z6;
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void m(View view, View view2, int i7, int i8) {
        c cVarE;
        this.f6829E.c(view, view2, i7, i8);
        this.f6840w = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i8) && (cVarE = fVar.e()) != null) {
                cVarE.v(this, childAt, view, view2, i7, i8);
            }
        }
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void n(View view, int i7) {
        this.f6829E.e(view, i7);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.i(i7)) {
                c cVarE = fVar.e();
                if (cVarE != null) {
                    cVarE.C(this, childAt, view, i7);
                }
                fVar.k(i7);
                fVar.j();
            }
        }
        this.f6840w = null;
    }

    @Override // androidx.core.view.InterfaceC0605z
    public void o(View view, int i7, int i8, int[] iArr, int i9) {
        c cVarE;
        int childCount = getChildCount();
        boolean z6 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(i9) && (cVarE = fVar.e()) != null) {
                    int[] iArr2 = this.f6834q;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarE.q(this, childAt, view, i7, i8, iArr2, i9);
                    int[] iArr3 = this.f6834q;
                    iMax = i7 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f6834q;
                    iMax2 = i8 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z6 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z6) {
            J(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
        if (this.f6842y) {
            if (this.f6841x == null) {
                this.f6841x = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f6841x);
        }
        if (this.f6843z == null && H.y(this)) {
            H.m0(this);
        }
        this.f6837t = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        T();
        if (this.f6842y && this.f6841x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f6841x);
        }
        View view = this.f6840w;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f6837t = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f6825A || this.f6826B == null) {
            return;
        }
        U u6 = this.f6843z;
        int iL = u6 != null ? u6.l() : 0;
        if (iL > 0) {
            this.f6826B.setBounds(0, 0, getWidth(), iL);
            this.f6826B.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            T();
        }
        boolean zO = O(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f6839v = null;
            T();
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        c cVarE;
        int iB = H.B(this);
        int size = this.f6830m.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) this.f6830m.get(i11);
            if (view.getVisibility() != 8 && ((cVarE = ((f) view.getLayoutParams()).e()) == null || !cVarE.l(this, view, iB))) {
                K(view, iB);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i7, int i8) {
        int i9;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarE;
        f fVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        P();
        i();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int iB = H.B(this);
        boolean z6 = iB == 1;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int i16 = paddingLeft + paddingRight;
        int i17 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z7 = this.f6843z != null && H.y(this);
        int size3 = this.f6830m.size();
        int i18 = suggestedMinimumWidth;
        int i19 = suggestedMinimumHeight;
        int iCombineMeasuredStates = 0;
        int i20 = 0;
        while (i20 < size3) {
            View view = (View) this.f6830m.get(i20);
            if (view.getVisibility() == 8) {
                i14 = i20;
                i11 = size3;
                i12 = paddingLeft;
            } else {
                f fVar2 = (f) view.getLayoutParams();
                int i21 = fVar2.f6850e;
                if (i21 < 0 || mode == 0) {
                    i9 = iCombineMeasuredStates;
                } else {
                    int iX = x(i21);
                    int iB2 = AbstractC0595o.b(W(fVar2.f6848c), iB) & 7;
                    i9 = iCombineMeasuredStates;
                    if ((iB2 == 3 && !z6) || (iB2 == 5 && z6)) {
                        iMax = Math.max(0, (size - paddingRight) - iX);
                    } else if ((iB2 == 5 && !z6) || (iB2 == 3 && z6)) {
                        iMax = Math.max(0, iX - paddingLeft);
                    }
                    if (z7 || H.y(view)) {
                        iMakeMeasureSpec = i7;
                        iMakeMeasureSpec2 = i8;
                    } else {
                        int iJ = this.f6843z.j() + this.f6843z.k();
                        int iL = this.f6843z.l() + this.f6843z.i();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iJ, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iL, mode2);
                    }
                    cVarE = fVar2.e();
                    if (cVarE == null) {
                        fVar = fVar2;
                        i13 = i9;
                        i14 = i20;
                        i10 = i19;
                        i12 = paddingLeft;
                        i15 = i18;
                        i11 = size3;
                        if (!cVarE.m(this, view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0)) {
                        }
                        f fVar3 = fVar;
                        int iMax2 = Math.max(i15, i16 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin + ((ViewGroup.MarginLayoutParams) fVar3).rightMargin);
                        int iMax3 = Math.max(i10, i17 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin + ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                        i18 = iMax2;
                        i19 = iMax3;
                    } else {
                        fVar = fVar2;
                        i10 = i19;
                        i11 = size3;
                        i12 = paddingLeft;
                        i13 = i9;
                        i14 = i20;
                        i15 = i18;
                    }
                    L(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    f fVar32 = fVar;
                    int iMax22 = Math.max(i15, i16 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar32).leftMargin + ((ViewGroup.MarginLayoutParams) fVar32).rightMargin);
                    int iMax32 = Math.max(i10, i17 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar32).topMargin + ((ViewGroup.MarginLayoutParams) fVar32).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                    i18 = iMax22;
                    i19 = iMax32;
                }
                iMax = 0;
                if (z7) {
                    iMakeMeasureSpec = i7;
                    iMakeMeasureSpec2 = i8;
                    cVarE = fVar2.e();
                    if (cVarE == null) {
                    }
                    L(view, iMakeMeasureSpec, iMax, iMakeMeasureSpec2, 0);
                    f fVar322 = fVar;
                    int iMax222 = Math.max(i15, i16 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar322).leftMargin + ((ViewGroup.MarginLayoutParams) fVar322).rightMargin);
                    int iMax322 = Math.max(i10, i17 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar322).topMargin + ((ViewGroup.MarginLayoutParams) fVar322).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i13, view.getMeasuredState());
                    i18 = iMax222;
                    i19 = iMax322;
                }
            }
            i20 = i14 + 1;
            paddingLeft = i12;
            size3 = i11;
        }
        int i22 = iCombineMeasuredStates;
        setMeasuredDimension(View.resolveSizeAndState(i18, i7, (-16777216) & i22), View.resolveSizeAndState(i19, i8, i22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f7, float f8, boolean z6) {
        c cVarE;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    zN |= cVarE.n(this, childAt, view, f7, f8, z6);
                }
            }
        }
        if (zN) {
            J(1);
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f7, float f8) {
        c cVarE;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.i(0) && (cVarE = fVar.e()) != null) {
                    zO |= cVarE.o(this, childAt, view, f7, f8);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        o(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        k(view, i7, i8, i9, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        m(view, view2, i7, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray sparseArray = hVar.f6865o;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            c cVarE = z(childAt).e();
            if (id != -1 && cVarE != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVarE.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int id = childAt.getId();
            c cVarE = ((f) childAt.getLayoutParams()).e();
            if (id != -1 && cVarE != null && (parcelableY = cVarE.y(this, childAt)) != null) {
                sparseArray.append(id, parcelableY);
            }
        }
        hVar.f6865o = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return l(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zO;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f6839v;
        boolean z6 = false;
        if (view != null) {
            c cVarE = ((f) view.getLayoutParams()).e();
            zO = cVarE != null ? cVarE.D(this, this.f6839v, motionEvent) : false;
        } else {
            zO = O(motionEvent, 1);
            if (actionMasked != 0 && zO) {
                z6 = true;
            }
        }
        if (this.f6839v == null || actionMasked == 3) {
            zO |= super.onTouchEvent(motionEvent);
        } else if (z6) {
            MotionEvent motionEventG = G(motionEvent);
            super.onTouchEvent(motionEventG);
            motionEventG.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f6839v = null;
            T();
        }
        return zO;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void r(View view, boolean z6, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z6) {
            u(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        c cVarE = ((f) view.getLayoutParams()).e();
        if (cVarE == null || !cVarE.w(this, view, rect, z6)) {
            return super.requestChildRectangleOnScreen(view, rect, z6);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (!z6 || this.f6836s) {
            return;
        }
        if (this.f6839v == null) {
            d();
        }
        T();
        this.f6836s = true;
    }

    public List s(View view) {
        List listI = this.f6831n.i(view);
        return listI == null ? Collections.emptyList() : listI;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z6) {
        super.setFitsSystemWindows(z6);
        a0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f6827C = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f6826B;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f6826B = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f6826B.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.g(this.f6826B, H.B(this));
                this.f6826B.setVisible(getVisibility() == 0, false);
                this.f6826B.setCallback(this);
            }
            H.g0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i7) {
        setStatusBarBackground(new ColorDrawable(i7));
    }

    public void setStatusBarBackgroundResource(int i7) {
        setStatusBarBackground(i7 != 0 ? androidx.core.content.b.e(getContext(), i7) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z6 = i7 == 0;
        Drawable drawable = this.f6826B;
        if (drawable == null || drawable.isVisible() == z6) {
            return;
        }
        this.f6826B.setVisible(z6, false);
    }

    public List t(View view) {
        List listG = this.f6831n.g(view);
        return listG == null ? Collections.emptyList() : listG;
    }

    void u(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void v(View view, int i7, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        w(i7, rect, rect2, fVar, measuredWidth, measuredHeight);
        f(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6826B;
    }

    void y(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f z(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f6847b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.n(behavior);
            } else {
                d dVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dVar = (d) superclass.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.n((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e7) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e7);
                    }
                }
            }
            fVar.f6847b = true;
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2053a.f22267a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f6830m = new ArrayList();
        this.f6831n = new androidx.coordinatorlayout.widget.a();
        this.f6832o = new ArrayList();
        this.f6834q = new int[2];
        this.f6835r = new int[2];
        this.f6829E = new B(this);
        int[] iArr = t.c.f22269a;
        TypedArray typedArrayObtainStyledAttributes = i7 == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, t.b.f22268a) : context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        int[] iArr2 = t.c.f22269a;
        if (i7 == 0) {
            H.n0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, 0, t.b.f22268a);
        } else {
            H.n0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(t.c.f22270b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f6838u = resources.getIntArray(resourceId);
            float f7 = resources.getDisplayMetrics().density;
            int length = this.f6838u.length;
            for (int i8 = 0; i8 < length; i8++) {
                this.f6838u[i8] = (int) (r12[i8] * f7);
            }
        }
        this.f6826B = typedArrayObtainStyledAttributes.getDrawable(t.c.f22271c);
        typedArrayObtainStyledAttributes.recycle();
        a0();
        super.setOnHierarchyChangeListener(new e());
        if (H.z(this) == 0) {
            H.z0(this, 1);
        }
    }
}
