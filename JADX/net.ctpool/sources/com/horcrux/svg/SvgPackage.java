package com.horcrux.svg;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.horcrux.svg.RenderableViewManager;
import i2.InterfaceC1741a;
import j2.InterfaceC1778a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public class SvgPackage extends com.facebook.react.Y implements com.facebook.react.Z {
    private Map<String, ModuleSpec> mViewManagers;

    class A implements Provider {
        A() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TextPathViewManager();
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.SvgPackage$a, reason: case insensitive filesystem */
    class C1561a implements Provider {
        C1561a() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ImageViewManager();
        }
    }

    class b implements Provider {
        b() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ClipPathViewManager();
        }
    }

    class c implements Provider {
        c() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.DefsViewManager();
        }
    }

    class d implements Provider {
        d() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.UseViewManager();
        }
    }

    class e implements Provider {
        e() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.SymbolManager();
        }
    }

    class f implements Provider {
        f() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.LinearGradientManager();
        }
    }

    class g implements Provider {
        g() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.RadialGradientManager();
        }
    }

    class h implements Provider {
        h() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.PatternManager();
        }
    }

    class i implements Provider {
        i() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.MaskManager();
        }
    }

    class j implements Provider {
        j() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FilterManager();
        }
    }

    class k implements Provider {
        k() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.GroupViewManager();
        }
    }

    class l implements Provider {
        l() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeColorMatrixManager();
        }
    }

    class m implements Provider {
        m() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeGaussianBlurManager();
        }
    }

    class n implements Provider {
        n() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeMergeManager();
        }
    }

    class o implements Provider {
        o() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.FeOffsetManager();
        }
    }

    class p implements Provider {
        p() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.ForeignObjectManager();
        }
    }

    class q implements Provider {
        q() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.MarkerManager();
        }
    }

    class r implements Provider {
        r() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new SvgViewManager();
        }
    }

    class s implements InterfaceC1778a {
        s() {
        }

        @Override // j2.InterfaceC1778a
        public Map a() {
            HashMap map = new HashMap();
            Class[] clsArr = {SvgViewModule.class, RNSVGRenderableManager.class};
            for (int i7 = 0; i7 < 2; i7++) {
                Class cls = clsArr[i7];
                InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
                map.put(interfaceC1741a.name(), new ReactModuleInfo(interfaceC1741a.name(), cls.getName(), interfaceC1741a.canOverrideExistingModule(), interfaceC1741a.needsEagerInit(), interfaceC1741a.hasConstants(), interfaceC1741a.isCxxModule(), true));
            }
            return map;
        }
    }

    class t implements Provider {
        t() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.PathViewManager();
        }
    }

    class u implements Provider {
        u() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.CircleViewManager();
        }
    }

    class v implements Provider {
        v() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.EllipseViewManager();
        }
    }

    class w implements Provider {
        w() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.LineViewManager();
        }
    }

    class x implements Provider {
        x() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.RectViewManager();
        }
    }

    class y implements Provider {
        y() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TextViewManager();
        }
    }

    class z implements Provider {
        z() {
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return new RenderableViewManager.TSpanViewManager();
        }
    }

    private Map<String, ModuleSpec> getViewManagersMap(ReactApplicationContext reactApplicationContext) {
        if (this.mViewManagers == null) {
            HashMap mapB = S1.f.b();
            mapB.put(RenderableViewManager.GroupViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new k()));
            mapB.put(RenderableViewManager.PathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new t()));
            mapB.put(RenderableViewManager.CircleViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new u()));
            mapB.put(RenderableViewManager.EllipseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new v()));
            mapB.put(RenderableViewManager.LineViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new w()));
            mapB.put(RenderableViewManager.RectViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new x()));
            mapB.put(RenderableViewManager.TextViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new y()));
            mapB.put(RenderableViewManager.TSpanViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new z()));
            mapB.put(RenderableViewManager.TextPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new A()));
            mapB.put(RenderableViewManager.ImageViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C1561a()));
            mapB.put(RenderableViewManager.ClipPathViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new b()));
            mapB.put(RenderableViewManager.DefsViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new c()));
            mapB.put(RenderableViewManager.UseViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new d()));
            mapB.put(RenderableViewManager.SymbolManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new e()));
            mapB.put(RenderableViewManager.LinearGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new f()));
            mapB.put(RenderableViewManager.RadialGradientManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new g()));
            mapB.put(RenderableViewManager.PatternManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new h()));
            mapB.put(RenderableViewManager.MaskManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new i()));
            mapB.put(RenderableViewManager.FilterManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new j()));
            mapB.put(RenderableViewManager.FeColorMatrixManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new l()));
            mapB.put(RenderableViewManager.FeGaussianBlurManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new m()));
            mapB.put(RenderableViewManager.FeMergeManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new n()));
            mapB.put(RenderableViewManager.FeOffsetManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new o()));
            mapB.put(RenderableViewManager.ForeignObjectManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new p()));
            mapB.put(RenderableViewManager.MarkerManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new q()));
            mapB.put(SvgViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new r()));
            this.mViewManagers = mapB;
        }
        return this.mViewManagers;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.Z
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str) {
        ModuleSpec moduleSpec = getViewManagersMap(reactApplicationContext).get(str);
        if (moduleSpec != null) {
            return (ViewManager) moduleSpec.getProvider().get();
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals("RNSVGRenderableModule")) {
            return new RNSVGRenderableManager(reactApplicationContext);
        }
        if (str.equals("RNSVGSvgViewModule")) {
            return new SvgViewModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        try {
            return (InterfaceC1778a) Class.forName("com.horcrux.svg.SvgPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return new s();
        } catch (IllegalAccessException e7) {
            e = e7;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        } catch (InstantiationException e8) {
            e = e8;
            throw new RuntimeException("No ReactModuleInfoProvider for MyPackage$$ReactModuleInfoProvider", e);
        }
    }

    @Override // com.facebook.react.AbstractC0794b
    protected List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).values());
    }

    @Override // com.facebook.react.Z
    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext) {
        return new ArrayList(getViewManagersMap(reactApplicationContext).keySet());
    }
}
