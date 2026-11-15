package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public final class F extends E implements F1.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F1.e f10744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F1.d f10745d;

    public F(F1.e eVar, F1.d dVar) {
        super(eVar, dVar);
        this.f10744c = eVar;
        this.f10745d = dVar;
    }

    @Override // F1.d
    public void b(e0 e0Var) {
        w5.k.f(e0Var, "producerContext");
        F1.e eVar = this.f10744c;
        if (eVar != null) {
            eVar.f(e0Var.d(), e0Var.a(), e0Var.getId(), e0Var.l());
        }
        F1.d dVar = this.f10745d;
        if (dVar != null) {
            dVar.b(e0Var);
        }
    }

    @Override // F1.d
    public void f(e0 e0Var) {
        w5.k.f(e0Var, "producerContext");
        F1.e eVar = this.f10744c;
        if (eVar != null) {
            eVar.e(e0Var.d(), e0Var.getId(), e0Var.l());
        }
        F1.d dVar = this.f10745d;
        if (dVar != null) {
            dVar.f(e0Var);
        }
    }

    @Override // F1.d
    public void h(e0 e0Var, Throwable th) {
        w5.k.f(e0Var, "producerContext");
        F1.e eVar = this.f10744c;
        if (eVar != null) {
            eVar.d(e0Var.d(), e0Var.getId(), th, e0Var.l());
        }
        F1.d dVar = this.f10745d;
        if (dVar != null) {
            dVar.h(e0Var, th);
        }
    }

    @Override // F1.d
    public void i(e0 e0Var) {
        w5.k.f(e0Var, "producerContext");
        F1.e eVar = this.f10744c;
        if (eVar != null) {
            eVar.k(e0Var.getId());
        }
        F1.d dVar = this.f10745d;
        if (dVar != null) {
            dVar.i(e0Var);
        }
    }
}
