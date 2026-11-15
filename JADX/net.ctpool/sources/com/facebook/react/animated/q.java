package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes.dex */
class q extends AbstractC0793b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f11339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JavaOnlyMap f11340f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11341a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f11341a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11341a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11341a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11341a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11341a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11341a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    q(ReadableMap readableMap, p pVar) {
        this.f11340f = JavaOnlyMap.deepClone(readableMap);
        this.f11339e = pVar;
    }

    private JavaOnlyArray j(ReadableArray readableArray) {
        double dL;
        int i7;
        if (readableArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (int i8 = 0; i8 < readableArray.size(); i8++) {
            switch (a.f11341a[readableArray.getType(i8).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    continue;
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i8));
                    continue;
                    break;
                case 3:
                    dL = readableArray.getDouble(i8);
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i8));
                    continue;
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i8);
                    if (map.hasKey("nodeTag") && map.getType("nodeTag") == ReadableType.Number) {
                        AbstractC0793b abstractC0793bL = this.f11339e.l(map.getInt("nodeTag"));
                        if (abstractC0793bL == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (abstractC0793bL instanceof B) {
                            B b7 = (B) abstractC0793bL;
                            Object objK = b7.k();
                            if (objK instanceof Integer) {
                                i7 = ((Integer) objK).intValue();
                                javaOnlyArray.pushInt(i7);
                            } else if (!(objK instanceof String)) {
                                dL = b7.l();
                            } else {
                                javaOnlyArray.pushString((String) objK);
                            }
                            break;
                        } else if (abstractC0793bL instanceof f) {
                            i7 = ((f) abstractC0793bL).i();
                            javaOnlyArray.pushInt(i7);
                        }
                    } else {
                        javaOnlyArray.pushMap(k(readableArray.getMap(i8)));
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(j(readableArray.getArray(i8)));
                    continue;
                    break;
                default:
                    break;
            }
            javaOnlyArray.pushDouble(dL);
        }
        return javaOnlyArray;
    }

    private JavaOnlyMap k(ReadableMap readableMap) {
        double dL;
        int iIntValue;
        if (readableMap == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (a.f11341a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(strNextKey);
                    continue;
                case 2:
                    javaOnlyMap.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                    continue;
                case 3:
                    dL = readableMap.getDouble(strNextKey);
                    break;
                case 4:
                    javaOnlyMap.putString(strNextKey, readableMap.getString(strNextKey));
                    continue;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    if (map != null && map.hasKey("nodeTag") && map.getType("nodeTag") == ReadableType.Number) {
                        AbstractC0793b abstractC0793bL = this.f11339e.l(map.getInt("nodeTag"));
                        if (abstractC0793bL == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (abstractC0793bL instanceof B) {
                            B b7 = (B) abstractC0793bL;
                            Object objK = b7.k();
                            if (objK instanceof Integer) {
                                iIntValue = ((Integer) objK).intValue();
                                javaOnlyMap.putInt(strNextKey, iIntValue);
                            } else if (!(objK instanceof String)) {
                                dL = b7.l();
                            } else {
                                javaOnlyMap.putString(strNextKey, (String) objK);
                            }
                            break;
                        } else if (abstractC0793bL instanceof f) {
                            iIntValue = ((f) abstractC0793bL).i();
                            javaOnlyMap.putInt(strNextKey, iIntValue);
                        }
                    } else {
                        javaOnlyMap.putMap(strNextKey, k(map));
                    }
                    break;
                case 6:
                    javaOnlyMap.putArray(strNextKey, j(readableMap.getArray(strNextKey)));
                    continue;
            }
            javaOnlyMap.putDouble(strNextKey, dL);
        }
        return javaOnlyMap;
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectAnimatedNode[");
        sb.append(this.f11274d);
        sb.append("]: mConfig: ");
        JavaOnlyMap javaOnlyMap = this.f11340f;
        sb.append(javaOnlyMap != null ? javaOnlyMap.toString() : "null");
        return sb.toString();
    }

    public void i(String str, JavaOnlyMap javaOnlyMap) {
        ReadableType type = this.f11340f.getType("value");
        if (type == ReadableType.Map) {
            javaOnlyMap.putMap(str, k(this.f11340f.getMap("value")));
        } else {
            if (type != ReadableType.Array) {
                throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
            }
            javaOnlyMap.putArray(str, j(this.f11340f.getArray("value")));
        }
    }
}
