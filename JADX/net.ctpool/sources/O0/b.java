package O0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Logger f2451a = Logger.getLogger(b.class.getName());

    public static void a(Closeable closeable, boolean z6) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e7) {
            if (!z6) {
                throw e7;
            }
            f2451a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e7);
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
