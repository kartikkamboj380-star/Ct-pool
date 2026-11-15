package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import r1.AbstractC2022a;

/* JADX INFO: loaded from: classes.dex */
public class a implements JavaScriptExecutorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10670b;

    public a() {
        this(null);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new HermesExecutor(null, this.f10669a, this.f10670b);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }

    public String toString() {
        return "JSIExecutor+HermesRuntime";
    }

    public a(AbstractC2022a abstractC2022a) {
        this.f10669a = true;
        this.f10670b = "";
    }
}
