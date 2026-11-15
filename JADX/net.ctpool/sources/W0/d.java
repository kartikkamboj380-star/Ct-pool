package W0;

import O0.l;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static long a(InputStream inputStream, long j7) throws IOException {
        l.g(inputStream);
        l.b(Boolean.valueOf(j7 >= 0));
        long j8 = j7;
        while (j8 > 0) {
            long jSkip = inputStream.skip(j8);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    return j7 - j8;
                }
                jSkip = 1;
            }
            j8 -= jSkip;
        }
        return j7;
    }
}
