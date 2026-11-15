package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import e.AbstractC1609a;

/* JADX INFO: renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0529f extends Button {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0528e f6104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C f6105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C0537n f6106o;

    public C0529f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18741n);
    }

    private C0537n getEmojiTextViewHelper() {
        if (this.f6106o == null) {
            this.f6106o = new C0537n(this);
        }
        return this.f6106o;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0528e c0528e = this.f6104m;
        if (c0528e != null) {
            c0528e.b();
        }
        C c7 = this.f6105n;
        if (c7 != null) {
            c7.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (r0.f6214b) {
            return super.getAutoSizeMaxTextSize();
        }
        C c7 = this.f6105n;
        if (c7 != null) {
            return c7.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (r0.f6214b) {
            return super.getAutoSizeMinTextSize();
        }
        C c7 = this.f6105n;
        if (c7 != null) {
            return c7.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (r0.f6214b) {
            return super.getAutoSizeStepGranularity();
        }
        C c7 = this.f6105n;
        if (c7 != null) {
            return c7.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (r0.f6214b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C c7 = this.f6105n;
        return c7 != null ? c7.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (r0.f6214b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C c7 = this.f6105n;
        if (c7 != null) {
            return c7.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.i.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0528e c0528e = this.f6104m;
        if (c0528e != null) {
            return c0528e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0528e c0528e = this.f6104m;
        if (c0528e != null) {
            return c0528e.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f6105n.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f6105n.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        C c7 = this.f6105n;
        if (c7 != null) {
            c7.o(z6, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C c7 = this.f6105n;
        if (c7 == null || r0.f6214b || !c7.l()) {
            return;
        }
        this.f6105n.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().d(z6);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (r0.f6214b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        C c7 = this.f6105n;
        if (c7 != null) {
            c7.t(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (r0.f6214b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        C c7 = this.f6105n;
        if (c7 != null) {
            c7.u(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (r0.f6214b) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        C c7 = this.f6105n;
        if (c7 != null) {
            c7.v(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0528e c0528e = this.f6104m;
        if (c0528e != null) {
            c0528e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0528e c0528e = this.f6104m;
        if (c0528e != null) {
            c0528e.g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().e(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z6) {
        C c7 = this.f6105n;
        if (c7 != null) {
            c7.s(z6);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0528e c0528e = this.f6104m;
        if (c0528e != null) {
            c0528e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0528e c0528e = this.f6104m;
        if (c0528e != null) {
            c0528e.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f6105n.w(colorStateList);
        this.f6105n.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f6105n.x(mode);
        this.f6105n.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C c7 = this.f6105n;
        if (c7 != null) {
            c7.q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f7) {
        if (r0.f6214b) {
            super.setTextSize(i7, f7);
            return;
        }
        C c7 = this.f6105n;
        if (c7 != null) {
            c7.A(i7, f7);
        }
    }

    public C0529f(Context context, AttributeSet attributeSet, int i7) {
        super(e0.b(context), attributeSet, i7);
        d0.a(this, getContext());
        C0528e c0528e = new C0528e(this);
        this.f6104m = c0528e;
        c0528e.e(attributeSet, i7);
        C c7 = new C(this);
        this.f6105n = c7;
        c7.m(attributeSet, i7);
        c7.b();
        getEmojiTextViewHelper().c(attributeSet, i7);
    }
}
