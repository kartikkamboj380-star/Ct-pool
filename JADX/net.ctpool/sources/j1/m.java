package j1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends Drawable implements i, q {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    RectF f20286B;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    Matrix f20292H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    Matrix f20293I;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private r f20299O;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Drawable f20300m;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    float[] f20310w;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f20301n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f20302o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected float f20303p = 0.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final Path f20304q = new Path();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f20305r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f20306s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final Path f20307t = new Path();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float[] f20308u = new float[8];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final float[] f20309v = new float[8];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final RectF f20311x = new RectF();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final RectF f20312y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final RectF f20313z = new RectF();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final RectF f20285A = new RectF();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final Matrix f20287C = new Matrix();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final Matrix f20288D = new Matrix();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final Matrix f20289E = new Matrix();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final Matrix f20290F = new Matrix();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final Matrix f20291G = new Matrix();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final Matrix f20294J = new Matrix();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private float f20295K = 0.0f;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f20296L = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f20297M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f20298N = true;

    m(Drawable drawable) {
        this.f20300m = drawable;
    }

    public boolean a() {
        return this.f20297M;
    }

    @Override // j1.i
    public void b(int i7, float f7) {
        if (this.f20306s == i7 && this.f20303p == f7) {
            return;
        }
        this.f20306s = i7;
        this.f20303p = f7;
        this.f20298N = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f20300m.clearColorFilter();
    }

    @Override // j1.i
    public void d(boolean z6) {
        this.f20301n = z6;
        this.f20298N = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (K1.b.d()) {
            K1.b.a("RoundedDrawable#draw");
        }
        this.f20300m.draw(canvas);
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    boolean e() {
        return this.f20301n || this.f20302o || this.f20303p > 0.0f;
    }

    protected void f() {
        float[] fArr;
        if (this.f20298N) {
            this.f20307t.reset();
            RectF rectF = this.f20311x;
            float f7 = this.f20303p;
            rectF.inset(f7 / 2.0f, f7 / 2.0f);
            if (this.f20301n) {
                this.f20307t.addCircle(this.f20311x.centerX(), this.f20311x.centerY(), Math.min(this.f20311x.width(), this.f20311x.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i7 = 0;
                while (true) {
                    fArr = this.f20309v;
                    if (i7 >= fArr.length) {
                        break;
                    }
                    fArr[i7] = (this.f20308u[i7] + this.f20295K) - (this.f20303p / 2.0f);
                    i7++;
                }
                this.f20307t.addRoundRect(this.f20311x, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f20311x;
            float f8 = this.f20303p;
            rectF2.inset((-f8) / 2.0f, (-f8) / 2.0f);
            this.f20304q.reset();
            float f9 = this.f20295K + (this.f20296L ? this.f20303p : 0.0f);
            this.f20311x.inset(f9, f9);
            if (this.f20301n) {
                this.f20304q.addCircle(this.f20311x.centerX(), this.f20311x.centerY(), Math.min(this.f20311x.width(), this.f20311x.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f20296L) {
                if (this.f20310w == null) {
                    this.f20310w = new float[8];
                }
                for (int i8 = 0; i8 < this.f20309v.length; i8++) {
                    this.f20310w[i8] = this.f20308u[i8] - this.f20303p;
                }
                this.f20304q.addRoundRect(this.f20311x, this.f20310w, Path.Direction.CW);
            } else {
                this.f20304q.addRoundRect(this.f20311x, this.f20308u, Path.Direction.CW);
            }
            float f10 = -f9;
            this.f20311x.inset(f10, f10);
            this.f20304q.setFillType(Path.FillType.WINDING);
            this.f20298N = false;
        }
    }

    @Override // j1.i
    public void g(boolean z6) {
        if (this.f20297M != z6) {
            this.f20297M = z6;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20300m.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f20300m.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f20300m.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20300m.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f20300m.getOpacity();
    }

    protected void h() {
        Matrix matrix;
        r rVar = this.f20299O;
        if (rVar != null) {
            rVar.f(this.f20289E);
            this.f20299O.n(this.f20311x);
        } else {
            this.f20289E.reset();
            this.f20311x.set(getBounds());
        }
        this.f20313z.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.f20285A.set(this.f20300m.getBounds());
        Matrix matrix2 = this.f20287C;
        RectF rectF = this.f20313z;
        RectF rectF2 = this.f20285A;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix2.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f20296L) {
            RectF rectF3 = this.f20286B;
            if (rectF3 == null) {
                this.f20286B = new RectF(this.f20311x);
            } else {
                rectF3.set(this.f20311x);
            }
            RectF rectF4 = this.f20286B;
            float f7 = this.f20303p;
            rectF4.inset(f7, f7);
            if (this.f20292H == null) {
                this.f20292H = new Matrix();
            }
            this.f20292H.setRectToRect(this.f20311x, this.f20286B, scaleToFit);
        } else {
            Matrix matrix3 = this.f20292H;
            if (matrix3 != null) {
                matrix3.reset();
            }
        }
        if (!this.f20289E.equals(this.f20290F) || !this.f20287C.equals(this.f20288D) || ((matrix = this.f20292H) != null && !matrix.equals(this.f20293I))) {
            this.f20305r = true;
            this.f20289E.invert(this.f20291G);
            this.f20294J.set(this.f20289E);
            if (this.f20296L) {
                this.f20294J.postConcat(this.f20292H);
            }
            this.f20294J.preConcat(this.f20287C);
            this.f20290F.set(this.f20289E);
            this.f20288D.set(this.f20287C);
            if (this.f20296L) {
                Matrix matrix4 = this.f20293I;
                if (matrix4 == null) {
                    this.f20293I = new Matrix(this.f20292H);
                } else {
                    matrix4.set(this.f20292H);
                }
            } else {
                Matrix matrix5 = this.f20293I;
                if (matrix5 != null) {
                    matrix5.reset();
                }
            }
        }
        if (this.f20311x.equals(this.f20312y)) {
            return;
        }
        this.f20298N = true;
        this.f20312y.set(this.f20311x);
    }

    @Override // j1.i
    public void j(boolean z6) {
        if (this.f20296L != z6) {
            this.f20296L = z6;
            this.f20298N = true;
            invalidateSelf();
        }
    }

    @Override // j1.q
    public void m(r rVar) {
        this.f20299O = rVar;
    }

    @Override // j1.i
    public void o(float f7) {
        if (this.f20295K != f7) {
            this.f20295K = f7;
            this.f20298N = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f20300m.setBounds(rect);
    }

    @Override // j1.i
    public void r(float f7) {
        O0.l.i(f7 >= 0.0f);
        Arrays.fill(this.f20308u, f7);
        this.f20302o = f7 != 0.0f;
        this.f20298N = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f20300m.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i7, PorterDuff.Mode mode) {
        this.f20300m.setColorFilter(i7, mode);
    }

    @Override // j1.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f20308u, 0.0f);
            this.f20302o = false;
        } else {
            O0.l.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f20308u, 0, 8);
            this.f20302o = false;
            for (int i7 = 0; i7 < 8; i7++) {
                this.f20302o |= fArr[i7] > 0.0f;
            }
        }
        this.f20298N = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20300m.setColorFilter(colorFilter);
    }

    public void c(boolean z6) {
    }
}
