package com.facebook.react.runtime;

import com.facebook.jni.HybridData;
import com.facebook.jni.annotations.DoNotStripAny;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.soloader.SoLoader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m2.InterfaceC1872c;

/* JADX INFO: loaded from: classes.dex */
@DoNotStripAny
public final class JSTimerExecutor implements InterfaceC1872c {
    private static final a Companion = new a(null);
    private final HybridData mHybridData;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        SoLoader.t("rninstance");
    }

    public JSTimerExecutor(HybridData hybridData) {
        w5.k.f(hybridData, "mHybridData");
        this.mHybridData = hybridData;
    }

    private final native void callTimers(WritableNativeArray writableNativeArray);

    @Override // m2.InterfaceC1872c
    public void callIdleCallbacks(double d7) {
    }

    @Override // m2.InterfaceC1872c
    public void callTimers(WritableArray writableArray) {
        w5.k.f(writableArray, "timerIDs");
        callTimers((WritableNativeArray) writableArray);
    }

    @Override // m2.InterfaceC1872c
    public void emitTimeDriftWarning(String str) {
        w5.k.f(str, "warningMessage");
    }
}
