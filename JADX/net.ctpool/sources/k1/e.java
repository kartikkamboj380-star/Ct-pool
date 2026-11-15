package k1;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import j1.InterfaceC1776c;
import j1.g;
import j1.i;
import j1.j;
import j1.k;
import j1.l;
import j1.n;
import j1.o;
import j1.p;
import k1.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Drawable f20548a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            j jVar = new j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), dVar.i());
            b(jVar, dVar);
            return jVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            n nVar = new n((NinePatchDrawable) drawable);
            b(nVar, dVar);
            return nVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            P0.a.I("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        k kVarA = k.a((ColorDrawable) drawable);
        b(kVarA, dVar);
        return kVarA;
    }

    static void b(i iVar, d dVar) {
        iVar.d(dVar.j());
        iVar.t(dVar.d());
        iVar.b(dVar.b(), dVar.c());
        iVar.o(dVar.g());
        iVar.j(dVar.l());
        iVar.g(dVar.h());
        iVar.c(dVar.i());
    }

    static InterfaceC1776c c(InterfaceC1776c interfaceC1776c) {
        while (true) {
            Object objS = interfaceC1776c.s();
            if (objS == interfaceC1776c || !(objS instanceof InterfaceC1776c)) {
                break;
            }
            interfaceC1776c = (InterfaceC1776c) objS;
        }
        return interfaceC1776c;
    }

    static Drawable d(Drawable drawable, d dVar, Resources resources) {
        try {
            if (K1.b.d()) {
                K1.b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && dVar != null && dVar.k() == d.a.BITMAP_ONLY) {
                if (!(drawable instanceof g)) {
                    Drawable drawableA = a(drawable, dVar, resources);
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                    return drawableA;
                }
                InterfaceC1776c interfaceC1776cC = c((g) drawable);
                interfaceC1776cC.l(a(interfaceC1776cC.l(f20548a), dVar, resources));
                if (K1.b.d()) {
                    K1.b.b();
                }
                return drawable;
            }
            return drawable;
        } finally {
            if (K1.b.d()) {
                K1.b.b();
            }
        }
    }

    static Drawable e(Drawable drawable, d dVar) {
        try {
            if (K1.b.d()) {
                K1.b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && dVar != null && dVar.k() == d.a.OVERLAY_COLOR) {
                l lVar = new l(drawable);
                b(lVar, dVar);
                lVar.y(dVar.f());
                if (K1.b.d()) {
                    K1.b.b();
                }
                return lVar;
            }
            return drawable;
        } finally {
            if (K1.b.d()) {
                K1.b.b();
            }
        }
    }

    static Drawable f(Drawable drawable, p.b bVar) {
        return g(drawable, bVar, null);
    }

    static Drawable g(Drawable drawable, p.b bVar, PointF pointF) {
        if (K1.b.d()) {
            K1.b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || bVar == null) {
            if (K1.b.d()) {
                K1.b.b();
            }
            return drawable;
        }
        o oVar = new o(drawable, bVar);
        if (pointF != null) {
            oVar.B(pointF);
        }
        if (K1.b.d()) {
            K1.b.b();
        }
        return oVar;
    }

    static void h(i iVar) {
        iVar.d(false);
        iVar.r(0.0f);
        iVar.b(0, 0.0f);
        iVar.o(0.0f);
        iVar.j(false);
        iVar.g(false);
        iVar.c(j.i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void i(InterfaceC1776c interfaceC1776c, d dVar, Resources resources) {
        InterfaceC1776c interfaceC1776cC = c(interfaceC1776c);
        Drawable drawableS = interfaceC1776cC.s();
        if (dVar == null || dVar.k() != d.a.BITMAP_ONLY) {
            if (drawableS instanceof i) {
                h((i) drawableS);
            }
        } else if (drawableS instanceof i) {
            b((i) drawableS, dVar);
        } else if (drawableS != 0) {
            interfaceC1776cC.l(f20548a);
            interfaceC1776cC.l(a(drawableS, dVar, resources));
        }
    }

    static void j(InterfaceC1776c interfaceC1776c, d dVar) {
        Drawable drawableS = interfaceC1776c.s();
        if (dVar == null || dVar.k() != d.a.OVERLAY_COLOR) {
            if (drawableS instanceof l) {
                Drawable drawable = f20548a;
                interfaceC1776c.l(((l) drawableS).v(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(drawableS instanceof l)) {
            interfaceC1776c.l(e(interfaceC1776c.l(f20548a), dVar));
            return;
        }
        l lVar = (l) drawableS;
        b(lVar, dVar);
        lVar.y(dVar.f());
    }

    static o k(InterfaceC1776c interfaceC1776c, p.b bVar) {
        Drawable drawableF = f(interfaceC1776c.l(f20548a), bVar);
        interfaceC1776c.l(drawableF);
        O0.l.h(drawableF, "Parent has no child drawable!");
        return (o) drawableF;
    }
}
