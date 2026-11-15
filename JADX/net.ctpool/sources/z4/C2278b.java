package z4;

import java.io.OutputStream;

/* JADX INFO: renamed from: z4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C2278b extends OutputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23316m = 0;

    C2278b() {
    }

    long a() {
        return this.f23316m;
    }

    @Override // java.io.OutputStream
    public void write(int i7) {
        this.f23316m++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f23316m += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 < 0 || i7 > bArr.length || i8 < 0 || (i9 = i7 + i8) > bArr.length || i9 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f23316m += (long) i8;
    }
}
