package H;

import A.c;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC0595o;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.U;
import androidx.core.view.accessibility.C;
import androidx.core.view.accessibility.F;
import java.util.ArrayList;
import java.util.List;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int[] f1285a0 = {R.attr.colorPrimaryDark};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static final int[] f1286b0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    static final boolean f1287c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final boolean f1288d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static boolean f1289e0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f1290A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f1291B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f1292C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f1293D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private e f1294E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private List f1295F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f1296G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private float f1297H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Drawable f1298I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Drawable f1299J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Drawable f1300K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private CharSequence f1301L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private CharSequence f1302M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Object f1303N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f1304O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Drawable f1305P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Drawable f1306Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private Drawable f1307R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Drawable f1308S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final ArrayList f1309T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Rect f1310U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Matrix f1311V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final F f1312W;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d f1313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f1314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f1315o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1316p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f1317q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f1318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final A.c f1319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final A.c f1320t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final h f1321u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f1322v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f1324x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f1325y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1326z;

    /* JADX INFO: renamed from: H.a$a, reason: collision with other inner class name */
    class C0021a implements F {
        C0021a() {
        }

        @Override // androidx.core.view.accessibility.F
        public boolean a(View view, F.a aVar) {
            if (!a.this.C(view) || a.this.r(view) == 2) {
                return false;
            }
            a.this.f(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((a) view).Q(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends C0574a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f1329d = new Rect();

        c() {
        }

        private void n(C c7, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (a.A(childAt)) {
                    c7.c(childAt);
                }
            }
        }

        private void o(C c7, C c8) {
            Rect rect = this.f1329d;
            c8.n(rect);
            c7.d0(rect);
            c7.L0(c8.S());
            c7.u0(c8.w());
            c7.g0(c8.p());
            c7.k0(c8.s());
            c7.l0(c8.J());
            c7.o0(c8.L());
            c7.a0(c8.F());
            c7.C0(c8.Q());
            c7.a(c8.k());
        }

        @Override // androidx.core.view.C0574a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = a.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = a.this.s(a.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // androidx.core.view.C0574a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            if (a.f1287c0) {
                super.g(view, c7);
            } else {
                C cV = C.V(c7);
                super.g(view, cV);
                c7.E0(view);
                Object objH = H.H(view);
                if (objH instanceof View) {
                    c7.w0((View) objH);
                }
                o(c7, cV);
                cV.X();
                n(c7, (ViewGroup) view);
            }
            c7.g0("androidx.drawerlayout.widget.DrawerLayout");
            c7.n0(false);
            c7.o0(false);
            c7.Y(C.a.f7364e);
            c7.Y(C.a.f7365f);
        }

        @Override // androidx.core.view.C0574a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (a.f1287c0 || a.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends C0574a {
        d() {
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            if (a.A(view)) {
                return;
            }
            c7.w0(null);
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i7);

        void d(View view, float f7);
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f1332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f1333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1334d;

        public f(int i7, int i8) {
            super(i7, i8);
            this.f1331a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f1331a = 0;
            this.f1331a = fVar.f1331a;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1331a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1286b0);
            this.f1331a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1331a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1331a = 0;
        }
    }

    protected static class g extends AbstractC2252a {
        public static final Parcelable.Creator<g> CREATOR = new C0022a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f1335o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f1336p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1337q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f1338r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f1339s;

        /* JADX INFO: renamed from: H.a$g$a, reason: collision with other inner class name */
        class C0022a implements Parcelable.ClassLoaderCreator {
            C0022a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i7) {
                return new g[i7];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1335o = 0;
            this.f1335o = parcel.readInt();
            this.f1336p = parcel.readInt();
            this.f1337q = parcel.readInt();
            this.f1338r = parcel.readInt();
            this.f1339s = parcel.readInt();
        }

        @Override // z.AbstractC2252a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f1335o);
            parcel.writeInt(this.f1336p);
            parcel.writeInt(this.f1337q);
            parcel.writeInt(this.f1338r);
            parcel.writeInt(this.f1339s);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.f1335o = 0;
        }
    }

    private class h extends c.AbstractC0002c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private A.c f1341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f1342c = new RunnableC0023a();

        /* JADX INFO: renamed from: H.a$h$a, reason: collision with other inner class name */
        class RunnableC0023a implements Runnable {
            RunnableC0023a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int i7) {
            this.f1340a = i7;
        }

        private void n() {
            View viewN = a.this.n(this.f1340a == 3 ? 5 : 3);
            if (viewN != null) {
                a.this.f(viewN);
            }
        }

        @Override // A.c.AbstractC0002c
        public int a(View view, int i7, int i8) {
            int width;
            int width2;
            if (a.this.c(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = a.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i7, width));
        }

        @Override // A.c.AbstractC0002c
        public int b(View view, int i7, int i8) {
            return view.getTop();
        }

        @Override // A.c.AbstractC0002c
        public int d(View view) {
            if (a.this.D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // A.c.AbstractC0002c
        public void f(int i7, int i8) {
            a aVar;
            int i9;
            if ((i7 & 1) == 1) {
                aVar = a.this;
                i9 = 3;
            } else {
                aVar = a.this;
                i9 = 5;
            }
            View viewN = aVar.n(i9);
            if (viewN == null || a.this.r(viewN) != 0) {
                return;
            }
            this.f1341b.b(viewN, i8);
        }

        @Override // A.c.AbstractC0002c
        public boolean g(int i7) {
            return false;
        }

        @Override // A.c.AbstractC0002c
        public void h(int i7, int i8) {
            a.this.postDelayed(this.f1342c, 160L);
        }

        @Override // A.c.AbstractC0002c
        public void i(View view, int i7) {
            ((f) view.getLayoutParams()).f1333c = false;
            n();
        }

        @Override // A.c.AbstractC0002c
        public void j(int i7) {
            a.this.V(i7, this.f1341b.v());
        }

        @Override // A.c.AbstractC0002c
        public void k(View view, int i7, int i8, int i9, int i10) {
            float width = (a.this.c(view, 3) ? i7 + r3 : a.this.getWidth() - i7) / view.getWidth();
            a.this.S(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            a.this.invalidate();
        }

        @Override // A.c.AbstractC0002c
        public void l(View view, float f7, float f8) {
            int i7;
            float fU = a.this.u(view);
            int width = view.getWidth();
            if (a.this.c(view, 3)) {
                i7 = (f7 > 0.0f || (f7 == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = a.this.getWidth();
                if (f7 < 0.0f || (f7 == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i7 = width2;
            }
            this.f1341b.O(i7, view.getTop());
            a.this.invalidate();
        }

        @Override // A.c.AbstractC0002c
        public boolean m(View view, int i7) {
            return a.this.D(view) && a.this.c(view, this.f1340a) && a.this.r(view) == 0;
        }

        void o() {
            View viewN;
            int width;
            int iX = this.f1341b.x();
            boolean z6 = this.f1340a == 3;
            if (z6) {
                viewN = a.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iX;
            } else {
                viewN = a.this.n(5);
                width = a.this.getWidth() - iX;
            }
            if (viewN != null) {
                if (((!z6 || viewN.getLeft() >= width) && (z6 || viewN.getLeft() <= width)) || a.this.r(viewN) != 0) {
                    return;
                }
                f fVar = (f) viewN.getLayoutParams();
                this.f1341b.Q(viewN, width, viewN.getTop());
                fVar.f1333c = true;
                a.this.invalidate();
                n();
                a.this.b();
            }
        }

        public void p() {
            a.this.removeCallbacks(this.f1342c);
        }

        public void q(A.c cVar) {
            this.f1341b = cVar;
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f1287c0 = true;
        f1288d0 = true;
        f1289e0 = i7 >= 29;
    }

    public a(Context context) {
        this(context, null);
    }

    static boolean A(View view) {
        return (H.z(view) == 4 || H.z(view) == 2) ? false : true;
    }

    private boolean F(float f7, float f8, View view) {
        if (this.f1310U == null) {
            this.f1310U = new Rect();
        }
        view.getHitRect(this.f1310U);
        return this.f1310U.contains((int) f7, (int) f8);
    }

    private void G(Drawable drawable, int i7) {
        if (drawable == null || !androidx.core.graphics.drawable.a.c(drawable)) {
            return;
        }
        androidx.core.graphics.drawable.a.g(drawable, i7);
    }

    private Drawable N() {
        int iB = H.B(this);
        if (iB == 0) {
            Drawable drawable = this.f1305P;
            if (drawable != null) {
                G(drawable, iB);
                return this.f1305P;
            }
        } else {
            Drawable drawable2 = this.f1306Q;
            if (drawable2 != null) {
                G(drawable2, iB);
                return this.f1306Q;
            }
        }
        return this.f1307R;
    }

    private Drawable O() {
        int iB = H.B(this);
        if (iB == 0) {
            Drawable drawable = this.f1306Q;
            if (drawable != null) {
                G(drawable, iB);
                return this.f1306Q;
            }
        } else {
            Drawable drawable2 = this.f1305P;
            if (drawable2 != null) {
                G(drawable2, iB);
                return this.f1305P;
            }
        }
        return this.f1308S;
    }

    private void P() {
        if (f1288d0) {
            return;
        }
        this.f1299J = N();
        this.f1300K = O();
    }

    private void T(View view) {
        C.a aVar = C.a.f7384y;
        H.j0(view, aVar.b());
        if (!C(view) || r(view) == 2) {
            return;
        }
        H.l0(view, aVar, null, this.f1312W);
    }

    private void U(View view, boolean z6) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            H.z0(childAt, ((z6 || D(childAt)) && !(z6 && childAt == view)) ? 4 : 1);
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f1311V == null) {
                this.f1311V = new Matrix();
            }
            matrix.invert(this.f1311V);
            motionEventObtain.transform(this.f1311V);
        }
        return motionEventObtain;
    }

    static String w(int i7) {
        return (i7 & 3) == 3 ? "LEFT" : (i7 & 5) == 5 ? "RIGHT" : Integer.toHexString(i7);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (((f) getChildAt(i7).getLayoutParams()).f1333c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((f) view.getLayoutParams()).f1331a == 0;
    }

    public boolean C(View view) {
        if (D(view)) {
            return (((f) view.getLayoutParams()).f1334d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean D(View view) {
        int iB = AbstractC0595o.b(((f) view.getLayoutParams()).f1331a, H.B(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean E(View view) {
        if (D(view)) {
            return ((f) view.getLayoutParams()).f1332b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void H(View view, float f7) {
        float fU = u(view);
        float width = view.getWidth();
        int i7 = ((int) (width * f7)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i7 = -i7;
        }
        view.offsetLeftAndRight(i7);
        S(view, f7);
    }

    public void I(int i7) {
        J(i7, true);
    }

    public void J(int i7, boolean z6) {
        View viewN = n(i7);
        if (viewN != null) {
            L(viewN, z6);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i7));
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z6) {
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f1325y) {
            fVar.f1332b = 1.0f;
            fVar.f1334d = 1;
            U(view, true);
            T(view);
        } else if (z6) {
            fVar.f1334d |= 2;
            if (c(view, 3)) {
                this.f1319s.Q(view, 0, view.getTop());
            } else {
                this.f1320t.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            H(view, 1.0f);
            V(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void M(e eVar) {
        List list;
        if (eVar == null || (list = this.f1295F) == null) {
            return;
        }
        list.remove(eVar);
    }

    public void Q(Object obj, boolean z6) {
        this.f1303N = obj;
        this.f1304O = z6;
        setWillNotDraw(!z6 && getBackground() == null);
        requestLayout();
    }

    public void R(int i7, int i8) {
        View viewN;
        int iB = AbstractC0595o.b(i8, H.B(this));
        if (i8 == 3) {
            this.f1326z = i7;
        } else if (i8 == 5) {
            this.f1290A = i7;
        } else if (i8 == 8388611) {
            this.f1291B = i7;
        } else if (i8 == 8388613) {
            this.f1292C = i7;
        }
        if (i7 != 0) {
            (iB == 3 ? this.f1319s : this.f1320t).a();
        }
        if (i7 != 1) {
            if (i7 == 2 && (viewN = n(iB)) != null) {
                K(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iB);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    void S(View view, float f7) {
        f fVar = (f) view.getLayoutParams();
        if (f7 == fVar.f1332b) {
            return;
        }
        fVar.f1332b = f7;
        l(view, f7);
    }

    void V(int i7, View view) {
        int i8;
        int iA = this.f1319s.A();
        int iA2 = this.f1320t.A();
        if (iA == 1 || iA2 == 1) {
            i8 = 1;
        } else {
            i8 = 2;
            if (iA != 2 && iA2 != 2) {
                i8 = 0;
            }
        }
        if (view != null && i7 == 0) {
            float f7 = ((f) view.getLayoutParams()).f1332b;
            if (f7 == 0.0f) {
                j(view);
            } else if (f7 == 1.0f) {
                k(view);
            }
        }
        if (i8 != this.f1323w) {
            this.f1323w = i8;
            List list = this.f1295F;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f1295F.get(size)).c(i8);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f1295F == null) {
            this.f1295F = new ArrayList();
        }
        this.f1295F.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i7, int i8) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z6 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!D(childAt)) {
                this.f1309T.add(childAt);
            } else if (C(childAt)) {
                childAt.addFocusables(arrayList, i7, i8);
                z6 = true;
            }
        }
        if (!z6) {
            int size = this.f1309T.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f1309T.get(i10);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i7, i8);
                }
            }
        }
        this.f1309T.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        H.z0(view, (o() != null || D(view)) ? 4 : 1);
        if (f1287c0) {
            return;
        }
        H.p0(view, this.f1313m);
    }

    void b() {
        if (this.f1293D) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f1293D = true;
    }

    boolean c(View view, int i7) {
        return (t(view) & i7) == i7;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            fMax = Math.max(fMax, ((f) getChildAt(i7).getLayoutParams()).f1332b);
        }
        this.f1317q = fMax;
        boolean zM = this.f1319s.m(true);
        boolean zM2 = this.f1320t.m(true);
        if (zM || zM2) {
            H.g0(this);
        }
    }

    public void d(int i7) {
        e(i7, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f1317q <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt = getChildAt(i7);
            if (F(x6, y6, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        Drawable drawable;
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i7 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i8 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && D(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i8) {
                            i8 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i8, 0, width, getHeight());
            i7 = i8;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j7);
        canvas.restoreToCount(iSave);
        float f7 = this.f1317q;
        if (f7 <= 0.0f || !zB) {
            if (this.f1299J != null && c(view, 3)) {
                int intrinsicWidth = this.f1299J.getIntrinsicWidth();
                int right2 = view.getRight();
                float fMax = Math.max(0.0f, Math.min(right2 / this.f1319s.x(), 1.0f));
                this.f1299J.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f1299J.setAlpha((int) (fMax * 255.0f));
                drawable = this.f1299J;
            } else if (this.f1300K != null && c(view, 5)) {
                int intrinsicWidth2 = this.f1300K.getIntrinsicWidth();
                int left2 = view.getLeft();
                float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f1320t.x(), 1.0f));
                this.f1300K.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f1300K.setAlpha((int) (fMax2 * 255.0f));
                drawable = this.f1300K;
            }
            drawable.draw(canvas);
        } else {
            this.f1318r.setColor((this.f1316p & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f7)) << 24));
            canvas.drawRect(i7, 0.0f, width, getHeight(), this.f1318r);
        }
        return zDrawChild;
    }

    public void e(int i7, boolean z6) {
        View viewN = n(i7);
        if (viewN != null) {
            g(viewN, z6);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i7));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z6) {
        A.c cVar;
        int width;
        if (!D(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f1325y) {
            fVar.f1332b = 0.0f;
            fVar.f1334d = 0;
        } else if (z6) {
            fVar.f1334d |= 4;
            if (c(view, 3)) {
                cVar = this.f1319s;
                width = -view.getWidth();
            } else {
                cVar = this.f1320t;
                width = getWidth();
            }
            cVar.Q(view, width, view.getTop());
        } else {
            H(view, 0.0f);
            V(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public float getDrawerElevation() {
        if (f1288d0) {
            return this.f1314n;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1298I;
    }

    public void h() {
        i(false);
    }

    void i(boolean z6) {
        int childCount = getChildCount();
        boolean zQ = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            f fVar = (f) childAt.getLayoutParams();
            if (D(childAt) && (!z6 || fVar.f1333c)) {
                zQ |= c(childAt, 3) ? this.f1319s.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1320t.Q(childAt, getWidth(), childAt.getTop());
                fVar.f1333c = false;
            }
        }
        this.f1321u.p();
        this.f1322v.p();
        if (zQ) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f1334d & 1) == 1) {
            fVar.f1334d = 0;
            List list = this.f1295F;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f1295F.get(size)).b(view);
                }
            }
            U(view, false);
            T(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f1334d & 1) == 0) {
            fVar.f1334d = 1;
            List list = this.f1295F;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f1295F.get(size)).a(view);
                }
            }
            U(view, true);
            T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f7) {
        List list = this.f1295F;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.f1295F.get(size)).d(view, f7);
            }
        }
    }

    View n(int i7) {
        int iB = AbstractC0595o.b(i7, H.B(this)) & 7;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if ((t(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((((f) childAt.getLayoutParams()).f1334d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1325y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1325y = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1304O || this.f1298I == null) {
            return;
        }
        Object obj = this.f1303N;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f1298I.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f1298I.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        View viewT;
        int actionMasked = motionEvent.getActionMasked();
        boolean zP = this.f1319s.P(motionEvent) | this.f1320t.P(motionEvent);
        if (actionMasked == 0) {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            this.f1296G = x6;
            this.f1297H = y6;
            z6 = this.f1317q > 0.0f && (viewT = this.f1319s.t((int) x6, (int) y6)) != null && B(viewT);
            this.f1293D = false;
        } else if (actionMasked == 1) {
            i(true);
            this.f1293D = false;
            z6 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            } else if (this.f1319s.d(3)) {
                this.f1321u.p();
                this.f1322v.p();
            }
            z6 = false;
        }
        return zP || z6 || y() || this.f1293D;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 4 || !z()) {
            return super.onKeyDown(i7, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            return super.onKeyUp(i7, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        WindowInsets rootWindowInsets;
        float f7;
        int i11;
        int measuredHeight;
        int i12;
        int i13;
        boolean z7 = true;
        this.f1324x = true;
        int i14 = i9 - i7;
        int childCount = getChildCount();
        int i15 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i16 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i16, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i16, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f8 = measuredWidth;
                        i11 = (-measuredWidth) + ((int) (fVar.f1332b * f8));
                        f7 = (measuredWidth + i11) / f8;
                    } else {
                        float f9 = measuredWidth;
                        f7 = (i14 - r11) / f9;
                        i11 = i14 - ((int) (fVar.f1332b * f9));
                    }
                    boolean z8 = f7 != fVar.f1332b ? z7 : false;
                    int i17 = fVar.f1331a & 112;
                    if (i17 != 16) {
                        if (i17 != 80) {
                            measuredHeight = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                            i12 = measuredWidth + i11;
                            i13 = measuredHeight2 + measuredHeight;
                        } else {
                            int i18 = i10 - i8;
                            measuredHeight = (i18 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight();
                            i12 = measuredWidth + i11;
                            i13 = i18 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                        }
                        childAt.layout(i11, measuredHeight, i12, i13);
                    } else {
                        int i19 = i10 - i8;
                        int i20 = (i19 - measuredHeight2) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight2;
                            int i23 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i22 > i19 - i23) {
                                i20 = (i19 - i23) - measuredHeight2;
                            }
                        }
                        childAt.layout(i11, i20, measuredWidth + i11, measuredHeight2 + i20);
                    }
                    if (z8) {
                        S(childAt, f7);
                    }
                    int i24 = fVar.f1332b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i24) {
                        childAt.setVisibility(i24);
                    }
                }
            }
            i15++;
            z7 = true;
        }
        if (f1289e0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            androidx.core.graphics.b bVarH = U.v(rootWindowInsets).h();
            A.c cVar = this.f1319s;
            cVar.L(Math.max(cVar.w(), bVarH.f7120a));
            A.c cVar2 = this.f1320t;
            cVar2.L(Math.max(cVar2.w(), bVarH.f7122c));
        }
        this.f1324x = false;
        this.f1325y = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z6 = this.f1303N != null && H.y(this);
        int iB = H.B(this);
        int childCount = getChildCount();
        boolean z7 = false;
        boolean z8 = false;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z6) {
                    int iB2 = AbstractC0595o.b(fVar.f1331a, iB);
                    boolean zY = H.y(childAt);
                    WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f1303N;
                    if (zY) {
                        if (iB2 == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB2 == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (iB2 == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB2 == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!D(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i9 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f1288d0) {
                        float fW = H.w(childAt);
                        float f7 = this.f1314n;
                        if (fW != f7) {
                            H.x0(childAt, f7);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z9 = iT == 3;
                    if ((z9 && z7) || (!z9 && z8)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z9) {
                        z7 = true;
                    } else {
                        z8 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i7, this.f1315o + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i8, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i7 = gVar.f1335o;
        if (i7 != 0 && (viewN = n(i7)) != null) {
            K(viewN);
        }
        int i8 = gVar.f1336p;
        if (i8 != 3) {
            R(i8, 3);
        }
        int i9 = gVar.f1337q;
        if (i9 != 3) {
            R(i9, 5);
        }
        int i10 = gVar.f1338r;
        if (i10 != 3) {
            R(i10, 8388611);
        }
        int i11 = gVar.f1339s;
        if (i11 != 3) {
            R(i11, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        P();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            f fVar = (f) getChildAt(i7).getLayoutParams();
            int i8 = fVar.f1334d;
            boolean z6 = i8 == 1;
            boolean z7 = i8 == 2;
            if (z6 || z7) {
                gVar.f1335o = fVar.f1331a;
                break;
            }
        }
        gVar.f1336p = this.f1326z;
        gVar.f1337q = this.f1290A;
        gVar.f1338r = this.f1291B;
        gVar.f1339s = this.f1292C;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View viewO;
        this.f1319s.F(motionEvent);
        this.f1320t.F(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z6 = false;
        if (action != 0) {
            if (action == 1) {
                float x6 = motionEvent.getX();
                float y6 = motionEvent.getY();
                View viewT = this.f1319s.t((int) x6, (int) y6);
                if (viewT == null || !B(viewT)) {
                    z6 = true;
                    i(z6);
                } else {
                    float f7 = x6 - this.f1296G;
                    float f8 = y6 - this.f1297H;
                    int iZ = this.f1319s.z();
                    if ((f7 * f7) + (f8 * f8) >= iZ * iZ || (viewO = o()) == null || r(viewO) == 2) {
                    }
                    i(z6);
                }
            } else if (action == 3) {
                i(true);
            }
            return true;
        }
        float x7 = motionEvent.getX();
        float y7 = motionEvent.getY();
        this.f1296G = x7;
        this.f1297H = y7;
        this.f1293D = false;
        return true;
    }

    View p() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (D(childAt) && E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i7) {
        int iB = H.B(this);
        if (i7 == 3) {
            int i8 = this.f1326z;
            if (i8 != 3) {
                return i8;
            }
            int i9 = iB == 0 ? this.f1291B : this.f1292C;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
        if (i7 == 5) {
            int i10 = this.f1290A;
            if (i10 != 3) {
                return i10;
            }
            int i11 = iB == 0 ? this.f1292C : this.f1291B;
            if (i11 != 3) {
                return i11;
            }
            return 0;
        }
        if (i7 == 8388611) {
            int i12 = this.f1291B;
            if (i12 != 3) {
                return i12;
            }
            int i13 = iB == 0 ? this.f1326z : this.f1290A;
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        if (i7 != 8388613) {
            return 0;
        }
        int i14 = this.f1292C;
        if (i14 != 3) {
            return i14;
        }
        int i15 = iB == 0 ? this.f1290A : this.f1326z;
        if (i15 != 3) {
            return i15;
        }
        return 0;
    }

    public int r(View view) {
        if (D(view)) {
            return q(((f) view.getLayoutParams()).f1331a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z6) {
        super.requestDisallowInterceptTouchEvent(z6);
        if (z6) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1324x) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i7) {
        int iB = AbstractC0595o.b(i7, H.B(this));
        if (iB == 3) {
            return this.f1301L;
        }
        if (iB == 5) {
            return this.f1302M;
        }
        return null;
    }

    public void setDrawerElevation(float f7) {
        this.f1314n = f7;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (D(childAt)) {
                H.x0(childAt, this.f1314n);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f1294E;
        if (eVar2 != null) {
            M(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f1294E = eVar;
    }

    public void setDrawerLockMode(int i7) {
        R(i7, 3);
        R(i7, 5);
    }

    public void setScrimColor(int i7) {
        this.f1316p = i7;
        invalidate();
    }

    public void setStatusBarBackground(int i7) {
        this.f1298I = i7 != 0 ? androidx.core.content.b.e(getContext(), i7) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i7) {
        this.f1298I = new ColorDrawable(i7);
        invalidate();
    }

    int t(View view) {
        return AbstractC0595o.b(((f) view.getLayoutParams()).f1331a, H.B(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f1332b;
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, G.a.f1131a);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1298I = drawable;
        invalidate();
    }

    public a(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f1313m = new d();
        this.f1316p = -1728053248;
        this.f1318r = new Paint();
        this.f1325y = true;
        this.f1326z = 3;
        this.f1290A = 3;
        this.f1291B = 3;
        this.f1292C = 3;
        this.f1305P = null;
        this.f1306Q = null;
        this.f1307R = null;
        this.f1308S = null;
        this.f1312W = new C0021a();
        setDescendantFocusability(262144);
        float f7 = getResources().getDisplayMetrics().density;
        this.f1315o = (int) ((64.0f * f7) + 0.5f);
        float f8 = f7 * 400.0f;
        h hVar = new h(3);
        this.f1321u = hVar;
        h hVar2 = new h(5);
        this.f1322v = hVar2;
        A.c cVarN = A.c.n(this, 1.0f, hVar);
        this.f1319s = cVarN;
        cVarN.M(1);
        cVarN.N(f8);
        hVar.q(cVarN);
        A.c cVarN2 = A.c.n(this, 1.0f, hVar2);
        this.f1320t = cVarN2;
        cVarN2.M(2);
        cVarN2.N(f8);
        hVar2.q(cVarN2);
        setFocusableInTouchMode(true);
        H.z0(this, 1);
        H.p0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (H.y(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f1285a0);
            try {
                this.f1298I = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, G.c.f1134b, i7, 0);
        try {
            this.f1314n = typedArrayObtainStyledAttributes2.hasValue(G.c.f1135c) ? typedArrayObtainStyledAttributes2.getDimension(G.c.f1135c, 0.0f) : getResources().getDimension(G.b.f1132a);
            typedArrayObtainStyledAttributes2.recycle();
            this.f1309T = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }
}
