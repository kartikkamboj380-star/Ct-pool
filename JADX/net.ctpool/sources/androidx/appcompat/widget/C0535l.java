package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C0584d;
import e.AbstractC1609a;
import x.AbstractC2204c;
import x.AbstractC2207f;

/* JADX INFO: renamed from: androidx.appcompat.widget.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0535l extends EditText implements androidx.core.view.E {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0528e f6168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C f6169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final B f6170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final androidx.core.widget.j f6171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C0536m f6172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f6173r;

    /* JADX INFO: renamed from: androidx.appcompat.widget.l$a */
    class a {
        a() {
        }

        public TextClassifier a() {
            return C0535l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C0535l.super.setTextClassifier(textClassifier);
        }
    }

    public C0535l(Context context) {
        this(context, null);
    }

    private a getSuperCaller() {
        if (this.f6173r == null) {
            this.f6173r = new a();
        }
        return this.f6173r;
    }

    @Override // androidx.core.view.E
    public C0584d a(C0584d c0584d) {
        return this.f6171p.a(this, c0584d);
    }

    void d(C0536m c0536m) {
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
        C0528e c0528e = this.f6168m;
        if (c0528e != null) {
            c0528e.b();
        }
        C c7 = this.f6169n;
        if (c7 != null) {
            c7.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0528e c0528e = this.f6168m;
        if (c0528e != null) {
            return c0528e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0528e c0528e = this.f6168m;
        if (c0528e != null) {
            return c0528e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6169n.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6169n.k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        B b7;
        return (Build.VERSION.SDK_INT >= 28 || (b7 = this.f6170o) == null) ? getSuperCaller().a() : b7.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrE;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f6169n.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = AbstractC0538o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrE = androidx.core.view.H.E(this)) != null) {
            AbstractC2204c.d(editorInfo, strArrE);
            inputConnectionA = AbstractC2207f.c(this, inputConnectionA, editorInfo);
        }
        return this.f6172q.d(inputConnectionA, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC0546x.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (AbstractC0546x.b(this, i7)) {
            return true;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0528e c0528e = this.f6168m;
        if (c0528e != null) {
            c0528e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0528e c0528e = this.f6168m;
        if (c0528e != null) {
            c0528e.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f6169n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C c7 = this.f6169n;
        if (c7 != null) {
            c7.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f6172q.e(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f6172q.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0528e c0528e = this.f6168m;
        if (c0528e != null) {
            c0528e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0528e c0528e = this.f6168m;
        if (c0528e != null) {
            c0528e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f6169n.w(colorStateList);
        this.f6169n.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f6169n.x(mode);
        this.f6169n.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C c7 = this.f6169n;
        if (c7 != null) {
            c7.q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        B b7;
        if (Build.VERSION.SDK_INT >= 28 || (b7 = this.f6170o) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            b7.b(textClassifier);
        }
    }

    public C0535l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18752y);
    }

    public C0535l(Context context, AttributeSet attributeSet, int i7) {
        super(e0.b(context), attributeSet, i7);
        d0.a(this, getContext());
        C0528e c0528e = new C0528e(this);
        this.f6168m = c0528e;
        c0528e.e(attributeSet, i7);
        C c7 = new C(this);
        this.f6169n = c7;
        c7.m(attributeSet, i7);
        c7.b();
        this.f6170o = new B(this);
        this.f6171p = new androidx.core.widget.j();
        C0536m c0536m = new C0536m(this);
        this.f6172q = c0536m;
        c0536m.c(attributeSet, i7);
        d(c0536m);
    }
}
