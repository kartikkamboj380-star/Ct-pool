package j0;

import android.webkit.WebSettings;
import k0.d;
import k0.f;

/* JADX INFO: renamed from: j0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1772b {
    private static k0.c a(WebSettings webSettings) {
        return f.c().a(webSettings);
    }

    public static void b(WebSettings webSettings, int i7) {
        d dVar = d.FORCE_DARK;
        if (dVar.m()) {
            webSettings.setForceDark(i7);
        } else {
            if (!dVar.n()) {
                throw d.j();
            }
            a(webSettings).a(i7);
        }
    }

    public static void c(WebSettings webSettings, int i7) {
        if (!d.FORCE_DARK_STRATEGY.n()) {
            throw d.j();
        }
        a(webSettings).b(i7);
    }
}
