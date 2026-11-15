package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(Parcel parcel, int i7) {
        zzb(parcel, i7);
    }

    public static void writeBigDecimal(Parcel parcel, int i7, BigDecimal bigDecimal, boolean z6) {
        if (bigDecimal == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i7, BigDecimal[] bigDecimalArr, boolean z6) {
        if (bigDecimalArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i8 = 0; i8 < length; i8++) {
            parcel.writeByteArray(bigDecimalArr[i8].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i8].scale());
        }
        zzb(parcel, iZza);
    }

    public static void writeBigInteger(Parcel parcel, int i7, BigInteger bigInteger, boolean z6) {
        if (bigInteger == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i7, BigInteger[] bigIntegerArr, boolean z6) {
        if (bigIntegerArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, iZza);
    }

    public static void writeBoolean(Parcel parcel, int i7, boolean z6) {
        zzc(parcel, i7, 4);
        parcel.writeInt(z6 ? 1 : 0);
    }

    public static void writeBooleanArray(Parcel parcel, int i7, boolean[] zArr, boolean z6) {
        if (zArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeBooleanArray(zArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i7, List<Boolean> list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(list.get(i8).booleanValue() ? 1 : 0);
        }
        zzb(parcel, iZza);
    }

    public static void writeBooleanObject(Parcel parcel, int i7, Boolean bool, boolean z6) {
        if (bool != null) {
            zzc(parcel, i7, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z6) {
            zzc(parcel, i7, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i7, Bundle bundle, boolean z6) {
        if (bundle == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeBundle(bundle);
            zzb(parcel, iZza);
        }
    }

    public static void writeByte(Parcel parcel, int i7, byte b7) {
        zzc(parcel, i7, 4);
        parcel.writeInt(b7);
    }

    public static void writeByteArray(Parcel parcel, int i7, byte[] bArr, boolean z6) {
        if (bArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeByteArray(bArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i7, byte[][] bArr, boolean z6) {
        if (bArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, iZza);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i7, SparseArray<byte[]> sparseArray, boolean z6) {
        if (sparseArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(sparseArray.keyAt(i8));
            parcel.writeByteArray(sparseArray.valueAt(i8));
        }
        zzb(parcel, iZza);
    }

    public static void writeChar(Parcel parcel, int i7, char c7) {
        zzc(parcel, i7, 4);
        parcel.writeInt(c7);
    }

    public static void writeCharArray(Parcel parcel, int i7, char[] cArr, boolean z6) {
        if (cArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeCharArray(cArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDouble(Parcel parcel, int i7, double d7) {
        zzc(parcel, i7, 8);
        parcel.writeDouble(d7);
    }

    public static void writeDoubleArray(Parcel parcel, int i7, double[] dArr, boolean z6) {
        if (dArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeDoubleArray(dArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDoubleList(Parcel parcel, int i7, List<Double> list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeDouble(list.get(i8).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeDoubleObject(Parcel parcel, int i7, Double d7, boolean z6) {
        if (d7 != null) {
            zzc(parcel, i7, 8);
            parcel.writeDouble(d7.doubleValue());
        } else if (z6) {
            zzc(parcel, i7, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i7, SparseArray<Double> sparseArray, boolean z6) {
        if (sparseArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(sparseArray.keyAt(i8));
            parcel.writeDouble(sparseArray.valueAt(i8).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloat(Parcel parcel, int i7, float f7) {
        zzc(parcel, i7, 4);
        parcel.writeFloat(f7);
    }

    public static void writeFloatArray(Parcel parcel, int i7, float[] fArr, boolean z6) {
        if (fArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeFloatArray(fArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeFloatList(Parcel parcel, int i7, List<Float> list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeFloat(list.get(i8).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloatObject(Parcel parcel, int i7, Float f7, boolean z6) {
        if (f7 != null) {
            zzc(parcel, i7, 4);
            parcel.writeFloat(f7.floatValue());
        } else if (z6) {
            zzc(parcel, i7, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i7, SparseArray<Float> sparseArray, boolean z6) {
        if (sparseArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(sparseArray.keyAt(i8));
            parcel.writeFloat(sparseArray.valueAt(i8).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIBinder(Parcel parcel, int i7, IBinder iBinder, boolean z6) {
        if (iBinder == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeStrongBinder(iBinder);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i7, IBinder[] iBinderArr, boolean z6) {
        if (iBinderArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeBinderArray(iBinderArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i7, List<IBinder> list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeBinderList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i7, SparseArray<IBinder> sparseArray, boolean z6) {
        if (sparseArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(sparseArray.keyAt(i8));
            parcel.writeStrongBinder(sparseArray.valueAt(i8));
        }
        zzb(parcel, iZza);
    }

    public static void writeInt(Parcel parcel, int i7, int i8) {
        zzc(parcel, i7, 4);
        parcel.writeInt(i8);
    }

    public static void writeIntArray(Parcel parcel, int i7, int[] iArr, boolean z6) {
        if (iArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeIntArray(iArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIntegerList(Parcel parcel, int i7, List<Integer> list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(list.get(i8).intValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIntegerObject(Parcel parcel, int i7, Integer num, boolean z6) {
        if (num != null) {
            zzc(parcel, i7, 4);
            parcel.writeInt(num.intValue());
        } else if (z6) {
            zzc(parcel, i7, 0);
        }
    }

    public static void writeList(Parcel parcel, int i7, List list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeLong(Parcel parcel, int i7, long j7) {
        zzc(parcel, i7, 8);
        parcel.writeLong(j7);
    }

    public static void writeLongArray(Parcel parcel, int i7, long[] jArr, boolean z6) {
        if (jArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeLongArray(jArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeLongList(Parcel parcel, int i7, List<Long> list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeLong(list.get(i8).longValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeLongObject(Parcel parcel, int i7, Long l7, boolean z6) {
        if (l7 != null) {
            zzc(parcel, i7, 8);
            parcel.writeLong(l7.longValue());
        } else if (z6) {
            zzc(parcel, i7, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i7, Parcel parcel2, boolean z6) {
        if (parcel2 == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzb(parcel, iZza);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i7, Parcel[] parcelArr, boolean z6) {
        if (parcelArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelList(Parcel parcel, int i7, List<Parcel> list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcel parcel2 = list.get(i8);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i7, SparseArray<Parcel> sparseArray, boolean z6) {
        if (sparseArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(sparseArray.keyAt(i8));
            Parcel parcelValueAt = sparseArray.valueAt(i8);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelable(Parcel parcel, int i7, Parcelable parcelable, int i8, boolean z6) {
        if (parcelable == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcelable.writeToParcel(parcel, i8);
            zzb(parcel, iZza);
        }
    }

    public static void writePendingIntent(Parcel parcel, int i7, PendingIntent pendingIntent, boolean z6) {
        if (pendingIntent == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzb(parcel, iZza);
        }
    }

    public static void writeShort(Parcel parcel, int i7, short s6) {
        zzc(parcel, i7, 4);
        parcel.writeInt(s6);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i7, SparseBooleanArray sparseBooleanArray, boolean z6) {
        if (sparseBooleanArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzb(parcel, iZza);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int i7, SparseIntArray sparseIntArray, boolean z6) {
        if (sparseIntArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(sparseIntArray.keyAt(i8));
            parcel.writeInt(sparseIntArray.valueAt(i8));
        }
        zzb(parcel, iZza);
    }

    public static void writeSparseLongArray(Parcel parcel, int i7, SparseLongArray sparseLongArray, boolean z6) {
        if (sparseLongArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(sparseLongArray.keyAt(i8));
            parcel.writeLong(sparseLongArray.valueAt(i8));
        }
        zzb(parcel, iZza);
    }

    public static void writeString(Parcel parcel, int i7, String str, boolean z6) {
        if (str == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeString(str);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringArray(Parcel parcel, int i7, String[] strArr, boolean z6) {
        if (strArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeStringArray(strArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringList(Parcel parcel, int i7, List<String> list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
            }
        } else {
            int iZza = zza(parcel, i7);
            parcel.writeStringList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int i7, SparseArray<String> sparseArray, boolean z6) {
        if (sparseArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(sparseArray.keyAt(i8));
            parcel.writeString(sparseArray.valueAt(i8));
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedArray(Parcel parcel, int i7, T[] tArr, int i8, boolean z6) {
        if (tArr == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        parcel.writeInt(tArr.length);
        for (T t6 : tArr) {
            if (t6 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t6, i8);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i7, List<T> list, boolean z6) {
        if (list == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            T t6 = list.get(i8);
            if (t6 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t6, 0);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i7, SparseArray<T> sparseArray, boolean z6) {
        if (sparseArray == null) {
            if (z6) {
                zzc(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i7);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(sparseArray.keyAt(i8));
            T tValueAt = sparseArray.valueAt(i8);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, tValueAt, 0);
            }
        }
        zzb(parcel, iZza);
    }

    private static int zza(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i7) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(iDataPosition - i7);
        parcel.setDataPosition(iDataPosition);
    }

    private static void zzc(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i7) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i7);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
