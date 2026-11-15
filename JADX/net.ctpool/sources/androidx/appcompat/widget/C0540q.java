package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import f.AbstractC1641a;

/* JADX INFO: renamed from: androidx.appcompat.widget.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0540q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f6203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0 f6204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f0 f6205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f0 f6206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6207e = 0;

    public C0540q(ImageView imageView) {
        this.f6203a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f6206d == null) {
            this.f6206d = new f0();
        }
        f0 f0Var = this.f6206d;
        f0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f6203a);
        if (colorStateListA != null) {
            f0Var.f6110d = true;
            f0Var.f6107a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f6203a);
        if (modeB != null) {
            f0Var.f6109c = true;
            f0Var.f6108b = modeB;
        }
        if (!f0Var.f6110d && !f0Var.f6109c) {
            return false;
        }
        C0534k.i(drawable, f0Var, this.f6203a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f6204b != null;
    }

    void b() {
        if (this.f6203a.getDrawable() != null) {
            this.f6203a.getDrawable().setLevel(this.f6207e);
        }
    }

    void c() {
        Drawable drawable = this.f6203a.getDrawable();
        if (drawable != null) {
            O.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            f0 f0Var = this.f6205c;
            if (f0Var != null) {
                C0534k.i(drawable, f0Var, this.f6203a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.f6204b;
            if (f0Var2 != null) {
                C0534k.i(drawable, f0Var2, this.f6203a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        f0 f0Var = this.f6205c;
        if (f0Var != null) {
            return f0Var.f6107a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        f0 f0Var = this.f6205c;
        if (f0Var != null) {
            return f0Var.f6108b;
        }
        return null;
    }

    boolean f() {
        return !(this.f6203a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i7) {
        int iN;
        h0 h0VarV = h0.v(this.f6203a.getContext(), attributeSet, e.j.f18976P, i7, 0);
        ImageView imageView = this.f6203a;
        androidx.core.view.H.n0(imageView, imageView.getContext(), e.j.f18976P, attributeSet, h0VarV.r(), i7, 0);
        try {
            Drawable drawable = this.f6203a.getDrawable();
            if (drawable == null && (iN = h0VarV.n(e.j.f18981Q, -1)) != -1 && (drawable = AbstractC1641a.b(this.f6203a.getContext(), iN)) != null) {
                this.f6203a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                O.b(drawable);
            }
            if (h0VarV.s(e.j.f18986R)) {
                androidx.core.widget.e.c(this.f6203a, h0VarV.c(e.j.f18986R));
            }
            if (h0VarV.s(e.j.f18991S)) {
                androidx.core.widget.e.d(this.f6203a, O.e(h0VarV.k(e.j.f18991S, -1), null));
            }
            h0VarV.w();
        } catch (Throwable th) {
            h0VarV.w();
            throw th;
        }
    }

    void h(Drawable drawable) {
        this.f6207e = drawable.getLevel();
    }

    public void i(int i7) {
        if (i7 != 0) {
            Drawable drawableB = AbstractC1641a.b(this.f6203a.getContext(), i7);
            if (drawableB != null) {
                O.b(drawableB);
            }
            this.f6203a.setImageDrawable(drawableB);
        } else {
            this.f6203a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f6205c == null) {
            this.f6205c = new f0();
        }
        f0 f0Var = this.f6205c;
        f0Var.f6107a = colorStateList;
        f0Var.f6110d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f6205c == null) {
            this.f6205c = new f0();
        }
        f0 f0Var = this.f6205c;
        f0Var.f6108b = mode;
        f0Var.f6109c = true;
        c();
    }
}
