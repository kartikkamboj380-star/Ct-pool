package androidx.core.os;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 >= 33 || (i7 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 33 && a("UpsideDownCake", Build.VERSION.CODENAME);
    }
}
