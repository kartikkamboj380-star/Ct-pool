package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import e.AbstractC1609a;
import f.AbstractC1641a;

/* JADX INFO: renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0541s extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f6215p = {R.attr.popupBackground};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0528e f6216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C f6217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C0536m f6218o;

    public C0541s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18740m);
    }

    void a(C0536m c0536m) {
        KeyListener keyListener = getKeyListener();
        if (c0536m.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c0536m.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0528e c0528e = this.f6216m;
        if (c0528e != null) {
            c0528e.b();
        }
        C c7 = this.f6217n;
        if (c7 != null) {
            c7.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0528e c0528e = this.f6216m;
        if (c0528e != null) {
            return c0528e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0528e c0528e = this.f6216m;
        if (c0528e != null) {
            return c0528e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6217n.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6217n.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f6218o.d(AbstractC0538o.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0528e c0528e = this.f6216m;
        if (c0528e != null) {
            c0528e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0528e c0528e = this.f6216m;
        if (c0528e != null) {
            c0528e.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f6217n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f6217n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(AbstractC1641a.b(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f6218o.e(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f6218o.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0528e c0528e = this.f6216m;
        if (c0528e != null) {
            c0528e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0528e c0528e = this.f6216m;
        if (c0528e != null) {
            c0528e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f6217n.w(colorStateList);
        this.f6217n.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f6217n.x(mode);
        this.f6217n.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C c7 = this.f6217n;
        if (c7 != null) {
            c7.q(context, i7);
        }
    }

    public C0541s(Context context, AttributeSet attributeSet, int i7) {
        super(e0.b(context), attributeSet, i7);
        d0.a(this, getContext());
        h0 h0VarV = h0.v(getContext(), attributeSet, f6215p, i7, 0);
        if (h0VarV.s(0)) {
            setDropDownBackgroundDrawable(h0VarV.g(0));
        }
        h0VarV.w();
        C0528e c0528e = new C0528e(this);
        this.f6216m = c0528e;
        c0528e.e(attributeSet, i7);
        C c7 = new C(this);
        this.f6217n = c7;
        c7.m(attributeSet, i7);
        c7.b();
        C0536m c0536m = new C0536m(this);
        this.f6218o = c0536m;
        c0536m.c(attributeSet, i7);
        a(c0536m);
    }
}
