package d1;

import F1.c;
import O0.o;
import V0.b;
import android.graphics.Rect;
import androidx.appcompat.app.y;
import c1.d;
import e1.C1618a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m1.InterfaceC1869b;
import p1.e;
import p1.g;
import p1.h;
import p1.i;
import p1.l;

/* JADX INFO: renamed from: d1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1603a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f18661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f18662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f18663c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f18664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e1.b f18665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1618a f18666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f18667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f18668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18669i;

    public C1603a(b bVar, d dVar, o oVar) {
        this.f18662b = bVar;
        this.f18661a = dVar;
        this.f18664d = oVar;
    }

    private void h() {
        if (this.f18666f == null) {
            this.f18666f = new C1618a(this.f18662b, this.f18663c, this, this.f18664d);
        }
        if (this.f18665e == null) {
            this.f18665e = new e1.b(this.f18662b, this.f18663c);
        }
        if (this.f18667g == null) {
            this.f18667g = new c(this.f18665e);
        }
    }

    @Override // p1.h
    public void a(i iVar, e eVar) {
        List list;
        iVar.n(eVar);
        if (!this.f18669i || (list = this.f18668h) == null || list.isEmpty()) {
            return;
        }
        if (eVar == e.SUCCESS) {
            d();
        }
        iVar.y();
        Iterator it = this.f18668h.iterator();
        if (it.hasNext()) {
            y.a(it.next());
            throw null;
        }
    }

    @Override // p1.h
    public void b(i iVar, l lVar) {
        List list;
        if (!this.f18669i || (list = this.f18668h) == null || list.isEmpty()) {
            return;
        }
        iVar.y();
        Iterator it = this.f18668h.iterator();
        if (it.hasNext()) {
            y.a(it.next());
            throw null;
        }
    }

    public void c(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f18668h == null) {
            this.f18668h = new CopyOnWriteArrayList();
        }
        this.f18668h.add(gVar);
    }

    public void d() {
        InterfaceC1869b interfaceC1869bB = this.f18661a.b();
        if (interfaceC1869bB == null || interfaceC1869bB.g() == null) {
            return;
        }
        Rect bounds = interfaceC1869bB.g().getBounds();
        this.f18663c.t(bounds.width());
        this.f18663c.s(bounds.height());
    }

    public void e() {
        List list = this.f18668h;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f18663c.b();
    }

    public void g(boolean z6) {
        this.f18669i = z6;
        if (!z6) {
            C1618a c1618a = this.f18666f;
            if (c1618a != null) {
                this.f18661a.S(c1618a);
            }
            c cVar = this.f18667g;
            if (cVar != null) {
                this.f18661a.x0(cVar);
                return;
            }
            return;
        }
        h();
        C1618a c1618a2 = this.f18666f;
        if (c1618a2 != null) {
            this.f18661a.k(c1618a2);
        }
        c cVar2 = this.f18667g;
        if (cVar2 != null) {
            this.f18661a.i0(cVar2);
        }
    }
}
