package com.facebook.react.runtime;

import android.app.Activity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;

/* JADX INFO: loaded from: classes.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LifecycleState f12170a = LifecycleState.f11399m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0838d f12171b;

    c0(C0838d c0838d) {
        this.f12171b = c0838d;
    }

    public LifecycleState a() {
        return this.f12170a;
    }

    public void b(ReactContext reactContext) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f12170a;
            if (lifecycleState == LifecycleState.f11400n) {
                this.f12171b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            } else if (lifecycleState == LifecycleState.f11401o) {
                this.f12171b.a("ReactContext.onHostPause()");
                reactContext.onHostPause();
                this.f12171b.a("ReactContext.onHostDestroy()");
                reactContext.onHostDestroy();
            }
        }
        this.f12170a = LifecycleState.f11399m;
    }

    public void c(ReactContext reactContext, Activity activity) {
        if (reactContext != null) {
            LifecycleState lifecycleState = this.f12170a;
            if (lifecycleState == LifecycleState.f11399m) {
                this.f12171b.a("ReactContext.onHostResume()");
                reactContext.onHostResume(activity);
            } else if (lifecycleState == LifecycleState.f11401o) {
            }
            this.f12171b.a("ReactContext.onHostPause()");
            reactContext.onHostPause();
        }
        this.f12170a = LifecycleState.f11400n;
    }

    public void d(ReactContext reactContext, Activity activity) {
        LifecycleState lifecycleState = this.f12170a;
        LifecycleState lifecycleState2 = LifecycleState.f11401o;
        if (lifecycleState == lifecycleState2) {
            return;
        }
        if (reactContext != null) {
            this.f12171b.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
        this.f12170a = lifecycleState2;
    }

    public void e(ReactContext reactContext, Activity activity) {
        if (this.f12170a == LifecycleState.f11401o) {
            this.f12171b.a("ReactContext.onHostResume()");
            reactContext.onHostResume(activity);
        }
    }
}
