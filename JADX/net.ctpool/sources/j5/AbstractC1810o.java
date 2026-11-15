package j5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k5.C1835b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: j5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1810o {
    public static List a(List list) {
        w5.k.f(list, "builder");
        return ((C1835b) list).q();
    }

    public static final Object[] b(Object[] objArr, boolean z6) {
        w5.k.f(objArr, "<this>");
        if (z6 && w5.k.b(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        w5.k.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new C1835b();
    }

    public static List d(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        w5.k.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] e(int i7, Object[] objArr) {
        w5.k.f(objArr, "array");
        if (i7 < objArr.length) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
