package j5;

import java.util.Collections;
import java.util.Set;
import k5.C1841h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j5.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1795N {
    public static Set a(Set set) {
        w5.k.f(set, "builder");
        return ((C1841h) set).h();
    }

    public static Set b() {
        return new C1841h();
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        w5.k.e(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
