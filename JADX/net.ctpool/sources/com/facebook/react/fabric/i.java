package com.facebook.react.fabric;

import android.view.Choreographer;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSExceptionHandler f11732a;

    protected i(JSExceptionHandler jSExceptionHandler) {
        w5.k.f(jSExceptionHandler, "exceptionHandler");
        this.f11732a = jSExceptionHandler;
    }

    protected abstract void a(long j7);

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j7) {
        try {
            a(j7);
        } catch (RuntimeException e7) {
            this.f11732a.handleException(e7);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected i(ReactContext reactContext) {
        w5.k.f(reactContext, "reactContext");
        JSExceptionHandler exceptionHandler = reactContext.getExceptionHandler();
        w5.k.e(exceptionHandler, "getExceptionHandler(...)");
        this(exceptionHandler);
    }
}
