package M5;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: M5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0435l {
    public static /* synthetic */ Object b(Object obj, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i7 & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final Object c(Object obj, Object obj2) {
        if (obj == null) {
            return a(obj2);
        }
        if (obj instanceof ArrayList) {
            w5.k.d(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return a(arrayList);
    }

    public static Object a(Object obj) {
        return obj;
    }
}
