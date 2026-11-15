package com.facebook.react.internal.turbomodule.core;

import com.facebook.react.reactperflogger.NativeModulePerfLogger;

/* JADX INFO: loaded from: classes.dex */
@R1.a
class TurboModulePerfLogger {
    private static NativeModulePerfLogger sNativeModulePerfLogger;

    static {
        NativeModuleSoLoader.maybeLoadSoLibrary();
    }

    TurboModulePerfLogger() {
    }

    public static void enableLogging(NativeModulePerfLogger nativeModulePerfLogger) {
        if (nativeModulePerfLogger != null) {
            sNativeModulePerfLogger = nativeModulePerfLogger;
            jniEnableCppLogging(nativeModulePerfLogger);
        }
    }

    private static native void jniEnableCppLogging(NativeModulePerfLogger nativeModulePerfLogger);

    public static void moduleCreateCacheHit(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.a(str, i7);
        }
    }

    public static void moduleCreateConstructEnd(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.b(str, i7);
        }
    }

    public static void moduleCreateConstructStart(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.c(str, i7);
        }
    }

    public static void moduleCreateEnd(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.d(str, i7);
        }
    }

    public static void moduleCreateFail(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.e(str, i7);
        }
    }

    public static void moduleCreateSetUpEnd(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.f(str, i7);
        }
    }

    public static void moduleCreateSetUpStart(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.g(str, i7);
        }
    }

    public static void moduleCreateStart(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.h(str, i7);
        }
    }

    public static void moduleDataCreateEnd(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.i(str, i7);
        }
    }

    public static void moduleDataCreateStart(String str, int i7) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.j(str, i7);
        }
    }
}
