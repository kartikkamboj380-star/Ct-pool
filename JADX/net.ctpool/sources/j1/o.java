package j1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import j1.p;

/* JADX INFO: loaded from: classes.dex */
public class o extends g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    p.b f20314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f20315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    PointF f20316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f20317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f20318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Matrix f20319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Matrix f20320w;

    public o(Drawable drawable, p.b bVar) {
        super(drawable);
        this.f20316s = null;
        this.f20317t = 0;
        this.f20318u = 0;
        this.f20320w = new Matrix();
        this.f20314q = bVar;
    }

    private void y() {
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        if (this.f20317t == current.getIntrinsicWidth() && this.f20318u == current.getIntrinsicHeight()) {
            return;
        }
        x();
    }

    public p.b A() {
        return this.f20314q;
    }

    public void B(PointF pointF) {
        if (O0.j.a(this.f20316s, pointF)) {
            return;
        }
        if (pointF == null) {
            this.f20316s = null;
        } else {
            if (this.f20316s == null) {
                this.f20316s = new PointF();
            }
            this.f20316s.set(pointF);
        }
        x();
        invalidateSelf();
    }

    public void C(p.b bVar) {
        if (O0.j.a(this.f20314q, bVar)) {
            return;
        }
        this.f20314q = bVar;
        this.f20315r = null;
        x();
        invalidateSelf();
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        y();
        if (this.f20319v == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f20319v);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // j1.g, j1.r
    public void f(Matrix matrix) {
        u(matrix);
        y();
        Matrix matrix2 = this.f20319v;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        x();
    }

    @Override // j1.g
    public Drawable v(Drawable drawable) {
        Drawable drawableV = super.v(drawable);
        x();
        return drawableV;
    }

    void x() {
        Drawable current = getCurrent();
        if (current == null) {
            this.f20318u = 0;
            this.f20317t = 0;
            this.f20319v = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f20317t = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f20318u = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f20319v = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            current.setBounds(bounds);
            this.f20319v = null;
        } else {
            if (this.f20314q == p.b.f20321a) {
                current.setBounds(bounds);
                this.f20319v = null;
                return;
            }
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            p.b bVar = this.f20314q;
            Matrix matrix = this.f20320w;
            PointF pointF = this.f20316s;
            bVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.f20319v = this.f20320w;
        }
    }

    public PointF z() {
        return this.f20316s;
    }
}
