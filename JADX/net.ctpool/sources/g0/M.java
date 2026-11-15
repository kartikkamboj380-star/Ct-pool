package g0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f19319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f19320b;

    M() {
    }

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i7, int i8, int i9, int i10);

    public abstract void e(View view, float f7);

    public void f(View view, int i7) {
        if (!f19320b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f19319a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f19320b = true;
        }
        Field field = f19319a;
        if (field != null) {
            try {
                f19319a.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
