package N3;

import N3.k;
import N3.l;
import N3.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements n {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final String f2148J = "g";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Paint f2149K;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Paint f2150A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final M3.a f2151B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final l.b f2152C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final l f2153D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private PorterDuffColorFilter f2154E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private PorterDuffColorFilter f2155F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f2156G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final RectF f2157H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f2158I;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f2159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final m.g[] f2160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m.g[] f2161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BitSet f2162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Matrix f2164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Path f2165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Path f2166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f2167u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f2168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Region f2169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Region f2170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private k f2171y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Paint f2172z;

    class a implements l.b {
        a() {
        }

        @Override // N3.l.b
        public void a(m mVar, Matrix matrix, int i7) {
            g.this.f2162p.set(i7, mVar.e());
            g.this.f2160n[i7] = mVar.f(matrix);
        }

        @Override // N3.l.b
        public void b(m mVar, Matrix matrix, int i7) {
            g.this.f2162p.set(i7 + 4, mVar.e());
            g.this.f2161o[i7] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2174a;

        b(float f7) {
            this.f2174a = f7;
        }

        @Override // N3.k.c
        public N3.c a(N3.c cVar) {
            return cVar instanceof i ? cVar : new N3.b(this.f2174a, cVar);
        }
    }

    static final class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f2176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public H3.a f2177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f2178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f2179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f2180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f2181f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f2182g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f2183h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rect f2184i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f2185j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f2186k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f2187l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2188m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f2189n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f2190o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f2191p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2192q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2193r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2194s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2195t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f2196u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Paint.Style f2197v;

        public c(c cVar) {
            this.f2179d = null;
            this.f2180e = null;
            this.f2181f = null;
            this.f2182g = null;
            this.f2183h = PorterDuff.Mode.SRC_IN;
            this.f2184i = null;
            this.f2185j = 1.0f;
            this.f2186k = 1.0f;
            this.f2188m = 255;
            this.f2189n = 0.0f;
            this.f2190o = 0.0f;
            this.f2191p = 0.0f;
            this.f2192q = 0;
            this.f2193r = 0;
            this.f2194s = 0;
            this.f2195t = 0;
            this.f2196u = false;
            this.f2197v = Paint.Style.FILL_AND_STROKE;
            this.f2176a = cVar.f2176a;
            this.f2177b = cVar.f2177b;
            this.f2187l = cVar.f2187l;
            this.f2178c = cVar.f2178c;
            this.f2179d = cVar.f2179d;
            this.f2180e = cVar.f2180e;
            this.f2183h = cVar.f2183h;
            this.f2182g = cVar.f2182g;
            this.f2188m = cVar.f2188m;
            this.f2185j = cVar.f2185j;
            this.f2194s = cVar.f2194s;
            this.f2192q = cVar.f2192q;
            this.f2196u = cVar.f2196u;
            this.f2186k = cVar.f2186k;
            this.f2189n = cVar.f2189n;
            this.f2190o = cVar.f2190o;
            this.f2191p = cVar.f2191p;
            this.f2193r = cVar.f2193r;
            this.f2195t = cVar.f2195t;
            this.f2181f = cVar.f2181f;
            this.f2197v = cVar.f2197v;
            if (cVar.f2184i != null) {
                this.f2184i = new Rect(cVar.f2184i);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f2163q = true;
            return gVar;
        }

        public c(k kVar, H3.a aVar) {
            this.f2179d = null;
            this.f2180e = null;
            this.f2181f = null;
            this.f2182g = null;
            this.f2183h = PorterDuff.Mode.SRC_IN;
            this.f2184i = null;
            this.f2185j = 1.0f;
            this.f2186k = 1.0f;
            this.f2188m = 255;
            this.f2189n = 0.0f;
            this.f2190o = 0.0f;
            this.f2191p = 0.0f;
            this.f2192q = 0;
            this.f2193r = 0;
            this.f2194s = 0;
            this.f2195t = 0;
            this.f2196u = false;
            this.f2197v = Paint.Style.FILL_AND_STROKE;
            this.f2176a = kVar;
            this.f2177b = aVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f2149K = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    private float D() {
        if (K()) {
            return this.f2150A.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean I() {
        c cVar = this.f2159m;
        int i7 = cVar.f2192q;
        return i7 != 1 && cVar.f2193r > 0 && (i7 == 2 || S());
    }

    private boolean J() {
        Paint.Style style = this.f2159m.f2197v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean K() {
        Paint.Style style = this.f2159m.f2197v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2150A.getStrokeWidth() > 0.0f;
    }

    private void M() {
        super.invalidateSelf();
    }

    private void P(Canvas canvas) {
        if (I()) {
            canvas.save();
            R(canvas);
            if (this.f2158I) {
                int iWidth = (int) (this.f2157H.width() - getBounds().width());
                int iHeight = (int) (this.f2157H.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f2157H.width()) + (this.f2159m.f2193r * 2) + iWidth, ((int) this.f2157H.height()) + (this.f2159m.f2193r * 2) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f7 = (getBounds().left - this.f2159m.f2193r) - iWidth;
                float f8 = (getBounds().top - this.f2159m.f2193r) - iHeight;
                canvas2.translate(-f7, -f8);
                n(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f7, f8, (Paint) null);
                bitmapCreateBitmap.recycle();
            } else {
                n(canvas);
            }
            canvas.restore();
        }
    }

    private static int Q(int i7, int i8) {
        return (i7 * (i8 + (i8 >>> 7))) >>> 8;
    }

    private void R(Canvas canvas) {
        canvas.translate(A(), B());
    }

    private boolean d0(int[] iArr) {
        boolean z6;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f2159m.f2179d == null || color2 == (colorForState2 = this.f2159m.f2179d.getColorForState(iArr, (color2 = this.f2172z.getColor())))) {
            z6 = false;
        } else {
            this.f2172z.setColor(colorForState2);
            z6 = true;
        }
        if (this.f2159m.f2180e == null || color == (colorForState = this.f2159m.f2180e.getColorForState(iArr, (color = this.f2150A.getColor())))) {
            return z6;
        }
        this.f2150A.setColor(colorForState);
        return true;
    }

    private boolean e0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f2154E;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2155F;
        c cVar = this.f2159m;
        this.f2154E = k(cVar.f2182g, cVar.f2183h, this.f2172z, true);
        c cVar2 = this.f2159m;
        this.f2155F = k(cVar2.f2181f, cVar2.f2183h, this.f2150A, false);
        c cVar3 = this.f2159m;
        if (cVar3.f2196u) {
            this.f2151B.d(cVar3.f2182g.getColorForState(getState(), 0));
        }
        return (androidx.core.util.b.a(porterDuffColorFilter, this.f2154E) && androidx.core.util.b.a(porterDuffColorFilter2, this.f2155F)) ? false : true;
    }

    private PorterDuffColorFilter f(Paint paint, boolean z6) {
        if (!z6) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f2156G = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void f0() {
        float fH = H();
        this.f2159m.f2193r = (int) Math.ceil(0.75f * fH);
        this.f2159m.f2194s = (int) Math.ceil(fH * 0.25f);
        e0();
        M();
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f2159m.f2185j != 1.0f) {
            this.f2164r.reset();
            Matrix matrix = this.f2164r;
            float f7 = this.f2159m.f2185j;
            matrix.setScale(f7, f7, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f2164r);
        }
        path.computeBounds(this.f2157H, true);
    }

    private void i() {
        k kVarY = C().y(new b(-D()));
        this.f2171y = kVarY;
        this.f2153D.e(kVarY, this.f2159m.f2186k, v(), this.f2166t);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z6) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z6) {
            colorForState = l(colorForState);
        }
        this.f2156G = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z6) {
        return (colorStateList == null || mode == null) ? f(paint, z6) : j(colorStateList, mode, z6);
    }

    public static g m(Context context, float f7) {
        int iC = E3.a.c(context, A3.a.f112l, g.class.getSimpleName());
        g gVar = new g();
        gVar.L(context);
        gVar.V(ColorStateList.valueOf(iC));
        gVar.U(f7);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f2162p.cardinality() > 0) {
            Log.w(f2148J, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f2159m.f2194s != 0) {
            canvas.drawPath(this.f2165s, this.f2151B.c());
        }
        for (int i7 = 0; i7 < 4; i7++) {
            this.f2160n[i7].a(this.f2151B, this.f2159m.f2193r, canvas);
            this.f2161o[i7].a(this.f2151B, this.f2159m.f2193r, canvas);
        }
        if (this.f2158I) {
            int iA = A();
            int iB = B();
            canvas.translate(-iA, -iB);
            canvas.drawPath(this.f2165s, f2149K);
            canvas.translate(iA, iB);
        }
    }

    private void o(Canvas canvas) {
        p(canvas, this.f2172z, this.f2165s, this.f2159m.f2176a, u());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f2159m.f2186k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private RectF v() {
        this.f2168v.set(u());
        float fD = D();
        this.f2168v.inset(fD, fD);
        return this.f2168v;
    }

    public int A() {
        return (int) (((double) this.f2159m.f2194s) * Math.sin(Math.toRadians(r0.f2195t)));
    }

    public int B() {
        return (int) (((double) this.f2159m.f2194s) * Math.cos(Math.toRadians(r0.f2195t)));
    }

    public k C() {
        return this.f2159m.f2176a;
    }

    public float E() {
        return this.f2159m.f2176a.r().a(u());
    }

    public float F() {
        return this.f2159m.f2176a.t().a(u());
    }

    public float G() {
        return this.f2159m.f2191p;
    }

    public float H() {
        return w() + G();
    }

    public void L(Context context) {
        this.f2159m.f2177b = new H3.a(context);
        f0();
    }

    public boolean N() {
        H3.a aVar = this.f2159m.f2177b;
        return aVar != null && aVar.d();
    }

    public boolean O() {
        return this.f2159m.f2176a.u(u());
    }

    public boolean S() {
        return (O() || this.f2165s.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void T(N3.c cVar) {
        setShapeAppearanceModel(this.f2159m.f2176a.x(cVar));
    }

    public void U(float f7) {
        c cVar = this.f2159m;
        if (cVar.f2190o != f7) {
            cVar.f2190o = f7;
            f0();
        }
    }

    public void V(ColorStateList colorStateList) {
        c cVar = this.f2159m;
        if (cVar.f2179d != colorStateList) {
            cVar.f2179d = colorStateList;
            onStateChange(getState());
        }
    }

    public void W(float f7) {
        c cVar = this.f2159m;
        if (cVar.f2186k != f7) {
            cVar.f2186k = f7;
            this.f2163q = true;
            invalidateSelf();
        }
    }

    public void X(int i7, int i8, int i9, int i10) {
        c cVar = this.f2159m;
        if (cVar.f2184i == null) {
            cVar.f2184i = new Rect();
        }
        this.f2159m.f2184i.set(i7, i8, i9, i10);
        invalidateSelf();
    }

    public void Y(float f7) {
        c cVar = this.f2159m;
        if (cVar.f2189n != f7) {
            cVar.f2189n = f7;
            f0();
        }
    }

    public void Z(float f7, int i7) {
        c0(f7);
        b0(ColorStateList.valueOf(i7));
    }

    public void a0(float f7, ColorStateList colorStateList) {
        c0(f7);
        b0(colorStateList);
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f2159m;
        if (cVar.f2180e != colorStateList) {
            cVar.f2180e = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f7) {
        this.f2159m.f2187l = f7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2172z.setColorFilter(this.f2154E);
        int alpha = this.f2172z.getAlpha();
        this.f2172z.setAlpha(Q(alpha, this.f2159m.f2188m));
        this.f2150A.setColorFilter(this.f2155F);
        this.f2150A.setStrokeWidth(this.f2159m.f2187l);
        int alpha2 = this.f2150A.getAlpha();
        this.f2150A.setAlpha(Q(alpha2, this.f2159m.f2188m));
        if (this.f2163q) {
            i();
            g(u(), this.f2165s);
            this.f2163q = false;
        }
        P(canvas);
        if (J()) {
            o(canvas);
        }
        if (K()) {
            r(canvas);
        }
        this.f2172z.setAlpha(alpha);
        this.f2150A.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2159m.f2188m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f2159m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f2159m.f2192q == 2) {
            return;
        }
        if (O()) {
            outline.setRoundRect(getBounds(), E() * this.f2159m.f2186k);
            return;
        }
        g(u(), this.f2165s);
        if (this.f2165s.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f2165s);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f2159m.f2184i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f2169w.set(getBounds());
        g(u(), this.f2165s);
        this.f2170x.setPath(this.f2165s, this.f2169w);
        this.f2169w.op(this.f2170x, Region.Op.DIFFERENCE);
        return this.f2169w;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.f2153D;
        c cVar = this.f2159m;
        lVar.d(cVar.f2176a, cVar.f2186k, rectF, this.f2152C, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f2163q = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f2159m.f2182g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f2159m.f2181f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f2159m.f2180e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f2159m.f2179d) != null && colorStateList4.isStateful())));
    }

    protected int l(int i7) {
        float fH = H() + y();
        H3.a aVar = this.f2159m.f2177b;
        return aVar != null ? aVar.c(i7, fH) : i7;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2159m = new c(this.f2159m);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f2163q = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z6 = d0(iArr) || e0();
        if (z6) {
            invalidateSelf();
        }
        return z6;
    }

    protected void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f2159m.f2176a, rectF);
    }

    protected void r(Canvas canvas) {
        p(canvas, this.f2150A, this.f2166t, this.f2171y, v());
    }

    public float s() {
        return this.f2159m.f2176a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        c cVar = this.f2159m;
        if (cVar.f2188m != i7) {
            cVar.f2188m = i7;
            M();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2159m.f2178c = colorFilter;
        M();
    }

    @Override // N3.n
    public void setShapeAppearanceModel(k kVar) {
        this.f2159m.f2176a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2159m.f2182g = colorStateList;
        e0();
        M();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2159m;
        if (cVar.f2183h != mode) {
            cVar.f2183h = mode;
            e0();
            M();
        }
    }

    public float t() {
        return this.f2159m.f2176a.l().a(u());
    }

    protected RectF u() {
        this.f2167u.set(getBounds());
        return this.f2167u;
    }

    public float w() {
        return this.f2159m.f2190o;
    }

    public ColorStateList x() {
        return this.f2159m.f2179d;
    }

    public float y() {
        return this.f2159m.f2189n;
    }

    public int z() {
        return this.f2156G;
    }

    private g(c cVar) {
        this.f2160n = new m.g[4];
        this.f2161o = new m.g[4];
        this.f2162p = new BitSet(8);
        this.f2164r = new Matrix();
        this.f2165s = new Path();
        this.f2166t = new Path();
        this.f2167u = new RectF();
        this.f2168v = new RectF();
        this.f2169w = new Region();
        this.f2170x = new Region();
        Paint paint = new Paint(1);
        this.f2172z = paint;
        Paint paint2 = new Paint(1);
        this.f2150A = paint2;
        this.f2151B = new M3.a();
        this.f2153D = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.f2157H = new RectF();
        this.f2158I = true;
        this.f2159m = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        e0();
        d0(getState());
        this.f2152C = new a();
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    public g(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(k.e(context, attributeSet, i7, i8).m());
    }
}
