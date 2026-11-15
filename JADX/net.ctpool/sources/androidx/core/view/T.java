package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    static class a {
        static void a(Window window, boolean z6) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    static class b {
        static void a(Window window, boolean z6) {
            window.setDecorFitsSystemWindows(z6);
        }
    }

    public static v0 a(Window window, View view) {
        return new v0(window, view);
    }

    public static void b(Window window, boolean z6) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z6);
        } else {
            a.a(window, z6);
        }
    }
}
