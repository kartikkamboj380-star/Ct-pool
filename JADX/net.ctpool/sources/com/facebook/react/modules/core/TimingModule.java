package com.facebook.react.modules.core;

import X1.e;
import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import h2.C1708c;
import i2.InterfaceC1741a;
import m2.InterfaceC1872c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeTimingSpec.NAME)
public final class TimingModule extends NativeTimingSpec implements InterfaceC1872c {
    private final JavaTimerManager mJavaTimerManager;

    public TimingModule(ReactApplicationContext reactApplicationContext, e eVar) {
        super(reactApplicationContext);
        this.mJavaTimerManager = new JavaTimerManager(reactApplicationContext, this, a.h(), eVar);
    }

    @Override // m2.InterfaceC1872c
    public void callIdleCallbacks(double d7) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callIdleCallbacks(d7);
        }
    }

    @Override // m2.InterfaceC1872c
    public void callTimers(WritableArray writableArray) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callTimers(writableArray);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void createTimer(double d7, double d8, double d9, boolean z6) {
        this.mJavaTimerManager.s((int) d7, (int) d8, d9, z6);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void deleteTimer(double d7) {
        this.mJavaTimerManager.deleteTimer((int) d7);
    }

    @Override // m2.InterfaceC1872c
    public void emitTimeDriftWarning(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).emitTimeDriftWarning(str);
        }
    }

    public boolean hasActiveTimersInRange(long j7) {
        return this.mJavaTimerManager.t(j7);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        C1708c.f(getReactApplicationContext()).d(this.mJavaTimerManager);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        C1708c.f(getReactApplicationContext()).j(this.mJavaTimerManager);
        this.mJavaTimerManager.x();
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void setSendIdleEvents(boolean z6) {
        this.mJavaTimerManager.setSendIdleEvents(z6);
    }
}
