package com.facebook.react;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import i2.InterfaceC1741a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends TurboModuleManagerDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f11137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11138e;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f11139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ReactApplicationContext f11140b;

        public T a() {
            O1.a.d(this.f11140b, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            O1.a.d(this.f11139a, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return b(this.f11140b, this.f11139a);
        }

        protected abstract T b(ReactApplicationContext reactApplicationContext, List list);

        public a c(List list) {
            this.f11139a = new ArrayList(list);
            return this;
        }

        public a d(ReactApplicationContext reactApplicationContext) {
            this.f11140b = reactApplicationContext;
            return this;
        }
    }

    interface b {
        NativeModule getModule(String str);
    }

    protected T(ReactApplicationContext reactApplicationContext, List list, HybridData hybridData) {
        super(hybridData);
        this.f11134a = new ArrayList();
        this.f11135b = new HashMap();
        boolean z6 = false;
        boolean z7 = ReactFeatureFlags.enableBridgelessArchitecture && ReactFeatureFlags.unstable_useTurboModuleInterop;
        this.f11136c = z7;
        if (z7 && ReactFeatureFlags.unstable_useTurboModuleInteropForAllTurboModules) {
            z6 = true;
        }
        this.f11137d = z6;
        this.f11138e = ReactFeatureFlags.unstable_enableTurboModuleSyncVoidMethods;
        b(reactApplicationContext, list);
    }

    private void b(final ReactApplicationContext reactApplicationContext, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            M m7 = (M) it.next();
            if (m7 instanceof AbstractC0794b) {
                final AbstractC0794b abstractC0794b = (AbstractC0794b) m7;
                b bVar = new b() { // from class: com.facebook.react.Q
                    @Override // com.facebook.react.T.b
                    public final NativeModule getModule(String str) {
                        return T.c(abstractC0794b, reactApplicationContext, str);
                    }
                };
                this.f11134a.add(bVar);
                this.f11135b.put(bVar, abstractC0794b.getReactModuleInfoProvider().a());
            } else {
                d();
                if (d()) {
                    List<NativeModule> listCreateNativeModules = m7.createNativeModules(reactApplicationContext);
                    final HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    for (NativeModule nativeModule : listCreateNativeModules) {
                        Class<?> cls = nativeModule.getClass();
                        InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
                        String strName = interfaceC1741a != null ? interfaceC1741a.name() : nativeModule.getName();
                        String name = cls.getName();
                        map2.put(strName, interfaceC1741a != null ? new ReactModuleInfo(strName, name, interfaceC1741a.canOverrideExistingModule(), true, interfaceC1741a.isCxxModule(), ReactModuleInfo.b(cls)) : new ReactModuleInfo(strName, name, nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.b(cls)));
                        map.put(strName, nativeModule);
                    }
                    b bVar2 = new b() { // from class: com.facebook.react.S
                        @Override // com.facebook.react.T.b
                        public final NativeModule getModule(String str) {
                            return (NativeModule) map.get(str);
                        }
                    };
                    this.f11134a.add(bVar2);
                    this.f11135b.put(bVar2, map2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ NativeModule c(AbstractC0794b abstractC0794b, ReactApplicationContext reactApplicationContext, String str) {
        return abstractC0794b.getModule(str, reactApplicationContext);
    }

    private boolean d() {
        return unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public List getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11134a.iterator();
        while (it.hasNext()) {
            for (ReactModuleInfo reactModuleInfo : ((Map) this.f11135b.get((b) it.next())).values()) {
                if (reactModuleInfo.e() && reactModuleInfo.g()) {
                    arrayList.add(reactModuleInfo.f());
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public NativeModule getLegacyModule(String str) {
        if (!unstable_shouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (b bVar : this.f11134a) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f11135b.get(bVar)).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.e() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String str) {
        NativeModule nativeModule = null;
        for (b bVar : this.f11134a) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f11135b.get(bVar)).get(str);
            if (reactModuleInfo != null && reactModuleInfo.e() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(str);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return null;
        }
        return (TurboModule) nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_enableSyncVoidMethods() {
        return this.f11138e;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(String str) {
        Iterator it = this.f11134a.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f11135b.get((b) it.next())).get(str);
            if (reactModuleInfo != null && !reactModuleInfo.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(String str) {
        Iterator it = this.f11134a.iterator();
        while (it.hasNext()) {
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) ((Map) this.f11135b.get((b) it.next())).get(str);
            if (reactModuleInfo != null && reactModuleInfo.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.f11136c;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_shouldRouteTurboModulesThroughLegacyModuleInterop() {
        return this.f11137d;
    }
}
