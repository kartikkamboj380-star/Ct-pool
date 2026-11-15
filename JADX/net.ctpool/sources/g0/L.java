package g0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class L extends K {
    L() {
    }

    @Override // g0.AbstractC1669D, g0.M
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // g0.I, g0.M
    public void d(View view, int i7, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i7, i8, i9, i10);
    }

    @Override // g0.AbstractC1669D, g0.M
    public void e(View view, float f7) {
        view.setTransitionAlpha(f7);
    }

    @Override // g0.K, g0.M
    public void f(View view, int i7) {
        view.setTransitionVisibility(i7);
    }

    @Override // g0.G, g0.M
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // g0.G, g0.M
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
