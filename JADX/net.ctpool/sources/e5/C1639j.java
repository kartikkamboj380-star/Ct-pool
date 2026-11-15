package e5;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.zoontek.rnbootsplash.RNBootSplashModule;
import j2.InterfaceC1778a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: e5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1639j extends Y {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap map = new HashMap();
        map.put("RNBootSplash", new ReactModuleInfo("RNBootSplash", "RNBootSplash", false, false, true, false, false));
        return map;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNBootSplash")) {
            return new RNBootSplashModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        return new InterfaceC1778a() { // from class: e5.i
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return C1639j.f();
            }
        };
    }
}
