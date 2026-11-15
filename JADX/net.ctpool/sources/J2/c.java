package J2;

import F5.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.content.res.f;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1717b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f1718c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f1719a = new HashMap();

    public static final class a {
        private a() {
        }

        public final c a() {
            return c.f1718c;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private c() {
    }

    private final int b(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        this.f1719a.put(str, Integer.valueOf(identifier));
        return identifier;
    }

    public static final c d() {
        return f1717b.a();
    }

    public final synchronized void c() {
        this.f1719a.clear();
    }

    public final Drawable e(Context context, String str) {
        k.f(context, "context");
        int iF = f(context, str);
        if (iF > 0) {
            return f.f(context.getResources(), iF, null);
        }
        return null;
    }

    public final int f(Context context, String str) {
        k.f(context, "context");
        if (str == null || str.length() == 0) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        k.e(lowerCase, "toLowerCase(...)");
        String strX = g.x(lowerCase, "-", "_", false, 4, null);
        try {
            return Integer.parseInt(strX);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                try {
                    Integer num = (Integer) this.f1719a.get(strX);
                    return num != null ? num.intValue() : b(context, strX);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final Uri g(Context context, String str) {
        k.f(context, "context");
        int iF = f(context, str);
        Uri uriBuild = iF > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(iF)).build() : Uri.EMPTY;
        k.c(uriBuild);
        return uriBuild;
    }
}
