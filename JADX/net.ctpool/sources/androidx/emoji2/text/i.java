package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g f7899n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint.FontMetricsInt f7898m = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private short f7900o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private short f7901p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f7902q = 1.0f;

    i(g gVar) {
        androidx.core.util.f.g(gVar, "metadata cannot be null");
        this.f7899n = gVar;
    }

    public final g a() {
        return this.f7899n;
    }

    final int b() {
        return this.f7900o;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f7898m);
        Paint.FontMetricsInt fontMetricsInt2 = this.f7898m;
        this.f7902q = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f7899n.e();
        this.f7901p = (short) (this.f7899n.e() * this.f7902q);
        short sI = (short) (this.f7899n.i() * this.f7902q);
        this.f7900o = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f7898m;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
