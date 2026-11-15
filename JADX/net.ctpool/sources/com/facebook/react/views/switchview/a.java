package com.facebook.react.views.switchview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import androidx.appcompat.widget.c0;

/* JADX INFO: loaded from: classes.dex */
class a extends c0 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f13013j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Integer f13014k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private Integer f13015l0;

    public a(Context context) {
        super(context);
        this.f13013j0 = true;
        this.f13014k0 = null;
        this.f13015l0 = null;
    }

    private ColorStateList r(Integer num) {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}}, new int[]{num.intValue()});
    }

    private void w(boolean z6) {
        Integer num = this.f13015l0;
        if (num == null && this.f13014k0 == null) {
            return;
        }
        if (!z6) {
            num = this.f13014k0;
        }
        v(num);
    }

    void s(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        setBackground(new RippleDrawable(r(Integer.valueOf(i7)), new ColorDrawable(i7), null));
    }

    @Override // androidx.appcompat.widget.c0, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        if (!this.f13013j0 || isChecked() == z6) {
            super.setChecked(isChecked());
            return;
        }
        this.f13013j0 = false;
        super.setChecked(z6);
        w(z6);
    }

    void t(boolean z6) {
        if (isChecked() != z6) {
            super.setChecked(z6);
            w(z6);
        }
        this.f13013j0 = true;
    }

    public void u(Integer num) {
        s(super.getThumbDrawable(), num);
        if (num == null || !(super.getBackground() instanceof RippleDrawable)) {
            return;
        }
        ((RippleDrawable) super.getBackground()).setColor(r(num));
    }

    public void v(Integer num) {
        s(super.getTrackDrawable(), num);
    }

    public void x(Integer num) {
        if (num == this.f13014k0) {
            return;
        }
        this.f13014k0 = num;
        if (isChecked()) {
            return;
        }
        v(this.f13014k0);
    }

    public void y(Integer num) {
        if (num == this.f13015l0) {
            return;
        }
        this.f13015l0 = num;
        if (isChecked()) {
            v(this.f13015l0);
        }
    }
}
