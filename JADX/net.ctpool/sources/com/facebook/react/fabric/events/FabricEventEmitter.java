package com.facebook.react.fabric.events;

import P2.a;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.react.uimanager.events.q;

/* JADX INFO: loaded from: classes.dex */
public class FabricEventEmitter implements RCTModernEventEmitter {
    private final FabricUIManager mUIManager;

    public FabricEventEmitter(FabricUIManager fabricUIManager) {
        this.mUIManager = fabricUIManager;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i7, int i8, String str, WritableMap writableMap) {
        receiveEvent(i7, i8, str, false, 0, writableMap, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(q qVar) {
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by Fabric");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i7, int i8, String str, boolean z6, int i9, WritableMap writableMap, int i10) {
        a.c(0L, "FabricEventEmitter.receiveEvent('" + str + "')");
        try {
            this.mUIManager.receiveEvent(i7, i8, str, z6, writableMap, i10);
        } finally {
            a.g(0L);
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by Fabric");
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i7, String str, WritableMap writableMap) {
        receiveEvent(-1, i7, str, writableMap);
    }
}
