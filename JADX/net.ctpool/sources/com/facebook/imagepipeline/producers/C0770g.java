package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0770g extends C0772i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10891d = new a(null);

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770g(w1.x xVar, w1.k kVar, d0 d0Var) {
        super(xVar, kVar, d0Var);
        w5.k.f(xVar, "memoryCache");
        w5.k.f(kVar, "cacheKeyFactory");
        w5.k.f(d0Var, "inputProducer");
    }

    @Override // com.facebook.imagepipeline.producers.C0772i
    protected String d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C0772i
    protected String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C0772i
    protected InterfaceC0777n g(InterfaceC0777n interfaceC0777n, I0.d dVar, boolean z6) {
        w5.k.f(interfaceC0777n, "consumer");
        w5.k.f(dVar, "cacheKey");
        return interfaceC0777n;
    }
}
