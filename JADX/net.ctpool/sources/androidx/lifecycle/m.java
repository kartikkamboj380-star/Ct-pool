package androidx.lifecycle;

import androidx.lifecycle.AbstractC0651h;
import j.C1767a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k.C1812a;
import k.C1813b;

/* JADX INFO: loaded from: classes.dex */
public class m extends AbstractC0651h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1812a f8354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AbstractC0651h.c f8355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference f8356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f8360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f8361i;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AbstractC0651h.c f8362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        InterfaceC0653j f8363b;

        a(InterfaceC0654k interfaceC0654k, AbstractC0651h.c cVar) {
            this.f8363b = o.f(interfaceC0654k);
            this.f8362a = cVar;
        }

        void a(l lVar, AbstractC0651h.b bVar) {
            AbstractC0651h.c cVarH = bVar.h();
            this.f8362a = m.k(this.f8362a, cVarH);
            this.f8363b.g(lVar, bVar);
            this.f8362a = cVarH;
        }
    }

    public m(l lVar) {
        this(lVar, true);
    }

    private void d(l lVar) {
        Iterator itDescendingIterator = this.f8354b.descendingIterator();
        while (itDescendingIterator.hasNext() && !this.f8359g) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            a aVar = (a) entry.getValue();
            while (aVar.f8362a.compareTo(this.f8355c) > 0 && !this.f8359g && this.f8354b.contains((InterfaceC0654k) entry.getKey())) {
                AbstractC0651h.b bVarE = AbstractC0651h.b.e(aVar.f8362a);
                if (bVarE == null) {
                    throw new IllegalStateException("no event down from " + aVar.f8362a);
                }
                n(bVarE.h());
                aVar.a(lVar, bVarE);
                m();
            }
        }
    }

    private AbstractC0651h.c e(InterfaceC0654k interfaceC0654k) {
        Map.Entry entryO = this.f8354b.o(interfaceC0654k);
        AbstractC0651h.c cVar = null;
        AbstractC0651h.c cVar2 = entryO != null ? ((a) entryO.getValue()).f8362a : null;
        if (!this.f8360h.isEmpty()) {
            cVar = (AbstractC0651h.c) this.f8360h.get(r0.size() - 1);
        }
        return k(k(this.f8355c, cVar2), cVar);
    }

    private void f(String str) {
        if (!this.f8361i || C1767a.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private void g(l lVar) {
        C1813b.d dVarH = this.f8354b.h();
        while (dVarH.hasNext() && !this.f8359g) {
            Map.Entry entry = (Map.Entry) dVarH.next();
            a aVar = (a) entry.getValue();
            while (aVar.f8362a.compareTo(this.f8355c) < 0 && !this.f8359g && this.f8354b.contains((InterfaceC0654k) entry.getKey())) {
                n(aVar.f8362a);
                AbstractC0651h.b bVarJ = AbstractC0651h.b.j(aVar.f8362a);
                if (bVarJ == null) {
                    throw new IllegalStateException("no event up from " + aVar.f8362a);
                }
                aVar.a(lVar, bVarJ);
                m();
            }
        }
    }

    private boolean i() {
        if (this.f8354b.size() == 0) {
            return true;
        }
        AbstractC0651h.c cVar = ((a) this.f8354b.c().getValue()).f8362a;
        AbstractC0651h.c cVar2 = ((a) this.f8354b.i().getValue()).f8362a;
        return cVar == cVar2 && this.f8355c == cVar2;
    }

    static AbstractC0651h.c k(AbstractC0651h.c cVar, AbstractC0651h.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(AbstractC0651h.c cVar) {
        AbstractC0651h.c cVar2 = this.f8355c;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 == AbstractC0651h.c.INITIALIZED && cVar == AbstractC0651h.c.DESTROYED) {
            throw new IllegalStateException("no event down from " + this.f8355c);
        }
        this.f8355c = cVar;
        if (this.f8358f || this.f8357e != 0) {
            this.f8359g = true;
            return;
        }
        this.f8358f = true;
        p();
        this.f8358f = false;
        if (this.f8355c == AbstractC0651h.c.DESTROYED) {
            this.f8354b = new C1812a();
        }
    }

    private void m() {
        this.f8360h.remove(r0.size() - 1);
    }

    private void n(AbstractC0651h.c cVar) {
        this.f8360h.add(cVar);
    }

    private void p() {
        l lVar = (l) this.f8356d.get();
        if (lVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zI = i();
            this.f8359g = false;
            if (zI) {
                return;
            }
            if (this.f8355c.compareTo(((a) this.f8354b.c().getValue()).f8362a) < 0) {
                d(lVar);
            }
            Map.Entry entryI = this.f8354b.i();
            if (!this.f8359g && entryI != null && this.f8355c.compareTo(((a) entryI.getValue()).f8362a) > 0) {
                g(lVar);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC0651h
    public void a(InterfaceC0654k interfaceC0654k) {
        l lVar;
        f("addObserver");
        AbstractC0651h.c cVar = this.f8355c;
        AbstractC0651h.c cVar2 = AbstractC0651h.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = AbstractC0651h.c.INITIALIZED;
        }
        a aVar = new a(interfaceC0654k, cVar2);
        if (((a) this.f8354b.m(interfaceC0654k, aVar)) == null && (lVar = (l) this.f8356d.get()) != null) {
            boolean z6 = this.f8357e != 0 || this.f8358f;
            AbstractC0651h.c cVarE = e(interfaceC0654k);
            this.f8357e++;
            while (aVar.f8362a.compareTo(cVarE) < 0 && this.f8354b.contains(interfaceC0654k)) {
                n(aVar.f8362a);
                AbstractC0651h.b bVarJ = AbstractC0651h.b.j(aVar.f8362a);
                if (bVarJ == null) {
                    throw new IllegalStateException("no event up from " + aVar.f8362a);
                }
                aVar.a(lVar, bVarJ);
                m();
                cVarE = e(interfaceC0654k);
            }
            if (!z6) {
                p();
            }
            this.f8357e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0651h
    public AbstractC0651h.c b() {
        return this.f8355c;
    }

    @Override // androidx.lifecycle.AbstractC0651h
    public void c(InterfaceC0654k interfaceC0654k) {
        f("removeObserver");
        this.f8354b.n(interfaceC0654k);
    }

    public void h(AbstractC0651h.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.h());
    }

    public void j(AbstractC0651h.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(AbstractC0651h.c cVar) {
        f("setCurrentState");
        l(cVar);
    }

    private m(l lVar, boolean z6) {
        this.f8354b = new C1812a();
        this.f8357e = 0;
        this.f8358f = false;
        this.f8359g = false;
        this.f8360h = new ArrayList();
        this.f8356d = new WeakReference(lVar);
        this.f8355c = AbstractC0651h.c.INITIALIZED;
        this.f8361i = z6;
    }
}
