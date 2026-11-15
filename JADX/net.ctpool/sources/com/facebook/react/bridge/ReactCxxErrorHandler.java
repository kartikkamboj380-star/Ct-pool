package com.facebook.react.bridge;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    @R1.a
    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e7) {
                P0.a.k("ReactCxxErrorHandler", "Failed to invoke error handler function", e7);
            }
        }
    }

    @R1.a
    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}
