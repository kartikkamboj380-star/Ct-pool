package com.google.firebase.installations;

import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C2273m f17488a;

    public f(C2273m c2273m) {
        this.f17488a = c2273m;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(F4.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f17488a.e(dVar.d());
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(Exception exc) {
        return false;
    }
}
