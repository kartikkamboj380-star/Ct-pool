package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class M extends L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10792c = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Executor executor, R0.i iVar) {
        super(executor, iVar);
        w5.k.f(executor, "executor");
        w5.k.f(iVar, "pooledByteBufferFactory");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected D1.g d(J1.b bVar) {
        w5.k.f(bVar, "imageRequest");
        return e(new FileInputStream(bVar.t().toString()), (int) bVar.t().length());
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalFileFetchProducer";
    }
}
