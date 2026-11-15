package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import e.AbstractC1609a;
import f.AbstractC1641a;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0531h extends CheckedTextView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0532i f6116m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C0528e f6117n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C f6118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C0537n f6119p;

    public C0531h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18743p);
    }

    private C0537n getEmojiTextViewHelper() {
        if (this.f6119p == null) {
            this.f6119p = new C0537n(this);
        }
        return this.f6119p;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C c7 = this.f6118o;
        if (c7 != null) {
            c7.b();
        }
        C0528e c0528e = this.f6117n;
        if (c0528e != null) {
            c0528e.b();
        }
        C0532i c0532i = this.f6116m;
        if (c0532i != null) {
            c0532i.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0528e c0528e = this.f6117n;
        if (c0528e != null) {
            return c0528e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0528e c0528e = this.f6117n;
        if (c0528e != null) {
            return c0528e.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0532i c0532i = this.f6116m;
        if (c0532i != null) {
            return c0532i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0532i c0532i = this.f6116m;
        if (c0532i != null) {
            return c0532i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6118o.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6118o.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC0538o.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0528e c0528e = this.f6117n;
        if (c0528e != null) {
            c0528e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0528e c0528e = this.f6117n;
        if (c0528e != null) {
            c0528e.g(i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(AbstractC1641a.b(getContext(), i7));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f6118o;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f6118o;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().e(z6);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0528e c0528e = this.f6117n;
        if (c0528e != null) {
            c0528e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0528e c0528e = this.f6117n;
        if (c0528e != null) {
            c0528e.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0532i c0532i = this.f6116m;
        if (c0532i != null) {
            c0532i.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0532i c0532i = this.f6116m;
        if (c0532i != null) {
            c0532i.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f6118o.w(colorStateList);
        this.f6118o.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f6118o.x(mode);
        this.f6118o.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C c7 = this.f6118o;
        if (c7 != null) {
            c7.q(context, i7);
        }
    }

    public C0531h(Context context, AttributeSet attributeSet, int i7) {
        super(e0.b(context), attributeSet, i7);
        d0.a(this, getContext());
        C c7 = new C(this);
        this.f6118o = c7;
        c7.m(attributeSet, i7);
        c7.b();
        C0528e c0528e = new C0528e(this);
        this.f6117n = c0528e;
        c0528e.e(attributeSet, i7);
        C0532i c0532i = new C0532i(this);
        this.f6116m = c0532i;
        c0532i.d(attributeSet, i7);
        getEmojiTextViewHelper().c(attributeSet, i7);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0532i c0532i = this.f6116m;
        if (c0532i != null) {
            c0532i.e();
        }
    }
}
