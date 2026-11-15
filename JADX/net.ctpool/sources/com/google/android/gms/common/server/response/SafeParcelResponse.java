package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zaa;

    @SafeParcelable.Field(getter = "getParcel", id = 2)
    private final Parcel zab;
    private final int zac;

    @SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    private final zan zad;
    private final String zae;
    private int zaf;
    private int zag;

    @SafeParcelable.Constructor
    SafeParcelResponse(@SafeParcelable.Param(id = 1) int i7, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zan zanVar) {
        this.zaa = i7;
        this.zab = (Parcel) Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zanVar;
        this.zae = zanVar == null ? null : zanVar.zaa();
        this.zaf = 2;
    }

    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(T t6) {
        String str = (String) Preconditions.checkNotNull(t6.getClass().getCanonicalName());
        zan zanVar = new zan(t6.getClass());
        zaF(zanVar, t6);
        zanVar.zac();
        zanVar.zad();
        return new SafeParcelResponse(t6, zanVar, str);
    }

    private static void zaF(zan zanVar, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zanVar.zae(cls, fieldMappings);
        Iterator<String> it = fieldMappings.keySet().iterator();
        while (it.hasNext()) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(it.next());
            Class cls2 = field.zag;
            if (cls2 != null) {
                try {
                    zaF(zanVar, (FastJsonResponse) cls2.newInstance());
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException("Could not access object of type ".concat(String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName())), e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException("Could not instantiate an object of type ".concat(String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName())), e8);
                }
            }
        }
    }

    private final void zaG(FastJsonResponse.Field field) {
        if (field.zaf == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.zab;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i7 = this.zaf;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.zag = SafeParcelWriter.beginObjectHeader(parcel);
            this.zaf = 1;
        }
    }

    private final void zaH(StringBuilder sb, Map map, Parcel parcel) {
        Object objCreateBigInteger;
        String strEscapeString;
        String str;
        Object objZaD;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).getSafeParcelableFieldId(), entry);
        }
        sb.append('{');
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z6 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(header));
            if (entry2 != null) {
                if (z6) {
                    sb.append(",");
                }
                String str2 = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str2);
                sb.append("\":");
                if (field.zaj()) {
                    int i7 = field.zac;
                    switch (i7) {
                        case 0:
                            objZaD = FastJsonResponse.zaD(field, Integer.valueOf(SafeParcelReader.readInt(parcel, header)));
                            break;
                        case 1:
                            objZaD = FastJsonResponse.zaD(field, SafeParcelReader.createBigInteger(parcel, header));
                            break;
                        case 2:
                            objZaD = FastJsonResponse.zaD(field, Long.valueOf(SafeParcelReader.readLong(parcel, header)));
                            break;
                        case 3:
                            objZaD = FastJsonResponse.zaD(field, Float.valueOf(SafeParcelReader.readFloat(parcel, header)));
                            break;
                        case 4:
                            objZaD = FastJsonResponse.zaD(field, Double.valueOf(SafeParcelReader.readDouble(parcel, header)));
                            break;
                        case 5:
                            objZaD = FastJsonResponse.zaD(field, SafeParcelReader.createBigDecimal(parcel, header));
                            break;
                        case 6:
                            objZaD = FastJsonResponse.zaD(field, Boolean.valueOf(SafeParcelReader.readBoolean(parcel, header)));
                            break;
                        case 7:
                            objZaD = FastJsonResponse.zaD(field, SafeParcelReader.createString(parcel, header));
                            break;
                        case 8:
                        case ConnectionResult.SERVICE_INVALID /* 9 */:
                            objZaD = FastJsonResponse.zaD(field, SafeParcelReader.createByteArray(parcel, header));
                            break;
                        case 10:
                            Bundle bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleCreateBundle.keySet()) {
                                map2.put(str3, (String) Preconditions.checkNotNull(bundleCreateBundle.getString(str3)));
                            }
                            objZaD = FastJsonResponse.zaD(field, map2);
                            break;
                        case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i7);
                    }
                    zaJ(sb, field, objZaD);
                } else {
                    if (field.zad) {
                        sb.append("[");
                        switch (field.zac) {
                            case 0:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createIntArray(parcel, header));
                                break;
                            case 1:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createBigIntegerArray(parcel, header));
                                break;
                            case 2:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createLongArray(parcel, header));
                                break;
                            case 3:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createFloatArray(parcel, header));
                                break;
                            case 4:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createDoubleArray(parcel, header));
                                break;
                            case 5:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createBigDecimalArray(parcel, header));
                                break;
                            case 6:
                                ArrayUtils.writeArray(sb, SafeParcelReader.createBooleanArray(parcel, header));
                                break;
                            case 7:
                                ArrayUtils.writeStringArray(sb, SafeParcelReader.createStringArray(parcel, header));
                                break;
                            case 8:
                            case ConnectionResult.SERVICE_INVALID /* 9 */:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                                Parcel[] parcelArrCreateParcelArray = SafeParcelReader.createParcelArray(parcel, header);
                                int length = parcelArrCreateParcelArray.length;
                                for (int i8 = 0; i8 < length; i8++) {
                                    if (i8 > 0) {
                                        sb.append(",");
                                    }
                                    parcelArrCreateParcelArray[i8].setDataPosition(0);
                                    zaH(sb, field.zah(), parcelArrCreateParcelArray[i8]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (field.zac) {
                            case 0:
                                sb.append(SafeParcelReader.readInt(parcel, header));
                                break;
                            case 1:
                                objCreateBigInteger = SafeParcelReader.createBigInteger(parcel, header);
                                sb.append(objCreateBigInteger);
                                break;
                            case 2:
                                sb.append(SafeParcelReader.readLong(parcel, header));
                                break;
                            case 3:
                                sb.append(SafeParcelReader.readFloat(parcel, header));
                                break;
                            case 4:
                                sb.append(SafeParcelReader.readDouble(parcel, header));
                                break;
                            case 5:
                                objCreateBigInteger = SafeParcelReader.createBigDecimal(parcel, header);
                                sb.append(objCreateBigInteger);
                                break;
                            case 6:
                                sb.append(SafeParcelReader.readBoolean(parcel, header));
                                break;
                            case 7:
                                String strCreateString = SafeParcelReader.createString(parcel, header);
                                sb.append("\"");
                                strEscapeString = JsonUtils.escapeString(strCreateString);
                                sb.append(strEscapeString);
                                sb.append("\"");
                                break;
                            case 8:
                                byte[] bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                                sb.append("\"");
                                strEscapeString = Base64Utils.encode(bArrCreateByteArray);
                                sb.append(strEscapeString);
                                sb.append("\"");
                                break;
                            case ConnectionResult.SERVICE_INVALID /* 9 */:
                                byte[] bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                                sb.append("\"");
                                strEscapeString = Base64Utils.encodeUrlSafe(bArrCreateByteArray2);
                                sb.append(strEscapeString);
                                sb.append("\"");
                                break;
                            case 10:
                                Bundle bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                                Set<String> setKeySet = bundleCreateBundle2.keySet();
                                sb.append("{");
                                boolean z7 = true;
                                for (String str4 : setKeySet) {
                                    if (!z7) {
                                        sb.append(",");
                                    }
                                    sb.append("\"");
                                    sb.append(str4);
                                    sb.append("\":\"");
                                    sb.append(JsonUtils.escapeString(bundleCreateBundle2.getString(str4)));
                                    sb.append("\"");
                                    z7 = false;
                                }
                                str = "}";
                                break;
                            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                                Parcel parcelCreateParcel = SafeParcelReader.createParcel(parcel, header);
                                parcelCreateParcel.setDataPosition(0);
                                zaH(sb, field.zah(), parcelCreateParcel);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb.append(str);
                }
                z6 = true;
            }
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            sb.append('}');
            return;
        }
        throw new SafeParcelReader.ParseException("Overread allowed size end=" + iValidateObjectHeader, parcel);
    }

    private static final void zaI(StringBuilder sb, int i7, Object obj) {
        switch (i7) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                sb.append("\"");
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb, (HashMap) Preconditions.checkNotNull(obj));
                return;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i7);
        }
    }

    private static final void zaJ(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (!field.zab) {
            zaI(sb, field.zaa, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb.append("[");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 != 0) {
                sb.append(",");
            }
            zaI(sb, field.zaa, arrayList.get(i7));
        }
        sb.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList<T> arrayList) {
        zaG(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i7)).zaE());
        }
        SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field field, String str, T t6) {
        zaG(field);
        SafeParcelWriter.writeParcel(this.zab, field.getSafeParcelableFieldId(), ((SafeParcelResponse) t6).zaE(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        return zanVar.zab((String) Preconditions.checkNotNull(this.zae));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setBooleanInternal(FastJsonResponse.Field<?, ?> field, String str, boolean z6) {
        zaG(field);
        SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z6);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        zaG(field);
        SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i7) {
        zaG(field);
        SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i7);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setLongInternal(FastJsonResponse.Field<?, ?> field, String str, long j7) {
        zaG(field);
        SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j7);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        zaG(field);
        SafeParcelWriter.writeString(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringMapInternal(FastJsonResponse.Field<?, ?> field, String str, Map<String, String> map) {
        zaG(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        String[] strArr = new String[size];
        for (int i7 = 0; i7 < size; i7++) {
            strArr[i7] = arrayList.get(i7);
        }
        SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel parcelZaE = zaE();
        parcelZaE.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zaH(sb, (Map) Preconditions.checkNotNull(this.zad.zab((String) Preconditions.checkNotNull(this.zae))), parcelZaE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i8);
        SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac != 0 ? this.zad : null, i7, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Parcel zaE() {
        int i7 = this.zaf;
        if (i7 != 0) {
            if (i7 == 1) {
                SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
            }
            return this.zab;
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(this.zab);
        this.zag = iBeginObjectHeader;
        SafeParcelWriter.finishObjectHeader(this.zab, iBeginObjectHeader);
        this.zaf = 2;
        return this.zab;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zab(FastJsonResponse.Field field, String str, BigDecimal bigDecimal) {
        zaG(field);
        SafeParcelWriter.writeBigDecimal(this.zab, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zad(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigDecimalArr[i7] = (BigDecimal) arrayList.get(i7);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaf(FastJsonResponse.Field field, String str, BigInteger bigInteger) {
        zaG(field);
        SafeParcelWriter.writeBigInteger(this.zab, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zah(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i7 = 0; i7 < size; i7++) {
            bigIntegerArr[i7] = (BigInteger) arrayList.get(i7);
        }
        SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zak(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i7 = 0; i7 < size; i7++) {
            zArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zan(FastJsonResponse.Field field, String str, double d7) {
        zaG(field);
        SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d7);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zap(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = ((Double) arrayList.get(i7)).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zar(FastJsonResponse.Field field, String str, float f7) {
        zaG(field);
        SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f7);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zat(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            fArr[i7] = ((Float) arrayList.get(i7)).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaw(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaz(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i7 = 0; i7 < size; i7++) {
            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.zaa = 1;
        Parcel parcelObtain = Parcel.obtain();
        this.zab = parcelObtain;
        safeParcelable.writeToParcel(parcelObtain, 0);
        this.zac = 1;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 0;
    }
}
