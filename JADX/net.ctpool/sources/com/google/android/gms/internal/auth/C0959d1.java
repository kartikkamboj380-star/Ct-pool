package com.google.android.gms.internal.auth;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0959d1 implements InterfaceC0983l1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f13884n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Unsafe f13885o = B1.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f13886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f13887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Z0 f13890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f13891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f13892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f13893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final P0 f13894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AbstractC0998q1 f13895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC1014w0 f13896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C0965f1 f13897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final U0 f13898m;

    private C0959d1(int[] iArr, Object[] objArr, int i7, int i8, Z0 z02, int i9, boolean z6, int[] iArr2, int i10, int i11, C0965f1 c0965f1, P0 p02, AbstractC0998q1 abstractC0998q1, AbstractC1014w0 abstractC1014w0, U0 u02) {
        this.f13886a = iArr;
        this.f13887b = objArr;
        this.f13888c = i7;
        this.f13889d = i8;
        this.f13891f = iArr2;
        this.f13892g = i10;
        this.f13893h = i11;
        this.f13897l = c0965f1;
        this.f13894i = p02;
        this.f13895j = abstractC0998q1;
        this.f13896k = abstractC1014w0;
        this.f13890e = z02;
        this.f13898m = u02;
    }

    private final Object A(int i7) {
        int i8 = i7 / 3;
        return this.f13887b[i8 + i8];
    }

    private final Object B(Object obj, int i7) {
        InterfaceC0983l1 interfaceC0983l1Z = z(i7);
        int iW = w(i7) & 1048575;
        if (!k(obj, i7)) {
            return interfaceC0983l1Z.zzd();
        }
        Object object = f13885o.getObject(obj, iW);
        if (n(object)) {
            return object;
        }
        Object objZzd = interfaceC0983l1Z.zzd();
        if (object != null) {
            interfaceC0983l1Z.f(objZzd, object);
        }
        return objZzd;
    }

    private final Object C(Object obj, int i7, int i8) {
        InterfaceC0983l1 interfaceC0983l1Z = z(i8);
        if (!o(obj, i7, i8)) {
            return interfaceC0983l1Z.zzd();
        }
        Object object = f13885o.getObject(obj, w(i8) & 1048575);
        if (n(object)) {
            return object;
        }
        Object objZzd = interfaceC0983l1Z.zzd();
        if (object != null) {
            interfaceC0983l1Z.f(objZzd, object);
        }
        return objZzd;
    }

    private static Field D(Class cls, String str) {
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

    private static void E(Object obj) {
        if (!n(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void F(Object obj, Object obj2, int i7) {
        if (k(obj2, i7)) {
            int iW = w(i7) & 1048575;
            Unsafe unsafe = f13885o;
            long j7 = iW;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f13886a[i7] + " is present but null: " + obj2.toString());
            }
            InterfaceC0983l1 interfaceC0983l1Z = z(i7);
            if (!k(obj, i7)) {
                if (n(object)) {
                    Object objZzd = interfaceC0983l1Z.zzd();
                    interfaceC0983l1Z.f(objZzd, object);
                    unsafe.putObject(obj, j7, objZzd);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                H(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!n(object2)) {
                Object objZzd2 = interfaceC0983l1Z.zzd();
                interfaceC0983l1Z.f(objZzd2, object2);
                unsafe.putObject(obj, j7, objZzd2);
                object2 = objZzd2;
            }
            interfaceC0983l1Z.f(object2, object);
        }
    }

    private final void G(Object obj, Object obj2, int i7) {
        int i8 = this.f13886a[i7];
        if (o(obj2, i8, i7)) {
            int iW = w(i7) & 1048575;
            Unsafe unsafe = f13885o;
            long j7 = iW;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f13886a[i7] + " is present but null: " + obj2.toString());
            }
            InterfaceC0983l1 interfaceC0983l1Z = z(i7);
            if (!o(obj, i8, i7)) {
                if (n(object)) {
                    Object objZzd = interfaceC0983l1Z.zzd();
                    interfaceC0983l1Z.f(objZzd, object);
                    unsafe.putObject(obj, j7, objZzd);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                a(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!n(object2)) {
                Object objZzd2 = interfaceC0983l1Z.zzd();
                interfaceC0983l1Z.f(objZzd2, object2);
                unsafe.putObject(obj, j7, objZzd2);
                object2 = objZzd2;
            }
            interfaceC0983l1Z.f(object2, object);
        }
    }

    private final void H(Object obj, int i7) {
        int iT = t(i7);
        long j7 = 1048575 & iT;
        if (j7 == 1048575) {
            return;
        }
        B1.n(obj, j7, (1 << (iT >>> 20)) | B1.c(obj, j7));
    }

    private final void a(Object obj, int i7, int i8) {
        B1.n(obj, t(i8) & 1048575, i7);
    }

    private final void b(Object obj, int i7, Object obj2) {
        f13885o.putObject(obj, w(i7) & 1048575, obj2);
        H(obj, i7);
    }

    private final void i(Object obj, int i7, int i8, Object obj2) {
        f13885o.putObject(obj, w(i8) & 1048575, obj2);
        a(obj, i7, i8);
    }

    private final boolean j(Object obj, Object obj2, int i7) {
        return k(obj, i7) == k(obj2, i7);
    }

    private final boolean k(Object obj, int i7) {
        int iT = t(i7);
        long j7 = iT & 1048575;
        if (j7 != 1048575) {
            return (B1.c(obj, j7) & (1 << (iT >>> 20))) != 0;
        }
        int iW = w(i7);
        long j8 = iW & 1048575;
        switch (v(iW)) {
            case 0:
                return Double.doubleToRawLongBits(B1.a(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(B1.b(obj, j8)) != 0;
            case 2:
                return B1.d(obj, j8) != 0;
            case 3:
                return B1.d(obj, j8) != 0;
            case 4:
                return B1.c(obj, j8) != 0;
            case 5:
                return B1.d(obj, j8) != 0;
            case 6:
                return B1.c(obj, j8) != 0;
            case 7:
                return B1.t(obj, j8);
            case 8:
                Object objF = B1.f(obj, j8);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof AbstractC0997q0) {
                    return !AbstractC0997q0.f14021n.equals(objF);
                }
                throw new IllegalArgumentException();
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return B1.f(obj, j8) != null;
            case 10:
                return !AbstractC0997q0.f14021n.equals(B1.f(obj, j8));
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return B1.c(obj, j8) != 0;
            case 12:
                return B1.c(obj, j8) != 0;
            case 13:
                return B1.c(obj, j8) != 0;
            case 14:
                return B1.d(obj, j8) != 0;
            case 15:
                return B1.c(obj, j8) != 0;
            case 16:
                return B1.d(obj, j8) != 0;
            case 17:
                return B1.f(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean l(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? k(obj, i7) : (i9 & i10) != 0;
    }

    private static boolean m(Object obj, int i7, InterfaceC0983l1 interfaceC0983l1) {
        return interfaceC0983l1.g(B1.f(obj, i7 & 1048575));
    }

    private static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C0) {
            return ((C0) obj).m();
        }
        return true;
    }

    private final boolean o(Object obj, int i7, int i8) {
        return B1.c(obj, (long) (t(i8) & 1048575)) == i7;
    }

    static C1003s1 q(Object obj) {
        C0 c02 = (C0) obj;
        C1003s1 c1003s1 = c02.zzc;
        if (c1003s1 != C1003s1.a()) {
            return c1003s1;
        }
        C1003s1 c1003s1D = C1003s1.d();
        c02.zzc = c1003s1D;
        return c1003s1D;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C0959d1 r(Class cls, W0 w02, C0965f1 c0965f1, P0 p02, AbstractC0998q1 abstractC0998q1, AbstractC1014w0 abstractC1014w0, U0 u02) {
        int i7;
        int iCharAt;
        int iCharAt2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
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
        int i25;
        int iObjectFieldOffset;
        String str;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset2;
        Field fieldD;
        char cCharAt9;
        int i29;
        int i30;
        Object obj;
        Field fieldD2;
        Object obj2;
        Field fieldD3;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        if (!(w02 instanceof C0980k1)) {
            androidx.appcompat.app.y.a(w02);
            throw null;
        }
        C0980k1 c0980k1 = (C0980k1) w02;
        String strB = c0980k1.b();
        int length = strB.length();
        char c7 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i7 = i35 + 1;
                if (strB.charAt(i35) < 55296) {
                    break;
                }
                i35 = i7;
            }
        } else {
            i7 = 1;
        }
        int i36 = i7 + 1;
        int iCharAt3 = strB.charAt(i7);
        if (iCharAt3 >= 55296) {
            int i37 = iCharAt3 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                cCharAt13 = strB.charAt(i36);
                if (cCharAt13 < 55296) {
                    break;
                }
                i37 |= (cCharAt13 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            iCharAt3 = i37 | (cCharAt13 << i38);
            i36 = i34;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i9 = 0;
            i12 = 0;
            i8 = 0;
            i10 = 0;
            iArr = f13884n;
            i11 = 0;
        } else {
            int i39 = i36 + 1;
            int iCharAt4 = strB.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i20 = i39 + 1;
                    cCharAt8 = strB.charAt(i39);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i20;
                }
                iCharAt4 = i40 | (cCharAt8 << i41);
                i39 = i20;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strB.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i19 = i42 + 1;
                    cCharAt7 = strB.charAt(i42);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i19;
                }
                iCharAt5 = i43 | (cCharAt7 << i44);
                i42 = i19;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strB.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i18 = i45 + 1;
                    cCharAt6 = strB.charAt(i45);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i18;
                }
                iCharAt6 = i46 | (cCharAt6 << i47);
                i45 = i18;
            }
            int i48 = i45 + 1;
            int iCharAt7 = strB.charAt(i45);
            if (iCharAt7 >= 55296) {
                int i49 = iCharAt7 & 8191;
                int i50 = 13;
                while (true) {
                    i17 = i48 + 1;
                    cCharAt5 = strB.charAt(i48);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i17;
                }
                iCharAt7 = i49 | (cCharAt5 << i50);
                i48 = i17;
            }
            int i51 = i48 + 1;
            iCharAt = strB.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i16 = i51 + 1;
                    cCharAt4 = strB.charAt(i51);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i16;
                }
                iCharAt = i52 | (cCharAt4 << i53);
                i51 = i16;
            }
            int i54 = i51 + 1;
            iCharAt2 = strB.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i15 = i54 + 1;
                    cCharAt3 = strB.charAt(i54);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i15;
                }
                iCharAt2 = i55 | (cCharAt3 << i56);
                i54 = i15;
            }
            int i57 = i54 + 1;
            int iCharAt8 = strB.charAt(i54);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i14 = i57 + 1;
                    cCharAt2 = strB.charAt(i57);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i14;
                }
                iCharAt8 = i58 | (cCharAt2 << i59);
                i57 = i14;
            }
            int i60 = i57 + 1;
            int iCharAt9 = strB.charAt(i57);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = 13;
                while (true) {
                    i13 = i60 + 1;
                    cCharAt = strB.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i61 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i60 = i13;
                }
                iCharAt9 = i61 | (cCharAt << i62);
                i60 = i13;
            }
            i8 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i9 = iCharAt6;
            i10 = iCharAt9;
            i11 = iCharAt4;
            i12 = iCharAt7;
            i36 = i60;
        }
        Unsafe unsafe = f13885o;
        Object[] objArrC = c0980k1.c();
        Class<?> cls2 = c0980k1.a().getClass();
        int i63 = i10 + iCharAt2;
        int i64 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = 0;
        int i66 = 0;
        int i67 = i10;
        int i68 = i63;
        while (i36 < length) {
            int i69 = i36 + 1;
            int iCharAt10 = strB.charAt(i36);
            if (iCharAt10 >= c7) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i33 = i71 + 1;
                    cCharAt12 = strB.charAt(i71);
                    if (cCharAt12 < c7) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i33;
                }
                iCharAt10 = i70 | (cCharAt12 << i72);
                i21 = i33;
            } else {
                i21 = i69;
            }
            int i73 = i21 + 1;
            int iCharAt11 = strB.charAt(i21);
            if (iCharAt11 >= c7) {
                int i74 = iCharAt11 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i32 = i75 + 1;
                    cCharAt11 = strB.charAt(i75);
                    if (cCharAt11 < c7) {
                        break;
                    }
                    i74 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i75 = i32;
                }
                iCharAt11 = i74 | (cCharAt11 << i76);
                i22 = i32;
            } else {
                i22 = i73;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i77 = iCharAt11 & 255;
            if (i77 >= 51) {
                int i78 = i22 + 1;
                int iCharAt12 = strB.charAt(i22);
                i23 = length;
                char c8 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = 13;
                    while (true) {
                        i31 = i78 + 1;
                        cCharAt10 = strB.charAt(i78);
                        if (cCharAt10 < c8) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i78 = i31;
                        c8 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i80);
                    i78 = i31;
                }
                int i81 = i77 - 51;
                int i82 = i78;
                if (i81 == 9 || i81 == 17) {
                    int i83 = i66 / 3;
                    i30 = i8 + 1;
                    objArr[i83 + i83 + 1] = objArrC[i8];
                } else {
                    if (i81 == 12 && (c0980k1.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i84 = i66 / 3;
                        i30 = i8 + 1;
                        objArr[i84 + i84 + 1] = objArrC[i8];
                    }
                    int i85 = iCharAt12 + iCharAt12;
                    obj = objArrC[i85];
                    if (obj instanceof Field) {
                        fieldD2 = D(cls2, (String) obj);
                        objArrC[i85] = fieldD2;
                    } else {
                        fieldD2 = (Field) obj;
                    }
                    int i86 = i9;
                    i24 = i12;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD2);
                    int i87 = i85 + 1;
                    obj2 = objArrC[i87];
                    if (obj2 instanceof Field) {
                        fieldD3 = D(cls2, (String) obj2);
                        objArrC[i87] = fieldD3;
                    } else {
                        fieldD3 = (Field) obj2;
                    }
                    str = strB;
                    i25 = i86;
                    i26 = i8;
                    i27 = i82;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD3);
                    i28 = 0;
                }
                i8 = i30;
                int i852 = iCharAt12 + iCharAt12;
                obj = objArrC[i852];
                if (obj instanceof Field) {
                }
                int i862 = i9;
                i24 = i12;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD2);
                int i872 = i852 + 1;
                obj2 = objArrC[i872];
                if (obj2 instanceof Field) {
                }
                str = strB;
                i25 = i862;
                i26 = i8;
                i27 = i82;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD3);
                i28 = 0;
            } else {
                i23 = length;
                int i88 = i9;
                i24 = i12;
                int i89 = i8 + 1;
                Field fieldD4 = D(cls2, (String) objArrC[i8]);
                if (i77 == 9 || i77 == 17) {
                    i25 = i88;
                    int i90 = i66 / 3;
                    objArr[i90 + i90 + 1] = fieldD4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        i25 = i88;
                        int i91 = i66 / 3;
                        i29 = i8 + 2;
                        objArr[i91 + i91 + 1] = objArrC[i89];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        i25 = i88;
                        if (c0980k1.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i92 = i66 / 3;
                            i29 = i8 + 2;
                            objArr[i92 + i92 + 1] = objArrC[i89];
                        }
                    } else if (i77 == 50) {
                        int i93 = i67 + 1;
                        iArr[i67] = i66;
                        int i94 = i66 / 3;
                        int i95 = i8 + 2;
                        int i96 = i94 + i94;
                        objArr[i96] = objArrC[i89];
                        if ((iCharAt11 & 2048) != 0) {
                            i89 = i8 + 3;
                            objArr[i96 + 1] = objArrC[i95];
                            i25 = i88;
                            i67 = i93;
                        } else {
                            i67 = i93;
                            i89 = i95;
                            i25 = i88;
                        }
                    } else {
                        i25 = i88;
                    }
                    i89 = i29;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i77 > 17) {
                    str = strB;
                    i26 = i89;
                    i27 = i22;
                    i28 = 0;
                } else {
                    int i97 = i22 + 1;
                    int iCharAt13 = strB.charAt(i22);
                    if (iCharAt13 >= 55296) {
                        int i98 = iCharAt13 & 8191;
                        int i99 = 13;
                        while (true) {
                            i27 = i97 + 1;
                            cCharAt9 = strB.charAt(i97);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i98 |= (cCharAt9 & 8191) << i99;
                            i99 += 13;
                            i97 = i27;
                        }
                        iCharAt13 = i98 | (cCharAt9 << i99);
                    } else {
                        i27 = i97;
                    }
                    int i100 = i11 + i11 + (iCharAt13 / 32);
                    Object obj3 = objArrC[i100];
                    str = strB;
                    if (obj3 instanceof Field) {
                        fieldD = (Field) obj3;
                    } else {
                        fieldD = D(cls2, (String) obj3);
                        objArrC[i100] = fieldD;
                    }
                    i26 = i89;
                    i28 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD);
                }
                if (i77 >= 18 && i77 <= 49) {
                    iArr[i68] = iObjectFieldOffset3;
                    i68++;
                }
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i101 = i66 + 1;
            iArr2[i66] = iCharAt10;
            int i102 = i66 + 2;
            iArr2[i101] = iObjectFieldOffset2 | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i77 << 20);
            i66 += 3;
            iArr2[i102] = (i28 << 20) | iObjectFieldOffset;
            i8 = i26;
            i36 = i27;
            length = i23;
            i9 = i25;
            strB = str;
            i12 = i24;
            c7 = 55296;
        }
        return new C0959d1(iArr2, objArr, i9, i12, c0980k1.a(), c0980k1.zzc(), false, iArr, i10, i63, c0965f1, p02, abstractC0998q1, abstractC1014w0, u02);
    }

    private static int s(Object obj, long j7) {
        return ((Integer) B1.f(obj, j7)).intValue();
    }

    private final int t(int i7) {
        return this.f13886a[i7 + 2];
    }

    private final int u(int i7, int i8) {
        int length = (this.f13886a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.f13886a[i10];
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

    private static int v(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int w(int i7) {
        return this.f13886a[i7 + 1];
    }

    private static long x(Object obj, long j7) {
        return ((Long) B1.f(obj, j7)).longValue();
    }

    private final D0 y(int i7) {
        int i8 = i7 / 3;
        androidx.appcompat.app.y.a(this.f13887b[i8 + i8 + 1]);
        return null;
    }

    private final InterfaceC0983l1 z(int i7) {
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        InterfaceC0983l1 interfaceC0983l1 = (InterfaceC0983l1) this.f13887b[i9];
        if (interfaceC0983l1 != null) {
            return interfaceC0983l1;
        }
        InterfaceC0983l1 interfaceC0983l1B = C0974i1.a().b((Class) this.f13887b[i9 + 1]);
        this.f13887b[i9] = interfaceC0983l1B;
        return interfaceC0983l1B;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a A[PHI: r3
      0x010a: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x0126, B:68:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(Object obj) {
        int i7;
        double dA;
        float fB;
        boolean zT;
        Object objF;
        int iC;
        long jD;
        Object objF2;
        int length = this.f13886a.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int iW = w(i9);
            int i10 = this.f13886a[i9];
            long j7 = 1048575 & iW;
            int iHashCode = 37;
            switch (v(iW)) {
                case 0:
                    i7 = i8 * 53;
                    dA = B1.a(obj, j7);
                    jD = Double.doubleToLongBits(dA);
                    byte[] bArr = G0.f13797d;
                    iC = (int) (jD ^ (jD >>> 32));
                    i8 = i7 + iC;
                    break;
                case 1:
                    i7 = i8 * 53;
                    fB = B1.b(obj, j7);
                    iC = Float.floatToIntBits(fB);
                    i8 = i7 + iC;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i7 = i8 * 53;
                    jD = B1.d(obj, j7);
                    byte[] bArr2 = G0.f13797d;
                    iC = (int) (jD ^ (jD >>> 32));
                    i8 = i7 + iC;
                    break;
                case 4:
                case 6:
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                case 12:
                case 13:
                case 15:
                    i7 = i8 * 53;
                    iC = B1.c(obj, j7);
                    i8 = i7 + iC;
                    break;
                case 7:
                    i7 = i8 * 53;
                    zT = B1.t(obj, j7);
                    iC = G0.a(zT);
                    i8 = i7 + iC;
                    break;
                case 8:
                    i7 = i8 * 53;
                    iC = ((String) B1.f(obj, j7)).hashCode();
                    i8 = i7 + iC;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    objF = B1.f(obj, j7);
                    if (objF != null) {
                        iHashCode = objF.hashCode();
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
                    objF2 = B1.f(obj, j7);
                    iC = objF2.hashCode();
                    i8 = i7 + iC;
                    break;
                case 17:
                    objF = B1.f(obj, j7);
                    if (objF != null) {
                    }
                    i8 = (i8 * 53) + iHashCode;
                    break;
                case 51:
                    if (o(obj, i10, i9)) {
                        i7 = i8 * 53;
                        dA = ((Double) B1.f(obj, j7)).doubleValue();
                        jD = Double.doubleToLongBits(dA);
                        byte[] bArr22 = G0.f13797d;
                        iC = (int) (jD ^ (jD >>> 32));
                        i8 = i7 + iC;
                    }
                    break;
                case 52:
                    if (o(obj, i10, i9)) {
                        i7 = i8 * 53;
                        fB = ((Float) B1.f(obj, j7)).floatValue();
                        iC = Float.floatToIntBits(fB);
                        i8 = i7 + iC;
                    }
                    break;
                case 53:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jD = x(obj, j7);
                    byte[] bArr222 = G0.f13797d;
                    iC = (int) (jD ^ (jD >>> 32));
                    i8 = i7 + iC;
                    break;
                case 54:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jD = x(obj, j7);
                    byte[] bArr2222 = G0.f13797d;
                    iC = (int) (jD ^ (jD >>> 32));
                    i8 = i7 + iC;
                    break;
                case 55:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iC = s(obj, j7);
                    i8 = i7 + iC;
                    break;
                case 56:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jD = x(obj, j7);
                    byte[] bArr22222 = G0.f13797d;
                    iC = (int) (jD ^ (jD >>> 32));
                    i8 = i7 + iC;
                    break;
                case 57:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iC = s(obj, j7);
                    i8 = i7 + iC;
                    break;
                case 58:
                    if (o(obj, i10, i9)) {
                        i7 = i8 * 53;
                        zT = ((Boolean) B1.f(obj, j7)).booleanValue();
                        iC = G0.a(zT);
                        i8 = i7 + iC;
                    }
                    break;
                case 59:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iC = ((String) B1.f(obj, j7)).hashCode();
                    i8 = i7 + iC;
                    break;
                case 60:
                    if (!o(obj, i10, i9)) {
                    }
                    objF2 = B1.f(obj, j7);
                    i7 = i8 * 53;
                    iC = objF2.hashCode();
                    i8 = i7 + iC;
                    break;
                case 61:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    objF2 = B1.f(obj, j7);
                    iC = objF2.hashCode();
                    i8 = i7 + iC;
                    break;
                case 62:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iC = s(obj, j7);
                    i8 = i7 + iC;
                    break;
                case 63:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iC = s(obj, j7);
                    i8 = i7 + iC;
                    break;
                case 64:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iC = s(obj, j7);
                    i8 = i7 + iC;
                    break;
                case 65:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jD = x(obj, j7);
                    byte[] bArr222222 = G0.f13797d;
                    iC = (int) (jD ^ (jD >>> 32));
                    i8 = i7 + iC;
                    break;
                case 66:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    iC = s(obj, j7);
                    i8 = i7 + iC;
                    break;
                case 67:
                    if (!o(obj, i10, i9)) {
                    }
                    i7 = i8 * 53;
                    jD = x(obj, j7);
                    byte[] bArr2222222 = G0.f13797d;
                    iC = (int) (jD ^ (jD >>> 32));
                    i8 = i7 + iC;
                    break;
                case 68:
                    if (!o(obj, i10, i9)) {
                    }
                    objF2 = B1.f(obj, j7);
                    i7 = i8 * 53;
                    iC = objF2.hashCode();
                    i8 = i7 + iC;
                    break;
            }
        }
        return (i8 * 53) + this.f13895j.a(obj).hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
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
    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = n(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.auth.C0
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.auth.C0 r0 = (com.google.android.gms.internal.auth.C0) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.l(r2)
            r0.zza = r1
            r0.j()
        L1a:
            int[] r0 = r7.f13886a
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L76
            int r2 = r7.w(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = v(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6c
            r5 = 60
            if (r2 == r5) goto L54
            r5 = 68
            if (r2 == r5) goto L54
            switch(r2) {
                case 17: goto L6c;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L73
        L3c:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.auth.C0959d1.f13885o
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L73
            r6 = r5
            com.google.android.gms.internal.auth.T0 r6 = (com.google.android.gms.internal.auth.T0) r6
            r6.d()
            r2.putObject(r8, r3, r5)
            goto L73
        L4e:
            com.google.android.gms.internal.auth.P0 r2 = r7.f13894i
            r2.a(r8, r3)
            goto L73
        L54:
            int[] r2 = r7.f13886a
            r2 = r2[r1]
            boolean r2 = r7.o(r8, r2, r1)
            if (r2 == 0) goto L73
        L5e:
            com.google.android.gms.internal.auth.l1 r2 = r7.z(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.C0959d1.f13885o
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
            goto L73
        L6c:
            boolean r2 = r7.k(r8, r1)
            if (r2 == 0) goto L73
            goto L5e
        L73:
            int r1 = r1 + 3
            goto L1d
        L76:
            com.google.android.gms.internal.auth.q1 r0 = r7.f13895j
            r0.c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0959d1.d(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final void e(Object obj, byte[] bArr, int i7, int i8, C0961e0 c0961e0) throws H0 {
        p(obj, bArr, i7, i8, 0, c0961e0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, Object obj2) {
        E(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f13886a.length; i7 += 3) {
            int iW = w(i7);
            int i8 = this.f13886a[i7];
            long j7 = 1048575 & iW;
            switch (v(iW)) {
                case 0:
                    if (k(obj2, i7)) {
                        B1.l(obj, j7, B1.a(obj2, j7));
                        H(obj, i7);
                    }
                    break;
                case 1:
                    if (k(obj2, i7)) {
                        B1.m(obj, j7, B1.b(obj2, j7));
                        H(obj, i7);
                    }
                    break;
                case 2:
                    if (!k(obj2, i7)) {
                    }
                    B1.o(obj, j7, B1.d(obj2, j7));
                    H(obj, i7);
                    break;
                case 3:
                    if (!k(obj2, i7)) {
                    }
                    B1.o(obj, j7, B1.d(obj2, j7));
                    H(obj, i7);
                    break;
                case 4:
                    if (!k(obj2, i7)) {
                    }
                    B1.n(obj, j7, B1.c(obj2, j7));
                    H(obj, i7);
                    break;
                case 5:
                    if (!k(obj2, i7)) {
                    }
                    B1.o(obj, j7, B1.d(obj2, j7));
                    H(obj, i7);
                    break;
                case 6:
                    if (!k(obj2, i7)) {
                    }
                    B1.n(obj, j7, B1.c(obj2, j7));
                    H(obj, i7);
                    break;
                case 7:
                    if (k(obj2, i7)) {
                        B1.k(obj, j7, B1.t(obj2, j7));
                        H(obj, i7);
                    }
                    break;
                case 8:
                    if (!k(obj2, i7)) {
                    }
                    B1.p(obj, j7, B1.f(obj2, j7));
                    H(obj, i7);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                case 17:
                    F(obj, obj2, i7);
                    break;
                case 10:
                    if (!k(obj2, i7)) {
                    }
                    B1.p(obj, j7, B1.f(obj2, j7));
                    H(obj, i7);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (!k(obj2, i7)) {
                    }
                    B1.n(obj, j7, B1.c(obj2, j7));
                    H(obj, i7);
                    break;
                case 12:
                    if (!k(obj2, i7)) {
                    }
                    B1.n(obj, j7, B1.c(obj2, j7));
                    H(obj, i7);
                    break;
                case 13:
                    if (!k(obj2, i7)) {
                    }
                    B1.n(obj, j7, B1.c(obj2, j7));
                    H(obj, i7);
                    break;
                case 14:
                    if (!k(obj2, i7)) {
                    }
                    B1.o(obj, j7, B1.d(obj2, j7));
                    H(obj, i7);
                    break;
                case 15:
                    if (!k(obj2, i7)) {
                    }
                    B1.n(obj, j7, B1.c(obj2, j7));
                    H(obj, i7);
                    break;
                case 16:
                    if (!k(obj2, i7)) {
                    }
                    B1.o(obj, j7, B1.d(obj2, j7));
                    H(obj, i7);
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
                    this.f13894i.b(obj, obj2, j7);
                    break;
                case 50:
                    int i9 = AbstractC0989n1.f14009d;
                    B1.p(obj, j7, U0.a(B1.f(obj, j7), B1.f(obj2, j7)));
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
                    if (o(obj2, i8, i7)) {
                        B1.p(obj, j7, B1.f(obj2, j7));
                        a(obj, i8, i7);
                    }
                    break;
                case 60:
                case 68:
                    G(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!o(obj2, i8, i7)) {
                        break;
                    }
                    break;
            }
        }
        AbstractC0989n1.c(this.f13895j, obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Object obj) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.f13892g) {
            int i12 = this.f13891f[i10];
            int i13 = this.f13886a[i12];
            int iW = w(i12);
            int i14 = this.f13886a[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i11) {
                if (i15 != 1048575) {
                    i9 = f13885o.getInt(obj, i15);
                }
                i8 = i9;
                i7 = i15;
            } else {
                i7 = i11;
                i8 = i9;
            }
            if ((268435456 & iW) != 0 && !l(obj, i12, i7, i8, i16)) {
                return false;
            }
            int iV = v(iW);
            if (iV == 9 || iV == 17) {
                if (l(obj, i12, i7, i8, i16) && !m(obj, iW, z(i12))) {
                    return false;
                }
            } else if (iV == 27) {
                List list = (List) B1.f(obj, iW & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC0983l1 interfaceC0983l1Z = z(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!interfaceC0983l1Z.g(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (iV == 60 || iV == 68) {
                if (o(obj, i13, i12) && !m(obj, iW, z(i12))) {
                    return false;
                }
            } else if (iV != 49) {
                if (iV == 50 && !((T0) B1.f(obj, iW & 1048575)).isEmpty()) {
                    androidx.appcompat.app.y.a(A(i12));
                    throw null;
                }
            }
            i10++;
            i11 = i7;
            i9 = i8;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final boolean h(Object obj, Object obj2) {
        int length = this.f13886a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int iW = w(i7);
            long j7 = iW & 1048575;
            switch (v(iW)) {
                case 0:
                    if (!j(obj, obj2, i7) || Double.doubleToLongBits(B1.a(obj, j7)) != Double.doubleToLongBits(B1.a(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!j(obj, obj2, i7) || Float.floatToIntBits(B1.b(obj, j7)) != Float.floatToIntBits(B1.b(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!j(obj, obj2, i7) || B1.d(obj, j7) != B1.d(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!j(obj, obj2, i7) || B1.d(obj, j7) != B1.d(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!j(obj, obj2, i7) || B1.c(obj, j7) != B1.c(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!j(obj, obj2, i7) || B1.d(obj, j7) != B1.d(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!j(obj, obj2, i7) || B1.c(obj, j7) != B1.c(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!j(obj, obj2, i7) || B1.t(obj, j7) != B1.t(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!j(obj, obj2, i7) || !AbstractC0989n1.e(B1.f(obj, j7), B1.f(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    if (!j(obj, obj2, i7) || !AbstractC0989n1.e(B1.f(obj, j7), B1.f(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!j(obj, obj2, i7) || !AbstractC0989n1.e(B1.f(obj, j7), B1.f(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (!j(obj, obj2, i7) || B1.c(obj, j7) != B1.c(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!j(obj, obj2, i7) || B1.c(obj, j7) != B1.c(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!j(obj, obj2, i7) || B1.c(obj, j7) != B1.c(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!j(obj, obj2, i7) || B1.d(obj, j7) != B1.d(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!j(obj, obj2, i7) || B1.c(obj, j7) != B1.c(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!j(obj, obj2, i7) || B1.d(obj, j7) != B1.d(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!j(obj, obj2, i7) || !AbstractC0989n1.e(B1.f(obj, j7), B1.f(obj2, j7))) {
                        return false;
                    }
                    break;
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
                    if (!AbstractC0989n1.e(B1.f(obj, j7), B1.f(obj2, j7))) {
                        return false;
                    }
                    break;
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
                    long jT = t(i7) & 1048575;
                    if (B1.c(obj, jT) != B1.c(obj2, jT) || !AbstractC0989n1.e(B1.f(obj, j7), B1.f(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        return this.f13895j.a(obj).equals(this.f13895j.a(obj2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:229:0x0648, code lost:
    
        if (r2 == 0) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x064a, code lost:
    
        r15.add(com.google.android.gms.internal.auth.AbstractC0997q0.f14021n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0650, code lost:
    
        r15.add(com.google.android.gms.internal.auth.AbstractC0997q0.q(r8, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0658, code lost:
    
        if (r1 >= r13) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x065a, code lost:
    
        r2 = com.google.android.gms.internal.auth.AbstractC0964f0.h(r8, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0660, code lost:
    
        if (r13 != r7.f13899a) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0662, code lost:
    
        r1 = com.google.android.gms.internal.auth.AbstractC0964f0.h(r8, r2, r7);
        r2 = r7.f13899a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0668, code lost:
    
        if (r2 < 0) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x066c, code lost:
    
        if (r2 > (r8.length - r1)) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x066e, code lost:
    
        if (r2 != 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0675, code lost:
    
        throw com.google.android.gms.internal.auth.H0.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x067a, code lost:
    
        throw com.google.android.gms.internal.auth.H0.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0658, code lost:
    
        r15.add(com.google.android.gms.internal.auth.AbstractC0997q0.q(r8, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0b64  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0b80  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x08f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0909 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0252  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:239:0x066e -> B:230:0x064a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:270:0x0709 -> B:262:0x06e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x0758 -> B:282:0x072f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int p(Object obj, byte[] bArr, int i7, int i8, int i9, C0961e0 c0961e0) throws H0 {
        int i10;
        Object obj2;
        Unsafe unsafe;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iU;
        int i16;
        int i17;
        int i18;
        int i19;
        C0961e0 c0961e02;
        int i20;
        int iJ;
        int iG;
        int i21;
        int i22;
        int i23;
        C0961e0 c0961e03;
        int i24;
        int i25;
        int i26;
        Unsafe unsafe2;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        byte b7;
        int i32;
        int i33;
        int i34;
        int iA;
        int i35;
        int i36;
        byte[] bArr2;
        Object obj3;
        int i37;
        byte[] bArr3;
        int i38;
        int i39;
        long j7;
        Object objValueOf;
        long j8;
        Object objValueOf2;
        long j9;
        Object objValueOf3;
        int i40;
        long j10;
        Object objValueOf4;
        int i41;
        byte[] bArr4;
        int i42;
        int i43;
        int iH;
        byte[] bArr5;
        int i44;
        char c7;
        int iF;
        char c8;
        int i45;
        byte[] bArr6;
        Unsafe unsafe3;
        int iH2;
        Object obj4 = obj;
        byte[] bArr7 = bArr;
        int i46 = i8;
        int i47 = i9;
        C0961e0 c0961e04 = c0961e0;
        int i48 = 3;
        int i49 = 1;
        E(obj);
        Unsafe unsafe4 = f13885o;
        int i50 = 0;
        int i51 = -1;
        int iL = i7;
        int i52 = -1;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 1048575;
        while (true) {
            if (iL < i46) {
                int i57 = iL + 1;
                int i58 = bArr7[iL];
                if (i58 < 0) {
                    i57 = AbstractC0964f0.i(i58, bArr7, i57, c0961e04);
                    i58 = c0961e04.f13899a;
                }
                int i59 = i58 >>> 3;
                if (i59 > i52) {
                    iU = (i59 < this.f13888c || i59 > this.f13889d) ? i51 : u(i59, i53 / i48);
                } else if (i59 < this.f13888c || i59 > this.f13889d) {
                    i15 = i51;
                    if (i15 == i51) {
                        int i60 = i58 & 7;
                        int[] iArr = this.f13886a;
                        int i61 = iArr[i15 + 1];
                        int iV = v(i61);
                        long j11 = i61 & 1048575;
                        int i62 = i58;
                        if (iV <= 17) {
                            int i63 = iArr[i15 + 2];
                            int i64 = 1 << (i63 >>> 20);
                            int i65 = 1048575;
                            int i66 = i63 & 1048575;
                            int i67 = i56;
                            if (i66 != i67) {
                                if (i67 != 1048575) {
                                    unsafe4.putInt(obj4, i67, i54);
                                    i65 = 1048575;
                                }
                                i21 = i66 == i65 ? 0 : unsafe4.getInt(obj4, i66);
                                i22 = i66;
                            } else {
                                i21 = i54;
                                i22 = i67;
                            }
                            switch (iV) {
                                case 0:
                                    i13 = i62 == true ? 1 : 0;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i49 = 1;
                                    i24 = 3;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    i23 = i57;
                                    if (i60 == 1) {
                                        B1.l(obj4, j11, Double.longBitsToDouble(AbstractC0964f0.n(bArr7, i23)));
                                        iL = i23 + 8;
                                        i46 = i8;
                                        i47 = i9;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        c0961e04 = c0961e03;
                                        i55 = i13 == true ? 1 : 0;
                                        i56 = i22;
                                        i48 = 3;
                                        i51 = -1;
                                        i52 = i25;
                                        i50 = 0;
                                        i54 = i21 | i64;
                                    } else {
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 1:
                                    i13 = i62 == true ? 1 : 0;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i24 = 3;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    i23 = i57;
                                    if (i60 == 5) {
                                        B1.m(obj4, j11, Float.intBitsToFloat(AbstractC0964f0.b(bArr7, i23)));
                                        iL = i23 + 4;
                                        i27 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i56 = i22;
                                        i48 = i24;
                                        i51 = i17;
                                        i52 = i25;
                                        i50 = 0;
                                        i54 = i27;
                                        i49 = 1;
                                    } else {
                                        i49 = 1;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 2:
                                case 3:
                                    i13 = i62 == true ? 1 : 0;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i24 = 3;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    i23 = i57;
                                    if (i60 == 0) {
                                        iL = AbstractC0964f0.k(bArr7, i23, c0961e03);
                                        unsafe2.putLong(obj, j11, c0961e03.f13900b);
                                        i27 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i56 = i22;
                                        i48 = i24;
                                        i51 = i17;
                                        i52 = i25;
                                        i50 = 0;
                                        i54 = i27;
                                        i49 = 1;
                                    } else {
                                        i49 = 1;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 4:
                                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                                    i13 = i62 == true ? 1 : 0;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i24 = 3;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    i23 = i57;
                                    if (i60 == 0) {
                                        iL = AbstractC0964f0.h(bArr7, i23, c0961e03);
                                        unsafe2.putInt(obj4, j11, c0961e03.f13899a);
                                        i27 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i56 = i22;
                                        i48 = i24;
                                        i51 = i17;
                                        i52 = i25;
                                        i50 = 0;
                                        i54 = i27;
                                        i49 = 1;
                                    } else {
                                        i49 = 1;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 5:
                                case 14:
                                    i13 = i62 == true ? 1 : 0;
                                    int i68 = i57;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i49 = 1;
                                    i24 = 3;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    if (i60 == 1) {
                                        unsafe2.putLong(obj, j11, AbstractC0964f0.n(bArr7, i68));
                                        iL = i68 + 8;
                                        i27 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i56 = i22;
                                        i48 = i24;
                                        i51 = i17;
                                        i52 = i25;
                                        i50 = 0;
                                        i54 = i27;
                                        i49 = 1;
                                    } else {
                                        i23 = i68;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    i13 = i62 == true ? 1 : 0;
                                    i28 = i57;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i24 = 3;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    i29 = 0;
                                    if (i60 == 5) {
                                        unsafe2.putInt(obj4, j11, AbstractC0964f0.b(bArr7, i28));
                                        iL = i28 + 4;
                                        i30 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i50 = i29;
                                        i56 = i22;
                                        i48 = i24;
                                        i51 = i17;
                                        i52 = i25;
                                        i54 = i30;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        i49 = 1;
                                    } else {
                                        i23 = i28;
                                        i49 = 1;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 7:
                                    i13 = i62 == true ? 1 : 0;
                                    i28 = i57;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i24 = 3;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    i29 = 0;
                                    if (i60 == 0) {
                                        iL = AbstractC0964f0.k(bArr7, i28, c0961e03);
                                        B1.k(obj4, j11, c0961e03.f13900b != 0);
                                        i30 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i50 = i29;
                                        i56 = i22;
                                        i48 = i24;
                                        i51 = i17;
                                        i52 = i25;
                                        i54 = i30;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        i49 = 1;
                                    } else {
                                        i23 = i28;
                                        i49 = 1;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 8:
                                    i13 = i62 == true ? 1 : 0;
                                    i28 = i57;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    int i69 = 3;
                                    if (i60 == 2) {
                                        if ((i61 & 536870912) != 0) {
                                            int iH3 = AbstractC0964f0.h(bArr7, i28, c0961e03);
                                            int i70 = c0961e03.f13899a;
                                            if (i70 < 0) {
                                                throw H0.c();
                                            }
                                            if (i70 == 0) {
                                                c0961e03.f13901c = "";
                                                iL = iH3;
                                                i24 = 3;
                                                i29 = 0;
                                            } else {
                                                int i71 = F1.f13793b;
                                                int length = bArr7.length;
                                                if ((((length - iH3) - i70) | iH3 | i70) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iH3), Integer.valueOf(i70)));
                                                }
                                                int i72 = iH3 + i70;
                                                char[] cArr = new char[i70];
                                                int i73 = 0;
                                                while (iH3 < i72) {
                                                    byte b8 = bArr7[iH3];
                                                    if (C1.d(b8)) {
                                                        iH3++;
                                                        cArr[i73] = (char) b8;
                                                        i73++;
                                                    } else {
                                                        while (true) {
                                                            int i74 = 1;
                                                            while (iH3 < i72) {
                                                                i31 = iH3 + 1;
                                                                b7 = bArr7[iH3];
                                                                if (C1.d(b7)) {
                                                                    cArr[i73] = (char) b7;
                                                                    i73++;
                                                                    iH3 = i31;
                                                                    while (iH3 < i72) {
                                                                        byte b9 = bArr7[iH3];
                                                                        if (C1.d(b9)) {
                                                                            iH3 += i74;
                                                                            cArr[i73] = (char) b9;
                                                                            i73++;
                                                                            i74 = 1;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (b7 < -32) {
                                                                        if (i31 >= i72) {
                                                                            throw H0.b();
                                                                        }
                                                                        iH3 += 2;
                                                                        i32 = i73 + 1;
                                                                        C1.c(b7, bArr7[i31], cArr, i73);
                                                                    } else if (b7 < -16) {
                                                                        if (i31 >= i72 - 1) {
                                                                            throw H0.b();
                                                                        }
                                                                        int i75 = iH3 + 2;
                                                                        iH3 += 3;
                                                                        i32 = i73 + 1;
                                                                        C1.b(b7, bArr7[i31], bArr7[i75], cArr, i73);
                                                                    } else {
                                                                        if (i31 >= i72 - 2) {
                                                                            throw H0.b();
                                                                        }
                                                                        byte b10 = bArr7[i31];
                                                                        int i76 = iH3 + 3;
                                                                        byte b11 = bArr7[iH3 + 2];
                                                                        iH3 += 4;
                                                                        C1.a(b7, b10, b11, bArr7[i76], cArr, i73);
                                                                        i73 += 2;
                                                                        i69 = 3;
                                                                    }
                                                                    i73 = i32;
                                                                }
                                                                i74 = 1;
                                                                i69 = 3;
                                                            }
                                                            i24 = i69;
                                                            i29 = 0;
                                                            c0961e03.f13901c = new String(cArr, 0, i73);
                                                            iL = i72;
                                                        }
                                                    }
                                                }
                                                while (true) {
                                                    int i742 = 1;
                                                    while (iH3 < i72) {
                                                    }
                                                    i24 = i69;
                                                    i29 = 0;
                                                    c0961e03.f13901c = new String(cArr, 0, i73);
                                                    iL = i72;
                                                    byte b102 = bArr7[i31];
                                                    int i762 = iH3 + 3;
                                                    byte b112 = bArr7[iH3 + 2];
                                                    iH3 += 4;
                                                    C1.a(b7, b102, b112, bArr7[i762], cArr, i73);
                                                    i73 += 2;
                                                    i69 = 3;
                                                }
                                            }
                                        } else {
                                            i24 = 3;
                                            i29 = 0;
                                            int iH4 = AbstractC0964f0.h(bArr7, i28, c0961e03);
                                            int i77 = c0961e03.f13899a;
                                            if (i77 < 0) {
                                                throw H0.c();
                                            }
                                            if (i77 == 0) {
                                                c0961e03.f13901c = "";
                                            } else {
                                                c0961e03.f13901c = new String(bArr7, iH4, i77, G0.f13795b);
                                                iH4 += i77;
                                            }
                                            iL = iH4;
                                        }
                                        unsafe2.putObject(obj4, j11, c0961e03.f13901c);
                                        i30 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i50 = i29;
                                        i56 = i22;
                                        i48 = i24;
                                        i51 = i17;
                                        i52 = i25;
                                        i54 = i30;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        i49 = 1;
                                    } else {
                                        i24 = 3;
                                        i23 = i28;
                                        i49 = 1;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case ConnectionResult.SERVICE_INVALID /* 9 */:
                                    i13 = i62 == true ? 1 : 0;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    i33 = 3;
                                    if (i60 == 2) {
                                        Object objB = B(obj4, i26);
                                        i46 = i8;
                                        int iM = AbstractC0964f0.m(objB, z(i26), bArr, i57, i46, c0961e0);
                                        b(obj4, i26, objB);
                                        i34 = i21 | i64;
                                        i47 = i9;
                                        iL = iM;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i48 = i33;
                                        i56 = i22;
                                        i51 = i17;
                                        i52 = i25;
                                        i49 = 1;
                                        i50 = 0;
                                        i54 = i34;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                    } else {
                                        i24 = i33;
                                        i49 = 1;
                                        i23 = i57;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 10:
                                    i13 = i62 == true ? 1 : 0;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    i33 = 3;
                                    if (i60 == 2) {
                                        iL = AbstractC0964f0.a(bArr7, i57, c0961e03);
                                        unsafe2.putObject(obj4, j11, c0961e03.f13901c);
                                        i34 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i48 = i33;
                                        i56 = i22;
                                        i51 = i17;
                                        i52 = i25;
                                        i49 = 1;
                                        i50 = 0;
                                        i54 = i34;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                    } else {
                                        i24 = i33;
                                        i49 = 1;
                                        i23 = i57;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 12:
                                    i13 = i62 == true ? 1 : 0;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    i17 = -1;
                                    i26 = i15;
                                    unsafe2 = unsafe4;
                                    i33 = 3;
                                    if (i60 == 0) {
                                        iL = AbstractC0964f0.h(bArr7, i57, c0961e03);
                                        iA = c0961e03.f13899a;
                                        y(i26);
                                        unsafe2.putInt(obj4, j11, iA);
                                        i30 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i48 = i33;
                                        i56 = i22;
                                        i51 = i17;
                                        i52 = i25;
                                        i50 = 0;
                                        i54 = i30;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        i49 = 1;
                                    } else {
                                        i24 = i33;
                                        i49 = 1;
                                        i23 = i57;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 15:
                                    i13 = i62 == true ? 1 : 0;
                                    c0961e03 = c0961e04;
                                    i25 = i59;
                                    Unsafe unsafe5 = unsafe4;
                                    i33 = 3;
                                    i17 = -1;
                                    i26 = i15;
                                    if (i60 == 0) {
                                        iL = AbstractC0964f0.h(bArr7, i57, c0961e03);
                                        iA = AbstractC1008u0.a(c0961e03.f13899a);
                                        unsafe2 = unsafe5;
                                        unsafe2.putInt(obj4, j11, iA);
                                        i30 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        c0961e04 = c0961e03;
                                        i55 = i13;
                                        i48 = i33;
                                        i56 = i22;
                                        i51 = i17;
                                        i52 = i25;
                                        i50 = 0;
                                        i54 = i30;
                                        unsafe4 = unsafe2;
                                        i53 = i26;
                                        i49 = 1;
                                    } else {
                                        unsafe2 = unsafe5;
                                        i24 = i33;
                                        i49 = 1;
                                        i23 = i57;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                case 16:
                                    i13 = i62 == true ? 1 : 0;
                                    Unsafe unsafe6 = unsafe4;
                                    i17 = -1;
                                    i26 = i15;
                                    if (i60 == 0) {
                                        iL = AbstractC0964f0.k(bArr7, i57, c0961e04);
                                        unsafe6.putLong(obj, j11, AbstractC1008u0.b(c0961e04.f13900b));
                                        i27 = i21 | i64;
                                        i46 = i8;
                                        i47 = i9;
                                        i53 = i26;
                                        c0961e04 = c0961e04;
                                        i55 = i13 == true ? 1 : 0;
                                        i48 = 3;
                                        i56 = i22;
                                        i51 = -1;
                                        i52 = i59;
                                        i50 = 0;
                                        unsafe4 = unsafe6;
                                        i54 = i27;
                                        i49 = 1;
                                    } else {
                                        c0961e03 = c0961e04;
                                        i25 = i59;
                                        unsafe2 = unsafe6;
                                        i23 = i57;
                                        i24 = 3;
                                        i49 = 1;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                                default:
                                    i48 = 3;
                                    if (i60 == 3) {
                                        Object objB2 = B(obj4, i15);
                                        int i78 = i15;
                                        iL = AbstractC0964f0.l(objB2, z(i15), bArr, i57, i8, (i59 << 3) | 4, c0961e0);
                                        b(obj4, i78, objB2);
                                        unsafe4 = unsafe4;
                                        i52 = i59;
                                        i55 = i62 == true ? 1 : 0;
                                        i53 = i78;
                                        i56 = i22;
                                        i51 = -1;
                                        i50 = 0;
                                        i46 = i8;
                                        i47 = i9;
                                        i54 = i21 | i64;
                                        i49 = 1;
                                    } else {
                                        Unsafe unsafe7 = unsafe4;
                                        i17 = -1;
                                        i23 = i57;
                                        c0961e03 = c0961e04;
                                        i24 = 3;
                                        i13 = i62 == true ? 1 : 0;
                                        i25 = i59;
                                        i49 = 1;
                                        i26 = i15;
                                        unsafe2 = unsafe7;
                                        i10 = i9;
                                        i20 = i49;
                                        unsafe = unsafe2;
                                        iJ = i23;
                                        i56 = i22;
                                        i16 = i24;
                                        i54 = i21;
                                        i19 = 0;
                                        obj2 = obj4;
                                        c0961e02 = c0961e03;
                                        i18 = i26;
                                        i59 = i25;
                                    }
                                    break;
                            }
                        } else {
                            i17 = -1;
                            C0961e0 c0961e05 = c0961e04;
                            int i79 = i15;
                            Unsafe unsafe8 = unsafe4;
                            int i80 = i56;
                            int i81 = i57;
                            i13 = i62 == true ? 1 : 0;
                            if (iV != 27) {
                                i35 = i80;
                                i19 = 0;
                                Unsafe unsafe9 = unsafe8;
                                i53 = i79;
                                i59 = i59;
                                if (iV <= 49) {
                                    long j12 = i61;
                                    Unsafe unsafe10 = f13885o;
                                    E0 e02 = (E0) unsafe10.getObject(obj4, j11);
                                    if (e02.zzc()) {
                                        i41 = i59;
                                    } else {
                                        int size = e02.size();
                                        i41 = i59;
                                        E0 e0G = e02.g(size != 0 ? size + size : 10);
                                        unsafe10.putObject(obj4, j11, e0G);
                                        e02 = e0G;
                                    }
                                    switch (iV) {
                                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                        case 35:
                                            bArr4 = bArr;
                                            i59 = i41;
                                            c0961e02 = c0961e0;
                                            unsafe = unsafe9;
                                            i13 = i13 == true ? 1 : 0;
                                            i42 = i81;
                                            i43 = i8;
                                            if (i60 == 2) {
                                                androidx.appcompat.app.y.a(e02);
                                                iH = AbstractC0964f0.h(bArr4, i42, c0961e02);
                                                int i82 = c0961e02.f13899a + iH;
                                                if (iH < i82) {
                                                    Double.longBitsToDouble(AbstractC0964f0.n(bArr4, iH));
                                                    throw null;
                                                }
                                                if (iH != i82) {
                                                    throw H0.f();
                                                }
                                                iJ = iH;
                                                i49 = 1;
                                                if (iJ == i42) {
                                                    i47 = i9;
                                                    bArr7 = bArr4;
                                                    iL = iJ;
                                                    c0961e04 = c0961e02;
                                                    i52 = i59;
                                                    i55 = i13 == true ? 1 : 0;
                                                    i46 = i43;
                                                    i56 = i35;
                                                    i50 = 0;
                                                    i51 = -1;
                                                    unsafe4 = unsafe;
                                                    i48 = 3;
                                                    obj4 = obj;
                                                } else {
                                                    i10 = i9;
                                                    i20 = i49;
                                                    i18 = i53;
                                                    i56 = i35;
                                                    i16 = 3;
                                                    obj2 = obj;
                                                }
                                                break;
                                            } else {
                                                i49 = 1;
                                                if (i60 == 1) {
                                                    androidx.appcompat.app.y.a(e02);
                                                    Double.longBitsToDouble(AbstractC0964f0.n(bArr4, i42));
                                                    throw null;
                                                }
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case 19:
                                        case 36:
                                            bArr4 = bArr;
                                            i59 = i41;
                                            c0961e02 = c0961e0;
                                            unsafe = unsafe9;
                                            i13 = i13 == true ? 1 : 0;
                                            i42 = i81;
                                            i43 = i8;
                                            if (i60 == 2) {
                                                androidx.appcompat.app.y.a(e02);
                                                iH = AbstractC0964f0.h(bArr4, i42, c0961e02);
                                                int i83 = c0961e02.f13899a + iH;
                                                if (iH < i83) {
                                                    Float.intBitsToFloat(AbstractC0964f0.b(bArr4, iH));
                                                    throw null;
                                                }
                                                if (iH != i83) {
                                                    throw H0.f();
                                                }
                                                iJ = iH;
                                                i49 = 1;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                if (i60 == 5) {
                                                    androidx.appcompat.app.y.a(e02);
                                                    Float.intBitsToFloat(AbstractC0964f0.b(bArr4, i42));
                                                    throw null;
                                                }
                                                i49 = 1;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case 20:
                                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                        case 37:
                                        case 38:
                                            bArr4 = bArr;
                                            i59 = i41;
                                            c0961e02 = c0961e0;
                                            unsafe = unsafe9;
                                            i13 = i13 == true ? 1 : 0;
                                            i42 = i81;
                                            i43 = i8;
                                            if (i60 == 2) {
                                                androidx.appcompat.app.y.a(e02);
                                                iH = AbstractC0964f0.h(bArr4, i42, c0961e02);
                                                int i84 = c0961e02.f13899a + iH;
                                                if (iH < i84) {
                                                    AbstractC0964f0.k(bArr4, iH, c0961e02);
                                                    throw null;
                                                }
                                                if (iH != i84) {
                                                    throw H0.f();
                                                }
                                                iJ = iH;
                                                i49 = 1;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    androidx.appcompat.app.y.a(e02);
                                                    AbstractC0964f0.k(bArr4, i42, c0961e02);
                                                    long j13 = c0961e02.f13900b;
                                                    throw null;
                                                }
                                                i49 = 1;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            bArr5 = bArr;
                                            i59 = i41;
                                            c0961e02 = c0961e0;
                                            i44 = i53;
                                            unsafe = unsafe9;
                                            c7 = 2;
                                            i13 = i13 == true ? 1 : 0;
                                            i42 = i81;
                                            i43 = i8;
                                            if (i60 == 2) {
                                                iF = AbstractC0964f0.f(bArr5, i42, e02, c0961e02);
                                                iJ = iF;
                                                i53 = i44;
                                                bArr4 = bArr5;
                                                i49 = 1;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    i53 = i44;
                                                    iJ = AbstractC0964f0.j(i13 == true ? 1 : 0, bArr, i42, i8, e02, c0961e0);
                                                    bArr4 = bArr5;
                                                    i49 = 1;
                                                    if (iJ == i42) {
                                                    }
                                                }
                                                i53 = i44;
                                                bArr4 = bArr5;
                                                i49 = 1;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case ConnectionResult.API_DISABLED /* 23 */:
                                        case 32:
                                        case 40:
                                        case 46:
                                            bArr5 = bArr;
                                            i59 = i41;
                                            c0961e02 = c0961e0;
                                            i44 = i53;
                                            unsafe = unsafe9;
                                            c7 = 2;
                                            i13 = i13 == true ? 1 : 0;
                                            i42 = i81;
                                            i43 = i8;
                                            if (i60 == 2) {
                                                androidx.appcompat.app.y.a(e02);
                                                iF = AbstractC0964f0.h(bArr5, i42, c0961e02);
                                                int i85 = c0961e02.f13899a + iF;
                                                if (iF < i85) {
                                                    AbstractC0964f0.n(bArr5, iF);
                                                    throw null;
                                                }
                                                if (iF != i85) {
                                                    throw H0.f();
                                                }
                                                iJ = iF;
                                                i53 = i44;
                                                bArr4 = bArr5;
                                                i49 = 1;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                i49 = 1;
                                                if (i60 == 1) {
                                                    androidx.appcompat.app.y.a(e02);
                                                    AbstractC0964f0.n(bArr5, i42);
                                                    throw null;
                                                }
                                                i53 = i44;
                                                bArr4 = bArr5;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                        case 31:
                                        case 41:
                                        case 45:
                                            bArr5 = bArr;
                                            i59 = i41;
                                            c0961e02 = c0961e0;
                                            i44 = i53;
                                            unsafe = unsafe9;
                                            c7 = 2;
                                            i13 = i13 == true ? 1 : 0;
                                            i42 = i81;
                                            i43 = i8;
                                            if (i60 == 2) {
                                                androidx.appcompat.app.y.a(e02);
                                                iF = AbstractC0964f0.h(bArr5, i42, c0961e02);
                                                int i86 = c0961e02.f13899a + iF;
                                                if (iF < i86) {
                                                    AbstractC0964f0.b(bArr5, iF);
                                                    throw null;
                                                }
                                                if (iF != i86) {
                                                    throw H0.f();
                                                }
                                                iJ = iF;
                                                i53 = i44;
                                                bArr4 = bArr5;
                                                i49 = 1;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                if (i60 == 5) {
                                                    androidx.appcompat.app.y.a(e02);
                                                    AbstractC0964f0.b(bArr5, i42);
                                                    throw null;
                                                }
                                                i53 = i44;
                                                bArr4 = bArr5;
                                                i49 = 1;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            bArr5 = bArr;
                                            i59 = i41;
                                            c0961e02 = c0961e0;
                                            i44 = i53;
                                            unsafe = unsafe9;
                                            c7 = 2;
                                            i13 = i13 == true ? 1 : 0;
                                            i42 = i81;
                                            i43 = i8;
                                            if (i60 == 2) {
                                                androidx.appcompat.app.y.a(e02);
                                                iF = AbstractC0964f0.h(bArr5, i42, c0961e02);
                                                int i87 = c0961e02.f13899a + iF;
                                                if (iF < i87) {
                                                    AbstractC0964f0.k(bArr5, iF, c0961e02);
                                                    throw null;
                                                }
                                                if (iF != i87) {
                                                    throw H0.f();
                                                }
                                                iJ = iF;
                                                i53 = i44;
                                                bArr4 = bArr5;
                                                i49 = 1;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    androidx.appcompat.app.y.a(e02);
                                                    AbstractC0964f0.k(bArr5, i42, c0961e02);
                                                    long j14 = c0961e02.f13900b;
                                                    throw null;
                                                }
                                                i53 = i44;
                                                bArr4 = bArr5;
                                                i49 = 1;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case 26:
                                            bArr5 = bArr;
                                            i59 = i41;
                                            c0961e02 = c0961e0;
                                            i44 = i53;
                                            unsafe = unsafe9;
                                            c7 = 2;
                                            i13 = i13 == true ? 1 : 0;
                                            i42 = i81;
                                            i43 = i8;
                                            if (i60 == 2) {
                                                if ((j12 & 536870912) == 0) {
                                                    iF = AbstractC0964f0.h(bArr5, i42, c0961e02);
                                                    int i88 = c0961e02.f13899a;
                                                    if (i88 < 0) {
                                                        throw H0.c();
                                                    }
                                                    if (i88 == 0) {
                                                        e02.add("");
                                                    } else {
                                                        e02.add(new String(bArr5, iF, i88, G0.f13795b));
                                                        iF += i88;
                                                    }
                                                    while (iF < i43) {
                                                        int iH5 = AbstractC0964f0.h(bArr5, iF, c0961e02);
                                                        if (i13 == c0961e02.f13899a) {
                                                            iF = AbstractC0964f0.h(bArr5, iH5, c0961e02);
                                                            int i89 = c0961e02.f13899a;
                                                            if (i89 < 0) {
                                                                throw H0.c();
                                                            }
                                                            if (i89 == 0) {
                                                                e02.add("");
                                                                while (iF < i43) {
                                                                }
                                                            } else {
                                                                e02.add(new String(bArr5, iF, i89, G0.f13795b));
                                                                iF += i89;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iF = AbstractC0964f0.h(bArr5, i42, c0961e02);
                                                    int i90 = c0961e02.f13899a;
                                                    if (i90 < 0) {
                                                        throw H0.c();
                                                    }
                                                    if (i90 == 0) {
                                                        e02.add("");
                                                    } else {
                                                        int i91 = iF + i90;
                                                        if (!F1.c(bArr5, iF, i91)) {
                                                            throw H0.b();
                                                        }
                                                        e02.add(new String(bArr5, iF, i90, G0.f13795b));
                                                        iF = i91;
                                                    }
                                                    while (iF < i43) {
                                                        int iH6 = AbstractC0964f0.h(bArr5, iF, c0961e02);
                                                        if (i13 == c0961e02.f13899a) {
                                                            iF = AbstractC0964f0.h(bArr5, iH6, c0961e02);
                                                            int i92 = c0961e02.f13899a;
                                                            if (i92 < 0) {
                                                                throw H0.c();
                                                            }
                                                            if (i92 == 0) {
                                                                e02.add("");
                                                                while (iF < i43) {
                                                                }
                                                            } else {
                                                                int i93 = iF + i92;
                                                                if (!F1.c(bArr5, iF, i93)) {
                                                                    throw H0.b();
                                                                }
                                                                e02.add(new String(bArr5, iF, i92, G0.f13795b));
                                                                iF = i93;
                                                            }
                                                        }
                                                    }
                                                }
                                                iJ = iF;
                                                i53 = i44;
                                                bArr4 = bArr5;
                                                i49 = 1;
                                                if (iJ == i42) {
                                                }
                                            }
                                            i53 = i44;
                                            bArr4 = bArr5;
                                            i49 = 1;
                                            iJ = i42;
                                            if (iJ == i42) {
                                            }
                                            break;
                                        case 27:
                                            c0961e02 = c0961e0;
                                            c8 = 2;
                                            i45 = i8;
                                            if (i60 == 2) {
                                                unsafe = unsafe9;
                                                int iE = AbstractC0964f0.e(z(i53), i13 == true ? 1 : 0, bArr, i81, i8, e02, c0961e0);
                                                i59 = i41;
                                                i13 = i13 == true ? 1 : 0;
                                                i43 = i45;
                                                i53 = i53;
                                                bArr4 = bArr;
                                                iJ = iE;
                                                i42 = i81;
                                                i49 = 1;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                unsafe = unsafe9;
                                                i59 = i41;
                                                bArr4 = bArr;
                                                i49 = 1;
                                                int i94 = i45;
                                                i13 = i13 == true ? 1 : 0;
                                                i42 = i81;
                                                i43 = i94;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            bArr6 = bArr;
                                            c0961e02 = c0961e0;
                                            unsafe3 = unsafe9;
                                            c8 = 2;
                                            i45 = i8;
                                            if (i60 == 2) {
                                                iH2 = AbstractC0964f0.h(bArr6, i81, c0961e02);
                                                int i95 = c0961e02.f13899a;
                                                if (i95 < 0) {
                                                    throw H0.c();
                                                }
                                                if (i95 > bArr6.length - iH2) {
                                                    throw H0.f();
                                                }
                                            } else {
                                                i59 = i41;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i49 = 1;
                                                int i942 = i45;
                                                i13 = i13 == true ? 1 : 0;
                                                i42 = i81;
                                                i43 = i942;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            bArr6 = bArr;
                                            c0961e02 = c0961e0;
                                            unsafe3 = unsafe9;
                                            i45 = i8;
                                            if (i60 == 2) {
                                                iH2 = AbstractC0964f0.f(bArr6, i81, e02, c0961e02);
                                            } else {
                                                if (i60 == 0) {
                                                    iH2 = AbstractC0964f0.j(i13 == true ? 1 : 0, bArr, i81, i8, e02, c0961e0);
                                                }
                                                i59 = i41;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i49 = 1;
                                                int i9422 = i45;
                                                i13 = i13 == true ? 1 : 0;
                                                i42 = i81;
                                                i43 = i9422;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            y(i53);
                                            int i96 = AbstractC0989n1.f14009d;
                                            i59 = i41;
                                            iJ = iH2;
                                            bArr4 = bArr6;
                                            unsafe = unsafe3;
                                            i49 = 1;
                                            int i97 = i45;
                                            i13 = i13 == true ? 1 : 0;
                                            i42 = i81;
                                            i43 = i97;
                                            if (iJ == i42) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            bArr6 = bArr;
                                            c0961e02 = c0961e0;
                                            unsafe3 = unsafe9;
                                            i45 = i8;
                                            if (i60 == 2) {
                                                androidx.appcompat.app.y.a(e02);
                                                iH2 = AbstractC0964f0.h(bArr6, i81, c0961e02);
                                                int i98 = c0961e02.f13899a + iH2;
                                                if (iH2 < i98) {
                                                    AbstractC0964f0.h(bArr6, iH2, c0961e02);
                                                    AbstractC1008u0.a(c0961e02.f13899a);
                                                    throw null;
                                                }
                                                if (iH2 != i98) {
                                                    throw H0.f();
                                                }
                                                i59 = i41;
                                                iJ = iH2;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i49 = 1;
                                                int i972 = i45;
                                                i13 = i13 == true ? 1 : 0;
                                                i42 = i81;
                                                i43 = i972;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    androidx.appcompat.app.y.a(e02);
                                                    AbstractC0964f0.h(bArr6, i81, c0961e02);
                                                    AbstractC1008u0.a(c0961e02.f13899a);
                                                    throw null;
                                                }
                                                i59 = i41;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i49 = 1;
                                                int i94222 = i45;
                                                i13 = i13 == true ? 1 : 0;
                                                i42 = i81;
                                                i43 = i94222;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            bArr6 = bArr;
                                            c0961e02 = c0961e0;
                                            unsafe3 = unsafe9;
                                            i45 = i8;
                                            if (i60 == 2) {
                                                androidx.appcompat.app.y.a(e02);
                                                iH2 = AbstractC0964f0.h(bArr6, i81, c0961e02);
                                                int i99 = c0961e02.f13899a + iH2;
                                                if (iH2 < i99) {
                                                    AbstractC0964f0.k(bArr6, iH2, c0961e02);
                                                    AbstractC1008u0.b(c0961e02.f13900b);
                                                    throw null;
                                                }
                                                if (iH2 != i99) {
                                                    throw H0.f();
                                                }
                                                i59 = i41;
                                                iJ = iH2;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i49 = 1;
                                                int i9722 = i45;
                                                i13 = i13 == true ? 1 : 0;
                                                i42 = i81;
                                                i43 = i9722;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                if (i60 == 0) {
                                                    androidx.appcompat.app.y.a(e02);
                                                    AbstractC0964f0.k(bArr6, i81, c0961e02);
                                                    AbstractC1008u0.b(c0961e02.f13900b);
                                                    throw null;
                                                }
                                                i59 = i41;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i49 = 1;
                                                int i942222 = i45;
                                                i13 = i13 == true ? 1 : 0;
                                                i42 = i81;
                                                i43 = i942222;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                        default:
                                            char c9 = 3;
                                            if (i60 == 3) {
                                                InterfaceC0983l1 interfaceC0983l1Z = z(i53);
                                                int i100 = ((i13 == true ? 1 : 0) & (-8)) | 4;
                                                c0961e02 = c0961e0;
                                                iH2 = AbstractC0964f0.c(interfaceC0983l1Z, bArr, i81, i8, i100, c0961e0);
                                                e02.add(c0961e02.f13901c);
                                                int i101 = i8;
                                                while (true) {
                                                    if (iH2 < i101) {
                                                        bArr6 = bArr;
                                                        int iH7 = AbstractC0964f0.h(bArr6, iH2, c0961e02);
                                                        if (i13 == c0961e02.f13899a) {
                                                            iH2 = AbstractC0964f0.c(interfaceC0983l1Z, bArr, iH7, i8, i100, c0961e0);
                                                            e02.add(c0961e02.f13901c);
                                                            i101 = i101;
                                                            unsafe9 = unsafe9;
                                                            c9 = 3;
                                                        }
                                                    } else {
                                                        bArr6 = bArr;
                                                    }
                                                }
                                                unsafe3 = unsafe9;
                                                i45 = i101;
                                                i59 = i41;
                                                iJ = iH2;
                                                bArr4 = bArr6;
                                                unsafe = unsafe3;
                                                i49 = 1;
                                                int i97222 = i45;
                                                i13 = i13 == true ? 1 : 0;
                                                i42 = i81;
                                                i43 = i97222;
                                                if (iJ == i42) {
                                                }
                                            } else {
                                                c0961e02 = c0961e0;
                                                bArr4 = bArr;
                                                i59 = i41;
                                                unsafe = unsafe9;
                                                i49 = 1;
                                                i13 = i13 == true ? 1 : 0;
                                                i42 = i81;
                                                i43 = i8;
                                                iJ = i42;
                                                if (iJ == i42) {
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    c0961e02 = c0961e05;
                                    unsafe = unsafe9;
                                    bArr2 = bArr;
                                    i13 = i13 == true ? 1 : 0;
                                    i37 = i81;
                                    if (iV != 50) {
                                        Unsafe unsafe11 = f13885o;
                                        long j15 = iArr[i53 + 2] & 1048575;
                                        switch (iV) {
                                            case 51:
                                                bArr3 = bArr2;
                                                i38 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i20 = 1;
                                                i18 = i53;
                                                obj2 = obj;
                                                j7 = j11;
                                                i16 = 3;
                                                if (i60 == 1) {
                                                    objValueOf = Double.valueOf(Double.longBitsToDouble(AbstractC0964f0.n(bArr3, i38)));
                                                    unsafe11.putObject(obj2, j7, objValueOf);
                                                    iG = i38 + 8;
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    if (iG != i38) {
                                                        i46 = i8;
                                                        i47 = i9;
                                                        bArr7 = bArr3;
                                                        c0961e04 = c0961e02;
                                                        obj4 = obj2;
                                                        i52 = i59;
                                                        i53 = i18;
                                                        i56 = i35;
                                                        i50 = 0;
                                                        i51 = -1;
                                                        i48 = i16;
                                                        unsafe4 = unsafe;
                                                        i55 = i39;
                                                        int i102 = i20;
                                                        iL = iG;
                                                        i49 = i102;
                                                    } else {
                                                        i10 = i9;
                                                        iJ = iG;
                                                        i56 = i35;
                                                        i13 = i39;
                                                    }
                                                }
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 52:
                                                bArr3 = bArr2;
                                                i38 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i18 = i53;
                                                obj2 = obj;
                                                j8 = j11;
                                                i16 = 3;
                                                if (i60 == 5) {
                                                    objValueOf2 = Float.valueOf(Float.intBitsToFloat(AbstractC0964f0.b(bArr3, i38)));
                                                    unsafe11.putObject(obj2, j8, objValueOf2);
                                                    iG = i38 + 4;
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    i20 = 1;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                i20 = 1;
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                bArr3 = bArr2;
                                                i38 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i20 = 1;
                                                i18 = i53;
                                                obj2 = obj;
                                                j9 = j11;
                                                i16 = 3;
                                                if (i60 == 0) {
                                                    iG = AbstractC0964f0.k(bArr3, i38, c0961e02);
                                                    objValueOf3 = Long.valueOf(c0961e02.f13900b);
                                                    unsafe11.putObject(obj2, j9, objValueOf3);
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    i20 = 1;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                bArr3 = bArr2;
                                                i38 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i20 = 1;
                                                i18 = i53;
                                                obj2 = obj;
                                                i16 = 3;
                                                if (i60 == 0) {
                                                    iG = AbstractC0964f0.h(bArr3, i38, c0961e02);
                                                    unsafe11.putObject(obj2, j11, Integer.valueOf(c0961e02.f13899a));
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    if (iG != i38) {
                                                    }
                                                }
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                bArr3 = bArr2;
                                                i38 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i20 = 1;
                                                i18 = i53;
                                                obj2 = obj;
                                                j7 = j11;
                                                i16 = 3;
                                                if (i60 == 1) {
                                                    objValueOf = Long.valueOf(AbstractC0964f0.n(bArr3, i38));
                                                    unsafe11.putObject(obj2, j7, objValueOf);
                                                    iG = i38 + 8;
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    if (iG != i38) {
                                                    }
                                                }
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                bArr3 = bArr2;
                                                i38 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i18 = i53;
                                                obj2 = obj;
                                                j8 = j11;
                                                i16 = 3;
                                                if (i60 == 5) {
                                                    objValueOf2 = Integer.valueOf(AbstractC0964f0.b(bArr3, i38));
                                                    unsafe11.putObject(obj2, j8, objValueOf2);
                                                    iG = i38 + 4;
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    i20 = 1;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                i20 = 1;
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 58:
                                                bArr3 = bArr2;
                                                i38 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i18 = i53;
                                                obj2 = obj;
                                                j9 = j11;
                                                i16 = 3;
                                                if (i60 == 0) {
                                                    iG = AbstractC0964f0.k(bArr3, i38, c0961e02);
                                                    objValueOf3 = Boolean.valueOf(c0961e02.f13900b != 0);
                                                    unsafe11.putObject(obj2, j9, objValueOf3);
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    i20 = 1;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                i20 = 1;
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 59:
                                                bArr3 = bArr2;
                                                i38 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i18 = i53;
                                                obj2 = obj;
                                                i16 = 3;
                                                if (i60 == 2) {
                                                    int iH8 = AbstractC0964f0.h(bArr3, i38, c0961e02);
                                                    int i103 = c0961e02.f13899a;
                                                    if (i103 == 0) {
                                                        unsafe11.putObject(obj2, j11, "");
                                                    } else {
                                                        if ((i61 & 536870912) != 0 && !F1.c(bArr3, iH8, iH8 + i103)) {
                                                            throw H0.b();
                                                        }
                                                        unsafe11.putObject(obj2, j11, new String(bArr3, iH8, i103, G0.f13795b));
                                                        iH8 += i103;
                                                    }
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    iG = iH8;
                                                    i20 = 1;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                i20 = 1;
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 60:
                                                i40 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i18 = i53;
                                                obj2 = obj;
                                                if (i60 == 2) {
                                                    Object objC = C(obj2, i59, i18);
                                                    i16 = 3;
                                                    iG = AbstractC0964f0.m(objC, z(i18), bArr, i40, i8, c0961e0);
                                                    i(obj2, i59, i18, objC);
                                                    bArr3 = bArr2;
                                                    i38 = i40;
                                                    i20 = 1;
                                                    if (iG != i38) {
                                                    }
                                                } else {
                                                    i16 = 3;
                                                    i20 = 1;
                                                    int i104 = i40;
                                                    bArr3 = bArr2;
                                                    i38 = i104;
                                                    iG = i38;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                i40 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i18 = i53;
                                                obj2 = obj;
                                                if (i60 == 2) {
                                                    int iA2 = AbstractC0964f0.a(bArr2, i40, c0961e02);
                                                    unsafe11.putObject(obj2, j11, c0961e02.f13901c);
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    iG = iA2;
                                                    i20 = 1;
                                                    i16 = 3;
                                                    int i105 = i40;
                                                    bArr3 = bArr2;
                                                    i38 = i105;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                i20 = 1;
                                                i16 = 3;
                                                int i1042 = i40;
                                                bArr3 = bArr2;
                                                i38 = i1042;
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 63:
                                                i40 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i18 = i53;
                                                obj2 = obj;
                                                j10 = j11;
                                                if (i60 == 0) {
                                                    iG = AbstractC0964f0.h(bArr2, i40, c0961e02);
                                                    int i106 = c0961e02.f13899a;
                                                    y(i18);
                                                    objValueOf4 = Integer.valueOf(i106);
                                                    unsafe11.putObject(obj2, j10, objValueOf4);
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    i20 = 1;
                                                    i16 = 3;
                                                    int i1052 = i40;
                                                    bArr3 = bArr2;
                                                    i38 = i1052;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                i20 = 1;
                                                i16 = 3;
                                                int i10422 = i40;
                                                bArr3 = bArr2;
                                                i38 = i10422;
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 66:
                                                i40 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i18 = i53;
                                                obj2 = obj;
                                                j10 = j11;
                                                if (i60 == 0) {
                                                    iG = AbstractC0964f0.h(bArr2, i40, c0961e02);
                                                    objValueOf4 = Integer.valueOf(AbstractC1008u0.a(c0961e02.f13899a));
                                                    unsafe11.putObject(obj2, j10, objValueOf4);
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    i20 = 1;
                                                    i16 = 3;
                                                    int i10522 = i40;
                                                    bArr3 = bArr2;
                                                    i38 = i10522;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                i20 = 1;
                                                i16 = 3;
                                                int i104222 = i40;
                                                bArr3 = bArr2;
                                                i38 = i104222;
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 67:
                                                i40 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i18 = i53;
                                                obj2 = obj;
                                                if (i60 == 0) {
                                                    iG = AbstractC0964f0.k(bArr2, i40, c0961e02);
                                                    objValueOf4 = Long.valueOf(AbstractC1008u0.b(c0961e02.f13900b));
                                                    j10 = j11;
                                                    unsafe11.putObject(obj2, j10, objValueOf4);
                                                    unsafe11.putInt(obj2, j15, i59);
                                                    i20 = 1;
                                                    i16 = 3;
                                                    int i105222 = i40;
                                                    bArr3 = bArr2;
                                                    i38 = i105222;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                i20 = 1;
                                                i16 = 3;
                                                int i1042222 = i40;
                                                bArr3 = bArr2;
                                                i38 = i1042222;
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                            case 68:
                                                if (i60 == 3) {
                                                    Object objC2 = C(obj, i59, i53);
                                                    int i107 = ((i13 == true ? 1 : 0) & (-8)) | 4;
                                                    InterfaceC0983l1 interfaceC0983l1Z2 = z(i53);
                                                    i40 = i37;
                                                    i39 = i13 == true ? 1 : 0;
                                                    int iL2 = AbstractC0964f0.l(objC2, interfaceC0983l1Z2, bArr, i37, i8, i107, c0961e0);
                                                    i(obj, i59, i53, objC2);
                                                    obj2 = obj;
                                                    i18 = i53;
                                                    iG = iL2;
                                                    i59 = i59;
                                                    i20 = 1;
                                                    i16 = 3;
                                                    int i1052222 = i40;
                                                    bArr3 = bArr2;
                                                    i38 = i1052222;
                                                    if (iG != i38) {
                                                    }
                                                } else {
                                                    i39 = i13 == true ? 1 : 0;
                                                    bArr3 = bArr2;
                                                    i38 = i37;
                                                    i20 = 1;
                                                    i16 = 3;
                                                    i18 = i53;
                                                    obj2 = obj;
                                                    iG = i38;
                                                    if (iG != i38) {
                                                    }
                                                }
                                                break;
                                            default:
                                                bArr3 = bArr2;
                                                i38 = i37;
                                                i39 = i13 == true ? 1 : 0;
                                                i20 = 1;
                                                i16 = 3;
                                                i18 = i53;
                                                obj2 = obj;
                                                iG = i38;
                                                if (iG != i38) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i60 == 2) {
                                            Unsafe unsafe12 = f13885o;
                                            Object objA = A(i53);
                                            Object object = unsafe12.getObject(obj, j11);
                                            if (!((T0) object).g()) {
                                                T0 t0B = T0.a().b();
                                                U0.a(t0B, object);
                                                unsafe12.putObject(obj, j11, t0B);
                                            }
                                            androidx.appcompat.app.y.a(objA);
                                            throw null;
                                        }
                                        obj3 = obj;
                                        i36 = 1;
                                        i10 = i9;
                                        i20 = i36;
                                        iJ = i37;
                                        i56 = i35;
                                        i16 = 3;
                                        i18 = i53;
                                        obj2 = obj3;
                                    }
                                }
                            } else if (i60 == 2) {
                                E0 e0G2 = (E0) unsafe8.getObject(obj4, j11);
                                if (!e0G2.zzc()) {
                                    int size2 = e0G2.size();
                                    e0G2 = e0G2.g(size2 != 0 ? size2 + size2 : 10);
                                    unsafe8.putObject(obj4, j11, e0G2);
                                }
                                iL = AbstractC0964f0.e(z(i79), i13 == true ? 1 : 0, bArr, i81, i8, e0G2, c0961e0);
                                i46 = i8;
                                i52 = i59;
                                unsafe4 = unsafe8;
                                i53 = i79;
                                i55 = i13 == true ? 1 : 0;
                                i48 = 3;
                                i56 = i80;
                                i50 = 0;
                                i51 = -1;
                                i49 = 1;
                                bArr7 = bArr;
                                i47 = i9;
                                c0961e04 = c0961e05;
                            } else {
                                i35 = i80;
                                i19 = 0;
                                unsafe = unsafe8;
                                i53 = i79;
                                i59 = i59;
                                i36 = 1;
                                bArr2 = bArr;
                                obj3 = obj4;
                                c0961e02 = c0961e05;
                                i37 = i81;
                                i10 = i9;
                                i20 = i36;
                                iJ = i37;
                                i56 = i35;
                                i16 = 3;
                                i18 = i53;
                                obj2 = obj3;
                            }
                        }
                    } else {
                        i16 = i48;
                        i10 = i47;
                        obj2 = obj4;
                        i17 = i51;
                        i18 = i50;
                        i19 = i18;
                        unsafe = unsafe4;
                        c0961e02 = c0961e04;
                        i13 = i58;
                        i20 = i49;
                        iJ = i57;
                    }
                    if (i13 == i10 || i10 == 0) {
                        iG = AbstractC0964f0.g((i13 == true ? 1 : 0) == true ? 1 : 0, bArr, iJ, i8, q(obj), c0961e0);
                        bArr7 = bArr;
                        i46 = i8;
                        c0961e04 = c0961e02;
                        i47 = i10;
                        obj4 = obj2;
                        i52 = i59;
                        i53 = i18;
                        i55 = i13 == true ? 1 : 0;
                        i50 = i19;
                        i51 = i17;
                        i48 = i16;
                        unsafe4 = unsafe;
                        int i1022 = i20;
                        iL = iG;
                        i49 = i1022;
                    } else {
                        i49 = i20;
                        i14 = i56;
                        i11 = 1048575;
                        iL = iJ;
                        i12 = i54;
                    }
                } else {
                    iU = u(i59, i50);
                }
                i15 = iU;
                if (i15 == i51) {
                }
                if (i13 == i10) {
                }
                iG = AbstractC0964f0.g((i13 == true ? 1 : 0) == true ? 1 : 0, bArr, iJ, i8, q(obj), c0961e0);
                bArr7 = bArr;
                i46 = i8;
                c0961e04 = c0961e02;
                i47 = i10;
                obj4 = obj2;
                i52 = i59;
                i53 = i18;
                i55 = i13 == true ? 1 : 0;
                i50 = i19;
                i51 = i17;
                i48 = i16;
                unsafe4 = unsafe;
                int i10222 = i20;
                iL = iG;
                i49 = i10222;
            } else {
                i10 = i47;
                obj2 = obj4;
                unsafe = unsafe4;
                i11 = 1048575;
                i12 = i54;
                i13 = i55;
                i14 = i56;
            }
        }
        if (i14 != i11) {
            unsafe.putInt(obj2, i14, i12);
        }
        for (int i108 = this.f13892g; i108 < this.f13893h; i108 += i49) {
            int i109 = this.f13891f[i108];
            int i110 = this.f13886a[i109];
            if (B1.f(obj2, w(i109) & i11) != null) {
                y(i109);
            }
        }
        if (i10 == 0) {
            if (iL != i8) {
                throw H0.d();
            }
        } else if (iL > i8 || i13 != i10) {
            throw H0.d();
        }
        return iL;
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC0983l1
    public final Object zzd() {
        return ((C0) this.f13890e).d();
    }
}
