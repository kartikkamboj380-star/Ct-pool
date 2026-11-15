package com.facebook.react.views.view;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private A2.a f13252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f13253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13254c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f13255d = a.VISIBLE;

    private enum a {
        VISIBLE,
        HIDDEN,
        SCROLL
    }

    public g(View view) {
        this.f13253b = view;
    }

    private A2.a c() {
        Drawable layerDrawable;
        View view;
        if (this.f13252a == null) {
            this.f13252a = new A2.a(this.f13253b.getContext());
            Drawable background = this.f13253b.getBackground();
            H.t0(this.f13253b, null);
            if (background == null) {
                view = this.f13253b;
                layerDrawable = this.f13252a;
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{this.f13252a, background});
                view = this.f13253b;
            }
            H.t0(view, layerDrawable);
        }
        return this.f13252a;
    }

    public void a() {
        H.t0(this.f13253b, null);
        this.f13253b = null;
        this.f13252a = null;
    }

    public int b() {
        return this.f13254c;
    }

    public void d(Canvas canvas) {
        if (this.f13255d == a.VISIBLE) {
            return;
        }
        Rect rect = new Rect();
        this.f13253b.getDrawingRect(rect);
        A2.a aVar = this.f13252a;
        if (aVar == null) {
            canvas.clipRect(rect);
            return;
        }
        Path pathL = aVar.l();
        if (pathL != null) {
            pathL.offset(rect.left, rect.top);
            canvas.clipPath(pathL);
        } else {
            RectF rectFM = aVar.m();
            rectFM.offset(rect.left, rect.top);
            canvas.clipRect(rectFM);
        }
    }

    public void e(int i7) {
        if (i7 == 0 && this.f13252a == null) {
            return;
        }
        c().w(i7);
    }

    public void f(int i7, float f7, float f8) {
        c().r(i7, f7, f8);
    }

    public void g(float f7) {
        c().y(f7);
    }

    public void h(float f7, int i7) {
        c().z(f7, i7);
    }

    public void i(String str) {
        c().u(str);
    }

    public void j(int i7, float f7) {
        c().v(i7, f7);
    }

    public void k(String str) {
        a aVar = this.f13255d;
        this.f13255d = "hidden".equals(str) ? a.HIDDEN : "scroll".equals(str) ? a.SCROLL : a.VISIBLE;
        if (aVar != this.f13255d) {
            this.f13253b.invalidate();
        }
    }
}
