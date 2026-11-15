package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeIntentAndroidSpec;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import i2.InterfaceC1741a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeIntentAndroidSpec.NAME)
public class IntentModule extends NativeIntentAndroidSpec {
    private static final String EXTRA_MAP_KEY_FOR_VALUE = "value";
    private LifecycleEventListener mInitialURLListener;

    class a implements LifecycleEventListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Promise f11909m;

        a(Promise promise) {
            this.f11909m = promise;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            IntentModule.this.getInitialURL(this.f11909m);
            IntentModule.this.getReactApplicationContext().removeLifecycleEventListener(this);
            IntentModule.this.mInitialURLListener = null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11911a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f11911a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11911a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11911a[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mInitialURLListener = null;
    }

    private void sendOSIntent(Intent intent, Boolean bool) {
        Activity currentActivity = getCurrentActivity();
        String packageName = getReactApplicationContext().getPackageName();
        ComponentName componentNameResolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
        String packageName2 = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : "";
        if (bool.booleanValue() || currentActivity == null || !packageName.equals(packageName2)) {
            intent.addFlags(268435456);
        }
        if (currentActivity != null) {
            currentActivity.startActivity(intent);
        } else {
            getReactApplicationContext().startActivity(intent);
        }
    }

    private void waitForActivityAndGetInitialURL(Promise promise) {
        if (this.mInitialURLListener != null) {
            promise.reject(new IllegalStateException("Cannot await activity from more than one call to getInitialURL"));
        } else {
            this.mInitialURLListener = new a(promise);
            getReactApplicationContext().addLifecycleEventListener(this.mInitialURLListener);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void canOpenURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            promise.resolve(Boolean.valueOf(intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null));
        } catch (Exception e7) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not check if URL '" + str + "' can be opened: " + e7.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void getInitialURL(Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity == null) {
                waitForActivityAndGetInitialURL(promise);
                return;
            }
            Intent intent = currentActivity.getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            promise.resolve((data == null || !("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) ? null : data.toString());
        } catch (Exception e7) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not get the initial URL : " + e7.getMessage()));
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        if (this.mInitialURLListener != null) {
            getReactApplicationContext().removeLifecycleEventListener(this.mInitialURLListener);
            this.mInitialURLListener = null;
        }
        super.invalidate();
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openSettings(Promise promise) {
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + packageName));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            currentActivity.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e7) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open the Settings: " + e7.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void openURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            sendOSIntent(new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme()), Boolean.FALSE);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e7) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open URL '" + str + "': " + e7.getMessage()));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIntentAndroidSpec
    public void sendIntent(String str, ReadableArray readableArray, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid Action: " + str + "."));
            return;
        }
        Intent intent = new Intent(str);
        if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) == null) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not launch Intent with action " + str + "."));
            return;
        }
        if (readableArray != null) {
            for (int i7 = 0; i7 < readableArray.size(); i7++) {
                ReadableMap map = readableArray.getMap(i7);
                String string = map.getString("key");
                int i8 = b.f11911a[map.getType(EXTRA_MAP_KEY_FOR_VALUE).ordinal()];
                if (i8 == 1) {
                    intent.putExtra(string, map.getString(EXTRA_MAP_KEY_FOR_VALUE));
                } else if (i8 == 2) {
                    intent.putExtra(string, Double.valueOf(map.getDouble(EXTRA_MAP_KEY_FOR_VALUE)));
                } else {
                    if (i8 != 3) {
                        promise.reject(new JSApplicationIllegalArgumentException("Extra type for " + string + " not supported."));
                        return;
                    }
                    intent.putExtra(string, map.getBoolean(EXTRA_MAP_KEY_FOR_VALUE));
                }
            }
        }
        sendOSIntent(intent, Boolean.TRUE);
    }
}
