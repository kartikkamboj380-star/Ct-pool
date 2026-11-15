package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;

/* JADX INFO: loaded from: classes.dex */
@R1.a
@Deprecated(since = "CompositeReactPackageTurboModuleManagerDelegate is deprecated and will be deleted in the future. Please use ReactPackage interface or BaseReactPackage instead.")
public class CompositeReactPackageTurboModuleManagerDelegate extends T {
    private native void addTurboModuleManagerDelegate(TurboModuleManagerDelegate turboModuleManagerDelegate);

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    protected native HybridData initHybrid();
}
