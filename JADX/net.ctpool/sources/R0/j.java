package R0;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class j extends InputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final h f2835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f2836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f2837o;

    public j(h hVar) {
        O0.l.b(Boolean.valueOf(!hVar.isClosed()));
        this.f2835m = (h) O0.l.g(hVar);
        this.f2836n = 0;
        this.f2837o = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f2835m.size() - this.f2836n;
    }

    @Override // java.io.InputStream
    public void mark(int i7) {
        this.f2837o = this.f2836n;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        h hVar = this.f2835m;
        int i7 = this.f2836n;
        this.f2836n = i7 + 1;
        return hVar.k(i7) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f2836n = this.f2837o;
    }

    @Override // java.io.InputStream
    public long skip(long j7) {
        O0.l.b(Boolean.valueOf(j7 >= 0));
        int iMin = Math.min((int) j7, available());
        this.f2836n += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) {
        if (i7 < 0 || i8 < 0 || i7 + i8 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i7 + "; regionLength=" + i8);
        }
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (i8 <= 0) {
            return 0;
        }
        int iMin = Math.min(iAvailable, i8);
        this.f2835m.m(this.f2836n, bArr, i7, iMin);
        this.f2836n += iMin;
        return iMin;
    }
}
