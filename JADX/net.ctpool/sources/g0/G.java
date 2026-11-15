package g0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class G extends AbstractC1669D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f19315d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f19316e = true;

    G() {
    }

    @Override // g0.M
    public void g(View view, Matrix matrix) {
        if (f19315d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f19315d = false;
            }
        }
    }

    @Override // g0.M
    public void h(View view, Matrix matrix) {
        if (f19316e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f19316e = false;
            }
        }
    }
}
