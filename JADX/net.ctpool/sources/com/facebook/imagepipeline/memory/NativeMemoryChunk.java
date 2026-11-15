package com.facebook.imagepipeline.memory;

import G1.w;
import G1.x;
import O0.l;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@O0.d
public class NativeMemoryChunk implements w, Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f10671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f10672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10673o;

    static {
        N2.a.d("imagepipeline");
    }

    public NativeMemoryChunk() {
        this.f10672n = 0;
        this.f10671m = 0L;
        this.f10673o = true;
    }

    private void a(int i7, w wVar, int i8, int i9) {
        if (!(wVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        l.i(!isClosed());
        l.i(!wVar.isClosed());
        x.b(i7, wVar.n(), i8, i9, this.f10672n);
        nativeMemcpy(wVar.J() + ((long) i8), this.f10671m + ((long) i7), i9);
    }

    @O0.d
    private static native long nativeAllocate(int i7);

    @O0.d
    private static native void nativeCopyFromByteArray(long j7, byte[] bArr, int i7, int i8);

    @O0.d
    private static native void nativeCopyToByteArray(long j7, byte[] bArr, int i7, int i8);

    @O0.d
    private static native void nativeFree(long j7);

    @O0.d
    private static native void nativeMemcpy(long j7, long j8, int i7);

    @O0.d
    private static native byte nativeReadByte(long j7);

    @Override // G1.w
    public ByteBuffer B() {
        return null;
    }

    @Override // G1.w
    public long J() {
        return this.f10671m;
    }

    @Override // G1.w, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f10673o) {
            this.f10673o = true;
            nativeFree(this.f10671m);
        }
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // G1.w
    public synchronized boolean isClosed() {
        return this.f10673o;
    }

    @Override // G1.w
    public synchronized byte k(int i7) {
        l.i(!isClosed());
        l.b(Boolean.valueOf(i7 >= 0));
        l.b(Boolean.valueOf(i7 < this.f10672n));
        return nativeReadByte(this.f10671m + ((long) i7));
    }

    @Override // G1.w
    public synchronized int m(int i7, byte[] bArr, int i8, int i9) {
        int iA;
        l.g(bArr);
        l.i(!isClosed());
        iA = x.a(i7, i9, this.f10672n);
        x.b(i7, bArr.length, i8, iA, this.f10672n);
        nativeCopyToByteArray(this.f10671m + ((long) i7), bArr, i8, iA);
        return iA;
    }

    @Override // G1.w
    public int n() {
        return this.f10672n;
    }

    @Override // G1.w
    public long o() {
        return this.f10671m;
    }

    @Override // G1.w
    public void w(int i7, w wVar, int i8, int i9) {
        l.g(wVar);
        if (wVar.o() == o()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(wVar)) + " which share the same address " + Long.toHexString(this.f10671m));
            l.b(Boolean.FALSE);
        }
        if (wVar.o() < o()) {
            synchronized (wVar) {
                synchronized (this) {
                    a(i7, wVar, i8, i9);
                }
            }
        } else {
            synchronized (this) {
                synchronized (wVar) {
                    a(i7, wVar, i8, i9);
                }
            }
        }
    }

    @Override // G1.w
    public synchronized int z(int i7, byte[] bArr, int i8, int i9) {
        int iA;
        l.g(bArr);
        l.i(!isClosed());
        iA = x.a(i7, i9, this.f10672n);
        x.b(i7, bArr.length, i8, iA, this.f10672n);
        nativeCopyFromByteArray(this.f10671m + ((long) i7), bArr, i8, iA);
        return iA;
    }

    public NativeMemoryChunk(int i7) {
        l.b(Boolean.valueOf(i7 > 0));
        this.f10672n = i7;
        this.f10671m = nativeAllocate(i7);
        this.f10673o = false;
    }
}
