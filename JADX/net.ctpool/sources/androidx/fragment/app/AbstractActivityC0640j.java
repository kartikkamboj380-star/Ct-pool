package androidx.fragment.app;

import Y.c;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.AbstractC0550b;
import androidx.core.app.U;
import androidx.core.app.V;
import androidx.core.view.InterfaceC0598s;
import androidx.core.view.InterfaceC0601v;
import androidx.lifecycle.AbstractC0651h;
import c.InterfaceC0706b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0640j extends ComponentActivity implements AbstractC0550b.c {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    boolean f8168G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f8169H;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final C0643m f8166E = C0643m.b(new a());

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final androidx.lifecycle.m f8167F = new androidx.lifecycle.m(this);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f8170I = true;

    /* JADX INFO: renamed from: androidx.fragment.app.j$a */
    class a extends o implements androidx.core.content.d, androidx.core.content.e, U, V, androidx.lifecycle.I, androidx.activity.l, androidx.activity.result.d, Y.e, A, InterfaceC0598s {
        public a() {
            super(AbstractActivityC0640j.this);
        }

        @Override // androidx.fragment.app.o
        public void A() {
            B();
        }

        public void B() {
            AbstractActivityC0640j.this.D();
        }

        @Override // androidx.fragment.app.o
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC0640j u() {
            return AbstractActivityC0640j.this;
        }

        @Override // androidx.fragment.app.A
        public void a(w wVar, Fragment fragment) {
            AbstractActivityC0640j.this.X(fragment);
        }

        @Override // androidx.activity.l
        public OnBackPressedDispatcher b() {
            return AbstractActivityC0640j.this.b();
        }

        @Override // androidx.core.view.InterfaceC0598s
        public void d(InterfaceC0601v interfaceC0601v) {
            AbstractActivityC0640j.this.d(interfaceC0601v);
        }

        @Override // androidx.core.content.d
        public void e(androidx.core.util.a aVar) {
            AbstractActivityC0640j.this.e(aVar);
        }

        @Override // androidx.fragment.app.AbstractC0642l
        public View f(int i7) {
            return AbstractActivityC0640j.this.findViewById(i7);
        }

        @Override // androidx.fragment.app.AbstractC0642l
        public boolean g() {
            Window window = AbstractActivityC0640j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.l
        public AbstractC0651h getLifecycle() {
            return AbstractActivityC0640j.this.f8167F;
        }

        @Override // Y.e
        public Y.c getSavedStateRegistry() {
            return AbstractActivityC0640j.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.I
        public androidx.lifecycle.H getViewModelStore() {
            return AbstractActivityC0640j.this.getViewModelStore();
        }

        @Override // androidx.core.app.V
        public void h(androidx.core.util.a aVar) {
            AbstractActivityC0640j.this.h(aVar);
        }

        @Override // androidx.core.content.e
        public void i(androidx.core.util.a aVar) {
            AbstractActivityC0640j.this.i(aVar);
        }

        @Override // androidx.core.app.V
        public void j(androidx.core.util.a aVar) {
            AbstractActivityC0640j.this.j(aVar);
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry k() {
            return AbstractActivityC0640j.this.k();
        }

        @Override // androidx.core.app.U
        public void l(androidx.core.util.a aVar) {
            AbstractActivityC0640j.this.l(aVar);
        }

        @Override // androidx.core.content.d
        public void o(androidx.core.util.a aVar) {
            AbstractActivityC0640j.this.o(aVar);
        }

        @Override // androidx.fragment.app.o
        public void q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC0640j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.content.e
        public void r(androidx.core.util.a aVar) {
            AbstractActivityC0640j.this.r(aVar);
        }

        @Override // androidx.core.view.InterfaceC0598s
        public void s(InterfaceC0601v interfaceC0601v) {
            AbstractActivityC0640j.this.s(interfaceC0601v);
        }

        @Override // androidx.core.app.U
        public void t(androidx.core.util.a aVar) {
            AbstractActivityC0640j.this.t(aVar);
        }

        @Override // androidx.fragment.app.o
        public LayoutInflater v() {
            return AbstractActivityC0640j.this.getLayoutInflater().cloneInContext(AbstractActivityC0640j.this);
        }

        @Override // androidx.fragment.app.o
        public boolean x(String str) {
            return AbstractC0550b.t(AbstractActivityC0640j.this, str);
        }
    }

    public AbstractActivityC0640j() {
        Q();
    }

    private void Q() {
        getSavedStateRegistry().h("android:support:lifecycle", new c.InterfaceC0101c() { // from class: androidx.fragment.app.f
            @Override // Y.c.InterfaceC0101c
            public final Bundle a() {
                return this.f8162a.R();
            }
        });
        e(new androidx.core.util.a() { // from class: androidx.fragment.app.g
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                this.f8163a.S((Configuration) obj);
            }
        });
        A(new androidx.core.util.a() { // from class: androidx.fragment.app.h
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                this.f8164a.T((Intent) obj);
            }
        });
        z(new InterfaceC0706b() { // from class: androidx.fragment.app.i
            @Override // c.InterfaceC0706b
            public final void a(Context context) {
                this.f8165a.U(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle R() {
        V();
        this.f8167F.h(AbstractC0651h.b.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(Configuration configuration) {
        this.f8166E.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(Intent intent) {
        this.f8166E.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(Context context) {
        this.f8166E.a(null);
    }

    private static boolean W(w wVar, AbstractC0651h.c cVar) {
        boolean zW = false;
        for (Fragment fragment : wVar.v0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zW |= W(fragment.getChildFragmentManager(), cVar);
                }
                I i7 = fragment.mViewLifecycleOwner;
                if (i7 != null && i7.getLifecycle().b().e(AbstractC0651h.c.STARTED)) {
                    fragment.mViewLifecycleOwner.g(cVar);
                    zW = true;
                }
                if (fragment.mLifecycleRegistry.b().e(AbstractC0651h.c.STARTED)) {
                    fragment.mLifecycleRegistry.o(cVar);
                    zW = true;
                }
            }
        }
        return zW;
    }

    final View N(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f8166E.n(view, str, context, attributeSet);
    }

    public w O() {
        return this.f8166E.l();
    }

    public androidx.loader.app.a P() {
        return androidx.loader.app.a.b(this);
    }

    void V() {
        while (W(O(), AbstractC0651h.c.CREATED)) {
        }
    }

    public void X(Fragment fragment) {
    }

    protected void Y() {
        this.f8167F.h(AbstractC0651h.b.ON_RESUME);
        this.f8166E.h();
    }

    @Override // androidx.core.app.AbstractC0550b.c
    public final void a(int i7) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (u(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f8168G);
            printWriter.print(" mResumed=");
            printWriter.print(this.f8169H);
            printWriter.print(" mStopped=");
            printWriter.print(this.f8170I);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f8166E.l().X(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        this.f8166E.m();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.AbstractActivityC0555g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8167F.h(AbstractC0651h.b.ON_CREATE);
        this.f8166E.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewN = N(view, str, context, attributeSet);
        return viewN == null ? super.onCreateView(view, str, context, attributeSet) : viewN;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f8166E.f();
        this.f8167F.h(AbstractC0651h.b.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return this.f8166E.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f8169H = false;
        this.f8166E.g();
        this.f8167F.h(AbstractC0651h.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        Y();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f8166E.m();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f8166E.m();
        super.onResume();
        this.f8169H = true;
        this.f8166E.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f8166E.m();
        super.onStart();
        this.f8170I = false;
        if (!this.f8168G) {
            this.f8168G = true;
            this.f8166E.c();
        }
        this.f8166E.k();
        this.f8167F.h(AbstractC0651h.b.ON_START);
        this.f8166E.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f8166E.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f8170I = true;
        V();
        this.f8166E.j();
        this.f8167F.h(AbstractC0651h.b.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewN = N(null, str, context, attributeSet);
        return viewN == null ? super.onCreateView(str, context, attributeSet) : viewN;
    }
}
