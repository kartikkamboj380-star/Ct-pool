package R0;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface h extends Closeable {

    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    boolean isClosed();

    byte k(int i7);

    int m(int i7, byte[] bArr, int i8, int i9);

    int size();
}
