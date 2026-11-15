package com.reactnativecommunity.progressview;

import android.R;
import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.C0872e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static ProgressBar a(C0872e0 c0872e0) {
        ProgressBar progressBar = new ProgressBar(c0872e0, null, R.attr.progressBarStyleHorizontal);
        progressBar.setMax(1000);
        return progressBar;
    }

    public static void b(ProgressBar progressBar, boolean z6) {
        progressBar.setIndeterminate(z6);
    }

    public static void c(ProgressBar progressBar, double d7) {
        progressBar.setProgress((int) (d7 * 1000.0d));
    }

    public static void d(ProgressBar progressBar, int i7) {
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(i7));
        progressBar.setProgressTintList(ColorStateList.valueOf(i7));
    }

    public static void e(ProgressBar progressBar, int i7) {
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(i7));
    }
}
