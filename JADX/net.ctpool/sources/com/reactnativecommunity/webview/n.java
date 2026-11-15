package com.reactnativecommunity.webview;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import j2.InterfaceC1778a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class n extends Y {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap map = new HashMap();
        map.put("RNCWebViewModule", new ReactModuleInfo("RNCWebViewModule", "RNCWebViewModule", false, false, true, false, false));
        return map;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNCWebViewManager());
        return arrayList;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNCWebViewModule")) {
            return new RNCWebViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        return new InterfaceC1778a() { // from class: com.reactnativecommunity.webview.m
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return n.f();
            }
        };
    }
}
