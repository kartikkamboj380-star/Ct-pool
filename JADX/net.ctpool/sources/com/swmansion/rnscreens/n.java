package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.AbstractActivityC0640j;
import androidx.fragment.app.Fragment;
import c5.C0744g;
import com.facebook.react.X;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0872e0;
import com.swmansion.rnscreens.C1599l;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m2.AbstractChoreographerFrameCallbackC1870a;

/* JADX INFO: loaded from: classes.dex */
public class n extends ViewGroup {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final ArrayList f18475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected androidx.fragment.app.w f18476n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f18477o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18478p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18479q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AbstractChoreographerFrameCallbackC1870a f18480r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private r f18481s;

    public static final class a extends AbstractChoreographerFrameCallbackC1870a {
        a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            n.this.f18479q = false;
            n nVar = n.this;
            nVar.measure(View.MeasureSpec.makeMeasureSpec(nVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(n.this.getHeight(), 1073741824));
            n nVar2 = n.this;
            nVar2.layout(nVar2.getLeft(), n.this.getTop(), n.this.getRight(), n.this.getBottom());
        }
    }

    public n(Context context) {
        super(context);
        this.f18475m = new ArrayList();
        this.f18480r = new a();
    }

    private final void f(androidx.fragment.app.E e7, Fragment fragment) {
        e7.b(getId(), fragment);
    }

    private final void i(androidx.fragment.app.E e7, Fragment fragment) {
        e7.m(fragment);
    }

