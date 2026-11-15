package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;
import r1.AbstractC2022a;

/* JADX INFO: loaded from: classes.dex */
public class HermesExecutor extends JavaScriptExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f10668a;

    static {
        a();
    }

    HermesExecutor(AbstractC2022a abstractC2022a, boolean z6, String str) {
        super(initHybridDefaultConfig(z6, str));
    }

    public static void a() {
        if (f10668a == null) {
            SoLoader.t("hermes");
            SoLoader.t("hermes_executor");
            f10668a = "Release";
        }
    }

    private static native HybridData initHybrid(boolean z6, String str, long j7);

    private static native HybridData initHybridDefaultConfig(boolean z6, String str);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f10668a;
    }
}
