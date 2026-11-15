package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0542t extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f6219b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f6220a;

    public C0542t(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        a(context, attributeSet, i7, i8);
    }

    private void a(Context context, AttributeSet attributeSet, int i7, int i8) {
        h0 h0VarV = h0.v(context, attributeSet, e.j.f19017Y1, i7, i8);
        if (h0VarV.s(e.j.f19026a2)) {
            b(h0VarV.a(e.j.f19026a2, false));
        }
        setBackgroundDrawable(h0VarV.g(e.j.f19021Z1));
        h0VarV.w();
    }

    private void b(boolean z6) {
        if (f6219b) {
            this.f6220a = z6;
        } else {
            androidx.core.widget.h.a(this, z6);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8) {
        if (f6219b && this.f6220a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i7, int i8, int i9, int i10) {
        if (f6219b && this.f6220a) {
            i8 -= view.getHeight();
        }
        super.update(view, i7, i8, i9, i10);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i7, int i8, int i9) {
        if (f6219b && this.f6220a) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i7, i8, i9);
    }
}
