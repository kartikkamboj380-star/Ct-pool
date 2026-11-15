package n1;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: n1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1894a {

    /* JADX INFO: renamed from: n1.a$a, reason: collision with other inner class name */
    public static class C0305a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21337b;
    }

    private static boolean a(int i7) {
        return i7 == 0 || i7 == -2;
    }

    public static void b(C0305a c0305a, float f7, ViewGroup.LayoutParams layoutParams, int i7, int i8) {
        if (f7 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0305a.f21337b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0305a.f21336a) - i7) / f7) + i8), c0305a.f21337b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0305a.f21336a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0305a.f21337b) - i8) * f7) + i7), c0305a.f21336a), 1073741824);
        }
    }
}
