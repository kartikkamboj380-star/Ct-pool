package M2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class b implements LineHeightSpan, h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2027m;

    public b(float f7) {
        this.f2027m = (int) Math.ceil(f7);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i7, int i8, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        w5.k.f(fontMetricsInt, "fm");
        int i11 = fontMetricsInt.descent;
        int i12 = this.f2027m;
        if (i11 > i12) {
            int iMin = (int) Math.min(i12, i11);
            fontMetricsInt.descent = iMin;
            fontMetricsInt.bottom = iMin;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.top = 0;
            return;
        }
        int i13 = fontMetricsInt.ascent;
        if ((-i13) + i11 > i12) {
            fontMetricsInt.bottom = i11;
            int i14 = (-i12) + i11;
            fontMetricsInt.ascent = i14;
            fontMetricsInt.top = i14;
            return;
        }
        int i15 = fontMetricsInt.bottom;
        if ((-i13) + i15 > i12) {
            fontMetricsInt.top = i13;
            fontMetricsInt.bottom = i13 + i12;
            return;
        }
        int i16 = fontMetricsInt.top;
        if ((-i16) + i15 > i12) {
            fontMetricsInt.top = i15 - i12;
            return;
        }
        double d7 = (i12 - ((-i16) + i15)) / 2.0f;
        int iCeil = (int) (i16 - ((float) Math.ceil(d7)));
        int iFloor = (int) (fontMetricsInt.bottom + ((float) Math.floor(d7)));
        fontMetricsInt.top = iCeil;
        fontMetricsInt.ascent = iCeil;
        fontMetricsInt.descent = iFloor;
        fontMetricsInt.bottom = iFloor;
    }
}
