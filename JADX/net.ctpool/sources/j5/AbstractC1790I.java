package j5;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j5.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1790I extends AbstractC1789H {
    public static Map g() {
        C1782A c1782a = C1782A.f20409m;
        w5.k.d(c1782a, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c1782a;
    }

    public static Object h(Map map, Object obj) {
        w5.k.f(map, "<this>");
        return AbstractC1788G.a(map, obj);
    }

    public static Map i(i5.l... lVarArr) {
        w5.k.f(lVarArr, "pairs");
        return lVarArr.length > 0 ? r(lVarArr, new LinkedHashMap(AbstractC1787F.d(lVarArr.length))) : AbstractC1787F.g();
    }

    public static Map j(i5.l... lVarArr) {
        w5.k.f(lVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1787F.d(lVarArr.length));
        n(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    public static final Map k(Map map) {
        w5.k.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : AbstractC1789H.f(map) : AbstractC1787F.g();
    }

    public static Map l(Map map, i5.l lVar) {
        w5.k.f(map, "<this>");
        w5.k.f(lVar, "pair");
        if (map.isEmpty()) {
            return AbstractC1787F.e(lVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(lVar.c(), lVar.d());
        return linkedHashMap;
    }

    public static final void m(Map map, Iterable iterable) {
        w5.k.f(map, "<this>");
        w5.k.f(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i5.l lVar = (i5.l) it.next();
            map.put(lVar.a(), lVar.b());
        }
    }

    public static final void n(Map map, i5.l[] lVarArr) {
        w5.k.f(map, "<this>");
        w5.k.f(lVarArr, "pairs");
        for (i5.l lVar : lVarArr) {
            map.put(lVar.a(), lVar.b());
        }
    }

    public static Map o(Iterable iterable) {
        w5.k.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k(p(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC1787F.g();
        }
        if (size != 1) {
            return p(iterable, new LinkedHashMap(AbstractC1787F.d(collection.size())));
        }
        return AbstractC1787F.e((i5.l) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final Map p(Iterable iterable, Map map) {
        w5.k.f(iterable, "<this>");
        w5.k.f(map, "destination");
        m(map, iterable);
        return map;
    }

    public static Map q(Map map) {
        w5.k.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? AbstractC1787F.s(map) : AbstractC1789H.f(map) : AbstractC1787F.g();
    }

    public static final Map r(i5.l[] lVarArr, Map map) {
        w5.k.f(lVarArr, "<this>");
        w5.k.f(map, "destination");
        n(map, lVarArr);
        return map;
    }

    public static Map s(Map map) {
        w5.k.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
