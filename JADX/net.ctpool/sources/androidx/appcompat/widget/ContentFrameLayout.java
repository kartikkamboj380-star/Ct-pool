package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TypedValue f5681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TypedValue f5682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TypedValue f5683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TypedValue f5684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TypedValue f5685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TypedValue f5686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f5687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f5688t;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i7, int i8, int i9, int i10) {
        this.f5687s.set(i7, i8, i9, i10);
        if (androidx.core.view.H.T(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f5685q == null) {
            this.f5685q = new TypedValue();
        }
        return this.f5685q;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f5686r == null) {
            this.f5686r = new TypedValue();
        }
        return this.f5686r;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f5683o == null) {
            this.f5683o = new TypedValue();
        }
        return this.f5683o;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f5684p == null) {
            this.f5684p = new TypedValue();
        }
        return this.f5684p;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f5681m == null) {
            this.f5681m = new TypedValue();
        }
        return this.f5681m;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f5682n == null) {
            this.f5682n = new TypedValue();
        }
        return this.f5682n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f5688t;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f5688t;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i7, int i8) {
        boolean z6;
        int i9;
        int i10;
        float fraction;
        int i11;
        int i12;
        float fraction2;
        int i13;
        int i14;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z7 = true;
        boolean z8 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode != Integer.MIN_VALUE) {
            z6 = false;
        } else {
            TypedValue typedValue = z8 ? this.f5684p : this.f5683o;
            if (typedValue != null && (i13 = typedValue.type) != 0) {
                if (i13 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else if (i13 == 6) {
                    int i15 = displayMetrics.widthPixels;
                    fraction3 = typedValue.getFraction(i15, i15);
                } else {
                    i14 = 0;
                    if (i14 <= 0) {
                        Rect rect = this.f5687s;
                        i7 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                        z6 = true;
                    }
                }
                i14 = (int) fraction3;
                if (i14 <= 0) {
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z8 ? this.f5685q : this.f5686r;
            if (typedValue2 != null && (i11 = typedValue2.type) != 0) {
                if (i11 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i11 == 6) {
                    int i16 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i16, i16);
                } else {
                    i12 = 0;
                    if (i12 > 0) {
                        Rect rect2 = this.f5687s;
                        i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i12 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i8)), 1073741824);
                    }
                }
                i12 = (int) fraction2;
                if (i12 > 0) {
                }
            }
        }
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z6 || mode != Integer.MIN_VALUE) {
            z7 = false;
        } else {
            TypedValue typedValue3 = z8 ? this.f5682n : this.f5681m;
            if (typedValue3 != null && (i9 = typedValue3.type) != 0) {
                if (i9 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else if (i9 == 6) {
                    int i17 = displayMetrics.widthPixels;
                    fraction = typedValue3.getFraction(i17, i17);
                } else {
                    i10 = 0;
                    if (i10 > 0) {
                        Rect rect3 = this.f5687s;
                        i10 -= rect3.left + rect3.right;
                    }
                    if (measuredWidth >= i10) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                    }
                }
                i10 = (int) fraction;
                if (i10 > 0) {
                }
                if (measuredWidth >= i10) {
                }
            }
        }
        if (z7) {
            super.onMeasure(iMakeMeasureSpec, i8);
        }
    }

    public void setAttachListener(a aVar) {
        this.f5688t = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f5687s = new Rect();
    }
}
