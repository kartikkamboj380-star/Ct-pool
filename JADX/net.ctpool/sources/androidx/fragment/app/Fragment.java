package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.AbstractC0551c;
import androidx.core.app.Z;
import androidx.core.view.AbstractC0597q;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0650g;
import androidx.lifecycle.InterfaceC0653j;
import androidx.lifecycle.LiveData;
import d.AbstractC1600a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.InterfaceC1842a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.l, androidx.lifecycle.I, InterfaceC0650g, Y.e {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    F.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    w mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    o mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.m mLifecycleRegistry;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    Y.d mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    View mView;
    I mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    w mChildFragmentManager = new x();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new b();
    AbstractC0651h.c mMaxState = AbstractC0651h.c.RESUMED;
    androidx.lifecycle.q mViewLifecycleOwnerLiveData = new androidx.lifecycle.q();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<m> mOnPreAttachedListeners = new ArrayList<>();
    private final m mSavedStateAttachListener = new c();

    class a extends androidx.activity.result.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f7987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1600a f7988b;

        a(AtomicReference atomicReference, AbstractC1600a abstractC1600a) {
            this.f7987a = atomicReference;
            this.f7988b = abstractC1600a;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, AbstractC0551c abstractC0551c) {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f7987a.get();
            if (cVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar.b(obj, abstractC0551c);
        }

        @Override // androidx.activity.result.c
        public void c() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f7987a.getAndSet(null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    class c extends m {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.m
        void a() {
            Fragment.this.mSavedStateRegistryController.c();
            androidx.lifecycle.y.c(Fragment.this);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ K f7993m;

        e(K k7) {
            this.f7993m = k7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7993m.g();
        }
    }

    class f extends AbstractC0642l {
        f() {
        }

        @Override // androidx.fragment.app.AbstractC0642l
        public View f(int i7) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i7);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC0642l
        public boolean g() {
            return Fragment.this.mView != null;
        }
    }

    class g implements InterfaceC1842a {
        g() {
        }

        @Override // l.InterfaceC1842a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof androidx.activity.result.d ? ((androidx.activity.result.d) obj).k() : fragment.requireActivity().k();
        }
    }

    class h implements InterfaceC1842a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistry f7997a;

        h(ActivityResultRegistry activityResultRegistry) {
            this.f7997a = activityResultRegistry;
        }

        @Override // l.InterfaceC1842a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r12) {
            return this.f7997a;
        }
    }

    class i extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1842a f7999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f8000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC1600a f8001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.b f8002d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC1842a interfaceC1842a, AtomicReference atomicReference, AbstractC1600a abstractC1600a, androidx.activity.result.b bVar) {
            super(null);
            this.f7999a = interfaceC1842a;
            this.f8000b = atomicReference;
            this.f8001c = abstractC1600a;
            this.f8002d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.m
        void a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f8000b.set(((ActivityResultRegistry) this.f7999a.apply(null)).i(strGenerateActivityResultKey, Fragment.this, this.f8001c, this.f8002d));
        }
    }

    static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f8004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f8005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f8009f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f8010g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ArrayList f8011h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ArrayList f8012i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f8013j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f8014k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f8015l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f8016m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f8017n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f8018o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f8019p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f8020q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        float f8021r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        View f8022s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f8023t;

        j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f8014k = obj;
            this.f8015l = null;
            this.f8016m = obj;
            this.f8017n = null;
            this.f8018o = obj;
            this.f8021r = 1.0f;
            this.f8022s = null;
        }
    }

    static class k {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class m {
        private m() {
        }

        abstract void a();

        /* synthetic */ m(b bVar) {
            this();
        }
    }

    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final Bundle f8024m;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i7) {
                return new n[i7];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f8024m = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeBundle(this.f8024m);
        }
    }

    public Fragment() {
        o();
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private j l() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new j();
        }
        return this.mAnimationInfo;
    }

    private int m() {
        AbstractC0651h.c cVar = this.mMaxState;
        return (cVar == AbstractC0651h.c.INITIALIZED || this.mParentFragment == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.mParentFragment.m());
    }

    private Fragment n(boolean z6) {
        String str;
        if (z6) {
            L.c.j(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        w wVar = this.mFragmentManager;
        if (wVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return wVar.g0(str);
    }

    private void o() {
        this.mLifecycleRegistry = new androidx.lifecycle.m(this);
        this.mSavedStateRegistryController = Y.d.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        q(this.mSavedStateAttachListener);
    }

    private androidx.activity.result.c p(AbstractC1600a abstractC1600a, InterfaceC1842a interfaceC1842a, androidx.activity.result.b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            q(new i(interfaceC1842a, atomicReference, abstractC1600a, bVar));
            return new a(atomicReference, abstractC1600a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void q(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    private void r() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    void callStartTransitionListener(boolean z6) {
        ViewGroup viewGroup;
        w wVar;
        j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f8023t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (wVar = this.mFragmentManager) == null) {
            return;
        }
        K kN = K.n(viewGroup, wVar);
        kN.p();
        if (z6) {
            this.mHost.p().post(new e(kN));
        } else {
            kN.g();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    AbstractC0642l createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentN = n(false);
        if (fragmentN != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentN);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.l0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC0640j getActivity() {
        o oVar = this.mHost;
        if (oVar == null) {
            return null;
        }
        return (AbstractActivityC0640j) oVar.m();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f8020q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f8019p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8004a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final w getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        o oVar = this.mHost;
        if (oVar == null) {
            return null;
        }
        return oVar.n();
    }

    @Override // androidx.lifecycle.InterfaceC0650g
    public P.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && w.J0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        P.d dVar = new P.d();
        if (application != null) {
            dVar.c(F.a.f8296h, application);
        }
        dVar.c(androidx.lifecycle.y.f8388a, this);
        dVar.c(androidx.lifecycle.y.f8389b, this);
        if (getArguments() != null) {
            dVar.c(androidx.lifecycle.y.f8390c, getArguments());
        }
        return dVar;
    }

    public F.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && w.J0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.B(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8006c;
    }

    public Object getEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8013j;
    }

    Z getEnterTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    int getExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8007d;
    }

    public Object getExitTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8015l;
    }

    Z getExitTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    View getFocusedView() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8022s;
    }

    @Deprecated
    public final w getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        o oVar = this.mHost;
        if (oVar == null) {
            return null;
        }
        return oVar.u();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.l
    public AbstractC0651h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    int getNextTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8010g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final w getParentFragmentManager() {
        w wVar = this.mFragmentManager;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f8005b;
    }

    int getPopEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8008e;
    }

    int getPopExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f8009f;
    }

    float getPostOnViewCreatedAlpha() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f8021r;
    }

    public Object getReenterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f8016m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        L.c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f8014k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // Y.e
    public final Y.c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f8017n;
    }

    public Object getSharedElementReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f8018o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f8011h) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f8012i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i7) {
        return getResources().getString(i7);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return n(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        L.c.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i7) {
        return getResources().getText(i7);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.l getViewLifecycleOwner() {
        I i7 = this.mViewLifecycleOwner;
        if (i7 != null) {
            return i7;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.I
    public androidx.lifecycle.H getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m() != AbstractC0651h.c.INITIALIZED.ordinal()) {
            return this.mFragmentManager.E0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        o();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new x();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        w wVar;
        return this.mHidden || ((wVar = this.mFragmentManager) != null && wVar.M0(this.mParentFragment));
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        w wVar;
        return this.mMenuVisible && ((wVar = this.mFragmentManager) == null || wVar.N0(this.mParentFragment));
    }

    boolean isPostponed() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f8023t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        w wVar = this.mFragmentManager;
        if (wVar == null) {
            return false;
        }
        return wVar.Q0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.a1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (w.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.P0(1)) {
            return;
        }
        this.mChildFragmentManager.C();
    }

    public Animation onCreateAnimation(int i7, boolean z6, int i8) {
        return null;
    }

    public Animator onCreateAnimator(int i7, boolean z6, int i8) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7 = this.mContentLayoutId;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z6) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z6) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z6) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z6) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.a1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            r();
            this.mChildFragmentManager.y();
        } else {
            throw new M("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.n(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.n());
        if (this.mCalled) {
            this.mFragmentManager.I(this);
            this.mChildFragmentManager.z();
        } else {
            throw new M("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.B(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.a1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new InterfaceC0653j() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.InterfaceC0653j
            public void g(androidx.lifecycle.l lVar, AbstractC0651h.b bVar) {
                View view;
                if (bVar != AbstractC0651h.b.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                k.a(view);
            }
        });
        this.mSavedStateRegistryController.d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.h(AbstractC0651h.b.ON_CREATE);
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z6 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z6 = true;
        }
        return z6 | this.mChildFragmentManager.D(menu, menuInflater);
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.a1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new I(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.c();
            androidx.lifecycle.J.a(this.mView, this.mViewLifecycleOwner);
            androidx.lifecycle.K.a(this.mView, this.mViewLifecycleOwner);
            Y.f.a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.n(this.mViewLifecycleOwner);
        }
    }

    void performDestroy() {
        this.mChildFragmentManager.E();
        this.mLifecycleRegistry.h(AbstractC0651h.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.F();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().e(AbstractC0651h.c.CREATED)) {
            this.mViewLifecycleOwner.a(AbstractC0651h.b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).d();
            this.mPerformedCreateView = false;
        } else {
            throw new M("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.I0()) {
                return;
            }
            this.mChildFragmentManager.E();
            this.mChildFragmentManager = new x();
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z6) {
        onMultiWindowModeChanged(z6);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.K(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.L(menu);
    }

    void performPause() {
        this.mChildFragmentManager.N();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC0651h.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.h(AbstractC0651h.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z6) {
        onPictureInPictureModeChanged(z6);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z6 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z6 = true;
        }
        return z6 | this.mChildFragmentManager.P(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zO0 = this.mFragmentManager.O0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zO0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zO0);
            onPrimaryNavigationFragmentChanged(zO0);
            this.mChildFragmentManager.Q();
        }
    }

    void performResume() {
        this.mChildFragmentManager.a1();
        this.mChildFragmentManager.b0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new M("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.m mVar = this.mLifecycleRegistry;
        AbstractC0651h.b bVar = AbstractC0651h.b.ON_RESUME;
        mVar.h(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(bVar);
        }
        this.mChildFragmentManager.R();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
        Bundle bundleO1 = this.mChildFragmentManager.R0();
        if (bundleO1 != null) {
            bundle.putParcelable("android:support:fragments", bundleO1);
        }
    }

    void performStart() {
        this.mChildFragmentManager.a1();
        this.mChildFragmentManager.b0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new M("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.m mVar = this.mLifecycleRegistry;
        AbstractC0651h.b bVar = AbstractC0651h.b.ON_START;
        mVar.h(bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(bVar);
        }
        this.mChildFragmentManager.S();
    }

    void performStop() {
        this.mChildFragmentManager.U();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC0651h.b.ON_STOP);
        }
        this.mLifecycleRegistry.h(AbstractC0651h.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new M("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.V();
    }

    public void postponeEnterTransition() {
        l().f8023t = true;
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(AbstractC1600a abstractC1600a, androidx.activity.result.b bVar) {
        return p(abstractC1600a, new g(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i7) {
        if (this.mHost != null) {
            getParentFragmentManager().W0(this, strArr, i7);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final AbstractActivityC0640j requireActivity() {
        AbstractActivityC0640j activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final w requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m1(parcelable);
        this.mChildFragmentManager.C();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.e(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(AbstractC0651h.b.ON_CREATE);
            }
        } else {
            throw new M("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z6) {
        l().f8020q = Boolean.valueOf(z6);
    }

    public void setAllowReturnTransitionOverlap(boolean z6) {
        l().f8019p = Boolean.valueOf(z6);
    }

    void setAnimations(int i7, int i8, int i9, int i10) {
        if (this.mAnimationInfo == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        l().f8006c = i7;
        l().f8007d = i8;
        l().f8008e = i9;
        l().f8009f = i10;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(Z z6) {
        l().getClass();
    }

    public void setEnterTransition(Object obj) {
        l().f8013j = obj;
    }

    public void setExitSharedElementCallback(Z z6) {
        l().getClass();
    }

    public void setExitTransition(Object obj) {
        l().f8015l = obj;
    }

    void setFocusedView(View view) {
        l().f8022s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z6) {
        if (this.mHasMenu != z6) {
            this.mHasMenu = z6;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.A();
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f8024m) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z6) {
        if (this.mMenuVisible != z6) {
            this.mMenuVisible = z6;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.A();
            }
        }
    }

    void setNextTransition(int i7) {
        if (this.mAnimationInfo == null && i7 == 0) {
            return;
        }
        l();
        this.mAnimationInfo.f8010g = i7;
    }

    void setPopDirection(boolean z6) {
        if (this.mAnimationInfo == null) {
            return;
        }
        l().f8005b = z6;
    }

    void setPostOnViewCreatedAlpha(float f7) {
        l().f8021r = f7;
    }

    public void setReenterTransition(Object obj) {
        l().f8016m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z6) {
        L.c.k(this);
        this.mRetainInstance = z6;
        w wVar = this.mFragmentManager;
        if (wVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z6) {
            wVar.l(this);
        } else {
            wVar.k1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        l().f8014k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        l().f8017n = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        l();
        j jVar = this.mAnimationInfo;
        jVar.f8011h = arrayList;
        jVar.f8012i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        l().f8018o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i7) {
        if (fragment != null) {
            L.c.l(this, fragment, i7);
        }
        w wVar = this.mFragmentManager;
        w wVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (wVar != null && wVar2 != null && wVar != wVar2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragmentN = fragment; fragmentN != null; fragmentN = fragmentN.n(false)) {
            if (fragmentN.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
        } else {
            if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
                this.mTargetRequestCode = i7;
            }
            this.mTargetWho = fragment.mWho;
        }
        this.mTarget = null;
        this.mTargetRequestCode = i7;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z6) {
        L.c.m(this, z6);
        if (!this.mUserVisibleHint && z6 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            w wVar = this.mFragmentManager;
            wVar.c1(wVar.w(this));
        }
        this.mUserVisibleHint = z6;
        this.mDeferStart = this.mState < 5 && !z6;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z6);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        o oVar = this.mHost;
        if (oVar != null) {
            return oVar.x(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i7) {
        startActivityForResult(intent, i7, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i7 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().Y0(this, intentSender, i7, intent, i8, i9, i10, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !l().f8023t) {
            return;
        }
        if (this.mHost == null) {
            l().f8023t = false;
        } else if (Looper.myLooper() != this.mHost.p().getLooper()) {
            this.mHost.p().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) androidx.fragment.app.n.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e7) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e7);
        } catch (InstantiationException e8) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (NoSuchMethodException e9) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e9);
        } catch (InvocationTargetException e10) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e10);
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        o oVar = this.mHost;
        if (oVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterV = oVar.v();
        AbstractC0597q.a(layoutInflaterV, this.mChildFragmentManager.x0());
        return layoutInflaterV;
    }

    public final String getString(int i7, Object... objArr) {
        return getResources().getString(i7, objArr);
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        o oVar = this.mHost;
        Activity activityM = oVar == null ? null : oVar.m();
        if (activityM != null) {
            this.mCalled = false;
            onAttach(activityM);
        }
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        o oVar = this.mHost;
        Activity activityM = oVar == null ? null : oVar.m();
        if (activityM != null) {
            this.mCalled = false;
            onInflate(activityM, attributeSet, bundle);
        }
    }

    public final void postponeEnterTransition(long j7, TimeUnit timeUnit) {
        l().f8023t = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        w wVar = this.mFragmentManager;
        this.mPostponedHandler = wVar != null ? wVar.w0().p() : new Handler(Looper.getMainLooper());
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j7));
    }

    public final <I, O> androidx.activity.result.c registerForActivityResult(AbstractC1600a abstractC1600a, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b bVar) {
        return p(abstractC1600a, new h(activityResultRegistry), bVar);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        o oVar = this.mHost;
        if (oVar != null) {
            oVar.y(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i7, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().X0(this, intent, i7, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
}
