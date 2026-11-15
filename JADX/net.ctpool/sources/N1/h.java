package N1;

import java.io.IOException;
import java.io.InputStream;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f2136a = new h();

    private h() {
    }

    public static final int a(InputStream inputStream, int i7, boolean z6) throws IOException {
        int i8;
        k.f(inputStream, "stream");
        int i9 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = inputStream.read();
            if (i11 == -1) {
                throw new IOException("no more bytes");
            }
            if (z6) {
                i8 = (i11 & 255) << (i10 * 8);
            } else {
                i9 <<= 8;
                i8 = i11 & 255;
            }
            i9 |= i8;
        }
        return i9;
    }
}
