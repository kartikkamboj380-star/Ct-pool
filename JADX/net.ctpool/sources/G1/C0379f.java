package G1;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: G1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0379f implements w, Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SharedMemory f1191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ByteBuffer f1192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f1193o;

    public C0379f(int i7) {
        O0.l.b(Boolean.valueOf(i7 > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i7);
            this.f1191m = sharedMemoryCreate;
            this.f1192n = sharedMemoryCreate.mapReadWrite();
            this.f1193o = System.identityHashCode(this);
        } catch (ErrnoException e7) {
            throw new RuntimeException("Fail to create AshmemMemory", e7);
        }
    }

    private void a(int i7, w wVar, int i8, int i9) {
        if (!(wVar instanceof C0379f)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        O0.l.i(!isClosed());
        O0.l.i(!wVar.isClosed());
        O0.l.g(this.f1192n);
        O0.l.g(wVar.B());
        x.b(i7, wVar.n(), i8, i9, n());
        this.f1192n.position(i7);
        wVar.B().position(i8);
        byte[] bArr = new byte[i9];
        this.f1192n.get(bArr, 0, i9);
        wVar.B().put(bArr, 0, i9);
    }

    @Override // G1.w
    public ByteBuffer B() {
        return this.f1192n;
    }

    @Override // G1.w
    public long J() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // G1.w, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f1191m;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f1192n;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f1192n = null;
                this.f1191m = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // G1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isClosed() {
        boolean z6;
        if (this.f1192n != null) {
            z6 = this.f1191m == null;
        }
        return z6;
    }

    @Override // G1.w
    public synchronized byte k(int i7) {
        O0.l.i(!isClosed());
        O0.l.b(Boolean.valueOf(i7 >= 0));
        O0.l.b(Boolean.valueOf(i7 < n()));
        O0.l.g(this.f1192n);
        return this.f1192n.get(i7);
    }

    @Override // G1.w
    public synchronized int m(int i7, byte[] bArr, int i8, int i9) {
        int iA;
        O0.l.g(bArr);
        O0.l.g(this.f1192n);
        iA = x.a(i7, i9, n());
        x.b(i7, bArr.length, i8, iA, n());
        this.f1192n.position(i7);
        this.f1192n.get(bArr, i8, iA);
        return iA;
    }

    @Override // G1.w
    public int n() {
        O0.l.g(this.f1191m);
        return this.f1191m.getSize();
    }

    @Override // G1.w
    public long o() {
        return this.f1193o;
    }

    @Override // G1.w
    public void w(int i7, w wVar, int i8, int i9) {
        O0.l.g(wVar);
        if (wVar.o() == o()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(o()) + " to AshmemMemoryChunk " + Long.toHexString(wVar.o()) + " which are the same ");
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
        O0.l.g(this.f1192n);
        iA = x.a(i7, i9, n());
        x.b(i7, bArr.length, i8, iA, n());
        this.f1192n.position(i7);
        this.f1192n.put(bArr, i8, iA);
        return iA;
    }
}
