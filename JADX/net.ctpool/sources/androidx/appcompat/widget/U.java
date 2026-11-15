package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.gms.common.api.Api;
import e.AbstractC1609a;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class U implements androidx.appcompat.view.menu.p {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static Method f5903S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static Method f5904T;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f5905A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private View f5906B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f5907C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private DataSetObserver f5908D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private View f5909E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Drawable f5910F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private AdapterView.OnItemClickListener f5911G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f5912H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final i f5913I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final h f5914J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final g f5915K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final e f5916L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Runnable f5917M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final Handler f5918N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Rect f5919O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private Rect f5920P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f5921Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    PopupWindow f5922R;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f5923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ListAdapter f5924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    P f5925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f5931u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f5932v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f5933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f5934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f5935y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f5936z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = U.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            U.this.b();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            P p6;
            if (i7 == -1 || (p6 = U.this.f5925o) == null) {
                return;
            }
            p6.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i7, boolean z6) {
            return popupWindow.getMaxAvailableHeight(view, i7, z6);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z6) {
            popupWindow.setIsClippedToScreen(z6);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            U.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (U.this.a()) {
                U.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            U.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i7, int i8, int i9) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i7) {
            if (i7 != 1 || U.this.A() || U.this.f5922R.getContentView() == null) {
                return;
            }
            U u6 = U.this;
            u6.f5918N.removeCallbacks(u6.f5913I);
            U.this.f5913I.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = U.this.f5922R) != null && popupWindow.isShowing() && x6 >= 0 && x6 < U.this.f5922R.getWidth() && y6 >= 0 && y6 < U.this.f5922R.getHeight()) {
                U u6 = U.this;
                u6.f5918N.postDelayed(u6.f5913I, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            U u7 = U.this;
            u7.f5918N.removeCallbacks(u7.f5913I);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P p6 = U.this.f5925o;
            if (p6 == null || !androidx.core.view.H.S(p6) || U.this.f5925o.getCount() <= U.this.f5925o.getChildCount()) {
                return;
            }
            int childCount = U.this.f5925o.getChildCount();
            U u6 = U.this;
            if (childCount <= u6.f5905A) {
                u6.f5922R.setInputMethodMode(2);
                U.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f5903S = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f5904T = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public U(Context context) {
        this(context, null, AbstractC1609a.f18717B);
    }

    private void C() {
        View view = this.f5906B;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f5906B);
            }
        }
    }

    private void N(boolean z6) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f5922R, z6);
            return;
        }
        Method method = f5903S;
        if (method != null) {
            try {
                method.invoke(this.f5922R, Boolean.valueOf(z6));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012b A[PHI: r1
      0x012b: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x011f, B:47:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int q() {
        int measuredHeight;
        int i7;
        int iMakeMeasureSpec;
        View view;
        int i8;
        int i9 = Integer.MIN_VALUE;
        if (this.f5925o == null) {
            Context context = this.f5923m;
            this.f5917M = new a();
            P pS = s(context, !this.f5921Q);
            this.f5925o = pS;
            Drawable drawable = this.f5910F;
            if (drawable != null) {
                pS.setSelector(drawable);
            }
            this.f5925o.setAdapter(this.f5924n);
            this.f5925o.setOnItemClickListener(this.f5911G);
            this.f5925o.setFocusable(true);
            this.f5925o.setFocusableInTouchMode(true);
            this.f5925o.setOnItemSelectedListener(new b());
            this.f5925o.setOnScrollListener(this.f5915K);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f5912H;
            if (onItemSelectedListener != null) {
                this.f5925o.setOnItemSelectedListener(onItemSelectedListener);
            }
            P p6 = this.f5925o;
            View view2 = this.f5906B;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i10 = this.f5907C;
                if (i10 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(p6, layoutParams);
                } else if (i10 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f5907C);
                } else {
                    linearLayout.addView(p6, layoutParams);
                    linearLayout.addView(view2);
                }
                int i11 = this.f5927q;
                if (i11 >= 0) {
                    i8 = Integer.MIN_VALUE;
                } else {
                    i11 = 0;
                    i8 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i11, i8), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = p6;
            }
            this.f5922R.setContentView(view);
        } else {
            View view3 = this.f5906B;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f5922R.getBackground();
        if (background != null) {
            background.getPadding(this.f5919O);
            Rect rect = this.f5919O;
            int i12 = rect.top;
            i7 = rect.bottom + i12;
            if (!this.f5931u) {
                this.f5929s = -i12;
            }
        } else {
            this.f5919O.setEmpty();
            i7 = 0;
        }
        int iU = u(t(), this.f5929s, this.f5922R.getInputMethodMode() == 2);
        if (this.f5935y || this.f5926p == -1) {
            return iU + i7;
        }
        int i13 = this.f5927q;
        if (i13 != -2) {
            i9 = 1073741824;
            if (i13 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else {
                int i14 = this.f5923m.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.f5919O;
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14 - (rect2.left + rect2.right), i9);
            }
        }
        int iD = this.f5925o.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i7 + this.f5925o.getPaddingTop() + this.f5925o.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i7, boolean z6) {
        return c.a(this.f5922R, view, i7, z6);
    }

    public boolean A() {
        return this.f5922R.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f5921Q;
    }

    public void D(View view) {
        this.f5909E = view;
    }

    public void E(int i7) {
        this.f5922R.setAnimationStyle(i7);
    }

    public void F(int i7) {
        Drawable background = this.f5922R.getBackground();
        if (background == null) {
            Q(i7);
            return;
        }
        background.getPadding(this.f5919O);
        Rect rect = this.f5919O;
        this.f5927q = rect.left + rect.right + i7;
    }

    public void G(int i7) {
        this.f5934x = i7;
    }

    public void H(Rect rect) {
        this.f5920P = rect != null ? new Rect(rect) : null;
    }

    public void I(int i7) {
        this.f5922R.setInputMethodMode(i7);
    }

    public void J(boolean z6) {
        this.f5921Q = z6;
        this.f5922R.setFocusable(z6);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f5922R.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f5911G = onItemClickListener;
    }

    public void M(boolean z6) {
        this.f5933w = true;
        this.f5932v = z6;
    }

    public void O(int i7) {
        this.f5907C = i7;
    }

    public void P(int i7) {
        P p6 = this.f5925o;
        if (!a() || p6 == null) {
            return;
        }
        p6.setListSelectionHidden(false);
        p6.setSelection(i7);
        if (p6.getChoiceMode() != 0) {
            p6.setItemChecked(i7, true);
        }
    }

    public void Q(int i7) {
        this.f5927q = i7;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean a() {
        return this.f5922R.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public void b() {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.h.b(this.f5922R, this.f5930t);
        if (this.f5922R.isShowing()) {
            if (androidx.core.view.H.S(t())) {
                int width = this.f5927q;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i7 = this.f5926p;
                if (i7 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.f5922R.setWidth(this.f5927q == -1 ? -1 : 0);
                        this.f5922R.setHeight(0);
                    } else {
                        this.f5922R.setWidth(this.f5927q == -1 ? -1 : 0);
                        this.f5922R.setHeight(-1);
                    }
                } else if (i7 != -2) {
                    iQ = i7;
                }
                this.f5922R.setOutsideTouchable((this.f5936z || this.f5935y) ? false : true);
                this.f5922R.update(t(), this.f5928r, this.f5929s, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f5927q;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i8 = this.f5926p;
        if (i8 == -1) {
            iQ = -1;
        } else if (i8 != -2) {
            iQ = i8;
        }
        this.f5922R.setWidth(width2);
        this.f5922R.setHeight(iQ);
        N(true);
        this.f5922R.setOutsideTouchable((this.f5936z || this.f5935y) ? false : true);
        this.f5922R.setTouchInterceptor(this.f5914J);
        if (this.f5933w) {
            androidx.core.widget.h.a(this.f5922R, this.f5932v);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f5904T;
            if (method != null) {
                try {
                    method.invoke(this.f5922R, this.f5920P);
                } catch (Exception e7) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e7);
                }
            }
        } else {
            d.a(this.f5922R, this.f5920P);
        }
        androidx.core.widget.h.c(this.f5922R, t(), this.f5928r, this.f5929s, this.f5934x);
        this.f5925o.setSelection(-1);
        if (!this.f5921Q || this.f5925o.isInTouchMode()) {
            r();
        }
        if (this.f5921Q) {
            return;
        }
        this.f5918N.post(this.f5916L);
    }

    public int c() {
        return this.f5928r;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.f5922R.dismiss();
        C();
        this.f5922R.setContentView(null);
        this.f5925o = null;
        this.f5918N.removeCallbacks(this.f5913I);
    }

    public void e(int i7) {
        this.f5928r = i7;
    }

    public Drawable h() {
        return this.f5922R.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.f5925o;
    }

    public void k(Drawable drawable) {
        this.f5922R.setBackgroundDrawable(drawable);
    }

    public void l(int i7) {
        this.f5929s = i7;
        this.f5931u = true;
    }

    public int o() {
        if (this.f5931u) {
            return this.f5929s;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f5908D;
        if (dataSetObserver == null) {
            this.f5908D = new f();
        } else {
            ListAdapter listAdapter2 = this.f5924n;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f5924n = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f5908D);
        }
        P p6 = this.f5925o;
        if (p6 != null) {
            p6.setAdapter(this.f5924n);
        }
    }

    public void r() {
        P p6 = this.f5925o;
        if (p6 != null) {
            p6.setListSelectionHidden(true);
            p6.requestLayout();
        }
    }

    P s(Context context, boolean z6) {
        return new P(context, z6);
    }

    public View t() {
        return this.f5909E;
    }

    public Object v() {
        if (a()) {
            return this.f5925o.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f5925o.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f5925o.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.f5925o.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f5927q;
    }

    public U(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, 0);
    }

    public U(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f5926p = -2;
        this.f5927q = -2;
        this.f5930t = 1002;
        this.f5934x = 0;
        this.f5935y = false;
        this.f5936z = false;
        this.f5905A = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f5907C = 0;
        this.f5913I = new i();
        this.f5914J = new h();
        this.f5915K = new g();
        this.f5916L = new e();
        this.f5919O = new Rect();
        this.f5923m = context;
        this.f5918N = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f19080l1, i7, i8);
        this.f5928r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.j.f19085m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.j.f19090n1, 0);
        this.f5929s = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f5931u = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0542t c0542t = new C0542t(context, attributeSet, i7, i8);
        this.f5922R = c0542t;
        c0542t.setInputMethodMode(1);
    }
}
