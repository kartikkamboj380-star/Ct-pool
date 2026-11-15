package J2;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0031a f1709e = new C0031a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f1711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f1712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1713d;

    /* JADX INFO: renamed from: J2.a$a, reason: collision with other inner class name */
    public static final class C0031a {
        private C0031a() {
        }

        public final a a(Context context) {
            k.f(context, "context");
            return new a(context, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", 0.0d, 0.0d, 12, null);
        }

        public /* synthetic */ C0031a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str) {
        this(context, str, 0.0d, 0.0d, 12, null);
        k.f(context, "context");
    }

    private final Uri a(Context context) {
        this.f1713d = true;
        return c.f1717b.a().g(context, this.f1710a);
    }

    private final Uri b(Context context) {
        try {
            Uri uriA = Uri.parse(this.f1710a);
            if (uriA.getScheme() == null) {
                uriA = a(context);
            }
            k.c(uriA);
            return uriA;
        } catch (NullPointerException unused) {
            return a(context);
        }
    }

    public static final a e(Context context) {
        return f1709e.a(context);
    }

    public final double c() {
        return this.f1712c;
    }

    public final String d() {
        return this.f1710a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.b(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(aVar.f1712c, this.f1712c) == 0 && g() == aVar.g() && k.b(f(), aVar.f()) && k.b(this.f1710a, aVar.f1710a);
    }

    public Uri f() {
        return this.f1711b;
    }

    public boolean g() {
        return this.f1713d;
    }

    public int hashCode() {
        return Objects.hash(f(), this.f1710a, Double.valueOf(this.f1712c), Boolean.valueOf(g()));
    }

    public a(Context context, String str, double d7, double d8) {
        k.f(context, "context");
        this.f1710a = str;
        this.f1711b = b(context);
        this.f1712c = d7 * d8;
    }

    public /* synthetic */ a(Context context, String str, double d7, double d8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i7 & 4) != 0 ? 0.0d : d7, (i7 & 8) != 0 ? 0.0d : d8);
    }
}
