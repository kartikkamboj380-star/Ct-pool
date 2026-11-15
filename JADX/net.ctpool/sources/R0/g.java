package R0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class g extends InputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InputStream f2829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f2830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final S0.g f2831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2832p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2833q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f2834r = false;

    public g(InputStream inputStream, byte[] bArr, S0.g gVar) {
        this.f2829m = (InputStream) O0.l.g(inputStream);
        this.f2830n = (byte[]) O0.l.g(bArr);
        this.f2831o = (S0.g) O0.l.g(gVar);
    }

    private boolean a() throws IOException {
        if (this.f2833q < this.f2832p) {
            return true;
        }
        int i7 = this.f2829m.read(this.f2830n);
        if (i7 <= 0) {
            return false;
        }
        this.f2832p = i7;
        this.f2833q = 0;
        return true;
    }

    private void b() throws IOException {
        if (this.f2834r) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        O0.l.i(this.f2833q <= this.f2832p);
        b();
        return (this.f2832p - this.f2833q) + this.f2829m.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2834r) {
            return;
        }
        this.f2834r = true;
        this.f2831o.a(this.f2830n);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f2834r) {
            P0.a.j("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        O0.l.i(this.f2833q <= this.f2832p);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f2830n;
        int i7 = this.f2833q;
        this.f2833q = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j7) throws IOException {
        O0.l.i(this.f2833q <= this.f2832p);
        b();
        int i7 = this.f2832p;
        int i8 = this.f2833q;
        long j8 = i7 - i8;
        if (j8 >= j7) {
            this.f2833q = (int) (((long) i8) + j7);
            return j7;
        }
        this.f2833q = i7;
        return j8 + this.f2829m.skip(j7 - j8);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) throws IOException {
        O0.l.i(this.f2833q <= this.f2832p);
        b();
        if (!a()) {
            return -1;
        }
        int iMin = Math.min(this.f2832p - this.f2833q, i8);
        System.arraycopy(this.f2830n, this.f2833q, bArr, i7, iMin);
        this.f2833q += iMin;
        return iMin;
    }
}
