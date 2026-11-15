package app.notifee.core.event;

import app.notifee.core.KeepForSdk;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class LogEvent {

    @KeepForSdk
    public static final String LEVEL_DEBUG = "debug";

    @KeepForSdk
    public static final String LEVEL_ERROR = "error";

    @KeepForSdk
    public static final String LEVEL_INFO = "info";

    @KeepForSdk
    public static final String LEVEL_VERBOSE = "verbose";

    @KeepForSdk
    public static final String LEVEL_WARN = "warn";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f9555d;

    public LogEvent(String str, String str2, String str3) {
        this.f9552a = str2;
        this.f9553b = str;
        this.f9554c = str3;
        this.f9555d = null;
    }

    @KeepForSdk
    public String getLevel() {
        return this.f9553b;
    }

    @KeepForSdk
    public String getMessage() {
        return this.f9554c;
    }

    @KeepForSdk
    public String getTag() {
        return this.f9552a;
    }

    @KeepForSdk
    public Throwable getThrowable() {
        return this.f9555d;
    }

    public LogEvent(String str, String str2, String str3, Throwable th) {
        this.f9552a = str2;
        this.f9553b = str;
        this.f9554c = str3;
        this.f9555d = th;
    }
}
