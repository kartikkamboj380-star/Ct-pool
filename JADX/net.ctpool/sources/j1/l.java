package j1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class l extends g implements i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f20264A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f20265B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f20266C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f20267D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Path f20268E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Path f20269F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final RectF f20270G;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    b f20271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RectF f20272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RectF f20273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Matrix f20274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float[] f20275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final float[] f20276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final Paint f20277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f20278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f20279y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f20280z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20281a;

        static {
            int[] iArr = new int[b.values().length];
            f20281a = iArr;
            try {
                iArr[b.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20281a[b.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public l(Drawable drawable) {
        super((Drawable) O0.l.g(drawable));
        this.f20271q = b.OVERLAY_COLOR;
        this.f20272r = new RectF();
        this.f20275u = new float[8];
        this.f20276v = new float[8];
        this.f20277w = new Paint(1);
        this.f20278x = false;
        this.f20279y = 0.0f;
        this.f20280z = 0;
        this.f20264A = 0;
        this.f20265B = 0.0f;
        this.f20266C = false;
        this.f20267D = false;
        this.f20268E = new Path();
        this.f20269F = new Path();
        this.f20270G = new RectF();
    }

    private void z() {
        float[] fArr;
        this.f20268E.reset();
        this.f20269F.reset();
        this.f20270G.set(getBounds());
        RectF rectF = this.f20270G;
        float f7 = this.f20265B;
        rectF.inset(f7, f7);
        if (this.f20271q == b.OVERLAY_COLOR) {
            this.f20268E.addRect(this.f20270G, Path.Direction.CW);
        }
        if (this.f20278x) {
            this.f20268E.addCircle(this.f20270G.centerX(), this.f20270G.centerY(), Math.min(this.f20270G.width(), this.f20270G.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f20268E.addRoundRect(this.f20270G, this.f20275u, Path.Direction.CW);
        }
        RectF rectF2 = this.f20270G;
        float f8 = this.f20265B;
        rectF2.inset(-f8, -f8);
        RectF rectF3 = this.f20270G;
        float f9 = this.f20279y;
        rectF3.inset(f9 / 2.0f, f9 / 2.0f);
        if (this.f20278x) {
            this.f20269F.addCircle(this.f20270G.centerX(), this.f20270G.centerY(), Math.min(this.f20270G.width(), this.f20270G.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i7 = 0;
            while (true) {
                fArr = this.f20276v;
                if (i7 >= fArr.length) {
                    break;
                }
                fArr[i7] = (this.f20275u[i7] + this.f20265B) - (this.f20279y / 2.0f);
                i7++;
            }
            this.f20269F.addRoundRect(this.f20270G, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f20270G;
        float f10 = this.f20279y;
        rectF4.inset((-f10) / 2.0f, (-f10) / 2.0f);
    }

    @Override // j1.i
    public void b(int i7, float f7) {
        this.f20280z = i7;
        this.f20279y = f7;
        z();
        invalidateSelf();
    }

    @Override // j1.i
    public void d(boolean z6) {
        this.f20278x = z6;
        z();
        invalidateSelf();
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f20272r.set(getBounds());
        int i7 = a.f20281a[this.f20271q.ordinal()];
        if (i7 == 1) {
            int iSave = canvas.save();
            canvas.clipPath(this.f20268E);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i7 == 2) {
            if (this.f20266C) {
                RectF rectF = this.f20273s;
                if (rectF == null) {
                    this.f20273s = new RectF(this.f20272r);
                    this.f20274t = new Matrix();
                } else {
                    rectF.set(this.f20272r);
                }
                RectF rectF2 = this.f20273s;
                float f7 = this.f20279y;
                rectF2.inset(f7, f7);
                this.f20274t.setRectToRect(this.f20272r, this.f20273s, Matrix.ScaleToFit.FILL);
                int iSave2 = canvas.save();
                canvas.clipRect(this.f20272r);
                canvas.concat(this.f20274t);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f20277w.setStyle(Paint.Style.FILL);
            this.f20277w.setColor(this.f20264A);
            this.f20277w.setStrokeWidth(0.0f);
            this.f20277w.setFilterBitmap(x());
            this.f20268E.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f20268E, this.f20277w);
            if (this.f20278x) {
                float fWidth = ((this.f20272r.width() - this.f20272r.height()) + this.f20279y) / 2.0f;
                float fHeight = ((this.f20272r.height() - this.f20272r.width()) + this.f20279y) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f20272r;
                    float f8 = rectF3.left;
                    canvas.drawRect(f8, rectF3.top, f8 + fWidth, rectF3.bottom, this.f20277w);
                    RectF rectF4 = this.f20272r;
                    float f9 = rectF4.right;
                    canvas.drawRect(f9 - fWidth, rectF4.top, f9, rectF4.bottom, this.f20277w);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f20272r;
                    float f10 = rectF5.left;
                    float f11 = rectF5.top;
                    canvas.drawRect(f10, f11, rectF5.right, f11 + fHeight, this.f20277w);
                    RectF rectF6 = this.f20272r;
                    float f12 = rectF6.left;
                    float f13 = rectF6.bottom;
                    canvas.drawRect(f12, f13 - fHeight, rectF6.right, f13, this.f20277w);
                }
            }
        }
        if (this.f20280z != 0) {
            this.f20277w.setStyle(Paint.Style.STROKE);
            this.f20277w.setColor(this.f20280z);
            this.f20277w.setStrokeWidth(this.f20279y);
            this.f20268E.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f20269F, this.f20277w);
        }
    }

    @Override // j1.i
    public void g(boolean z6) {
        if (this.f20267D != z6) {
            this.f20267D = z6;
            invalidateSelf();
        }
    }

    @Override // j1.i
    public void j(boolean z6) {
        this.f20266C = z6;
        z();
        invalidateSelf();
    }

    @Override // j1.i
    public void o(float f7) {
        this.f20265B = f7;
        z();
        invalidateSelf();
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z();
    }

    @Override // j1.i
    public void r(float f7) {
        Arrays.fill(this.f20275u, f7);
        z();
        invalidateSelf();
    }

    @Override // j1.i
    public void t(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f20275u, 0.0f);
        } else {
            O0.l.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f20275u, 0, 8);
        }
        z();
        invalidateSelf();
    }

    public boolean x() {
        return this.f20267D;
    }

    public void y(int i7) {
        this.f20264A = i7;
        invalidateSelf();
    }

    @Override // j1.i
    public void c(boolean z6) {
    }
}
