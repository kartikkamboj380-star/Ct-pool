package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: renamed from: com.facebook.react.uimanager.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0878h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ThreadLocal f12604a = new a();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.h0$a */
    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public double[] initialValue() {
            return new double[16];
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.h0$b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12605a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f12605a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12605a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static double a(ReadableMap readableMap, String str) {
        double d7;
        boolean z6 = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z6 = false;
            }
            d7 = Float.parseFloat(string);
        } else {
            d7 = readableMap.getDouble(str);
        }
        return z6 ? d7 : C0899z.l(d7);
    }

    private static float[] b(float f7, float f8, ReadableArray readableArray, boolean z6) {
        if (readableArray == null) {
            return null;
        }
        if (f8 == 0.0f && f7 == 0.0f) {
            return null;
        }
        float f9 = f7 / 2.0f;
        float f10 = f8 / 2.0f;
        float[] fArr = new float[3];
        fArr[0] = f9;
        fArr[1] = f10;
        fArr[2] = 0.0f;
        int i7 = 0;
        while (i7 < readableArray.size() && i7 < 3) {
            int i8 = b.f12605a[readableArray.getType(i7).ordinal()];
            if (i8 == 1) {
                fArr[i7] = (float) readableArray.getDouble(i7);
            } else if (i8 == 2 && z6) {
                String string = readableArray.getString(i7);
                if (string.endsWith("%")) {
                    fArr[i7] = ((i7 == 0 ? f7 : f8) * Float.parseFloat(string.substring(0, string.length() - 1))) / 100.0f;
                }
            }
            i7++;
        }
        return new float[]{(-f9) + fArr[0], (-f10) + fArr[1], fArr[2]};
    }

    private static double c(String str, double d7) {
        try {
            return str.endsWith("%") ? (Double.parseDouble(str.substring(0, str.length() - 1)) * d7) / 100.0d : Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            P0.a.G("ReactNative", "Invalid translate value: " + str);
            return 0.0d;
        }
    }

    public static void d(ReadableArray readableArray, double[] dArr) {
        e(readableArray, dArr, 0.0f, 0.0f, null, false);
    }

    public static void e(ReadableArray readableArray, double[] dArr, float f7, float f8, ReadableArray readableArray2, boolean z6) {
        int i7;
        int i8;
        int i9;
        double d7;
        double[] dArr2 = (double[]) f12604a.get();
        C0899z.r(dArr);
        float[] fArrB = b(f7, f8, readableArray2, z6);
        int i10 = 1;
        if (fArrB != null) {
            C0899z.r(dArr2);
            C0899z.j(dArr2, fArrB[0], fArrB[1], fArrB[2]);
            C0899z.p(dArr, dArr, dArr2);
        }
        int i11 = 16;
        if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
            C0899z.r(dArr2);
            for (int i12 = 0; i12 < readableArray.size(); i12++) {
                dArr2[i12] = readableArray.getDouble(i12);
            }
            C0899z.p(dArr, dArr, dArr2);
        } else {
            int size = readableArray.size();
            int i13 = 0;
            while (i13 < size) {
                ReadableMap map = readableArray.getMap(i13);
                String strNextKey = map.keySetIterator().nextKey();
                C0899z.r(dArr2);
                if ("matrix".equals(strNextKey)) {
                    ReadableArray array = map.getArray(strNextKey);
                    for (int i14 = 0; i14 < i11; i14++) {
                        dArr2[i14] = array.getDouble(i14);
                    }
                } else if ("perspective".equals(strNextKey)) {
                    C0899z.a(dArr2, map.getDouble(strNextKey));
                } else if ("rotateX".equals(strNextKey)) {
                    C0899z.b(dArr2, a(map, strNextKey));
                } else if ("rotateY".equals(strNextKey)) {
                    C0899z.c(dArr2, a(map, strNextKey));
                } else {
                    if ("rotate".equals(strNextKey) || "rotateZ".equals(strNextKey)) {
                        i7 = i13;
                        i8 = i11;
                        i9 = size;
                        C0899z.d(dArr2, a(map, strNextKey));
                    } else {
                        if ("scale".equals(strNextKey)) {
                            d7 = map.getDouble(strNextKey);
                            C0899z.e(dArr2, d7);
                        } else if ("scaleX".equals(strNextKey)) {
                            C0899z.e(dArr2, map.getDouble(strNextKey));
                        } else if ("scaleY".equals(strNextKey)) {
                            d7 = map.getDouble(strNextKey);
                        } else {
                            int i15 = size;
                            if ("translate".equals(strNextKey)) {
                                ReadableArray array2 = map.getArray(strNextKey);
                                ReadableType type = array2.getType(0);
                                ReadableType readableType = ReadableType.String;
                                double dC = (type == readableType && z6) ? c(array2.getString(0), f7) : array2.getDouble(0);
                                i7 = i13;
                                double dC2 = (array2.getType(i10) == readableType && z6) ? c(array2.getString(i10), f8) : array2.getDouble(i10);
                                i9 = i15;
                                i8 = 16;
                                C0899z.j(dArr2, dC, dC2, array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                            } else {
                                i7 = i13;
                                i9 = i15;
                                i8 = 16;
                                if ("translateX".equals(strNextKey)) {
                                    C0899z.i(dArr2, (map.getType(strNextKey) == ReadableType.String && z6) ? c(map.getString(strNextKey), f7) : map.getDouble(strNextKey), 0.0d);
                                } else if ("translateY".equals(strNextKey)) {
                                    C0899z.i(dArr2, 0.0d, (map.getType(strNextKey) == ReadableType.String && z6) ? c(map.getString(strNextKey), f8) : map.getDouble(strNextKey));
                                } else if ("skewX".equals(strNextKey)) {
                                    C0899z.g(dArr2, a(map, strNextKey));
                                } else if ("skewY".equals(strNextKey)) {
                                    C0899z.h(dArr2, a(map, strNextKey));
                                } else {
                                    P0.a.G("ReactNative", "Unsupported transform type: " + strNextKey);
                                }
                            }
                        }
                        C0899z.f(dArr2, d7);
                    }
                    C0899z.p(dArr, dArr, dArr2);
                    i13 = i7 + 1;
                    i11 = i8;
                    size = i9;
                    i10 = 1;
                }
                i7 = i13;
                i8 = i11;
                i9 = size;
                C0899z.p(dArr, dArr, dArr2);
                i13 = i7 + 1;
                i11 = i8;
                size = i9;
                i10 = 1;
            }
        }
        if (fArrB != null) {
            C0899z.r(dArr2);
            C0899z.j(dArr2, -fArrB[0], -fArrB[1], -fArrB[2]);
            C0899z.p(dArr, dArr, dArr2);
        }
    }
}
