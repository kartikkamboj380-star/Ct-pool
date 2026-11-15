package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public interface RCTModernEventEmitter extends RCTEventEmitter {
    void receiveEvent(int i7, int i8, String str, WritableMap writableMap);

    void receiveEvent(int i7, int i8, String str, boolean z6, int i9, WritableMap writableMap, int i10);

    @Deprecated
    void receiveTouches(q qVar);
}
