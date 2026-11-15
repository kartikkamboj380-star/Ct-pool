package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import e.AbstractC1612d;
import e.AbstractC1614f;
import e.AbstractC1615g;

/* JADX INFO: loaded from: classes.dex */
class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f6197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f6198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f6199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f6200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f6201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f6202g;

    p0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f6199d = layoutParams;
        this.f6200e = new Rect();
        this.f6201f = new int[2];
        this.f6202g = new int[2];
        this.f6196a = context;
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC1615g.f18881s, (ViewGroup) null);
        this.f6197b = viewInflate;
        this.f6198c = (TextView) viewInflate.findViewById(AbstractC1614f.f18855s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = e.i.f18897a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i7, int i8, boolean z6, WindowManager.LayoutParams layoutParams) {
        int height;
        int i9;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f6196a.getResources().getDimensionPixelOffset(AbstractC1612d.f18773k);
        if (view.getWidth() < dimensionPixelOffset) {
            i7 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f6196a.getResources().getDimensionPixelOffset(AbstractC1612d.f18772j);
            height = i8 + dimensionPixelOffset2;
            i9 = i8 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i9 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f6196a.getResources().getDimensionPixelOffset(z6 ? AbstractC1612d.f18775m : AbstractC1612d.f18774l);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f6200e);
        Rect rect = this.f6200e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f6196a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f6200e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f6202g);
        view.getLocationOnScreen(this.f6201f);
        int[] iArr = this.f6201f;
        int i10 = iArr[0];
        int[] iArr2 = this.f6202g;
        int i11 = i10 - iArr2[0];
        iArr[0] = i11;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i11 + i7) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f6197b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f6197b.getMeasuredHeight();
        int i12 = this.f6201f[1];
        int i13 = ((i9 + i12) - dimensionPixelOffset3) - measuredHeight;
        int i14 = i12 + height + dimensionPixelOffset3;
        if (!z6 ? measuredHeight + i14 <= this.f6200e.height() : i13 < 0) {
            layoutParams.y = i13;
        } else {
            layoutParams.y = i14;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f6196a.getSystemService("window")).removeView(this.f6197b);
        }
    }

    boolean d() {
        return this.f6197b.getParent() != null;
    }

    void e(View view, int i7, int i8, boolean z6, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f6198c.setText(charSequence);
        a(view, i7, i8, z6, this.f6199d);
        ((WindowManager) this.f6196a.getSystemService("window")).addView(this.f6197b, this.f6199d);
    }
}
