package Z;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f4616a = new f();

    private f() {
    }

    public static final List a(Cursor cursor) {
        w5.k.f(cursor, "cursor");
        List<Uri> notificationUris = cursor.getNotificationUris();
        w5.k.c(notificationUris);
        return notificationUris;
    }

    public static final void b(Cursor cursor, ContentResolver contentResolver, List list) {
        w5.k.f(cursor, "cursor");
        w5.k.f(contentResolver, "cr");
        w5.k.f(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
