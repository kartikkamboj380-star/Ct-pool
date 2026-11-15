package X;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final void a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        k.f(readableByteChannel, "input");
        k.f(fileChannel, "output");
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
