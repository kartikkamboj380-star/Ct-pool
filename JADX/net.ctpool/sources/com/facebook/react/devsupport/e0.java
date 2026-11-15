package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import com.facebook.fbreact.specs.NativeRedBoxSpec;

/* JADX INFO: loaded from: classes.dex */
class e0 implements S1.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I f11616a = new I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X1.e f11617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Dialog f11618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b0 f11619d;

    class a extends Dialog {
        a(Context context, int i7) {
            super(context, i7);
        }

        @Override // android.app.Dialog, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i7, KeyEvent keyEvent) {
            if (i7 == 82) {
                e0.this.f11617b.C();
                return true;
            }
            if (e0.this.f11616a.b(i7, getCurrentFocus())) {
                e0.this.f11617b.q();
            }
            return super.onKeyUp(i7, keyEvent);
        }
    }

    public e0(X1.e eVar) {
        this.f11617b = eVar;
    }

    @Override // S1.i
    public boolean a() {
        Dialog dialog = this.f11618c;
        return dialog != null && dialog.isShowing();
    }

    @Override // S1.i
    public void b() {
        String strL = this.f11617b.l();
        Activity activityJ = this.f11617b.j();
        if (activityJ == null || activityJ.isFinishing()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ");
            if (strL == null) {
                strL = "N/A";
            }
            sb.append(strL);
            P0.a.j("ReactNative", sb.toString());
            return;
        }
        b0 b0Var = this.f11619d;
        if (b0Var == null || b0Var.getContext() != activityJ) {
            f(NativeRedBoxSpec.NAME);
        }
        this.f11619d.d();
        if (this.f11618c == null) {
            a aVar = new a(activityJ, com.facebook.react.r.f12042b);
            this.f11618c = aVar;
            aVar.requestWindowFeature(1);
            this.f11618c.setContentView(this.f11619d);
        }
        this.f11618c.show();
    }

    @Override // S1.i
    public void c() {
        Dialog dialog = this.f11618c;
        if (dialog != null) {
            dialog.dismiss();
            e();
            this.f11618c = null;
        }
    }

    @Override // S1.i
    public boolean d() {
        return this.f11619d != null;
    }

    @Override // S1.i
    public void e() {
        this.f11619d = null;
    }

    @Override // S1.i
    public void f(String str) {
        this.f11617b.y();
        Activity activityJ = this.f11617b.j();
        if (activityJ != null && !activityJ.isFinishing()) {
            b0 b0Var = new b0(activityJ);
            this.f11619d = b0Var;
            b0Var.e(this.f11617b).g(null).c();
            return;
        }
        String strL = this.f11617b.l();
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to launch redbox because react activity is not available, here is the error that redbox would've displayed: ");
        if (strL == null) {
            strL = "N/A";
        }
        sb.append(strL);
        P0.a.j("ReactNative", sb.toString());
    }
}
