package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    private static int jniPassCounter;
    private Object[] mLocalArray;
    private ReadableType[] mLocalTypeArray;

    /* JADX INFO: renamed from: com.facebook.react.bridge.ReadableNativeArray$1, reason: invalid class name */
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

    static {
        ReactBridge.staticInit();
        jniPassCounter = 0;
    }

    protected ReadableNativeArray(HybridData hybridData) {
        super(hybridData);
    }

    public static int getJNIPassCounter() {
        return jniPassCounter;
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr != null) {
            return objArr;
        }
        synchronized (this) {
            try {
                if (this.mLocalArray == null) {
                    jniPassCounter++;
                    this.mLocalArray = (Object[]) O1.a.c(importArray());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.mLocalArray;
    }

    private ReadableType[] getLocalTypeArray() {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr != null) {
            return readableTypeArr;
        }
        synchronized (this) {
            try {
                if (this.mLocalTypeArray == null) {
                    jniPassCounter++;
                    Object[] objArr = (Object[]) O1.a.c(importTypeArray());
                    this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(objArr, objArr.length, ReadableType[].class);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.mLocalTypeArray;
    }

    private native Object[] importArray();

    private native Object[] importTypeArray();

    public boolean equals(Object obj) {
        if (obj instanceof ReadableNativeArray) {
            return Arrays.deepEquals(getLocalArray(), ((ReadableNativeArray) obj).getLocalArray());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int i7) {
        return ((Boolean) getLocalArray()[i7]).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int i7) {
        return ((Double) getLocalArray()[i7]).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public Dynamic getDynamic(int i7) {
        return DynamicFromArray.create(this, i7);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int i7) {
        return ((Double) getLocalArray()[i7]).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public long getLong(int i7) {
        return ((Long) getLocalArray()[i7]).longValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public String getString(int i7) {
        return (String) getLocalArray()[i7];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableType getType(int i7) {
        return getLocalTypeArray()[i7];
    }

    public int hashCode() {
        return getLocalArray().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int i7) {
        return getLocalArray()[i7] == null;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        return getLocalArray().length;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ArrayList<Object> toArrayList() {
        Object objValueOf;
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < size(); i7++) {
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(i7).ordinal()]) {
                case 1:
                    objValueOf = null;
                    break;
                case 2:
                    objValueOf = Boolean.valueOf(getBoolean(i7));
                    break;
                case 3:
                    objValueOf = Double.valueOf(getDouble(i7));
                    break;
                case 4:
                    objValueOf = getString(i7);
                    break;
                case 5:
                    objValueOf = getMap(i7).toHashMap();
                    break;
                case 6:
                    objValueOf = getArray(i7).toArrayList();
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index: " + i7 + ".");
            }
            arrayList.add(objValueOf);
        }
        return arrayList;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableNativeArray getArray(int i7) {
        return (ReadableNativeArray) getLocalArray()[i7];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableNativeMap getMap(int i7) {
        return (ReadableNativeMap) getLocalArray()[i7];
    }
}
