package j1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class j extends m {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static boolean f20242V = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Paint f20243P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final Paint f20244Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final Bitmap f20245R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private WeakReference f20246S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f20247T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private RectF f20248U;

    public j(Resources resources, Bitmap bitmap, Paint paint, boolean z6) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f20243P = paint2;
        Paint paint3 = new Paint(1);
        this.f20244Q = paint3;
        this.f20248U = null;
        this.f20245R = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f20247T = z6;
    }

    public static boolean i() {
        return f20242V;
    }

    private void k() {
        WeakReference weakReference = this.f20246S;
        if (weakReference == null || weakReference.get() != this.f20245R) {
            this.f20246S = new WeakReference(this.f20245R);
            Paint paint = this.f20243P;
            Bitmap bitmap = this.f20245R;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f20305r = true;
        }
        if (this.f20305r) {
            this.f20243P.getShader().setLocalMatrix(this.f20294J);
            this.f20305r = false;
        }
        this.f20243P.setFilterBitmap(a());
    }

    @Override // j1.m, j1.i
    public void c(boolean z6) {
        this.f20247T = z6;
    }

    @Override // j1.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (K1.b.d()) {
            K1.b.a("RoundedBitmapDrawable#draw");
        }
        if (!e()) {
            super.draw(canvas);
            if (K1.b.d()) {
                K1.b.b();
                return;
            }
            return;
        }
        h();
        f();
        k();
        int iSave = canvas.save();
        canvas.concat(this.f20291G);
        if (this.f20247T || this.f20248U == null) {
            canvas.drawPath(this.f20304q, this.f20243P);
        } else {
            int iSave2 = canvas.save();
            canvas.clipRect(this.f20248U);
            canvas.drawPath(this.f20304q, this.f20243P);
            canvas.restoreToCount(iSave2);
        }
        float f7 = this.f20303p;
        if (f7 > 0.0f) {
            this.f20244Q.setStrokeWidth(f7);
            this.f20244Q.setColor(e.c(this.f20306s, this.f20243P.getAlpha()));
            canvas.drawPath(this.f20307t, this.f20244Q);
        }
        canvas.restoreToCount(iSave);
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    @Override // j1.m
    boolean e() {
        return super.e() && this.f20245R != null;
    }

    @Override // j1.m
    protected void h() {
        super.h();
        if (this.f20247T) {
            return;
        }
        if (this.f20248U == null) {
            this.f20248U = new RectF();
        }
        this.f20294J.mapRect(this.f20248U, this.f20313z);
    }

    @Override // j1.m, android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        super.setAlpha(i7);
        if (i7 != this.f20243P.getAlpha()) {
            this.f20243P.setAlpha(i7);
            super.setAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // j1.m, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f20243P.setColorFilter(colorFilter);
    }
}
