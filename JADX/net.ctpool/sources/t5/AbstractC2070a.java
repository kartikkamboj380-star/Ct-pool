package t5;

import i5.AbstractC1744a;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: t5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2070a {
    public static final void a(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1744a.a(th, th2);
            }
        }
    }
}
