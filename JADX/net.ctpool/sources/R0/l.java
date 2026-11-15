package R0;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f2839b;

    public l(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = (byte[]) this.f2839b.get(this.f2838a);
        long j7 = 0;
        while (true) {
            try {
                int i7 = inputStream.read(bArr, 0, this.f2838a);
                if (i7 == -1) {
                    return j7;
                }
                outputStream.write(bArr, 0, i7);
                j7 += (long) i7;
            } finally {
                this.f2839b.a(bArr);
            }
        }
    }

    public l(a aVar, int i7) {
        O0.l.b(Boolean.valueOf(i7 > 0));
        this.f2838a = i7;
        this.f2839b = aVar;
    }
}
