package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
@R1.a
@Deprecated
public interface RCTEventEmitter extends JavaScriptModule {
    @Deprecated
    void receiveEvent(int i7, String str, WritableMap writableMap);

    @Deprecated
    void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2);
}
