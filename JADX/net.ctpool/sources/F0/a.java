package F0;

import com.ctpool.updater.UpdaterModule;
import com.facebook.react.M;
import com.facebook.react.bridge.ReactApplicationContext;
import j5.AbstractC1809n;
import java.util.List;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements M {
    @Override // com.facebook.react.M
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        k.f(reactApplicationContext, "context");
        return AbstractC1809n.d(new UpdaterModule(reactApplicationContext));
    }

    @Override // com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        k.f(reactApplicationContext, "context");
        return AbstractC1809n.i();
    }
}
