package app.notifee.core;

import S5.f;
import android.util.Log;
import app.notifee.core.event.LogEvent;

/* JADX INFO: loaded from: classes.dex */
public class Logger {
    public static String a(String str, String str2) {
        return "(" + str + "): " + str2;
    }

    @KeepForSdk
    public static void d(String str, String str2) {
        Log.d("NOTIFEE", a(str, str2));
    }

    @KeepForSdk
    public static void e(String str, String str2) {
        Log.e("NOTIFEE", a(str, str2));
        f.a(new LogEvent(LogEvent.LEVEL_ERROR, str, str2));
    }

    @KeepForSdk
    public static void i(String str, String str2) {
        Log.i("NOTIFEE", a(str, str2));
    }

    @KeepForSdk
    public static void v(String str, String str2) {
        Log.v("NOTIFEE", a(str, str2));
    }

    @KeepForSdk
    public static void w(String str, String str2) {
        Log.w("NOTIFEE", a(str, str2));
    }

    @KeepForSdk
    public static void e(String str, String str2, Exception exc) {
        Log.e("NOTIFEE", a(str, str2), exc);
        f.a(new LogEvent(LogEvent.LEVEL_ERROR, str, str2, exc));
    }

    @KeepForSdk
    public static void e(String str, String str2, Throwable th) {
        Log.e("NOTIFEE", a(str, str2), th);
        f.a(new LogEvent(LogEvent.LEVEL_ERROR, str, str2, th));
    }
}
