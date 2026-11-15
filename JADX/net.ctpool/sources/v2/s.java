package v2;

import com.facebook.react.Y;
import com.facebook.react.Z;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.blob.BlobModule;
import com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.modules.clipboard.ClipboardModule;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.facebook.react.modules.devtoolssettings.DevToolsSettingsManagerModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.fresco.FrescoModule;
import com.facebook.react.modules.i18nmanager.I18nManagerModule;
import com.facebook.react.modules.image.ImageLoaderModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.modules.share.ShareModule;
import com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.vibration.VibrationModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollContainerViewManager;
import com.facebook.react.views.scroll.ReactHorizontalScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import com.facebook.react.views.switchview.ReactSwitchManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.views.text.frescosupport.FrescoBasedReactTextInlineImageViewManager;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.unimplementedview.ReactUnimplementedViewManager;
import com.facebook.react.views.view.ReactViewManager;
import i2.InterfaceC1741a;
import j2.InterfaceC1778a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public class s extends Y implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f22582a;

    public s(AbstractC2156a abstractC2156a) {
    }

    private static void f(Map map, String str, Provider provider) {
        map.put(str, ModuleSpec.viewManagerSpec(provider));
    }

    private InterfaceC1778a g() {
        Class[] clsArr = {AccessibilityInfoModule.class, AppearanceModule.class, AppStateModule.class, BlobModule.class, DevLoadingModule.class, FileReaderModule.class, ClipboardModule.class, DialogModule.class, FrescoModule.class, I18nManagerModule.class, ImageLoaderModule.class, ImageStoreManager.class, IntentModule.class, NativeAnimatedModule.class, NetworkingModule.class, PermissionsModule.class, DevToolsSettingsManagerModule.class, ShareModule.class, StatusBarModule.class, SoundManagerModule.class, ToastModule.class, VibrationModule.class, WebSocketModule.class};
        final HashMap map = new HashMap();
        for (int i7 = 0; i7 < 23; i7++) {
            Class cls = clsArr[i7];
            InterfaceC1741a interfaceC1741a = (InterfaceC1741a) cls.getAnnotation(InterfaceC1741a.class);
            if (interfaceC1741a != null) {
                map.put(interfaceC1741a.name(), new ReactModuleInfo(interfaceC1741a.name(), cls.getName(), interfaceC1741a.canOverrideExistingModule(), interfaceC1741a.needsEagerInit(), interfaceC1741a.isCxxModule(), ReactModuleInfo.b(cls)));
            }
        }
        return new InterfaceC1778a() { // from class: v2.i
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return s.i(map);
            }
        };
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
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactDrawerLayoutManager());
        arrayList.add(new ReactHorizontalScrollViewManager());
        arrayList.add(new ReactHorizontalScrollContainerViewManager());
        arrayList.add(new ReactProgressBarViewManager());
        arrayList.add(new ReactScrollViewManager());
        arrayList.add(new ReactSwitchManager());
        arrayList.add(new SwipeRefreshLayoutManager());
        arrayList.add(new FrescoBasedReactTextInlineImageViewManager());
        arrayList.add(new ReactImageManager());
        arrayList.add(new ReactModalHostManager());
        arrayList.add(new ReactRawTextManager());
        arrayList.add(new ReactTextInputManager());
        arrayList.add(new ReactTextViewManager());
        arrayList.add(new ReactViewManager());
        arrayList.add(new ReactVirtualTextViewManager());
        arrayList.add(new ReactUnimplementedViewManager());
        return arrayList;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        switch (str) {
            case "ToastAndroid":
                return new ToastModule(reactApplicationContext);
            case "ImageStoreManager":
                return new ImageStoreManager(reactApplicationContext);
            case "SoundManager":
                return new SoundManagerModule(reactApplicationContext);
            case "DialogManagerAndroid":
                return new DialogModule(reactApplicationContext);
            case "FileReaderModule":
                return new FileReaderModule(reactApplicationContext);
            case "PermissionsAndroid":
                return new PermissionsModule(reactApplicationContext);
            case "ImageLoader":
                return new ImageLoaderModule(reactApplicationContext);
            case "I18nManager":
                return new I18nManagerModule(reactApplicationContext);
            case "Appearance":
                return new AppearanceModule(reactApplicationContext);
            case "AccessibilityInfo":
                return new AccessibilityInfoModule(reactApplicationContext);
            case "StatusBarManager":
                return new StatusBarModule(reactApplicationContext);
            case "WebSocketModule":
                return new WebSocketModule(reactApplicationContext);
            case "DevLoadingView":
                return new DevLoadingModule(reactApplicationContext);
            case "FrescoModule":
                return new FrescoModule(reactApplicationContext, true, (y1.l) null);
            case "Clipboard":
                return new ClipboardModule(reactApplicationContext);
            case "DevToolsSettingsManager":
                return new DevToolsSettingsManagerModule(reactApplicationContext);
            case "IntentAndroid":
                return new IntentModule(reactApplicationContext);
            case "AppState":
                return new AppStateModule(reactApplicationContext);
            case "Networking":
                return new NetworkingModule(reactApplicationContext);
            case "BlobModule":
                return new BlobModule(reactApplicationContext);
            case "ShareModule":
                return new ShareModule(reactApplicationContext);
            case "NativeAnimatedModule":
                return new NativeAnimatedModule(reactApplicationContext);
            case "Vibration":
                return new VibrationModule(reactApplicationContext);
            default:
                return null;
        }
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        if (!S1.a.a()) {
            return g();
        }
        try {
            return (InterfaceC1778a) S1.a.b("com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            return g();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("No ReactModuleInfoProvider for com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider", e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("No ReactModuleInfoProvider for com.facebook.react.shell.MainReactPackage$$ReactModuleInfoProvider", e8);
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

    public Map h() {
        if (this.f22582a == null) {
            HashMap map = new HashMap();
            f(map, ReactDrawerLayoutManager.REACT_CLASS, new Provider() { // from class: v2.b
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactDrawerLayoutManager();
                }
            });
            f(map, ReactHorizontalScrollViewManager.REACT_CLASS, new Provider() { // from class: v2.p
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactHorizontalScrollViewManager();
                }
            });
            f(map, ReactHorizontalScrollContainerViewManager.REACT_CLASS, new Provider() { // from class: v2.q
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactHorizontalScrollContainerViewManager();
                }
            });
            f(map, ReactProgressBarViewManager.REACT_CLASS, new Provider() { // from class: v2.r
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactProgressBarViewManager();
                }
            });
            f(map, ReactScrollViewManager.REACT_CLASS, new Provider() { // from class: v2.c
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactScrollViewManager();
                }
            });
            f(map, ReactSwitchManager.REACT_CLASS, new Provider() { // from class: v2.d
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactSwitchManager();
                }
            });
            f(map, SwipeRefreshLayoutManager.REACT_CLASS, new Provider() { // from class: v2.e
                @Override // javax.inject.Provider
                public final Object get() {
                    return new SwipeRefreshLayoutManager();
                }
            });
            f(map, FrescoBasedReactTextInlineImageViewManager.REACT_CLASS, new Provider() { // from class: v2.f
                @Override // javax.inject.Provider
                public final Object get() {
                    return new FrescoBasedReactTextInlineImageViewManager();
                }
            });
            f(map, ReactImageManager.REACT_CLASS, new Provider() { // from class: v2.g
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactImageManager();
                }
            });
            f(map, ReactModalHostManager.REACT_CLASS, new Provider() { // from class: v2.h
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactModalHostManager();
                }
            });
            f(map, ReactRawTextManager.REACT_CLASS, new Provider() { // from class: v2.j
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactRawTextManager();
                }
            });
            f(map, ReactTextInputManager.REACT_CLASS, new Provider() { // from class: v2.k
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactTextInputManager();
                }
            });
            f(map, ReactTextViewManager.REACT_CLASS, new Provider() { // from class: v2.l
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactTextViewManager();
                }
            });
            f(map, ReactViewManager.REACT_CLASS, new Provider() { // from class: v2.m
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactViewManager();
                }
            });
            f(map, ReactVirtualTextViewManager.REACT_CLASS, new Provider() { // from class: v2.n
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactVirtualTextViewManager();
                }
            });
            f(map, ReactUnimplementedViewManager.REACT_CLASS, new Provider() { // from class: v2.o
                @Override // javax.inject.Provider
                public final Object get() {
                    return new ReactUnimplementedViewManager();
                }
            });
            this.f22582a = map;
        }
        return this.f22582a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map i(Map map) {
        return map;
    }
}
