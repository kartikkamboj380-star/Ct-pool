package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: renamed from: androidx.core.view.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0595o {

    /* JADX INFO: renamed from: androidx.core.view.o$a */
    static class a {
        static void a(int i7, int i8, int i9, Rect rect, int i10, int i11, Rect rect2, int i12) {
            Gravity.apply(i7, i8, i9, rect, i10, i11, rect2, i12);
        }

        static void b(int i7, int i8, int i9, Rect rect, Rect rect2, int i10) {
            Gravity.apply(i7, i8, i9, rect, rect2, i10);
        }

        static void c(int i7, Rect rect, Rect rect2, int i8) {
            Gravity.applyDisplay(i7, rect, rect2, i8);
        }
    }

    public static void a(int i7, int i8, int i9, Rect rect, Rect rect2, int i10) {
        a.b(i7, i8, i9, rect, rect2, i10);
    }

    public static int b(int i7, int i8) {
        return Gravity.getAbsoluteGravity(i7, i8);
    }
}
