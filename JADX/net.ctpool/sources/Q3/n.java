package Q3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f2768a = new HashSet(Arrays.asList("app_update", "review"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f2769b = new HashSet(Arrays.asList("native", "unity"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f2770c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p f2771d = new p("PlayCoreVersion");

    public static synchronized Map a(String str) {
        Map map;
        try {
            map = f2770c;
            if (!map.containsKey("app_update")) {
                HashMap map2 = new HashMap();
                map2.put("java", 11004);
                map.put("app_update", map2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) map.get("app_update");
    }
}
