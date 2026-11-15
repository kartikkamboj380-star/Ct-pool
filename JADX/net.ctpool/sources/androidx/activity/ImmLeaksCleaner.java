package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.InterfaceC0653j;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0653j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f4865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f4866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f4867e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f4868a;

    private static void h() {
        try {
            f4864b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f4866d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f4867e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f4865c = declaredField3;
            declaredField3.setAccessible(true);
            f4864b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC0653j
    public void g(androidx.lifecycle.l lVar, AbstractC0651h.b bVar) {
        if (bVar != AbstractC0651h.b.ON_DESTROY) {
            return;
        }
        if (f4864b == 0) {
            h();
        }
        if (f4864b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f4868a.getSystemService("input_method");
            try {
                Object obj = f4865c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f4866d.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f4867e.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
