package g0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class I extends G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f19317f = true;

    I() {
    }

    @Override // g0.M
    public void d(View view, int i7, int i8, int i9, int i10) {
        if (f19317f) {
            try {
                view.setLeftTopRightBottom(i7, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f19317f = false;
            }
        }
    }
}
