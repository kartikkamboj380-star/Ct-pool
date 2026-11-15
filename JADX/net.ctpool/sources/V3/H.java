package V3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class H {
    static Object[] a(Object[] objArr, int i7, int i8, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i7, i8, objArr2.getClass());
    }

    static Object[] b(Object[] objArr, int i7) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
    }

    static Map c() {
        return C0481i.s();
    }
}
