package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.d;
import com.facebook.react.uimanager.events.a;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
public final class EventBeatManager implements a {

    @R1.a
    private final HybridData mHybridData = initHybrid();

    static {
        d.a();
    }

    private static native HybridData initHybrid();

    private native void tick();

    @Override // com.facebook.react.uimanager.events.a
    public void a() {
        tick();
    }
}
