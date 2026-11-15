package com.reactnativecommunity.asyncstorage;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import i2.InterfaceC1741a;
import j2.InterfaceC1778a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i extends Y {

    class a implements InterfaceC1778a {
        a() {
        }

        @Override // j2.InterfaceC1778a
        public Map a() {
            HashMap map = new HashMap();
            Class cls = new Class[]{AsyncStorageModule.class}[0];
            InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
            map.put(interfaceC1741a.name(), new ReactModuleInfo(interfaceC1741a.name(), cls.getName(), interfaceC1741a.canOverrideExistingModule(), interfaceC1741a.needsEagerInit(), interfaceC1741a.hasConstants(), interfaceC1741a.isCxxModule(), false));
            return map;
        }
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals(AsyncStorageModule.NAME)) {
            return new AsyncStorageModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        try {
            return (InterfaceC1778a) Class.forName("com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new a();
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e8) {
            e = e8;
            throw new RuntimeException("No ReactModuleInfoProvider for com.reactnativecommunity.asyncstorage.AsyncStoragePackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.AbstractC0794b
    protected List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return null;
    }
}
