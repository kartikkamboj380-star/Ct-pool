package w1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f22631h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Class f22632i = j.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J0.n f22633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.i f22634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final R0.l f22635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f22636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f22637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f22638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C f22639g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public j(J0.n nVar, R0.i iVar, R0.l lVar, Executor executor, Executor executor2, t tVar) {
        w5.k.f(nVar, "fileCache");
        w5.k.f(iVar, "pooledByteBufferFactory");
        w5.k.f(lVar, "pooledByteStreams");
        w5.k.f(executor, "readExecutor");
        w5.k.f(executor2, "writeExecutor");
        w5.k.f(tVar, "imageCacheStatsTracker");
        this.f22633a = nVar;
        this.f22634b = iVar;
        this.f22635c = lVar;
        this.f22636d = executor;
        this.f22637e = executor2;
        this.f22638f = tVar;
        C cD = C.d();
        w5.k.e(cD, "getInstance()");
        this.f22639g = cD;
    }

    private final boolean g(I0.d dVar) {
        D1.g gVarC = this.f22639g.c(dVar);
        if (gVarC != null) {
            gVarC.close();
            P0.a.w(f22632i, "Found image for %s in staging area", dVar.c());
            this.f22638f.m(dVar);
            return true;
        }
        P0.a.w(f22632i, "Did not find image for %s in staging area", dVar.c());
        this.f22638f.b(dVar);
        try {
            return this.f22633a.g(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void i(Object obj, j jVar) {
        w5.k.f(jVar, "this$0");
        Object objE = E1.a.e(obj, null);
        try {
            jVar.f22639g.a();
            jVar.f22633a.a();
            return null;
        } finally {
        }
    }

    private final x0.f l(I0.d dVar, D1.g gVar) {
        P0.a.w(f22632i, "Found image for %s in staging area", dVar.c());
        this.f22638f.m(dVar);
        x0.f fVarH = x0.f.h(gVar);
        w5.k.e(fVarH, "forResult(pinnedImage)");
        return fVarH;
    }

    private final x0.f n(final I0.d dVar, final AtomicBoolean atomicBoolean) {
        try {
            final Object objD = E1.a.d("BufferedDiskCache_getAsync");
            x0.f fVarB = x0.f.b(new Callable() { // from class: w1.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.o(objD, atomicBoolean, this, dVar);
                }
            }, this.f22636d);
            w5.k.e(fVarB, "{\n      val token = Fres…      readExecutor)\n    }");
            return fVarB;
        } catch (Exception e7) {
            P0.a.F(f22632i, e7, "Failed to schedule disk-cache read for %s", dVar.c());
            x0.f fVarG = x0.f.g(e7);
            w5.k.e(fVarG, "{\n      // Log failure\n …forError(exception)\n    }");
            return fVarG;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final D1.g o(Object obj, AtomicBoolean atomicBoolean, j jVar, I0.d dVar) {
        w5.k.f(atomicBoolean, "$isCancelled");
        w5.k.f(jVar, "this$0");
        w5.k.f(dVar, "$key");
        Object objE = E1.a.e(obj, null);
        try {
            if (atomicBoolean.get()) {
                throw new CancellationException();
            }
            D1.g gVarC = jVar.f22639g.c(dVar);
            if (gVarC != null) {
                P0.a.w(f22632i, "Found image for %s in staging area", dVar.c());
                jVar.f22638f.m(dVar);
            } else {
                P0.a.w(f22632i, "Did not find image for %s in staging area", dVar.c());
                jVar.f22638f.b(dVar);
                try {
                    R0.h hVarR = jVar.r(dVar);
                    if (hVarR == null) {
                        return null;
                    }
                    S0.a aVarJ = S0.a.J(hVarR);
                    w5.k.e(aVarJ, "of(buffer)");
                    try {
                        gVarC = new D1.g(aVarJ);
                    } finally {
                        S0.a.g(aVarJ);
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                return gVarC;
            }
            P0.a.v(f22632i, "Host thread was interrupted, decreasing reference count");
            gVarC.close();
            throw new InterruptedException();
        } catch (Throwable th) {
            try {
                E1.a.c(obj, th);
                throw th;
            } finally {
                E1.a.f(objE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Object obj, j jVar, I0.d dVar, D1.g gVar) {
        w5.k.f(jVar, "this$0");
        w5.k.f(dVar, "$key");
        Object objE = E1.a.e(obj, null);
        try {
            jVar.u(dVar, gVar);
        } finally {
        }
    }

    private final R0.h r(I0.d dVar) throws IOException {
        try {
            Class cls = f22632i;
            P0.a.w(cls, "Disk cache read for %s", dVar.c());
            H0.a aVarE = this.f22633a.e(dVar);
            if (aVarE == null) {
                P0.a.w(cls, "Disk cache miss for %s", dVar.c());
                this.f22638f.c(dVar);
                return null;
            }
            P0.a.w(cls, "Found entry in disk cache for %s", dVar.c());
            this.f22638f.f(dVar);
            InputStream inputStreamA = aVarE.a();
            try {
                R0.h hVarD = this.f22634b.d(inputStreamA, (int) aVarE.size());
                inputStreamA.close();
                P0.a.w(cls, "Successful read from disk cache for %s", dVar.c());
                return hVarD;
            } catch (Throwable th) {
                inputStreamA.close();
                throw th;
            }
        } catch (IOException e7) {
            P0.a.F(f22632i, e7, "Exception reading from cache for %s", dVar.c());
            this.f22638f.j(dVar);
            throw e7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void t(Object obj, j jVar, I0.d dVar) {
        w5.k.f(jVar, "this$0");
        w5.k.f(dVar, "$key");
        Object objE = E1.a.e(obj, null);
        try {
            jVar.f22639g.g(dVar);
            jVar.f22633a.b(dVar);
            return null;
        } finally {
        }
    }

    private final void u(I0.d dVar, final D1.g gVar) {
        Class cls = f22632i;
        P0.a.w(cls, "About to write to disk-cache for key %s", dVar.c());
        try {
            this.f22633a.d(dVar, new I0.j() { // from class: w1.i
                @Override // I0.j
                public final void a(OutputStream outputStream) {
                    j.v(gVar, this, outputStream);
                }
            });
            this.f22638f.l(dVar);
            P0.a.w(cls, "Successful disk-cache write for key %s", dVar.c());
        } catch (IOException e7) {
            P0.a.F(f22632i, e7, "Failed to write to disk-cache for key %s", dVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(D1.g gVar, j jVar, OutputStream outputStream) {
        w5.k.f(jVar, "this$0");
        w5.k.f(outputStream, "os");
        w5.k.c(gVar);
        InputStream inputStreamO = gVar.o();
        if (inputStreamO == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        jVar.f22635c.a(inputStreamO, outputStream);
    }

    public final void f(I0.d dVar) {
        w5.k.f(dVar, "key");
        this.f22633a.f(dVar);
    }

    public final x0.f h() {
        this.f22639g.a();
        final Object objD = E1.a.d("BufferedDiskCache_clearAll");
        try {
            x0.f fVarB = x0.f.b(new Callable() { // from class: w1.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.i(objD, this);
                }
            }, this.f22637e);
            w5.k.e(fVarB, "{\n      Task.call(\n     …     writeExecutor)\n    }");
            return fVarB;
        } catch (Exception e7) {
            P0.a.F(f22632i, e7, "Failed to schedule disk-cache clear", new Object[0]);
            x0.f fVarG = x0.f.g(e7);
            w5.k.e(fVarG, "{\n      // Log failure\n …forError(exception)\n    }");
            return fVarG;
        }
    }

    public final boolean j(I0.d dVar) {
        w5.k.f(dVar, "key");
        return this.f22639g.b(dVar) || this.f22633a.c(dVar);
    }

    public final boolean k(I0.d dVar) {
        w5.k.f(dVar, "key");
        if (j(dVar)) {
            return true;
        }
        return g(dVar);
    }

    public final x0.f m(I0.d dVar, AtomicBoolean atomicBoolean) {
        x0.f fVarN;
        x0.f fVarL;
        w5.k.f(dVar, "key");
        w5.k.f(atomicBoolean, "isCancelled");
        if (!K1.b.d()) {
            D1.g gVarC = this.f22639g.c(dVar);
            return (gVarC == null || (fVarL = l(dVar, gVarC)) == null) ? n(dVar, atomicBoolean) : fVarL;
        }
        K1.b.a("BufferedDiskCache#get");
        try {
            D1.g gVarC2 = this.f22639g.c(dVar);
            if (gVarC2 == null || (fVarN = l(dVar, gVarC2)) == null) {
                fVarN = n(dVar, atomicBoolean);
            }
            K1.b.b();
            return fVarN;
        } catch (Throwable th) {
            K1.b.b();
            throw th;
        }
    }

    public final void p(final I0.d dVar, D1.g gVar) {
        w5.k.f(dVar, "key");
        w5.k.f(gVar, "encodedImage");
        if (!K1.b.d()) {
            if (!D1.g.j0(gVar)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f22639g.f(dVar, gVar);
            final D1.g gVarB = D1.g.b(gVar);
            try {
                final Object objD = E1.a.d("BufferedDiskCache_putAsync");
                this.f22637e.execute(new Runnable() { // from class: w1.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD, this, dVar, gVarB);
                    }
                });
                return;
            } catch (Exception e7) {
                P0.a.F(f22632i, e7, "Failed to schedule disk-cache write for %s", dVar.c());
                this.f22639g.h(dVar, gVar);
                D1.g.d(gVarB);
                return;
            }
        }
        K1.b.a("BufferedDiskCache#put");
        try {
            if (!D1.g.j0(gVar)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f22639g.f(dVar, gVar);
            final D1.g gVarB2 = D1.g.b(gVar);
            try {
                final Object objD2 = E1.a.d("BufferedDiskCache_putAsync");
                this.f22637e.execute(new Runnable() { // from class: w1.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.q(objD2, this, dVar, gVarB2);
                    }
                });
            } catch (Exception e8) {
                P0.a.F(f22632i, e8, "Failed to schedule disk-cache write for %s", dVar.c());
                this.f22639g.h(dVar, gVar);
                D1.g.d(gVarB2);
            }
            i5.u uVar = i5.u.f19985a;
        } finally {
            K1.b.b();
        }
    }

    public final x0.f s(final I0.d dVar) {
        w5.k.f(dVar, "key");
        this.f22639g.g(dVar);
        try {
            final Object objD = E1.a.d("BufferedDiskCache_remove");
            x0.f fVarB = x0.f.b(new Callable() { // from class: w1.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j.t(objD, this, dVar);
                }
            }, this.f22637e);
            w5.k.e(fVarB, "{\n      val token = Fres…     writeExecutor)\n    }");
            return fVarB;
        } catch (Exception e7) {
            P0.a.F(f22632i, e7, "Failed to schedule disk-cache remove for %s", dVar.c());
            x0.f fVarG = x0.f.g(e7);
            w5.k.e(fVarG, "{\n      // Log failure\n …forError(exception)\n    }");
            return fVarG;
        }
    }
}
