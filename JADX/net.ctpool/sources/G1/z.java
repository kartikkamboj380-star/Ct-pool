package G1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class z implements R0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.e f1232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0.l f1233b;

    public z(com.facebook.imagepipeline.memory.e eVar, R0.l lVar) {
        w5.k.f(eVar, "pool");
        w5.k.f(lVar, "pooledByteStreams");
        this.f1232a = eVar;
        this.f1233b = lVar;
    }

    public final y f(InputStream inputStream, com.facebook.imagepipeline.memory.f fVar) {
        w5.k.f(inputStream, "inputStream");
        w5.k.f(fVar, "outputStream");
        this.f1233b.a(inputStream, fVar);
        return fVar.a();
    }

    @Override // R0.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public y c(InputStream inputStream) throws Throwable {
        w5.k.f(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.f fVar = new com.facebook.imagepipeline.memory.f(this.f1232a, 0, 2, null);
        try {
            return f(inputStream, fVar);
        } finally {
            fVar.close();
        }
    }

    @Override // R0.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public y d(InputStream inputStream, int i7) throws Throwable {
        w5.k.f(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.f fVar = new com.facebook.imagepipeline.memory.f(this.f1232a, i7);
        try {
            return f(inputStream, fVar);
        } finally {
            fVar.close();
        }
    }

    @Override // R0.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public y b(byte[] bArr) throws Throwable {
        w5.k.f(bArr, "bytes");
        com.facebook.imagepipeline.memory.f fVar = new com.facebook.imagepipeline.memory.f(this.f1232a, bArr.length);
        try {
            try {
                fVar.write(bArr, 0, bArr.length);
                return fVar.a();
            } catch (IOException e7) {
                RuntimeException runtimeExceptionA = O0.q.a(e7);
                w5.k.e(runtimeExceptionA, "propagate(ioe)");
                throw runtimeExceptionA;
            }
        } finally {
            fVar.close();
        }
    }

    @Override // R0.i
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.f a() {
        return new com.facebook.imagepipeline.memory.f(this.f1232a, 0, 2, null);
    }

    @Override // R0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.f e(int i7) {
        return new com.facebook.imagepipeline.memory.f(this.f1232a, i7);
    }
}
