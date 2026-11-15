package E2;

import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.util.RCTLog;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1033a = new c();

    private c() {
    }

    public static final void a(String str) {
        k.f(str, "message");
        P0.a.j("ReactNative", str);
    }

    private final String b(int i7) {
        return (i7 == 2 || i7 == 3) ? "log" : (i7 == 4 || i7 == 5) ? LogEvent.LEVEL_WARN : i7 != 6 ? "none" : LogEvent.LEVEL_ERROR;
    }

    private final void c(ReactContext reactContext, String str, int i7) {
        if (i7 < 5 || reactContext == null || !reactContext.hasActiveReactInstance() || str == null) {
            return;
        }
        ((RCTLog) reactContext.getJSModule(RCTLog.class)).logIfNoNativeHook(b(i7), str);
    }

    public static final void d(ReactContext reactContext, String str) {
        k.f(str, "message");
        f1033a.c(reactContext, str, 5);
        P0.a.G("ReactNative", str);
    }
}
