package i6;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes2.dex */
public interface A extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    D i();

    void w0(f fVar, long j7);
}
