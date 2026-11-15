package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
class ReactEventEmitter implements RCTModernEventEmitter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReactEventEmitter";
    private final ReactApplicationContext mReactContext;
    private RCTModernEventEmitter mFabricEventEmitter = null;
    private RCTEventEmitter mDefaultEventEmitter = null;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    private RCTEventEmitter getDefaultEventEmitter() {
        if (this.mDefaultEventEmitter == null) {
            if (this.mReactContext.hasActiveReactInstance()) {
                this.mDefaultEventEmitter = (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter from Context, no active Catalyst instance!"));
            }
        }
        return this.mDefaultEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i7, int i8, String str, WritableMap writableMap) {
        receiveEvent(i7, i8, str, false, 0, writableMap, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(q qVar) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int viewTag = qVar.getViewTag();
        int iB = C2239a.b(qVar.getViewTag(), qVar.getSurfaceId());
        if (iB == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            t.c(rCTModernEventEmitter, qVar);
            return;
        }
        if (iB == 1 && getDefaultEventEmitter() != null) {
            t.d(this.mDefaultEventEmitter, qVar);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receivedTouches: ReactTag[" + viewTag + "] UIManagerType[" + iB + "] EventName[" + qVar.getEventName() + "]"));
    }

    public void register(int i7, RCTEventEmitter rCTEventEmitter) {
        this.mDefaultEventEmitter = rCTEventEmitter;
    }

    public void unregister(int i7) {
        if (i7 == 1) {
            this.mDefaultEventEmitter = null;
        } else {
            this.mFabricEventEmitter = null;
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i7, int i8, String str, boolean z6, int i9, WritableMap writableMap, int i10) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int iB = C2239a.b(i8, i7);
        if (iB == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveEvent(i7, i8, str, z6, i9, writableMap, i10);
            return;
        }
        if (iB == 1) {
            RCTEventEmitter defaultEventEmitter = getDefaultEventEmitter();
            if (defaultEventEmitter != null) {
                defaultEventEmitter.receiveEvent(i8, str, writableMap);
                return;
            }
            return;
        }
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receiveEvent: SurfaceId[" + i7 + "] ReactTag[" + i8 + "] UIManagerType[" + iB + "] EventName[" + str + "]"));
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        O1.a.a(writableArray.size() > 0);
        if (C2239a.a(writableArray.getMap(0).getInt("target")) != 1 || getDefaultEventEmitter() == null) {
            return;
        }
        this.mDefaultEventEmitter.receiveTouches(str, writableArray, writableArray2);
    }

    public void register(int i7, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mFabricEventEmitter = rCTModernEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i7, String str, WritableMap writableMap) {
        receiveEvent(-1, i7, str, writableMap);
    }
}
