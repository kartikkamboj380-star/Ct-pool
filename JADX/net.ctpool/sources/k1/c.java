package k1;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import j1.g;
import j1.s;
import j1.t;

/* JADX INFO: loaded from: classes.dex */
public class c extends g implements s {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Drawable f20533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private t f20534r;

    public c(Drawable drawable) {
        super(drawable);
        this.f20533q = null;
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (isVisible()) {
            t tVar = this.f20534r;
            if (tVar != null) {
                tVar.b();
            }
            super.draw(canvas);
            Drawable drawable = this.f20533q;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f20533q.draw(canvas);
            }
        }
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // j1.s
    public void h(t tVar) {
        this.f20534r = tVar;
    }

    @Override // j1.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        t tVar = this.f20534r;
        if (tVar != null) {
            tVar.d(z6);
        }
        return super.setVisible(z6, z7);
    }

    public void x(Drawable drawable) {
        this.f20533q = drawable;
        invalidateSelf();
    }
}
