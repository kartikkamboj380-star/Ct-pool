package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d f6264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f6265c = androidx.concurrent.futures.d.z();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f6266d;

        a() {
        }

        private void d() {
            this.f6263a = null;
            this.f6264b = null;
            this.f6265c = null;
        }

        void a() {
            this.f6263a = null;
            this.f6264b = null;
            this.f6265c.v(null);
        }

        public boolean b(Object obj) {
            this.f6266d = true;
            d dVar = this.f6264b;
            boolean z6 = dVar != null && dVar.b(obj);
            if (z6) {
                d();
            }
            return z6;
        }

        public boolean c() {
            this.f6266d = true;
            d dVar = this.f6264b;
            boolean z6 = dVar != null && dVar.a(true);
            if (z6) {
                d();
            }
            return z6;
        }

        public boolean e(Throwable th) {
            this.f6266d = true;
            d dVar = this.f6264b;
            boolean z6 = dVar != null && dVar.c(th);
            if (z6) {
                d();
            }
            return z6;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            d dVar2 = this.f6264b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f6263a));
            }
            if (this.f6266d || (dVar = this.f6265c) == null) {
                return;
            }
            dVar.v(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0127c {
        Object a(a aVar);
    }

    private static final class d implements X3.d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final WeakReference f6267m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final androidx.concurrent.futures.a f6268n = new a();

        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String s() {
                a aVar = (a) d.this.f6267m.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f6263a + "]";
            }
        }

        d(a aVar) {
            this.f6267m = new WeakReference(aVar);
        }

        boolean a(boolean z6) {
            return this.f6268n.cancel(z6);
        }

        boolean b(Object obj) {
            return this.f6268n.v(obj);
        }

        boolean c(Throwable th) {
            return this.f6268n.w(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z6) {
            a aVar = (a) this.f6267m.get();
            boolean zCancel = this.f6268n.cancel(z6);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        @Override // X3.d
        public void e(Runnable runnable, Executor executor) {
            this.f6268n.e(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f6268n.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f6268n.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f6268n.isDone();
        }

        public String toString() {
            return this.f6268n.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j7, TimeUnit timeUnit) {
            return this.f6268n.get(j7, timeUnit);
        }
    }

    public static X3.d a(InterfaceC0127c interfaceC0127c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f6264b = dVar;
        aVar.f6263a = interfaceC0127c.getClass();
        try {
            Object objA = interfaceC0127c.a(aVar);
            if (objA != null) {
                aVar.f6263a = objA;
            }
        } catch (Exception e7) {
            dVar.c(e7);
        }
        return dVar;
    }
}
