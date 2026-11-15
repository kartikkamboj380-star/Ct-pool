package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import x1.EnumC2214e;

/* JADX INFO: loaded from: classes.dex */
public abstract class U implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f10812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f10813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10816e;

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f10817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CopyOnWriteArraySet f10818b = O0.n.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Closeable f10819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f10820d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10821e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C0768e f10822f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f10823g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.U$a$a, reason: collision with other inner class name */
        class C0203a extends AbstractC0769f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Pair f10825a;

            C0203a(Pair pair) {
                this.f10825a = pair;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                boolean zRemove;
                List list;
                C0768e c0768e;
                List listT;
                List listR;
                synchronized (a.this) {
                    try {
                        zRemove = a.this.f10818b.remove(this.f10825a);
                        list = null;
                        if (!zRemove) {
                            c0768e = null;
                            listT = null;
                        } else if (a.this.f10818b.isEmpty()) {
                            c0768e = a.this.f10822f;
                            listT = null;
                        } else {
                            List listS = a.this.s();
                            listT = a.this.t();
                            listR = a.this.r();
                            c0768e = null;
                            list = listS;
                        }
                        listR = listT;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0768e.i(list);
                C0768e.k(listT);
                C0768e.h(listR);
                if (c0768e != null) {
                    if (!U.this.f10814c || c0768e.l()) {
                        c0768e.m();
                    } else {
                        C0768e.k(c0768e.s(EnumC2214e.LOW));
                    }
                }
                if (zRemove) {
                    ((InterfaceC0777n) this.f10825a.first).b();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0769f, com.facebook.imagepipeline.producers.f0
            public void b() {
                C0768e.h(a.this.r());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0769f, com.facebook.imagepipeline.producers.f0
            public void c() {
                C0768e.k(a.this.t());
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0769f, com.facebook.imagepipeline.producers.f0
            public void d() {
                C0768e.i(a.this.s());
            }
        }

        private class b extends AbstractC0766c {
            private b() {
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0766c
            protected void g() {
                try {
                    if (K1.b.d()) {
                        K1.b.a("MultiplexProducer#onCancellation");
                    }
                    a.this.m(this);
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                } catch (Throwable th) {
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                    throw th;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0766c
            protected void h(Throwable th) {
                try {
                    if (K1.b.d()) {
                        K1.b.a("MultiplexProducer#onFailure");
                    }
                    a.this.n(this, th);
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                } catch (Throwable th2) {
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                    throw th2;
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC0766c
            protected void j(float f7) {
                try {
                    if (K1.b.d()) {
                        K1.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.p(this, f7);
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                } catch (Throwable th) {
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                    throw th;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.producers.AbstractC0766c
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public void i(Closeable closeable, int i7) {
                try {
                    if (K1.b.d()) {
                        K1.b.a("MultiplexProducer#onNewResult");
                    }
                    a.this.o(this, closeable, i7);
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                } catch (Throwable th) {
                    if (K1.b.d()) {
                        K1.b.b();
                    }
                    throw th;
                }
            }
        }

        public a(Object obj) {
            this.f10817a = obj;
        }

        private void g(Pair pair, e0 e0Var) {
            e0Var.e(new C0203a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }

        private synchronized boolean j() {
            Iterator it = this.f10818b.iterator();
            while (it.hasNext()) {
                if (((e0) ((Pair) it.next()).second).J()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator it = this.f10818b.iterator();
            while (it.hasNext()) {
                if (!((e0) ((Pair) it.next()).second).l()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized EnumC2214e l() {
            EnumC2214e enumC2214eH;
            enumC2214eH = EnumC2214e.LOW;
            Iterator it = this.f10818b.iterator();
            while (it.hasNext()) {
                enumC2214eH = EnumC2214e.h(enumC2214eH, ((e0) ((Pair) it.next()).second).b());
            }
            return enumC2214eH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(W0.e eVar) {
            synchronized (this) {
                try {
                    O0.l.b(Boolean.valueOf(this.f10822f == null));
                    O0.l.b(Boolean.valueOf(this.f10823g == null));
                    if (this.f10818b.isEmpty()) {
                        U.this.k(this.f10817a, this);
                        return;
                    }
                    e0 e0Var = (e0) ((Pair) this.f10818b.iterator().next()).second;
                    C0768e c0768e = new C0768e(e0Var.d(), e0Var.getId(), e0Var.B(), e0Var.a(), e0Var.U(), k(), j(), l(), e0Var.f());
                    this.f10822f = c0768e;
                    c0768e.j(e0Var.getExtras());
                    if (eVar.h()) {
                        this.f10822f.w("started_as_prefetch", Boolean.valueOf(eVar.e()));
                    }
                    b bVar = new b();
                    this.f10823g = bVar;
                    U.this.f10813b.a(bVar, this.f10822f);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List r() {
            C0768e c0768e = this.f10822f;
            if (c0768e == null) {
                return null;
            }
            return c0768e.q(j());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List s() {
            C0768e c0768e = this.f10822f;
            if (c0768e == null) {
                return null;
            }
            return c0768e.r(k());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized List t() {
            C0768e c0768e = this.f10822f;
            if (c0768e == null) {
                return null;
            }
            return c0768e.s(l());
        }

        public boolean h(InterfaceC0777n interfaceC0777n, e0 e0Var) {
            Pair pairCreate = Pair.create(interfaceC0777n, e0Var);
            synchronized (this) {
                try {
                    if (U.this.i(this.f10817a) != this) {
                        return false;
                    }
                    this.f10818b.add(pairCreate);
                    List listS = s();
                    List listT = t();
                    List listR = r();
                    Closeable closeableG = this.f10819c;
                    float f7 = this.f10820d;
                    int i7 = this.f10821e;
                    C0768e.i(listS);
                    C0768e.k(listT);
                    C0768e.h(listR);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                if (closeableG != this.f10819c) {
                                    closeableG = null;
                                } else if (closeableG != null) {
                                    closeableG = U.this.g(closeableG);
                                }
                            }
                            if (closeableG != null) {
                                if (f7 > 0.0f) {
                                    interfaceC0777n.c(f7);
                                }
                                interfaceC0777n.d(closeableG, i7);
                                i(closeableG);
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    g(pairCreate, e0Var);
                    return true;
                } finally {
                }
            }
        }

        public void m(b bVar) {
            synchronized (this) {
                try {
                    if (this.f10823g != bVar) {
                        return;
                    }
                    this.f10823g = null;
                    this.f10822f = null;
                    i(this.f10819c);
                    this.f10819c = null;
                    q(W0.e.UNSET);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void n(b bVar, Throwable th) {
            synchronized (this) {
                try {
                    if (this.f10823g != bVar) {
                        return;
                    }
                    this.f10818b.clear();
                    U.this.k(this.f10817a, this);
                    i(this.f10819c);
                    this.f10819c = null;
                    for (Pair pair : this.f10818b) {
                        synchronized (pair) {
                            ((e0) pair.second).B().k((e0) pair.second, U.this.f10815d, th, null);
                            ((InterfaceC0777n) pair.first).a(th);
                        }
                    }
                } finally {
                }
            }
        }

        public void o(b bVar, Closeable closeable, int i7) {
            synchronized (this) {
                try {
                    if (this.f10823g != bVar) {
                        return;
                    }
                    i(this.f10819c);
                    this.f10819c = null;
                    int size = this.f10818b.size();
                    if (AbstractC0766c.f(i7)) {
                        this.f10819c = U.this.g(closeable);
                        this.f10821e = i7;
                    } else {
                        this.f10818b.clear();
                        U.this.k(this.f10817a, this);
                    }
                    for (Pair pair : this.f10818b) {
                        synchronized (pair) {
                            try {
                                if (AbstractC0766c.e(i7)) {
                                    ((e0) pair.second).B().j((e0) pair.second, U.this.f10815d, null);
                                    C0768e c0768e = this.f10822f;
                                    if (c0768e != null) {
                                        ((e0) pair.second).j(c0768e.getExtras());
                                    }
                                    ((e0) pair.second).w(U.this.f10816e, Integer.valueOf(size));
                                }
                                ((InterfaceC0777n) pair.first).d(closeable, i7);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void p(b bVar, float f7) {
            synchronized (this) {
                try {
                    if (this.f10823g != bVar) {
                        return;
                    }
                    this.f10820d = f7;
                    for (Pair pair : this.f10818b) {
                        synchronized (pair) {
                            ((InterfaceC0777n) pair.first).c(f7);
                        }
                    }
                } finally {
                }
            }
        }
    }

    protected U(d0 d0Var, String str, String str2) {
        this(d0Var, str, str2, false);
    }

    private synchronized a h(Object obj) {
        a aVar;
        aVar = new a(obj);
        this.f10812a.put(obj, aVar);
        return aVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        a aVarI;
        boolean z6;
        try {
            if (K1.b.d()) {
                K1.b.a("MultiplexProducer#produceResults");
            }
            e0Var.B().e(e0Var, this.f10815d);
            Object objJ = j(e0Var);
            do {
                synchronized (this) {
                    try {
                        aVarI = i(objJ);
                        if (aVarI == null) {
                            aVarI = h(objJ);
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    } finally {
                    }
                }
            } while (!aVarI.h(interfaceC0777n, e0Var));
            if (z6) {
                aVarI.q(W0.e.j(e0Var.l()));
            }
            if (K1.b.d()) {
                K1.b.b();
            }
        } catch (Throwable th) {
            if (K1.b.d()) {
                K1.b.b();
            }
            throw th;
        }
    }

    protected abstract Closeable g(Closeable closeable);

    protected synchronized a i(Object obj) {
        return (a) this.f10812a.get(obj);
    }

    protected abstract Object j(e0 e0Var);

    protected synchronized void k(Object obj, a aVar) {
        if (this.f10812a.get(obj) == aVar) {
            this.f10812a.remove(obj);
        }
    }

    protected U(d0 d0Var, String str, String str2, boolean z6) {
        this.f10813b = d0Var;
        this.f10812a = new HashMap();
        this.f10814c = z6;
        this.f10815d = str;
        this.f10816e = str2;
    }
}
