package k1;

import O0.l;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import j1.InterfaceC1776c;
import j1.f;
import j1.g;
import j1.o;
import j1.p;
import java.util.Iterator;

/* JADX INFO: renamed from: k1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1815a implements m1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f20506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f20507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f20508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f20509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f20510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f20511f;

    C1815a(C1816b c1816b) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f20506a = colorDrawable;
        if (K1.b.d()) {
            K1.b.a("GenericDraweeHierarchy()");
        }
        this.f20507b = c1816b.o();
        this.f20508c = c1816b.r();
        g gVar = new g(colorDrawable);
        this.f20511f = gVar;
        int i7 = 1;
        int size = c1816b.i() != null ? c1816b.i().size() : 1;
        int i8 = (size == 0 ? 1 : size) + (c1816b.l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i8 + 6];
        drawableArr[0] = j(c1816b.e(), null);
        drawableArr[1] = j(c1816b.j(), c1816b.k());
        drawableArr[2] = i(gVar, c1816b.d(), c1816b.c(), c1816b.b());
        drawableArr[3] = j(c1816b.m(), c1816b.n());
        drawableArr[4] = j(c1816b.p(), c1816b.q());
        drawableArr[5] = j(c1816b.g(), c1816b.h());
        if (i8 > 0) {
            if (c1816b.i() != null) {
                Iterator it = c1816b.i().iterator();
                i7 = 0;
                while (it.hasNext()) {
                    drawableArr[i7 + 6] = j((Drawable) it.next(), null);
                    i7++;
                }
            }
            if (c1816b.l() != null) {
                drawableArr[i7 + 6] = j(c1816b.l(), null);
            }
        }
        f fVar = new f(drawableArr, false, 2);
        this.f20510e = fVar;
        fVar.u(c1816b.f());
        c cVar = new c(e.e(fVar, this.f20508c));
        this.f20509d = cVar;
        cVar.mutate();
        u();
        if (K1.b.d()) {
            K1.b.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A(float f7) {
        Drawable drawableB = this.f20510e.b(3);
        if (drawableB == 0) {
            return;
        }
        if (f7 >= 0.999f) {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).stop();
            }
            m(3);
        } else {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).start();
            }
            k(3);
        }
        drawableB.setLevel(Math.round(f7 * 10000.0f));
    }

    private Drawable i(Drawable drawable, p.b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.g(drawable, bVar, pointF);
    }

    private Drawable j(Drawable drawable, p.b bVar) {
        return e.f(e.d(drawable, this.f20508c, this.f20507b), bVar);
    }

    private void k(int i7) {
        if (i7 >= 0) {
            this.f20510e.k(i7);
        }
    }

    private void l() {
        m(1);
        m(2);
        m(3);
        m(4);
        m(5);
    }

    private void m(int i7) {
        if (i7 >= 0) {
            this.f20510e.l(i7);
        }
    }

    private InterfaceC1776c p(int i7) {
        InterfaceC1776c interfaceC1776cC = this.f20510e.c(i7);
        interfaceC1776cC.s();
        return interfaceC1776cC.s() instanceof o ? (o) interfaceC1776cC.s() : interfaceC1776cC;
    }

    private o r(int i7) {
        InterfaceC1776c interfaceC1776cP = p(i7);
        return interfaceC1776cP instanceof o ? (o) interfaceC1776cP : e.k(interfaceC1776cP, p.b.f20321a);
    }

    private boolean s(int i7) {
        return p(i7) instanceof o;
    }

    private void t() {
        this.f20511f.l(this.f20506a);
    }

    private void u() {
        f fVar = this.f20510e;
        if (fVar != null) {
            fVar.g();
            this.f20510e.j();
            l();
            k(1);
            this.f20510e.o();
            this.f20510e.i();
        }
    }

    private void x(int i7, Drawable drawable) {
        if (drawable == null) {
            this.f20510e.e(i7, null);
        } else {
            p(i7).l(e.d(drawable, this.f20508c, this.f20507b));
        }
    }

    public void B(Drawable drawable) {
        x(3, drawable);
    }

    public void C(d dVar) {
        this.f20508c = dVar;
        e.j(this.f20509d, dVar);
        for (int i7 = 0; i7 < this.f20510e.d(); i7++) {
            e.i(p(i7), this.f20508c, this.f20507b);
        }
    }

    @Override // m1.c
    public void a() {
        t();
        u();
    }

    @Override // m1.InterfaceC1869b
    public Rect b() {
        return this.f20509d.getBounds();
    }

    @Override // m1.c
    public void c(Drawable drawable) {
        this.f20509d.x(drawable);
    }

    @Override // m1.c
    public void d(Throwable th) {
        this.f20510e.g();
        l();
        if (this.f20510e.b(4) != null) {
            k(4);
        } else {
            k(1);
        }
        this.f20510e.i();
    }

    @Override // m1.c
    public void e(Throwable th) {
        this.f20510e.g();
        l();
        if (this.f20510e.b(5) != null) {
            k(5);
        } else {
            k(1);
        }
        this.f20510e.i();
    }

    @Override // m1.c
    public void f(float f7, boolean z6) {
        if (this.f20510e.b(3) == null) {
            return;
        }
        this.f20510e.g();
        A(f7);
        if (z6) {
            this.f20510e.o();
        }
        this.f20510e.i();
    }

    @Override // m1.InterfaceC1869b
    public Drawable g() {
        return this.f20509d;
    }

    @Override // m1.c
    public void h(Drawable drawable, float f7, boolean z6) {
        Drawable drawableD = e.d(drawable, this.f20508c, this.f20507b);
        drawableD.mutate();
        this.f20511f.l(drawableD);
        this.f20510e.g();
        l();
        k(2);
        A(f7);
        if (z6) {
            this.f20510e.o();
        }
        this.f20510e.i();
    }

    public PointF n() {
        if (s(2)) {
            return r(2).z();
        }
        return null;
    }

    public p.b o() {
        if (s(2)) {
            return r(2).A();
        }
        return null;
    }

    public d q() {
        return this.f20508c;
    }

    public void v(p.b bVar) {
        l.g(bVar);
        r(2).C(bVar);
    }

    public void w(Drawable drawable) {
        x(0, drawable);
    }

    public void y(int i7) {
        this.f20510e.u(i7);
    }

    public void z(Drawable drawable, p.b bVar) {
        x(1, drawable);
        r(1).C(bVar);
    }
}
