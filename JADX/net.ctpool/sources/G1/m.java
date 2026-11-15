package G1;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class m implements w, Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f1212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f1213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f1214o = System.identityHashCode(this);

    public m(int i7) {
        this.f1212m = ByteBuffer.allocateDirect(i7);
        this.f1213n = i7;
    }

    private void a(int i7, w wVar, int i8, int i9) {
        if (!(wVar instanceof m)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        O0.l.i(!isClosed());
        O0.l.i(!wVar.isClosed());
        O0.l.g(this.f1212m);
        x.b(i7, wVar.n(), i8, i9, this.f1213n);
        this.f1212m.position(i7);
        ByteBuffer byteBuffer = (ByteBuffer) O0.l.g(wVar.B());
        byteBuffer.position(i8);
        byte[] bArr = new byte[i9];
        this.f1212m.get(bArr, 0, i9);
        byteBuffer.put(bArr, 0, i9);
    }

    @Override // G1.w
    public synchronized ByteBuffer B() {
        return this.f1212m;
    }

    @Override // G1.w
    public long J() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // G1.w, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f1212m = null;
    }

    @Override // G1.w
    public synchronized boolean isClosed() {
        return this.f1212m == null;
    }

    @Override // G1.w
    public synchronized byte k(int i7) {
        O0.l.i(!isClosed());
        O0.l.b(Boolean.valueOf(i7 >= 0));
        O0.l.b(Boolean.valueOf(i7 < this.f1213n));
        O0.l.g(this.f1212m);
        return this.f1212m.get(i7);
    }

    @Override // G1.w
    public synchronized int m(int i7, byte[] bArr, int i8, int i9) {
        int iA;
        O0.l.g(bArr);
        O0.l.i(!isClosed());
        O0.l.g(this.f1212m);
        iA = x.a(i7, i9, this.f1213n);
        x.b(i7, bArr.length, i8, iA, this.f1213n);
        this.f1212m.position(i7);
        this.f1212m.get(bArr, i8, iA);
        return iA;
    }

    @Override // G1.w
    public int n() {
        return this.f1213n;
    }

    @Override // G1.w
    public long o() {
        return this.f1214o;
    }

    @Override // G1.w
    public void w(int i7, w wVar, int i8, int i9) {
        O0.l.g(wVar);
        if (wVar.o() == o()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(o()) + " to BufferMemoryChunk " + Long.toHexString(wVar.o()) + " which are the same ");
            O0.l.b(Boolean.FALSE);
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
        O0.l.g(bArr);
        O0.l.i(!isClosed());
        O0.l.g(this.f1212m);
        iA = x.a(i7, i9, this.f1213n);
        x.b(i7, bArr.length, i8, iA, this.f1213n);
        this.f1212m.position(i7);
        this.f1212m.put(bArr, i8, iA);
        return iA;
    }
}
