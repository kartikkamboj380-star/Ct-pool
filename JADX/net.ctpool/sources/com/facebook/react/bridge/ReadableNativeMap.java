package com.facebook.react.bridge;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static final Companion Companion = new Companion(null);
    private static int jniPassCounter;
    private final Lazy keys$delegate;
    private final Lazy localMap$delegate;
    private final Lazy localTypeMap$delegate;

    /* JADX INFO: Access modifiers changed from: private */
    static final class Companion {
        private Companion() {
        }

        public final int getJNIPassCounter() {
            return ReadableNativeMap.jniPassCounter;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ReactBridge.staticInit();
    }

    protected ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
        i5.j jVar = i5.j.f19966m;
        this.keys$delegate = i5.g.a(jVar, new ReadableNativeMap$keys$2(this));
        this.localMap$delegate = i5.g.a(jVar, new ReadableNativeMap$localMap$2(this));
        this.localTypeMap$delegate = i5.g.a(jVar, new ReadableNativeMap$localTypeMap$2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ReflectionMethodUse"})
    private final /* synthetic */ <T> T checkInstance(String str, Object obj, Class<T> cls) {
        w5.k.j(2, "T");
        if (obj != 0) {
            return obj;
        }
        String simpleName = obj != 0 ? obj.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + cls.getSimpleName());
    }

    public static final int getJNIPassCounter() {
        return Companion.getJNIPassCounter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String[] getKeys() {
        return (String[]) this.keys$delegate.getValue();
    }

    private final HashMap<String, Object> getLocalMap() {
        return (HashMap) this.localMap$delegate.getValue();
    }

    private final HashMap<String, ReadableType> getLocalTypeMap() {
        return (HashMap) this.localTypeMap$delegate.getValue();
    }

    private final Object getNullableValue(String str) {
        return getLocalMap().get(str);
    }

    private final Object getValue(String str) {
        if (!hasKey(str)) {
            throw new NoSuchKeyException(str);
        }
        Object objC = O1.a.c(getLocalMap().get(str));
        w5.k.e(objC, "assertNotNull(...)");
        return objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native String[] importKeys();

    /* JADX INFO: Access modifiers changed from: private */
    public final native Object[] importTypes();

    /* JADX INFO: Access modifiers changed from: private */
    public final native Object[] importValues();

    public boolean equals(Object obj) {
        if (obj instanceof ReadableNativeMap) {
            return w5.k.b(getLocalMap(), ((ReadableNativeMap) obj).getLocalMap());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String str) {
        w5.k.f(str, "name");
        Object nullableValue = getNullableValue(str);
        ReadableArray readableArray = null;
        if (nullableValue != null) {
            readableArray = (ReadableArray) (nullableValue instanceof ReadableArray ? nullableValue : null);
            if (readableArray == null) {
                String simpleName = nullableValue.getClass().getSimpleName();
                w5.k.c(simpleName);
                throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + ReadableArray.class.getSimpleName());
            }
        }
        return readableArray;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String str) {
        w5.k.f(str, "name");
        Class cls = Boolean.TYPE;
        Object value = getValue(str);
        Boolean bool = (Boolean) (!(value instanceof Boolean) ? null : value);
        if (bool != null) {
            return bool.booleanValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            w5.k.c(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + cls.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String str) {
        w5.k.f(str, "name");
        Class cls = Double.TYPE;
        Object value = getValue(str);
        Double d7 = (Double) (!(value instanceof Double) ? null : value);
        if (d7 != null) {
            return d7.doubleValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            w5.k.c(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + cls.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String str) {
        w5.k.f(str, "name");
        DynamicFromMap dynamicFromMapCreate = DynamicFromMap.create(this, str);
        w5.k.e(dynamicFromMapCreate, "create(...)");
        return dynamicFromMapCreate;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        ReadableNativeMap$entryIterator$1$1 readableNativeMap$entryIterator$1$1;
        synchronized (this) {
            String[] keys = getKeys();
            Object[] objArrImportValues = importValues();
            jniPassCounter++;
            readableNativeMap$entryIterator$1$1 = new ReadableNativeMap$entryIterator$1$1(keys, objArrImportValues);
        }
        return readableNativeMap$entryIterator$1$1;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String str) {
        w5.k.f(str, "name");
        Class cls = Double.TYPE;
        Object value = getValue(str);
        Double d7 = (Double) (!(value instanceof Double) ? null : value);
        if (d7 != null) {
            return (int) d7.doubleValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            w5.k.c(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + cls.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(String str) {
        w5.k.f(str, "name");
        Class cls = Long.TYPE;
        Object value = getValue(str);
        Long l7 = (Long) (!(value instanceof Long) ? null : value);
        if (l7 != null) {
            return l7.longValue();
        }
        String simpleName = value != null ? value.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            w5.k.c(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + cls.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String str) {
        w5.k.f(str, "name");
        Object nullableValue = getNullableValue(str);
        String str2 = null;
        if (nullableValue != null) {
            str2 = (String) (nullableValue instanceof String ? nullableValue : null);
            if (str2 == null) {
                String simpleName = nullableValue.getClass().getSimpleName();
                w5.k.c(simpleName);
                throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + String.class.getSimpleName());
            }
        }
        return str2;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String str) {
        w5.k.f(str, "name");
        ReadableType readableType = getLocalTypeMap().get(str);
        if (readableType != null) {
            return readableType;
        }
        throw new NoSuchKeyException(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String str) {
        w5.k.f(str, "name");
        return getLocalMap().containsKey(str);
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String str) {
        w5.k.f(str, "name");
        if (getLocalMap().containsKey(str)) {
            return getLocalMap().get(str) == null;
        }
        throw new NoSuchKeyException(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        final String[] keys = getKeys();
        return new ReadableMapKeySetIterator() { // from class: com.facebook.react.bridge.ReadableNativeMap.keySetIterator.1
            private int currentIndex;

            public final int getCurrentIndex() {
                return this.currentIndex;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.currentIndex < keys.length;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                String[] strArr = keys;
                int i7 = this.currentIndex;
                this.currentIndex = i7 + 1;
                return strArr[i7];
            }

            public final void setCurrentIndex(int i7) {
                this.currentIndex = i7;
            }
        };
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        Object hashMap;
        HashMap<String, Object> map = new HashMap<>(getLocalMap());
        for (String str : map.keySet()) {
            w5.k.d(str, "null cannot be cast to non-null type kotlin.String");
            String str2 = str;
            switch (WhenMappings.$EnumSwitchMapping$0[getType(str2).ordinal()]) {
                case 5:
                    hashMap = ((ReadableNativeMap) O1.a.c(getMap(str2))).toHashMap();
                    map.put(str2, hashMap);
                    break;
                case 6:
                    hashMap = ((ReadableArray) O1.a.c(getArray(str2))).toArrayList();
                    map.put(str2, hashMap);
                    break;
            }
        }
        return map;
    }

    private final /* synthetic */ <T> T getNullableValue(String str, Class<T> cls) {
        T t6 = (T) getNullableValue(str);
        if (t6 == null) {
            return null;
        }
        w5.k.j(2, "T");
        return t6;
    }

    private final /* synthetic */ <T> T getValue(String str, Class<T> cls) {
        T t6 = (T) getValue(str);
        w5.k.j(2, "T");
        if (t6 != null) {
            return t6;
        }
        String simpleName = t6 != null ? t6.getClass().getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            w5.k.c(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + cls.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableNativeMap getMap(String str) {
        w5.k.f(str, "name");
        Object nullableValue = getNullableValue(str);
        ReadableNativeMap readableNativeMap = null;
        if (nullableValue != null) {
            readableNativeMap = (ReadableNativeMap) (nullableValue instanceof ReadableNativeMap ? nullableValue : null);
            if (readableNativeMap == null) {
                String simpleName = nullableValue.getClass().getSimpleName();
                w5.k.c(simpleName);
                throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + ReadableNativeMap.class.getSimpleName());
            }
        }
        return readableNativeMap;
    }
}
