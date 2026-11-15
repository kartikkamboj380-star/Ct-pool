package y0;

import cl.json.RNShare;
import com.facebook.react.Y;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import j2.InterfaceC1778a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: y0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2234c extends Y {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map f() {
        HashMap map = new HashMap();
        map.put("RNShare", new ReactModuleInfo("RNShare", "RNShare", false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.AbstractC0794b, com.facebook.react.M
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals("RNShare")) {
            return new RNShare(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC0794b
    public InterfaceC1778a getReactModuleInfoProvider() {
        return new InterfaceC1778a() { // from class: y0.b
            @Override // j2.InterfaceC1778a
            public final Map a() {
                return C2234c.f();
            }
        };
    }
}
