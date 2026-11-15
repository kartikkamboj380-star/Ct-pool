package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f6213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f6214b;

    static {
        f6214b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f6213a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f6213a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f6213a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e7) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
            }
        }
    }

    public static boolean b(View view) {
        return androidx.core.view.H.B(view) == 1;
    }

    public static void c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e8) {
            e = e8;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
    }
}
