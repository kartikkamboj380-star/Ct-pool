package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1122j5 implements InterfaceC1229v5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f14639q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Unsafe f14640r = M5.p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f14641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f14642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f14643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f14644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1095g5 f14645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f14647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f14648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f14649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f14650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f14651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC1149m5 f14652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final P4 f14653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final L5 f14654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AbstractC1166o4 f14655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Y4 f14656p;

    private C1122j5(int[] iArr, Object[] objArr, int i7, int i8, InterfaceC1095g5 interfaceC1095g5, boolean z6, int[] iArr2, int i9, int i10, InterfaceC1149m5 interfaceC1149m5, P4 p42, L5 l52, AbstractC1166o4 abstractC1166o4, Y4 y42) {
        this.f14641a = iArr;
        this.f14642b = objArr;
        this.f14643c = i7;
        this.f14644d = i8;
        this.f14647g = interfaceC1095g5 instanceof AbstractC1260z4;
        this.f14646f = abstractC1166o4 != null && abstractC1166o4.d(interfaceC1095g5);
        this.f14648h = false;
        this.f14649i = iArr2;
        this.f14650j = i9;
        this.f14651k = i10;
        this.f14652l = interfaceC1149m5;
        this.f14653m = p42;
        this.f14654n = l52;
        this.f14655o = abstractC1166o4;
        this.f14645e = interfaceC1095g5;
        this.f14656p = y42;
    }

    private static boolean A(Object obj, int i7, InterfaceC1229v5 interfaceC1229v5) {
        return interfaceC1229v5.d(M5.B(obj, i7 & 1048575));
    }

    private static float B(Object obj, long j7) {
        return ((Float) M5.B(obj, j7)).floatValue();
    }

    private final int C(int i7) {
        return this.f14641a[i7 + 2];
    }

    private final void D(Object obj, int i7) {
        int iC = C(i7);
        long j7 = 1048575 & iC;
        if (j7 == 1048575) {
            return;
        }
        M5.h(obj, j7, (1 << (iC >>> 20)) | M5.t(obj, j7));
    }

    private final void E(Object obj, int i7, int i8) {
        M5.h(obj, C(i8) & 1048575, i7);
    }

    private final void F(Object obj, Object obj2, int i7) {
        int i8 = this.f14641a[i7];
        if (K(obj2, i8, i7)) {
            long jG = G(i7) & 1048575;
            Unsafe unsafe = f14640r;
            Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f14641a[i7] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC1229v5 interfaceC1229v5O = O(i7);
            if (!K(obj, i8, i7)) {
                if (T(object)) {
                    Object objA = interfaceC1229v5O.a();
                    interfaceC1229v5O.h(objA, object);
                    unsafe.putObject(obj, jG, objA);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                E(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, jG);
            if (!T(object2)) {
                Object objA2 = interfaceC1229v5O.a();
                interfaceC1229v5O.h(objA2, object2);
                unsafe.putObject(obj, jG, objA2);
                object2 = objA2;
            }
            interfaceC1229v5O.h(object2, object);
        }
    }

    private final int G(int i7) {
        return this.f14641a[i7 + 1];
    }

    private static int H(Object obj, long j7) {
        return ((Integer) M5.B(obj, j7)).intValue();
    }

    static K5 I(Object obj) {
        AbstractC1260z4 abstractC1260z4 = (AbstractC1260z4) obj;
        K5 k52 = abstractC1260z4.zzb;
        if (k52 != K5.k()) {
            return k52;
        }
        K5 k5L = K5.l();
        abstractC1260z4.zzb = k5L;
        return k5L;
    }

    private final boolean J(Object obj, int i7) {
        int iC = C(i7);
        long j7 = iC & 1048575;
        if (j7 != 1048575) {
            return (M5.t(obj, j7) & (1 << (iC >>> 20))) != 0;
        }
        int iG = G(i7);
        long j8 = iG & 1048575;
        switch ((iG & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(M5.a(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(M5.n(obj, j8)) != 0;
            case 2:
                return M5.x(obj, j8) != 0;
            case 3:
                return M5.x(obj, j8) != 0;
            case 4:
                return M5.t(obj, j8) != 0;
            case 5:
                return M5.x(obj, j8) != 0;
            case 6:
                return M5.t(obj, j8) != 0;
            case 7:
                return M5.F(obj, j8);
            case 8:
                Object objB = M5.B(obj, j8);
                if (objB instanceof String) {
                    return !((String) objB).isEmpty();
                }
                if (objB instanceof R3) {
                    return !R3.f14328n.equals(objB);
                }
                throw new IllegalArgumentException();
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return M5.B(obj, j8) != null;
            case 10:
                return !R3.f14328n.equals(M5.B(obj, j8));
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return M5.t(obj, j8) != 0;
            case 12:
                return M5.t(obj, j8) != 0;
            case 13:
                return M5.t(obj, j8) != 0;
            case 14:
                return M5.x(obj, j8) != 0;
            case 15:
                return M5.t(obj, j8) != 0;
            case 16:
                return M5.x(obj, j8) != 0;
            case 17:
                return M5.B(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean K(Object obj, int i7, int i8) {
        return M5.t(obj, (long) (C(i8) & 1048575)) == i7;
    }

    private final boolean L(Object obj, Object obj2, int i7) {
        return J(obj, i7) == J(obj2, i7);
    }

    private static long M(Object obj, long j7) {
        return ((Long) M5.B(obj, j7)).longValue();
    }

    private final D4 N(int i7) {
        return (D4) this.f14642b[((i7 / 3) << 1) + 1];
    }

    private final InterfaceC1229v5 O(int i7) {
        int i8 = (i7 / 3) << 1;
        InterfaceC1229v5 interfaceC1229v5 = (InterfaceC1229v5) this.f14642b[i8];
        if (interfaceC1229v5 != null) {
            return interfaceC1229v5;
        }
        InterfaceC1229v5 interfaceC1229v5B = C1202s5.a().b((Class) this.f14642b[i8 + 1]);
        this.f14642b[i8] = interfaceC1229v5B;
        return interfaceC1229v5B;
    }

    private static boolean P(Object obj, long j7) {
        return ((Boolean) M5.B(obj, j7)).booleanValue();
    }

    private final Object Q(int i7) {
        return this.f14642b[(i7 / 3) << 1];
    }

    private static void R(Object obj) {
        if (T(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean S(int i7) {
        return (i7 & 536870912) != 0;
    }

    private static boolean T(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1260z4) {
            return ((AbstractC1260z4) obj).D();
        }
        return true;
    }

    private static double j(Object obj, long j7) {
        return ((Double) M5.B(obj, j7)).doubleValue();
    }

    private final int k(int i7) {
        if (i7 < this.f14643c || i7 > this.f14644d) {
            return -1;
        }
        return l(i7, 0);
    }

    private final int l(int i7, int i8) {
        int length = (this.f14641a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.f14641a[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C1122j5 n(Class cls, InterfaceC1077e5 interfaceC1077e5, InterfaceC1149m5 interfaceC1149m5, P4 p42, L5 l52, AbstractC1166o4 abstractC1166o4, Y4 y42) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        int i15;
        char cCharAt3;
        int i16;
        char cCharAt4;
        int i17;
        char cCharAt5;
        int i18;
        char cCharAt6;
        int i19;
        char cCharAt7;
        int i20;
        char cCharAt8;
        int i21;
        int i22;
        int i23;
        int i24;
        C1211t5 c1211t5;
        int i25;
        int iObjectFieldOffset;
        int i26;
        String str;
        int iObjectFieldOffset2;
        int i27;
        int i28;
        Field fieldS;
        int i29;
        char cCharAt9;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field fieldS2;
        Object obj2;
        Field fieldS3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        if (!(interfaceC1077e5 instanceof C1211t5)) {
            androidx.appcompat.app.y.a(interfaceC1077e5);
            throw new NoSuchMethodError();
        }
        C1211t5 c1211t52 = (C1211t5) interfaceC1077e5;
        String strB = c1211t52.b();
        int length = strB.length();
        char c7 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i7 = i37 + 1;
                if (strB.charAt(i37) < 55296) {
                    break;
                }
                i37 = i7;
            }
        } else {
            i7 = 1;
        }
        int i38 = i7 + 1;
        int iCharAt3 = strB.charAt(i7);
        if (iCharAt3 >= 55296) {
            int i39 = iCharAt3 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                cCharAt13 = strB.charAt(i38);
                if (cCharAt13 < 55296) {
                    break;
                }
                i39 |= (cCharAt13 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            iCharAt3 = i39 | (cCharAt13 << i40);
            i38 = i36;
        }
        if (iCharAt3 == 0) {
            i12 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            i10 = 0;
            i9 = 0;
            iArr = f14639q;
            i8 = 0;
        } else {
            int i41 = i38 + 1;
            int iCharAt4 = strB.charAt(i38);
            if (iCharAt4 >= 55296) {
                int i42 = iCharAt4 & 8191;
                int i43 = 13;
                while (true) {
                    i20 = i41 + 1;
                    cCharAt8 = strB.charAt(i41);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i20;
                }
                iCharAt4 = i42 | (cCharAt8 << i43);
                i41 = i20;
            }
            int i44 = i41 + 1;
            int iCharAt5 = strB.charAt(i41);
            if (iCharAt5 >= 55296) {
                int i45 = iCharAt5 & 8191;
                int i46 = 13;
                while (true) {
                    i19 = i44 + 1;
                    cCharAt7 = strB.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i19;
                }
                iCharAt5 = i45 | (cCharAt7 << i46);
                i44 = i19;
            }
            int i47 = i44 + 1;
            int iCharAt6 = strB.charAt(i44);
            if (iCharAt6 >= 55296) {
                int i48 = iCharAt6 & 8191;
                int i49 = 13;
                while (true) {
                    i18 = i47 + 1;
                    cCharAt6 = strB.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i18;
                }
                iCharAt6 = i48 | (cCharAt6 << i49);
                i47 = i18;
            }
            int i50 = i47 + 1;
            int iCharAt7 = strB.charAt(i47);
            if (iCharAt7 >= 55296) {
                int i51 = iCharAt7 & 8191;
                int i52 = 13;
                while (true) {
                    i17 = i50 + 1;
                    cCharAt5 = strB.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i17;
                }
                iCharAt7 = i51 | (cCharAt5 << i52);
                i50 = i17;
            }
            int i53 = i50 + 1;
            iCharAt = strB.charAt(i50);
            if (iCharAt >= 55296) {
                int i54 = iCharAt & 8191;
                int i55 = 13;
                while (true) {
                    i16 = i53 + 1;
                    cCharAt4 = strB.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i16;
                }
                iCharAt = i54 | (cCharAt4 << i55);
                i53 = i16;
            }
            int i56 = i53 + 1;
            iCharAt2 = strB.charAt(i53);
            if (iCharAt2 >= 55296) {
                int i57 = iCharAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i15 = i56 + 1;
                    cCharAt3 = strB.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i15;
                }
                iCharAt2 = i57 | (cCharAt3 << i58);
                i56 = i15;
            }
            int i59 = i56 + 1;
            int iCharAt8 = strB.charAt(i56);
            if (iCharAt8 >= 55296) {
                int i60 = iCharAt8 & 8191;
                int i61 = 13;
                while (true) {
                    i14 = i59 + 1;
                    cCharAt2 = strB.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i14;
                }
                iCharAt8 = i60 | (cCharAt2 << i61);
                i59 = i14;
            }
            int i62 = i59 + 1;
            int iCharAt9 = strB.charAt(i59);
            if (iCharAt9 >= 55296) {
                int i63 = iCharAt9 & 8191;
                int i64 = 13;
                while (true) {
                    i13 = i62 + 1;
                    cCharAt = strB.charAt(i62);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i63 |= (cCharAt & 8191) << i64;
                    i64 += 13;
                    i62 = i13;
                }
                iCharAt9 = i63 | (cCharAt << i64);
                i62 = i13;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            int i65 = (iCharAt4 << 1) + iCharAt5;
            i8 = iCharAt4;
            i9 = iCharAt9;
            i38 = i62;
            i10 = iCharAt7;
            i11 = iCharAt6;
            i12 = i65;
            iArr = iArr2;
        }
        Unsafe unsafe = f14640r;
        Object[] objArrC = c1211t52.c();
        Class<?> cls2 = c1211t52.a().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt << 1];
        int i66 = i9 + iCharAt2;
        int i67 = i9;
        int i68 = i66;
        int i69 = 0;
        int i70 = 0;
        while (i38 < length) {
            int i71 = i38 + 1;
            int iCharAt10 = strB.charAt(i38);
            if (iCharAt10 >= c7) {
                int i72 = iCharAt10 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i35 = i73 + 1;
                    cCharAt12 = strB.charAt(i73);
                    if (cCharAt12 < c7) {
                        break;
                    }
                    i72 |= (cCharAt12 & 8191) << i74;
                    i74 += 13;
                    i73 = i35;
                }
                iCharAt10 = i72 | (cCharAt12 << i74);
                i21 = i35;
            } else {
                i21 = i71;
            }
            int i75 = i21 + 1;
            int iCharAt11 = strB.charAt(i21);
            if (iCharAt11 >= c7) {
                int i76 = iCharAt11 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i34 = i77 + 1;
                    cCharAt11 = strB.charAt(i77);
                    i22 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i76 |= (cCharAt11 & 8191) << i78;
                    i78 += 13;
                    i77 = i34;
                    length = i22;
                }
                iCharAt11 = i76 | (cCharAt11 << i78);
                i23 = i34;
            } else {
                i22 = length;
                i23 = i75;
            }
            int i79 = iCharAt11 & 255;
            int i80 = i10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            int i81 = i11;
            if (i79 >= 51) {
                int i82 = i23 + 1;
                int iCharAt12 = strB.charAt(i23);
                char c8 = 55296;
                if (iCharAt12 >= 55296) {
                    int i83 = iCharAt12 & 8191;
                    int i84 = 13;
                    while (true) {
                        i33 = i82 + 1;
                        cCharAt10 = strB.charAt(i82);
                        if (cCharAt10 < c8) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i82 = i33;
                        c8 = 55296;
                    }
                    iCharAt12 = i83 | (cCharAt10 << i84);
                    i82 = i33;
                }
                int i85 = i79 - 51;
                int i86 = i82;
                if (i85 == 9 || i85 == 17) {
                    i31 = 1;
                    i32 = i12 + 1;
                    objArr[((i69 / 3) << 1) + 1] = objArrC[i12];
                } else if (i85 != 12 || (!c1211t52.zzb().equals(EnumC1176p5.PROTO2) && (iCharAt11 & 2048) == 0)) {
                    i31 = 1;
                    int i87 = iCharAt12 << i31;
                    obj = objArrC[i87];
                    if (obj instanceof Field) {
                        fieldS2 = s(cls2, (String) obj);
                        objArrC[i87] = fieldS2;
                    } else {
                        fieldS2 = (Field) obj;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldS2);
                    int i88 = i87 + 1;
                    obj2 = objArrC[i88];
                    int i89 = i12;
                    if (obj2 instanceof Field) {
                        fieldS3 = s(cls2, (String) obj2);
                        objArrC[i88] = fieldS3;
                    } else {
                        fieldS3 = (Field) obj2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldS3);
                    str = strB;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i26 = i89;
                    i28 = 0;
                    c1211t5 = c1211t52;
                    i24 = iCharAt10;
                    i27 = i86;
                } else {
                    i31 = 1;
                    i32 = i12 + 1;
                    objArr[((i69 / 3) << 1) + 1] = objArrC[i12];
                }
                i12 = i32;
                int i872 = iCharAt12 << i31;
                obj = objArrC[i872];
                if (obj instanceof Field) {
                }
                int iObjectFieldOffset32 = (int) unsafe.objectFieldOffset(fieldS2);
                int i882 = i872 + 1;
                obj2 = objArrC[i882];
                int i892 = i12;
                if (obj2 instanceof Field) {
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldS3);
                str = strB;
                iObjectFieldOffset = iObjectFieldOffset32;
                i26 = i892;
                i28 = 0;
                c1211t5 = c1211t52;
                i24 = iCharAt10;
                i27 = i86;
            } else {
                int i90 = i12 + 1;
                Field fieldS4 = s(cls2, (String) objArrC[i12]);
                i24 = iCharAt10;
                if (i79 == 9 || i79 == 17) {
                    c1211t5 = c1211t52;
                    objArr[((i69 / 3) << 1) + 1] = fieldS4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        c1211t5 = c1211t52;
                        i30 = i12 + 2;
                        objArr[((i69 / 3) << 1) + 1] = objArrC[i90];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        c1211t5 = c1211t52;
                        if (c1211t52.zzb() == EnumC1176p5.PROTO2 || (iCharAt11 & 2048) != 0) {
                            i30 = i12 + 2;
                            objArr[((i69 / 3) << 1) + 1] = objArrC[i90];
                        }
                    } else if (i79 == 50) {
                        int i91 = i67 + 1;
                        iArr[i67] = i69;
                        int i92 = (i69 / 3) << 1;
                        int i93 = i12 + 2;
                        objArr[i92] = objArrC[i90];
                        if ((iCharAt11 & 2048) != 0) {
                            i90 = i12 + 3;
                            objArr[i92 + 1] = objArrC[i93];
                            c1211t5 = c1211t52;
                            i67 = i91;
                        } else {
                            i67 = i91;
                            c1211t5 = c1211t52;
                            i25 = i93;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldS4);
                            if ((iCharAt11 & 4096) == 0 || i79 > 17) {
                                i26 = i25;
                                str = strB;
                                iObjectFieldOffset2 = 1048575;
                                i27 = i23;
                                i28 = 0;
                            } else {
                                i27 = i23 + 1;
                                int iCharAt13 = strB.charAt(i23);
                                if (iCharAt13 >= 55296) {
                                    int i94 = iCharAt13 & 8191;
                                    int i95 = 13;
                                    while (true) {
                                        i29 = i27 + 1;
                                        cCharAt9 = strB.charAt(i27);
                                        if (cCharAt9 < 55296) {
                                            break;
                                        }
                                        i94 |= (cCharAt9 & 8191) << i95;
                                        i95 += 13;
                                        i27 = i29;
                                    }
                                    iCharAt13 = i94 | (cCharAt9 << i95);
                                    i27 = i29;
                                }
                                int i96 = (i8 << 1) + (iCharAt13 / 32);
                                Object obj3 = objArrC[i96];
                                if (obj3 instanceof Field) {
                                    fieldS = (Field) obj3;
                                } else {
                                    fieldS = s(cls2, (String) obj3);
                                    objArrC[i96] = fieldS;
                                }
                                i26 = i25;
                                str = strB;
                                i28 = iCharAt13 % 32;
                                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldS);
                            }
                            if (i79 >= 18 && i79 <= 49) {
                                iArr[i68] = iObjectFieldOffset;
                                i68++;
                            }
                        }
                    } else {
                        c1211t5 = c1211t52;
                    }
                    i25 = i30;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldS4);
                    if ((iCharAt11 & 4096) == 0) {
                        i26 = i25;
                        str = strB;
                        iObjectFieldOffset2 = 1048575;
                        i27 = i23;
                        i28 = 0;
                        if (i79 >= 18) {
                            iArr[i68] = iObjectFieldOffset;
                            i68++;
                        }
                    }
                }
                i25 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldS4);
                if ((iCharAt11 & 4096) == 0) {
                }
            }
            int i97 = i69 + 1;
            iArr3[i69] = i24;
            int i98 = i69 + 2;
            Class<?> cls3 = cls2;
            int i99 = i27;
            iArr3[i97] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i79 << 20) | iObjectFieldOffset;
            i69 += 3;
            iArr3[i98] = (i28 << 20) | iObjectFieldOffset2;
            strB = str;
            i10 = i80;
            i12 = i26;
            c1211t52 = c1211t5;
            length = i22;
            i11 = i81;
            cls2 = cls3;
            i38 = i99;
            c7 = 55296;
        }
        return new C1122j5(iArr3, objArr, i11, i10, c1211t52.a(), false, iArr, i9, i66, interfaceC1149m5, p42, l52, abstractC1166o4, y42);
    }

    private final Object o(int i7, int i8, Map map, D4 d42, Object obj, L5 l52, Object obj2) {
        this.f14656p.c(Q(i7));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!d42.d(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = l52.i(obj2);
                }
                C1040a4 c1040a4T = R3.t(X4.a(null, entry.getKey(), entry.getValue()));
                try {
                    X4.b(c1040a4T.b(), null, entry.getKey(), entry.getValue());
                    l52.c(obj, i8, c1040a4T.a());
                    it.remove();
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return obj;
    }

    private final Object p(Object obj, int i7) {
        InterfaceC1229v5 interfaceC1229v5O = O(i7);
        long jG = G(i7) & 1048575;
        if (!J(obj, i7)) {
            return interfaceC1229v5O.a();
        }
        Object object = f14640r.getObject(obj, jG);
        if (T(object)) {
            return object;
        }
        Object objA = interfaceC1229v5O.a();
        if (object != null) {
            interfaceC1229v5O.h(objA, object);
        }
        return objA;
    }

    private final Object q(Object obj, int i7, int i8) {
        InterfaceC1229v5 interfaceC1229v5O = O(i8);
        if (!K(obj, i7, i8)) {
            return interfaceC1229v5O.a();
        }
        Object object = f14640r.getObject(obj, G(i8) & 1048575);
        if (T(object)) {
            return object;
        }
        Object objA = interfaceC1229v5O.a();
        if (object != null) {
            interfaceC1229v5O.h(objA, object);
        }
        return objA;
    }

    private final Object r(Object obj, int i7, Object obj2, L5 l52, Object obj3) {
        D4 d4N;
        int i8 = this.f14641a[i7];
        Object objB = M5.B(obj, G(i7) & 1048575);
        return (objB == null || (d4N = N(i7)) == null) ? obj2 : o(i7, i8, this.f14656p.d(objB), d4N, obj2, l52, obj3);
    }

    private static Field s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void t(int i7, Object obj, InterfaceC1069d6 interfaceC1069d6) {
        if (obj instanceof String) {
            interfaceC1069d6.w(i7, (String) obj);
        } else {
            interfaceC1069d6.p(i7, (R3) obj);
        }
    }

    private static void u(L5 l52, Object obj, InterfaceC1069d6 interfaceC1069d6) {
        l52.g(l52.k(obj), interfaceC1069d6);
    }

    private final void v(InterfaceC1069d6 interfaceC1069d6, int i7, Object obj, int i8) {
        if (obj != null) {
            this.f14656p.c(Q(i8));
            interfaceC1069d6.m(i7, null, this.f14656p.g(obj));
        }
    }

    private final void w(Object obj, int i7, int i8, Object obj2) {
        f14640r.putObject(obj, G(i8) & 1048575, obj2);
        E(obj, i7, i8);
    }

    private final void x(Object obj, int i7, Object obj2) {
        f14640r.putObject(obj, G(i7) & 1048575, obj2);
        D(obj, i7);
    }

    private final void y(Object obj, Object obj2, int i7) {
        if (J(obj2, i7)) {
            long jG = G(i7) & 1048575;
            Unsafe unsafe = f14640r;
            Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f14641a[i7] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC1229v5 interfaceC1229v5O = O(i7);
            if (!J(obj, i7)) {
                if (T(object)) {
                    Object objA = interfaceC1229v5O.a();
                    interfaceC1229v5O.h(objA, object);
                    unsafe.putObject(obj, jG, objA);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                D(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, jG);
            if (!T(object2)) {
                Object objA2 = interfaceC1229v5O.a();
                interfaceC1229v5O.h(objA2, object2);
                unsafe.putObject(obj, jG, objA2);
                object2 = objA2;
            }
            interfaceC1229v5O.h(object2, object);
        }
    }

    private final boolean z(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? J(obj, i7) : (i9 & i10) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final Object a() {
        return this.f14652l.c(this.f14645e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Object obj, InterfaceC1069d6 interfaceC1069d6) {
        Map.Entry entry;
        Iterator it;
        Iterator it2;
        int i7;
        Map.Entry entry2;
        int i8;
        int i9;
        int i10;
        Map.Entry entry3;
        int i11;
        boolean z6;
        int i12;
        Unsafe unsafe;
        boolean z7;
        Iterator itI;
        Map.Entry entry4;
        double dA;
        float fN;
        long jX;
        long jX2;
        int iT;
        long jX3;
        int iT2;
        boolean zF;
        int iT3;
        int iT4;
        int iT5;
        long jX4;
        int iT6;
        long jX5;
        InterfaceC1069d6 interfaceC1069d62 = interfaceC1069d6;
        int i13 = 267386880;
        int i14 = 1048575;
        if (interfaceC1069d6.a() == 2) {
            u(this.f14654n, obj, interfaceC1069d62);
            if (this.f14646f) {
                C1201s4 c1201s4B = this.f14655o.b(obj);
                if (c1201s4B.f14831a.isEmpty()) {
                    itI = null;
                    entry4 = null;
                } else {
                    itI = c1201s4B.i();
                    entry4 = (Map.Entry) itI.next();
                }
            }
            for (int length = this.f14641a.length - 3; length >= 0; length -= 3) {
                int iG = G(length);
                int i15 = this.f14641a[length];
                while (entry4 != null && this.f14655o.a(entry4) > i15) {
                    this.f14655o.c(interfaceC1069d62, entry4);
                    entry4 = itI.hasNext() ? (Map.Entry) itI.next() : null;
                }
                switch ((iG & 267386880) >>> 20) {
                    case 0:
                        if (J(obj, length)) {
                            dA = M5.a(obj, iG & 1048575);
                            interfaceC1069d62.A(i15, dA);
                        }
                        break;
                    case 1:
                        if (J(obj, length)) {
                            fN = M5.n(obj, iG & 1048575);
                            interfaceC1069d62.B(i15, fN);
                        }
                        break;
                    case 2:
                        if (J(obj, length)) {
                            jX = M5.x(obj, iG & 1048575);
                            interfaceC1069d62.l(i15, jX);
                        }
                        break;
                    case 3:
                        if (J(obj, length)) {
                            jX2 = M5.x(obj, iG & 1048575);
                            interfaceC1069d62.N(i15, jX2);
                        }
                        break;
                    case 4:
                        if (J(obj, length)) {
                            iT = M5.t(obj, iG & 1048575);
                            interfaceC1069d62.s(i15, iT);
                        }
                        break;
                    case 5:
                        if (J(obj, length)) {
                            jX3 = M5.x(obj, iG & 1048575);
                            interfaceC1069d62.z(i15, jX3);
                        }
                        break;
                    case 6:
                        if (J(obj, length)) {
                            iT2 = M5.t(obj, iG & 1048575);
                            interfaceC1069d62.n(i15, iT2);
                        }
                        break;
                    case 7:
                        if (J(obj, length)) {
                            zF = M5.F(obj, iG & 1048575);
                            interfaceC1069d62.h(i15, zF);
                        }
                        break;
                    case 8:
                        if (J(obj, length)) {
                            t(i15, M5.B(obj, iG & 1048575), interfaceC1069d62);
                        }
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        if (J(obj, length)) {
                            interfaceC1069d62.G(i15, M5.B(obj, iG & 1048575), O(length));
                        }
                        break;
                    case 10:
                        if (J(obj, length)) {
                            interfaceC1069d62.p(i15, (R3) M5.B(obj, iG & 1048575));
                        }
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        if (J(obj, length)) {
                            iT3 = M5.t(obj, iG & 1048575);
                            interfaceC1069d62.D(i15, iT3);
                        }
                        break;
                    case 12:
                        if (J(obj, length)) {
                            iT4 = M5.t(obj, iG & 1048575);
                            interfaceC1069d62.y(i15, iT4);
                        }
                        break;
                    case 13:
                        if (J(obj, length)) {
                            iT5 = M5.t(obj, iG & 1048575);
                            interfaceC1069d62.J(i15, iT5);
                        }
                        break;
                    case 14:
                        if (J(obj, length)) {
                            jX4 = M5.x(obj, iG & 1048575);
                            interfaceC1069d62.t(i15, jX4);
                        }
                        break;
                    case 15:
                        if (J(obj, length)) {
                            iT6 = M5.t(obj, iG & 1048575);
                            interfaceC1069d62.M(i15, iT6);
                        }
                        break;
                    case 16:
                        if (J(obj, length)) {
                            jX5 = M5.x(obj, iG & 1048575);
                            interfaceC1069d62.K(i15, jX5);
                        }
                        break;
                    case 17:
                        if (J(obj, length)) {
                            interfaceC1069d62.E(i15, M5.B(obj, iG & 1048575), O(length));
                        }
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        AbstractC1245x5.w(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 19:
                        AbstractC1245x5.I(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 20:
                        AbstractC1245x5.O(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        AbstractC1245x5.Y(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 22:
                        AbstractC1245x5.L(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        AbstractC1245x5.F(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        AbstractC1245x5.C(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 25:
                        AbstractC1245x5.k(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 26:
                        AbstractC1245x5.u(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62);
                        break;
                    case 27:
                        AbstractC1245x5.v(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, O(length));
                        break;
                    case 28:
                        AbstractC1245x5.i(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62);
                        break;
                    case 29:
                        AbstractC1245x5.X(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 30:
                        AbstractC1245x5.z(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 31:
                        AbstractC1245x5.R(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 32:
                        AbstractC1245x5.U(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 33:
                        AbstractC1245x5.V(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 34:
                        AbstractC1245x5.W(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, false);
                        break;
                    case 35:
                        AbstractC1245x5.w(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 36:
                        AbstractC1245x5.I(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 37:
                        AbstractC1245x5.O(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 38:
                        AbstractC1245x5.Y(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 39:
                        AbstractC1245x5.L(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 40:
                        AbstractC1245x5.F(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 41:
                        AbstractC1245x5.C(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 42:
                        AbstractC1245x5.k(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 43:
                        AbstractC1245x5.X(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 44:
                        AbstractC1245x5.z(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 45:
                        AbstractC1245x5.R(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 46:
                        AbstractC1245x5.U(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 47:
                        AbstractC1245x5.V(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 48:
                        AbstractC1245x5.W(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, true);
                        break;
                    case 49:
                        AbstractC1245x5.j(this.f14641a[length], (List) M5.B(obj, iG & 1048575), interfaceC1069d62, O(length));
                        break;
                    case 50:
                        v(interfaceC1069d62, i15, M5.B(obj, iG & 1048575), length);
                        break;
                    case 51:
                        if (K(obj, i15, length)) {
                            dA = j(obj, iG & 1048575);
                            interfaceC1069d62.A(i15, dA);
                        }
                        break;
                    case 52:
                        if (K(obj, i15, length)) {
                            fN = B(obj, iG & 1048575);
                            interfaceC1069d62.B(i15, fN);
                        }
                        break;
                    case 53:
                        if (K(obj, i15, length)) {
                            jX = M(obj, iG & 1048575);
                            interfaceC1069d62.l(i15, jX);
                        }
                        break;
                    case 54:
                        if (K(obj, i15, length)) {
                            jX2 = M(obj, iG & 1048575);
                            interfaceC1069d62.N(i15, jX2);
                        }
                        break;
                    case 55:
                        if (K(obj, i15, length)) {
                            iT = H(obj, iG & 1048575);
                            interfaceC1069d62.s(i15, iT);
                        }
                        break;
                    case 56:
                        if (K(obj, i15, length)) {
                            jX3 = M(obj, iG & 1048575);
                            interfaceC1069d62.z(i15, jX3);
                        }
                        break;
                    case 57:
                        if (K(obj, i15, length)) {
                            iT2 = H(obj, iG & 1048575);
                            interfaceC1069d62.n(i15, iT2);
                        }
                        break;
                    case 58:
                        if (K(obj, i15, length)) {
                            zF = P(obj, iG & 1048575);
                            interfaceC1069d62.h(i15, zF);
                        }
                        break;
                    case 59:
                        if (!K(obj, i15, length)) {
                            break;
                        }
                        break;
                    case 60:
                        if (!K(obj, i15, length)) {
                            break;
                        }
                        break;
                    case 61:
                        if (!K(obj, i15, length)) {
                            break;
                        }
                        break;
                    case 62:
                        if (K(obj, i15, length)) {
                            iT3 = H(obj, iG & 1048575);
                            interfaceC1069d62.D(i15, iT3);
                        }
                        break;
                    case 63:
                        if (K(obj, i15, length)) {
                            iT4 = H(obj, iG & 1048575);
                            interfaceC1069d62.y(i15, iT4);
                        }
                        break;
                    case 64:
                        if (K(obj, i15, length)) {
                            iT5 = H(obj, iG & 1048575);
                            interfaceC1069d62.J(i15, iT5);
                        }
                        break;
                    case 65:
                        if (K(obj, i15, length)) {
                            jX4 = M(obj, iG & 1048575);
                            interfaceC1069d62.t(i15, jX4);
                        }
                        break;
                    case 66:
                        if (K(obj, i15, length)) {
                            iT6 = H(obj, iG & 1048575);
                            interfaceC1069d62.M(i15, iT6);
                        }
                        break;
                    case 67:
                        if (K(obj, i15, length)) {
                            jX5 = M(obj, iG & 1048575);
                            interfaceC1069d62.K(i15, jX5);
                        }
                        break;
                    case 68:
                        if (!K(obj, i15, length)) {
                            break;
                        }
                        break;
                }
            }
            while (entry4 != null) {
                this.f14655o.c(interfaceC1069d62, entry4);
                entry4 = itI.hasNext() ? (Map.Entry) itI.next() : null;
            }
            return;
        }
        if (this.f14646f) {
            C1201s4 c1201s4B2 = this.f14655o.b(obj);
            if (c1201s4B2.f14831a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itL = c1201s4B2.l();
                entry = (Map.Entry) itL.next();
                it = itL;
            }
        }
        int length2 = this.f14641a.length;
        Unsafe unsafe2 = f14640r;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i17 < length2) {
            int iG2 = G(i17);
            int[] iArr = this.f14641a;
            int i19 = iArr[i17];
            int i20 = (iG2 & i13) >>> 20;
            if (i20 <= 17) {
                int i21 = iArr[i17 + 2];
                int i22 = i21 & i14;
                it2 = it;
                if (i22 != i18) {
                    i16 = i22 == i14 ? 0 : unsafe2.getInt(obj, i22);
                    i18 = i22;
                }
                entry2 = entry;
                i8 = i16;
                i9 = 1 << (i21 >>> 20);
                i7 = i18;
            } else {
                it2 = it;
                i7 = i18;
                entry2 = entry;
                i8 = i16;
                i9 = 0;
            }
            while (entry2 != null && this.f14655o.a(entry2) <= i19) {
                this.f14655o.c(interfaceC1069d62, entry2);
                entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
            }
            long j7 = iG2 & 1048575;
            switch (i20) {
                case 0:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.A(i19, M5.a(obj, j7));
                    }
                    break;
                case 1:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.B(i19, M5.n(obj, j7));
                    }
                    break;
                case 2:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.l(i19, unsafe.getLong(obj, j7));
                    }
                    break;
                case 3:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.N(i19, unsafe.getLong(obj, j7));
                    }
                    break;
                case 4:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.s(i19, unsafe.getInt(obj, j7));
                    }
                    break;
                case 5:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.z(i19, unsafe.getLong(obj, j7));
                    }
                    break;
                case 6:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.n(i19, unsafe.getInt(obj, j7));
                    }
                    break;
                case 7:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.h(i19, M5.F(obj, j7));
                    }
                    break;
                case 8:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        t(i19, unsafe.getObject(obj, j7), interfaceC1069d62);
                    }
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.G(i19, unsafe.getObject(obj, j7), O(i12));
                    }
                    break;
                case 10:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.p(i19, (R3) unsafe.getObject(obj, j7));
                    }
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.D(i19, unsafe.getInt(obj, j7));
                    }
                    break;
                case 12:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.y(i19, unsafe.getInt(obj, j7));
                    }
                    break;
                case 13:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.J(i19, unsafe.getInt(obj, j7));
                    }
                    break;
                case 14:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.t(i19, unsafe.getLong(obj, j7));
                    }
                    break;
                case 15:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    if (z(obj, i12, i10, i8, i9)) {
                        interfaceC1069d62.M(i19, unsafe.getInt(obj, j7));
                    }
                    break;
                case 16:
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    i10 = i7;
                    if (z(obj, i12, i7, i8, i9)) {
                        interfaceC1069d62.K(i19, unsafe.getLong(obj, j7));
                    }
                    break;
                case 17:
                    z6 = false;
                    entry3 = entry2;
                    i12 = i17;
                    i11 = length2;
                    unsafe = unsafe2;
                    if (z(obj, i17, i7, i8, i9)) {
                        interfaceC1069d62 = interfaceC1069d6;
                        interfaceC1069d62.E(i19, unsafe.getObject(obj, j7), O(i12));
                    } else {
                        interfaceC1069d62 = interfaceC1069d6;
                    }
                    i10 = i7;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    z7 = false;
                    AbstractC1245x5.w(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 19:
                    z7 = false;
                    AbstractC1245x5.I(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 20:
                    z7 = false;
                    AbstractC1245x5.O(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    z7 = false;
                    AbstractC1245x5.Y(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 22:
                    z7 = false;
                    AbstractC1245x5.L(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    z7 = false;
                    AbstractC1245x5.F(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    z7 = false;
                    AbstractC1245x5.C(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 25:
                    z7 = false;
                    AbstractC1245x5.k(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 26:
                    AbstractC1245x5.u(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 27:
                    AbstractC1245x5.v(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, O(i17));
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 28:
                    AbstractC1245x5.i(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 29:
                    z7 = false;
                    AbstractC1245x5.X(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 30:
                    z7 = false;
                    AbstractC1245x5.z(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 31:
                    z7 = false;
                    AbstractC1245x5.R(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 32:
                    z7 = false;
                    AbstractC1245x5.U(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 33:
                    z7 = false;
                    AbstractC1245x5.V(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 34:
                    z7 = false;
                    AbstractC1245x5.W(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, false);
                    i10 = i7;
                    entry3 = entry2;
                    z6 = z7;
                    i11 = length2;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 35:
                    AbstractC1245x5.w(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 36:
                    AbstractC1245x5.I(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 37:
                    AbstractC1245x5.O(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 38:
                    AbstractC1245x5.Y(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 39:
                    AbstractC1245x5.L(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 40:
                    AbstractC1245x5.F(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 41:
                    AbstractC1245x5.C(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 42:
                    AbstractC1245x5.k(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 43:
                    AbstractC1245x5.X(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 44:
                    AbstractC1245x5.z(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 45:
                    AbstractC1245x5.R(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 46:
                    AbstractC1245x5.U(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 47:
                    AbstractC1245x5.V(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 48:
                    AbstractC1245x5.W(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, true);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 49:
                    AbstractC1245x5.j(this.f14641a[i17], (List) unsafe2.getObject(obj, j7), interfaceC1069d62, O(i17));
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 50:
                    v(interfaceC1069d62, i19, unsafe2.getObject(obj, j7), i17);
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 51:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.A(i19, j(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 52:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.B(i19, B(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 53:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.l(i19, M(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 54:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.N(i19, M(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 55:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.s(i19, H(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 56:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.z(i19, M(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 57:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.n(i19, H(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 58:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.h(i19, P(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 59:
                    if (K(obj, i19, i17)) {
                        t(i19, unsafe2.getObject(obj, j7), interfaceC1069d62);
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 60:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.G(i19, unsafe2.getObject(obj, j7), O(i17));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 61:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.p(i19, (R3) unsafe2.getObject(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 62:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.D(i19, H(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 63:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.y(i19, H(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 64:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.J(i19, H(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 65:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.t(i19, M(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 66:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.M(i19, H(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 67:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.K(i19, M(obj, j7));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                case 68:
                    if (K(obj, i19, i17)) {
                        interfaceC1069d62.E(i19, unsafe2.getObject(obj, j7), O(i17));
                    }
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
                default:
                    i10 = i7;
                    entry3 = entry2;
                    i11 = length2;
                    z6 = false;
                    i12 = i17;
                    unsafe = unsafe2;
                    break;
            }
            i17 = i12 + 3;
            i16 = i8;
            unsafe2 = unsafe;
            i14 = 1048575;
            it = it2;
            entry = entry3;
            length2 = i11;
            i18 = i10;
            i13 = 267386880;
        }
        Iterator it3 = it;
        while (entry != null) {
            this.f14655o.c(interfaceC1069d62, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        u(this.f14654n, obj, interfaceC1069d62);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01da, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e7, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f4, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0201, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020e, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021b, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0229, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0237, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0245, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0253, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0356, code lost:
    
        if (z(r18, r11, r14, r16, r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0366, code lost:
    
        if (z(r18, r11, r14, r16, r5) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03e3, code lost:
    
        if (z(r18, r11, r14, r16, r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (K(r18, r13, r11) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        r0 = com.google.android.gms.internal.measurement.AbstractC1112i4.e0(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (K(r18, r13, r11) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        r1 = com.google.android.gms.internal.measurement.AbstractC1112i4.p0(r13, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        if (K(r18, r13, r11) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
    
        r0 = com.google.android.gms.internal.measurement.AbstractC1112i4.z(r13, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019b, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019d, code lost:
    
        r1 = (com.google.android.gms.internal.measurement.AbstractC1112i4.s0(r13) + com.google.android.gms.internal.measurement.AbstractC1112i4.v0(r0)) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b3, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cd, code lost:
    
        if (r0 > 0) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2 A[PHI: r0
      0x00d2: PHI (r0v190 java.lang.Object) = (r0v43 java.lang.Object), (r0v49 java.lang.Object), (r0v185 java.lang.Object), (r0v194 java.lang.Object) binds: [B:176:0x03d3, B:169:0x03a3, B:60:0x00f8, B:51:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb A[PHI: r0
      0x00fb: PHI (r0v181 java.lang.Object) = (r0v43 java.lang.Object), (r0v185 java.lang.Object) binds: [B:176:0x03d3, B:60:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(Object obj) {
        int i7;
        int i8;
        int i9;
        int iE;
        Object object;
        Object object2;
        int iH;
        int iH2;
        int iH3;
        long jM;
        Object object3;
        int iA;
        boolean z6;
        int iG;
        int iB;
        Unsafe unsafe = f14640r;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f14641a.length) {
            int iG2 = G(i13);
            int i15 = (267386880 & iG2) >>> 20;
            int[] iArr = this.f14641a;
            int i16 = iArr[i13];
            int i17 = iArr[i13 + 2];
            int i18 = i17 & i10;
            if (i15 <= 17) {
                if (i18 != i11) {
                    i12 = i18 == i10 ? 0 : unsafe.getInt(obj, i18);
                    i11 = i18;
                }
                i7 = i11;
                i8 = i12;
                i9 = 1 << (i17 >>> 20);
            } else {
                i7 = i11;
                i8 = i12;
                i9 = 0;
            }
            long j7 = iG2 & i10;
            if (i15 >= EnumC1210t4.f14871W.a()) {
                EnumC1210t4.f14884j0.a();
            }
            switch (i15) {
                case 0:
                    if (z(obj, i13, i7, i8, i9)) {
                        iE = AbstractC1112i4.e(i16, 0.0d);
                        i14 += iE;
                    }
                    break;
                case 1:
                    if (z(obj, i13, i7, i8, i9)) {
                        iE = AbstractC1112i4.f(i16, 0.0f);
                        i14 += iE;
                    }
                    break;
                case 2:
                    if (z(obj, i13, i7, i8, i9)) {
                        iE = AbstractC1112i4.Y(i16, unsafe.getLong(obj, j7));
                        i14 += iE;
                    }
                    break;
                case 3:
                    if (z(obj, i13, i7, i8, i9)) {
                        iE = AbstractC1112i4.m0(i16, unsafe.getLong(obj, j7));
                        i14 += iE;
                    }
                    break;
                case 4:
                    if (z(obj, i13, i7, i8, i9)) {
                        iE = AbstractC1112i4.l0(i16, unsafe.getInt(obj, j7));
                        i14 += iE;
                    }
                    break;
                case 5:
                    if (z(obj, i13, i7, i8, i9)) {
                        iE = AbstractC1112i4.P(i16, 0L);
                        i14 += iE;
                    }
                    break;
                case 6:
                    if (z(obj, i13, i7, i8, i9)) {
                        iE = AbstractC1112i4.h0(i16, 0);
                        i14 += iE;
                    }
                    break;
                case 8:
                    if (z(obj, i13, i7, i8, i9)) {
                        object = unsafe.getObject(obj, j7);
                        iA = object instanceof R3 ? AbstractC1112i4.Q(i16, (R3) object) : AbstractC1112i4.y(i16, (String) object);
                        i14 += iA;
                    }
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    if (z(obj, i13, i7, i8, i9)) {
                        object2 = unsafe.getObject(obj, j7);
                        iA = AbstractC1245x5.a(i16, object2, O(i13));
                        i14 += iA;
                    }
                    break;
                case 10:
                    if (z(obj, i13, i7, i8, i9)) {
                        object = unsafe.getObject(obj, j7);
                        i14 += iA;
                    }
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (z(obj, i13, i7, i8, i9)) {
                        iH = unsafe.getInt(obj, j7);
                        iA = AbstractC1112i4.w0(i16, iH);
                        i14 += iA;
                    }
                    break;
                case 12:
                    if (z(obj, i13, i7, i8, i9)) {
                        iH2 = unsafe.getInt(obj, j7);
                        iA = AbstractC1112i4.d0(i16, iH2);
                        i14 += iA;
                    }
                    break;
                case 15:
                    if (z(obj, i13, i7, i8, i9)) {
                        iH3 = unsafe.getInt(obj, j7);
                        iA = AbstractC1112i4.t0(i16, iH3);
                        i14 += iA;
                    }
                    break;
                case 16:
                    if (z(obj, i13, i7, i8, i9)) {
                        jM = unsafe.getLong(obj, j7);
                        iA = AbstractC1112i4.i0(i16, jM);
                        i14 += iA;
                    }
                    break;
                case 17:
                    if (z(obj, i13, i7, i8, i9)) {
                        object3 = unsafe.getObject(obj, j7);
                        iA = AbstractC1112i4.x(i16, (InterfaceC1095g5) object3, O(i13));
                        i14 += iA;
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    iA = AbstractC1245x5.A(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iA;
                    break;
                case 19:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 31:
                    z6 = false;
                    iG = AbstractC1245x5.x(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iG;
                    break;
                case 20:
                    z6 = false;
                    iG = AbstractC1245x5.G(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iG;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    z6 = false;
                    iG = AbstractC1245x5.S(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iG;
                    break;
                case 22:
                    z6 = false;
                    iG = AbstractC1245x5.D(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iG;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                case 32:
                    z6 = false;
                    iG = AbstractC1245x5.A(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iG;
                    break;
                case 25:
                    z6 = false;
                    iG = AbstractC1245x5.d(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iG;
                    break;
                case 26:
                    iA = AbstractC1245x5.q(i16, (List) unsafe.getObject(obj, j7));
                    i14 += iA;
                    break;
                case 27:
                    iA = AbstractC1245x5.r(i16, (List) unsafe.getObject(obj, j7), O(i13));
                    i14 += iA;
                    break;
                case 28:
                    iA = AbstractC1245x5.b(i16, (List) unsafe.getObject(obj, j7));
                    i14 += iA;
                    break;
                case 29:
                    iA = AbstractC1245x5.P(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iA;
                    break;
                case 30:
                    z6 = false;
                    iG = AbstractC1245x5.s(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iG;
                    break;
                case 33:
                    z6 = false;
                    iG = AbstractC1245x5.J(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iG;
                    break;
                case 34:
                    z6 = false;
                    iG = AbstractC1245x5.M(i16, (List) unsafe.getObject(obj, j7), false);
                    i14 += iG;
                    break;
                case 35:
                    iB = AbstractC1245x5.B((List) unsafe.getObject(obj, j7));
                    break;
                case 36:
                    iB = AbstractC1245x5.y((List) unsafe.getObject(obj, j7));
                    break;
                case 37:
                    iB = AbstractC1245x5.H((List) unsafe.getObject(obj, j7));
                    break;
                case 38:
                    iB = AbstractC1245x5.T((List) unsafe.getObject(obj, j7));
                    break;
                case 39:
                    iB = AbstractC1245x5.E((List) unsafe.getObject(obj, j7));
                    break;
                case 40:
                    iB = AbstractC1245x5.B((List) unsafe.getObject(obj, j7));
                    break;
                case 41:
                    iB = AbstractC1245x5.y((List) unsafe.getObject(obj, j7));
                    break;
                case 42:
                    iB = AbstractC1245x5.e((List) unsafe.getObject(obj, j7));
                    break;
                case 43:
                    iB = AbstractC1245x5.Q((List) unsafe.getObject(obj, j7));
                    break;
                case 44:
                    iB = AbstractC1245x5.t((List) unsafe.getObject(obj, j7));
                    break;
                case 45:
                    iB = AbstractC1245x5.y((List) unsafe.getObject(obj, j7));
                    break;
                case 46:
                    iB = AbstractC1245x5.B((List) unsafe.getObject(obj, j7));
                    break;
                case 47:
                    iB = AbstractC1245x5.K((List) unsafe.getObject(obj, j7));
                    break;
                case 48:
                    iB = AbstractC1245x5.N((List) unsafe.getObject(obj, j7));
                    break;
                case 49:
                    iA = AbstractC1245x5.c(i16, (List) unsafe.getObject(obj, j7), O(i13));
                    i14 += iA;
                    break;
                case 50:
                    iA = this.f14656p.j(i16, unsafe.getObject(obj, j7), Q(i13));
                    i14 += iA;
                    break;
                case 51:
                    if (K(obj, i16, i13)) {
                        iA = AbstractC1112i4.e(i16, 0.0d);
                        i14 += iA;
                    }
                    break;
                case 52:
                    if (K(obj, i16, i13)) {
                        iA = AbstractC1112i4.f(i16, 0.0f);
                        i14 += iA;
                    }
                    break;
                case 53:
                    if (K(obj, i16, i13)) {
                        iA = AbstractC1112i4.Y(i16, M(obj, j7));
                        i14 += iA;
                    }
                    break;
                case 54:
                    if (K(obj, i16, i13)) {
                        iA = AbstractC1112i4.m0(i16, M(obj, j7));
                        i14 += iA;
                    }
                    break;
                case 55:
                    if (K(obj, i16, i13)) {
                        iA = AbstractC1112i4.l0(i16, H(obj, j7));
                        i14 += iA;
                    }
                    break;
                case 56:
                    if (K(obj, i16, i13)) {
                        iA = AbstractC1112i4.P(i16, 0L);
                        i14 += iA;
                    }
                    break;
                case 57:
                    if (K(obj, i16, i13)) {
                        int iS0 = AbstractC1112i4.h0(i16, 0);
                        i14 += iS0;
                    }
                    break;
                case 59:
                    if (K(obj, i16, i13)) {
                        object = unsafe.getObject(obj, j7);
                        if (object instanceof R3) {
                        }
                        i14 += iA;
                    }
                    break;
                case 60:
                    if (K(obj, i16, i13)) {
                        object2 = unsafe.getObject(obj, j7);
                        iA = AbstractC1245x5.a(i16, object2, O(i13));
                        i14 += iA;
                    }
                    break;
                case 61:
                    if (K(obj, i16, i13)) {
                        object = unsafe.getObject(obj, j7);
                        i14 += iA;
                    }
                    break;
                case 62:
                    if (K(obj, i16, i13)) {
                        iH = H(obj, j7);
                        iA = AbstractC1112i4.w0(i16, iH);
                        i14 += iA;
                    }
                    break;
                case 63:
                    if (K(obj, i16, i13)) {
                        iH2 = H(obj, j7);
                        iA = AbstractC1112i4.d0(i16, iH2);
                        i14 += iA;
                    }
                    break;
                case 66:
                    if (K(obj, i16, i13)) {
                        iH3 = H(obj, j7);
                        iA = AbstractC1112i4.t0(i16, iH3);
                        i14 += iA;
                    }
                    break;
                case 67:
                    if (K(obj, i16, i13)) {
                        jM = M(obj, j7);
                        iA = AbstractC1112i4.i0(i16, jM);
                        i14 += iA;
                    }
                    break;
                case 68:
                    if (K(obj, i16, i13)) {
                        object3 = unsafe.getObject(obj, j7);
                        iA = AbstractC1112i4.x(i16, (InterfaceC1095g5) object3, O(i13));
                        i14 += iA;
                    }
                    break;
            }
            i13 += 3;
            i11 = i7;
            i12 = i8;
            i10 = 1048575;
        }
        int iB2 = 0;
        L5 l52 = this.f14654n;
        int iA2 = i14 + l52.a(l52.k(obj));
        if (!this.f14646f) {
            return iA2;
        }
        C1201s4 c1201s4B = this.f14655o.b(obj);
        int iA3 = c1201s4B.f14831a.a();
        for (int i19 = 0; i19 < iA3; i19++) {
            Map.Entry entryG = c1201s4B.f14831a.g(i19);
            androidx.appcompat.app.y.a(entryG.getKey());
            iB2 += C1201s4.b(null, entryG.getValue());
        }
        for (Map.Entry entry : c1201s4B.f14831a.h()) {
            androidx.appcompat.app.y.a(entry.getKey());
            iB2 += C1201s4.b(null, entry.getValue());
        }
        return iA2 + iB2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f14650j) {
            int i12 = this.f14649i[i11];
            int i13 = this.f14641a[i12];
            int iG = G(i12);
            int i14 = this.f14641a[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = f14640r.getInt(obj, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & iG) != 0 && !z(obj, i12, i7, i8, i16)) {
                return false;
            }
            int i17 = (267386880 & iG) >>> 20;
            if (i17 == 9 || i17 == 17) {
                if (z(obj, i12, i7, i8, i16) && !A(obj, iG, O(i12))) {
                    return false;
                }
            } else if (i17 == 27) {
                List list = (List) M5.B(obj, iG & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC1229v5 interfaceC1229v5O = O(i12);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!interfaceC1229v5O.d(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (i17 == 60 || i17 == 68) {
                if (K(obj, i13, i12) && !A(obj, iG, O(i12))) {
                    return false;
                }
            } else if (i17 != 49) {
                if (i17 == 50 && !this.f14656p.g(M5.B(obj, iG & 1048575)).isEmpty()) {
                    this.f14656p.c(Q(i12));
                    throw null;
                }
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return !this.f14646f || this.f14655o.b(obj).n();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4 A[PHI: r3
      0x00f4: PHI (r3v9 java.lang.Object) = (r3v6 java.lang.Object), (r3v10 java.lang.Object) binds: [B:74:0x0110, B:68:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(Object obj) {
        int i7;
        double dA;
        float fN;
        boolean zF;
        Object objB;
        int iT;
        long jX;
        Object objB2;
        int length = this.f14641a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iG = G(i9);
            int i10 = this.f14641a[i9];
            long j7 = 1048575 & iG;
            int iHashCode = 37;
            switch ((iG & 267386880) >>> 20) {
                case 0:
                    i7 = i8 * 53;
                    dA = M5.a(obj, j7);
                    jX = Double.doubleToLongBits(dA);
                    iT = B4.b(jX);
                    i8 = i7 + iT;
                    break;
                case 1:
                    i7 = i8 * 53;
                    fN = M5.n(obj, j7);
                    iT = Float.floatToIntBits(fN);
                    i8 = i7 + iT;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i7 = i8 * 53;
                    jX = M5.x(obj, j7);
                    iT = B4.b(jX);
                    i8 = i7 + iT;
                    break;
                case 4:
                case 6:
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                case 12:
                case 13:
                case 15:
                    i7 = i8 * 53;
                    iT = M5.t(obj, j7);
                    i8 = i7 + iT;
                    break;
                case 7:
                    i7 = i8 * 53;
                    zF = M5.F(obj, j7);
                    iT = B4.c(zF);
                    i8 = i7 + iT;
                    break;
                case 8:
                    i7 = i8 * 53;
                    iT = ((String) M5.B(obj, j7)).hashCode();
                    i8 = i7 + iT;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    objB = M5.B(obj, j7);
                    if (objB != null) {
                        iHashCode = objB.hashCode();
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 10:
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i7 = i8 * 53;
                    objB2 = M5.B(obj, j7);
                    iT = objB2.hashCode();
                    i8 = i7 + iT;
                    break;
                case 17:
                    objB = M5.B(obj, j7);
                    if (objB != null) {
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 51:
                    if (K(obj, i10, i9)) {
                        i7 = i8 * 53;
                        dA = j(obj, j7);
                        jX = Double.doubleToLongBits(dA);
                        iT = B4.b(jX);
                        i8 = i7 + iT;
                    }
                    break;
                case 52:
                    if (K(obj, i10, i9)) {
                        i7 = i8 * 53;
                        fN = B(obj, j7);
                        iT = Float.floatToIntBits(fN);
                        i8 = i7 + iT;
                    }
                    break;
                case 53:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jX = M(obj, j7);
                    iT = B4.b(jX);
                    i8 = i7 + iT;
                    break;
                case 54:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jX = M(obj, j7);
                    iT = B4.b(jX);
                    i8 = i7 + iT;
                    break;
                case 55:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iT = H(obj, j7);
                    i8 = i7 + iT;
                    break;
                case 56:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jX = M(obj, j7);
                    iT = B4.b(jX);
                    i8 = i7 + iT;
                    break;
                case 57:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iT = H(obj, j7);
                    i8 = i7 + iT;
                    break;
                case 58:
                    if (K(obj, i10, i9)) {
                        i7 = i8 * 53;
                        zF = P(obj, j7);
                        iT = B4.c(zF);
                        i8 = i7 + iT;
                    }
                    break;
                case 59:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iT = ((String) M5.B(obj, j7)).hashCode();
                    i8 = i7 + iT;
                    break;
                case 60:
                    if (!K(obj, i10, i9)) {
                    }
                    objB2 = M5.B(obj, j7);
                    i7 = i8 * 53;
                    iT = objB2.hashCode();
                    i8 = i7 + iT;
                    break;
                case 61:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    objB2 = M5.B(obj, j7);
                    iT = objB2.hashCode();
                    i8 = i7 + iT;
                    break;
                case 62:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iT = H(obj, j7);
                    i8 = i7 + iT;
                    break;
                case 63:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iT = H(obj, j7);
                    i8 = i7 + iT;
                    break;
                case 64:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iT = H(obj, j7);
                    i8 = i7 + iT;
                    break;
                case 65:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jX = M(obj, j7);
                    iT = B4.b(jX);
                    i8 = i7 + iT;
                    break;
                case 66:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iT = H(obj, j7);
                    i8 = i7 + iT;
                    break;
                case 67:
                    if (!K(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jX = M(obj, j7);
                    iT = B4.b(jX);
                    i8 = i7 + iT;
                    break;
                case 68:
                    if (!K(obj, i10, i9)) {
                    }
                    objB2 = M5.B(obj, j7);
                    i7 = i8 * 53;
                    iT = objB2.hashCode();
                    i8 = i7 + iT;
                    break;
            }
        }
        int iHashCode2 = (i8 * 53) + this.f14654n.k(obj).hashCode();
        return this.f14646f ? (iHashCode2 * 53) + this.f14655o.b(obj).hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    public final void f(Object obj, byte[] bArr, int i7, int i8, Q3 q32) throws I4 {
        m(obj, bArr, i7, i8, 0, q32);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1122j5.g(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, Object obj2) {
        R(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f14641a.length; i7 += 3) {
            int iG = G(i7);
            long j7 = 1048575 & iG;
            int i8 = this.f14641a[i7];
            switch ((iG & 267386880) >>> 20) {
                case 0:
                    if (J(obj2, i7)) {
                        M5.f(obj, j7, M5.a(obj2, j7));
                        D(obj, i7);
                    }
                    break;
                case 1:
                    if (J(obj2, i7)) {
                        M5.g(obj, j7, M5.n(obj2, j7));
                        D(obj, i7);
                    }
                    break;
                case 2:
                    if (!J(obj2, i7)) {
                    }
                    M5.i(obj, j7, M5.x(obj2, j7));
                    D(obj, i7);
                    break;
                case 3:
                    if (!J(obj2, i7)) {
                    }
                    M5.i(obj, j7, M5.x(obj2, j7));
                    D(obj, i7);
                    break;
                case 4:
                    if (!J(obj2, i7)) {
                    }
                    M5.h(obj, j7, M5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 5:
                    if (!J(obj2, i7)) {
                    }
                    M5.i(obj, j7, M5.x(obj2, j7));
                    D(obj, i7);
                    break;
                case 6:
                    if (!J(obj2, i7)) {
                    }
                    M5.h(obj, j7, M5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 7:
                    if (J(obj2, i7)) {
                        M5.v(obj, j7, M5.F(obj2, j7));
                        D(obj, i7);
                    }
                    break;
                case 8:
                    if (!J(obj2, i7)) {
                    }
                    M5.j(obj, j7, M5.B(obj2, j7));
                    D(obj, i7);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                case 17:
                    y(obj, obj2, i7);
                    break;
                case 10:
                    if (!J(obj2, i7)) {
                    }
                    M5.j(obj, j7, M5.B(obj2, j7));
                    D(obj, i7);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (!J(obj2, i7)) {
                    }
                    M5.h(obj, j7, M5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 12:
                    if (!J(obj2, i7)) {
                    }
                    M5.h(obj, j7, M5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 13:
                    if (!J(obj2, i7)) {
                    }
                    M5.h(obj, j7, M5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 14:
                    if (!J(obj2, i7)) {
                    }
                    M5.i(obj, j7, M5.x(obj2, j7));
                    D(obj, i7);
                    break;
                case 15:
                    if (!J(obj2, i7)) {
                    }
                    M5.h(obj, j7, M5.t(obj2, j7));
                    D(obj, i7);
                    break;
                case 16:
                    if (!J(obj2, i7)) {
                    }
                    M5.i(obj, j7, M5.x(obj2, j7));
                    D(obj, i7);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f14653m.b(obj, obj2, j7);
                    break;
                case 50:
                    AbstractC1245x5.m(this.f14656p, obj, obj2, j7);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (K(obj2, i8, i7)) {
                        M5.j(obj, j7, M5.B(obj2, j7));
                        E(obj, i8, i7);
                    }
                    break;
                case 60:
                case 68:
                    F(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!K(obj2, i8, i7)) {
                        break;
                    }
                    break;
            }
        }
        AbstractC1245x5.n(this.f14654n, obj, obj2);
        if (this.f14646f) {
            AbstractC1245x5.l(this.f14655o, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1229v5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(Object obj, Object obj2) {
        int length = this.f14641a.length;
        int i7 = 0;
        while (true) {
            boolean zP = true;
            if (i7 >= length) {
                if (!this.f14654n.k(obj).equals(this.f14654n.k(obj2))) {
                    return false;
                }
                if (this.f14646f) {
                    return this.f14655o.b(obj).equals(this.f14655o.b(obj2));
                }
                return true;
            }
            int iG = G(i7);
            long j7 = iG & 1048575;
            switch ((iG & 267386880) >>> 20) {
                case 0:
                    if (!L(obj, obj2, i7) || Double.doubleToLongBits(M5.a(obj, j7)) != Double.doubleToLongBits(M5.a(obj2, j7))) {
                        zP = false;
                    }
                    break;
                case 1:
                    if (!L(obj, obj2, i7) || Float.floatToIntBits(M5.n(obj, j7)) != Float.floatToIntBits(M5.n(obj2, j7))) {
                    }
                    break;
                case 2:
                    if (!L(obj, obj2, i7) || M5.x(obj, j7) != M5.x(obj2, j7)) {
                    }
                    break;
                case 3:
                    if (!L(obj, obj2, i7) || M5.x(obj, j7) != M5.x(obj2, j7)) {
                    }
                    break;
                case 4:
                    if (!L(obj, obj2, i7) || M5.t(obj, j7) != M5.t(obj2, j7)) {
                    }
                    break;
                case 5:
                    if (!L(obj, obj2, i7) || M5.x(obj, j7) != M5.x(obj2, j7)) {
                    }
                    break;
                case 6:
                    if (!L(obj, obj2, i7) || M5.t(obj, j7) != M5.t(obj2, j7)) {
                    }
                    break;
                case 7:
                    if (!L(obj, obj2, i7) || M5.F(obj, j7) != M5.F(obj2, j7)) {
                    }
                    break;
                case 8:
                    if (!L(obj, obj2, i7) || !AbstractC1245x5.p(M5.B(obj, j7), M5.B(obj2, j7))) {
                    }
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    if (!L(obj, obj2, i7) || !AbstractC1245x5.p(M5.B(obj, j7), M5.B(obj2, j7))) {
                    }
                    break;
                case 10:
                    if (!L(obj, obj2, i7) || !AbstractC1245x5.p(M5.B(obj, j7), M5.B(obj2, j7))) {
                    }
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (!L(obj, obj2, i7) || M5.t(obj, j7) != M5.t(obj2, j7)) {
                    }
                    break;
                case 12:
                    if (!L(obj, obj2, i7) || M5.t(obj, j7) != M5.t(obj2, j7)) {
                    }
                    break;
                case 13:
                    if (!L(obj, obj2, i7) || M5.t(obj, j7) != M5.t(obj2, j7)) {
                    }
                    break;
                case 14:
                    if (!L(obj, obj2, i7) || M5.x(obj, j7) != M5.x(obj2, j7)) {
                    }
                    break;
                case 15:
                    if (!L(obj, obj2, i7) || M5.t(obj, j7) != M5.t(obj2, j7)) {
                    }
                    break;
                case 16:
                    if (!L(obj, obj2, i7) || M5.x(obj, j7) != M5.x(obj2, j7)) {
                    }
                    break;
                case 17:
                    if (!L(obj, obj2, i7) || !AbstractC1245x5.p(M5.B(obj, j7), M5.B(obj2, j7))) {
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    zP = AbstractC1245x5.p(M5.B(obj, j7), M5.B(obj2, j7));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jC = C(i7) & 1048575;
                    if (M5.t(obj, jC) != M5.t(obj2, jC) || !AbstractC1245x5.p(M5.B(obj, j7), M5.B(obj2, j7))) {
                    }
                    break;
            }
            if (!zP) {
                return false;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0889 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0b88 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0879 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x05af -> B:187:0x0589). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:227:0x0643 -> B:219:0x0622). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:249:0x0690 -> B:239:0x0667). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int m(Object obj, byte[] bArr, int i7, int i8, int i9, Q3 q32) throws I4 {
        int i10;
        int i11;
        Unsafe unsafe;
        int i12;
        int i13;
        int i14;
        int i15;
        Q3 q33;
        Unsafe unsafe2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Q3 q34;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Unsafe unsafe3;
        int iR;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Q3 q35;
        int i32;
        int i33;
        long j7;
        Object objValueOf;
        Object objValueOf2;
        long j8;
        int iS;
        Object objValueOf3;
        int i34;
        Q3 q36;
        int i35;
        int i36;
        long j9;
        Object objValueOf4;
        Unsafe unsafe4;
        J4 j4D;
        int i37;
        Q3 q37;
        int i38;
        int i39;
        Unsafe unsafe5;
        int i40;
        int iS2;
        int iL;
        int i41;
        Unsafe unsafe6;
        int i42;
        int i43;
        int i44;
        int i45;
        Q3 q38;
        int i46;
        int i47;
        Unsafe unsafe7;
        J4 j42;
        int i48;
        Q3 q39;
        int i49;
        int i50;
        Q3 q310;
        J4 j43;
        int iB;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i51 = i8;
        int i52 = i9;
        Q3 q311 = q32;
        R(obj);
        Unsafe unsafe8 = f14640r;
        int iC = i7;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = -1;
        int i57 = 1048575;
        while (true) {
            if (iC < i51) {
                int i58 = iC + 1;
                byte b7 = bArr2[iC];
                if (b7 < 0) {
                    int iE = N3.e(b7, bArr2, i58, q311);
                    i15 = q311.f14318a;
                    i58 = iE;
                } else {
                    i15 = b7;
                }
                int i59 = i15 >>> 3;
                int i60 = i15 & 7;
                int iL2 = i59 > i56 ? (i59 < this.f14643c || i59 > this.f14644d) ? -1 : l(i59, i53 / 3) : k(i59);
                if (iL2 == -1) {
                    q33 = q311;
                    unsafe2 = unsafe8;
                    i16 = i59;
                    i17 = i58;
                    i54 = i15;
                    i18 = i55;
                    i19 = i57;
                    i20 = 0;
                } else {
                    int[] iArr = this.f14641a;
                    int i61 = iArr[iL2 + 1];
                    int i62 = (i61 & 267386880) >>> 20;
                    int i63 = i58;
                    int i64 = i15;
                    long j10 = i61 & 1048575;
                    if (i62 <= 17) {
                        int i65 = iArr[iL2 + 2];
                        int i66 = 1 << (i65 >>> 20);
                        int i67 = 1048575;
                        int i68 = i65 & 1048575;
                        if (i68 != i57) {
                            if (i57 != 1048575) {
                                unsafe8.putInt(obj2, i57, i55);
                                i67 = 1048575;
                            }
                            i19 = i68;
                            i18 = i68 == i67 ? 0 : unsafe8.getInt(obj2, i68);
                        } else {
                            i18 = i55;
                            i19 = i57;
                        }
                        switch (i62) {
                            case 0:
                                i23 = i8;
                                i52 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 1) {
                                    M5.f(obj2, j10, N3.a(bArr2, i22));
                                    iR = i22 + 8;
                                    i28 = i18 | i66;
                                    unsafe8 = unsafe3;
                                    i51 = i23;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 1:
                                i23 = i8;
                                i52 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 5) {
                                    M5.g(obj2, j10, N3.n(bArr2, i22));
                                    iR = i22 + 4;
                                    i28 = i18 | i66;
                                    unsafe8 = unsafe3;
                                    i51 = i23;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 2:
                            case 3:
                                i26 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 0) {
                                    int iS3 = N3.s(bArr2, i22, q34);
                                    unsafe3.putLong(obj, j10, q34.f14319b);
                                    i27 = i18 | i66;
                                    unsafe8 = unsafe3;
                                    i51 = i8;
                                    iC = iS3;
                                    i52 = i26;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    i55 = i27;
                                } else {
                                    i52 = i26;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 4:
                            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                                i23 = i8;
                                i26 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 0) {
                                    iR = N3.r(bArr2, i22, q34);
                                    unsafe3.putInt(obj2, j10, q34.f14318a);
                                    i28 = i18 | i66;
                                    i52 = i26;
                                    unsafe8 = unsafe3;
                                    i51 = i23;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    i52 = i26;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 5:
                            case 14:
                                i26 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 1) {
                                    unsafe3.putLong(obj, j10, N3.t(bArr2, i22));
                                    iR = i22 + 8;
                                    i28 = i18 | i66;
                                    unsafe8 = unsafe3;
                                    i51 = i8;
                                    i52 = i26;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    i52 = i26;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 6:
                            case 13:
                                i23 = i8;
                                i26 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 5) {
                                    unsafe3.putInt(obj2, j10, N3.q(bArr2, i22));
                                    iR = i22 + 4;
                                    i28 = i18 | i66;
                                    i52 = i26;
                                    unsafe8 = unsafe3;
                                    i51 = i23;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    i52 = i26;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 7:
                                i23 = i8;
                                i26 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 0) {
                                    iR = N3.s(bArr2, i22, q34);
                                    M5.v(obj2, j10, q34.f14319b != 0);
                                    i28 = i18 | i66;
                                    i52 = i26;
                                    unsafe8 = unsafe3;
                                    i51 = i23;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    i52 = i26;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 8:
                                i23 = i8;
                                i26 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 2) {
                                    if (S(i61)) {
                                        iR = N3.p(bArr2, i22, q34);
                                    } else {
                                        iR = N3.r(bArr2, i22, q34);
                                        int i69 = q34.f14318a;
                                        if (i69 < 0) {
                                            throw I4.d();
                                        }
                                        if (i69 == 0) {
                                            q34.f14320c = "";
                                        } else {
                                            q34.f14320c = new String(bArr2, iR, i69, B4.f14139a);
                                            iR += i69;
                                        }
                                    }
                                    unsafe3.putObject(obj2, j10, q34.f14320c);
                                    i28 = i18 | i66;
                                    i52 = i26;
                                    unsafe8 = unsafe3;
                                    i51 = i23;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    i52 = i26;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case ConnectionResult.SERVICE_INVALID /* 9 */:
                                i52 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i29 = i64;
                                i22 = i63;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 2) {
                                    Object objP = p(obj2, i21);
                                    i24 = i29;
                                    iR = N3.j(objP, O(i21), bArr, i22, i8, q32);
                                    x(obj2, i21, objP);
                                    i28 = i18 | i66;
                                    unsafe8 = unsafe3;
                                    i51 = i8;
                                    i52 = i52;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    i24 = i29;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 10:
                                i52 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i29 = i64;
                                i22 = i63;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 2) {
                                    iR = N3.k(bArr2, i22, q34);
                                    unsafe3.putObject(obj2, j10, q34.f14320c);
                                    i28 = i18 | i66;
                                    i54 = i29;
                                    unsafe8 = unsafe3;
                                    i51 = i8;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    i24 = i29;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 12:
                                i52 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 0) {
                                    int iR2 = N3.r(bArr2, i22, q34);
                                    int i70 = q34.f14318a;
                                    D4 d4N = N(i21);
                                    if ((i61 & Integer.MIN_VALUE) == 0 || d4N == null || d4N.d(i70)) {
                                        unsafe3.putInt(obj2, j10, i70);
                                        i54 = i24;
                                        unsafe8 = unsafe3;
                                        i51 = i8;
                                        i53 = i21;
                                        q311 = q34;
                                        i56 = i25;
                                        i57 = i19;
                                        i55 = i18 | i66;
                                    } else {
                                        I(obj).e(i24, Long.valueOf(i70));
                                        i54 = i24;
                                        unsafe8 = unsafe3;
                                        i51 = i8;
                                        i53 = i21;
                                        q311 = q34;
                                        i56 = i25;
                                        i55 = i18;
                                        i57 = i19;
                                    }
                                    iC = iR2;
                                } else {
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 15:
                                i23 = i8;
                                i52 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                if (i60 == 0) {
                                    iR = N3.r(bArr2, i22, q34);
                                    unsafe3.putInt(obj2, j10, AbstractC1067d4.a(q34.f14318a));
                                    i28 = i18 | i66;
                                    unsafe8 = unsafe3;
                                    i51 = i23;
                                    i53 = i21;
                                    q311 = q34;
                                    i56 = i25;
                                    i54 = i24;
                                    i57 = i19;
                                    iC = iR;
                                    i55 = i28;
                                } else {
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 16:
                                if (i60 == 0) {
                                    int iS4 = N3.s(bArr2, i63, q311);
                                    unsafe8.putLong(obj, j10, AbstractC1067d4.b(q311.f14319b));
                                    i27 = i18 | i66;
                                    unsafe8 = unsafe8;
                                    i51 = i8;
                                    i52 = i9;
                                    i53 = iL2;
                                    q311 = q311;
                                    i56 = i59;
                                    i54 = i64;
                                    i57 = i19;
                                    iC = iS4;
                                    i55 = i27;
                                } else {
                                    q34 = q311;
                                    unsafe3 = unsafe8;
                                    i21 = iL2;
                                    i25 = i59;
                                    i22 = i63;
                                    i52 = i9;
                                    i24 = i64;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            case 17:
                                if (i60 == 3) {
                                    Object objP2 = p(obj2, iL2);
                                    iC = N3.i(objP2, O(iL2), bArr, i63, i8, (i59 << 3) | 4, q32);
                                    x(obj2, iL2, objP2);
                                    i55 = i18 | i66;
                                    i54 = i64;
                                    i53 = iL2;
                                    i56 = i59;
                                    i57 = i19;
                                    i51 = i8;
                                    i52 = i9;
                                } else {
                                    i52 = i9;
                                    q34 = q311;
                                    i21 = iL2;
                                    i22 = i63;
                                    i24 = i64;
                                    i25 = i59;
                                    unsafe3 = unsafe8;
                                    unsafe2 = unsafe3;
                                    i17 = i22;
                                    q33 = q34;
                                    i16 = i25;
                                    i54 = i24;
                                    i20 = i21;
                                }
                                break;
                            default:
                                i52 = i9;
                                q34 = q311;
                                i21 = iL2;
                                i22 = i63;
                                i24 = i64;
                                i25 = i59;
                                unsafe3 = unsafe8;
                                unsafe2 = unsafe3;
                                i17 = i22;
                                q33 = q34;
                                i16 = i25;
                                i54 = i24;
                                i20 = i21;
                                break;
                        }
                    } else {
                        i18 = i55;
                        i19 = i57;
                        Q3 q312 = q311;
                        int i71 = i64;
                        Unsafe unsafe9 = unsafe8;
                        if (i62 != 27) {
                            if (i62 <= 49) {
                                long j11 = i61;
                                Unsafe unsafe10 = f14640r;
                                J4 j44 = (J4) unsafe10.getObject(obj2, j10);
                                if (j44.zzc()) {
                                    unsafe4 = unsafe9;
                                    j4D = j44;
                                } else {
                                    unsafe4 = unsafe9;
                                    j4D = j44.d(j44.size() << 1);
                                    unsafe10.putObject(obj2, j10, j4D);
                                }
                                switch (i62) {
                                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                    case 35:
                                        i37 = i9;
                                        i53 = iL2;
                                        q37 = q312;
                                        i38 = i63;
                                        i39 = i71;
                                        unsafe5 = unsafe4;
                                        i40 = i8;
                                        if (i60 == 2) {
                                            androidx.appcompat.app.y.a(j4D);
                                            if (N3.r(bArr2, i38, q37) + q37.f14318a > bArr2.length) {
                                                throw I4.g();
                                            }
                                            throw null;
                                        }
                                        if (i60 == 1) {
                                            androidx.appcompat.app.y.a(j4D);
                                            N3.a(bArr2, i38);
                                            throw null;
                                        }
                                        iL = i38;
                                        if (iL != i38) {
                                            i17 = iL;
                                            i52 = i37;
                                            unsafe2 = unsafe5;
                                            i54 = i39;
                                            q33 = q37;
                                            obj2 = obj;
                                            i20 = i53;
                                            i16 = i59;
                                        } else {
                                            iC = iL;
                                            i52 = i37;
                                            unsafe8 = unsafe5;
                                            i54 = i39;
                                            i51 = i40;
                                            q311 = q37;
                                            i56 = i59;
                                            i55 = i18;
                                            i57 = i19;
                                            obj2 = obj;
                                        }
                                        break;
                                        break;
                                    case 19:
                                    case 36:
                                        i37 = i9;
                                        i53 = iL2;
                                        q37 = q312;
                                        i38 = i63;
                                        i39 = i71;
                                        unsafe5 = unsafe4;
                                        i40 = i8;
                                        if (i60 == 2) {
                                            androidx.appcompat.app.y.a(j4D);
                                            if (N3.r(bArr2, i38, q37) + q37.f14318a > bArr2.length) {
                                                throw I4.g();
                                            }
                                            throw null;
                                        }
                                        if (i60 == 5) {
                                            androidx.appcompat.app.y.a(j4D);
                                            N3.n(bArr2, i38);
                                            throw null;
                                        }
                                        iL = i38;
                                        if (iL != i38) {
                                        }
                                        break;
                                    case 20:
                                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                    case 37:
                                    case 38:
                                        i37 = i9;
                                        i53 = iL2;
                                        q37 = q312;
                                        i38 = i63;
                                        i39 = i71;
                                        unsafe5 = unsafe4;
                                        i40 = i8;
                                        if (i60 == 2) {
                                            Q4 q42 = (Q4) j4D;
                                            iS2 = N3.r(bArr2, i38, q37);
                                            int i72 = q37.f14318a + iS2;
                                            while (iS2 < i72) {
                                                iS2 = N3.s(bArr2, iS2, q37);
                                                q42.f(q37.f14319b);
                                            }
                                            if (iS2 != i72) {
                                                throw I4.g();
                                            }
                                        } else {
                                            if (i60 == 0) {
                                                Q4 q43 = (Q4) j4D;
                                                iS2 = N3.s(bArr2, i38, q37);
                                                while (true) {
                                                    q43.f(q37.f14319b);
                                                    if (iS2 < i40) {
                                                        int iR3 = N3.r(bArr2, iS2, q37);
                                                        if (i39 == q37.f14318a) {
                                                            iS2 = N3.s(bArr2, iR3, q37);
                                                        }
                                                    }
                                                }
                                            }
                                            iL = i38;
                                            if (iL != i38) {
                                            }
                                        }
                                        iL = iS2;
                                        if (iL != i38) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i53 = iL2;
                                        q37 = q312;
                                        i41 = i63;
                                        i39 = i71;
                                        unsafe6 = unsafe4;
                                        i40 = i8;
                                        i42 = i9;
                                        if (i60 == 2) {
                                            iL = N3.l(bArr2, i41, j4D, q37);
                                            i38 = i41;
                                            i37 = i42;
                                            unsafe5 = unsafe6;
                                            if (iL != i38) {
                                            }
                                        } else {
                                            if (i60 == 0) {
                                                i38 = i41;
                                                i37 = i42;
                                                unsafe5 = unsafe6;
                                                iS2 = N3.b(i39, bArr, i38, i8, j4D, q32);
                                                iL = iS2;
                                                if (iL != i38) {
                                                }
                                            }
                                            i38 = i41;
                                            i37 = i42;
                                            unsafe5 = unsafe6;
                                            iL = i38;
                                            if (iL != i38) {
                                            }
                                        }
                                        break;
                                    case ConnectionResult.API_DISABLED /* 23 */:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i53 = iL2;
                                        q37 = q312;
                                        i41 = i63;
                                        i39 = i71;
                                        unsafe6 = unsafe4;
                                        i40 = i8;
                                        i42 = i9;
                                        if (i60 == 2) {
                                            Q4 q44 = (Q4) j4D;
                                            iL = N3.r(bArr2, i41, q37);
                                            int i73 = q37.f14318a;
                                            int i74 = iL + i73;
                                            if (i74 > bArr2.length) {
                                                throw I4.g();
                                            }
                                            q44.i(q44.size() + (i73 / 8));
                                            while (iL < i74) {
                                                q44.f(N3.t(bArr2, iL));
                                                iL += 8;
                                            }
                                            if (iL != i74) {
                                                throw I4.g();
                                            }
                                            i38 = i41;
                                            i37 = i42;
                                            unsafe5 = unsafe6;
                                            if (iL != i38) {
                                            }
                                        } else {
                                            if (i60 == 1) {
                                                Q4 q45 = (Q4) j4D;
                                                q45.f(N3.t(bArr2, i41));
                                                i43 = i41 + 8;
                                                while (i43 < i40) {
                                                    int iR4 = N3.r(bArr2, i43, q37);
                                                    if (i39 == q37.f14318a) {
                                                        q45.f(N3.t(bArr2, iR4));
                                                        i43 = iR4 + 8;
                                                    } else {
                                                        i38 = i41;
                                                        i37 = i42;
                                                        iL = i43;
                                                        unsafe5 = unsafe6;
                                                        if (iL != i38) {
                                                        }
                                                    }
                                                }
                                                i38 = i41;
                                                i37 = i42;
                                                iL = i43;
                                                unsafe5 = unsafe6;
                                                if (iL != i38) {
                                                }
                                            }
                                            i38 = i41;
                                            i37 = i42;
                                            unsafe5 = unsafe6;
                                            iL = i38;
                                            if (iL != i38) {
                                            }
                                        }
                                        break;
                                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i53 = iL2;
                                        q37 = q312;
                                        i41 = i63;
                                        i39 = i71;
                                        unsafe6 = unsafe4;
                                        i40 = i8;
                                        i42 = i9;
                                        if (i60 == 2) {
                                            C4 c42 = (C4) j4D;
                                            iL = N3.r(bArr2, i41, q37);
                                            int i75 = q37.f14318a;
                                            int i76 = iL + i75;
                                            if (i76 > bArr2.length) {
                                                throw I4.g();
                                            }
                                            c42.k(c42.size() + (i75 / 4));
                                            while (iL < i76) {
                                                c42.i(N3.q(bArr2, iL));
                                                iL += 4;
                                            }
                                            if (iL != i76) {
                                                throw I4.g();
                                            }
                                            i38 = i41;
                                            i37 = i42;
                                            unsafe5 = unsafe6;
                                            if (iL != i38) {
                                            }
                                        } else {
                                            if (i60 == 5) {
                                                C4 c43 = (C4) j4D;
                                                c43.i(N3.q(bArr2, i41));
                                                i43 = i41 + 4;
                                                while (i43 < i40) {
                                                    int iR5 = N3.r(bArr2, i43, q37);
                                                    if (i39 == q37.f14318a) {
                                                        c43.i(N3.q(bArr2, iR5));
                                                        i43 = iR5 + 4;
                                                    } else {
                                                        i38 = i41;
                                                        i37 = i42;
                                                        iL = i43;
                                                        unsafe5 = unsafe6;
                                                        if (iL != i38) {
                                                        }
                                                    }
                                                }
                                                i38 = i41;
                                                i37 = i42;
                                                iL = i43;
                                                unsafe5 = unsafe6;
                                                if (iL != i38) {
                                                }
                                            }
                                            i38 = i41;
                                            i37 = i42;
                                            unsafe5 = unsafe6;
                                            iL = i38;
                                            if (iL != i38) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i53 = iL2;
                                        q37 = q312;
                                        i41 = i63;
                                        i39 = i71;
                                        unsafe6 = unsafe4;
                                        i40 = i8;
                                        i42 = i9;
                                        if (i60 == 2) {
                                            androidx.appcompat.app.y.a(j4D);
                                            iL = N3.r(bArr2, i41, q37);
                                            int i77 = q37.f14318a + iL;
                                            if (iL < i77) {
                                                N3.s(bArr2, iL, q37);
                                                throw null;
                                            }
                                            if (iL != i77) {
                                                throw I4.g();
                                            }
                                            i38 = i41;
                                            i37 = i42;
                                            unsafe5 = unsafe6;
                                            if (iL != i38) {
                                            }
                                        } else {
                                            if (i60 == 0) {
                                                androidx.appcompat.app.y.a(j4D);
                                                N3.s(bArr2, i41, q37);
                                                long j12 = q37.f14319b;
                                                throw null;
                                            }
                                            i38 = i41;
                                            i37 = i42;
                                            unsafe5 = unsafe6;
                                            iL = i38;
                                            if (iL != i38) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        i53 = iL2;
                                        q37 = q312;
                                        i41 = i63;
                                        i39 = i71;
                                        unsafe6 = unsafe4;
                                        i40 = i8;
                                        i42 = i9;
                                        if (i60 == 2) {
                                            if ((j11 & 536870912) == 0) {
                                                iL = N3.r(bArr2, i41, q37);
                                                int i78 = q37.f14318a;
                                                if (i78 < 0) {
                                                    throw I4.d();
                                                }
                                                if (i78 == 0) {
                                                    j4D.add("");
                                                } else {
                                                    j4D.add(new String(bArr2, iL, i78, B4.f14139a));
                                                    iL += i78;
                                                }
                                                while (iL < i40) {
                                                    int iR6 = N3.r(bArr2, iL, q37);
                                                    if (i39 == q37.f14318a) {
                                                        iL = N3.r(bArr2, iR6, q37);
                                                        int i79 = q37.f14318a;
                                                        if (i79 < 0) {
                                                            throw I4.d();
                                                        }
                                                        if (i79 == 0) {
                                                            j4D.add("");
                                                            while (iL < i40) {
                                                            }
                                                        } else {
                                                            j4D.add(new String(bArr2, iL, i79, B4.f14139a));
                                                            iL += i79;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iL = N3.r(bArr2, i41, q37);
                                                int i80 = q37.f14318a;
                                                if (i80 < 0) {
                                                    throw I4.d();
                                                }
                                                if (i80 == 0) {
                                                    j4D.add("");
                                                } else {
                                                    int i81 = iL + i80;
                                                    if (!Q5.e(bArr2, iL, i81)) {
                                                        throw I4.c();
                                                    }
                                                    j4D.add(new String(bArr2, iL, i80, B4.f14139a));
                                                    iL = i81;
                                                }
                                                while (iL < i40) {
                                                    int iR7 = N3.r(bArr2, iL, q37);
                                                    if (i39 == q37.f14318a) {
                                                        iL = N3.r(bArr2, iR7, q37);
                                                        int i82 = q37.f14318a;
                                                        if (i82 < 0) {
                                                            throw I4.d();
                                                        }
                                                        if (i82 == 0) {
                                                            j4D.add("");
                                                            while (iL < i40) {
                                                            }
                                                        } else {
                                                            int i83 = iL + i82;
                                                            if (!Q5.e(bArr2, iL, i83)) {
                                                                throw I4.c();
                                                            }
                                                            j4D.add(new String(bArr2, iL, i82, B4.f14139a));
                                                            iL = i83;
                                                        }
                                                    }
                                                }
                                            }
                                            i38 = i41;
                                            i37 = i42;
                                            unsafe5 = unsafe6;
                                            if (iL != i38) {
                                            }
                                        }
                                        i38 = i41;
                                        i37 = i42;
                                        unsafe5 = unsafe6;
                                        iL = i38;
                                        if (iL != i38) {
                                        }
                                        break;
                                    case 27:
                                        i37 = i9;
                                        i44 = i8;
                                        i45 = iL2;
                                        q38 = q312;
                                        i46 = i63;
                                        i47 = i71;
                                        unsafe7 = unsafe4;
                                        if (i60 == 2) {
                                            q37 = q38;
                                            int iO = N3.o(O(i45), i47, bArr, i46, i8, j4D, q32);
                                            i40 = i44;
                                            i53 = i45;
                                            i37 = i37;
                                            unsafe5 = unsafe7;
                                            i39 = i47;
                                            iL = iO;
                                            i38 = i46;
                                            if (iL != i38) {
                                            }
                                        }
                                        q37 = q38;
                                        i39 = i47;
                                        i40 = i44;
                                        unsafe5 = unsafe7;
                                        i38 = i46;
                                        i53 = i45;
                                        iL = i38;
                                        if (iL != i38) {
                                        }
                                        break;
                                    case 28:
                                        i37 = i9;
                                        i44 = i8;
                                        J4 j45 = j4D;
                                        i45 = iL2;
                                        q38 = q312;
                                        i46 = i63;
                                        i47 = i71;
                                        unsafe7 = unsafe4;
                                        if (i60 == 2) {
                                            int iR8 = N3.r(bArr2, i46, q38);
                                            int i84 = q38.f14318a;
                                            if (i84 < 0) {
                                                throw I4.d();
                                            }
                                            if (i84 > bArr2.length - iR8) {
                                                throw I4.g();
                                            }
                                            if (i84 == 0) {
                                                R3 r32 = R3.f14328n;
                                                j42 = j45;
                                                j42.add(r32);
                                                while (iR8 < i44) {
                                                    int iR9 = N3.r(bArr2, iR8, q38);
                                                    if (i47 == q38.f14318a) {
                                                        iR8 = N3.r(bArr2, iR9, q38);
                                                        int i85 = q38.f14318a;
                                                        if (i85 < 0) {
                                                            throw I4.d();
                                                        }
                                                        if (i85 > bArr2.length - iR8) {
                                                            throw I4.g();
                                                        }
                                                        if (i85 == 0) {
                                                            r32 = R3.f14328n;
                                                            j42.add(r32);
                                                            while (iR8 < i44) {
                                                            }
                                                        } else {
                                                            j42.add(R3.o(bArr2, iR8, i85));
                                                            iR8 += i85;
                                                        }
                                                    } else {
                                                        iL = iR8;
                                                        q37 = q38;
                                                        i39 = i47;
                                                        i40 = i44;
                                                        unsafe5 = unsafe7;
                                                        i38 = i46;
                                                        i53 = i45;
                                                        if (iL != i38) {
                                                        }
                                                    }
                                                }
                                                iL = iR8;
                                                q37 = q38;
                                                i39 = i47;
                                                i40 = i44;
                                                unsafe5 = unsafe7;
                                                i38 = i46;
                                                i53 = i45;
                                                if (iL != i38) {
                                                }
                                            } else {
                                                j42 = j45;
                                                j42.add(R3.o(bArr2, iR8, i84));
                                                iR8 += i84;
                                                while (iR8 < i44) {
                                                }
                                                iL = iR8;
                                                q37 = q38;
                                                i39 = i47;
                                                i40 = i44;
                                                unsafe5 = unsafe7;
                                                i38 = i46;
                                                i53 = i45;
                                                if (iL != i38) {
                                                }
                                            }
                                        }
                                        q37 = q38;
                                        i39 = i47;
                                        i40 = i44;
                                        unsafe5 = unsafe7;
                                        i38 = i46;
                                        i53 = i45;
                                        iL = i38;
                                        if (iL != i38) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i48 = iL2;
                                        q39 = q312;
                                        i49 = i63;
                                        i50 = i71;
                                        if (i60 == 2) {
                                            i37 = i9;
                                            q310 = q39;
                                            iB = N3.l(bArr2, i49, j4D, q39);
                                            i45 = i48;
                                            i44 = i8;
                                            i46 = i49;
                                            j43 = j4D;
                                            unsafe7 = unsafe4;
                                        } else {
                                            if (i60 == 0) {
                                                q310 = q39;
                                                i45 = i48;
                                                i44 = i8;
                                                i46 = i49;
                                                i37 = i9;
                                                j43 = j4D;
                                                unsafe7 = unsafe4;
                                                iB = N3.b(i50, bArr, i49, i8, j4D, q32);
                                            }
                                            i37 = i9;
                                            q37 = q39;
                                            i53 = i48;
                                            i38 = i49;
                                            i39 = i50;
                                            unsafe5 = unsafe4;
                                            i40 = i8;
                                            iL = i38;
                                            if (iL != i38) {
                                            }
                                        }
                                        AbstractC1245x5.h(obj, i59, j43, N(i45), null, this.f14654n);
                                        q37 = q310;
                                        i39 = i50;
                                        iL = iB;
                                        i40 = i44;
                                        unsafe5 = unsafe7;
                                        i38 = i46;
                                        i53 = i45;
                                        if (iL != i38) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i48 = iL2;
                                        q39 = q312;
                                        i49 = i63;
                                        i50 = i71;
                                        if (i60 == 2) {
                                            C4 c44 = (C4) j4D;
                                            iL = N3.r(bArr2, i49, q39);
                                            int i86 = q39.f14318a + iL;
                                            while (iL < i86) {
                                                iL = N3.r(bArr2, iL, q39);
                                                c44.i(AbstractC1067d4.a(q39.f14318a));
                                            }
                                            if (iL != i86) {
                                                throw I4.g();
                                            }
                                        } else {
                                            if (i60 == 0) {
                                                C4 c45 = (C4) j4D;
                                                iL = N3.r(bArr2, i49, q39);
                                                while (true) {
                                                    c45.i(AbstractC1067d4.a(q39.f14318a));
                                                    if (iL < i8) {
                                                        int iR10 = N3.r(bArr2, iL, q39);
                                                        if (i50 == q39.f14318a) {
                                                            iL = N3.r(bArr2, iR10, q39);
                                                        }
                                                    }
                                                }
                                            }
                                            i37 = i9;
                                            q37 = q39;
                                            i53 = i48;
                                            i38 = i49;
                                            i39 = i50;
                                            unsafe5 = unsafe4;
                                            i40 = i8;
                                            iL = i38;
                                            if (iL != i38) {
                                            }
                                        }
                                        i37 = i9;
                                        q37 = q39;
                                        i53 = i48;
                                        i38 = i49;
                                        i39 = i50;
                                        unsafe5 = unsafe4;
                                        i40 = i8;
                                        if (iL != i38) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i48 = iL2;
                                        q39 = q312;
                                        i49 = i63;
                                        if (i60 == 2) {
                                            Q4 q46 = (Q4) j4D;
                                            iL = N3.r(bArr2, i49, q39);
                                            int i87 = q39.f14318a + iL;
                                            while (iL < i87) {
                                                iL = N3.s(bArr2, iL, q39);
                                                q46.f(AbstractC1067d4.b(q39.f14319b));
                                            }
                                            if (iL != i87) {
                                                throw I4.g();
                                            }
                                            i37 = i9;
                                            q37 = q39;
                                            i53 = i48;
                                            i40 = i8;
                                            i38 = i49;
                                            i39 = i71;
                                            unsafe5 = unsafe4;
                                            if (iL != i38) {
                                            }
                                        } else if (i60 == 0) {
                                            Q4 q47 = (Q4) j4D;
                                            iL = N3.s(bArr2, i49, q39);
                                            q47.f(AbstractC1067d4.b(q39.f14319b));
                                            while (true) {
                                                if (iL < i8) {
                                                    int iR11 = N3.r(bArr2, iL, q39);
                                                    i50 = i71;
                                                    if (i50 == q39.f14318a) {
                                                        iL = N3.s(bArr2, iR11, q39);
                                                        q47.f(AbstractC1067d4.b(q39.f14319b));
                                                        i71 = i50;
                                                    }
                                                } else {
                                                    i50 = i71;
                                                }
                                            }
                                            i37 = i9;
                                            q37 = q39;
                                            i53 = i48;
                                            i38 = i49;
                                            i39 = i50;
                                            unsafe5 = unsafe4;
                                            i40 = i8;
                                            if (iL != i38) {
                                            }
                                        } else {
                                            i37 = i9;
                                            q37 = q39;
                                            i53 = i48;
                                            i40 = i8;
                                            i38 = i49;
                                            i39 = i71;
                                            unsafe5 = unsafe4;
                                            iL = i38;
                                            if (iL != i38) {
                                            }
                                        }
                                        break;
                                    case 49:
                                        if (i60 == 3) {
                                            i49 = i63;
                                            i48 = iL2;
                                            q39 = q312;
                                            iL = N3.f(O(iL2), i71, bArr, i49, i8, j4D, q32);
                                            i37 = i9;
                                            q37 = q39;
                                            i53 = i48;
                                            i40 = i8;
                                            i38 = i49;
                                            i39 = i71;
                                            unsafe5 = unsafe4;
                                            if (iL != i38) {
                                            }
                                        }
                                    default:
                                        i37 = i9;
                                        i53 = iL2;
                                        q37 = q312;
                                        i38 = i63;
                                        i39 = i71;
                                        unsafe5 = unsafe4;
                                        i40 = i8;
                                        iL = i38;
                                        if (iL != i38) {
                                        }
                                        break;
                                }
                            } else {
                                unsafe2 = unsafe9;
                                i53 = iL2;
                                i30 = i63;
                                i31 = i71;
                                i52 = i9;
                                if (i62 != 50) {
                                    obj2 = obj;
                                    Unsafe unsafe11 = f14640r;
                                    long j13 = iArr[i53 + 2] & 1048575;
                                    switch (i62) {
                                        case 51:
                                            q33 = q32;
                                            i32 = i53;
                                            i16 = i59;
                                            i33 = i31;
                                            j7 = j13;
                                            if (i60 == 1) {
                                                objValueOf = Double.valueOf(N3.a(bArr2, i30));
                                                unsafe11.putObject(obj2, j10, objValueOf);
                                                i34 = i30 + 8;
                                                unsafe11.putInt(obj2, j7, i16);
                                                iS = i34;
                                                if (iS == i30) {
                                                    i52 = i9;
                                                    i17 = iS;
                                                    i54 = i33;
                                                    i20 = i32;
                                                } else {
                                                    int i88 = i16;
                                                    bArr2 = bArr;
                                                    i51 = i8;
                                                    i52 = i9;
                                                    q311 = q32;
                                                    iC = iS;
                                                    i53 = i32;
                                                    i56 = i88;
                                                    i54 = i33;
                                                    i55 = i18;
                                                    unsafe8 = unsafe2;
                                                    i57 = i19;
                                                }
                                            }
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 52:
                                            q33 = q32;
                                            i32 = i53;
                                            i16 = i59;
                                            i33 = i31;
                                            j7 = j13;
                                            if (i60 == 5) {
                                                objValueOf2 = Float.valueOf(N3.n(bArr2, i30));
                                                unsafe11.putObject(obj2, j10, objValueOf2);
                                                i34 = i30 + 4;
                                                unsafe11.putInt(obj2, j7, i16);
                                                iS = i34;
                                                if (iS == i30) {
                                                }
                                            }
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            q33 = q32;
                                            i32 = i53;
                                            i16 = i59;
                                            i33 = i31;
                                            j8 = j13;
                                            if (i60 == 0) {
                                                iS = N3.s(bArr2, i30, q33);
                                                objValueOf3 = Long.valueOf(q33.f14319b);
                                                unsafe11.putObject(obj2, j10, objValueOf3);
                                                unsafe11.putInt(obj2, j8, i16);
                                                if (iS == i30) {
                                                }
                                            }
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            q33 = q32;
                                            i32 = i53;
                                            i16 = i59;
                                            i33 = i31;
                                            j8 = j13;
                                            if (i60 == 0) {
                                                iS = N3.r(bArr2, i30, q33);
                                                objValueOf3 = Integer.valueOf(q33.f14318a);
                                                unsafe11.putObject(obj2, j10, objValueOf3);
                                                unsafe11.putInt(obj2, j8, i16);
                                                if (iS == i30) {
                                                }
                                            }
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            q33 = q32;
                                            i32 = i53;
                                            i16 = i59;
                                            i33 = i31;
                                            j7 = j13;
                                            if (i60 == 1) {
                                                objValueOf = Long.valueOf(N3.t(bArr2, i30));
                                                unsafe11.putObject(obj2, j10, objValueOf);
                                                i34 = i30 + 8;
                                                unsafe11.putInt(obj2, j7, i16);
                                                iS = i34;
                                                if (iS == i30) {
                                                }
                                            }
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            q33 = q32;
                                            i32 = i53;
                                            i16 = i59;
                                            i33 = i31;
                                            j7 = j13;
                                            if (i60 == 5) {
                                                objValueOf2 = Integer.valueOf(N3.q(bArr2, i30));
                                                unsafe11.putObject(obj2, j10, objValueOf2);
                                                i34 = i30 + 4;
                                                unsafe11.putInt(obj2, j7, i16);
                                                iS = i34;
                                                if (iS == i30) {
                                                }
                                            }
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 58:
                                            q33 = q32;
                                            i32 = i53;
                                            i16 = i59;
                                            i33 = i31;
                                            j8 = j13;
                                            if (i60 == 0) {
                                                iS = N3.s(bArr2, i30, q33);
                                                objValueOf3 = Boolean.valueOf(q33.f14319b != 0);
                                                unsafe11.putObject(obj2, j10, objValueOf3);
                                                unsafe11.putInt(obj2, j8, i16);
                                                if (iS == i30) {
                                                }
                                            }
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 59:
                                            q33 = q32;
                                            i32 = i53;
                                            i16 = i59;
                                            i33 = i31;
                                            if (i60 == 2) {
                                                int iR12 = N3.r(bArr2, i30, q33);
                                                int i89 = q33.f14318a;
                                                unsafe2 = unsafe2;
                                                if (i89 == 0) {
                                                    unsafe11.putObject(obj2, j10, "");
                                                } else {
                                                    if ((i61 & 536870912) != 0 && !Q5.e(bArr2, iR12, iR12 + i89)) {
                                                        throw I4.c();
                                                    }
                                                    unsafe11.putObject(obj2, j10, new String(bArr2, iR12, i89, B4.f14139a));
                                                    iR12 += i89;
                                                }
                                                unsafe11.putInt(obj2, j13, i16);
                                                iS = iR12;
                                                if (iS == i30) {
                                                }
                                            } else {
                                                unsafe2 = unsafe2;
                                                iS = i30;
                                                if (iS == i30) {
                                                }
                                            }
                                            break;
                                        case 60:
                                            q36 = q32;
                                            i32 = i53;
                                            i35 = i31;
                                            i36 = i59;
                                            if (i60 == 2) {
                                                Object objQ = q(obj2, i36, i32);
                                                i33 = i35;
                                                i16 = i36;
                                                iS = N3.j(objQ, O(i32), bArr, i30, i8, q32);
                                                w(obj2, i16, i32, objQ);
                                                q33 = q36;
                                                if (iS == i30) {
                                                }
                                            }
                                            i33 = i35;
                                            i16 = i36;
                                            q33 = q36;
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 61:
                                            i32 = i53;
                                            i35 = i31;
                                            i36 = i59;
                                            j9 = j13;
                                            q36 = q32;
                                            if (i60 == 2) {
                                                iS = N3.k(bArr2, i30, q36);
                                                objValueOf4 = q36.f14320c;
                                                unsafe11.putObject(obj2, j10, objValueOf4);
                                                unsafe11.putInt(obj2, j9, i36);
                                                i33 = i35;
                                                i16 = i36;
                                                q33 = q36;
                                                if (iS == i30) {
                                                }
                                            }
                                            i33 = i35;
                                            i16 = i36;
                                            q33 = q36;
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 63:
                                            i32 = i53;
                                            i36 = i59;
                                            i33 = i31;
                                            j9 = j13;
                                            q36 = q32;
                                            if (i60 == 0) {
                                                iS = N3.r(bArr2, i30, q36);
                                                int i90 = q36.f14318a;
                                                D4 d4N2 = N(i32);
                                                if (d4N2 == null || d4N2.d(i90)) {
                                                    i35 = i33;
                                                    objValueOf4 = Integer.valueOf(i90);
                                                    unsafe11.putObject(obj2, j10, objValueOf4);
                                                    unsafe11.putInt(obj2, j9, i36);
                                                    i33 = i35;
                                                    i16 = i36;
                                                    q33 = q36;
                                                    if (iS == i30) {
                                                    }
                                                } else {
                                                    i35 = i33;
                                                    I(obj).e(i35, Long.valueOf(i90));
                                                    i33 = i35;
                                                    i16 = i36;
                                                    q33 = q36;
                                                    if (iS == i30) {
                                                    }
                                                }
                                            }
                                            i16 = i36;
                                            q33 = q36;
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 66:
                                            i32 = i53;
                                            i36 = i59;
                                            i33 = i31;
                                            q36 = q32;
                                            if (i60 == 0) {
                                                iS = N3.r(bArr2, i30, q36);
                                                unsafe11.putObject(obj2, j10, Integer.valueOf(AbstractC1067d4.a(q36.f14318a)));
                                                unsafe11.putInt(obj2, j13, i36);
                                                i16 = i36;
                                                q33 = q36;
                                                if (iS == i30) {
                                                }
                                            }
                                            i16 = i36;
                                            q33 = q36;
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                        case 67:
                                            i32 = i53;
                                            i36 = i59;
                                            if (i60 == 0) {
                                                q36 = q32;
                                                int iS5 = N3.s(bArr2, i30, q36);
                                                i33 = i31;
                                                unsafe11.putObject(obj2, j10, Long.valueOf(AbstractC1067d4.b(q36.f14319b)));
                                                unsafe11.putInt(obj2, j13, i36);
                                                iS = iS5;
                                                i16 = i36;
                                                q33 = q36;
                                                if (iS == i30) {
                                                }
                                            } else {
                                                i16 = i36;
                                                i33 = i31;
                                                q33 = q32;
                                                iS = i30;
                                                if (iS == i30) {
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i60 != 3) {
                                                break;
                                            } else {
                                                Object objQ2 = q(obj2, i59, i53);
                                                int i91 = N3.i(objQ2, O(i53), bArr, i30, i8, (i31 & (-8)) | 4, q32);
                                                w(obj2, i59, i53, objQ2);
                                                i32 = i53;
                                                i16 = i59;
                                                i33 = i31;
                                                iS = i91;
                                                q33 = q32;
                                                i30 = i30;
                                                if (iS == i30) {
                                                }
                                            }
                                        default:
                                            q33 = q32;
                                            i32 = i53;
                                            i16 = i59;
                                            i33 = i31;
                                            iS = i30;
                                            if (iS == i30) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i60 == 2) {
                                        Unsafe unsafe12 = f14640r;
                                        Object objQ3 = Q(i53);
                                        Object object = unsafe12.getObject(obj, j10);
                                        if (this.f14656p.f(object)) {
                                            Object objE = this.f14656p.e(objQ3);
                                            this.f14656p.h(objE, object);
                                            unsafe12.putObject(obj, j10, objE);
                                            object = objE;
                                        }
                                        this.f14656p.c(objQ3);
                                        this.f14656p.d(object);
                                        int iR13 = N3.r(bArr2, i30, q312);
                                        int i92 = q312.f14318a;
                                        if (i92 < 0 || i92 > i8 - iR13) {
                                            throw I4.g();
                                        }
                                        throw null;
                                    }
                                    q35 = q312;
                                    obj2 = obj;
                                }
                            }
                        } else if (i60 == 2) {
                            J4 j4D2 = (J4) unsafe9.getObject(obj2, j10);
                            if (!j4D2.zzc()) {
                                int size = j4D2.size();
                                j4D2 = j4D2.d(size == 0 ? 10 : size << 1);
                                unsafe9.putObject(obj2, j10, j4D2);
                            }
                            iC = N3.o(O(iL2), i71, bArr, i63, i8, j4D2, q32);
                            q311 = q312;
                            i53 = iL2;
                            i51 = i8;
                            unsafe8 = unsafe9;
                            i56 = i59;
                            i54 = i71;
                            i55 = i18;
                            i57 = i19;
                            i52 = i9;
                        } else {
                            i52 = i9;
                            unsafe2 = unsafe9;
                            i30 = i63;
                            i53 = iL2;
                            i31 = i71;
                            q35 = q312;
                        }
                        q33 = q35;
                        i17 = i30;
                        i54 = i31;
                        i20 = i53;
                        i16 = i59;
                    }
                }
                if (i54 == i52 && i52 != 0) {
                    i10 = i8;
                    iC = i17;
                    i12 = i52;
                    i13 = i18;
                    unsafe = unsafe2;
                    i14 = i19;
                    i11 = 1048575;
                } else if (!this.f14646f || q33.f14321d == C1148m4.f14739c) {
                    int i93 = i54;
                    iC = N3.c(i93, bArr, i17, i8, I(obj), q32);
                    bArr2 = bArr;
                    q311 = q32;
                    i51 = i8;
                    unsafe8 = unsafe2;
                    i52 = i52;
                    i56 = i16;
                    i53 = i20;
                    i54 = i93;
                    i55 = i18;
                    i57 = i19;
                } else {
                    iC = N3.d(i54, bArr, i17, i8, obj, this.f14645e, this.f14654n, q32);
                    bArr2 = bArr;
                    q311 = q33;
                    i56 = i16;
                    i53 = i20;
                    i54 = i54;
                    i55 = i18;
                    i57 = i19;
                    i51 = i8;
                    unsafe8 = unsafe2;
                }
            } else {
                i10 = i51;
                int i94 = i55;
                int i95 = i57;
                i11 = 1048575;
                unsafe = unsafe8;
                i12 = i52;
                i13 = i94;
                i14 = i95;
            }
        }
        if (i14 != i11) {
            unsafe.putInt(obj2, i14, i13);
        }
        K5 k52 = null;
        for (int i96 = this.f14650j; i96 < this.f14651k; i96++) {
            k52 = (K5) r(obj, this.f14649i[i96], k52, this.f14654n, obj);
        }
        if (k52 != null) {
            this.f14654n.h(obj2, k52);
        }
        if (i12 == 0) {
            if (iC != i10) {
                throw I4.e();
            }
        } else if (iC > i10 || i54 != i12) {
            throw I4.e();
        }
        return iC;
    }
}
