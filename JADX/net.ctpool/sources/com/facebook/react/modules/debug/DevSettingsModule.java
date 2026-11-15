package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.tenjin.android.config.TenjinConsts;
import i2.InterfaceC1741a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeDevSettingsSpec.NAME)
public final class DevSettingsModule extends NativeDevSettingsSpec {
    private final X1.e devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevSettingsModule(ReactApplicationContext reactApplicationContext, X1.e eVar) {
        super(reactApplicationContext);
        k.f(eVar, "devSupportManager");
        this.devSupportManager = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addMenuItem$lambda$1(String str, DevSettingsModule devSettingsModule) {
        k.f(str, "$title");
        k.f(devSettingsModule, "this$0");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("title", str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = devSettingsModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("didPressMenuItem", writableMapCreateMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reload$lambda$0(DevSettingsModule devSettingsModule) {
        k.f(devSettingsModule, "this$0");
        devSettingsModule.devSupportManager.q();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addListener(String str) {
        k.f(str, TenjinConsts.EVENT_NAME);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addMenuItem(final String str) {
        k.f(str, "title");
        this.devSupportManager.x(str, new X1.d() { // from class: com.facebook.react.modules.debug.a
            @Override // X1.d
            public final void a() {
                DevSettingsModule.addMenuItem$lambda$1(str, this);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void onFastRefresh() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void openDebugger() {
        this.devSupportManager.E();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reload() {
        if (this.devSupportManager.n()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.b
                @Override // java.lang.Runnable
                public final void run() {
                    DevSettingsModule.reload$lambda$0(this.f11856m);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reloadWithReason(String str) {
        k.f(str, "reason");
        reload();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void removeListeners(double d7) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setHotLoadingEnabled(boolean z6) {
        this.devSupportManager.b(z6);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsDebuggingRemotely(boolean z6) {
        this.devSupportManager.f(z6);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsShakeToShowDevMenuEnabled(boolean z6) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setProfilingEnabled(boolean z6) {
        this.devSupportManager.e(z6);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void toggleElementInspector() {
        this.devSupportManager.h();
    }
}
