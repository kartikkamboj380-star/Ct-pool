package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* JADX INFO: loaded from: classes.dex */
class a extends FrameLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f12849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f12850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f12851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private double f12852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ProgressBar f12853q;

    public a(Context context) {
        super(context);
        this.f12850n = true;
        this.f12851o = true;
    }

    private void c(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.f12849m;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public void a() {
        ProgressBar progressBar;
        int i7;
        ProgressBar progressBar2 = this.f12853q;
        if (progressBar2 == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar2.setIndeterminate(this.f12850n);
        c(this.f12853q);
        this.f12853q.setProgress((int) (this.f12852p * 1000.0d));
        if (this.f12851o) {
            progressBar = this.f12853q;
            i7 = 0;
        } else {
            progressBar = this.f12853q;
            i7 = 4;
        }
        progressBar.setVisibility(i7);
    }

    public void b(boolean z6) {
        this.f12851o = z6;
    }

    public void d(Integer num) {
        this.f12849m = num;
    }

    public void e(boolean z6) {
        this.f12850n = z6;
    }

    public void f(double d7) {
        this.f12852p = d7;
    }

    public void g(String str) {
        ProgressBar progressBarCreateProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.f12853q = progressBarCreateProgressBar;
        progressBarCreateProgressBar.setMax(1000);
        removeAllViews();
        addView(this.f12853q, new ViewGroup.LayoutParams(-1, -1));
    }
}
