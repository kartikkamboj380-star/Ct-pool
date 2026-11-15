package androidx.core.text;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    static class a {
        static Spanned a(String str, int i7) {
            return Html.fromHtml(str, i7);
        }

        static Spanned b(String str, int i7, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i7, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i7) {
            return Html.toHtml(spanned, i7);
        }
    }

    public static Spanned a(String str, int i7) {
        return a.a(str, i7);
    }
}
