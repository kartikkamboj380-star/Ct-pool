package F5;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f1122n = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Pattern f1123m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(String str) {
        w5.k.f(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        w5.k.e(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public final boolean a(CharSequence charSequence) {
        w5.k.f(charSequence, "input");
        return this.f1123m.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        w5.k.f(charSequence, "input");
        w5.k.f(str, "replacement");
        String strReplaceAll = this.f1123m.matcher(charSequence).replaceAll(str);
        w5.k.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String c(CharSequence charSequence, String str) {
        w5.k.f(charSequence, "input");
        w5.k.f(str, "replacement");
        String strReplaceFirst = this.f1123m.matcher(charSequence).replaceFirst(str);
        w5.k.e(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public String toString() {
        String string = this.f1123m.toString();
        w5.k.e(string, "toString(...)");
        return string;
    }

    public f(Pattern pattern) {
        w5.k.f(pattern, "nativePattern");
        this.f1123m = pattern;
    }
}
