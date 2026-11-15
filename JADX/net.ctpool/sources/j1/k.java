package j1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class k extends Drawable implements i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float[] f20252o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float[] f20250m = new float[8];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final float[] f20251n = new float[8];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final Paint f20253p = new Paint(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20254q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f20255r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f20256s = 0.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20257t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20258u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f20259v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final Path f20260w = new Path();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final Path f20261x = new Path();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f20262y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RectF f20263z = new RectF();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f20249A = 255;

    public k(int i7) {
        f(i7);
    }

    public static k a(ColorDrawable colorDrawable) {
        return new k(colorDrawable.getColor());
    }

    private void h() {
        float[] fArr;
        float[] fArr2;
        this.f20260w.reset();
        this.f20261x.reset();
        this.f20263z.set(getBounds());
        RectF rectF = this.f20263z;
        float f7 = this.f20255r;
        rectF.inset(f7 / 2.0f, f7 / 2.0f);
        int i7 = 0;
        if (this.f20254q) {
            this.f20261x.addCircle(this.f20263z.centerX(), this.f20263z.centerY(), Math.min(this.f20263z.width(), this.f20263z.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i8 = 0;
            while (true) {
                fArr = this.f20251n;
                if (i8 >= fArr.length) {
                    break;
                }
                fArr[i8] = (this.f20250m[i8] + this.f20256s) - (this.f20255r / 2.0f);
                i8++;
            }
            this.f20261x.addRoundRect(this.f20263z, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f20263z;
        float f8 = this.f20255r;
        rectF2.inset((-f8) / 2.0f, (-f8) / 2.0f);
        float f9 = this.f20256s + (this.f20258u ? this.f20255r : 0.0f);
        this.f20263z.inset(f9, f9);
        if (this.f20254q) {
            this.f20260w.addCircle(this.f20263z.centerX(), this.f20263z.centerY(), Math.min(this.f20263z.width(), this.f20263z.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f20258u) {
            if (this.f20252o == null) {
                this.f20252o = new float[8];
            }
            while (true) {
                fArr2 = this.f20252o;
                if (i7 >= fArr2.length) {
                    break;
                }
                fArr2[i7] = this.f20250m[i7] - this.f20255r;
                i7++;
            }
            this.f20260w.addRoundRect(this.f20263z, fArr2, Path.Direction.CW);
        } else {
            this.f20260w.addRoundRect(this.f20263z, this.f20250m, Path.Direction.CW);
        }
        float f10 = -f9;
        this.f20263z.inset(f10, f10);
    }

    @Override // j1.i
    public void b(int i7, float f7) {
        if (this.f20257t != i7) {
            this.f20257t = i7;
            invalidateSelf();
        }
        if (this.f20255r != f7) {
            this.f20255r = f7;
            h();
            invalidateSelf();
        }
    }

    @Override // j1.i
    public void d(boolean z6) {
        this.f20254q = z6;
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f20253p.setColor(e.c(this.f20262y, this.f20249A));
        this.f20253p.setStyle(Paint.Style.FILL);
        this.f20253p.setFilterBitmap(e());
        canvas.drawPath(this.f20260w, this.f20253p);
        if (this.f20255r != 0.0f) {
            this.f20253p.setColor(e.c(this.f20257t, this.f20249A));
            this.f20253p.setStyle(Paint.Style.STROKE);
            this.f20253p.setStrokeWidth(this.f20255r);
            canvas.drawPath(this.f20261x, this.f20253p);
        }
    }

    public boolean e() {
        return this.f20259v;
    }

    public void f(int i7) {
        if (this.f20262y != i7) {
            this.f20262y = i7;
            invalidateSelf();
        }
    }

    @Override // j1.i
    public void g(boolean z6) {
        if (this.f20259v != z6) {
            this.f20259v = z6;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20249A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return e.b(e.c(this.f20262y, this.f20249A));
    }

    @Override // j1.i
    public void j(boolean z6) {
        if (this.f20258u != z6) {
            this.f20258u = z6;
            h();
            invalidateSelf();
        }
    }

    @Override // j1.i
    public void o(float f7) {
        if (this.f20256s != f7) {
            this.f20256s = f7;
            h();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        h();
    }

    @Override // j1.i
    public void r(float f7) {
        O0.l.c(f7 >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f20250m, f7);
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (i7 != this.f20249A) {
            this.f20249A = i7;
            invalidateSelf();
        }
    }

    @Override // j1.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f20250m, 0.0f);
        } else {
            O0.l.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f20250m, 0, 8);
        }
        h();
        invalidateSelf();
    }

    @Override // j1.i
    public void c(boolean z6) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
