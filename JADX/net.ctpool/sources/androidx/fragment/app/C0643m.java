package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0643m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f8179a;

    private C0643m(o oVar) {
        this.f8179a = oVar;
    }

    public static C0643m b(o oVar) {
        return new C0643m((o) androidx.core.util.f.g(oVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        o oVar = this.f8179a;
        oVar.f8185q.n(oVar, oVar, fragment);
    }

    public void c() {
        this.f8179a.f8185q.y();
    }

    public boolean d(MenuItem menuItem) {
        return this.f8179a.f8185q.B(menuItem);
    }

    public void e() {
        this.f8179a.f8185q.C();
    }

    public void f() {
        this.f8179a.f8185q.E();
    }

    public void g() {
        this.f8179a.f8185q.N();
    }

    public void h() {
        this.f8179a.f8185q.R();
    }

    public void i() {
        this.f8179a.f8185q.S();
    }

    public void j() {
        this.f8179a.f8185q.U();
    }

    public boolean k() {
        return this.f8179a.f8185q.b0(true);
    }

    public w l() {
        return this.f8179a.f8185q;
    }

    public void m() {
        this.f8179a.f8185q.a1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f8179a.f8185q.x0().onCreateView(view, str, context, attributeSet);
    }
}
