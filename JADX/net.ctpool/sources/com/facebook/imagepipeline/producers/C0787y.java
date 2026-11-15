package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0787y extends U {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w1.k f11033f;

    public C0787y(w1.k kVar, boolean z6, d0 d0Var) {
        super(d0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z6);
        this.f11033f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public D1.g g(D1.g gVar) {
        return D1.g.b(gVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f11033f.c(e0Var.d(), e0Var.a()), e0Var.U());
    }
}
