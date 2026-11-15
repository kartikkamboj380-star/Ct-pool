package com.facebook.imagepipeline.producers;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends M0.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0777n f10943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final g0 f10944o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e0 f10945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f10946q;

    public m0(InterfaceC0777n interfaceC0777n, g0 g0Var, e0 e0Var, String str) {
        w5.k.f(interfaceC0777n, "consumer");
        w5.k.f(g0Var, "producerListener");
        w5.k.f(e0Var, "producerContext");
        w5.k.f(str, "producerName");
        this.f10943n = interfaceC0777n;
        this.f10944o = g0Var;
        this.f10945p = e0Var;
        this.f10946q = str;
        g0Var.e(e0Var, str);
    }

    @Override // M0.e
    protected void d() {
        g0 g0Var = this.f10944o;
        e0 e0Var = this.f10945p;
        String str = this.f10946q;
        g0Var.d(e0Var, str, g0Var.g(e0Var, str) ? g() : null);
        this.f10943n.b();
    }

    @Override // M0.e
    protected void e(Exception exc) {
        w5.k.f(exc, "e");
        g0 g0Var = this.f10944o;
        e0 e0Var = this.f10945p;
        String str = this.f10946q;
        g0Var.k(e0Var, str, exc, g0Var.g(e0Var, str) ? h(exc) : null);
        this.f10943n.a(exc);
    }

    @Override // M0.e
    protected void f(Object obj) {
        g0 g0Var = this.f10944o;
        e0 e0Var = this.f10945p;
        String str = this.f10946q;
        g0Var.j(e0Var, str, g0Var.g(e0Var, str) ? i(obj) : null);
        this.f10943n.d(obj, 1);
    }

    protected Map g() {
        return null;
    }

    protected Map h(Exception exc) {
        return null;
    }

    protected Map i(Object obj) {
        return null;
    }
}
