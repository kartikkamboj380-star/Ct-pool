package j5;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.Map;
import k5.C1837d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j5.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1789H extends AbstractC1788G {
    public static Map b(Map map) {
        w5.k.f(map, "builder");
        return ((C1837d) map).l();
    }

    public static Map c() {
        return new C1837d();
    }

    public static int d(int i7) {
        return i7 < 0 ? i7 : i7 < 3 ? i7 + 1 : i7 < 1073741824 ? (int) ((i7 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static Map e(i5.l lVar) {
        w5.k.f(lVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(lVar.c(), lVar.d());
        w5.k.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map f(Map map) {
        w5.k.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        w5.k.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
