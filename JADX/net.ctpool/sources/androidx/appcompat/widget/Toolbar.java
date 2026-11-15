package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AbstractC0521a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC0595o;
import androidx.core.view.C0599t;
import androidx.core.view.InterfaceC0598s;
import androidx.core.view.InterfaceC0601v;
import e.AbstractC1609a;
import f.AbstractC1641a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0598s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f5847A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f5848B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f5849C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f5850D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f5851E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Z f5852F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f5853G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f5854H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f5855I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private CharSequence f5856J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private CharSequence f5857K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private ColorStateList f5858L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ColorStateList f5859M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f5860N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f5861O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final ArrayList f5862P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final ArrayList f5863Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final int[] f5864R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final C0599t f5865S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private ArrayList f5866T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    h f5867U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final ActionMenuView.e f5868V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private k0 f5869W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private C0526c f5870a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private f f5871b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private m.a f5872c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    g.a f5873d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f5874e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private OnBackInvokedCallback f5875f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private OnBackInvokedDispatcher f5876g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f5877h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Runnable f5878i0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ActionMenuView f5879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f5880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f5881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageButton f5882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ImageView f5883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f5884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f5885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ImageButton f5886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    View f5887u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Context f5888v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f5889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f5890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f5891y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f5892z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f5865S.d(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f5867U;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.S();
        }
    }

    class c implements g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.f5873d0;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f5879m.J()) {
                Toolbar.this.f5865S.e(gVar);
            }
            g.a aVar = Toolbar.this.f5873d0;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.f();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.k(runnable);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.m {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        androidx.appcompat.view.menu.g f5897m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        androidx.appcompat.view.menu.i f5898n;

        f() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void c(androidx.appcompat.view.menu.g gVar, boolean z6) {
        }

        @Override // androidx.appcompat.view.menu.m
        public void d(boolean z6) {
            if (this.f5898n != null) {
                androidx.appcompat.view.menu.g gVar = this.f5897m;
                if (gVar != null) {
                    int size = gVar.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.f5897m.getItem(i7) == this.f5898n) {
                            return;
                        }
                    }
                }
                f(this.f5897m, this.f5898n);
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.f5887u;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f5887u);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f5886t);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f5887u = null;
            toolbar3.a();
            this.f5898n = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.h();
            ViewParent parent = Toolbar.this.f5886t.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f5886t);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f5886t);
            }
            Toolbar.this.f5887u = iVar.getActionView();
            this.f5898n = iVar;
            ViewParent parent2 = Toolbar.this.f5887u.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f5887u);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f5077a = (toolbar4.f5892z & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f5900b = 2;
                toolbar4.f5887u.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f5887u);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f5887u;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public void i(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f5897m;
            if (gVar2 != null && (iVar = this.f5898n) != null) {
                gVar2.f(iVar);
            }
            this.f5897m = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean k(androidx.appcompat.view.menu.r rVar) {
            return false;
        }
    }

    public static class g extends AbstractC0521a.C0120a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5900b;

        public g(int i7, int i8) {
            super(i7, i8);
            this.f5900b = 0;
            this.f5077a = 8388627;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5900b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5900b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5900b = 0;
            a(marginLayoutParams);
        }

        public g(AbstractC0521a.C0120a c0120a) {
            super(c0120a);
            this.f5900b = 0;
        }

        public g(g gVar) {
            super((AbstractC0521a.C0120a) gVar);
            this.f5900b = 0;
            this.f5900b = gVar.f5900b;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class i extends AbstractC2252a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f5901o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f5902p;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i7) {
                return new i[i7];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5901o = parcel.readInt();
            this.f5902p = parcel.readInt() != 0;
        }

        @Override // z.AbstractC2252a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f5901o);
            parcel.writeInt(this.f5902p ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private boolean B(View view) {
        return view.getParent() == this || this.f5863Q.contains(view);
    }

    private int E(View view, int i7, int[] iArr, int i8) {
        g gVar = (g) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i7 + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        int iR = r(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iR, iMax + measuredWidth, view.getMeasuredHeight() + iR);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int F(View view, int i7, int[] iArr, int i8) {
        g gVar = (g) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int iR = r(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iR, iMax, view.getMeasuredHeight() + iR);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int G(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i11) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + iMax + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void H(View view, int i7, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f5865S.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f5866T = currentMenuItems2;
    }

    private void J() {
        removeCallbacks(this.f5878i0);
        post(this.f5878i0);
    }

    private boolean Q() {
        if (!this.f5874e0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (R(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i7) {
        boolean z6 = androidx.core.view.H.B(this) == 1;
        int childCount = getChildCount();
        int iB = AbstractC0595o.b(i7, androidx.core.view.H.B(this));
        list.clear();
        if (!z6) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f5900b == 0 && R(childAt) && q(gVar.f5077a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f5900b == 0 && R(childAt2) && q(gVar2.f5077a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g gVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        gVarGenerateDefaultLayoutParams.f5900b = 1;
        if (!z6 || this.f5887u == null) {
            addView(view, gVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f5863Q.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void i() {
        if (this.f5852F == null) {
            this.f5852F = new Z();
        }
    }

    private void j() {
        if (this.f5883q == null) {
            this.f5883q = new r(getContext());
        }
    }

    private void k() {
        l();
        if (this.f5879m.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f5879m.getMenu();
            if (this.f5871b0 == null) {
                this.f5871b0 = new f();
            }
            this.f5879m.setExpandedActionViewsExclusive(true);
            gVar.c(this.f5871b0, this.f5888v);
            T();
        }
    }

    private void l() {
        if (this.f5879m == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f5879m = actionMenuView;
            actionMenuView.setPopupTheme(this.f5889w);
            this.f5879m.setOnMenuItemClickListener(this.f5868V);
            this.f5879m.O(this.f5872c0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f5077a = (this.f5892z & 112) | 8388613;
            this.f5879m.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f5879m, false);
        }
    }

    private void m() {
        if (this.f5882p == null) {
            this.f5882p = new C0539p(getContext(), null, AbstractC1609a.f18726K);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f5077a = (this.f5892z & 112) | 8388611;
            this.f5882p.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int q(int i7) {
        int iB = androidx.core.view.H.B(this);
        int iB2 = AbstractC0595o.b(i7, iB) & 7;
        return (iB2 == 1 || iB2 == 3 || iB2 == 5) ? iB2 : iB == 1 ? 5 : 3;
    }

    private int r(View view, int i7) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int iT = t(gVar.f5077a);
        if (iT == 48) {
            return getPaddingTop() - i8;
        }
        if (iT == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i9) {
            iMax = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i10 < i11) {
                iMax = Math.max(0, iMax - (i11 - i10));
            }
        }
        return paddingTop + iMax;
    }

    private int t(int i7) {
        int i8 = i7 & 112;
        return (i8 == 16 || i8 == 48 || i8 == 80) ? i8 : this.f5855I & 112;
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.r.b(marginLayoutParams) + androidx.core.view.r.a(marginLayoutParams);
    }

    private int v(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int w(List list, int[] iArr) {
        int i7 = iArr[0];
        int i8 = iArr[1];
        int size = list.size();
        int i9 = 0;
        int measuredWidth = 0;
        while (i9 < size) {
            View view = (View) list.get(i9);
            g gVar = (g) view.getLayoutParams();
            int i10 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i7;
            int i11 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i8;
            int iMax = Math.max(0, i10);
            int iMax2 = Math.max(0, i11);
            int iMax3 = Math.max(0, -i10);
            int iMax4 = Math.max(0, -i11);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i9++;
            i8 = iMax4;
            i7 = iMax3;
        }
        return measuredWidth;
    }

    public void A() {
        Iterator it = this.f5866T.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        I();
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f5879m;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.f5879m;
        return actionMenuView != null && actionMenuView.J();
    }

    void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f5900b != 2 && childAt != this.f5879m) {
                removeViewAt(childCount);
                this.f5863Q.add(childAt);
            }
        }
    }

    public void L(int i7, int i8) {
        i();
        this.f5852F.g(i7, i8);
    }

    public void M(androidx.appcompat.view.menu.g gVar, C0526c c0526c) {
        if (gVar == null && this.f5879m == null) {
            return;
        }
        l();
        androidx.appcompat.view.menu.g gVarN = this.f5879m.N();
        if (gVarN == gVar) {
            return;
        }
        if (gVarN != null) {
            gVarN.O(this.f5870a0);
            gVarN.O(this.f5871b0);
        }
        if (this.f5871b0 == null) {
            this.f5871b0 = new f();
        }
        c0526c.G(true);
        if (gVar != null) {
            gVar.c(c0526c, this.f5888v);
            gVar.c(this.f5871b0, this.f5888v);
        } else {
            c0526c.i(this.f5888v, null);
            this.f5871b0.i(this.f5888v, null);
            c0526c.d(true);
            this.f5871b0.d(true);
        }
        this.f5879m.setPopupTheme(this.f5889w);
        this.f5879m.setPresenter(c0526c);
        this.f5870a0 = c0526c;
        T();
    }

    public void N(m.a aVar, g.a aVar2) {
        this.f5872c0 = aVar;
        this.f5873d0 = aVar2;
        ActionMenuView actionMenuView = this.f5879m;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void O(Context context, int i7) {
        this.f5891y = i7;
        TextView textView = this.f5881o;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public void P(Context context, int i7) {
        this.f5890x = i7;
        TextView textView = this.f5880n;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public boolean S() {
        ActionMenuView actionMenuView = this.f5879m;
        return actionMenuView != null && actionMenuView.P();
    }

    void T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z6 = x() && onBackInvokedDispatcherA != null && androidx.core.view.H.S(this) && this.f5877h0;
            if (z6 && this.f5876g0 == null) {
                if (this.f5875f0 == null) {
                    this.f5875f0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6129m.f();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f5875f0);
            } else {
                if (z6 || (onBackInvokedDispatcher = this.f5876g0) == null) {
                    return;
                }
                e.d(onBackInvokedDispatcher, this.f5875f0);
                onBackInvokedDispatcherA = null;
            }
            this.f5876g0 = onBackInvokedDispatcherA;
        }
    }

    void a() {
        for (int size = this.f5863Q.size() - 1; size >= 0; size--) {
            addView((View) this.f5863Q.get(size));
        }
        this.f5863Q.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    @Override // androidx.core.view.InterfaceC0598s
    public void d(InterfaceC0601v interfaceC0601v) {
        this.f5865S.f(interfaceC0601v);
    }

    public boolean e() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f5879m) != null && actionMenuView.K();
    }

    public void f() {
        f fVar = this.f5871b0;
        androidx.appcompat.view.menu.i iVar = fVar == null ? null : fVar.f5898n;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void g() {
        ActionMenuView actionMenuView = this.f5879m;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f5886t;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f5886t;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Z z6 = this.f5852F;
        if (z6 != null) {
            return z6.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.f5854H;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Z z6 = this.f5852F;
        if (z6 != null) {
            return z6.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Z z6 = this.f5852F;
        if (z6 != null) {
            return z6.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Z z6 = this.f5852F;
        if (z6 != null) {
            return z6.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.f5853G;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarN;
        ActionMenuView actionMenuView = this.f5879m;
        return (actionMenuView == null || (gVarN = actionMenuView.N()) == null || !gVarN.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f5854H, 0));
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.H.B(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.H.B(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f5853G, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f5883q;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f5883q;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        k();
        return this.f5879m.getMenu();
    }

    View getNavButtonView() {
        return this.f5882p;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f5882p;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f5882p;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0526c getOuterActionMenuPresenter() {
        return this.f5870a0;
    }

    public Drawable getOverflowIcon() {
        k();
        return this.f5879m.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f5888v;
    }

    public int getPopupTheme() {
        return this.f5889w;
    }

    public CharSequence getSubtitle() {
        return this.f5857K;
    }

    final TextView getSubtitleTextView() {
        return this.f5881o;
    }

    public CharSequence getTitle() {
        return this.f5856J;
    }

    public int getTitleMarginBottom() {
        return this.f5851E;
    }

    public int getTitleMarginEnd() {
        return this.f5849C;
    }

    public int getTitleMarginStart() {
        return this.f5848B;
    }

    public int getTitleMarginTop() {
        return this.f5850D;
    }

    final TextView getTitleTextView() {
        return this.f5880n;
    }

    public J getWrapper() {
        if (this.f5869W == null) {
            this.f5869W = new k0(this, true);
        }
        return this.f5869W;
    }

    void h() {
        if (this.f5886t == null) {
            C0539p c0539p = new C0539p(getContext(), null, AbstractC1609a.f18726K);
            this.f5886t = c0539p;
            c0539p.setImageDrawable(this.f5884r);
            this.f5886t.setContentDescription(this.f5885s);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f5077a = (this.f5892z & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f5900b = 2;
            this.f5886t.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f5886t.setOnClickListener(new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5878i0);
        T();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5861O = false;
        }
        if (!this.f5861O) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f5861O = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5861O = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0297 A[LOOP:0: B:111:0x0295->B:112:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b9 A[LOOP:1: B:114:0x02b7->B:115:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f2 A[LOOP:2: B:123:0x02f0->B:124:0x02f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int iE;
        int iF;
        boolean zR;
        boolean zR2;
        int i11;
        int measuredHeight;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int size;
        int iE2;
        int i22;
        int size2;
        int i23;
        int i24;
        int size3;
        boolean z7 = androidx.core.view.H.B(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.f5864R;
        iArr[1] = 0;
        iArr[0] = 0;
        int iC = androidx.core.view.H.C(this);
        int iMin = iC >= 0 ? Math.min(iC, i10 - i8) : 0;
        if (R(this.f5882p)) {
            ImageButton imageButton = this.f5882p;
            if (z7) {
                iF = F(imageButton, i25, iArr, iMin);
                iE = paddingLeft;
                if (R(this.f5886t)) {
                    ImageButton imageButton2 = this.f5886t;
                    if (z7) {
                        iF = F(imageButton2, iF, iArr, iMin);
                    } else {
                        iE = E(imageButton2, iE, iArr, iMin);
                    }
                }
                if (R(this.f5879m)) {
                    ActionMenuView actionMenuView = this.f5879m;
                    if (z7) {
                        iE = E(actionMenuView, iE, iArr, iMin);
                    } else {
                        iF = F(actionMenuView, iF, iArr, iMin);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iE);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - iF));
                int iMax = Math.max(iE, currentContentInsetLeft);
                int iMin2 = Math.min(iF, i25 - currentContentInsetRight);
                if (R(this.f5887u)) {
                    View view = this.f5887u;
                    if (z7) {
                        iMin2 = F(view, iMin2, iArr, iMin);
                    } else {
                        iMax = E(view, iMax, iArr, iMin);
                    }
                }
                if (R(this.f5883q)) {
                    ImageView imageView = this.f5883q;
                    if (z7) {
                        iMin2 = F(imageView, iMin2, iArr, iMin);
                    } else {
                        iMax = E(imageView, iMax, iArr, iMin);
                    }
                }
                zR = R(this.f5880n);
                zR2 = R(this.f5881o);
                if (zR) {
                    i11 = paddingRight;
                    measuredHeight = 0;
                } else {
                    g gVar = (g) this.f5880n.getLayoutParams();
                    i11 = paddingRight;
                    measuredHeight = ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f5880n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                }
                if (zR2) {
                    i12 = width;
                } else {
                    g gVar2 = (g) this.f5881o.getLayoutParams();
                    i12 = width;
                    measuredHeight += ((ViewGroup.MarginLayoutParams) gVar2).topMargin + this.f5881o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin;
                }
                if (!zR || zR2) {
                    TextView textView = !zR ? this.f5880n : this.f5881o;
                    TextView textView2 = !zR2 ? this.f5881o : this.f5880n;
                    g gVar3 = (g) textView.getLayoutParams();
                    g gVar4 = (g) textView2.getLayoutParams();
                    boolean z8 = (zR && this.f5880n.getMeasuredWidth() > 0) || (zR2 && this.f5881o.getMeasuredWidth() > 0);
                    i13 = this.f5855I & 112;
                    i14 = paddingLeft;
                    if (i13 == 48) {
                        i15 = iMax;
                        i16 = iMin;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f5850D;
                    } else if (i13 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                        int i26 = ((ViewGroup.MarginLayoutParams) gVar3).topMargin;
                        i16 = iMin;
                        int i27 = this.f5850D;
                        i15 = iMax;
                        if (iMax2 < i26 + i27) {
                            iMax2 = i26 + i27;
                        } else {
                            int i28 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                            int i29 = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin;
                            int i30 = this.f5851E;
                            if (i28 < i29 + i30) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar4).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        i15 = iMax;
                        i16 = iMin;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin) - this.f5851E) - measuredHeight;
                    }
                    if (!z7) {
                        i17 = 0;
                        int i31 = (z8 ? this.f5848B : 0) - iArr[0];
                        iMax = i15 + Math.max(0, i31);
                        iArr[0] = Math.max(0, -i31);
                        if (zR) {
                            g gVar5 = (g) this.f5880n.getLayoutParams();
                            int measuredWidth = this.f5880n.getMeasuredWidth() + iMax;
                            int measuredHeight2 = this.f5880n.getMeasuredHeight() + paddingTop;
                            this.f5880n.layout(iMax, paddingTop, measuredWidth, measuredHeight2);
                            i18 = measuredWidth + this.f5849C;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                        } else {
                            i18 = iMax;
                        }
                        if (zR2) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f5881o.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f5881o.getMeasuredWidth() + iMax;
                            this.f5881o.layout(iMax, i32, measuredWidth2, this.f5881o.getMeasuredHeight() + i32);
                            i19 = measuredWidth2 + this.f5849C;
                        } else {
                            i19 = iMax;
                        }
                        if (z8) {
                            iMax = Math.max(i18, i19);
                        }
                        b(this.f5862P, 3);
                        size = this.f5862P.size();
                        iE2 = iMax;
                        for (i22 = i17; i22 < size; i22++) {
                            iE2 = E((View) this.f5862P.get(i22), iE2, iArr, i16);
                        }
                        int i33 = i16;
                        b(this.f5862P, 5);
                        size2 = this.f5862P.size();
                        for (i23 = i17; i23 < size2; i23++) {
                            iMin2 = F((View) this.f5862P.get(i23), iMin2, iArr, i33);
                        }
                        b(this.f5862P, 1);
                        int iW = w(this.f5862P, iArr);
                        i24 = (i14 + (((i12 - i14) - i11) / 2)) - (iW / 2);
                        int i34 = iW + i24;
                        if (i24 >= iE2) {
                            iE2 = i34 > iMin2 ? i24 - (i34 - iMin2) : i24;
                        }
                        size3 = this.f5862P.size();
                        while (i17 < size3) {
                            iE2 = E((View) this.f5862P.get(i17), iE2, iArr, i33);
                            i17++;
                        }
                        this.f5862P.clear();
                    }
                    int i35 = (z8 ? this.f5848B : 0) - iArr[1];
                    iMin2 -= Math.max(0, i35);
                    iArr[1] = Math.max(0, -i35);
                    if (zR) {
                        g gVar6 = (g) this.f5880n.getLayoutParams();
                        int measuredWidth3 = iMin2 - this.f5880n.getMeasuredWidth();
                        int measuredHeight3 = this.f5880n.getMeasuredHeight() + paddingTop;
                        this.f5880n.layout(measuredWidth3, paddingTop, iMin2, measuredHeight3);
                        i20 = measuredWidth3 - this.f5849C;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i20 = iMin2;
                    }
                    if (zR2) {
                        int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f5881o.getLayoutParams())).topMargin;
                        this.f5881o.layout(iMin2 - this.f5881o.getMeasuredWidth(), i36, iMin2, this.f5881o.getMeasuredHeight() + i36);
                        i21 = iMin2 - this.f5849C;
                    } else {
                        i21 = iMin2;
                    }
                    if (z8) {
                        iMin2 = Math.min(i20, i21);
                    }
                    iMax = i15;
                } else {
                    i14 = paddingLeft;
                    i16 = iMin;
                }
                i17 = 0;
                b(this.f5862P, 3);
                size = this.f5862P.size();
                iE2 = iMax;
                while (i22 < size) {
                }
                int i332 = i16;
                b(this.f5862P, 5);
                size2 = this.f5862P.size();
                while (i23 < size2) {
                }
                b(this.f5862P, 1);
                int iW2 = w(this.f5862P, iArr);
                i24 = (i14 + (((i12 - i14) - i11) / 2)) - (iW2 / 2);
                int i342 = iW2 + i24;
                if (i24 >= iE2) {
                }
                size3 = this.f5862P.size();
                while (i17 < size3) {
                }
                this.f5862P.clear();
            }
            iE = E(imageButton, paddingLeft, iArr, iMin);
        } else {
            iE = paddingLeft;
        }
        iF = i25;
        if (R(this.f5886t)) {
        }
        if (R(this.f5879m)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iE);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - iF));
        int iMax3 = Math.max(iE, currentContentInsetLeft2);
        int iMin22 = Math.min(iF, i25 - currentContentInsetRight2);
        if (R(this.f5887u)) {
        }
        if (R(this.f5883q)) {
        }
        zR = R(this.f5880n);
        zR2 = R(this.f5881o);
        if (zR) {
        }
        if (zR2) {
        }
        if (zR) {
            if (!zR) {
            }
            if (!zR2) {
            }
            g gVar32 = (g) textView.getLayoutParams();
            g gVar42 = (g) textView2.getLayoutParams();
            if (zR) {
                i13 = this.f5855I & 112;
                i14 = paddingLeft;
                if (i13 == 48) {
                }
                if (!z7) {
                }
            } else {
                i13 = this.f5855I & 112;
                i14 = paddingLeft;
                if (i13 == 48) {
                }
                if (!z7) {
                }
            }
        }
        b(this.f5862P, 3);
        size = this.f5862P.size();
        iE2 = iMax3;
        while (i22 < size) {
        }
        int i3322 = i16;
        b(this.f5862P, 5);
        size2 = this.f5862P.size();
        while (i23 < size2) {
        }
        b(this.f5862P, 1);
        int iW22 = w(this.f5862P, iArr);
        i24 = (i14 + (((i12 - i14) - i11) / 2)) - (iW22 / 2);
        int i3422 = iW22 + i24;
        if (i24 >= iE2) {
        }
        size3 = this.f5862P.size();
        while (i17 < size3) {
        }
        this.f5862P.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.f5864R;
        boolean zB = r0.b(this);
        int i9 = !zB ? 1 : 0;
        if (R(this.f5882p)) {
            H(this.f5882p, i7, 0, i8, 0, this.f5847A);
            measuredWidth = this.f5882p.getMeasuredWidth() + u(this.f5882p);
            iMax = Math.max(0, this.f5882p.getMeasuredHeight() + v(this.f5882p));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f5882p.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (R(this.f5886t)) {
            H(this.f5886t, i7, 0, i8, 0, this.f5847A);
            measuredWidth = this.f5886t.getMeasuredWidth() + u(this.f5886t);
            iMax = Math.max(iMax, this.f5886t.getMeasuredHeight() + v(this.f5886t));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5886t.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (R(this.f5879m)) {
            H(this.f5879m, i7, iMax3, i8, 0, this.f5847A);
            measuredWidth2 = this.f5879m.getMeasuredWidth() + u(this.f5879m);
            iMax = Math.max(iMax, this.f5879m.getMeasuredHeight() + v(this.f5879m));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5879m.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i9] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (R(this.f5887u)) {
            iMax4 += G(this.f5887u, i7, iMax4, i8, 0, iArr);
            iMax = Math.max(iMax, this.f5887u.getMeasuredHeight() + v(this.f5887u));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5887u.getMeasuredState());
        }
        if (R(this.f5883q)) {
            iMax4 += G(this.f5883q, i7, iMax4, i8, 0, iArr);
            iMax = Math.max(iMax, this.f5883q.getMeasuredHeight() + v(this.f5883q));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5883q.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((g) childAt.getLayoutParams()).f5900b == 0 && R(childAt)) {
                iMax4 += G(childAt, i7, iMax4, i8, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + v(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i11 = this.f5850D + this.f5851E;
        int i12 = this.f5848B + this.f5849C;
        if (R(this.f5880n)) {
            G(this.f5880n, i7, iMax4 + i12, i8, i11, iArr);
            int measuredWidth3 = this.f5880n.getMeasuredWidth() + u(this.f5880n);
            measuredHeight = this.f5880n.getMeasuredHeight() + v(this.f5880n);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f5880n.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (R(this.f5881o)) {
            iMax2 = Math.max(iMax2, G(this.f5881o, i7, iMax4 + i12, i8, measuredHeight + i11, iArr));
            measuredHeight += this.f5881o.getMeasuredHeight() + v(this.f5881o);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f5881o.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, (-16777216) & iCombineMeasuredStates2), Q() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f5879m;
        androidx.appcompat.view.menu.g gVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i7 = iVar.f5901o;
        if (i7 != 0 && this.f5871b0 != null && gVarN != null && (menuItemFindItem = gVarN.findItem(i7)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f5902p) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        i();
        this.f5852F.f(i7 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        i iVar2 = new i(super.onSaveInstanceState());
        f fVar = this.f5871b0;
        if (fVar != null && (iVar = fVar.f5898n) != null) {
            iVar2.f5901o = iVar.getItemId();
        }
        iVar2.f5902p = D();
        return iVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5860N = false;
        }
        if (!this.f5860N) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f5860N = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5860N = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC0521a.C0120a ? new g((AbstractC0521a.C0120a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    @Override // androidx.core.view.InterfaceC0598s
    public void s(InterfaceC0601v interfaceC0601v) {
        this.f5865S.a(interfaceC0601v);
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.f5877h0 != z6) {
            this.f5877h0 = z6;
            T();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(AbstractC1641a.b(getContext(), i7));
    }

    public void setCollapsible(boolean z6) {
        this.f5874e0 = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f5854H) {
            this.f5854H = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.f5853G) {
            this.f5853G = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i7) {
        setLogo(AbstractC1641a.b(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(AbstractC1641a.b(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m();
        this.f5882p.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f5867U = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        k();
        this.f5879m.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.f5889w != i7) {
            this.f5889w = i7;
            if (i7 == 0) {
                this.f5888v = getContext();
            } else {
                this.f5888v = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMarginBottom(int i7) {
        this.f5851E = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.f5849C = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.f5848B = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.f5850D = i7;
        requestLayout();
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public boolean x() {
        f fVar = this.f5871b0;
        return (fVar == null || fVar.f5898n == null) ? false : true;
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.f5879m;
        return actionMenuView != null && actionMenuView.H();
    }

    public void z(int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18727L);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        ImageButton imageButton = this.f5886t;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            this.f5886t.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f5886t;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f5884r);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!B(this.f5883q)) {
                c(this.f5883q, true);
            }
        } else {
            ImageView imageView = this.f5883q;
            if (imageView != null && B(imageView)) {
                removeView(this.f5883q);
                this.f5863Q.remove(this.f5883q);
            }
        }
        ImageView imageView2 = this.f5883q;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageView imageView = this.f5883q;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.f5882p;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            l0.a(this.f5882p, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!B(this.f5882p)) {
                c(this.f5882p, true);
            }
        } else {
            ImageButton imageButton = this.f5882p;
            if (imageButton != null && B(imageButton)) {
                removeView(this.f5882p);
                this.f5863Q.remove(this.f5882p);
            }
        }
        ImageButton imageButton2 = this.f5882p;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f5881o;
            if (textView != null && B(textView)) {
                removeView(this.f5881o);
                this.f5863Q.remove(this.f5881o);
            }
        } else {
            if (this.f5881o == null) {
                Context context = getContext();
                D d7 = new D(context);
                this.f5881o = d7;
                d7.setSingleLine();
                this.f5881o.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f5891y;
                if (i7 != 0) {
                    this.f5881o.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f5859M;
                if (colorStateList != null) {
                    this.f5881o.setTextColor(colorStateList);
                }
            }
            if (!B(this.f5881o)) {
                c(this.f5881o, true);
            }
        }
        TextView textView2 = this.f5881o;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f5857K = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f5859M = colorStateList;
        TextView textView = this.f5881o;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f5880n;
            if (textView != null && B(textView)) {
                removeView(this.f5880n);
                this.f5863Q.remove(this.f5880n);
            }
        } else {
            if (this.f5880n == null) {
                Context context = getContext();
                D d7 = new D(context);
                this.f5880n = d7;
                d7.setSingleLine();
                this.f5880n.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.f5890x;
                if (i7 != 0) {
                    this.f5880n.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.f5858L;
                if (colorStateList != null) {
                    this.f5880n.setTextColor(colorStateList);
                }
            }
            if (!B(this.f5880n)) {
                c(this.f5880n, true);
            }
        }
        TextView textView2 = this.f5880n;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f5856J = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f5858L = colorStateList;
        TextView textView = this.f5880n;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f5855I = 8388627;
        this.f5862P = new ArrayList();
        this.f5863Q = new ArrayList();
        this.f5864R = new int[2];
        this.f5865S = new C0599t(new Runnable() { // from class: androidx.appcompat.widget.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f6136m.A();
            }
        });
        this.f5866T = new ArrayList();
        this.f5868V = new a();
        this.f5878i0 = new b();
        h0 h0VarV = h0.v(getContext(), attributeSet, e.j.f19042d3, i7, 0);
        androidx.core.view.H.n0(this, context, e.j.f19042d3, attributeSet, h0VarV.r(), i7, 0);
        this.f5890x = h0VarV.n(e.j.f18930F3, 0);
        this.f5891y = h0VarV.n(e.j.f19137w3, 0);
        this.f5855I = h0VarV.l(e.j.f19047e3, this.f5855I);
        this.f5892z = h0VarV.l(e.j.f19052f3, 48);
        int iE = h0VarV.e(e.j.f19152z3, 0);
        iE = h0VarV.s(e.j.f18925E3) ? h0VarV.e(e.j.f18925E3, iE) : iE;
        this.f5851E = iE;
        this.f5850D = iE;
        this.f5849C = iE;
        this.f5848B = iE;
        int iE2 = h0VarV.e(e.j.f18915C3, -1);
        if (iE2 >= 0) {
            this.f5848B = iE2;
        }
        int iE3 = h0VarV.e(e.j.f18910B3, -1);
        if (iE3 >= 0) {
            this.f5849C = iE3;
        }
        int iE4 = h0VarV.e(e.j.f18920D3, -1);
        if (iE4 >= 0) {
            this.f5850D = iE4;
        }
        int iE5 = h0VarV.e(e.j.f18905A3, -1);
        if (iE5 >= 0) {
            this.f5851E = iE5;
        }
        this.f5847A = h0VarV.f(e.j.f19107q3, -1);
        int iE6 = h0VarV.e(e.j.f19087m3, Integer.MIN_VALUE);
        int iE7 = h0VarV.e(e.j.f19067i3, Integer.MIN_VALUE);
        int iF = h0VarV.f(e.j.f19077k3, 0);
        int iF2 = h0VarV.f(e.j.f19082l3, 0);
        i();
        this.f5852F.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f5852F.g(iE6, iE7);
        }
        this.f5853G = h0VarV.e(e.j.f19092n3, Integer.MIN_VALUE);
        this.f5854H = h0VarV.e(e.j.f19072j3, Integer.MIN_VALUE);
        this.f5884r = h0VarV.g(e.j.f19062h3);
        this.f5885s = h0VarV.p(e.j.f19057g3);
        CharSequence charSequenceP = h0VarV.p(e.j.f19147y3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = h0VarV.p(e.j.f19132v3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f5888v = getContext();
        setPopupTheme(h0VarV.n(e.j.f19127u3, 0));
        Drawable drawableG = h0VarV.g(e.j.f19122t3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = h0VarV.p(e.j.f19117s3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = h0VarV.g(e.j.f19097o3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = h0VarV.p(e.j.f19102p3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (h0VarV.s(e.j.f18935G3)) {
            setTitleTextColor(h0VarV.c(e.j.f18935G3));
        }
        if (h0VarV.s(e.j.f19142x3)) {
            setSubtitleTextColor(h0VarV.c(e.j.f19142x3));
        }
        if (h0VarV.s(e.j.f19112r3)) {
            z(h0VarV.n(e.j.f19112r3, 0));
        }
        h0VarV.w();
    }
}
