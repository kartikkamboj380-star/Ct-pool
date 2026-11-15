package com.google.android.material.snackbar;

import A3.c;
import A3.e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f17054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Button f17055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f17056o;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void a(View view, int i7, int i8) {
        if (H.V(view)) {
            H.D0(view, H.G(view), i7, H.F(view), i8);
        } else {
            view.setPadding(view.getPaddingLeft(), i7, view.getPaddingRight(), i8);
        }
    }

    private boolean b(int i7, int i8, int i9) {
        boolean z6;
        if (i7 != getOrientation()) {
            setOrientation(i7);
            z6 = true;
        } else {
            z6 = false;
        }
        if (this.f17054m.getPaddingTop() == i8 && this.f17054m.getPaddingBottom() == i9) {
            return z6;
        }
        a(this.f17054m, i8, i9);
        return true;
    }

    public Button getActionView() {
        return this.f17055n;
    }

    public TextView getMessageView() {
        return this.f17054m;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f17054m = (TextView) findViewById(e.f187F);
        this.f17055n = (Button) findViewById(e.f186E);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.f153e);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.f152d);
        boolean z6 = this.f17054m.getLayout().getLineCount() > 1;
        if (!z6 || this.f17056o <= 0 || this.f17055n.getMeasuredWidth() <= this.f17056o) {
            if (!z6) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i7, i8);
    }

    public void setMaxInlineActionWidth(int i7) {
        this.f17056o = i7;
    }
}
