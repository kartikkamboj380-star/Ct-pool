package com.facebook.react.uimanager;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.facebook.react.uimanager.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractChoreographerFrameCallbackC0890p implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f12621a;

    protected AbstractChoreographerFrameCallbackC0890p(ReactContext reactContext) {
        w5.k.f(reactContext, "reactContext");
        this.f12621a = reactContext;
    }

    protected abstract void a(long j7);

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j7) {
        try {
            a(j7);
        } catch (RuntimeException e7) {
            this.f12621a.handleException(e7);
        }
    }
}
