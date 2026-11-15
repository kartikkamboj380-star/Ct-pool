package io.invertase.firebase.app;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f20099a;

    public static Context a() {
        return f20099a;
    }

    public static void b(Context context) {
        Log.d("ReactNativeFirebaseApp", "received application context.");
        f20099a = context;
    }
}
