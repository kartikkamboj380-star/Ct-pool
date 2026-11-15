package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @KeepForSdk
    public static <T> T[] concat(T[]... tArr) {
        if (tArr.length == 0) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
        }
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], length);
        int length2 = tArr[0].length;
        for (int i7 = 1; i7 < tArr.length; i7++) {
            T[] tArr4 = tArr[i7];
            int length3 = tArr4.length;
            System.arraycopy(tArr4, 0, tArr3, length2, length3);
            length2 += length3;
        }
        return tArr3;
    }

    @KeepForSdk
    public static byte[] concatByteArrays(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr[0], length);
        int length2 = bArr[0].length;
        for (int i7 = 1; i7 < bArr.length; i7++) {
            byte[] bArr3 = bArr[i7];
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArrCopyOf, length2, length3);
            length2 += length3;
        }
        return bArrCopyOf;
    }

    @KeepForSdk
    public static boolean contains(int[] iArr, int i7) {
        if (iArr != null) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    @KeepForSdk
    public static <T> T[] removeAll(T[] tArr, T... tArr2) {
        int length;
        int i7;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return (T[]) Arrays.copyOf(tArr, tArr.length);
        }
        Class<?> cls = tArr2.getClass();
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), tArr.length));
        if (length == 1) {
            i7 = 0;
            for (T t6 : tArr) {
                if (!Objects.equal(tArr2[0], t6)) {
                    tArr3[i7] = t6;
                    i7++;
                }
            }
        } else {
            int i8 = 0;
            for (T t7 : tArr) {
                if (!contains(tArr2, t7)) {
                    tArr3[i8] = t7;
                    i8++;
                }
            }
            i7 = i8;
        }
        if (tArr3 == null) {
            return null;
        }
        return i7 == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i7);
    }

    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t6 : tArr) {
            arrayList.add(t6);
        }
        return arrayList;
    }

    @KeepForSdk
    public static int[] toPrimitiveArray(Collection<Integer> collection) {
        int i7 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i7] = it.next().intValue();
            i7++;
        }
        return iArr;
    }

    @KeepForSdk
    public static Integer[] toWrapperArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i7 = 0; i7 < length; i7++) {
            numArr[i7] = Integer.valueOf(iArr[i7]);
        }
        return numArr;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(dArr[i7]);
        }
    }

    @KeepForSdk
    public static void writeStringArray(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append("\"");
            sb.append(strArr[i7]);
            sb.append("\"");
        }
    }

    @KeepForSdk
    public static <T> boolean contains(T[] tArr, T t6) {
        int length = tArr != null ? tArr.length : 0;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            if (!Objects.equal(tArr[i7], t6)) {
                i7++;
            } else if (i7 >= 0) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(fArr[i7]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(iArr[i7]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(jArr[i7]);
        }
    }

    @KeepForSdk
    public static <T> void writeArray(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(tArr[i7]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            sb.append(zArr[i7]);
        }
    }
}
