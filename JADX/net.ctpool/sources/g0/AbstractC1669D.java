package g0;

import android.view.View;

/* JADX INFO: renamed from: g0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1669D extends M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f19314c = true;

    AbstractC1669D() {
    }

    @Override // g0.M
    public float b(View view) {
        if (f19314c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f19314c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // g0.M
    public void e(View view, float f7) {
        if (f19314c) {
            try {
                view.setTransitionAlpha(f7);
                return;
            } catch (NoSuchMethodError unused) {
                f19314c = false;
            }
        }
        view.setAlpha(f7);
    }

    @Override // g0.M
    public void a(View view) {
    }

    @Override // g0.M
    public void c(View view) {
    }
}
