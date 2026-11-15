package M2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class o extends ReplacementSpan implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f2046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f2047o;

    public o(int i7, int i8, int i9) {
        this.f2045m = i7;
        this.f2046n = i8;
        this.f2047o = i9;
    }

    public final int a() {
        return this.f2047o;
    }

    public final int b() {
        return this.f2045m;
    }

    public final int c() {
        return this.f2046n;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        w5.k.f(canvas, "canvas");
        w5.k.f(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        w5.k.f(paint, "paint");
        if (fontMetricsInt != null) {
            int i9 = -this.f2047o;
            fontMetricsInt.ascent = i9;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i9;
            fontMetricsInt.bottom = 0;
        }
        return this.f2046n;
    }
}
