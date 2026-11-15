package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.core.os.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.core.content.a$a, reason: collision with other inner class name */
    static class C0134a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, androidx.core.os.e eVar) throws Exception {
        Object objB;
        if (eVar != null) {
            try {
                objB = eVar.b();
            } catch (Exception e7) {
                if (e7 instanceof OperationCanceledException) {
                    throw new l();
                }
                throw e7;
            }
        } else {
            objB = null;
        }
        return C0134a.a(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) objB);
    }
}
