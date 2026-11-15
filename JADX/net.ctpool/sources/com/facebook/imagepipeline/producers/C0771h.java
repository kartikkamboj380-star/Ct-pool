package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0771h extends U {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w1.k f10892f;

    public C0771h(w1.k kVar, d0 d0Var) {
        super(d0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f10892f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public S0.a g(S0.a aVar) {
        return S0.a.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f10892f.a(e0Var.d(), e0Var.a()), e0Var.U());
    }
}
