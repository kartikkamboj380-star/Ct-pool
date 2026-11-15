package U0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class b extends FilterInputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final byte[] f3737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f3738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f3739o;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.f3737m = bArr;
    }

    private int a() {
        int i7 = this.f3738n;
        byte[] bArr = this.f3737m;
        if (i7 >= bArr.length) {
            return -1;
        }
        this.f3738n = i7 + 1;
        return bArr[i7] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i7) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i7);
            this.f3739o = this.f3738n;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i7 = ((FilterInputStream) this).in.read();
        return i7 != -1 ? i7 : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f3738n = this.f3739o;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = ((FilterInputStream) this).in.read(bArr, i7, i8);
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        if (i8 == 0) {
            return 0;
        }
        while (i10 < i8) {
            int iA = a();
            if (iA == -1) {
                break;
            }
            bArr[i7 + i10] = (byte) iA;
            i10++;
        }
        if (i10 > 0) {
            return i10;
        }
        return -1;
    }
}
