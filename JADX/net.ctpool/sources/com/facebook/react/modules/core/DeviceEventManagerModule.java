package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ImagesContract;
import i2.InterfaceC1741a;
import m2.InterfaceC1871b;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeDeviceEventManagerSpec.NAME)
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    private final Runnable mInvokeDefaultBackPressRunnable;

    @R1.a
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC1871b f11809m;

        a(InterfaceC1871b interfaceC1871b) {
            this.f11809m = interfaceC1871b;
        }

        @Override // java.lang.Runnable
        public void run() {
            UiThreadUtil.assertOnUiThread();
            this.f11809m.c();
        }
    }

    public DeviceEventManagerModule(ReactApplicationContext reactApplicationContext, InterfaceC1871b interfaceC1871b) {
        super(reactApplicationContext);
        this.mInvokeDefaultBackPressRunnable = new a(interfaceC1871b);
    }

    public void emitHardwareBackPressed() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("hardwareBackPress", null);
        }
    }

    public void emitNewIntentReceived(Uri uri) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString(ImagesContract.URL, uri.toString());
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent(ImagesContract.URL, writableMapCreateMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDeviceEventManagerSpec
    public void invokeDefaultBackPressHandler() {
        getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
    }
}
