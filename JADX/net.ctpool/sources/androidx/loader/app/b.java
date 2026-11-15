package androidx.loader.app;

import Q.c;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.loader.app.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import n.h;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f8397c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f8399b;

    public static class a extends q implements c.b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f8400l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Bundle f8401m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Q.c f8402n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private l f8403o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private C0164b f8404p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Q.c f8405q;

        a(int i7, Bundle bundle, Q.c cVar, Q.c cVar2) {
            this.f8400l = i7;
            this.f8401m = bundle;
            this.f8402n = cVar;
            this.f8405q = cVar2;
            cVar.t(i7, this);
        }

        @Override // Q.c.b
        public void a(Q.c cVar, Object obj) {
            if (b.f8397c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(obj);
                return;
            }
            if (b.f8397c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(obj);
        }

        @Override // androidx.lifecycle.LiveData
        protected void j() {
            if (b.f8397c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f8402n.w();
        }

        @Override // androidx.lifecycle.LiveData
        protected void k() {
            if (b.f8397c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f8402n.x();
        }

        @Override // androidx.lifecycle.LiveData
        public void m(r rVar) {
            super.m(rVar);
            this.f8403o = null;
            this.f8404p = null;
        }

        @Override // androidx.lifecycle.q, androidx.lifecycle.LiveData
        public void n(Object obj) {
            super.n(obj);
            Q.c cVar = this.f8405q;
            if (cVar != null) {
                cVar.u();
                this.f8405q = null;
            }
        }

        Q.c o(boolean z6) {
            if (b.f8397c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f8402n.b();
            this.f8402n.a();
            C0164b c0164b = this.f8404p;
            if (c0164b != null) {
                m(c0164b);
                if (z6) {
                    c0164b.d();
                }
            }
            this.f8402n.z(this);
            if ((c0164b == null || c0164b.c()) && !z6) {
                return this.f8402n;
            }
            this.f8402n.u();
            return this.f8405q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f8400l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f8401m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f8402n);
            this.f8402n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f8404p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f8404p);
                this.f8404p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        Q.c q() {
            return this.f8402n;
        }

        void r() {
            l lVar = this.f8403o;
            C0164b c0164b = this.f8404p;
            if (lVar == null || c0164b == null) {
                return;
            }
            super.m(c0164b);
            h(lVar, c0164b);
        }

        Q.c s(l lVar, a.InterfaceC0163a interfaceC0163a) {
            C0164b c0164b = new C0164b(this.f8402n, interfaceC0163a);
            h(lVar, c0164b);
            r rVar = this.f8404p;
            if (rVar != null) {
                m(rVar);
            }
            this.f8403o = lVar;
            this.f8404p = c0164b;
            return this.f8402n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f8400l);
            sb.append(" : ");
            Class<?> cls = this.f8402n.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0164b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q.c f8406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0163a f8407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8408c = false;

        C0164b(Q.c cVar, a.InterfaceC0163a interfaceC0163a) {
            this.f8406a = cVar;
            this.f8407b = interfaceC0163a;
        }

        @Override // androidx.lifecycle.r
        public void a(Object obj) {
            if (b.f8397c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f8406a + ": " + this.f8406a.d(obj));
            }
            this.f8408c = true;
            this.f8407b.c(this.f8406a, obj);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f8408c);
        }

        boolean c() {
            return this.f8408c;
        }

        void d() {
            if (this.f8408c) {
                if (b.f8397c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f8406a);
                }
                this.f8407b.b(this.f8406a);
            }
        }

        public String toString() {
            return this.f8407b.toString();
        }
    }

    static class c extends E {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final F.b f8409f = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h f8410d = new h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f8411e = false;

        static class a implements F.b {
            a() {
            }

            @Override // androidx.lifecycle.F.b
            public E a(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c h(H h7) {
            return (c) new F(h7, f8409f).a(c.class);
        }

        @Override // androidx.lifecycle.E
        protected void d() {
            super.d();
            int iM = this.f8410d.m();
            for (int i7 = 0; i7 < iM; i7++) {
                ((a) this.f8410d.p(i7)).o(true);
            }
            this.f8410d.b();
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f8410d.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i7 = 0; i7 < this.f8410d.m(); i7++) {
                    a aVar = (a) this.f8410d.p(i7);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f8410d.k(i7));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            this.f8411e = false;
        }

        a i(int i7) {
            return (a) this.f8410d.g(i7);
        }

        boolean j() {
            return this.f8411e;
        }

        void k() {
            int iM = this.f8410d.m();
            for (int i7 = 0; i7 < iM; i7++) {
                ((a) this.f8410d.p(i7)).r();
            }
        }

        void l(int i7, a aVar) {
            this.f8410d.l(i7, aVar);
        }

        void m() {
            this.f8411e = true;
        }
    }

    b(l lVar, H h7) {
        this.f8398a = lVar;
        this.f8399b = c.h(h7);
    }

    private Q.c e(int i7, Bundle bundle, a.InterfaceC0163a interfaceC0163a, Q.c cVar) {
        try {
            this.f8399b.m();
            Q.c cVarA = interfaceC0163a.a(i7, bundle);
            if (cVarA == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarA.getClass().isMemberClass() && !Modifier.isStatic(cVarA.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarA);
            }
            a aVar = new a(i7, bundle, cVarA, cVar);
            if (f8397c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f8399b.l(i7, aVar);
            this.f8399b.g();
            return aVar.s(this.f8398a, interfaceC0163a);
        } catch (Throwable th) {
            this.f8399b.g();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f8399b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public Q.c c(int i7, Bundle bundle, a.InterfaceC0163a interfaceC0163a) {
        if (this.f8399b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarI = this.f8399b.i(i7);
        if (f8397c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarI == null) {
            return e(i7, bundle, interfaceC0163a, null);
        }
        if (f8397c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarI);
        }
        return aVarI.s(this.f8398a, interfaceC0163a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f8399b.k();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.f8398a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
