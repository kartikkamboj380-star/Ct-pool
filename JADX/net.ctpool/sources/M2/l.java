package M2;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2036d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f2039c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l(int i7, int i8, h hVar) {
        w5.k.f(hVar, "what");
        this.f2037a = i7;
        this.f2038b = i8;
        this.f2039c = hVar;
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, int i7) {
        w5.k.f(spannableStringBuilder, "builder");
        if (i7 < 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i8 = this.f2037a == 0 ? 18 : 34;
        int i9 = 255 - i7;
        if (i9 < 0) {
            P0.a.G("SetSpanOperation", "Text tree size exceeded the limit, styling may become unpredictable");
        }
        spannableStringBuilder.setSpan(this.f2039c, this.f2037a, this.f2038b, ((Math.max(i9, 0) << 16) & 16711680) | (i8 & (-16711681)));
    }
}
