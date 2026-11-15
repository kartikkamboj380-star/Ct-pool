package O0;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class c extends FilterOutputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f2452m;

    public c(OutputStream outputStream) {
        super(outputStream);
        this.f2452m = 0L;
    }

    public long a() {
        return this.f2452m;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i7) throws IOException {
        ((FilterOutputStream) this).out.write(i7);
        this.f2452m++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i7, int i8) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i7, i8);
        this.f2452m += (long) i8;
    }
}
