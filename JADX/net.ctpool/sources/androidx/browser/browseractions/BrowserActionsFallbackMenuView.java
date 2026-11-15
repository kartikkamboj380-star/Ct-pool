package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import m.AbstractC1865a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f6236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f6237n;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6236m = getResources().getDimensionPixelOffset(AbstractC1865a.f21204b);
        this.f6237n = getResources().getDimensionPixelOffset(AbstractC1865a.f21203a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f6236m * 2), this.f6237n), 1073741824), i8);
    }
}
