package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10899d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f10900c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, R0.i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        w5.k.f(executor, "executor");
        w5.k.f(iVar, "pooledByteBufferFactory");
        w5.k.f(contentResolver, "contentResolver");
        this.f10900c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected D1.g d(J1.b bVar) throws FileNotFoundException {
        w5.k.f(bVar, "imageRequest");
        InputStream inputStreamOpenInputStream = this.f10900c.openInputStream(bVar.u());
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream".toString());
        }
        D1.g gVarE = e(inputStreamOpenInputStream, -1);
        w5.k.e(gVarE, "getEncodedImage(\n       …mage.UNKNOWN_STREAM_SIZE)");
        return gVarE;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}
