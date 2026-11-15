package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f7237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f7238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f7240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f7241e;

        /* JADX INFO: renamed from: androidx.core.text.n$a$a, reason: collision with other inner class name */
        public static class C0144a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f7242a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f7244c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f7245d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f7243b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0144a(TextPaint textPaint) {
                this.f7242a = textPaint;
            }

            public a a() {
                return new a(this.f7242a, this.f7243b, this.f7244c, this.f7245d);
            }

            public C0144a b(int i7) {
                this.f7244c = i7;
                return this;
            }

            public C0144a c(int i7) {
                this.f7245d = i7;
                return this;
            }

            public C0144a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f7243b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f7237a = params.getTextPaint();
            this.f7238b = params.getTextDirection();
            this.f7239c = params.getBreakStrategy();
            this.f7240d = params.getHyphenationFrequency();
            this.f7241e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean a(a aVar) {
            if (this.f7239c == aVar.b() && this.f7240d == aVar.c() && this.f7237a.getTextSize() == aVar.e().getTextSize() && this.f7237a.getTextScaleX() == aVar.e().getTextScaleX() && this.f7237a.getTextSkewX() == aVar.e().getTextSkewX() && this.f7237a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f7237a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f7237a.getFlags() == aVar.e().getFlags() && this.f7237a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f7237a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f7237a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f7239c;
        }

        public int c() {
            return this.f7240d;
        }

        public TextDirectionHeuristic d() {
            return this.f7238b;
        }

        public TextPaint e() {
            return this.f7237a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f7238b == aVar.d();
        }

        public int hashCode() {
            return androidx.core.util.b.b(Float.valueOf(this.f7237a.getTextSize()), Float.valueOf(this.f7237a.getTextScaleX()), Float.valueOf(this.f7237a.getTextSkewX()), Float.valueOf(this.f7237a.getLetterSpacing()), Integer.valueOf(this.f7237a.getFlags()), this.f7237a.getTextLocales(), this.f7237a.getTypeface(), Boolean.valueOf(this.f7237a.isElegantTextHeight()), this.f7238b, Integer.valueOf(this.f7239c), Integer.valueOf(this.f7240d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f7237a.getTextSize());
            sb.append(", textScaleX=" + this.f7237a.getTextScaleX());
            sb.append(", textSkewX=" + this.f7237a.getTextSkewX());
            int i7 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f7237a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f7237a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f7237a.getTextLocales());
            sb.append(", typeface=" + this.f7237a.getTypeface());
            if (i7 >= 26) {
                sb.append(", variationSettings=" + this.f7237a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f7238b);
            sb.append(", breakStrategy=" + this.f7239c);
            sb.append(", hyphenationFrequency=" + this.f7240d);
            sb.append("}");
            return sb.toString();
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
            this.f7241e = Build.VERSION.SDK_INT >= 29 ? m.a(textPaint).setBreakStrategy(i7).setHyphenationFrequency(i8).setTextDirection(textDirectionHeuristic).build() : null;
            this.f7237a = textPaint;
            this.f7238b = textDirectionHeuristic;
            this.f7239c = i7;
            this.f7240d = i8;
        }
    }
}
