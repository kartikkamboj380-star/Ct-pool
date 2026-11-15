package M2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f2026m;

    public a(float f7) {
        this.f2026m = f7;
    }

    private final void a(TextPaint textPaint) {
        if (Float.isNaN(this.f2026m)) {
            return;
        }
        textPaint.setLetterSpacing(this.f2026m);
    }

    public final float b() {
        return this.f2026m;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        w5.k.f(textPaint, "paint");
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        w5.k.f(textPaint, "paint");
        a(textPaint);
    }
}
