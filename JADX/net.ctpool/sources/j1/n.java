package j1;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* JADX INFO: loaded from: classes.dex */
public class n extends m {
    public n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // j1.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (K1.b.d()) {
            K1.b.a("RoundedNinePatchDrawable#draw");
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
        canvas.clipPath(this.f20304q);
        super.draw(canvas);
        if (K1.b.d()) {
            K1.b.b();
        }
    }
}
