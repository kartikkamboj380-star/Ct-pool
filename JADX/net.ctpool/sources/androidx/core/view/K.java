package androidx.core.view;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    static class a {
        static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        static void c(ViewGroup viewGroup, boolean z6) {
            viewGroup.setTransitionGroup(z6);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}
