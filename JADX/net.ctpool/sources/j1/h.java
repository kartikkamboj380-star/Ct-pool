package j1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class h extends g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final Matrix f20237q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f20239s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Matrix f20240t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f20241u;

    public h(Drawable drawable, int i7, int i8) {
        super(drawable);
        this.f20240t = new Matrix();
        this.f20241u = new RectF();
        this.f20237q = new Matrix();
        this.f20238r = i7 - (i7 % 90);
        this.f20239s = (i8 < 0 || i8 > 8) ? 0 : i8;
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i7;
        if (this.f20238r <= 0 && ((i7 = this.f20239s) == 0 || i7 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f20237q);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // j1.g, j1.r
    public void f(Matrix matrix) {
        u(matrix);
        if (this.f20237q.isIdentity()) {
            return;
        }
        matrix.preConcat(this.f20237q);
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i7 = this.f20239s;
        return (i7 == 5 || i7 == 7 || this.f20238r % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i7 = this.f20239s;
        return (i7 == 5 || i7 == 7 || this.f20238r % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i7;
        Drawable current = getCurrent();
        int i8 = this.f20238r;
        if (i8 <= 0 && ((i7 = this.f20239s) == 0 || i7 == 1)) {
            current.setBounds(rect);
            return;
        }
        int i9 = this.f20239s;
        if (i9 == 2) {
            this.f20237q.setScale(-1.0f, 1.0f);
        } else if (i9 == 7) {
            this.f20237q.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f20237q.postScale(-1.0f, 1.0f);
        } else if (i9 == 4) {
            this.f20237q.setScale(1.0f, -1.0f);
        } else if (i9 != 5) {
            this.f20237q.setRotate(i8, rect.centerX(), rect.centerY());
        } else {
            this.f20237q.setRotate(270.0f, rect.centerX(), rect.centerY());
            this.f20237q.postScale(1.0f, -1.0f);
        }
        this.f20240t.reset();
        this.f20237q.invert(this.f20240t);
        this.f20241u.set(rect);
        this.f20240t.mapRect(this.f20241u);
        RectF rectF = this.f20241u;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
