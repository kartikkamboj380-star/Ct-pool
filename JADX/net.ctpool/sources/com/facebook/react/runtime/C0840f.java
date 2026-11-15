package com.facebook.react.runtime;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import i2.InterfaceC1741a;
import j2.InterfaceC1778a;
import java.util.HashMap;
import java.util.Map;
import m2.InterfaceC1871b;

/* JADX INFO: renamed from: com.facebook.react.runtime.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0840f extends com.facebook.react.Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X1.e f12181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1871b f12182b;

    public C0840f(X1.e eVar, InterfaceC1871b interfaceC1871b) {
        this.f12181a = eVar;
        this.f12182b = interfaceC1871b;
    }

    private InterfaceC1778a f() {
        Class[] clsArr = {AndroidInfoModule.class, DeviceInfoModule.class, SourceCodeModule.class, DevSettingsModule.class, DeviceEventManagerModule.class, LogBoxModule.class, ExceptionsManagerModule.class};
        final HashMap map = new HashMap();
        for (int i7 = 0; i7 < 7; i7++) {
            Class cls = clsArr[i7];
            InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
            if (interfaceC1741a != null) {
                map.put(interfaceC1741a.name(), new ReactModuleInfo(interfaceC1741a.name(), cls.getName(), interfaceC1741a.canOverrideExistingModule(), interfaceC1741a.needsEagerInit(), interfaceC1741a.isCxxModule(), ReactModuleInfo.b(cls)));
            }
        }
        return new InterfaceC1778a() { // from class: com.facebook.react.runtime.e
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return C0840f.g(map);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map g(Map map) {
        return map;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        switch (str) {
            case "LogBox":
                return new LogBoxModule(reactApplicationContext, this.f12181a);
            case "DevSettings":
                return new DevSettingsModule(reactApplicationContext, this.f12181a);
            case "DeviceInfo":
                return new DeviceInfoModule(reactApplicationContext);
            case "DeviceEventManager":
                return new DeviceEventManagerModule(reactApplicationContext, this.f12182b);
            case "PlatformConstants":
                return new AndroidInfoModule(reactApplicationContext);
            case "ExceptionsManager":
                return new ExceptionsManagerModule(this.f12181a);
            case "SourceCode":
                return new SourceCodeModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        if (!S1.a.a()) {
            return f();
        }
        try {
            return (InterfaceC1778a) ((Class) O1.a.c(S1.a.b(C0840f.class.getName() + "$$ReactModuleInfoProvider"))).newInstance();
        } catch (ClassNotFoundException unused) {
            return f();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + C0840f.class.getName() + "$$ReactModuleInfoProvider", e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("No ReactModuleInfoProvider for " + C0840f.class.getName() + "$$ReactModuleInfoProvider", e8);
        }
    }
}
