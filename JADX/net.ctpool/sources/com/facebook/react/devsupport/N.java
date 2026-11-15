package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class N implements S1.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X1.e f11545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f11546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private M f11547c;

    public N(X1.e eVar) {
        w5.k.f(eVar, "devSupportManager");
        this.f11545a = eVar;
    }

    @Override // S1.i
    public boolean a() {
        M m7 = this.f11547c;
        if (m7 != null) {
            return m7.isShowing();
        }
        return false;
    }

    @Override // S1.i
    public void b() {
        if (a() || !d()) {
            return;
        }
        Activity activityJ = this.f11545a.j();
        if (activityJ == null || activityJ.isFinishing()) {
            E2.c.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
            return;
        }
        M m7 = new M(activityJ, this.f11546b);
        this.f11547c = m7;
        m7.setCancelable(false);
        m7.show();
    }

    @Override // S1.i
    public void c() {
        if (a()) {
            View view = this.f11546b;
            ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
            if (viewGroup != null) {
                viewGroup.removeView(this.f11546b);
            }
            M m7 = this.f11547c;
            if (m7 != null) {
                m7.dismiss();
            }
            this.f11547c = null;
        }
    }

    @Override // S1.i
    public boolean d() {
        return this.f11546b != null;
    }

    @Override // S1.i
    public void e() {
        View view = this.f11546b;
        if (view != null) {
            this.f11545a.d(view);
            this.f11546b = null;
        }
    }

    @Override // S1.i
    public void f(String str) {
        w5.k.f(str, "appKey");
        O1.a.b(w5.k.b(str, "LogBox"), "This surface manager can only create LogBox React application");
        View viewA = this.f11545a.a("LogBox");
        this.f11546b = viewA;
        if (viewA == null) {
            E2.c.a("Unable to launch logbox because react was unable to create the root view");
        }
    }
}
