package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0548z extends C0543u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f6230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f6231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f6232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f6233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f6235i;

    C0548z(SeekBar seekBar) {
        super(seekBar);
        this.f6232f = null;
        this.f6233g = null;
        this.f6234h = false;
        this.f6235i = false;
        this.f6230d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f6231e;
        if (drawable != null) {
            if (this.f6234h || this.f6235i) {
                Drawable drawableL = androidx.core.graphics.drawable.a.l(drawable.mutate());
                this.f6231e = drawableL;
                if (this.f6234h) {
                    androidx.core.graphics.drawable.a.i(drawableL, this.f6232f);
                }
                if (this.f6235i) {
                    androidx.core.graphics.drawable.a.j(this.f6231e, this.f6233g);
                }
                if (this.f6231e.isStateful()) {
                    this.f6231e.setState(this.f6230d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.C0543u
    void c(AttributeSet attributeSet, int i7) {
        super.c(attributeSet, i7);
        h0 h0VarV = h0.v(this.f6230d.getContext(), attributeSet, e.j.f18995T, i7, 0);
        SeekBar seekBar = this.f6230d;
        androidx.core.view.H.n0(seekBar, seekBar.getContext(), e.j.f18995T, attributeSet, h0VarV.r(), i7, 0);
        Drawable drawableH = h0VarV.h(e.j.f18999U);
        if (drawableH != null) {
            this.f6230d.setThumb(drawableH);
        }
        j(h0VarV.g(e.j.f19003V));
        if (h0VarV.s(e.j.f19011X)) {
            this.f6233g = O.e(h0VarV.k(e.j.f19011X, -1), this.f6233g);
            this.f6235i = true;
        }
        if (h0VarV.s(e.j.f19007W)) {
            this.f6232f = h0VarV.c(e.j.f19007W);
            this.f6234h = true;
        }
        h0VarV.w();
        f();
    }

    void g(Canvas canvas) {
        if (this.f6231e != null) {
            int max = this.f6230d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f6231e.getIntrinsicWidth();
                int intrinsicHeight = this.f6231e.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i8 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f6231e.setBounds(-i7, -i8, i7, i8);
                float width = ((this.f6230d.getWidth() - this.f6230d.getPaddingLeft()) - this.f6230d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f6230d.getPaddingLeft(), this.f6230d.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f6231e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f6231e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f6230d.getDrawableState())) {
            this.f6230d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f6231e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f6231e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f6231e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f6230d);
            androidx.core.graphics.drawable.a.g(drawable, androidx.core.view.H.B(this.f6230d));
            if (drawable.isStateful()) {
                drawable.setState(this.f6230d.getDrawableState());
            }
            f();
        }
        this.f6230d.invalidate();
    }
}
