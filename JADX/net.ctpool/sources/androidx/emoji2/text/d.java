package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.e;

/* JADX INFO: loaded from: classes.dex */
class d implements e.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f7844b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f7845a;

    d() {
        TextPaint textPaint = new TextPaint();
        this.f7845a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f7844b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.d
    public boolean a(CharSequence charSequence, int i7, int i8, int i9) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i7 < i8) {
            sbB.append(charSequence.charAt(i7));
            i7++;
        }
        return androidx.core.graphics.c.a(this.f7845a, sbB.toString());
    }
}
