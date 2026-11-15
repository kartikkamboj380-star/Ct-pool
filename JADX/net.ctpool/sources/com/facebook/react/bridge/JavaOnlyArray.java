package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class JavaOnlyArray implements ReadableArray, WritableArray {
    private final List mBackingList;

    /* JADX INFO: renamed from: com.facebook.react.bridge.JavaOnlyArray$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public JavaOnlyArray() {
        this.mBackingList = new ArrayList();
    }

    public static JavaOnlyArray deepClone(ReadableArray readableArray) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i7).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i7));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i7));
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i7));
                    break;
                case 5:
                    javaOnlyArray.pushMap(JavaOnlyMap.deepClone(readableArray.getMap(i7)));
                    break;
                case 6:
                    javaOnlyArray.pushArray(deepClone(readableArray.getArray(i7)));
                    break;
            }
        }
        return javaOnlyArray;
    }

    public static JavaOnlyArray from(List list) {
        return new JavaOnlyArray(list);
    }

    public static JavaOnlyArray of(Object... objArr) {
        return new JavaOnlyArray(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        List list = this.mBackingList;
        List list2 = ((JavaOnlyArray) obj).mBackingList;
        return list == null ? list2 == null : list.equals(list2);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableArray getArray(int i7) {
        return (ReadableArray) this.mBackingList.get(i7);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int i7) {
        return ((Boolean) this.mBackingList.get(i7)).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int i7) {
        return ((Number) this.mBackingList.get(i7)).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public Dynamic getDynamic(int i7) {
        return DynamicFromArray.create(this, i7);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int i7) {
        return ((Number) this.mBackingList.get(i7)).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public long getLong(int i7) {
        return ((Number) this.mBackingList.get(i7)).longValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableMap getMap(int i7) {
        return (ReadableMap) this.mBackingList.get(i7);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public String getString(int i7) {
        return (String) this.mBackingList.get(i7);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableType getType(int i7) {
        Object obj = this.mBackingList.get(i7);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        return null;
    }

    public int hashCode() {
        List list = this.mBackingList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int i7) {
        return this.mBackingList.get(i7) == null;
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(ReadableArray readableArray) {
        this.mBackingList.add(readableArray);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushBoolean(boolean z6) {
        this.mBackingList.add(Boolean.valueOf(z6));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushDouble(double d7) {
        this.mBackingList.add(Double.valueOf(d7));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushInt(int i7) {
        this.mBackingList.add(new Double(i7));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushLong(long j7) {
        this.mBackingList.add(Long.valueOf(j7));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(ReadableMap readableMap) {
        this.mBackingList.add(readableMap);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushNull() {
        this.mBackingList.add(null);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushString(String str) {
        this.mBackingList.add(str);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        return this.mBackingList.size();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this.mBackingList);
    }

    public String toString() {
        return this.mBackingList.toString();
    }

    private JavaOnlyArray(List list) {
        this.mBackingList = new ArrayList(list);
    }

    private JavaOnlyArray(Object... objArr) {
        this.mBackingList = Arrays.asList(objArr);
    }
}
