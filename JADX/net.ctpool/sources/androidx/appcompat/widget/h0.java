package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.f;
import f.AbstractC1641a;

/* JADX INFO: loaded from: classes.dex */
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f6121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f6122c;

    private h0(Context context, TypedArray typedArray) {
        this.f6120a = context;
        this.f6121b = typedArray;
    }

    public static h0 t(Context context, int i7, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(i7, iArr));
    }

    public static h0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static h0 v(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8) {
        return new h0(context, context.obtainStyledAttributes(attributeSet, iArr, i7, i8));
    }

    public boolean a(int i7, boolean z6) {
        return this.f6121b.getBoolean(i7, z6);
    }

    public int b(int i7, int i8) {
        return this.f6121b.getColor(i7, i8);
    }

    public ColorStateList c(int i7) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f6121b.hasValue(i7) || (resourceId = this.f6121b.getResourceId(i7, 0)) == 0 || (colorStateListA = AbstractC1641a.a(this.f6120a, resourceId)) == null) ? this.f6121b.getColorStateList(i7) : colorStateListA;
    }

    public float d(int i7, float f7) {
        return this.f6121b.getDimension(i7, f7);
    }

    public int e(int i7, int i8) {
        return this.f6121b.getDimensionPixelOffset(i7, i8);
    }

    public int f(int i7, int i8) {
        return this.f6121b.getDimensionPixelSize(i7, i8);
    }

    public Drawable g(int i7) {
        int resourceId;
        return (!this.f6121b.hasValue(i7) || (resourceId = this.f6121b.getResourceId(i7, 0)) == 0) ? this.f6121b.getDrawable(i7) : AbstractC1641a.b(this.f6120a, resourceId);
    }

    public Drawable h(int i7) {
        int resourceId;
        if (!this.f6121b.hasValue(i7) || (resourceId = this.f6121b.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return C0534k.b().d(this.f6120a, resourceId, true);
    }

    public float i(int i7, float f7) {
        return this.f6121b.getFloat(i7, f7);
    }

    public Typeface j(int i7, int i8, f.e eVar) {
        int resourceId = this.f6121b.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f6122c == null) {
            this.f6122c = new TypedValue();
        }
        return androidx.core.content.res.f.i(this.f6120a, resourceId, this.f6122c, i8, eVar);
    }

    public int k(int i7, int i8) {
        return this.f6121b.getInt(i7, i8);
    }

    public int l(int i7, int i8) {
        return this.f6121b.getInteger(i7, i8);
    }

    public int m(int i7, int i8) {
        return this.f6121b.getLayoutDimension(i7, i8);
    }

    public int n(int i7, int i8) {
        return this.f6121b.getResourceId(i7, i8);
    }

    public String o(int i7) {
        return this.f6121b.getString(i7);
    }

    public CharSequence p(int i7) {
        return this.f6121b.getText(i7);
    }

    public CharSequence[] q(int i7) {
        return this.f6121b.getTextArray(i7);
    }

    public TypedArray r() {
        return this.f6121b;
    }

    public boolean s(int i7) {
        return this.f6121b.hasValue(i7);
    }

    public void w() {
        this.f6121b.recycle();
    }
}
