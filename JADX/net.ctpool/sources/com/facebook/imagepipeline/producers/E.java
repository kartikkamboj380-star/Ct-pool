package com.facebook.imagepipeline.producers;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class E implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f10742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g0 f10743b;

    public E(h0 h0Var, g0 g0Var) {
        this.f10742a = h0Var;
        this.f10743b = g0Var;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void a(e0 e0Var, String str, String str2) {
        w5.k.f(e0Var, "context");
        h0 h0Var = this.f10742a;
        if (h0Var != null) {
            h0Var.h(e0Var.getId(), str, str2);
        }
        g0 g0Var = this.f10743b;
        if (g0Var != null) {
            g0Var.a(e0Var, str, str2);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void c(e0 e0Var, String str, boolean z6) {
        w5.k.f(e0Var, "context");
        h0 h0Var = this.f10742a;
        if (h0Var != null) {
            h0Var.c(e0Var.getId(), str, z6);
        }
        g0 g0Var = this.f10743b;
        if (g0Var != null) {
            g0Var.c(e0Var, str, z6);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void d(e0 e0Var, String str, Map map) {
        w5.k.f(e0Var, "context");
        h0 h0Var = this.f10742a;
        if (h0Var != null) {
            h0Var.b(e0Var.getId(), str, map);
        }
        g0 g0Var = this.f10743b;
        if (g0Var != null) {
            g0Var.d(e0Var, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void e(e0 e0Var, String str) {
        w5.k.f(e0Var, "context");
        h0 h0Var = this.f10742a;
        if (h0Var != null) {
            h0Var.a(e0Var.getId(), str);
        }
        g0 g0Var = this.f10743b;
        if (g0Var != null) {
            g0Var.e(e0Var, str);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public boolean g(e0 e0Var, String str) {
        w5.k.f(e0Var, "context");
        h0 h0Var = this.f10742a;
        Boolean boolValueOf = h0Var != null ? Boolean.valueOf(h0Var.g(e0Var.getId())) : null;
        if (!w5.k.b(boolValueOf, Boolean.TRUE)) {
            g0 g0Var = this.f10743b;
            boolValueOf = g0Var != null ? Boolean.valueOf(g0Var.g(e0Var, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void j(e0 e0Var, String str, Map map) {
        w5.k.f(e0Var, "context");
        h0 h0Var = this.f10742a;
        if (h0Var != null) {
            h0Var.i(e0Var.getId(), str, map);
        }
        g0 g0Var = this.f10743b;
        if (g0Var != null) {
            g0Var.j(e0Var, str, map);
        }
    }

    @Override // com.facebook.imagepipeline.producers.g0
    public void k(e0 e0Var, String str, Throwable th, Map map) {
        w5.k.f(e0Var, "context");
        h0 h0Var = this.f10742a;
        if (h0Var != null) {
            h0Var.j(e0Var.getId(), str, th, map);
        }
        g0 g0Var = this.f10743b;
        if (g0Var != null) {
            g0Var.k(e0Var, str, th, map);
        }
    }
}
