package f3;

import S2.f;
import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: renamed from: f3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1649a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray f19297a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap f19298b;

    static {
        HashMap map = new HashMap();
        f19298b = map;
        map.put(f.DEFAULT, 0);
        f19298b.put(f.VERY_LOW, 1);
        f19298b.put(f.HIGHEST, 2);
        for (f fVar : f19298b.keySet()) {
            f19297a.append(((Integer) f19298b.get(fVar)).intValue(), fVar);
        }
    }

    public static int a(f fVar) {
        Integer num = (Integer) f19298b.get(fVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + fVar);
    }

    public static f b(int i7) {
        f fVar = (f) f19297a.get(i7);
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i7);
    }
}
