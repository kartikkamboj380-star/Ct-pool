package io.invertase.firebase.app;

import com.facebook.react.M;
import com.facebook.react.bridge.ReactApplicationContext;
import io.invertase.firebase.utils.ReactNativeFirebaseUtilsModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements M {
    @Override // com.facebook.react.M
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        if (a.a() == null) {
            a.b(reactApplicationContext.getApplicationContext());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactNativeFirebaseAppModule(reactApplicationContext));
        arrayList.add(new ReactNativeFirebaseUtilsModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
