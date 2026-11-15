package f5;

import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.zoontek.rnlocalize.RNLocalizeModule;
import j2.InterfaceC1778a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: f5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1664k extends Y {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap map = new HashMap();
        map.put("RNLocalize", new ReactModuleInfo("RNLocalize", "RNLocalize", false, false, true, false, false));
        return map;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNLocalize")) {
            return new RNLocalizeModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        return new InterfaceC1778a() { // from class: f5.j
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return C1664k.f();
            }
        };
    }
}
