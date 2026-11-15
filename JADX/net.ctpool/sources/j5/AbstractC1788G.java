package j5;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j5.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1788G {
    public static final Object a(Map map, Object obj) {
        w5.k.f(map, "<this>");
        if (map instanceof InterfaceC1786E) {
            return ((InterfaceC1786E) map).c(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
