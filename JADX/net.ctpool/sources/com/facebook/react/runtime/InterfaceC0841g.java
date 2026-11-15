package com.facebook.react.runtime;

import com.facebook.react.T;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.fabric.ReactNativeConfig;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.react.runtime.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0841g {
    JSRuntimeFactory a();

    ReactNativeConfig b();

    List c();

    void d(Exception exc);

    JSBundleLoader e();

    T.a f();

    String g();

    BindingsInstaller getBindingsInstaller();
}
