package com.dooboolab.rniap;

import com.facebook.react.M;
import com.facebook.react.bridge.ReactApplicationContext;
import j5.AbstractC1809n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o implements M {
    @Override // com.facebook.react.M
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        w5.k.f(reactApplicationContext, "reactContext");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNIapModule(reactApplicationContext, null, null, 6, null));
        return arrayList;
    }

    @Override // com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        w5.k.f(reactApplicationContext, "reactContext");
        return AbstractC1809n.i();
    }
}
