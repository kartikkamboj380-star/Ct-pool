package com.facebook.imagepipeline.producers;

import x1.C2215f;

/* JADX INFO: loaded from: classes.dex */
public class t0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0[] f11005a;

    private class a extends AbstractC0782t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f11006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f11007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final C2215f f11008e;

        public a(InterfaceC0777n interfaceC0777n, e0 e0Var, int i7) {
            super(interfaceC0777n);
            this.f11006c = e0Var;
            this.f11007d = i7;
            this.f11008e = e0Var.d().q();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC0782t, com.facebook.imagepipeline.producers.AbstractC0766c
        protected void h(Throwable th) {
            if (t0.this.e(this.f11007d + 1, p(), this.f11006c)) {
                return;
            }
            p().a(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC0766c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(D1.g gVar, int i7) {
            if (gVar != null && (AbstractC0766c.f(i7) || v0.c(gVar, this.f11008e))) {
                p().d(gVar, i7);
            } else if (AbstractC0766c.e(i7)) {
                D1.g.d(gVar);
                if (t0.this.e(this.f11007d + 1, p(), this.f11006c)) {
                    return;
                }
                p().d(null, 1);
            }
        }
    }

    public t0(u0... u0VarArr) {
        u0[] u0VarArr2 = (u0[]) O0.l.g(u0VarArr);
        this.f11005a = u0VarArr2;
        O0.l.e(0, u0VarArr2.length);
    }

    private int d(int i7, C2215f c2215f) {
        while (true) {
            u0[] u0VarArr = this.f11005a;
            if (i7 >= u0VarArr.length) {
                return -1;
            }
            if (u0VarArr[i7].b(c2215f)) {
                return i7;
            }
            i7++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i7, InterfaceC0777n interfaceC0777n, e0 e0Var) {
        int iD = d(i7, e0Var.d().q());
        if (iD == -1) {
            return false;
        }
        this.f11005a[iD].a(new a(interfaceC0777n, e0Var, iD), e0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        if (e0Var.d().q() != null && e(0, interfaceC0777n, e0Var)) {
            return;
        }
        interfaceC0777n.d(null, 1);
    }
}
