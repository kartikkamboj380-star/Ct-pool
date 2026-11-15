package com.uerceg.play_install_referrer;

import com.facebook.react.M;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements M {
    @Override // com.facebook.react.M
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PlayInstallReferrer(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
