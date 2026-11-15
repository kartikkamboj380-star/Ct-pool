package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.C0895v;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import java.util.HashSet;
import java.util.Set;
import w5.k;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C0895v implements o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final SparseIntArray f12854A = new SparseIntArray();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final SparseIntArray f12855B = new SparseIntArray();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Set f12856C = new HashSet();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private String f12857D;

    public b() {
        Y0(this);
        this.f12857D = "Normal";
    }

    @Override // com.facebook.yoga.o
    public long V(r rVar, float f7, p pVar, float f8, p pVar2) {
        k.f(rVar, "node");
        k.f(pVar, "widthMode");
        k.f(pVar2, "heightMode");
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(this.f12857D);
        if (!this.f12856C.contains(Integer.valueOf(styleFromString))) {
            ProgressBar progressBarCreateProgressBar = ReactProgressBarViewManager.createProgressBar(G(), styleFromString);
            k.e(progressBarCreateProgressBar, "createProgressBar(...)");
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            this.f12854A.put(styleFromString, progressBarCreateProgressBar.getMeasuredHeight());
            this.f12855B.put(styleFromString, progressBarCreateProgressBar.getMeasuredWidth());
            this.f12856C.add(Integer.valueOf(styleFromString));
        }
        return q.b(this.f12855B.get(styleFromString), this.f12854A.get(styleFromString));
    }

    @InterfaceC2218a(name = "styleAttr")
    public final void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.f12857D = str;
    }
}
