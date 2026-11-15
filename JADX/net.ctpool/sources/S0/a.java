package S0;

import O0.l;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable, Closeable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f2911r;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f2914m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final h f2915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final c f2916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected final Throwable f2917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Class f2910q = a.class;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final g f2912s = new C0065a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final c f2913t = new b();

    /* JADX INFO: renamed from: S0.a$a, reason: collision with other inner class name */
    class C0065a implements g {
        C0065a() {
        }

        @Override // S0.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Closeable closeable) {
            try {
                O0.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    class b implements c {
        b() {
        }

        @Override // S0.a.c
        public void a(h hVar, Throwable th) {
            Object objF = hVar.f();
            P0.a.E(a.f2910q, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(hVar)), objF == null ? null : objF.getClass().getName());
        }

        @Override // S0.a.c
        public boolean b() {
            return false;
        }
    }

    public interface c {
        void a(h hVar, Throwable th);

        boolean b();
    }

    protected a(h hVar, c cVar, Throwable th) {
        this.f2915n = (h) l.g(hVar);
        hVar.b();
        this.f2916o = cVar;
        this.f2917p = th;
    }

    public static boolean B(a aVar) {
        return aVar != null && aVar.z();
    }

    public static a J(Closeable closeable) {
        return W(closeable, f2912s);
    }

    public static a U(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return j0(closeable, f2912s, cVar, cVar.b() ? new Throwable() : null);
    }

    public static a W(Object obj, g gVar) {
        return h0(obj, gVar, f2913t);
    }

    public static a e(a aVar) {
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    public static void g(a aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public static a h0(Object obj, g gVar, c cVar) {
        if (obj == null) {
            return null;
        }
        return j0(obj, gVar, cVar, cVar.b() ? new Throwable() : null);
    }

    public static a j0(Object obj, g gVar, c cVar, Throwable th) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Bitmap) || (obj instanceof d)) {
            int i7 = f2911r;
            if (i7 == 1) {
                return new S0.c(obj, gVar, cVar, th);
            }
            if (i7 == 2) {
                return new f(obj, gVar, cVar, th);
            }
            if (i7 == 3) {
                return new e(obj);
            }
        }
        return new S0.b(obj, gVar, cVar, th);
    }

    /* JADX INFO: renamed from: b */
    public abstract a clone();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f2914m) {
                    return;
                }
                this.f2914m = true;
                this.f2915n.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized a d() {
        if (!z()) {
            return null;
        }
        return clone();
    }

    public synchronized Object j() {
        l.i(!this.f2914m);
        return l.g(this.f2915n.f());
    }

    public int l() {
        if (z()) {
            return System.identityHashCode(this.f2915n.f());
        }
        return 0;
    }

    public synchronized boolean z() {
        return !this.f2914m;
    }

    protected a(Object obj, g gVar, c cVar, Throwable th, boolean z6) {
        this.f2915n = new h(obj, gVar, z6);
        this.f2916o = cVar;
        this.f2917p = th;
    }
}
