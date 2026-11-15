package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Paint f7928r;

    public o(g gVar) {
        super(gVar);
    }

    private static Paint c() {
        if (f7928r == null) {
            TextPaint textPaint = new TextPaint();
            f7928r = textPaint;
            textPaint.setColor(e.b().c());
            f7928r.setStyle(Paint.Style.FILL);
        }
        return f7928r;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        if (e.b().i()) {
            canvas.drawRect(f7, i9, f7 + b(), i11, c());
        }
        a().a(canvas, f7, i10, paint);
    }
}
