package com.swmansion.rnscreens;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.y;
import d5.C1608a;

/* JADX INFO: loaded from: classes.dex */
public final class u extends q implements v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private v5.l f18517A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AppBarLayout f18518u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Toolbar f18519v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f18520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f18522y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private C1590c f18523z;

    private static final class a extends Animation {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final q f18524m;

        public a(q qVar) {
            w5.k.f(qVar, "mFragment");
            this.f18524m = qVar;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f7, Transformation transformation) {
            w5.k.f(transformation, "t");
            super.applyTransformation(f7, transformation);
            this.f18524m.A(f7, !r3.isResumed());
        }
    }

    private static final class b extends CoordinatorLayout {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private final q f18525K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private final Animation.AnimationListener f18526L;

        public static final class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                w5.k.f(animation, "animation");
                b.this.f18525K.D();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                w5.k.f(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                w5.k.f(animation, "animation");
                b.this.f18525K.E();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, q qVar) {
            super(context);
            w5.k.f(context, "context");
            w5.k.f(qVar, "mFragment");
            this.f18525K = qVar;
            this.f18526L = new a();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }

        @Override // android.view.View
        public void startAnimation(Animation animation) {
            w5.k.f(animation, "animation");
            a aVar = new a(this.f18525K);
            aVar.setDuration(animation.getDuration());
            if ((animation instanceof AnimationSet) && !this.f18525K.isRemoving()) {
                AnimationSet animationSet = (AnimationSet) animation;
                animationSet.addAnimation(aVar);
                animationSet.setAnimationListener(this.f18526L);
                super.startAnimation(animationSet);
                return;
            }
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(animation);
            animationSet2.addAnimation(aVar);
            animationSet2.setAnimationListener(this.f18526L);
            super.startAnimation(animationSet2);
        }
    }

    public u() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    private final View J() {
        View viewG = g();
        while (viewG != null) {
            if (viewG.isFocused()) {
                return viewG;
            }
            viewG = viewG instanceof ViewGroup ? ((ViewGroup) viewG).getFocusedChild() : null;
        }
        return null;
    }

    private final void L() {
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof t) {
            ((t) parent).I();
        }
    }

    private final boolean R() {
        x headerConfig = g().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i7 = 0; i7 < configSubviewsCount; i7++) {
                if (headerConfig.e(i7).getType() == y.a.f18560q) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void S(Menu menu) {
        menu.clear();
        if (R()) {
            Context context = getContext();
            if (this.f18523z == null && context != null) {
                C1590c c1590c = new C1590c(context, this);
                this.f18523z = c1590c;
                v5.l lVar = this.f18517A;
                if (lVar != null) {
                    lVar.i(c1590c);
                }
            }
            MenuItem menuItemAdd = menu.add("");
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setActionView(this.f18523z);
        }
    }

    @Override // com.swmansion.rnscreens.q
    public void D() {
        super.D();
        L();
    }

    public boolean I() {
        n container = g().getContainer();
        if (!(container instanceof t)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
        }
        if (!w5.k.b(((t) container).getRootScreen(), g())) {
            return true;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof u) {
            return ((u) parentFragment).I();
        }
        return false;
    }

    public final C1590c K() {
        return this.f18523z;
    }

    public void M() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.f18518u;
        if (appBarLayout != null && (toolbar = this.f18519v) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.f18519v = null;
    }

    public final void N(v5.l lVar) {
        this.f18517A = lVar;
    }

    public void O(Toolbar toolbar) {
        w5.k.f(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.f18518u;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.e eVar = new AppBarLayout.e(-1, -2);
        eVar.g(0);
        toolbar.setLayoutParams(eVar);
        this.f18519v = toolbar;
    }

    public void P(boolean z6) {
        if (this.f18520w != z6) {
            AppBarLayout appBarLayout = this.f18518u;
            if (appBarLayout != null) {
                appBarLayout.setElevation(z6 ? 0.0f : com.facebook.react.uimanager.G.d(4.0f));
            }
            AppBarLayout appBarLayout2 = this.f18518u;
            if (appBarLayout2 != null) {
                appBarLayout2.setStateListAnimator(null);
            }
            this.f18520w = z6;
        }
    }

    public void Q(boolean z6) {
        if (this.f18521x != z6) {
            ViewGroup.LayoutParams layoutParams = g().getLayoutParams();
            w5.k.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.f) layoutParams).n(z6 ? null : new AppBarLayout.ScrollingViewBehavior());
            this.f18521x = z6;
        }
    }

    public void dismiss() {
        n container = g().getContainer();
        if (!(container instanceof t)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
        }
        ((t) container).D(this);
    }

    @Override // com.swmansion.rnscreens.q, com.swmansion.rnscreens.r
    public void k() {
        super.k();
        x headerConfig = g().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        w5.k.f(menu, "menu");
        w5.k.f(menuInflater, "inflater");
        S(menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.swmansion.rnscreens.q, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        w5.k.f(layoutInflater, "inflater");
        Context context = getContext();
        b bVar = context != null ? new b(context, this) : null;
        C1599l c1599lG = g();
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.n(this.f18521x ? null : new AppBarLayout.ScrollingViewBehavior());
        c1599lG.setLayoutParams(fVar);
        if (bVar != null) {
            bVar.addView(q.F(g()));
        }
        Context context2 = getContext();
        if (context2 != null) {
            appBarLayout = new AppBarLayout(context2);
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setLayoutParams(new AppBarLayout.e(-1, -2));
        } else {
            appBarLayout = null;
        }
        this.f18518u = appBarLayout;
        if (bVar != null) {
            bVar.addView(appBarLayout);
        }
        if (this.f18520w) {
            AppBarLayout appBarLayout3 = this.f18518u;
            if (appBarLayout3 != null) {
                appBarLayout3.setElevation(0.0f);
            }
            AppBarLayout appBarLayout4 = this.f18518u;
            if (appBarLayout4 != null) {
                appBarLayout4.setStateListAnimator(null);
            }
        }
        Toolbar toolbar = this.f18519v;
        if (toolbar != null && (appBarLayout2 = this.f18518u) != null) {
            appBarLayout2.addView(q.F(toolbar));
        }
        setHasOptionsMenu(true);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        w5.k.f(menu, "menu");
        S(menu);
        super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        View view = this.f18522y;
        if (view != null) {
            view.requestFocus();
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (C1608a.f18682a.a(getContext())) {
            this.f18522y = J();
        }
        super.onStop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C1599l c1599l) {
        super(c1599l);
        w5.k.f(c1599l, "screenView");
    }
}
