package U0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class a extends FilterInputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f3735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f3736n;

    public a(InputStream inputStream, int i7) {
        super(inputStream);
        inputStream.getClass();
        if (i7 < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f3735m = i7;
        this.f3736n = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f3735m);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i7) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i7);
            this.f3736n = this.f3735m;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f3735m == 0) {
            return -1;
        }
        int i7 = ((FilterInputStream) this).in.read();
        if (i7 != -1) {
            this.f3735m--;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f3736n == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f3735m = this.f3736n;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j7) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j7, this.f3735m));
        this.f3735m = (int) (((long) this.f3735m) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.f3735m;
        if (i9 == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read(bArr, i7, Math.min(i8, i9));
        if (i10 > 0) {
            this.f3735m -= i10;
        }
        return i10;
    }
}
