package J3;

import A3.i;
import A3.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0544v;
import androidx.core.widget.c;
import com.google.android.material.internal.l;

/* JADX INFO: loaded from: classes.dex */
public class a extends C0544v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f1720s = i.f268l;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[][] f1721t = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ColorStateList f1722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f1723r;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f124x);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1722q == null) {
            int iD = E3.a.d(this, A3.a.f107g);
            int iD2 = E3.a.d(this, A3.a.f109i);
            int iD3 = E3.a.d(this, A3.a.f112l);
            int[][] iArr = f1721t;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = E3.a.h(iD3, iD, 1.0f);
            iArr2[1] = E3.a.h(iD3, iD2, 0.54f);
            iArr2[2] = E3.a.h(iD3, iD2, 0.38f);
            iArr2[3] = E3.a.h(iD3, iD2, 0.38f);
            this.f1722q = new ColorStateList(iArr, iArr2);
        }
        return this.f1722q;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1723r && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z6) {
        this.f1723r = z6;
        c.c(this, z6 ? getMaterialThemeColorsTintList() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f1720s;
        super(O3.a.c(context, attributeSet, i7, i8), attributeSet, i7);
        Context context2 = getContext();
        TypedArray typedArrayH = l.h(context2, attributeSet, j.f516h3, i7, i8, new int[0]);
        if (typedArrayH.hasValue(j.f524i3)) {
            c.c(this, K3.c.a(context2, typedArrayH, j.f524i3));
        }
        this.f1723r = typedArrayH.getBoolean(j.f532j3, false);
        typedArrayH.recycle();
    }
}
