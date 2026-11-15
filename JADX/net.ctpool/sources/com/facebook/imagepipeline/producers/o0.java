package com.facebook.imagepipeline.producers;

import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10949c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f10950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p0 f10951b;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(e0 e0Var) {
            if (!E1.a.b()) {
                return null;
            }
            return "ThreadHandoffProducer_produceResults_" + e0Var.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(e0 e0Var) {
            return e0Var.f().G().j() && Looper.getMainLooper().getThread() != Thread.currentThread();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends AbstractC0769f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f10952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f10953b;

        b(m0 m0Var, o0 o0Var) {
            this.f10952a = m0Var;
            this.f10953b = o0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f10952a.a();
            this.f10953b.d().a(this.f10952a);
        }
    }

    public static final class c extends m0 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC0777n f10954r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ g0 f10955s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ e0 f10956t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ o0 f10957u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC0777n interfaceC0777n, g0 g0Var, e0 e0Var, o0 o0Var) {
            super(interfaceC0777n, g0Var, e0Var, "BackgroundThreadHandoffProducer");
            this.f10954r = interfaceC0777n;
            this.f10955s = g0Var;
            this.f10956t = e0Var;
            this.f10957u = o0Var;
        }

        @Override // M0.e
        protected void b(Object obj) {
        }

        @Override // M0.e
        protected Object c() {
            return null;
        }

        @Override // com.facebook.imagepipeline.producers.m0, M0.e
        protected void f(Object obj) {
            this.f10955s.j(this.f10956t, "BackgroundThreadHandoffProducer", null);
            this.f10957u.c().a(this.f10954r, this.f10956t);
        }
    }

    public o0(d0 d0Var, p0 p0Var) {
        w5.k.f(d0Var, "inputProducer");
        w5.k.f(p0Var, "threadHandoffProducerQueue");
        this.f10950a = d0Var;
        this.f10951b = p0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        w5.k.f(interfaceC0777n, "consumer");
        w5.k.f(e0Var, "context");
        if (!K1.b.d()) {
            g0 g0VarB = e0Var.B();
            a aVar = f10949c;
            if (aVar.d(e0Var)) {
                g0VarB.e(e0Var, "BackgroundThreadHandoffProducer");
                g0VarB.j(e0Var, "BackgroundThreadHandoffProducer", null);
                this.f10950a.a(interfaceC0777n, e0Var);
                return;
            } else {
                c cVar = new c(interfaceC0777n, g0VarB, e0Var, this);
                e0Var.e(new b(cVar, this));
                this.f10951b.b(E1.a.a(cVar, aVar.c(e0Var)));
                return;
            }
        }
        K1.b.a("ThreadHandoffProducer#produceResults");
        try {
            g0 g0VarB2 = e0Var.B();
            a aVar2 = f10949c;
            if (aVar2.d(e0Var)) {
                g0VarB2.e(e0Var, "BackgroundThreadHandoffProducer");
                g0VarB2.j(e0Var, "BackgroundThreadHandoffProducer", null);
                this.f10950a.a(interfaceC0777n, e0Var);
            } else {
                c cVar2 = new c(interfaceC0777n, g0VarB2, e0Var, this);
                e0Var.e(new b(cVar2, this));
                this.f10951b.b(E1.a.a(cVar2, aVar2.c(e0Var)));
                i5.u uVar = i5.u.f19985a;
            }
        } finally {
            K1.b.b();
        }
    }

    public final d0 c() {
        return this.f10950a;
    }

    public final p0 d() {
        return this.f10951b;
    }
}
