package K3;

import A3.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.f;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f1853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f1854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f1855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f1864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f1865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f1866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f1867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f1868p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Typeface f1869q;

    class a extends f.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f1870a;

        a(f fVar) {
            this.f1870a = fVar;
        }

        @Override // androidx.core.content.res.f.e
        /* JADX INFO: renamed from: h */
        public void f(int i7) {
            d.this.f1868p = true;
            this.f1870a.a(i7);
        }

        @Override // androidx.core.content.res.f.e
        /* JADX INFO: renamed from: i */
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f1869q = Typeface.create(typeface, dVar.f1857e);
            d.this.f1868p = true;
            this.f1870a.b(d.this.f1869q, false);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f1873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f1874c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f1872a = context;
            this.f1873b = textPaint;
            this.f1874c = fVar;
        }

        @Override // K3.f
        public void a(int i7) {
            this.f1874c.a(i7);
        }

        @Override // K3.f
        public void b(Typeface typeface, boolean z6) {
            d.this.p(this.f1872a, this.f1873b, typeface);
            this.f1874c.b(typeface, z6);
        }
    }

    public d(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, j.f342J4);
        l(typedArrayObtainStyledAttributes.getDimension(j.f349K4, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, j.f370N4));
        this.f1853a = c.a(context, typedArrayObtainStyledAttributes, j.f377O4);
        this.f1854b = c.a(context, typedArrayObtainStyledAttributes, j.f384P4);
        this.f1857e = typedArrayObtainStyledAttributes.getInt(j.f363M4, 0);
        this.f1858f = typedArrayObtainStyledAttributes.getInt(j.f356L4, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, j.f426V4, j.f419U4);
        this.f1867o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f1856d = typedArrayObtainStyledAttributes.getString(iE);
        this.f1859g = typedArrayObtainStyledAttributes.getBoolean(j.f433W4, false);
        this.f1855c = c.a(context, typedArrayObtainStyledAttributes, j.f391Q4);
        this.f1860h = typedArrayObtainStyledAttributes.getFloat(j.f398R4, 0.0f);
        this.f1861i = typedArrayObtainStyledAttributes.getFloat(j.f405S4, 0.0f);
        this.f1862j = typedArrayObtainStyledAttributes.getFloat(j.f412T4, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i7, j.f564n3);
        this.f1863k = typedArrayObtainStyledAttributes2.hasValue(j.f572o3);
        this.f1864l = typedArrayObtainStyledAttributes2.getFloat(j.f572o3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f1869q == null && (str = this.f1856d) != null) {
            this.f1869q = Typeface.create(str, this.f1857e);
        }
        if (this.f1869q == null) {
            int i7 = this.f1858f;
            this.f1869q = i7 != 1 ? i7 != 2 ? i7 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f1869q = Typeface.create(this.f1869q, this.f1857e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i7 = this.f1867o;
        return (i7 != 0 ? androidx.core.content.res.f.c(context, i7) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f1869q;
    }

    public Typeface f(Context context) {
        if (this.f1868p) {
            return this.f1869q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = androidx.core.content.res.f.h(context, this.f1867o);
                this.f1869q = typefaceH;
                if (typefaceH != null) {
                    this.f1869q = Typeface.create(typefaceH, this.f1857e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e7) {
                Log.d("TextAppearance", "Error loading font " + this.f1856d, e7);
            }
        }
        d();
        this.f1868p = true;
        return this.f1869q;
    }

    public void g(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i7 = this.f1867o;
        if (i7 == 0) {
            this.f1868p = true;
        }
        if (this.f1868p) {
            fVar.b(this.f1869q, true);
            return;
        }
        try {
            androidx.core.content.res.f.j(context, i7, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f1868p = true;
            fVar.a(1);
        } catch (Exception e7) {
            Log.d("TextAppearance", "Error loading font " + this.f1856d, e7);
            this.f1868p = true;
            fVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, fVar));
    }

    public ColorStateList i() {
        return this.f1865m;
    }

    public float j() {
        return this.f1866n;
    }

    public void k(ColorStateList colorStateList) {
        this.f1865m = colorStateList;
    }

    public void l(float f7) {
        this.f1866n = f7;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f1865m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f7 = this.f1862j;
        float f8 = this.f1860h;
        float f9 = this.f1861i;
        ColorStateList colorStateList2 = this.f1855c;
        textPaint.setShadowLayer(f7, f8, f9, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = i.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i7 = this.f1857e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i7 & 1) != 0);
        textPaint.setTextSkewX((i7 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1866n);
        if (this.f1863k) {
            textPaint.setLetterSpacing(this.f1864l);
        }
    }
}
