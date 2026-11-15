package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f13245a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f13246b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f13247c = false;

    public static void a(Canvas canvas, boolean z6) {
        Method method;
        if (Build.VERSION.SDK_INT >= 29) {
            if (z6) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        b();
        if (z6) {
            try {
                Method method2 = f13245a;
                if (method2 != null) {
                    method2.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (z6 || (method = f13246b) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    private static void b() {
        Method declaredMethod;
        Method method;
        if (f13247c) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                f13245a = (Method) declaredMethod2.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                declaredMethod = (Method) declaredMethod2.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
            } else {
                f13245a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                declaredMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
            }
            f13246b = declaredMethod;
            method = f13245a;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (method != null && f13246b != null) {
            method.setAccessible(true);
            f13246b.setAccessible(true);
            f13247c = true;
        }
    }
}
