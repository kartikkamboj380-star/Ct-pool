package U2;

import android.content.Context;
import c3.InterfaceC0717d;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
abstract class v implements Closeable {

    interface a {
        v a();

        a b(Context context);
    }

    v() {
    }

    abstract InterfaceC0717d a();

    abstract u b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
