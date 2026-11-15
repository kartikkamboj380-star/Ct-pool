package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class PromiseImpl implements Promise {
    private static final String ERROR_DEFAULT_CODE = "EUNSPECIFIED";
    private static final String ERROR_DEFAULT_MESSAGE = "Error not specified.";
    private static final String ERROR_MAP_KEY_CODE = "code";
    private static final String ERROR_MAP_KEY_MESSAGE = "message";
    private static final String ERROR_MAP_KEY_NAME = "name";
    private static final String ERROR_MAP_KEY_NATIVE_STACK = "nativeStackAndroid";
    private static final String ERROR_MAP_KEY_USER_INFO = "userInfo";
    private static final int ERROR_STACK_FRAME_LIMIT = 50;
    private static final String STACK_FRAME_KEY_CLASS = "class";
    private static final String STACK_FRAME_KEY_FILE = "file";
    private static final String STACK_FRAME_KEY_LINE_NUMBER = "lineNumber";
    private static final String STACK_FRAME_KEY_METHOD_NAME = "methodName";
    private Callback mReject;
    private Callback mResolve;

    @R1.a
    public PromiseImpl(Callback callback, Callback callback2) {
        this.mResolve = callback;
        this.mReject = callback2;
    }

    @Override // com.facebook.react.bridge.Promise
    @Deprecated
    public void reject(String str) {
        reject(null, str, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void resolve(Object obj) {
        Callback callback = this.mResolve;
        if (callback != null) {
            callback.invoke(obj);
            this.mResolve = null;
            this.mReject = null;
        }
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, WritableMap writableMap) {
        reject(str, null, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2) {
        reject(str, str2, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, WritableMap writableMap) {
        reject(str, str2, null, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th) {
        reject(str, str2, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, String str2, Throwable th, WritableMap writableMap) {
        if (this.mReject == null) {
            this.mResolve = null;
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str == null) {
            str = ERROR_DEFAULT_CODE;
        }
        writableNativeMap.putString(ERROR_MAP_KEY_CODE, str);
        if (str2 == null) {
            if (th != null) {
                str2 = th.getMessage();
                if (str2 == null || str2.isEmpty()) {
                    str2 = th.getClass().getCanonicalName();
                }
            } else {
                str2 = ERROR_DEFAULT_MESSAGE;
            }
        }
        writableNativeMap.putString(ERROR_MAP_KEY_MESSAGE, str2);
        if (writableMap != null) {
            writableNativeMap.putMap(ERROR_MAP_KEY_USER_INFO, writableMap);
        } else {
            writableNativeMap.putNull(ERROR_MAP_KEY_USER_INFO);
        }
        if (th != null) {
            writableNativeMap.putString(ERROR_MAP_KEY_NAME, th.getClass().getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (int i7 = 0; i7 < stackTrace.length && i7 < ERROR_STACK_FRAME_LIMIT; i7++) {
                StackTraceElement stackTraceElement = stackTrace[i7];
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString(STACK_FRAME_KEY_CLASS, stackTraceElement.getClassName());
                writableNativeMap2.putString(STACK_FRAME_KEY_FILE, stackTraceElement.getFileName());
                writableNativeMap2.putInt(STACK_FRAME_KEY_LINE_NUMBER, stackTraceElement.getLineNumber());
                writableNativeMap2.putString(STACK_FRAME_KEY_METHOD_NAME, stackTraceElement.getMethodName());
                writableNativeArray.pushMap(writableNativeMap2);
            }
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, writableNativeArray);
        } else {
            writableNativeMap.putArray(ERROR_MAP_KEY_NATIVE_STACK, new WritableNativeArray());
        }
        this.mReject.invoke(writableNativeMap);
        this.mResolve = null;
        this.mReject = null;
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th) {
        reject(str, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(String str, Throwable th, WritableMap writableMap) {
        reject(str, null, th, writableMap);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th) {
        reject(null, null, th, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public void reject(Throwable th, WritableMap writableMap) {
        reject(null, null, th, writableMap);
    }
}
