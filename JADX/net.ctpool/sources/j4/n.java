package j4;

import h4.AbstractC1721j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import n4.C1928g;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f20398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i4.f f20399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f20400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f20401d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f20402e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f20403f = new j(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicMarkableReference f20404g = new AtomicMarkableReference(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicMarkableReference f20405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicReference f20406b = new AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f20407c;

        public a(boolean z6) {
            this.f20407c = z6;
            this.f20405a = new AtomicMarkableReference(new d(64, z6 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() throws Throwable {
            this.f20406b.set(null);
            e();
        }

        private void d() {
            Runnable runnable = new Runnable() { // from class: j4.m
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f20397m.c();
                }
            };
            if (com.facebook.jni.a.a(this.f20406b, null, runnable)) {
                n.this.f20399b.f19952b.f(runnable);
            }
        }

        private void e() throws Throwable {
            Map mapA;
            synchronized (this) {
                try {
                    if (this.f20405a.isMarked()) {
                        mapA = ((d) this.f20405a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f20405a;
                        atomicMarkableReference.set((d) atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapA != null) {
                n.this.f20398a.q(n.this.f20400c, mapA, this.f20407c);
            }
        }

        public Map b() {
            return ((d) this.f20405a.getReference()).a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((d) this.f20405a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f20405a;
                    atomicMarkableReference.set((d) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public n(String str, C1928g c1928g, i4.f fVar) {
        this.f20400c = str;
        this.f20398a = new f(c1928g);
        this.f20399b = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str, Map map, List list) throws Throwable {
        if (i() != null) {
            this.f20398a.s(str, i());
        }
        if (!map.isEmpty()) {
            this.f20398a.p(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.f20398a.r(str, list);
    }

    public static n k(String str, C1928g c1928g, i4.f fVar) {
        f fVar2 = new f(c1928g);
        n nVar = new n(str, c1928g, fVar);
        ((d) nVar.f20401d.f20405a.getReference()).e(fVar2.i(str, false));
        ((d) nVar.f20402e.f20405a.getReference()).e(fVar2.i(str, true));
        nVar.f20404g.set(fVar2.k(str), false);
        nVar.f20403f.c(fVar2.j(str));
        return nVar;
    }

    public static String l(String str, C1928g c1928g) {
        return new f(c1928g).k(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() throws Throwable {
        boolean z6;
        String strI;
        synchronized (this.f20404g) {
            try {
                z6 = false;
                if (this.f20404g.isMarked()) {
                    strI = i();
                    this.f20404g.set(strI, false);
                    z6 = true;
                } else {
                    strI = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            this.f20398a.s(this.f20400c, strI);
        }
    }

    public Map f() {
        return this.f20401d.b();
    }

    public Map g() {
        return this.f20402e.b();
    }

    public List h() {
        return this.f20403f.a();
    }

    public String i() {
        return (String) this.f20404g.getReference();
    }

    public boolean n(String str, String str2) {
        return this.f20401d.f(str, str2);
    }

    public boolean o(String str, String str2) {
        return this.f20402e.f(str, str2);
    }

    public void p(final String str) {
        synchronized (this.f20400c) {
            this.f20400c = str;
            final Map mapB = this.f20401d.b();
            final List listB = this.f20403f.b();
            this.f20399b.f19952b.f(new Runnable() { // from class: j4.k
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f20392m.j(str, mapB, listB);
                }
            });
        }
    }

    public void q(String str) {
        String strC = d.c(str, 1024);
        synchronized (this.f20404g) {
            try {
                if (AbstractC1721j.y(strC, (String) this.f20404g.getReference())) {
                    return;
                }
                this.f20404g.set(strC, true);
                this.f20399b.f19952b.f(new Runnable() { // from class: j4.l
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f20396m.m();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
