package com.sparkfabrik.rnidfaaaid;

import android.util.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class ReactNativeIdfaAaidModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactNativeIdfaAaidModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public final void getAdvertisingInfo(Promise promise) {
        k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.reactContext);
            k.e(advertisingIdInfo, "getAdvertisingIdInfo(...)");
            writableNativeMap.putString("id", advertisingIdInfo.getId());
            writableNativeMap.putBoolean("isAdTrackingLimited", false);
        } catch (Exception e7) {
            Log.e(getName(), "Failed to connect to Advertising ID provider.");
            promise.reject("Error getting aaid.", e7);
        }
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public final void getAdvertisingInfoAndCheckAuthorization(boolean z6, Promise promise) {
        k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        getAdvertisingInfo(promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactNativeIdfaAaid";
    }
}
