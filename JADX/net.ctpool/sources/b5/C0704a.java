package b5;

import com.facebook.react.M;
import com.facebook.react.bridge.ReactApplicationContext;
import com.sparkfabrik.rnidfaaaid.ReactNativeIdfaAaidModule;
import j5.AbstractC1809n;
import java.util.Arrays;
import java.util.List;
import w5.k;

/* JADX INFO: renamed from: b5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0704a implements M {
    @Override // com.facebook.react.M
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        k.f(reactApplicationContext, "reactContext");
        List listAsList = Arrays.asList(new ReactNativeIdfaAaidModule(reactApplicationContext));
        k.e(listAsList, "asList(...)");
        return listAsList;
    }

    @Override // com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        k.f(reactApplicationContext, "reactContext");
        return AbstractC1809n.i();
    }
}
