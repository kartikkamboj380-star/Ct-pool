package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.os.Build;
import android.provider.Settings;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import i2.InterfaceC1741a;
import java.util.HashMap;
import java.util.Map;
import q2.b;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HardwareIds"})
@InterfaceC1741a(name = NativePlatformConstantsAndroidSpec.NAME)
public class AndroidInfoModule extends NativePlatformConstantsAndroidSpec implements TurboModule {
    private static final String IS_DISABLE_ANIMATIONS = "IS_DISABLE_ANIMATIONS";
    private static final String IS_TESTING = "IS_TESTING";

    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Boolean isRunningScreenshotTest() {
        try {
            Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
            return Boolean.TRUE;
        } catch (ClassNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) getReactApplicationContext().getSystemService("uimode")).getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 2 ? currentModeType != 3 ? currentModeType != 4 ? currentModeType != 6 ? currentModeType != 7 ? "unknown" : "vrheadset" : "watch" : "tv" : "car" : "desk" : "normal";
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    public String getAndroidID() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    @Override // com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap map = new HashMap();
        map.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("Release", Build.VERSION.RELEASE);
        map.put("Serial", Build.SERIAL);
        map.put("Fingerprint", Build.FINGERPRINT);
        map.put("Model", Build.MODEL);
        map.put("Manufacturer", Build.MANUFACTURER);
        map.put("Brand", Build.BRAND);
        map.put("isTesting", Boolean.valueOf("true".equals(System.getProperty(IS_TESTING)) || isRunningScreenshotTest().booleanValue()));
        String property = System.getProperty(IS_DISABLE_ANIMATIONS);
        if (property != null) {
            map.put("isDisableAnimations", Boolean.valueOf("true".equals(property)));
        }
        map.put("reactNativeVersion", b.f21876a);
        map.put("uiMode", uiMode());
        return map;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
    }
}
