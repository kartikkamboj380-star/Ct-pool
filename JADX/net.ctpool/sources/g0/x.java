package g0;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19467a = true;

    static v a(ViewGroup viewGroup) {
        return new u(viewGroup);
    }

    private static void b(ViewGroup viewGroup, boolean z6) {
        if (f19467a) {
            try {
                viewGroup.suppressLayout(z6);
            } catch (NoSuchMethodError unused) {
                f19467a = false;
            }
        }
    }

    static void c(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z6);
        } else {
            b(viewGroup, z6);
        }
    }
}
