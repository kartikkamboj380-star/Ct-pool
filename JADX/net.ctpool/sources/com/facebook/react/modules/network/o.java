package com.facebook.react.modules.network;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static void a(ReactApplicationContext reactApplicationContext, int i7, WritableMap writableMap) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i7);
        writableArrayCreateArray.pushMap(writableMap);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    public static void b(ReactApplicationContext reactApplicationContext, int i7, String str) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i7);
        writableArrayCreateArray.pushString(str);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    public static void c(ReactApplicationContext reactApplicationContext, int i7, long j7, long j8) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i7);
        writableArrayCreateArray.pushInt((int) j7);
        writableArrayCreateArray.pushInt((int) j8);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkDataProgress", writableArrayCreateArray);
        }
    }

    public static void d(ReactApplicationContext reactApplicationContext, int i7, long j7, long j8) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i7);
        writableArrayCreateArray.pushInt((int) j7);
        writableArrayCreateArray.pushInt((int) j8);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didSendNetworkData", writableArrayCreateArray);
        }
    }

    public static void e(ReactApplicationContext reactApplicationContext, int i7, String str, long j7, long j8) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i7);
        writableArrayCreateArray.pushString(str);
        writableArrayCreateArray.pushInt((int) j7);
        writableArrayCreateArray.pushInt((int) j8);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkIncrementalData", writableArrayCreateArray);
        }
    }

    public static void f(ReactApplicationContext reactApplicationContext, int i7, String str, Throwable th) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i7);
        writableArrayCreateArray.pushString(str);
        if (th != null && th.getClass() == SocketTimeoutException.class) {
            writableArrayCreateArray.pushBoolean(true);
        }
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static void g(ReactApplicationContext reactApplicationContext, int i7) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i7);
        writableArrayCreateArray.pushNull();
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static void h(ReactApplicationContext reactApplicationContext, int i7, int i8, WritableMap writableMap, String str) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i7);
        writableArrayCreateArray.pushInt(i8);
        writableArrayCreateArray.pushMap(writableMap);
        writableArrayCreateArray.pushString(str);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkResponse", writableArrayCreateArray);
        }
    }
}
