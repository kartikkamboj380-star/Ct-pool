package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.H0;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import i2.InterfaceC1741a;
import j2.InterfaceC1778a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m2.InterfaceC1871b;

/* JADX INFO: renamed from: com.facebook.react.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0796d extends Y implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H f11437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1871b f11438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11440d;

    /* JADX INFO: renamed from: com.facebook.react.d$a */
    class a implements H0 {
        a() {
        }

        @Override // com.facebook.react.uimanager.H0
        public Collection a() {
            return C0796d.this.f11437a.H();
        }

        @Override // com.facebook.react.uimanager.H0
        public ViewManager b(String str) {
            return C0796d.this.f11437a.y(str);
        }
    }

    public C0796d(H h7, InterfaceC1871b interfaceC1871b, boolean z6, int i7) {
        this.f11437a = h7;
        this.f11438b = interfaceC1871b;
        this.f11439c = z6;
        this.f11440d = i7;
    }

    private UIManagerModule g(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        P2.a.c(0L, "createUIManagerModule");
        try {
            return this.f11439c ? new UIManagerModule(reactApplicationContext, new a(), this.f11440d) : new UIManagerModule(reactApplicationContext, (List<ViewManager>) this.f11437a.G(reactApplicationContext), this.f11440d);
        } finally {
            P2.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    private InterfaceC1778a h() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
        final HashMap map = new HashMap();
        for (int i7 = 0; i7 < 10; i7++) {
            Class cls = clsArr[i7];
            InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
            map.put(interfaceC1741a.name(), new ReactModuleInfo(interfaceC1741a.name(), cls.getName(), interfaceC1741a.canOverrideExistingModule(), interfaceC1741a.needsEagerInit(), interfaceC1741a.isCxxModule(), ReactModuleInfo.b(cls)));
        }
        return new InterfaceC1778a() { // from class: com.facebook.react.c
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return C0796d.i(map);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map i(Map map) {
        return map;
    }

    @Override // com.facebook.react.P
    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // com.facebook.react.P
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.f11437a.D());
            case "Timing":
                return new TimingModule(reactApplicationContext, this.f11437a.D());
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.f11437a.D());
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f11438b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.f11437a.D());
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            case "HeadlessJsTaskSupport":
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case "UIManager":
                return g(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        if (!S1.a.a()) {
            return h();
        }
        try {
            return (InterfaceC1778a) S1.a.b("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return h();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e8);
        }
    }
}
