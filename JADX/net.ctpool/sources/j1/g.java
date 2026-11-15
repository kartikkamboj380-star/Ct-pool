package j1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements Drawable.Callback, r, q, InterfaceC1776c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Matrix f20233p = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f20234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1777d f20235n = new C1777d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected r f20236o;

    public g(Drawable drawable) {
        this.f20234m = drawable;
        e.d(drawable, this, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f20234m;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // j1.r
    public void f(Matrix matrix) {
        u(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f20234m;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f20234m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f20234m;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f20234m;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f20234m;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f20234m;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f20234m;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // j1.InterfaceC1776c
    public Drawable l(Drawable drawable) {
        return v(drawable);
    }

    @Override // j1.q
    public void m(r rVar) {
        this.f20236o = rVar;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f20234m;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // j1.r
    public void n(RectF rectF) {
        r rVar = this.f20236o;
        if (rVar != null) {
            rVar.n(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20234m;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        Drawable drawable = this.f20234m;
        return drawable == null ? super.onLevelChange(i7) : drawable.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f20234m;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // j1.InterfaceC1776c
    public Drawable s() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f20235n.b(i7);
        Drawable drawable = this.f20234m;
        if (drawable != null) {
            drawable.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20235n.c(colorFilter);
        Drawable drawable = this.f20234m;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        this.f20235n.d(z6);
        Drawable drawable = this.f20234m;
        if (drawable != null) {
            drawable.setDither(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z6) {
        this.f20235n.e(z6);
        Drawable drawable = this.f20234m;
        if (drawable != null) {
            drawable.setFilterBitmap(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f8) {
        Drawable drawable = this.f20234m;
        if (drawable != null) {
            drawable.setHotspot(f7, f8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        Drawable drawable = this.f20234m;
        return drawable == null ? visible : drawable.setVisible(z6, z7);
    }

    protected void u(Matrix matrix) {
        r rVar = this.f20236o;
        if (rVar != null) {
            rVar.f(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public Drawable v(Drawable drawable) {
        Drawable drawableW = w(drawable);
        invalidateSelf();
        return drawableW;
    }

    protected Drawable w(Drawable drawable) {
        Drawable drawable2 = this.f20234m;
        e.d(drawable2, null, null);
        e.d(drawable, null, null);
        e.e(drawable, this.f20235n);
        e.a(drawable, this);
        e.d(drawable, this, this);
        this.f20234m = drawable;
        return drawable2;
    }
}
