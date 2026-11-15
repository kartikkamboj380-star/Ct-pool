package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.K;
import androidx.lifecycle.AbstractC0651h;

/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f7944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f7945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fragment f7946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7947d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7948e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ View f7949m;

        a(View view) {
            this.f7949m = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f7949m.removeOnAttachStateChangeListener(this);
            androidx.core.view.H.m0(this.f7949m);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7951a;

        static {
            int[] iArr = new int[AbstractC0651h.c.values().length];
            f7951a = iArr;
            try {
                iArr[AbstractC0651h.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7951a[AbstractC0651h.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7951a[AbstractC0651h.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7951a[AbstractC0651h.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    C(q qVar, D d7, Fragment fragment) {
        this.f7944a = qVar;
        this.f7945b = d7;
        this.f7946c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f7946c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f7946c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f7946c.performSaveInstanceState(bundle);
        this.f7944a.j(this.f7946c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f7946c.mView != null) {
            s();
        }
        if (this.f7946c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f7946c.mSavedViewState);
        }
        if (this.f7946c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f7946c.mSavedViewRegistryState);
        }
        if (!this.f7946c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f7946c.mUserVisibleHint);
        }
        return bundle;
    }

    void a() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f7946c);
        }
        Fragment fragment = this.f7946c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        q qVar = this.f7944a;
        Fragment fragment2 = this.f7946c;
        qVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    void b() {
        int iJ = this.f7945b.j(this.f7946c);
        Fragment fragment = this.f7946c;
        fragment.mContainer.addView(fragment.mView, iJ);
    }

    void c() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f7946c);
        }
        Fragment fragment = this.f7946c;
        Fragment fragment2 = fragment.mTarget;
        C cN = null;
        if (fragment2 != null) {
            C cN2 = this.f7945b.n(fragment2.mWho);
            if (cN2 == null) {
                throw new IllegalStateException("Fragment " + this.f7946c + " declared target fragment " + this.f7946c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f7946c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            cN = cN2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (cN = this.f7945b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f7946c + " declared target fragment " + this.f7946c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (cN != null) {
            cN.m();
        }
        Fragment fragment4 = this.f7946c;
        fragment4.mHost = fragment4.mFragmentManager.w0();
        Fragment fragment5 = this.f7946c;
        fragment5.mParentFragment = fragment5.mFragmentManager.z0();
        this.f7944a.g(this.f7946c, false);
        this.f7946c.performAttach();
        this.f7944a.b(this.f7946c, false);
    }

    int d() {
        Fragment fragment = this.f7946c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f7948e;
        int i7 = b.f7951a[fragment.mMaxState.ordinal()];
        if (i7 != 1) {
            iMin = i7 != 2 ? i7 != 3 ? i7 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f7946c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f7948e, 2);
                View view = this.f7946c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f7948e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f7946c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f7946c;
        ViewGroup viewGroup = fragment3.mContainer;
        K.e.b bVarL = viewGroup != null ? K.n(viewGroup, fragment3.getParentFragmentManager()).l(this) : null;
        if (bVarL == K.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == K.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f7946c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f7946c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f7946c);
        }
        return iMin;
    }

    void e() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f7946c);
        }
        Fragment fragment = this.f7946c;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f7946c.mState = 1;
            return;
        }
        this.f7944a.h(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f7946c;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        q qVar = this.f7944a;
        Fragment fragment3 = this.f7946c;
        qVar.c(fragment3, fragment3.mSavedFragmentState, false);
    }

    void f() {
        String resourceName;
        if (this.f7946c.mFromLayout) {
            return;
        }
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f7946c);
        }
        Fragment fragment = this.f7946c;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f7946c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i7 = fragment2.mContainerId;
            if (i7 == 0) {
                viewGroup = null;
            } else {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f7946c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.s0().f(this.f7946c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f7946c;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f7946c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f7946c.mContainerId) + " (" + resourceName + ") for fragment " + this.f7946c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    L.c.n(this.f7946c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f7946c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f7946c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f7946c;
            fragment5.mView.setTag(K.b.f1831a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f7946c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (androidx.core.view.H.S(this.f7946c.mView)) {
                androidx.core.view.H.m0(this.f7946c.mView);
            } else {
                View view2 = this.f7946c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f7946c.performViewCreated();
            q qVar = this.f7944a;
            Fragment fragment7 = this.f7946c;
            qVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f7946c.mView.getVisibility();
            this.f7946c.setPostOnViewCreatedAlpha(this.f7946c.mView.getAlpha());
            Fragment fragment8 = this.f7946c;
            if (fragment8.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment8.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f7946c.setFocusedView(viewFindFocus);
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f7946c);
                    }
                }
                this.f7946c.mView.setAlpha(0.0f);
            }
        }
        this.f7946c.mState = 2;
    }

    void g() {
        Fragment fragmentF;
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f7946c);
        }
        Fragment fragment = this.f7946c;
        boolean zIsChangingConfigurations = true;
        boolean z6 = fragment.mRemoving && !fragment.isInBackStack();
        if (z6) {
            Fragment fragment2 = this.f7946c;
            if (!fragment2.mBeingSaved) {
                this.f7945b.B(fragment2.mWho, null);
            }
        }
        if (!z6 && !this.f7945b.p().r(this.f7946c)) {
            String str = this.f7946c.mTargetWho;
            if (str != null && (fragmentF = this.f7945b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f7946c.mTarget = fragmentF;
            }
            this.f7946c.mState = 0;
            return;
        }
        o oVar = this.f7946c.mHost;
        if (oVar instanceof androidx.lifecycle.I) {
            zIsChangingConfigurations = this.f7945b.p().o();
        } else if (oVar.n() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) oVar.n()).isChangingConfigurations();
        }
        if ((z6 && !this.f7946c.mBeingSaved) || zIsChangingConfigurations) {
            this.f7945b.p().g(this.f7946c);
        }
        this.f7946c.performDestroy();
        this.f7944a.d(this.f7946c, false);
        for (C c7 : this.f7945b.k()) {
            if (c7 != null) {
                Fragment fragmentK = c7.k();
                if (this.f7946c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f7946c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f7946c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f7945b.f(str2);
        }
        this.f7945b.s(this);
    }

    void h() {
        View view;
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f7946c);
        }
        Fragment fragment = this.f7946c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f7946c.performDestroyView();
        this.f7944a.n(this.f7946c, false);
        Fragment fragment2 = this.f7946c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.n(null);
        this.f7946c.mInLayout = false;
    }

    void i() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f7946c);
        }
        this.f7946c.performDetach();
        this.f7944a.e(this.f7946c, false);
        Fragment fragment = this.f7946c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f7945b.p().r(this.f7946c)) {
            return;
        }
        if (w.J0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f7946c);
        }
        this.f7946c.initState();
    }

    void j() {
        Fragment fragment = this.f7946c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (w.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f7946c);
            }
            Fragment fragment2 = this.f7946c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f7946c.mSavedFragmentState);
            View view = this.f7946c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f7946c;
                fragment3.mView.setTag(K.b.f1831a, fragment3);
                Fragment fragment4 = this.f7946c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f7946c.performViewCreated();
                q qVar = this.f7944a;
                Fragment fragment5 = this.f7946c;
                qVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f7946c.mState = 2;
            }
        }
    }

    Fragment k() {
        return this.f7946c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f7947d) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f7947d = true;
            boolean z6 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f7946c;
                int i7 = fragment.mState;
                if (iD == i7) {
                    if (!z6 && i7 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f7946c.mBeingSaved) {
                        if (w.J0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f7946c);
                        }
                        this.f7945b.p().g(this.f7946c);
                        this.f7945b.s(this);
                        if (w.J0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f7946c);
                        }
                        this.f7946c.initState();
                    }
                    Fragment fragment2 = this.f7946c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            K kN = K.n(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f7946c.mHidden) {
                                kN.c(this);
                            } else {
                                kN.e(this);
                            }
                        }
                        Fragment fragment3 = this.f7946c;
                        w wVar = fragment3.mFragmentManager;
                        if (wVar != null) {
                            wVar.H0(fragment3);
                        }
                        Fragment fragment4 = this.f7946c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f7946c.mChildFragmentManager.J();
                    }
                    this.f7947d = false;
                    return;
                }
                if (iD <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f7945b.q(fragment.mWho) == null) {
                                r();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f7946c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (w.J0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f7946c);
                            }
                            Fragment fragment5 = this.f7946c;
                            if (fragment5.mBeingSaved) {
                                r();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f7946c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                K.n(viewGroup2, fragment6.getParentFragmentManager()).d(this);
                            }
                            this.f7946c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                K.n(viewGroup3, fragment.getParentFragmentManager()).b(K.e.c.h(this.f7946c.mView.getVisibility()), this);
                            }
                            this.f7946c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z6 = true;
            }
        } catch (Throwable th) {
            this.f7947d = false;
            throw th;
        }
    }

    void n() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f7946c);
        }
        this.f7946c.performPause();
        this.f7944a.f(this.f7946c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f7946c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f7946c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f7946c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f7946c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f7946c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f7946c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f7946c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f7946c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    void p() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f7946c);
        }
        View focusedView = this.f7946c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (w.J0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f7946c);
                sb.append(" resulting in focused view ");
                sb.append(this.f7946c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f7946c.setFocusedView(null);
        this.f7946c.performResume();
        this.f7944a.i(this.f7946c, false);
        Fragment fragment = this.f7946c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    void r() {
        B b7 = new B(this.f7946c);
        Fragment fragment = this.f7946c;
        if (fragment.mState <= -1 || b7.f7943y != null) {
            b7.f7943y = fragment.mSavedFragmentState;
        } else {
            Bundle bundleQ = q();
            b7.f7943y = bundleQ;
            if (this.f7946c.mTargetWho != null) {
                if (bundleQ == null) {
                    b7.f7943y = new Bundle();
                }
                b7.f7943y.putString("android:target_state", this.f7946c.mTargetWho);
                int i7 = this.f7946c.mTargetRequestCode;
                if (i7 != 0) {
                    b7.f7943y.putInt("android:target_req_state", i7);
                }
            }
        }
        this.f7945b.B(this.f7946c.mWho, b7);
    }

    void s() {
        if (this.f7946c.mView == null) {
            return;
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f7946c + " with view " + this.f7946c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f7946c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f7946c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f7946c.mViewLifecycleOwner.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f7946c.mSavedViewRegistryState = bundle;
    }

    void t(int i7) {
        this.f7948e = i7;
    }

    void u() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f7946c);
        }
        this.f7946c.performStart();
        this.f7944a.k(this.f7946c, false);
    }

    void v() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f7946c);
        }
        this.f7946c.performStop();
        this.f7944a.l(this.f7946c, false);
    }

    C(q qVar, D d7, Fragment fragment, B b7) {
        this.f7944a = qVar;
        this.f7945b = d7;
        this.f7946c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = b7.f7943y;
        fragment.mSavedFragmentState = bundle == null ? new Bundle() : bundle;
    }

    C(q qVar, D d7, ClassLoader classLoader, n nVar, B b7) {
        this.f7944a = qVar;
        this.f7945b = d7;
        Fragment fragmentA = b7.a(nVar, classLoader);
        this.f7946c = fragmentA;
        if (w.J0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }
}
