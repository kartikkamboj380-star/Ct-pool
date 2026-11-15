package M2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class m extends CharacterStyle implements h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f2040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f2041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f2042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f2043p;

    public m(float f7, float f8, float f9, int i7) {
        this.f2040m = f7;
        this.f2041n = f8;
        this.f2042o = f9;
        this.f2043p = i7;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        w5.k.f(textPaint, "textPaint");
        textPaint.setShadowLayer(this.f2042o, this.f2040m, this.f2041n, this.f2043p);
    }
}
