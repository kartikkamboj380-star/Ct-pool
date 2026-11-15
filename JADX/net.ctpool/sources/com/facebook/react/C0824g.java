package com.facebook.react;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import i2.InterfaceC1741a;
import j2.InterfaceC1778a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.facebook.react.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0824g extends Y implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f11771a;

    private static void f(Map map, String str, Provider provider) {
        map.put(str, ModuleSpec.viewManagerSpec(provider));
    }

    private InterfaceC1778a g() {
        final HashMap map = new HashMap();
        Class cls = new Class[]{JSCHeapCapture.class}[0];
        InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
        map.put(interfaceC1741a.name(), new ReactModuleInfo(interfaceC1741a.name(), cls.getName(), interfaceC1741a.canOverrideExistingModule(), interfaceC1741a.needsEagerInit(), interfaceC1741a.isCxxModule(), ReactModuleInfo.b(cls)));
        return new InterfaceC1778a() { // from class: com.facebook.react.f
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return C0824g.i(map);
            }
        };
    }

    private Map h() {
        if (this.f11771a == null) {
            HashMap map = new HashMap();
            f(map, DebuggingOverlayManager.REACT_CLASS, new Provider() { // from class: com.facebook.react.e
                @Override // javax.inject.Provider
                public final Object get() {
                    return new DebuggingOverlayManager();
                }
            });
            this.f11771a = map;
        }
        return this.f11771a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map i(Map map) {
        return map;
    }

    @Override // com.facebook.react.Z
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = (ModuleSpec) h().get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals(NativeJSCHeapCaptureSpec.NAME)) {
            return new JSCHeapCapture(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        if (!S1.a.a()) {
            return g();
        }
        try {
            return (InterfaceC1778a) S1.a.b("com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return g();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e8);
        }
    }

    @Override // com.facebook.react.Z
    public Collection getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return h().keySet();
    }

    @Override // com.facebook.react.AbstractC0794b
    public List getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(h().values());
    }
}
