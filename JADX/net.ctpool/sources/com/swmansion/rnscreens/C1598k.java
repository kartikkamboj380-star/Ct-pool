package com.swmansion.rnscreens;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import j2.InterfaceC1778a;
import j5.AbstractC1809n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.swmansion.rnscreens.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1598k extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18415a = new a(null);

    /* JADX INFO: renamed from: com.swmansion.rnscreens.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f() {
        HashMap map = new HashMap();
        map.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, true, false, false));
        return map;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        w5.k.f(reactApplicationContext, "reactContext");
        return AbstractC1809n.k(new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager());
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        w5.k.f(str, "s");
        w5.k.f(reactApplicationContext, "reactApplicationContext");
        if (w5.k.b(str, "RNSModule")) {
            return new ScreensModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        return new InterfaceC1778a() { // from class: com.swmansion.rnscreens.j
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return C1598k.f();
            }
        };
    }
}
