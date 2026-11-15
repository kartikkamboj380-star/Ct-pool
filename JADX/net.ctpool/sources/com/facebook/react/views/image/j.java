package com.facebook.react.views.image;

import android.graphics.Matrix;
import android.graphics.Rect;
import j1.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f12814l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final p.b f12815m = new j();

    public static final class a {
        private a() {
        }

        public final p.b a() {
            return j.f12815m;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // j1.p.a
    public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
        k.f(matrix, "outTransform");
        k.f(rect, "parentRect");
        float fE = C5.g.e(Math.min(f9, f10), 1.0f);
        float f11 = rect.left;
        float f12 = rect.top;
        matrix.setScale(fE, fE);
        matrix.postTranslate(Math.round(f11), Math.round(f12));
    }

    public String toString() {
        return "start_inside";
    }
}
