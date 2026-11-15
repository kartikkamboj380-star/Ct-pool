package io.invertase.firebase.analytics;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import z3.AbstractC2272l;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeFirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Analytics";
    private final v module;

    ReactNativeFirebaseAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new v(reactApplicationContext, SERVICE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getAppInstanceId$3(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSessionId$4(Promise promise, AbstractC2272l abstractC2272l) {
        if (!abstractC2272l.p()) {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        } else {
            Long l7 = (Long) abstractC2272l.l();
            promise.resolve(l7 != null ? Double.valueOf(l7.doubleValue()) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$logEvent$0(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$resetAnalyticsData$8(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAnalyticsCollectionEnabled$1(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setConsent$10(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDefaultEventParameters$9(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setSessionTimeoutDuration$2(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUserId$5(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUserProperties$7(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setUserProperty$6(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    private Bundle toBundle(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) bundle.getSerializable("items");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        for (Object obj : arrayList) {
            if (obj instanceof Bundle) {
                Bundle bundle2 = (Bundle) obj;
                if (bundle2.containsKey("quantity")) {
                    bundle2.putInt("quantity", (int) bundle2.getDouble("quantity"));
                }
            }
        }
        if (bundle.containsKey("extend_session")) {
            bundle.putLong("extend_session", (long) bundle.getDouble("extend_session"));
        }
        return bundle;
    }

    @ReactMethod
    public void getAppInstanceId(final Promise promise) {
        this.module.l().c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.a
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$getAppInstanceId$3(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void getSessionId(final Promise promise) {
        this.module.m().c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.f
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$getSessionId$4(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, final Promise promise) {
        this.module.w(str, toBundle(readableMap)).c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.e
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$logEvent$0(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void resetAnalyticsData(final Promise promise) {
        this.module.x().c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.g
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$resetAnalyticsData$8(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void setAnalyticsCollectionEnabled(Boolean bool, final Promise promise) {
        this.module.y(bool).c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.d
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$setAnalyticsCollectionEnabled$1(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void setConsent(ReadableMap readableMap, final Promise promise) {
        this.module.z(Arguments.toBundle(readableMap)).c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.c
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$setConsent$10(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void setDefaultEventParameters(ReadableMap readableMap, final Promise promise) {
        this.module.A(toBundle(readableMap)).c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.h
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$setDefaultEventParameters$9(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void setSessionTimeoutDuration(double d7, final Promise promise) {
        this.module.B((long) d7).c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.j
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$setSessionTimeoutDuration$2(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void setUserId(String str, final Promise promise) {
        this.module.C(str).c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.k
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$setUserId$5(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void setUserProperties(ReadableMap readableMap, final Promise promise) {
        this.module.D(Arguments.toBundle(readableMap)).c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.i
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$setUserProperties$7(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void setUserProperty(String str, String str2, final Promise promise) {
        this.module.E(str, str2).c(new InterfaceC2266f() { // from class: io.invertase.firebase.analytics.b
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseAnalyticsModule.lambda$setUserProperty$6(promise, abstractC2272l);
            }
        });
    }
}
