package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class H extends ToggleButton {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0528e f5714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C f5715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C0537n f5716o;

    public H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private C0537n getEmojiTextViewHelper() {
        if (this.f5716o == null) {
            this.f5716o = new C0537n(this);
        }
        return this.f5716o;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0528e c0528e = this.f5714m;
        if (c0528e != null) {
            c0528e.b();
        }
        C c7 = this.f5715n;
        if (c7 != null) {
            c7.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0528e c0528e = this.f5714m;
        if (c0528e != null) {
            return c0528e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0528e c0528e = this.f5714m;
        if (c0528e != null) {
            return c0528e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5715n.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5715n.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0528e c0528e = this.f5714m;
        if (c0528e != null) {
            c0528e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0528e c0528e = this.f5714m;
        if (c0528e != null) {
            c0528e.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f5715n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f5715n;
        if (c7 != null) {
            c7.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().e(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0528e c0528e = this.f5714m;
        if (c0528e != null) {
            c0528e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0528e c0528e = this.f5714m;
        if (c0528e != null) {
            c0528e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f5715n.w(colorStateList);
        this.f5715n.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f5715n.x(mode);
        this.f5715n.b();
    }

    public H(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        d0.a(this, getContext());
        C0528e c0528e = new C0528e(this);
        this.f5714m = c0528e;
        c0528e.e(attributeSet, i7);
        C c7 = new C(this);
        this.f5715n = c7;
        c7.m(attributeSet, i7);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }
}
