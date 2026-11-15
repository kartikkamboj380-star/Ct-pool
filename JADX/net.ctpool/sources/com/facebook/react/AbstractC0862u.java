package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.config.ReactFeatureFlags;
import m2.InterfaceC1877h;

/* JADX INFO: renamed from: com.facebook.react.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0862u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f12237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1877h f12239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Callback f12240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0916x f12241e;

    /* JADX INFO: renamed from: com.facebook.react.u$a */
    class a extends C0916x {
        a(Activity activity, L l7, String str, Bundle bundle, boolean z6) {
            super(activity, l7, str, bundle, z6);
        }

        @Override // com.facebook.react.C0916x
        protected X a() {
            X xC = AbstractC0862u.this.c();
            return xC == null ? super.a() : xC;
        }
    }

    public AbstractC0862u(ReactActivity reactActivity, String str) {
        this.f12237a = reactActivity;
        this.f12238b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(int i7, String[] strArr, int[] iArr, Object[] objArr) {
        InterfaceC1877h interfaceC1877h = this.f12239c;
        if (interfaceC1877h == null || !interfaceC1877h.onRequestPermissionsResult(i7, strArr, iArr)) {
            return;
        }
        this.f12239c = null;
    }

    public void A(String[] strArr, int i7, InterfaceC1877h interfaceC1877h) {
        this.f12239c = interfaceC1877h;
        g().requestPermissions(strArr, i7);
    }

    protected Bundle b() {
        return e();
    }

    protected X c() {
        return null;
    }

    protected Context d() {
        return (Context) O1.a.c(this.f12237a);
    }

    protected Bundle e() {
        return null;
    }

    public String f() {
        return this.f12238b;
    }

    protected Activity g() {
        return (Activity) d();
    }

    public InterfaceC0917y h() {
        return ((InterfaceC0915w) g().getApplication()).b();
    }

    protected L i() {
        return ((InterfaceC0915w) g().getApplication()).a();
    }

    protected abstract boolean j();

    protected boolean k() {
        return false;
    }

    protected void m(String str) {
        this.f12241e.g(str);
        g().setContentView(this.f12241e.e());
    }

    public void n(int i7, int i8, Intent intent) {
        this.f12241e.h(i7, i8, intent, true);
    }

    public boolean o() {
        return this.f12241e.i();
    }

    public void p(Configuration configuration) {
        this.f12241e.j(configuration);
    }

    public void q(Bundle bundle) {
        String strF = f();
        Bundle bundleB = b();
        if (Build.VERSION.SDK_INT >= 26 && k()) {
            this.f12237a.getWindow().setColorMode(1);
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f12241e = new C0916x(g(), h(), strF, bundleB);
        } else {
            this.f12241e = new a(g(), i(), strF, bundleB, j());
        }
        if (strF != null) {
            m(strF);
        }
    }

    public void r() {
        this.f12241e.k();
    }

    public boolean s(int i7, KeyEvent keyEvent) {
        return this.f12241e.n(i7, keyEvent);
    }

    public boolean t(int i7, KeyEvent keyEvent) {
        return this.f12241e.o(i7);
    }

    public boolean u(int i7, KeyEvent keyEvent) {
        return this.f12241e.r(i7, keyEvent);
    }

    public boolean v(Intent intent) {
        return this.f12241e.p(intent);
    }

    public void w() {
        this.f12241e.l();
    }

    public void x(final int i7, final String[] strArr, final int[] iArr) {
        this.f12240d = new Callback() { // from class: com.facebook.react.t
            @Override // com.facebook.react.bridge.Callback
            public final void invoke(Object[] objArr) {
                this.f12233a.l(i7, strArr, iArr, objArr);
            }
        };
    }

    public void y() {
        this.f12241e.m();
        Callback callback = this.f12240d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f12240d = null;
        }
    }

    public void z(boolean z6) {
        this.f12241e.q(z6);
    }
}
