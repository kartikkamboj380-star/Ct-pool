package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.X;
import e.AbstractC1609a;
import e.AbstractC1611c;
import e.AbstractC1612d;
import e.AbstractC1613e;
import f.AbstractC1641a;

/* JADX INFO: renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0534k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f6137b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C0534k f6138c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X f6139a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$a */
    class a implements X.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f6140a = {AbstractC1613e.f18793R, AbstractC1613e.f18791P, AbstractC1613e.f18795a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f6141b = {AbstractC1613e.f18809o, AbstractC1613e.f18777B, AbstractC1613e.f18814t, AbstractC1613e.f18810p, AbstractC1613e.f18811q, AbstractC1613e.f18813s, AbstractC1613e.f18812r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f6142c = {AbstractC1613e.f18790O, AbstractC1613e.f18792Q, AbstractC1613e.f18805k, AbstractC1613e.f18786K, AbstractC1613e.f18787L, AbstractC1613e.f18788M, AbstractC1613e.f18789N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f6143d = {AbstractC1613e.f18817w, AbstractC1613e.f18803i, AbstractC1613e.f18816v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f6144e = {AbstractC1613e.f18785J, AbstractC1613e.f18794S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f6145f = {AbstractC1613e.f18797c, AbstractC1613e.f18801g, AbstractC1613e.f18798d, AbstractC1613e.f18802h};

        a() {
        }

        private boolean f(int[] iArr, int i7) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i7) {
            int iC = d0.c(context, AbstractC1609a.f18747t);
            return new ColorStateList(new int[][]{d0.f6085b, d0.f6088e, d0.f6086c, d0.f6092i}, new int[]{d0.b(context, AbstractC1609a.f18745r), androidx.core.graphics.a.g(iC, i7), androidx.core.graphics.a.g(iC, i7), i7});
        }

        private ColorStateList i(Context context) {
            return h(context, d0.c(context, AbstractC1609a.f18744q));
        }

        private ColorStateList j(Context context) {
            return h(context, d0.c(context, AbstractC1609a.f18745r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = d0.e(context, AbstractC1609a.f18749v);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = d0.f6085b;
                iArr2[0] = d0.b(context, AbstractC1609a.f18749v);
                iArr[1] = d0.f6089f;
                iArr2[1] = d0.c(context, AbstractC1609a.f18746s);
                iArr[2] = d0.f6092i;
                iArr2[2] = d0.c(context, AbstractC1609a.f18749v);
            } else {
                int[] iArr3 = d0.f6085b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = d0.f6089f;
                iArr2[1] = d0.c(context, AbstractC1609a.f18746s);
                iArr[2] = d0.f6092i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(X x6, Context context, int i7) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
            Drawable drawableI = x6.i(context, AbstractC1613e.f18781F);
            Drawable drawableI2 = x6.i(context, AbstractC1613e.f18782G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i7, PorterDuff.Mode mode) {
            if (O.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0534k.f6137b;
            }
            drawable.setColorFilter(C0534k.e(i7, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[RETURN] */
        @Override // androidx.appcompat.widget.X.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(Context context, int i7, Drawable drawable) {
            PorterDuff.Mode mode;
            int i8;
            boolean z6;
            int iRound;
            PorterDuff.Mode mode2 = C0534k.f6137b;
            if (f(this.f6140a, i7)) {
                i8 = AbstractC1609a.f18748u;
            } else if (f(this.f6142c, i7)) {
                i8 = AbstractC1609a.f18746s;
            } else {
                if (f(this.f6143d, i7)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i7 == AbstractC1613e.f18815u) {
                        z6 = true;
                        iRound = Math.round(40.8f);
                        i8 = 16842800;
                        mode = mode2;
                        if (z6) {
                            return false;
                        }
                        if (O.a(drawable)) {
                            drawable = drawable.mutate();
                        }
                        drawable.setColorFilter(C0534k.e(d0.c(context, i8), mode));
                        if (iRound != -1) {
                            drawable.setAlpha(iRound);
                        }
                        return true;
                    }
                    if (i7 != AbstractC1613e.f18806l) {
                        mode = mode2;
                        i8 = 0;
                        z6 = false;
                        iRound = -1;
                        if (z6) {
                        }
                    }
                }
                mode = mode2;
                iRound = -1;
                i8 = 16842801;
                z6 = true;
                if (z6) {
                }
            }
            mode = mode2;
            z6 = true;
            iRound = -1;
            if (z6) {
            }
        }

        @Override // androidx.appcompat.widget.X.c
        public PorterDuff.Mode b(int i7) {
            if (i7 == AbstractC1613e.f18783H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public Drawable c(X x6, Context context, int i7) {
            int i8;
            if (i7 == AbstractC1613e.f18804j) {
                return new LayerDrawable(new Drawable[]{x6.i(context, AbstractC1613e.f18803i), x6.i(context, AbstractC1613e.f18805k)});
            }
            if (i7 == AbstractC1613e.f18819y) {
                i8 = AbstractC1612d.f18769g;
            } else if (i7 == AbstractC1613e.f18818x) {
                i8 = AbstractC1612d.f18770h;
            } else {
                if (i7 != AbstractC1613e.f18820z) {
                    return null;
                }
                i8 = AbstractC1612d.f18771i;
            }
            return l(x6, context, i8);
        }

        @Override // androidx.appcompat.widget.X.c
        public ColorStateList d(Context context, int i7) {
            if (i7 == AbstractC1613e.f18807m) {
                return AbstractC1641a.a(context, AbstractC1611c.f18759e);
            }
            if (i7 == AbstractC1613e.f18784I) {
                return AbstractC1641a.a(context, AbstractC1611c.f18762h);
            }
            if (i7 == AbstractC1613e.f18783H) {
                return k(context);
            }
            if (i7 == AbstractC1613e.f18800f) {
                return j(context);
            }
            if (i7 == AbstractC1613e.f18796b) {
                return g(context);
            }
            if (i7 == AbstractC1613e.f18799e) {
                return i(context);
            }
            if (i7 == AbstractC1613e.f18779D || i7 == AbstractC1613e.f18780E) {
                return AbstractC1641a.a(context, AbstractC1611c.f18761g);
            }
            if (f(this.f6141b, i7)) {
                return d0.e(context, AbstractC1609a.f18748u);
            }
            if (f(this.f6144e, i7)) {
                return AbstractC1641a.a(context, AbstractC1611c.f18758d);
            }
            if (f(this.f6145f, i7)) {
                return AbstractC1641a.a(context, AbstractC1611c.f18757c);
            }
            if (i7 == AbstractC1613e.f18776A) {
                return AbstractC1641a.a(context, AbstractC1611c.f18760f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.X.c
        public boolean e(Context context, int i7, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable drawableFindDrawableByLayerId;
            int i8;
            if (i7 == AbstractC1613e.f18778C) {
                layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), d0.c(context, AbstractC1609a.f18748u), C0534k.f6137b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                i8 = AbstractC1609a.f18748u;
            } else {
                if (i7 != AbstractC1613e.f18819y && i7 != AbstractC1613e.f18818x && i7 != AbstractC1613e.f18820z) {
                    return false;
                }
                layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), d0.b(context, AbstractC1609a.f18748u), C0534k.f6137b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                i8 = AbstractC1609a.f18746s;
            }
            m(drawableFindDrawableByLayerId, d0.c(context, i8), C0534k.f6137b);
            m(layerDrawable.findDrawableByLayerId(R.id.progress), d0.c(context, AbstractC1609a.f18746s), C0534k.f6137b);
            return true;
        }
    }

    public static synchronized C0534k b() {
        try {
            if (f6138c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6138c;
    }

    public static synchronized PorterDuffColorFilter e(int i7, PorterDuff.Mode mode) {
        return X.k(i7, mode);
    }

    public static synchronized void h() {
        if (f6138c == null) {
            C0534k c0534k = new C0534k();
            f6138c = c0534k;
            c0534k.f6139a = X.g();
            f6138c.f6139a.t(new a());
        }
    }

    static void i(Drawable drawable, f0 f0Var, int[] iArr) {
        X.v(drawable, f0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i7) {
        return this.f6139a.i(context, i7);
    }

    synchronized Drawable d(Context context, int i7, boolean z6) {
        return this.f6139a.j(context, i7, z6);
    }

    synchronized ColorStateList f(Context context, int i7) {
        return this.f6139a.l(context, i7);
    }

    public synchronized void g(Context context) {
        this.f6139a.r(context);
    }
}
