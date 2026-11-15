package com.ctpool.updater;

import G0.d;
import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class UpdaterModule extends ReactContextBaseJavaModule {
    private final a activityEventListener;
    private d updater;

    public static final class a extends BaseActivityEventListener {
        a() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i7, int i8, Intent intent) {
            d dVar;
            if (activity == null || (dVar = UpdaterModule.this.updater) == null) {
                return;
            }
            dVar.e(activity, i7, i8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdaterModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "context");
        this.updater = new d(reactApplicationContext);
        a aVar = new a();
        this.activityEventListener = aVar;
        reactApplicationContext.addActivityEventListener(aVar);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "UpdaterModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
        this.updater = null;
    }

    @ReactMethod
    public final void requestUpdateInfo(Promise promise) {
        k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        d dVar = this.updater;
        if (dVar == null) {
            promise.reject((String) null, "Missing updater");
            return;
        }
        try {
            dVar.g(promise);
        } catch (Exception e7) {
            promise.reject((String) null, e7);
        }
    }

    @ReactMethod
    public final void startUpdate(boolean z6, Promise promise) {
        k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject((String) null, "Missing activity");
            return;
        }
        d dVar = this.updater;
        if (dVar == null) {
            promise.reject((String) null, "Missing updater");
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(dVar.j(z6, currentActivity)));
        } catch (Exception e7) {
            promise.reject((String) null, e7);
        }
    }
}
