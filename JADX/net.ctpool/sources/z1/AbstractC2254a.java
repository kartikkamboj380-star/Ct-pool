package z1;

import O0.l;
import com.facebook.imagepipeline.producers.AbstractC0766c;
import com.facebook.imagepipeline.producers.InterfaceC0777n;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import i5.u;
import java.util.Map;
import w5.k;

/* JADX INFO: renamed from: z1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2254a extends Y0.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l0 f23246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F1.d f23247i;

    /* JADX INFO: renamed from: z1.a$a, reason: collision with other inner class name */
    public static final class C0332a extends AbstractC0766c {
        C0332a() {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        protected void g() {
            AbstractC2254a.this.D();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        protected void h(Throwable th) {
            k.f(th, "throwable");
            AbstractC2254a.this.E(th);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        protected void i(Object obj, int i7) {
            AbstractC2254a abstractC2254a = AbstractC2254a.this;
            abstractC2254a.F(obj, i7, abstractC2254a.C());
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        protected void j(float f7) {
            AbstractC2254a.this.s(f7);
        }
    }

    protected AbstractC2254a(d0 d0Var, l0 l0Var, F1.d dVar) {
        k.f(d0Var, "producer");
        k.f(l0Var, "settableProducerContext");
        k.f(dVar, "requestListener");
        this.f23246h = l0Var;
        this.f23247i = dVar;
        if (K1.b.d()) {
            K1.b.a("AbstractProducerToDataSourceAdapter()");
            try {
                o(l0Var.getExtras());
                if (K1.b.d()) {
                    K1.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                    try {
                        dVar.b(l0Var);
                        u uVar = u.f19985a;
                        K1.b.b();
                    } finally {
                    }
                } else {
                    dVar.b(l0Var);
                }
                if (K1.b.d()) {
                    K1.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                    try {
                        d0Var.a(A(), l0Var);
                        u uVar2 = u.f19985a;
                        K1.b.b();
                    } finally {
                    }
                } else {
                    d0Var.a(A(), l0Var);
                }
                u uVar3 = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            o(l0Var.getExtras());
            if (K1.b.d()) {
                K1.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    dVar.b(l0Var);
                    u uVar4 = u.f19985a;
                } finally {
                }
            } else {
                dVar.b(l0Var);
            }
            if (!K1.b.d()) {
                d0Var.a(A(), l0Var);
                return;
            }
            K1.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                d0Var.a(A(), l0Var);
                u uVar5 = u.f19985a;
            } finally {
            }
        }
    }

    private final InterfaceC0777n A() {
        return new C0332a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void D() {
        l.i(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Throwable th) {
        if (super.q(th, B(this.f23246h))) {
            this.f23247i.h(this.f23246h, th);
        }
    }

    protected final Map B(e0 e0Var) {
        k.f(e0Var, "producerContext");
        return e0Var.getExtras();
    }

    public final l0 C() {
        return this.f23246h;
    }

    protected void F(Object obj, int i7, e0 e0Var) {
        k.f(e0Var, "producerContext");
        boolean zE = AbstractC0766c.e(i7);
        if (super.u(obj, zE, B(e0Var)) && zE) {
            this.f23247i.f(this.f23246h);
        }
    }

    @Override // Y0.a, Y0.c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.b()) {
            return true;
        }
        this.f23247i.i(this.f23246h);
        this.f23246h.m();
        return true;
    }
}
