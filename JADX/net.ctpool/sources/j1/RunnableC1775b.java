package j1;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: renamed from: j1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1775b extends g implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f20210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f20211t;

    public RunnableC1775b(Drawable drawable, int i7) {
        this(drawable, i7, true);
    }

    private int x() {
        return (int) ((20.0f / this.f20208q) * 360.0f);
    }

    private void y() {
        if (this.f20211t) {
            return;
        }
        this.f20211t = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i7 = bounds.right - bounds.left;
        int i8 = bounds.bottom - bounds.top;
        float f7 = this.f20210s;
        if (!this.f20209r) {
            f7 = 360.0f - f7;
        }
        canvas.rotate(f7, r3 + (i7 / 2), r1 + (i8 / 2));
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        y();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20211t = false;
        this.f20210s += x();
        invalidateSelf();
    }

    public RunnableC1775b(Drawable drawable, int i7, boolean z6) {
        super((Drawable) O0.l.g(drawable));
        this.f20210s = 0.0f;
        this.f20211t = false;
        this.f20208q = i7;
        this.f20209r = z6;
    }
}
