package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.T;
import androidx.core.view.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(Window window, boolean z6, Integer num, Integer num2) {
        boolean z7 = num == null || num.intValue() == 0;
        boolean z8 = num2 == null || num2.intValue() == 0;
        if (z7 || z8) {
            int iB = E3.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z7) {
                num = Integer.valueOf(iB);
            }
            if (z8) {
                num2 = Integer.valueOf(iB);
            }
        }
        T.b(window, !z6);
        int iC = c(window.getContext(), z6);
        int iB2 = b(window.getContext(), z6);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        boolean zD = d(iC, E3.a.f(num.intValue()));
        boolean zD2 = d(iB2, E3.a.f(num2.intValue()));
        v0 v0VarA = T.a(window, window.getDecorView());
        if (v0VarA != null) {
            v0VarA.c(zD);
            v0VarA.b(zD2);
        }
    }

    private static int b(Context context, boolean z6) {
        if (z6 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.a.k(E3.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z6) {
            return 0;
        }
        return E3.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    private static int c(Context context, boolean z6) {
        if (z6) {
            return 0;
        }
        return E3.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i7, boolean z6) {
        return E3.a.f(i7) || (i7 == 0 && z6);
    }
}
