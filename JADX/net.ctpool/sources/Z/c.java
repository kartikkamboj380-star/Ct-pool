package Z;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f4613a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        w5.k.f(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        w5.k.e(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        w5.k.f(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
