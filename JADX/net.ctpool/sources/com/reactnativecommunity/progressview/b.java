package com.reactnativecommunity.progressview;

import com.facebook.react.M;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b implements M {
    @Override // com.facebook.react.M
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new RNCProgressViewManager());
    }
}
