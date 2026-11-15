package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    static class a {
        static boolean a(ListView listView, int i7) {
            return listView.canScrollList(i7);
        }

        static void b(ListView listView, int i7) {
            listView.scrollListBy(i7);
        }
    }

    public static boolean a(ListView listView, int i7) {
        return a.a(listView, i7);
    }

    public static void b(ListView listView, int i7) {
        a.b(listView, i7);
    }
}
