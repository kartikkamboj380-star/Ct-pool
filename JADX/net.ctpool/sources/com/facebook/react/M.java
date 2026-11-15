package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface M {
    List createNativeModules(ReactApplicationContext reactApplicationContext);

    List createViewManagers(ReactApplicationContext reactApplicationContext);

    default NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return null;
    }
}
