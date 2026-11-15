package n1;

import O0.j;
import O0.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import f1.C1646c;
import j1.s;
import j1.t;
import m1.InterfaceC1868a;
import m1.InterfaceC1869b;

/* JADX INFO: renamed from: n1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1895b implements t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceC1869b f21341p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21338m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f21339n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f21340o = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private InterfaceC1868a f21342q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1646c f21343r = C1646c.a();

    public C1895b(InterfaceC1869b interfaceC1869b) {
        if (interfaceC1869b != null) {
            q(interfaceC1869b);
        }
    }

    private void a() {
        if (this.f21338m) {
            return;
        }
        this.f21343r.b(C1646c.a.ON_ATTACH_CONTROLLER);
        this.f21338m = true;
        InterfaceC1868a interfaceC1868a = this.f21342q;
        if (interfaceC1868a == null || interfaceC1868a.b() == null) {
            return;
        }
        this.f21342q.f();
    }

    private void c() {
        if (this.f21339n && this.f21340o) {
            a();
        } else {
            f();
        }
    }

    public static C1895b e(InterfaceC1869b interfaceC1869b, Context context) {
        C1895b c1895b = new C1895b(interfaceC1869b);
        c1895b.n(context);
        return c1895b;
    }

    private void f() {
        if (this.f21338m) {
            this.f21343r.b(C1646c.a.ON_DETACH_CONTROLLER);
            this.f21338m = false;
            if (j()) {
                this.f21342q.a();
            }
        }
    }

    private void r(t tVar) {
        Object objI = i();
        if (objI instanceof s) {
            ((s) objI).h(tVar);
        }
    }

    @Override // j1.t
    public void b() {
        if (this.f21338m) {
            return;
        }
        P0.a.E(C1646c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f21342q)), toString());
        this.f21339n = true;
        this.f21340o = true;
        c();
    }

    @Override // j1.t
    public void d(boolean z6) {
        if (this.f21340o == z6) {
            return;
        }
        this.f21343r.b(z6 ? C1646c.a.ON_DRAWABLE_SHOW : C1646c.a.ON_DRAWABLE_HIDE);
        this.f21340o = z6;
        c();
    }

    public InterfaceC1868a g() {
        return this.f21342q;
    }

    public InterfaceC1869b h() {
        return (InterfaceC1869b) l.g(this.f21341p);
    }

    public Drawable i() {
        InterfaceC1869b interfaceC1869b = this.f21341p;
        if (interfaceC1869b == null) {
            return null;
        }
        return interfaceC1869b.g();
    }

    public boolean j() {
        InterfaceC1868a interfaceC1868a = this.f21342q;
        return interfaceC1868a != null && interfaceC1868a.b() == this.f21341p;
    }

    public void k() {
        this.f21343r.b(C1646c.a.ON_HOLDER_ATTACH);
        this.f21339n = true;
        c();
    }

    public void l() {
        this.f21343r.b(C1646c.a.ON_HOLDER_DETACH);
        this.f21339n = false;
        c();
    }

    public boolean m(MotionEvent motionEvent) {
        if (j()) {
            return this.f21342q.c(motionEvent);
        }
        return false;
    }

    public void o() {
        p(null);
    }

    public void p(InterfaceC1868a interfaceC1868a) {
        boolean z6 = this.f21338m;
        if (z6) {
            f();
        }
        if (j()) {
            this.f21343r.b(C1646c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f21342q.d(null);
        }
        this.f21342q = interfaceC1868a;
        if (interfaceC1868a != null) {
            this.f21343r.b(C1646c.a.ON_SET_CONTROLLER);
            this.f21342q.d(this.f21341p);
        } else {
            this.f21343r.b(C1646c.a.ON_CLEAR_CONTROLLER);
        }
        if (z6) {
            a();
        }
    }

    public void q(InterfaceC1869b interfaceC1869b) {
        this.f21343r.b(C1646c.a.ON_SET_HIERARCHY);
        boolean zJ = j();
        r(null);
        InterfaceC1869b interfaceC1869b2 = (InterfaceC1869b) l.g(interfaceC1869b);
        this.f21341p = interfaceC1869b2;
        Drawable drawableG = interfaceC1869b2.g();
        d(drawableG == null || drawableG.isVisible());
        r(this);
        if (zJ) {
            this.f21342q.d(interfaceC1869b);
        }
    }

    public String toString() {
        return j.c(this).c("controllerAttached", this.f21338m).c("holderAttached", this.f21339n).c("drawableVisible", this.f21340o).b("events", this.f21343r.toString()).toString();
    }

    public void n(Context context) {
    }
}
