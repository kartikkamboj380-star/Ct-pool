package j5;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: j5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1804i {
    public static final Object[] a(Object[] objArr, int i7) {
        w5.k.f(objArr, "reference");
        Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
        w5.k.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void b(int i7, int i8) {
        if (i7 <= i8) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i7 + ") is greater than size (" + i8 + ").");
    }
}
