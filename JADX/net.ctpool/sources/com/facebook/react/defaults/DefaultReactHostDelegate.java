package com.facebook.react.defaults;

import app.notifee.core.event.LogEvent;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.T;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.BindingsInstaller;
import com.facebook.react.runtime.InterfaceC0841g;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.hermes.HermesInstance;
import i5.u;
import j5.AbstractC1809n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.l;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
public final class DefaultReactHostDelegate implements InterfaceC0841g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSBundleLoader f11444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f11445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JSRuntimeFactory f11446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BindingsInstaller f11447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReactNativeConfig f11448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l f11449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final T.a f11450h;

    static final class a extends w5.l implements l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f11451m = new a();

        a() {
            super(1);
        }

        public final void a(Exception exc) {
            k.f(exc, "it");
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Exception) obj);
            return u.f19985a;
        }
    }

    public DefaultReactHostDelegate(String str, JSBundleLoader jSBundleLoader, List list, JSRuntimeFactory jSRuntimeFactory, BindingsInstaller bindingsInstaller, ReactNativeConfig reactNativeConfig, l lVar, T.a aVar) {
        k.f(str, "jsMainModulePath");
        k.f(jSBundleLoader, "jsBundleLoader");
        k.f(list, "reactPackages");
        k.f(jSRuntimeFactory, "jsRuntimeFactory");
        k.f(reactNativeConfig, "reactNativeConfig");
        k.f(lVar, "exceptionHandler");
        k.f(aVar, "turboModuleManagerDelegateBuilder");
        this.f11443a = str;
        this.f11444b = jSBundleLoader;
        this.f11445c = list;
        this.f11446d = jSRuntimeFactory;
        this.f11447e = bindingsInstaller;
        this.f11448f = reactNativeConfig;
        this.f11449g = lVar;
        this.f11450h = aVar;
    }

    @Override // com.facebook.react.runtime.InterfaceC0841g
    public JSRuntimeFactory a() {
        return this.f11446d;
    }

    @Override // com.facebook.react.runtime.InterfaceC0841g
    public ReactNativeConfig b() {
        return this.f11448f;
    }

    @Override // com.facebook.react.runtime.InterfaceC0841g
    public List c() {
        return this.f11445c;
    }

    @Override // com.facebook.react.runtime.InterfaceC0841g
    public void d(Exception exc) {
        k.f(exc, LogEvent.LEVEL_ERROR);
        this.f11449g.i(exc);
    }

    @Override // com.facebook.react.runtime.InterfaceC0841g
    public JSBundleLoader e() {
        return this.f11444b;
    }

    @Override // com.facebook.react.runtime.InterfaceC0841g
    public T.a f() {
        return this.f11450h;
    }

    @Override // com.facebook.react.runtime.InterfaceC0841g
    public String g() {
        return this.f11443a;
    }

    @Override // com.facebook.react.runtime.InterfaceC0841g
    public BindingsInstaller getBindingsInstaller() {
        return this.f11447e;
    }

    public /* synthetic */ DefaultReactHostDelegate(String str, JSBundleLoader jSBundleLoader, List list, JSRuntimeFactory jSRuntimeFactory, BindingsInstaller bindingsInstaller, ReactNativeConfig reactNativeConfig, l lVar, T.a aVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jSBundleLoader, (i7 & 4) != 0 ? AbstractC1809n.i() : list, (i7 & 8) != 0 ? new HermesInstance() : jSRuntimeFactory, (i7 & 16) != 0 ? null : bindingsInstaller, (i7 & 32) != 0 ? ReactNativeConfig.f11713b : reactNativeConfig, (i7 & 64) != 0 ? a.f11451m : lVar, aVar);
    }
}
