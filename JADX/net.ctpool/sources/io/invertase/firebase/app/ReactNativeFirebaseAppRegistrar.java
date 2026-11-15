package io.invertase.firebase.app;

import L4.h;
import androidx.annotation.Keep;
import b4.C0688c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class ReactNativeFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0688c> getComponents() {
        return Collections.singletonList(h.b("react-native-firebase", c.f20100a));
    }
}
