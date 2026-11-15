package io.invertase.firebase.crashlytics;

import android.os.Handler;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import g5.k;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import z3.AbstractC2272l;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeFirebaseCrashlyticsModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Crashlytics";

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Crash Test");
        }
    }

    ReactNativeFirebaseCrashlyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkForUnsentReports$0(Promise promise, AbstractC2272l abstractC2272l) {
        String message;
        if (!abstractC2272l.p()) {
            message = abstractC2272l.k() != null ? abstractC2272l.k().getMessage() : "checkForUnsentReports() request error";
        } else {
            if (abstractC2272l.l() != null) {
                promise.resolve(abstractC2272l.l());
                return;
            }
            message = "Unknown result of check for unsent reports";
        }
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "unknown", message);
    }

    private Exception recordJavaScriptError(ReadableMap readableMap) {
        String string = readableMap.getString("message");
        ReadableArray array = readableMap.getArray("frames");
        Objects.requireNonNull(array);
        ReadableArray readableArray = array;
        Exception dVar = readableMap.getBoolean("isUnhandledRejection") ? new d(string) : new io.invertase.firebase.crashlytics.a(string);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[readableArray.size()];
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            ReadableMap map = readableArray.getMap(i7);
            Objects.requireNonNull(map);
            ReadableMap readableMap2 = map;
            stackTraceElementArr[i7] = new StackTraceElement("", readableMap2.getString("fn"), readableMap2.getString("file"), -1);
        }
        dVar.setStackTrace(stackTraceElementArr);
        FirebaseCrashlytics.getInstance().recordException(dVar);
        return dVar;
    }

    @ReactMethod
    public void checkForUnsentReports(final Promise promise) {
        FirebaseCrashlytics.getInstance().checkForUnsentReports().c(new InterfaceC2266f() { // from class: io.invertase.firebase.crashlytics.b
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseCrashlyticsModule.lambda$checkForUnsentReports$0(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void crash() {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            new Handler().postDelayed(new a(), 50L);
        } else {
            Log.i(TAG, "crashlytics collection is not enabled, not crashing.");
        }
    }

    @ReactMethod
    public void crashWithStackPromise(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            recordJavaScriptError(readableMap).printStackTrace(System.err);
            Log.e(TAG, "Crash logged. Terminating app.");
            System.exit(0);
        } else {
            Log.i(TAG, "crashlytics collection is not enabled, not crashing.");
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void deleteUnsentReports() {
        FirebaseCrashlytics.getInstance().deleteUnsentReports();
    }

    @ReactMethod
    public void didCrashOnPreviousExecution(Promise promise) {
        promise.resolve(Boolean.valueOf(FirebaseCrashlytics.getInstance().didCrashOnPreviousExecution()));
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("isCrashlyticsCollectionEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.a()));
        map.put("isErrorGenerationOnJSCrashEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.c()));
        map.put("isCrashlyticsJavascriptExceptionHandlerChainingEnabled", Boolean.valueOf(ReactNativeFirebaseCrashlyticsInitProvider.b()));
        return map;
    }

    @ReactMethod
    public void log(String str) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
    }

    @ReactMethod
    public void logPromise(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            FirebaseCrashlytics.getInstance().log(str);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void recordError(ReadableMap readableMap) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            recordJavaScriptError(readableMap);
        } else {
            Log.i(TAG, "crashlytics collection is not enabled, not crashing.");
        }
    }

    @ReactMethod
    public void recordErrorPromise(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            recordJavaScriptError(readableMap);
        } else {
            Log.i(TAG, "crashlytics collection is not enabled, not crashing.");
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void sendUnsentReports() {
        FirebaseCrashlytics.getInstance().sendUnsentReports();
    }

    @ReactMethod
    public void setAttribute(String str, String str2, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            FirebaseCrashlytics.getInstance().setCustomKey(str, str2);
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void setAttributes(ReadableMap readableMap, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                firebaseCrashlytics.setCustomKey(strNextKey, readableMap.getString(strNextKey));
            }
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void setCrashlyticsCollectionEnabled(Boolean bool, Promise promise) {
        k.f().g("crashlytics_auto_collection_enabled", bool.booleanValue());
        promise.resolve(null);
    }

    @ReactMethod
    public void setUserId(String str, Promise promise) {
        if (ReactNativeFirebaseCrashlyticsInitProvider.a()) {
            FirebaseCrashlytics.getInstance().setUserId(str);
        }
        promise.resolve(null);
    }
}
