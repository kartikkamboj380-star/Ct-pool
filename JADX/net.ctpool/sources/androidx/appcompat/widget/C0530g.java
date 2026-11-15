package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import e.AbstractC1609a;
import f.AbstractC1641a;

/* JADX INFO: renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0530g extends CheckBox {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0533j f6111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C0528e f6112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C f6113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C0537n f6114p;

    public C0530g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18742o);
    }

    private C0537n getEmojiTextViewHelper() {
        if (this.f6114p == null) {
            this.f6114p = new C0537n(this);
        }
        return this.f6114p;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0528e c0528e = this.f6112n;
        if (c0528e != null) {
            c0528e.b();
        }
        C c7 = this.f6113o;
        if (c7 != null) {
            c7.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0533j c0533j = this.f6111m;
        return c0533j != null ? c0533j.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0528e c0528e = this.f6112n;
        if (c0528e != null) {
            return c0528e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0528e c0528e = this.f6112n;
        if (c0528e != null) {
            return c0528e.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0533j c0533j = this.f6111m;
        if (c0533j != null) {
            return c0533j.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0533j c0533j = this.f6111m;
        if (c0533j != null) {
            return c0533j.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6113o.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6113o.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0528e c0528e = this.f6112n;
        if (c0528e != null) {
            c0528e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0528e c0528e = this.f6112n;
        if (c0528e != null) {
            c0528e.g(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(AbstractC1641a.b(getContext(), i7));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f6113o;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f6113o;
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
        C0528e c0528e = this.f6112n;
        if (c0528e != null) {
            c0528e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0528e c0528e = this.f6112n;
        if (c0528e != null) {
            c0528e.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0533j c0533j = this.f6111m;
        if (c0533j != null) {
            c0533j.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0533j c0533j = this.f6111m;
        if (c0533j != null) {
            c0533j.h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f6113o.w(colorStateList);
        this.f6113o.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f6113o.x(mode);
        this.f6113o.b();
    }

    public C0530g(Context context, AttributeSet attributeSet, int i7) {
        super(e0.b(context), attributeSet, i7);
        d0.a(this, getContext());
        C0533j c0533j = new C0533j(this);
        this.f6111m = c0533j;
        c0533j.e(attributeSet, i7);
        C0528e c0528e = new C0528e(this);
        this.f6112n = c0528e;
        c0528e.e(attributeSet, i7);
        C c7 = new C(this);
        this.f6113o = c7;
        c7.m(attributeSet, i7);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0533j c0533j = this.f6111m;
        if (c0533j != null) {
            c0533j.f();
        }
    }
}
