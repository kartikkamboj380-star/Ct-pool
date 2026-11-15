package D3;

import A3.i;
import A3.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0530g;
import androidx.core.widget.c;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;

/* JADX INFO: loaded from: classes.dex */
public class a extends C0530g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f1002t = i.f267k;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[][] f1003u = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ColorStateList f1004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f1006s;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f104d);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1004q == null) {
            int[][] iArr = f1003u;
            int[] iArr2 = new int[iArr.length];
            int iD = E3.a.d(this, A3.a.f107g);
            int iD2 = E3.a.d(this, A3.a.f112l);
            int iD3 = E3.a.d(this, A3.a.f109i);
            iArr2[0] = E3.a.h(iD2, iD, 1.0f);
            iArr2[1] = E3.a.h(iD2, iD3, 0.54f);
            iArr2[2] = E3.a.h(iD2, iD3, 0.38f);
            iArr2[3] = E3.a.h(iD2, iD3, 0.38f);
            this.f1004q = new ColorStateList(iArr, iArr2);
        }
        return this.f1004q;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1005r && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f1006s || !TextUtils.isEmpty(getText()) || (drawableA = c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (n.e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            androidx.core.graphics.drawable.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z6) {
        this.f1006s = z6;
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f1005r = z6;
        c.c(this, z6 ? getMaterialThemeColorsTintList() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f1002t;
        super(O3.a.c(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f476c3, i7, i8, new int[0]);
        if (typedArrayH.hasValue(j.f484d3)) {
            c.c(this, K3.c.a(context2, typedArrayH, j.f484d3));
        }
        this.f1005r = typedArrayH.getBoolean(j.f500f3, false);
        this.f1006s = typedArrayH.getBoolean(j.f492e3, true);
        typedArrayH.recycle();
    }
}