    private final androidx.fragment.app.w j(X x6) {
        boolean z6;
        androidx.fragment.app.w childFragmentManager;
        Context context = x6.getContext();
        while (true) {
            z6 = context instanceof AbstractActivityC0640j;
            if (z6 || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!z6) {
            throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity".toString());
        }
        AbstractActivityC0640j abstractActivityC0640j = (AbstractActivityC0640j) context;
        if (abstractActivityC0640j.O().v0().isEmpty()) {
            childFragmentManager = abstractActivityC0640j.O();
        } else {
            try {
                childFragmentManager = androidx.fragment.app.w.i0(x6).getChildFragmentManager();
            } catch (IllegalStateException unused) {
                childFragmentManager = abstractActivityC0640j.O();
            }
        }
        w5.k.c(childFragmentManager);
        return childFragmentManager;
    }

    private final C1599l.a k(r rVar) {
        return rVar.g().getActivityState();
    }

    private final void r() {
        this.f18478p = true;
        Context context = getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((C0872e0) context).b().runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.m
            @Override // java.lang.Runnable
            public final void run() {
                n.s(this.f18474m);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(n nVar) {
        w5.k.f(nVar, "this$0");
        nVar.u();
    }

    private final void setFragmentManager(androidx.fragment.app.w wVar) {
        this.f18476n = wVar;
        v();
    }

    private final void x(androidx.fragment.app.w wVar) {
        androidx.fragment.app.E eP = wVar.p();
        w5.k.e(eP, "beginTransaction(...)");
        boolean z6 = false;
        for (Fragment fragment : wVar.v0()) {
            if ((fragment instanceof q) && ((q) fragment).g().getContainer() == this) {
                eP.m(fragment);
                z6 = true;
            }
        }
        if (z6) {
            eP.j();
        }
    }

    private final void z() {
        boolean z6;
        i5.u uVar;
        ViewParent parent = this;
        while (true) {
            z6 = parent instanceof X;
            if (z6 || (parent instanceof C1599l) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            w5.k.e(parent, "getParent(...)");
        }
        if (!(parent instanceof C1599l)) {
            if (!z6) {
                throw new IllegalStateException("ScreenContainer is not attached under ReactRootView".toString());
            }
            setFragmentManager(j((X) parent));
            return;
        }
        r fragmentWrapper = ((C1599l) parent).getFragmentWrapper();
        if (fragmentWrapper != null) {
            this.f18481s = fragmentWrapper;
            fragmentWrapper.j(this);
            androidx.fragment.app.w childFragmentManager = fragmentWrapper.e().getChildFragmentManager();
            w5.k.e(childFragmentManager, "getChildFragmentManager(...)");
            setFragmentManager(childFragmentManager);
            uVar = i5.u.f19985a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            throw new IllegalStateException("Parent Screen does not have its Fragment attached".toString());
        }
    }

    protected r c(C1599l c1599l) {
        w5.k.f(c1599l, "screen");
        return new q(c1599l);
    }

    public final void d(C1599l c1599l, int i7) {
        w5.k.f(c1599l, "screen");
        r rVarC = c(c1599l);
        c1599l.setFragmentWrapper(rVarC);
        this.f18475m.add(i7, rVarC);
        c1599l.setContainer(this);
        r();
    }

    public final void e() {
        if (this.f18475m.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.E eG = g();
        C1599l topScreen = getTopScreen();
        w5.k.d(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        Fragment fragment = topScreen.getFragment();
        w5.k.d(fragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        i(eG, fragment);
        ArrayList arrayList = this.f18475m;
        f(eG, ((r) arrayList.get(arrayList.size() - 2)).e());
        Fragment fragment2 = topScreen.getFragment();
        w5.k.d(fragment2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        f(eG, fragment2);
        eG.j();
    }

    protected final androidx.fragment.app.E g() {
        androidx.fragment.app.w wVar = this.f18476n;
        if (wVar == null) {
            throw new IllegalArgumentException("fragment manager is null when creating transaction".toString());
        }
        androidx.fragment.app.E eS = wVar.p().s(true);
        w5.k.e(eS, "setReorderingAllowed(...)");
        return eS;
    }

    public final int getScreenCount() {
        return this.f18475m.size();
    }

    public C1599l getTopScreen() {
        Object next;
        Iterator it = this.f18475m.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (k((r) next) == C1599l.a.f18437o) {
                break;
            }
        }
        r rVar = (r) next;
        if (rVar != null) {
            return rVar.g();
        }
        return null;
    }

    public final void h() {
        if (this.f18475m.size() < 2) {
            throw new RuntimeException("[RNScreens] Unable to run transition for less than 2 screens.");
        }
        androidx.fragment.app.E eG = g();
        ArrayList arrayList = this.f18475m;
        i(eG, ((r) arrayList.get(arrayList.size() - 2)).e());
        eG.j();
    }

    public final C1599l l(int i7) {
        return ((r) this.f18475m.get(i7)).g();
    }

    public final r m(int i7) {
        Object obj = this.f18475m.get(i7);
        w5.k.e(obj, "get(...)");
        return (r) obj;
    }

    public boolean n(r rVar) {
        return AbstractC1809n.D(this.f18475m, rVar);
    }

    public final void o() {
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18477o = true;
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.fragment.app.w wVar = this.f18476n;
        if (wVar != null && !wVar.I0()) {
            x(wVar);
            wVar.f0();
        }
        r rVar = this.f18481s;
        if (rVar != null) {
            rVar.a(this);
        }
        this.f18481s = null;
        super.onDetachedFromWindow();
        this.f18477o = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            } else {
                removeViewAt(childCount);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).measure(i7, i8);
        }
    }

    protected void p() {
        r fragmentWrapper;
        C1599l topScreen = getTopScreen();
        if (topScreen == null || (fragmentWrapper = topScreen.getFragmentWrapper()) == null) {
            return;
        }
        fragmentWrapper.k();
    }

    public final void q() {
        C1599l topScreen = getTopScreen();
        w5.k.d(topScreen, "null cannot be cast to non-null type com.swmansion.rnscreens.Screen");
        if (getContext() instanceof ReactContext) {
            int iE = AbstractC0884k0.e(getContext());
            Context context = getContext();
            w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c((ReactContext) context, topScreen.getId());
            if (eVarC != null) {
                eVarC.c(new C0744g(iE, topScreen.getId()));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        w5.k.f(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            w5.k.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f18479q || this.f18480r == null) {
            return;
        }
        this.f18479q = true;
        com.facebook.react.modules.core.a.h().m(a.b.NATIVE_ANIMATED_MODULE, this.f18480r);
    }

    public void t() {
        androidx.fragment.app.E eG = g();
        androidx.fragment.app.w wVar = this.f18476n;
        if (wVar == null) {
            throw new IllegalArgumentException("fragment manager is null when performing update in ScreenContainer".toString());
        }
        HashSet hashSet = new HashSet(wVar.v0());
        for (r rVar : this.f18475m) {
            w5.k.c(rVar);
            if (k(rVar) == C1599l.a.f18435m && rVar.e().isAdded()) {
                i(eG, rVar.e());
            }
            hashSet.remove(rVar.e());
        }
        boolean z6 = false;
        if (!hashSet.isEmpty()) {
            for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                if ((fragment instanceof q) && ((q) fragment).g().getContainer() == null) {
                    i(eG, fragment);
                }
            }
        }
        boolean z7 = getTopScreen() == null;
        ArrayList arrayList = new ArrayList();
        for (r rVar2 : this.f18475m) {
            w5.k.c(rVar2);
            C1599l.a aVarK = k(rVar2);
            C1599l.a aVar = C1599l.a.f18435m;
            if (aVarK != aVar && !rVar2.e().isAdded()) {
                f(eG, rVar2.e());
                z6 = true;
            } else if (aVarK != aVar && z6) {
                i(eG, rVar2.e());
                arrayList.add(rVar2);
            }
            rVar2.g().setTransitioning(z7);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(eG, ((r) it.next()).e());
        }
        eG.j();
    }

    public final void u() {
        androidx.fragment.app.w wVar;
        if (this.f18478p && this.f18477o && (wVar = this.f18476n) != null) {
            if (wVar == null || !wVar.I0()) {
                this.f18478p = false;
                t();
                p();
            }
        }
    }

    protected final void v() {
        this.f18478p = true;
        u();
    }

    public void w() {
        Iterator it = this.f18475m.iterator();
        while (it.hasNext()) {
            ((r) it.next()).g().setContainer(null);
        }
        this.f18475m.clear();
        r();
    }

    public void y(int i7) {
        ((r) this.f18475m.get(i7)).g().setContainer(null);
        this.f18475m.remove(i7);
        r();
    }
}
