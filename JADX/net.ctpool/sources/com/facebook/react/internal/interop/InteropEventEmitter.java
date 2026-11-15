package com.facebook.react.internal.interop;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.e;
import com.tenjin.android.config.TenjinConsts;
import f2.C1648a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class InteropEventEmitter implements RCTEventEmitter {
    private e eventDispatcherOverride;
    private final ReactContext reactContext;

    public InteropEventEmitter(ReactContext reactContext) {
        k.f(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    public final void overrideEventDispatcher(e eVar) {
        this.eventDispatcherOverride = eVar;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i7, String str, WritableMap writableMap) {
        k.f(str, TenjinConsts.EVENT_NAME);
        e eVarC = this.eventDispatcherOverride;
        if (eVarC == null) {
            eVarC = AbstractC0884k0.c(this.reactContext, i7);
        }
        int iE = AbstractC0884k0.e(this.reactContext);
        if (eVarC != null) {
            eVarC.c(new C1648a(str, writableMap, iE, i7));
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        k.f(str, TenjinConsts.EVENT_NAME);
        k.f(writableArray, "touches");
        k.f(writableArray2, "changedIndices");
        throw new UnsupportedOperationException("EventEmitter#receiveTouches is not supported by the Fabric Interop Layer");
    }
}
