package com.facebook.react.uimanager;

import com.facebook.react.config.ReactFeatureFlags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    static Map a(H0 h02) {
        Map mapB = m0.b();
        mapB.put("ViewManagerNames", new ArrayList(h02.a()));
        mapB.put("LazyViewManagersEnabled", Boolean.TRUE);
        return mapB;
    }

    static Map b(List list, Map map, Map map2) {
        Map mapB = m0.b();
        Map mapA = m0.a();
        Map mapC = m0.c();
        if (map != null) {
            map.putAll(mapA);
        }
        if (map2 != null) {
            map2.putAll(mapC);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            String name = viewManager.getName();
            Map mapC2 = c(viewManager, null, null, map, map2);
            if (!mapC2.isEmpty()) {
                mapB.put(name, mapC2);
            }
        }
        mapB.put("genericBubblingEventTypes", mapA);
        mapB.put("genericDirectEventTypes", mapC);
        return mapB;
    }

    static Map c(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        HashMap mapB = S1.f.b();
        Map<String, Object> exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (ReactFeatureFlags.enableFabricRenderer && ReactFeatureFlags.unstable_useFabricInterop) {
                e(exportedCustomBubblingEventTypeConstants);
            }
            f(map3, exportedCustomBubblingEventTypeConstants);
            f(exportedCustomBubblingEventTypeConstants, map);
            mapB.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            mapB.put("bubblingEventTypes", map);
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        g(viewManager.getName(), exportedCustomDirectEventTypeConstants);
        if (exportedCustomDirectEventTypeConstants != null) {
            if (ReactFeatureFlags.enableFabricRenderer && ReactFeatureFlags.unstable_useFabricInterop) {
                e(exportedCustomDirectEventTypeConstants);
            }
            f(map4, exportedCustomDirectEventTypeConstants);
            f(exportedCustomDirectEventTypeConstants, map2);
            mapB.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            mapB.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            mapB.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            mapB.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            mapB.put("NativeProps", nativeProps);
        }
        return mapB;
    }

    public static Map d() {
        return S1.f.e("bubblingEventTypes", m0.a(), "directEventTypes", m0.c());
    }

    static void e(Map map) {
        if (map == null) {
            return;
        }
        HashSet<String> hashSet = new HashSet();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (!str.startsWith("top")) {
                    hashSet.add(str);
                }
            }
        }
        if (!(map instanceof HashMap)) {
            map = new HashMap(map);
        }
        for (String str2 : hashSet) {
            map.put("top" + (str2.startsWith("on") ? str2.substring(2) : str2.substring(0, 1).toUpperCase() + str2.substring(1)), map.get(str2));
        }
    }

    private static void f(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Object obj : map2.keySet()) {
            Object obj2 = map2.get(obj);
            Object obj3 = map.get(obj);
            if (obj3 != null && (obj2 instanceof Map) && (obj3 instanceof Map)) {
                if (!(obj3 instanceof HashMap)) {
                    HashMap map3 = new HashMap((Map) obj3);
                    map.replace(obj, map3);
                    obj3 = map3;
                }
                f((Map) obj3, (Map) obj2);
            } else {
                map.put(obj, obj2);
            }
        }
    }

    private static void g(String str, Map map) {
    }
}
