package o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.InterfaceC1891a;
import q0.u;
import w5.k;

/* JADX INFO: renamed from: o0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1934c implements InterfaceC1891a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0.h f21447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f21448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f21449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f21450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f21451e;

    /* JADX INFO: renamed from: o0.c$a */
    public interface a {
        void c(List list);

        void d(List list);
    }

    public AbstractC1934c(p0.h hVar) {
        k.f(hVar, "tracker");
        this.f21447a = hVar;
        this.f21448b = new ArrayList();
        this.f21449c = new ArrayList();
    }

    private final void h(a aVar, Object obj) {
        if (this.f21448b.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.d(this.f21448b);
        } else {
            aVar.c(this.f21448b);
        }
    }

    @Override // n0.InterfaceC1891a
    public void a(Object obj) {
        this.f21450d = obj;
        h(this.f21451e, obj);
    }

    public abstract boolean b(u uVar);

    public abstract boolean c(Object obj);

    public final boolean d(String str) {
        k.f(str, "workSpecId");
        Object obj = this.f21450d;
        return obj != null && c(obj) && this.f21449c.contains(str);
    }

    public final void e(Iterable iterable) {
        k.f(iterable, "workSpecs");
        this.f21448b.clear();
        this.f21449c.clear();
        List list = this.f21448b;
        for (Object obj : iterable) {
            if (b((u) obj)) {
                list.add(obj);
            }
        }
        List list2 = this.f21448b;
        List list3 = this.f21449c;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((u) it.next()).f21795a);
        }
        if (this.f21448b.isEmpty()) {
            this.f21447a.f(this);
        } else {
            this.f21447a.c(this);
        }
        h(this.f21451e, this.f21450d);
    }

    public final void f() {
        if (!this.f21448b.isEmpty()) {
            this.f21448b.clear();
            this.f21447a.f(this);
        }
    }

    public final void g(a aVar) {
        if (this.f21451e != aVar) {
            this.f21451e = aVar;
            h(aVar, this.f21450d);
        }
    }
}
