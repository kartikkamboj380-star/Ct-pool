package S5;

import android.content.Context;
import app.notifee.core.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f2956a;

    public static void a(Context context) {
        Logger.d("context", "received application context");
        f2956a = context;
    }
}
