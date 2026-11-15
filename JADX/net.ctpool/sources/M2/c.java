package M2;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class c extends MetricAffectingSpan implements h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f2028r = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f2030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f2031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f2032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AssetManager f2033q;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(Paint paint, int i7, int i8, String str, String str2, AssetManager assetManager) {
            Typeface typefaceA = com.facebook.react.views.text.o.a(paint.getTypeface(), i7, i8, str2, assetManager);
            w5.k.e(typefaceA, "applyStyles(...)");
            paint.setFontFeatureSettings(str);
            paint.setTypeface(typefaceA);
            paint.setSubpixelText(true);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(int i7, int i8, String str, String str2, AssetManager assetManager) {
        w5.k.f(assetManager, "assetManager");
        this.f2029m = i7;
        this.f2030n = i8;
        this.f2031o = str;
        this.f2032p = str2;
        this.f2033q = assetManager;
    }

    public final String a() {
        return this.f2032p;
    }

    public final String b() {
        return this.f2031o;
    }

    public final int c() {
        int i7 = this.f2029m;
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    public final int d() {
        int i7 = this.f2030n;
        if (i7 == -1) {
            return 400;
        }
        return i7;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        w5.k.f(textPaint, "ds");
        f2028r.b(textPaint, this.f2029m, this.f2030n, this.f2031o, this.f2032p, this.f2033q);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        w5.k.f(textPaint, "paint");
        f2028r.b(textPaint, this.f2029m, this.f2030n, this.f2031o, this.f2032p, this.f2033q);
    }
}
