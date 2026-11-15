package T4;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static boolean a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }
}
