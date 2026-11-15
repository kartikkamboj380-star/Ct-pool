package com.google.firebase.installations;

import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f17486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2273m f17487b;

    public e(i iVar, C2273m c2273m) {
        this.f17486a = iVar;
        this.f17487b = c2273m;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(F4.d dVar) {
        if (!dVar.k() || this.f17486a.f(dVar)) {
            return false;
        }
        this.f17487b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        this.f17487b.d(exc);
        return true;
    }
}
