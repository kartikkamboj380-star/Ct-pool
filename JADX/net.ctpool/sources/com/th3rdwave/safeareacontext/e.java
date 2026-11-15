package com.th3rdwave.safeareacontext;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import i2.InterfaceC1741a;
import j2.InterfaceC1778a;
import j5.AbstractC1809n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Y {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(Map map) {
        w5.k.f(map, "$reactModuleInfoMap");
        return map;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        w5.k.f(reactApplicationContext, "reactContext");
        return AbstractC1809n.k(new SafeAreaProviderManager(), new SafeAreaViewManager());
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        w5.k.f(str, "name");
        w5.k.f(reactApplicationContext, "reactContext");
        if (w5.k.b(str, SafeAreaContextModule.NAME)) {
            return new SafeAreaContextModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        final HashMap map = new HashMap();
        Class cls = new Class[]{SafeAreaContextModule.class}[0];
        InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
        if (interfaceC1741a != null) {
            String strName = interfaceC1741a.name();
            String strName2 = interfaceC1741a.name();
            String name = cls.getName();
            w5.k.e(name, "getName(...)");
            map.put(strName, new ReactModuleInfo(strName2, name, true, interfaceC1741a.needsEagerInit(), interfaceC1741a.hasConstants(), interfaceC1741a.isCxxModule(), false));
        }
        return new InterfaceC1778a() { // from class: com.th3rdwave.safeareacontext.d
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return e.f(map);
            }
        };
    }
}
