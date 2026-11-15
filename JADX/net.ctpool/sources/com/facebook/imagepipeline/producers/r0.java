package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class r0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f10994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10995b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f10998e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f10997d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10996c = 0;

    private class a extends AbstractC0782t {

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.r0$a$a, reason: collision with other inner class name */
        class RunnableC0206a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ Pair f11000m;

            RunnableC0206a(Pair pair) {
                this.f11000m = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                r0 r0Var = r0.this;
                Pair pair = this.f11000m;
                r0Var.g((InterfaceC0777n) pair.first, (e0) pair.second);
            }
        }

        private a(InterfaceC0777n interfaceC0777n) {
            super(interfaceC0777n);
        }

        private void q() {
            Pair pair;
            synchronized (r0.this) {
                try {
                    pair = (Pair) r0.this.f10997d.poll();
                    if (pair == null) {
                        r0 r0Var = r0.this;
                        r0Var.f10996c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair != null) {
                r0.this.f10998e.execute(new RunnableC0206a(pair));
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0782t, com.facebook.imagepipeline.producers.AbstractC0766c
        protected void g() {
            p().b();
            q();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0782t, com.facebook.imagepipeline.producers.AbstractC0766c
        protected void h(Throwable th) {
            p().a(th);
            q();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        protected void i(Object obj, int i7) {
            p().d(obj, i7);
            if (AbstractC0766c.e(i7)) {
                q();
            }
        }
    }

    public r0(int i7, Executor executor, d0 d0Var) {
        this.f10995b = i7;
        this.f10998e = (Executor) O0.l.g(executor);
        this.f10994a = (d0) O0.l.g(d0Var);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        boolean z6;
        e0Var.B().e(e0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i7 = this.f10996c;
                z6 = true;
                if (i7 >= this.f10995b) {
                    this.f10997d.add(Pair.create(interfaceC0777n, e0Var));
                } else {
                    this.f10996c = i7 + 1;
                    z6 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            return;
        }
        g(interfaceC0777n, e0Var);
    }

    void g(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        e0Var.B().j(e0Var, "ThrottlingProducer", null);
        this.f10994a.a(new a(interfaceC0777n), e0Var);
    }
}
