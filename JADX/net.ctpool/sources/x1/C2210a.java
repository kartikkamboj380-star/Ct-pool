package x1;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;
import w5.k;
import w5.l;
import w5.y;

/* JADX INFO: renamed from: x1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2210a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f22788c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f22789d = i5.g.b(C0327a.f22792m);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22791b;

    /* JADX INFO: renamed from: x1.a$a, reason: collision with other inner class name */
    static final class C0327a extends l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final C0327a f22792m = new C0327a();

        C0327a() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            return Pattern.compile("[-/ ]");
        }
    }

    /* JADX INFO: renamed from: x1.a$b */
    public static final class b {
        private b() {
        }

        private final Pattern d() {
            Object value = C2210a.f22789d.getValue();
            k.e(value, "<get-headerParsingRegEx>(...)");
            return (Pattern) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(int i7) {
            return i7 == Integer.MAX_VALUE ? "" : String.valueOf(i7);
        }

        public final C2210a b(int i7) {
            O0.l.b(Boolean.valueOf(i7 >= 0));
            return new C2210a(i7, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public final C2210a c(String str) {
            if (str == null) {
                return null;
            }
            try {
                String[] strArrSplit = d().split(str);
                O0.l.b(Boolean.valueOf(strArrSplit.length == 4));
                O0.l.b(Boolean.valueOf(k.b(strArrSplit[0], "bytes")));
                String str2 = strArrSplit[1];
                k.e(str2, "headerParts[1]");
                int i7 = Integer.parseInt(str2);
                String str3 = strArrSplit[2];
                k.e(str3, "headerParts[2]");
                int i8 = Integer.parseInt(str3);
                String str4 = strArrSplit[3];
                k.e(str4, "headerParts[3]");
                int i9 = Integer.parseInt(str4);
                O0.l.b(Boolean.valueOf(i8 > i7));
                O0.l.b(Boolean.valueOf(i9 > i8));
                return i8 < i9 - 1 ? new C2210a(i7, i8) : new C2210a(i7, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } catch (IllegalArgumentException e7) {
                y yVar = y.f22743a;
                String str5 = String.format(null, "Invalid Content-Range header value: \"%s\"", Arrays.copyOf(new Object[]{str}, 1));
                k.e(str5, "format(locale, format, *args)");
                throw new IllegalArgumentException(str5, e7);
            }
        }

        public final C2210a e(int i7) {
            O0.l.b(Boolean.valueOf(i7 > 0));
            return new C2210a(0, i7);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2210a(int i7, int i8) {
        this.f22790a = i7;
        this.f22791b = i8;
    }

    public static final C2210a c(int i7) {
        return f22788c.b(i7);
    }

    public static final C2210a e(int i7) {
        return f22788c.e(i7);
    }

    public final boolean b(C2210a c2210a) {
        return c2210a != null && this.f22790a <= c2210a.f22790a && c2210a.f22791b <= this.f22791b;
    }

    public final String d() {
        y yVar = y.f22743a;
        b bVar = f22788c;
        String str = String.format(null, "bytes=%s-%s", Arrays.copyOf(new Object[]{bVar.f(this.f22790a), bVar.f(this.f22791b)}, 2));
        k.e(str, "format(locale, format, *args)");
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.b(C2210a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.d(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
        C2210a c2210a = (C2210a) obj;
        return this.f22790a == c2210a.f22790a && this.f22791b == c2210a.f22791b;
    }

    public int hashCode() {
        return (this.f22790a * 31) + this.f22791b;
    }

    public String toString() {
        y yVar = y.f22743a;
        b bVar = f22788c;
        String str = String.format(null, "%s-%s", Arrays.copyOf(new Object[]{bVar.f(this.f22790a), bVar.f(this.f22791b)}, 2));
        k.e(str, "format(locale, format, *args)");
        return str;
    }
}
