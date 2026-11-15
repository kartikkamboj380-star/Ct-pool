package n0;

import i5.u;
import java.util.ArrayList;
import java.util.List;
import l0.i;
import o0.AbstractC1934c;
import o0.C1932a;
import o0.C1933b;
import o0.C1935d;
import o0.C1936e;
import o0.C1937f;
import o0.C1938g;
import o0.C1939h;
import p0.n;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d, AbstractC1934c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1893c f21332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC1934c[] f21333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21334c;

    public e(InterfaceC1893c interfaceC1893c, AbstractC1934c[] abstractC1934cArr) {
        k.f(abstractC1934cArr, "constraintControllers");
        this.f21332a = interfaceC1893c;
        this.f21333b = abstractC1934cArr;
        this.f21334c = new Object();
    }

    @Override // n0.d
    public void a() {
        synchronized (this.f21334c) {
            try {
                for (AbstractC1934c abstractC1934c : this.f21333b) {
                    abstractC1934c.f();
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n0.d
    public void b(Iterable iterable) {
        k.f(iterable, "workSpecs");
        synchronized (this.f21334c) {
            try {
                for (AbstractC1934c abstractC1934c : this.f21333b) {
                    abstractC1934c.g(null);
                }
                for (AbstractC1934c abstractC1934c2 : this.f21333b) {
                    abstractC1934c2.e(iterable);
                }
                for (AbstractC1934c abstractC1934c3 : this.f21333b) {
                    abstractC1934c3.g(this);
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o0.AbstractC1934c.a
    public void c(List list) {
        k.f(list, "workSpecs");
        synchronized (this.f21334c) {
            try {
                ArrayList<q0.u> arrayList = new ArrayList();
                for (Object obj : list) {
                    if (e(((q0.u) obj).f21795a)) {
                        arrayList.add(obj);
                    }
                }
                for (q0.u uVar : arrayList) {
                    i.e().a(f.f21335a, "Constraints met for " + uVar);
                }
                InterfaceC1893c interfaceC1893c = this.f21332a;
                if (interfaceC1893c != null) {
                    interfaceC1893c.f(arrayList);
                    u uVar2 = u.f19985a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o0.AbstractC1934c.a
    public void d(List list) {
        k.f(list, "workSpecs");
        synchronized (this.f21334c) {
            InterfaceC1893c interfaceC1893c = this.f21332a;
            if (interfaceC1893c != null) {
                interfaceC1893c.b(list);
                u uVar = u.f19985a;
            }
        }
    }

    public final boolean e(String str) {
        AbstractC1934c abstractC1934c;
        boolean z6;
        k.f(str, "workSpecId");
        synchronized (this.f21334c) {
            try {
                AbstractC1934c[] abstractC1934cArr = this.f21333b;
                int length = abstractC1934cArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        abstractC1934c = null;
                        break;
                    }
                    abstractC1934c = abstractC1934cArr[i7];
                    if (abstractC1934c.d(str)) {
                        break;
                    }
                    i7++;
                }
                if (abstractC1934c != null) {
                    i.e().a(f.f21335a, "Work " + str + " constrained by " + abstractC1934c.getClass().getSimpleName());
                }
                z6 = abstractC1934c == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(n nVar, InterfaceC1893c interfaceC1893c) {
        this(interfaceC1893c, new AbstractC1934c[]{new C1932a(nVar.a()), new C1933b(nVar.b()), new C1939h(nVar.d()), new C1935d(nVar.c()), new C1938g(nVar.c()), new C1937f(nVar.c()), new C1936e(nVar.c())});
        k.f(nVar, "trackers");
    }
}
