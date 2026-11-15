package com.facebook.react.modules.core;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public interface JSTimers extends JavaScriptModule {
    void callIdleCallbacks(double d7);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
