package R0;

import O0.q;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends OutputStream {
    public abstract h a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e7) {
            q.a(e7);
        }
    }

    public abstract int size();
}
