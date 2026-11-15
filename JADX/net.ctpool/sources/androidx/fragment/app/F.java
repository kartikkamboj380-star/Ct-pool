package androidx.fragment.app;

import android.view.View;
import g0.C1674e;
import java.util.ArrayList;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final H f7984a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final H f7985b = b();

    static void a(Fragment fragment, Fragment fragment2, boolean z6, C1890a c1890a, boolean z7) {
        if (z6) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private static H b() {
        try {
            return (H) C1674e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void c(C1890a c1890a, C1890a c1890a2) {
        for (int size = c1890a.size() - 1; size >= 0; size--) {
            if (!c1890a2.containsKey((String) c1890a.n(size))) {
                c1890a.l(size);
            }
        }
    }

    static void d(ArrayList arrayList, int i7) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i7);
        }
    }
}
