package g0;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class K extends I {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f19318g = true;

    K() {
    }

    @Override // g0.M
    public void f(View view, int i7) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i7);
        } else if (f19318g) {
            try {
                view.setTransitionVisibility(i7);
            } catch (NoSuchMethodError unused) {
                f19318g = false;
            }
        }
    }
}
