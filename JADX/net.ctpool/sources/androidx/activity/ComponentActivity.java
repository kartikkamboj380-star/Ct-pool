package androidx.activity;

import Y.c;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.AbstractActivityC0555g;
import androidx.core.app.AbstractC0550b;
import androidx.core.app.AbstractC0551c;
import androidx.core.app.C0556h;
import androidx.core.app.U;
import androidx.core.app.V;
import androidx.core.app.X;
import androidx.core.view.C0599t;
import androidx.core.view.InterfaceC0598s;
import androidx.core.view.InterfaceC0601v;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0650g;
import androidx.lifecycle.InterfaceC0653j;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import c.C0705a;
import c.InterfaceC0706b;
import d.AbstractC1600a;
import f0.AbstractC1642a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class ComponentActivity extends AbstractActivityC0555g implements androidx.lifecycle.l, I, InterfaceC0650g, Y.e, l, androidx.activity.result.d, androidx.core.content.d, androidx.core.content.e, U, V, InterfaceC0598s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final CopyOnWriteArrayList f4835A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final CopyOnWriteArrayList f4836B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f4837C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f4838D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final C0705a f4839o = new C0705a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C0599t f4840p = new C0599t(new Runnable() { // from class: androidx.activity.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f4881m.D();
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final androidx.lifecycle.m f4841q = new androidx.lifecycle.m(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Y.d f4842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private H f4843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final OnBackPressedDispatcher f4844t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f4845u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicInteger f4846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ActivityResultRegistry f4847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArrayList f4848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final CopyOnWriteArrayList f4849y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final CopyOnWriteArrayList f4850z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e7) {
                if (!TextUtils.equals(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e7;
                }
            }
        }
    }

    class b extends ActivityResultRegistry {

        class a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f4856m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ AbstractC1600a.C0249a f4857n;

            a(int i7, AbstractC1600a.C0249a c0249a) {
                this.f4856m = i7;
                this.f4857n = c0249a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f4856m, this.f4857n.a());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        class RunnableC0117b implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f4859m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f4860n;

            RunnableC0117b(int i7, IntentSender.SendIntentException sendIntentException) {
                this.f4859m = i7;
                this.f4860n = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f4859m, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f4860n));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public void f(int i7, AbstractC1600a abstractC1600a, Object obj, AbstractC0551c abstractC0551c) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC1600a.C0249a c0249aB = abstractC1600a.b(componentActivity, obj);
            if (c0249aB != null) {
                new Handler(Looper.getMainLooper()).post(new a(i7, c0249aB));
                return;
            }
            Intent intentA = abstractC1600a.a(componentActivity, obj);
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                AbstractC0550b.s(componentActivity, stringArrayExtra, i7);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                AbstractC0550b.u(componentActivity, intentA, i7, bundle);
                return;
            }
            androidx.activity.result.e eVar = (androidx.activity.result.e) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                AbstractC0550b.v(componentActivity, eVar.d(), i7, eVar.a(), eVar.b(), eVar.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e7) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0117b(i7, e7));
            }
        }
    }

    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f4862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        H f4863b;

        e() {
        }
    }

    public ComponentActivity() {
        Y.d dVarA = Y.d.a(this);
        this.f4842r = dVarA;
        this.f4844t = new OnBackPressedDispatcher(new a());
        this.f4846v = new AtomicInteger();
        this.f4847w = new b();
        this.f4848x = new CopyOnWriteArrayList();
        this.f4849y = new CopyOnWriteArrayList();
        this.f4850z = new CopyOnWriteArrayList();
        this.f4835A = new CopyOnWriteArrayList();
        this.f4836B = new CopyOnWriteArrayList();
        this.f4837C = false;
        this.f4838D = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC0653j() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.InterfaceC0653j
            public void g(androidx.lifecycle.l lVar, AbstractC0651h.b bVar) {
                if (bVar == AbstractC0651h.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        c.a(viewPeekDecorView);
                    }
                }
            }
        });
        getLifecycle().a(new InterfaceC0653j() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC0653j
            public void g(androidx.lifecycle.l lVar, AbstractC0651h.b bVar) {
                if (bVar == AbstractC0651h.b.ON_DESTROY) {
                    ComponentActivity.this.f4839o.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().a();
                }
            }
        });
        getLifecycle().a(new InterfaceC0653j() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.InterfaceC0653j
            public void g(androidx.lifecycle.l lVar, AbstractC0651h.b bVar) {
                ComponentActivity.this.B();
                ComponentActivity.this.getLifecycle().c(this);
            }
        });
        dVarA.c();
        y.c(this);
        getSavedStateRegistry().h("android:support:activity-result", new c.InterfaceC0101c() { // from class: androidx.activity.c
            @Override // Y.c.InterfaceC0101c
            public final Bundle a() {
                return this.f4882a.E();
            }
        });
        z(new InterfaceC0706b() { // from class: androidx.activity.d
            @Override // c.InterfaceC0706b
            public final void a(Context context) {
                this.f4883a.F(context);
            }
        });
    }

    private void C() {
        J.a(getWindow().getDecorView(), this);
        K.a(getWindow().getDecorView(), this);
        Y.f.a(getWindow().getDecorView(), this);
        n.a(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle E() {
        Bundle bundle = new Bundle();
        this.f4847w.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Context context) {
        Bundle bundleB = getSavedStateRegistry().b("android:support:activity-result");
        if (bundleB != null) {
            this.f4847w.g(bundleB);
        }
    }

    public final void A(androidx.core.util.a aVar) {
        this.f4850z.add(aVar);
    }

    void B() {
        if (this.f4843s == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f4843s = eVar.f4863b;
            }
            if (this.f4843s == null) {
                this.f4843s = new H();
            }
        }
    }

    public void D() {
        invalidateOptionsMenu();
    }

    public Object G() {
        return null;
    }

    public final androidx.activity.result.c H(AbstractC1600a abstractC1600a, androidx.activity.result.b bVar) {
        return I(abstractC1600a, this.f4847w, bVar);
    }

    public final androidx.activity.result.c I(AbstractC1600a abstractC1600a, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b bVar) {
        return activityResultRegistry.i("activity_rq#" + this.f4846v.getAndIncrement(), this, abstractC1600a, bVar);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.l
    public final OnBackPressedDispatcher b() {
        return this.f4844t;
    }

    @Override // androidx.core.view.InterfaceC0598s
    public void d(InterfaceC0601v interfaceC0601v) {
        this.f4840p.f(interfaceC0601v);
    }

    @Override // androidx.core.content.d
    public final void e(androidx.core.util.a aVar) {
        this.f4848x.add(aVar);
    }

    @Override // androidx.lifecycle.InterfaceC0650g
    public P.a getDefaultViewModelCreationExtras() {
        P.d dVar = new P.d();
        if (getApplication() != null) {
            dVar.c(F.a.f8296h, getApplication());
        }
        dVar.c(y.f8388a, this);
        dVar.c(y.f8389b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            dVar.c(y.f8390c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.l
    public AbstractC0651h getLifecycle() {
        return this.f4841q;
    }

    @Override // Y.e
    public final Y.c getSavedStateRegistry() {
        return this.f4842r.b();
    }

    @Override // androidx.lifecycle.I
    public H getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        B();
        return this.f4843s;
    }

    @Override // androidx.core.app.V
    public final void h(androidx.core.util.a aVar) {
        this.f4836B.remove(aVar);
    }

    @Override // androidx.core.content.e
    public final void i(androidx.core.util.a aVar) {
        this.f4849y.remove(aVar);
    }

    @Override // androidx.core.app.V
    public final void j(androidx.core.util.a aVar) {
        this.f4836B.add(aVar);
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry k() {
        return this.f4847w;
    }

    @Override // androidx.core.app.U
    public final void l(androidx.core.util.a aVar) {
        this.f4835A.add(aVar);
    }

    @Override // androidx.core.content.d
    public final void o(androidx.core.util.a aVar) {
        this.f4848x.remove(aVar);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f4847w.b(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f4844t.f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f4848x.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(configuration);
        }
    }

    @Override // androidx.core.app.AbstractActivityC0555g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f4842r.d(bundle);
        this.f4839o.c(this);
        super.onCreate(bundle);
        v.g(this);
        if (androidx.core.os.a.c()) {
            this.f4844t.g(d.a(this));
        }
        int i7 = this.f4845u;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        this.f4840p.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 0) {
            return this.f4840p.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6) {
        if (this.f4837C) {
            return;
        }
        Iterator it = this.f4835A.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(new C0556h(z6));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f4850z.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        this.f4840p.c(menu);
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6) {
        if (this.f4838D) {
            return;
        }
        Iterator it = this.f4836B.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(new X(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        this.f4840p.e(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (this.f4847w.b(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object objG = G();
        H h7 = this.f4843s;
        if (h7 == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            h7 = eVar.f4863b;
        }
        if (h7 == null && objG == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f4862a = objG;
        eVar2.f4863b = h7;
        return eVar2;
    }

    @Override // androidx.core.app.AbstractActivityC0555g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        AbstractC0651h lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.m) {
            ((androidx.lifecycle.m) lifecycle).o(AbstractC0651h.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f4842r.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f4849y.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(Integer.valueOf(i7));
        }
    }

    @Override // androidx.core.content.e
    public final void r(androidx.core.util.a aVar) {
        this.f4849y.add(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC1642a.h()) {
                AbstractC1642a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            AbstractC1642a.f();
        } catch (Throwable th) {
            AbstractC1642a.f();
            throw th;
        }
    }

    @Override // androidx.core.view.InterfaceC0598s
    public void s(InterfaceC0601v interfaceC0601v) {
        this.f4840p.a(interfaceC0601v);
    }

    @Override // android.app.Activity
    public void setContentView(int i7) {
        C();
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7) {
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // androidx.core.app.U
    public final void t(androidx.core.util.a aVar) {
        this.f4835A.remove(aVar);
    }

    public final void z(InterfaceC0706b interfaceC0706b) {
        this.f4839o.a(interfaceC0706b);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6, Configuration configuration) {
        this.f4837C = true;
        try {
            super.onMultiWindowModeChanged(z6, configuration);
            this.f4837C = false;
            Iterator it = this.f4835A.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new C0556h(z6, configuration));
            }
        } catch (Throwable th) {
            this.f4837C = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6, Configuration configuration) {
        this.f4838D = true;
        try {
            super.onPictureInPictureModeChanged(z6, configuration);
            this.f4838D = false;
            Iterator it = this.f4836B.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new X(z6, configuration));
            }
        } catch (Throwable th) {
            this.f4838D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        C();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C();
        super.setContentView(view, layoutParams);
    }
}
