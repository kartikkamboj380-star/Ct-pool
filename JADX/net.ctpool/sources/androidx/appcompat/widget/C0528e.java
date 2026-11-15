package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0528e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f6094a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f6097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f0 f6098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f0 f6099f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6096c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0534k f6095b = C0534k.b();

    C0528e(View view) {
        this.f6094a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f6099f == null) {
            this.f6099f = new f0();
        }
        f0 f0Var = this.f6099f;
        f0Var.a();
        ColorStateList colorStateListS = androidx.core.view.H.s(this.f6094a);
        if (colorStateListS != null) {
            f0Var.f6110d = true;
            f0Var.f6107a = colorStateListS;
        }
        PorterDuff.Mode modeT = androidx.core.view.H.t(this.f6094a);
        if (modeT != null) {
            f0Var.f6109c = true;
            f0Var.f6108b = modeT;
        }
        if (!f0Var.f6110d && !f0Var.f6109c) {
            return false;
        }
        C0534k.i(drawable, f0Var, this.f6094a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f6097d != null;
    }

    void b() {
        Drawable background = this.f6094a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            f0 f0Var = this.f6098e;
            if (f0Var != null) {
                C0534k.i(background, f0Var, this.f6094a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f6097d;
            if (f0Var2 != null) {
                C0534k.i(background, f0Var2, this.f6094a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        f0 f0Var = this.f6098e;
        if (f0Var != null) {
            return f0Var.f6107a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        f0 f0Var = this.f6098e;
        if (f0Var != null) {
            return f0Var.f6108b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i7) {
        h0 h0VarV = h0.v(this.f6094a.getContext(), attributeSet, e.j.f18955K3, i7, 0);
        View view = this.f6094a;
        androidx.core.view.H.n0(view, view.getContext(), e.j.f18955K3, attributeSet, h0VarV.r(), i7, 0);
        try {
            if (h0VarV.s(e.j.f18960L3)) {
                this.f6096c = h0VarV.n(e.j.f18960L3, -1);
                ColorStateList colorStateListF = this.f6095b.f(this.f6094a.getContext(), this.f6096c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (h0VarV.s(e.j.f18965M3)) {
                androidx.core.view.H.u0(this.f6094a, h0VarV.c(e.j.f18965M3));
            }
            if (h0VarV.s(e.j.f18970N3)) {
                androidx.core.view.H.v0(this.f6094a, O.e(h0VarV.k(e.j.f18970N3, -1), null));
            }
            h0VarV.w();
        } catch (Throwable th) {
            h0VarV.w();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f6096c = -1;
        h(null);
        b();
    }

    void g(int i7) {
        this.f6096c = i7;
        C0534k c0534k = this.f6095b;
        h(c0534k != null ? c0534k.f(this.f6094a.getContext(), i7) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f6097d == null) {
                this.f6097d = new f0();
            }
            f0 f0Var = this.f6097d;
            f0Var.f6107a = colorStateList;
            f0Var.f6110d = true;
        } else {
            this.f6097d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f6098e == null) {
            this.f6098e = new f0();
        }
        f0 f0Var = this.f6098e;
        f0Var.f6107a = colorStateList;
        f0Var.f6110d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f6098e == null) {
            this.f6098e = new f0();
        }
        f0 f0Var = this.f6098e;
        f0Var.f6108b = mode;
        f0Var.f6109c = true;
        b();
    }
}
