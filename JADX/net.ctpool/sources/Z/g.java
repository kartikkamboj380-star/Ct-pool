package Z;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface g extends Closeable {
    k E(String str);

    String F0();

    Cursor I(j jVar, CancellationSignal cancellationSignal);

    boolean I0();

    boolean N0();

    Cursor Q(j jVar);

    void d0();

    void e0(String str, Object[] objArr);

    void f0();

    int g0(String str, int i7, ContentValues contentValues, String str2, Object[] objArr);

    boolean isOpen();

    Cursor o0(String str);

    void q();

    List s();

    void s0();

    void u(String str);
}
