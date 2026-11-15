package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.p;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f13249a = new e();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13250a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.AT_MOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13250a = iArr;
        }
    }

    private e() {
    }

    public static final int a(float f7, p pVar) {
        int i7;
        int i8;
        k.f(pVar, "mode");
        int i9 = a.f13250a[pVar.ordinal()];
        if (i9 == 1) {
            i7 = (int) f7;
            i8 = 1073741824;
        } else {
            if (i9 != 2) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            i7 = (int) f7;
            i8 = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(i7, i8);
    }
}
