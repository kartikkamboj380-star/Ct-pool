package com.zoontek.rnbootsplash;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import i2.InterfaceC1741a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "RNBootSplash")
public class RNBootSplashModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public RNBootSplashModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return b.k(getReactApplicationContext());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNBootSplash";
    }

    @ReactMethod
    public void hide(boolean z6, Promise promise) {
        b.l(getReactApplicationContext(), z6, promise);
    }

    @ReactMethod
    public void isVisible(Promise promise) {
        b.p(promise);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        b.q();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}
