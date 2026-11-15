package io.invertase.firebase.messaging;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.T;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.V;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeFirebaseMessagingModule extends ReactNativeFirebaseModule implements ActivityEventListener {
    private static final String TAG = "Messaging";
    ReadableMap initialNotification;
    private HashMap<String, Boolean> initialNotificationMap;

    ReactNativeFirebaseMessagingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.initialNotification = null;
        this.initialNotificationMap = new HashMap<>();
        reactApplicationContext.addActivityEventListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$deleteToken$4(FirebaseMessaging firebaseMessaging) throws InterruptedException {
        AbstractC2275o.a(firebaseMessaging.o());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteToken$5(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getToken$2(FirebaseMessaging firebaseMessaging) {
        return (String) AbstractC2275o.a(firebaseMessaging.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getToken$3(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasPermission$6() {
        return Boolean.valueOf(T.i(getReactApplicationContext()).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hasPermission$7(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(Integer.valueOf(((Boolean) abstractC2272l.l()).booleanValue() ? 1 : 0));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$sendMessage$8(ReadableMap readableMap) {
        FirebaseMessaging.s().O(q.e(readableMap));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendMessage$9(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setAutoInitEnabled$0(Boolean bool) {
        FirebaseMessaging.s().P(bool.booleanValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAutoInitEnabled$1(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.s().B()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$setDeliveryMetricsExportToBigQuery$12(Boolean bool) {
        FirebaseMessaging.s().Q(bool.booleanValue());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDeliveryMetricsExportToBigQuery$13(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(Boolean.valueOf(FirebaseMessaging.s().p()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$subscribeToTopic$10(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unsubscribeFromTopic$11(Promise promise, AbstractC2272l abstractC2272l) {
        if (abstractC2272l.p()) {
            promise.resolve(abstractC2272l.l());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, abstractC2272l.k());
        }
    }

    private WritableMap popRemoteMessageMapFromMessagingStore(String str) {
        r rVarB = s.a().b();
        WritableMap writableMapA = rVarB.a(str);
        rVarB.b(str);
        return writableMapA;
    }

    @ReactMethod
    public void deleteToken(String str, String str2, final Promise promise) {
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging) Y3.f.p(str).k(FirebaseMessaging.class);
        AbstractC2275o.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.lambda$deleteToken$4(firebaseMessaging);
            }
        }).c(new InterfaceC2266f() { // from class: io.invertase.firebase.messaging.d
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseMessagingModule.lambda$deleteToken$5(promise, abstractC2272l);
            }
        });
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("isAutoInitEnabled", Boolean.valueOf(FirebaseMessaging.s().B()));
        map.put("isDeliveryMetricsExportToBigQueryEnabled", Boolean.valueOf(FirebaseMessaging.s().p()));
        return map;
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        ReadableMap readableMap = this.initialNotification;
        if (readableMap != null) {
            promise.resolve(readableMap);
            this.initialNotification = null;
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            Intent intent = currentActivity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.initialNotificationMap.get(string) == null) {
                    V v6 = (V) ReactNativeFirebaseMessagingReceiver.f20123a.get(string);
                    WritableMap writableMapPopRemoteMessageMapFromMessagingStore = v6 == null ? popRemoteMessageMapFromMessagingStore(string) : q.i(v6);
                    if (writableMapPopRemoteMessageMapFromMessagingStore != null) {
                        promise.resolve(writableMapPopRemoteMessageMapFromMessagingStore);
                        this.initialNotificationMap.put(string, Boolean.TRUE);
                        return;
                    }
                }
            }
        } else {
            Log.w(TAG, "Attempt to call getInitialNotification failed. The current activity is not ready, try calling the method later in the React lifecycle.");
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void getToken(String str, String str2, final Promise promise) {
        final FirebaseMessaging firebaseMessaging = (FirebaseMessaging) Y3.f.p(str).k(FirebaseMessaging.class);
        AbstractC2275o.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.lambda$getToken$2(firebaseMessaging);
            }
        }).c(new InterfaceC2266f() { // from class: io.invertase.firebase.messaging.i
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseMessagingModule.lambda$getToken$3(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void hasPermission(final Promise promise) {
        AbstractC2275o.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20125a.lambda$hasPermission$6();
            }
        }).c(new InterfaceC2266f() { // from class: io.invertase.firebase.messaging.g
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseMessagingModule.lambda$hasPermission$7(promise, abstractC2272l);
            }
        });
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i7, int i8, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        if (intent == null || intent.getExtras() == null) {
            return;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string != null) {
            V v6 = (V) ReactNativeFirebaseMessagingReceiver.f20123a.get(string);
            WritableMap writableMapPopRemoteMessageMapFromMessagingStore = v6 == null ? popRemoteMessageMapFromMessagingStore(string) : q.i(v6);
            if (writableMapPopRemoteMessageMapFromMessagingStore != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.merge(writableMapPopRemoteMessageMapFromMessagingStore);
                this.initialNotification = writableNativeMap;
                ReactNativeFirebaseMessagingReceiver.f20123a.remove(string);
                g5.g.i().o(q.f(writableMapPopRemoteMessageMapFromMessagingStore, Boolean.TRUE));
            }
        }
    }

    @ReactMethod
    public void sendMessage(final ReadableMap readableMap, final Promise promise) {
        AbstractC2275o.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.lambda$sendMessage$8(readableMap);
            }
        }).c(new InterfaceC2266f() { // from class: io.invertase.firebase.messaging.k
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseMessagingModule.lambda$sendMessage$9(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void setAutoInitEnabled(final Boolean bool, final Promise promise) {
        AbstractC2275o.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.lambda$setAutoInitEnabled$0(bool);
            }
        }).c(new InterfaceC2266f() { // from class: io.invertase.firebase.messaging.f
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseMessagingModule.lambda$setAutoInitEnabled$1(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void setDeliveryMetricsExportToBigQuery(final Boolean bool, final Promise promise) {
        AbstractC2275o.d(getExecutor(), new Callable() { // from class: io.invertase.firebase.messaging.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactNativeFirebaseMessagingModule.lambda$setDeliveryMetricsExportToBigQuery$12(bool);
            }
        }).c(new InterfaceC2266f() { // from class: io.invertase.firebase.messaging.n
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseMessagingModule.lambda$setDeliveryMetricsExportToBigQuery$13(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void subscribeToTopic(String str, final Promise promise) {
        FirebaseMessaging.s().V(str).c(new InterfaceC2266f() { // from class: io.invertase.firebase.messaging.o
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseMessagingModule.lambda$subscribeToTopic$10(promise, abstractC2272l);
            }
        });
    }

    @ReactMethod
    public void unsubscribeFromTopic(String str, final Promise promise) {
        FirebaseMessaging.s().Y(str).c(new InterfaceC2266f() { // from class: io.invertase.firebase.messaging.l
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                ReactNativeFirebaseMessagingModule.lambda$unsubscribeFromTopic$11(promise, abstractC2272l);
            }
        });
    }
}
