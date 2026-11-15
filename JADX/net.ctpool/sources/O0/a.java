package O0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        l.g(inputStream);
        l.g(outputStream);
        byte[] bArr = new byte[4096];
        long j7 = 0;
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return j7;
            }
            outputStream.write(bArr, 0, i7);
            j7 += (long) i7;
        }
    }

    public static int b(InputStream inputStream, byte[] bArr, int i7, int i8) throws IOException {
        l.g(inputStream);
        l.g(bArr);
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int i9 = 0;
        while (i9 < i8) {
            int i10 = inputStream.read(bArr, i7 + i9, i8 - i9);
            if (i10 == -1) {
                break;
            }
            i9 += i10;
        }
        return i9;
    }
}
