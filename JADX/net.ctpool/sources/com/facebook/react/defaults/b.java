package com.facebook.react.defaults;

import android.content.Context;
import com.facebook.react.EnumC0826i;
import com.facebook.react.InterfaceC0917y;
import com.facebook.react.L;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.defaults.DefaultTurboModuleManagerDelegate;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.runtime.JSCInstance;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.hermes.HermesInstance;
import java.util.Iterator;
import java.util.List;
import v5.l;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11456a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static InterfaceC0917y f11457b;

    private b() {
    }

    public static final InterfaceC0917y a(Context context, L l7) {
        k.f(context, "context");
        k.f(l7, "reactNativeHost");
        if (l7 instanceof c) {
            return ((c) l7).A(context);
        }
        throw new IllegalArgumentException("You can call getDefaultReactHost only with instances of DefaultReactNativeHost".toString());
    }

    public static final InterfaceC0917y b(Context context, List list, String str, String str2, boolean z6, boolean z7, List list2) {
        k.f(context, "context");
        k.f(list, "packageList");
        k.f(str, "jsMainModulePath");
        k.f(str2, "jsBundleAssetPath");
        k.f(list2, "cxxReactPackageProviders");
        if (f11457b == null) {
            JSBundleLoader jSBundleLoaderCreateAssetLoader = JSBundleLoader.createAssetLoader(context, "assets://" + str2, true);
            JSRuntimeFactory hermesInstance = z6 ? new HermesInstance() : new JSCInstance();
            DefaultTurboModuleManagerDelegate.a aVar = new DefaultTurboModuleManagerDelegate.a();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                aVar.e((l) it.next());
            }
            k.c(jSBundleLoaderCreateAssetLoader);
            DefaultReactHostDelegate defaultReactHostDelegate = new DefaultReactHostDelegate(str, jSBundleLoaderCreateAssetLoader, list, hermesInstance, null, null, null, aVar, 112, null);
            ComponentFactory componentFactory = new ComponentFactory();
            DefaultComponentsRegistry.f11442a.register(componentFactory);
            ReactHostImpl reactHostImpl = new ReactHostImpl(context, defaultReactHostDelegate, componentFactory, true, z7);
            reactHostImpl.C1(z6 ? EnumC0826i.f11781n : EnumC0826i.f11780m);
            f11457b = reactHostImpl;
        }
        InterfaceC0917y interfaceC0917y = f11457b;
        k.d(interfaceC0917y, "null cannot be cast to non-null type com.facebook.react.ReactHost");
        return interfaceC0917y;
    }
}
