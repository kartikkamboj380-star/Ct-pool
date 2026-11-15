package androidx.work;

import androidx.work.b;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l0.g;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends g {
    private final Object c(Object obj, Object obj2, Class cls) {
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj2);
        k.e(objNewInstance, "newArray");
        return objNewInstance;
    }

    private final Object d(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        k.c(componentType);
        Object objNewInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        System.arraycopy(obj2, 0, objNewInstance, length, length2);
        k.e(objNewInstance, "newArray");
        return objNewInstance;
    }

    private final Object e(Object obj, Class cls) {
        Object objNewInstance = Array.newInstance((Class<?>) cls, 1);
        Array.set(objNewInstance, 0, obj);
        k.e(objNewInstance, "newArray");
        return objNewInstance;
    }

    @Override // l0.g
    public b b(List list) throws Throwable {
        k.f(list, "inputs");
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map mapL = ((b) it.next()).l();
            k.e(mapL, "input.keyValueMap");
            for (Map.Entry entry : mapL.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(str);
                k.e(str, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (k.b(cls2, cls)) {
                        k.e(value, "value");
                        value = d(obj, value);
                    } else {
                        if (!k.b(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        value = c(obj, value, cls);
                    }
                } else if (!cls.isArray()) {
                    value = e(value, cls);
                }
                k.e(value, "if (existingValue == nul…      }\n                }");
                map.put(str, value);
            }
        }
        aVar.d(map);
        b bVarA = aVar.a();
        k.e(bVarA, "output.build()");
        return bVarA;
    }
}
