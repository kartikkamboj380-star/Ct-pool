package A0;

import com.RNAppleAuthentication.AppleAuthenticationAndroidModule;
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
        arrayList.add(new AppleAuthenticationAndroidModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.M
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
