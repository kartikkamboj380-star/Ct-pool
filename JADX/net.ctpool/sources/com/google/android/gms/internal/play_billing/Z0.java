package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class Z0 implements InterfaceC1293h1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f15121o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Unsafe f15122p = H1.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f15123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f15124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W0 f15127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f15128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f15129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f15130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f15131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final L0 f15132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AbstractC1348x1 f15133k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AbstractC1288g0 f15134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1269b1 f15135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final R0 f15136n;

    private Z0(int[] iArr, Object[] objArr, int i7, int i8, W0 w02, int i9, boolean z6, int[] iArr2, int i10, int i11, C1269b1 c1269b1, L0 l02, AbstractC1348x1 abstractC1348x1, AbstractC1288g0 abstractC1288g0, R0 r02) {
        this.f15123a = iArr;
        this.f15124b = objArr;
        this.f15125c = i7;
        this.f15126d = i8;
        boolean z7 = false;
        if (abstractC1288g0 != null && abstractC1288g0.f(w02)) {
            z7 = true;
        }
        this.f15128f = z7;
        this.f15129g = iArr2;
        this.f15130h = i10;
        this.f15131i = i11;
        this.f15135m = c1269b1;
        this.f15132j = l02;
        this.f15133k = abstractC1348x1;
        this.f15134l = abstractC1288g0;
        this.f15127e = w02;
        this.f15136n = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Z0 A(Class cls, T0 t02, C1269b1 c1269b1, L0 l02, AbstractC1348x1 abstractC1348x1, AbstractC1288g0 abstractC1288g0, R0 r02) {
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
        C1289g1 c1289g1;
        int iObjectFieldOffset;
        String str;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset2;
        Field fieldO;
        char cCharAt9;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field fieldO2;
        Object obj2;
        Field fieldO3;
        int i32;
        char cCharAt10;
        int i33;
        char cCharAt11;
        int i34;
        char cCharAt12;
        int i35;
        char cCharAt13;
        if (!(t02 instanceof C1289g1)) {
            androidx.appcompat.app.y.a(t02);
            throw null;
        }
        C1289g1 c1289g12 = (C1289g1) t02;
        String strB = c1289g12.b();
        int length = strB.length();
        char c7 = 55296;
        if (strB.charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i7 = i36 + 1;
                if (strB.charAt(i36) < 55296) {
                    break;
                }
                i36 = i7;
            }
        } else {
            i7 = 1;
        }
        int i37 = i7 + 1;
        int iCharAt3 = strB.charAt(i7);
        if (iCharAt3 >= 55296) {
            int i38 = iCharAt3 & 8191;
            int i39 = 13;
            while (true) {
                i35 = i37 + 1;
                cCharAt13 = strB.charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i35;
            }
            iCharAt3 = i38 | (cCharAt13 << i39);
            i37 = i35;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i9 = 0;
            i12 = 0;
            i8 = 0;
            i10 = 0;
            iArr = f15121o;
            i11 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt4 = strB.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i20 = i40 + 1;
                    cCharAt8 = strB.charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i20;
                }
                iCharAt4 = i41 | (cCharAt8 << i42);
                i40 = i20;
            }
            int i43 = i40 + 1;
            int iCharAt5 = strB.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i19 = i43 + 1;
                    cCharAt7 = strB.charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i19;
                }
                iCharAt5 = i44 | (cCharAt7 << i45);
                i43 = i19;
            }
            int i46 = i43 + 1;
            int iCharAt6 = strB.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i18 = i46 + 1;
                    cCharAt6 = strB.charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i18;
                }
                iCharAt6 = i47 | (cCharAt6 << i48);
                i46 = i18;
            }
            int i49 = i46 + 1;
            int iCharAt7 = strB.charAt(i46);
            if (iCharAt7 >= 55296) {
                int i50 = iCharAt7 & 8191;
                int i51 = 13;
                while (true) {
                    i17 = i49 + 1;
                    cCharAt5 = strB.charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i17;
                }
                iCharAt7 = i50 | (cCharAt5 << i51);
                i49 = i17;
            }
            int i52 = i49 + 1;
            iCharAt = strB.charAt(i49);
            if (iCharAt >= 55296) {
                int i53 = iCharAt & 8191;
                int i54 = 13;
                while (true) {
                    i16 = i52 + 1;
                    cCharAt4 = strB.charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i16;
                }
                iCharAt = i53 | (cCharAt4 << i54);
                i52 = i16;
            }
            int i55 = i52 + 1;
            iCharAt2 = strB.charAt(i52);
            if (iCharAt2 >= 55296) {
                int i56 = iCharAt2 & 8191;
                int i57 = 13;
                while (true) {
                    i15 = i55 + 1;
                    cCharAt3 = strB.charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i15;
                }
                iCharAt2 = i56 | (cCharAt3 << i57);
                i55 = i15;
            }
            int i58 = i55 + 1;
            int iCharAt8 = strB.charAt(i55);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i14 = i58 + 1;
                    cCharAt2 = strB.charAt(i58);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i14;
                }
                iCharAt8 = i59 | (cCharAt2 << i60);
                i58 = i14;
            }
            int i61 = i58 + 1;
            int iCharAt9 = strB.charAt(i58);
            if (iCharAt9 >= 55296) {
                int i62 = iCharAt9 & 8191;
                int i63 = 13;
                while (true) {
                    i13 = i61 + 1;
                    cCharAt = strB.charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i63;
                    i63 += 13;
                    i61 = i13;
                }
                iCharAt9 = i62 | (cCharAt << i63);
                i61 = i13;
            }
            i8 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i9 = iCharAt6;
            i10 = iCharAt9;
            i11 = iCharAt4;
            i12 = iCharAt7;
            i37 = i61;
        }
        Unsafe unsafe = f15122p;
        Object[] objArrC = c1289g12.c();
        Class<?> cls2 = c1289g12.a().getClass();
        int i64 = i10 + iCharAt2;
        int i65 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[i65];
        int i66 = 0;
        int i67 = 0;
        int i68 = i10;
        int i69 = i64;
        while (i37 < length) {
            int i70 = i37 + 1;
            int iCharAt10 = strB.charAt(i37);
            if (iCharAt10 >= c7) {
                int i71 = iCharAt10 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i34 = i72 + 1;
                    cCharAt12 = strB.charAt(i72);
                    if (cCharAt12 < c7) {
                        break;
                    }
                    i71 |= (cCharAt12 & 8191) << i73;
                    i73 += 13;
                    i72 = i34;
                }
                iCharAt10 = i71 | (cCharAt12 << i73);
                i21 = i34;
            } else {
                i21 = i70;
            }
            int i74 = i21 + 1;
            int iCharAt11 = strB.charAt(i21);
            if (iCharAt11 >= c7) {
                int i75 = iCharAt11 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i33 = i76 + 1;
                    cCharAt11 = strB.charAt(i76);
                    if (cCharAt11 < c7) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i76 = i33;
                }
                iCharAt11 = i75 | (cCharAt11 << i77);
                i22 = i33;
            } else {
                i22 = i74;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i78 = iCharAt11 & 255;
            int i79 = iCharAt11 & 2048;
            int i80 = length;
            if (i78 >= 51) {
                int i81 = i22 + 1;
                int iCharAt12 = strB.charAt(i22);
                char c8 = 55296;
                if (iCharAt12 >= 55296) {
                    int i82 = 13;
                    int i83 = iCharAt12 & 8191;
                    int i84 = i81;
                    while (true) {
                        i32 = i84 + 1;
                        cCharAt10 = strB.charAt(i84);
                        if (cCharAt10 < c8) {
                            break;
                        }
                        i83 |= (cCharAt10 & 8191) << i82;
                        i82 += 13;
                        i84 = i32;
                        c8 = 55296;
                    }
                    iCharAt12 = i83 | (cCharAt10 << i82);
                    i30 = i32;
                } else {
                    i30 = i81;
                }
                int i85 = i30;
                int i86 = i78 - 51;
                i24 = i12;
                if (i86 == 9 || i86 == 17) {
                    i31 = i8 + 1;
                    int i87 = i67 / 3;
                    objArr[i87 + i87 + 1] = objArrC[i8];
                } else {
                    if (i86 == 12) {
                        if (c1289g12.zzc() == 1 || i79 != 0) {
                            i31 = i8 + 1;
                            int i88 = i67 / 3;
                            objArr[i88 + i88 + 1] = objArrC[i8];
                        } else {
                            i79 = 0;
                        }
                    }
                    int i89 = iCharAt12 + iCharAt12;
                    obj = objArrC[i89];
                    if (obj instanceof Field) {
                        fieldO2 = O(cls2, (String) obj);
                        objArrC[i89] = fieldO2;
                    } else {
                        fieldO2 = (Field) obj;
                    }
                    i23 = i9;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO2);
                    int i90 = i89 + 1;
                    obj2 = objArrC[i90];
                    if (obj2 instanceof Field) {
                        fieldO3 = O(cls2, (String) obj2);
                        objArrC[i90] = fieldO3;
                    } else {
                        fieldO3 = (Field) obj2;
                    }
                    c1289g1 = c1289g12;
                    str = strB;
                    i27 = i8;
                    i25 = i85;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                    i26 = 0;
                }
                i8 = i31;
                int i892 = iCharAt12 + iCharAt12;
                obj = objArrC[i892];
                if (obj instanceof Field) {
                }
                i23 = i9;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO2);
                int i902 = i892 + 1;
                obj2 = objArrC[i902];
                if (obj2 instanceof Field) {
                }
                c1289g1 = c1289g12;
                str = strB;
                i27 = i8;
                i25 = i85;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO3);
                i26 = 0;
            } else {
                i23 = i9;
                i24 = i12;
                int i91 = i8 + 1;
                Field fieldO4 = O(cls2, (String) objArrC[i8]);
                if (i78 == 9 || i78 == 17) {
                    c1289g1 = c1289g12;
                    int i92 = i67 / 3;
                    objArr[i92 + i92 + 1] = fieldO4.getType();
                } else {
                    if (i78 == 27) {
                        c1289g1 = c1289g12;
                        i28 = 1;
                        i29 = i8 + 2;
                    } else if (i78 == 49) {
                        i29 = i8 + 2;
                        c1289g1 = c1289g12;
                        i28 = 1;
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        c1289g1 = c1289g12;
                        if (c1289g12.zzc() == 1 || i79 != 0) {
                            i29 = i8 + 2;
                            int i93 = i67 / 3;
                            objArr[i93 + i93 + 1] = objArrC[i91];
                            i91 = i29;
                        } else {
                            i79 = 0;
                        }
                    } else {
                        if (i78 == 50) {
                            int i94 = i8 + 2;
                            int i95 = i68 + 1;
                            iArr[i68] = i67;
                            int i96 = i67 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = objArrC[i91];
                            if (i79 != 0) {
                                i91 = i8 + 3;
                                objArr[i97 + 1] = objArrC[i94];
                                i68 = i95;
                            } else {
                                i91 = i94;
                                i68 = i95;
                                i79 = 0;
                            }
                        }
                        c1289g1 = c1289g12;
                    }
                    int i98 = i67 / 3;
                    objArr[i98 + i98 + i28] = objArrC[i91];
                    i91 = i29;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i78 > 17) {
                    str = strB;
                    i25 = i22;
                    i26 = 0;
                } else {
                    int i99 = i22 + 1;
                    int iCharAt13 = strB.charAt(i22);
                    if (iCharAt13 >= 55296) {
                        int i100 = iCharAt13 & 8191;
                        int i101 = 13;
                        while (true) {
                            i25 = i99 + 1;
                            cCharAt9 = strB.charAt(i99);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i100 |= (cCharAt9 & 8191) << i101;
                            i101 += 13;
                            i99 = i25;
                        }
                        iCharAt13 = i100 | (cCharAt9 << i101);
                    } else {
                        i25 = i99;
                    }
                    int i102 = i11 + i11 + (iCharAt13 / 32);
                    Object obj3 = objArrC[i102];
                    str = strB;
                    if (obj3 instanceof Field) {
                        fieldO = (Field) obj3;
                    } else {
                        fieldO = O(cls2, (String) obj3);
                        objArrC[i102] = fieldO;
                    }
                    i26 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO);
                }
                if (i78 >= 18 && i78 <= 49) {
                    iArr[i69] = iObjectFieldOffset3;
                    i69++;
                }
                i27 = i91;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i103 = i67 + 1;
            iArr2[i67] = iCharAt10;
            int i104 = i67 + 2;
            iArr2[i103] = iObjectFieldOffset2 | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i79 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20);
            i67 += 3;
            iArr2[i104] = (i26 << 20) | iObjectFieldOffset;
            i8 = i27;
            i37 = i25;
            length = i80;
            c1289g12 = c1289g1;
            strB = str;
            i12 = i24;
            i9 = i23;
            c7 = 55296;
        }
        C1289g1 c1289g13 = c1289g12;
        return new Z0(iArr2, objArr, i9, i12, c1289g13.a(), c1289g13.zzc(), false, iArr, i10, i64, c1269b1, l02, abstractC1348x1, abstractC1288g0, r02);
    }

    private static double B(Object obj, long j7) {
        return ((Double) H1.k(obj, j7)).doubleValue();
    }

    private static float C(Object obj, long j7) {
        return ((Float) H1.k(obj, j7)).floatValue();
    }

    private static int D(Object obj, long j7) {
        return ((Integer) H1.k(obj, j7)).intValue();
    }

    private final int E(int i7) {
        return this.f15123a[i7 + 2];
    }

    private final int F(int i7, int i8) {
        int length = (this.f15123a.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = this.f15123a[i10];
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

    private static int G(int i7) {
        return (i7 >>> 20) & 255;
    }

    private final int H(int i7) {
        return this.f15123a[i7 + 1];
    }

    private static long I(Object obj, long j7) {
        return ((Long) H1.k(obj, j7)).longValue();
    }

    private final InterfaceC1341v0 J(int i7) {
        int i8 = i7 / 3;
        return (InterfaceC1341v0) this.f15124b[i8 + i8 + 1];
    }

    private final InterfaceC1293h1 K(int i7) {
        Object[] objArr = this.f15124b;
        int i8 = i7 / 3;
        int i9 = i8 + i8;
        InterfaceC1293h1 interfaceC1293h1 = (InterfaceC1293h1) objArr[i9];
        if (interfaceC1293h1 != null) {
            return interfaceC1293h1;
        }
        InterfaceC1293h1 interfaceC1293h1B = C1281e1.a().b((Class) objArr[i9 + 1]);
        this.f15124b[i9] = interfaceC1293h1B;
        return interfaceC1293h1B;
    }

    private final Object L(int i7) {
        int i8 = i7 / 3;
        return this.f15124b[i8 + i8];
    }

    private final Object M(Object obj, int i7) {
        InterfaceC1293h1 interfaceC1293h1K = K(i7);
        int iH = H(i7) & 1048575;
        if (!r(obj, i7)) {
            return interfaceC1293h1K.b();
        }
        Object object = f15122p.getObject(obj, iH);
        if (u(object)) {
            return object;
        }
        Object objB = interfaceC1293h1K.b();
        if (object != null) {
            interfaceC1293h1K.h(objB, object);
        }
        return objB;
    }

    private final Object N(Object obj, int i7, int i8) {
        InterfaceC1293h1 interfaceC1293h1K = K(i8);
        if (!v(obj, i7, i8)) {
            return interfaceC1293h1K.b();
        }
        Object object = f15122p.getObject(obj, H(i8) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objB = interfaceC1293h1K.b();
        if (object != null) {
            interfaceC1293h1K.h(objB, object);
        }
        return objB;
    }

    private static Field O(Class cls, String str) {
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

    private static void j(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void k(Object obj, Object obj2, int i7) {
        if (r(obj2, i7)) {
            int iH = H(i7) & 1048575;
            Unsafe unsafe = f15122p;
            long j7 = iH;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f15123a[i7] + " is present but null: " + obj2.toString());
            }
            InterfaceC1293h1 interfaceC1293h1K = K(i7);
            if (!r(obj, i7)) {
                if (u(object)) {
                    Object objB = interfaceC1293h1K.b();
                    interfaceC1293h1K.h(objB, object);
                    unsafe.putObject(obj, j7, objB);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                m(obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!u(object2)) {
                Object objB2 = interfaceC1293h1K.b();
                interfaceC1293h1K.h(objB2, object2);
                unsafe.putObject(obj, j7, objB2);
                object2 = objB2;
            }
            interfaceC1293h1K.h(object2, object);
        }
    }

    private final void l(Object obj, Object obj2, int i7) {
        int i8 = this.f15123a[i7];
        if (v(obj2, i8, i7)) {
            int iH = H(i7) & 1048575;
            Unsafe unsafe = f15122p;
            long j7 = iH;
            Object object = unsafe.getObject(obj2, j7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f15123a[i7] + " is present but null: " + obj2.toString());
            }
            InterfaceC1293h1 interfaceC1293h1K = K(i7);
            if (!v(obj, i8, i7)) {
                if (u(object)) {
                    Object objB = interfaceC1293h1K.b();
                    interfaceC1293h1K.h(objB, object);
                    unsafe.putObject(obj, j7, objB);
                } else {
                    unsafe.putObject(obj, j7, object);
                }
                n(obj, i8, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!u(object2)) {
                Object objB2 = interfaceC1293h1K.b();
                interfaceC1293h1K.h(objB2, object2);
                unsafe.putObject(obj, j7, objB2);
                object2 = objB2;
            }
            interfaceC1293h1K.h(object2, object);
        }
    }

    private final void m(Object obj, int i7) {
        int iE = E(i7);
        long j7 = 1048575 & iE;
        if (j7 == 1048575) {
            return;
        }
        H1.v(obj, j7, (1 << (iE >>> 20)) | H1.h(obj, j7));
    }

    private final void n(Object obj, int i7, int i8) {
        H1.v(obj, E(i8) & 1048575, i7);
    }

    private final void o(Object obj, int i7, Object obj2) {
        f15122p.putObject(obj, H(i7) & 1048575, obj2);
        m(obj, i7);
    }

    private final void p(Object obj, int i7, int i8, Object obj2) {
        f15122p.putObject(obj, H(i8) & 1048575, obj2);
        n(obj, i7, i8);
    }

    private final boolean q(Object obj, Object obj2, int i7) {
        return r(obj, i7) == r(obj2, i7);
    }

    private final boolean r(Object obj, int i7) {
        int iE = E(i7);
        long j7 = iE & 1048575;
        if (j7 != 1048575) {
            return (H1.h(obj, j7) & (1 << (iE >>> 20))) != 0;
        }
        int iH = H(i7);
        long j8 = iH & 1048575;
        switch (G(iH)) {
            case 0:
                return Double.doubleToRawLongBits(H1.f(obj, j8)) != 0;
            case 1:
                return Float.floatToRawIntBits(H1.g(obj, j8)) != 0;
            case 2:
                return H1.i(obj, j8) != 0;
            case 3:
                return H1.i(obj, j8) != 0;
            case 4:
                return H1.h(obj, j8) != 0;
            case 5:
                return H1.i(obj, j8) != 0;
            case 6:
                return H1.h(obj, j8) != 0;
            case 7:
                return H1.B(obj, j8);
            case 8:
                Object objK = H1.k(obj, j8);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof S) {
                    return !S.f15105n.equals(objK);
                }
                throw new IllegalArgumentException();
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return H1.k(obj, j8) != null;
            case 10:
                return !S.f15105n.equals(H1.k(obj, j8));
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return H1.h(obj, j8) != 0;
            case 12:
                return H1.h(obj, j8) != 0;
            case 13:
                return H1.h(obj, j8) != 0;
            case 14:
                return H1.i(obj, j8) != 0;
            case 15:
                return H1.h(obj, j8) != 0;
            case 16:
                return H1.i(obj, j8) != 0;
            case 17:
                return H1.k(obj, j8) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean s(Object obj, int i7, int i8, int i9, int i10) {
        return i8 == 1048575 ? r(obj, i7) : (i9 & i10) != 0;
    }

    private static boolean t(Object obj, int i7, InterfaceC1293h1 interfaceC1293h1) {
        return interfaceC1293h1.g(H1.k(obj, i7 & 1048575));
    }

    private static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1329r0) {
            return ((AbstractC1329r0) obj).w();
        }
        return true;
    }

    private final boolean v(Object obj, int i7, int i8) {
        return H1.h(obj, (long) (E(i8) & 1048575)) == i7;
    }

    private static boolean w(Object obj, long j7) {
        return ((Boolean) H1.k(obj, j7)).booleanValue();
    }

    private static final void x(int i7, Object obj, P1 p12) {
        if (obj instanceof String) {
            p12.d(i7, (String) obj);
        } else {
            p12.m(i7, (S) obj);
        }
    }

    static C1351y1 z(Object obj) {
        AbstractC1329r0 abstractC1329r0 = (AbstractC1329r0) obj;
        C1351y1 c1351y1 = abstractC1329r0.zzc;
        if (c1351y1 != C1351y1.c()) {
            return c1351y1;
        }
        C1351y1 c1351y1F = C1351y1.f();
        abstractC1329r0.zzc = c1351y1F;
        return c1351y1F;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, P1 p12) {
        Map.Entry entry;
        Iterator it;
        int i7;
        int i8;
        Map.Entry entry2;
        int i9;
        int i10;
        Iterator it2;
        int[] iArr;
        Map.Entry entry3;
        int i11;
        boolean z6;
        boolean z7;
        boolean z8;
        if (this.f15128f) {
            C1304k0 c1304k0B = this.f15134l.b(obj);
            if (c1304k0B.f15210a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itD = c1304k0B.d();
                entry = (Map.Entry) itD.next();
                it = itD;
            }
        }
        int[] iArr2 = this.f15123a;
        Unsafe unsafe = f15122p;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i15 < iArr2.length) {
            int iH = H(i15);
            int[] iArr3 = this.f15123a;
            int iG = G(iH);
            int i16 = iArr3[i15];
            if (iG <= 17) {
                int i17 = iArr3[i15 + 2];
                int i18 = i17 & i12;
                i7 = iG;
                if (i18 != i13) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i8 = i13;
                entry2 = entry;
                i9 = i14;
                i10 = 1 << (i17 >>> 20);
            } else {
                i7 = iG;
                i8 = i13;
                entry2 = entry;
                i9 = i14;
                i10 = 0;
            }
            while (entry2 != null && this.f15134l.a(entry2) <= i16) {
                this.f15134l.e(p12, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j7 = iH & 1048575;
            switch (i7) {
                case 0:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.v(i16, H1.f(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 1:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.y(i16, H1.g(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 2:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.n(i16, unsafe.getLong(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 3:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.I(i16, unsafe.getLong(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 4:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.t(i16, unsafe.getInt(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 5:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.G(i16, unsafe.getLong(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 6:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.k(i16, unsafe.getInt(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 7:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.l(i16, H1.B(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 8:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        x(i16, unsafe.getObject(obj, j7), p12);
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.B(i16, unsafe.getObject(obj, j7), K(i11));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 10:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.m(i16, (S) unsafe.getObject(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.i(i16, unsafe.getInt(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 12:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.s(i16, unsafe.getInt(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 13:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.C(i16, unsafe.getInt(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 14:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.r(i16, unsafe.getLong(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 15:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.F(i16, unsafe.getInt(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 16:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i11, i8, i9, i10)) {
                        p12.w(i16, unsafe.getLong(obj, j7));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 17:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    if (s(obj, i15, i8, i9, i10)) {
                        p12.h(i16, unsafe.getObject(obj, j7), K(i11));
                    }
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    z6 = false;
                    AbstractC1301j1.A(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 19:
                    z6 = false;
                    AbstractC1301j1.E(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 20:
                    z6 = false;
                    AbstractC1301j1.G(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    z6 = false;
                    AbstractC1301j1.f(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 22:
                    z6 = false;
                    AbstractC1301j1.F(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    z6 = false;
                    AbstractC1301j1.D(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    z6 = false;
                    AbstractC1301j1.C(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 25:
                    z6 = false;
                    AbstractC1301j1.z(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 26:
                    int i19 = this.f15123a[i15];
                    List list = (List) unsafe.getObject(obj, j7);
                    int i20 = AbstractC1301j1.f15205d;
                    if (list != null && !list.isEmpty()) {
                        p12.H(i19, list);
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 27:
                    int i21 = this.f15123a[i15];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    InterfaceC1293h1 interfaceC1293h1K = K(i15);
                    int i22 = AbstractC1301j1.f15205d;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            ((C1268b0) p12).B(i21, list2.get(i23), interfaceC1293h1K);
                        }
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 28:
                    int i24 = this.f15123a[i15];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    int i25 = AbstractC1301j1.f15205d;
                    if (list3 != null && !list3.isEmpty()) {
                        p12.a(i24, list3);
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 29:
                    z7 = false;
                    AbstractC1301j1.e(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 30:
                    z7 = false;
                    AbstractC1301j1.B(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 31:
                    z7 = false;
                    AbstractC1301j1.a(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 32:
                    z7 = false;
                    AbstractC1301j1.b(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 33:
                    z7 = false;
                    AbstractC1301j1.c(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 34:
                    z7 = false;
                    AbstractC1301j1.d(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, false);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 35:
                    z8 = true;
                    AbstractC1301j1.A(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 36:
                    z8 = true;
                    AbstractC1301j1.E(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 37:
                    z8 = true;
                    AbstractC1301j1.G(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 38:
                    z8 = true;
                    AbstractC1301j1.f(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 39:
                    z8 = true;
                    AbstractC1301j1.F(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 40:
                    z8 = true;
                    AbstractC1301j1.D(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 41:
                    z8 = true;
                    AbstractC1301j1.C(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 42:
                    z8 = true;
                    AbstractC1301j1.z(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 43:
                    z8 = true;
                    AbstractC1301j1.e(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 44:
                    z8 = true;
                    AbstractC1301j1.B(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 45:
                    z8 = true;
                    AbstractC1301j1.a(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 46:
                    z8 = true;
                    AbstractC1301j1.b(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 47:
                    z8 = true;
                    AbstractC1301j1.c(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 48:
                    z8 = true;
                    AbstractC1301j1.d(this.f15123a[i15], (List) unsafe.getObject(obj, j7), p12, true);
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 49:
                    int i26 = this.f15123a[i15];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    InterfaceC1293h1 interfaceC1293h1K2 = K(i15);
                    int i27 = AbstractC1301j1.f15205d;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            ((C1268b0) p12).h(i26, list4.get(i28), interfaceC1293h1K2);
                        }
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j7) != null) {
                        androidx.appcompat.app.y.a(L(i15));
                        throw null;
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 51:
                    if (v(obj, i16, i15)) {
                        p12.v(i16, B(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 52:
                    if (v(obj, i16, i15)) {
                        p12.y(i16, C(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 53:
                    if (v(obj, i16, i15)) {
                        p12.n(i16, I(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 54:
                    if (v(obj, i16, i15)) {
                        p12.I(i16, I(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 55:
                    if (v(obj, i16, i15)) {
                        p12.t(i16, D(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 56:
                    if (v(obj, i16, i15)) {
                        p12.G(i16, I(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 57:
                    if (v(obj, i16, i15)) {
                        p12.k(i16, D(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 58:
                    if (v(obj, i16, i15)) {
                        p12.l(i16, w(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 59:
                    if (v(obj, i16, i15)) {
                        x(i16, unsafe.getObject(obj, j7), p12);
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 60:
                    if (v(obj, i16, i15)) {
                        p12.B(i16, unsafe.getObject(obj, j7), K(i15));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 61:
                    if (v(obj, i16, i15)) {
                        p12.m(i16, (S) unsafe.getObject(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 62:
                    if (v(obj, i16, i15)) {
                        p12.i(i16, D(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 63:
                    if (v(obj, i16, i15)) {
                        p12.s(i16, D(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 64:
                    if (v(obj, i16, i15)) {
                        p12.C(i16, D(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 65:
                    if (v(obj, i16, i15)) {
                        p12.r(i16, I(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 66:
                    if (v(obj, i16, i15)) {
                        p12.F(i16, D(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 67:
                    if (v(obj, i16, i15)) {
                        p12.w(i16, I(obj, j7));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                case 68:
                    if (v(obj, i16, i15)) {
                        p12.h(i16, unsafe.getObject(obj, j7), K(i15));
                    }
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
                default:
                    it2 = it;
                    iArr = iArr2;
                    entry3 = entry2;
                    i11 = i15;
                    i15 = i11 + 3;
                    i13 = i8;
                    i14 = i9;
                    i12 = 1048575;
                    it = it2;
                    iArr2 = iArr;
                    entry = entry3;
                    break;
            }
        }
        Iterator it3 = it;
        while (entry != null) {
            this.f15134l.e(p12, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        AbstractC1348x1 abstractC1348x1 = this.f15133k;
        abstractC1348x1.j(abstractC1348x1.d(obj), p12);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final Object b() {
        return ((AbstractC1329r0) this.f15127e).l();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        if (v(r21, r15, r12) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.AbstractC1264a0.w(r15 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (v(r21, r15, r12) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.AbstractC1264a0.w(r15 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if (v(r21, r15, r12) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        r0 = r15 << 3;
        r1 = D(r21, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.AbstractC1264a0.w(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
    
        if (v(r21, r15, r12) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        if (v(r21, r15, r12) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015a, code lost:
    
        if (v(r21, r15, r12) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0162, code lost:
    
        if (v(r21, r15, r12) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0164, code lost:
    
        r0 = r15 << 3;
        r1 = I(r21, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0170, code lost:
    
        if (v(r21, r15, r12) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0177, code lost:
    
        if (v(r21, r15, r12) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017f, code lost:
    
        if (v(r21, r15, r12) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7 A[PHI: r0
      0x01e7: PHI (r0v190 int) = 
      (r0v153 int)
      (r0v156 int)
      (r0v159 int)
      (r0v162 int)
      (r0v165 int)
      (r0v168 int)
      (r0v171 int)
      (r0v174 int)
      (r0v177 int)
      (r0v180 int)
      (r0v183 int)
      (r0v186 int)
      (r0v189 int)
      (r0v193 int)
     binds: [B:138:0x02a2, B:135:0x0294, B:132:0x0286, B:129:0x0278, B:126:0x026a, B:123:0x025d, B:120:0x0250, B:117:0x0243, B:114:0x0234, B:111:0x0227, B:108:0x021a, B:105:0x020d, B:102:0x0200, B:99:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c5  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(Object obj) {
        int i7;
        int i8;
        int i9;
        int i10;
        long j7;
        int i11;
        long j8;
        int iW;
        int iX;
        int iW2;
        int i12;
        int iW3;
        int i13;
        int iW4;
        long j9;
        int iW5;
        boolean z6;
        int iK;
        int size;
        int i14;
        int iS;
        int iW6;
        int iK2;
        boolean z7;
        int i15;
        int iW7;
        int iW8;
        int size2;
        int i16;
        int iR;
        int iW9;
        int iL;
        int i17;
        Object object;
        int iD;
        Unsafe unsafe = f15122p;
        int i18 = 1048575;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        int iO = 0;
        while (i21 < this.f15123a.length) {
            int iH = H(i21);
            int iG = G(iH);
            int[] iArr = this.f15123a;
            int i22 = iArr[i21];
            int i23 = iArr[i21 + 2];
            int i24 = i23 & i18;
            if (iG <= 17) {
                if (i24 != i19) {
                    i20 = i24 == i18 ? 0 : unsafe.getInt(obj, i24);
                    i19 = i24;
                }
                i9 = 1 << (i23 >>> 20);
                i7 = i19;
                i8 = i20;
            } else {
                i7 = i19;
                i8 = i20;
                i9 = 0;
            }
            int i25 = iH & i18;
            if (iG >= EnumC1308l0.f15240Y.a()) {
                EnumC1308l0.f15253l0.a();
            }
            long j10 = i25;
            switch (iG) {
                case 0:
                    i10 = i21;
                    if (!s(obj, i10, i7, i8, i9)) {
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iW2 = AbstractC1264a0.w(i22 << 3) + 8;
                    iO += iW2;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 1:
                    i10 = i21;
                    if (!s(obj, i10, i7, i8, i9)) {
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iW2 = AbstractC1264a0.w(i22 << 3) + 4;
                    iO += iW2;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 2:
                    i10 = i21;
                    j7 = j10;
                    if (!s(obj, i10, i7, i8, i9)) {
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    i11 = i22 << 3;
                    j8 = unsafe.getLong(obj, j7);
                    iW = AbstractC1264a0.w(i11);
                    iX = AbstractC1264a0.x(j8);
                    iW2 = iW + iX;
                    iO += iW2;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 3:
                    i10 = i21;
                    j7 = j10;
                    if (!s(obj, i10, i7, i8, i9)) {
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    i11 = i22 << 3;
                    j8 = unsafe.getLong(obj, j7);
                    iW = AbstractC1264a0.w(i11);
                    iX = AbstractC1264a0.x(j8);
                    iW2 = iW + iX;
                    iO += iW2;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 4:
                    i10 = i21;
                    if (s(obj, i10, i7, i8, i9)) {
                        i11 = i22 << 3;
                        j8 = unsafe.getInt(obj, j10);
                        iW = AbstractC1264a0.w(i11);
                        iX = AbstractC1264a0.x(j8);
                        iW2 = iW + iX;
                        iO += iW2;
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    } else {
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    break;
                case 5:
                    i10 = i21;
                    if (!s(obj, i10, i7, i8, i9)) {
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iW2 = AbstractC1264a0.w(i22 << 3) + 8;
                    iO += iW2;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 6:
                    i10 = i21;
                    if (!s(obj, i10, i7, i8, i9)) {
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iW2 = AbstractC1264a0.w(i22 << 3) + 4;
                    iO += iW2;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 7:
                    i10 = i21;
                    if (s(obj, i10, i7, i8, i9)) {
                        iW2 = AbstractC1264a0.w(i22 << 3) + 1;
                        iO += iW2;
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    } else {
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    break;
                case 8:
                    int i26 = i21;
                    i10 = i26;
                    if (s(obj, i26, i7, i8, i9)) {
                        int i27 = i22 << 3;
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof S) {
                            int iW10 = AbstractC1264a0.w(i27);
                            int iH2 = ((S) object2).h();
                            iW2 = iW10 + AbstractC1264a0.w(iH2) + iH2;
                            iO += iW2;
                            i21 = i10 + 3;
                            i19 = i7;
                            i20 = i8;
                            i18 = 1048575;
                        } else {
                            iW = AbstractC1264a0.w(i27);
                            iX = AbstractC1264a0.v((String) object2);
                            iW2 = iW + iX;
                            iO += iW2;
                            i21 = i10 + 3;
                            i19 = i7;
                            i20 = i8;
                            i18 = 1048575;
                        }
                    } else {
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    i12 = i21;
                    if (s(obj, i12, i7, i8, i9)) {
                        iO += AbstractC1301j1.o(i22, unsafe.getObject(obj, j10), K(i12));
                        i10 = i12;
                    } else {
                        i10 = i12;
                    }
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 10:
                    i12 = i21;
                    if (s(obj, i12, i7, i8, i9)) {
                        S s6 = (S) unsafe.getObject(obj, j10);
                        int iW11 = AbstractC1264a0.w(i22 << 3);
                        int iH3 = s6.h();
                        iW3 = iW11 + AbstractC1264a0.w(iH3) + iH3;
                        iO += iW3;
                    }
                    i10 = i12;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    i12 = i21;
                    if (s(obj, i12, i7, i8, i9)) {
                        i13 = unsafe.getInt(obj, j10);
                        iW4 = AbstractC1264a0.w(i22 << 3);
                        iW5 = AbstractC1264a0.w(i13);
                        iW3 = iW4 + iW5;
                        iO += iW3;
                    }
                    i10 = i12;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 12:
                    i12 = i21;
                    if (s(obj, i12, i7, i8, i9)) {
                        j9 = unsafe.getInt(obj, j10);
                        iW4 = AbstractC1264a0.w(i22 << 3);
                        iW5 = AbstractC1264a0.x(j9);
                        iW3 = iW4 + iW5;
                        iO += iW3;
                    }
                    i10 = i12;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 13:
                    i12 = i21;
                    if (s(obj, i12, i7, i8, i9)) {
                        iW3 = AbstractC1264a0.w(i22 << 3) + 4;
                        iO += iW3;
                    }
                    i10 = i12;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 14:
                    i12 = i21;
                    if (s(obj, i12, i7, i8, i9)) {
                        iW3 = AbstractC1264a0.w(i22 << 3) + 8;
                        iO += iW3;
                    }
                    i10 = i12;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 15:
                    i12 = i21;
                    if (s(obj, i12, i7, i8, i9)) {
                        int i28 = unsafe.getInt(obj, j10);
                        iW4 = AbstractC1264a0.w(i22 << 3);
                        i13 = (i28 >> 31) ^ (i28 + i28);
                        iW5 = AbstractC1264a0.w(i13);
                        iW3 = iW4 + iW5;
                        iO += iW3;
                    }
                    i10 = i12;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 16:
                    i12 = i21;
                    if (s(obj, i21, i7, i8, i9)) {
                        long j11 = unsafe.getLong(obj, j10);
                        iW4 = AbstractC1264a0.w(i22 << 3);
                        j9 = (j11 >> 63) ^ (j11 + j11);
                        iW5 = AbstractC1264a0.x(j9);
                        iW3 = iW4 + iW5;
                        iO += iW3;
                    }
                    i10 = i12;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 17:
                    if (s(obj, i21, i7, i8, i9)) {
                        iO += AbstractC1264a0.t(i22, (W0) unsafe.getObject(obj, j10), K(i21));
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    z6 = false;
                    iK = AbstractC1301j1.k(i22, (List) unsafe.getObject(obj, j10), false);
                    iO += iK;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 19:
                    z6 = false;
                    iK = AbstractC1301j1.i(i22, (List) unsafe.getObject(obj, j10), false);
                    iO += iK;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j10);
                    int i29 = AbstractC1301j1.f15205d;
                    iW6 = list.size() == 0 ? 0 : AbstractC1301j1.n(list) + (list.size() * AbstractC1264a0.w(i22 << 3));
                    iO += iW6;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    List list2 = (List) unsafe.getObject(obj, j10);
                    int i30 = AbstractC1301j1.f15205d;
                    size = list2.size();
                    if (size != 0) {
                        i14 = i22 << 3;
                        iS = AbstractC1301j1.s(list2);
                        iW6 = iS + (size * AbstractC1264a0.w(i14));
                        iO += iW6;
                        i10 = i21;
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iO += iW6;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j10);
                    int i31 = AbstractC1301j1.f15205d;
                    size = list3.size();
                    if (size != 0) {
                        i14 = i22 << 3;
                        iS = AbstractC1301j1.m(list3);
                        iW6 = iS + (size * AbstractC1264a0.w(i14));
                        iO += iW6;
                        i10 = i21;
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iO += iW6;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    iK2 = AbstractC1301j1.k(i22, (List) unsafe.getObject(obj, j10), false);
                    iO += iK2;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    z7 = false;
                    i15 = AbstractC1301j1.i(i22, (List) unsafe.getObject(obj, j10), false);
                    iO += i15;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j10);
                    int i32 = AbstractC1301j1.f15205d;
                    int size3 = list4.size();
                    iK2 = size3 == 0 ? 0 : size3 * (AbstractC1264a0.w(i22 << 3) + 1);
                    iO += iK2;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j10);
                    int i33 = AbstractC1301j1.f15205d;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        int iW12 = AbstractC1264a0.w(i22 << 3) * size4;
                        if (list5 instanceof F0) {
                            F0 f02 = (F0) list5;
                            iW6 = iW12;
                            for (int i34 = 0; i34 < size4; i34++) {
                                Object objU = f02.U(i34);
                                if (objU instanceof S) {
                                    int iH4 = ((S) objU).h();
                                    iW6 += AbstractC1264a0.w(iH4) + iH4;
                                } else {
                                    iW6 += AbstractC1264a0.v((String) objU);
                                }
                            }
                        } else {
                            iW6 = iW12;
                            for (int i35 = 0; i35 < size4; i35++) {
                                Object obj2 = list5.get(i35);
                                if (obj2 instanceof S) {
                                    int iH5 = ((S) obj2).h();
                                    iW6 += AbstractC1264a0.w(iH5) + iH5;
                                } else {
                                    iW6 += AbstractC1264a0.v((String) obj2);
                                }
                            }
                        }
                    }
                    iO += iW6;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j10);
                    InterfaceC1293h1 interfaceC1293h1K = K(i21);
                    int i36 = AbstractC1301j1.f15205d;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iW7 = 0;
                    } else {
                        iW7 = AbstractC1264a0.w(i22 << 3) * size5;
                        for (int i37 = 0; i37 < size5; i37++) {
                            iW7 += AbstractC1264a0.u((W0) list6.get(i37), interfaceC1293h1K);
                        }
                    }
                    iO += iW7;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j10);
                    int i38 = AbstractC1301j1.f15205d;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iW8 = 0;
                    } else {
                        iW8 = size6 * AbstractC1264a0.w(i22 << 3);
                        for (int i39 = 0; i39 < list7.size(); i39++) {
                            int iH6 = ((S) list7.get(i39)).h();
                            iW8 += AbstractC1264a0.w(iH6) + iH6;
                        }
                    }
                    iO += iW8;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j10);
                    int i40 = AbstractC1301j1.f15205d;
                    size2 = list8.size();
                    if (size2 != 0) {
                        i16 = i22 << 3;
                        iR = AbstractC1301j1.r(list8);
                        iW9 = size2 * AbstractC1264a0.w(i16);
                        iK2 = iR + iW9;
                        iO += iK2;
                        i10 = i21;
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iO += iK2;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j10);
                    int i41 = AbstractC1301j1.f15205d;
                    size2 = list9.size();
                    if (size2 != 0) {
                        i16 = i22 << 3;
                        iR = AbstractC1301j1.h(list9);
                        iW9 = size2 * AbstractC1264a0.w(i16);
                        iK2 = iR + iW9;
                        iO += iK2;
                        i10 = i21;
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iO += iK2;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 31:
                    iK2 = AbstractC1301j1.i(i22, (List) unsafe.getObject(obj, j10), false);
                    iO += iK2;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 32:
                    z7 = false;
                    i15 = AbstractC1301j1.k(i22, (List) unsafe.getObject(obj, j10), false);
                    iO += i15;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j10);
                    int i42 = AbstractC1301j1.f15205d;
                    size2 = list10.size();
                    if (size2 != 0) {
                        i16 = i22 << 3;
                        iR = AbstractC1301j1.p(list10);
                        iW9 = size2 * AbstractC1264a0.w(i16);
                        iK2 = iR + iW9;
                        iO += iK2;
                        i10 = i21;
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iO += iK2;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j10);
                    int i43 = AbstractC1301j1.f15205d;
                    size2 = list11.size();
                    if (size2 != 0) {
                        i16 = i22 << 3;
                        iR = AbstractC1301j1.q(list11);
                        iW9 = size2 * AbstractC1264a0.w(i16);
                        iK2 = iR + iW9;
                        iO += iK2;
                        i10 = i21;
                        i21 = i10 + 3;
                        i19 = i7;
                        i20 = i8;
                        i18 = 1048575;
                    }
                    iO += iK2;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 35:
                    iL = AbstractC1301j1.l((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                        iO += AbstractC1264a0.w(i22 << 3) + AbstractC1264a0.w(iL) + iL;
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 36:
                    iL = AbstractC1301j1.j((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 37:
                    iL = AbstractC1301j1.n((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 38:
                    iL = AbstractC1301j1.s((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 39:
                    iL = AbstractC1301j1.m((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 40:
                    iL = AbstractC1301j1.l((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 41:
                    iL = AbstractC1301j1.j((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j10);
                    int i44 = AbstractC1301j1.f15205d;
                    iL = list12.size();
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 43:
                    iL = AbstractC1301j1.r((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 44:
                    iL = AbstractC1301j1.h((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 45:
                    iL = AbstractC1301j1.j((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 46:
                    iL = AbstractC1301j1.l((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 47:
                    iL = AbstractC1301j1.p((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 48:
                    iL = AbstractC1301j1.q((List) unsafe.getObject(obj, j10));
                    if (iL > 0) {
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j10);
                    InterfaceC1293h1 interfaceC1293h1K2 = K(i21);
                    int i45 = AbstractC1301j1.f15205d;
                    int size7 = list13.size();
                    if (size7 != 0) {
                        iW7 = 0;
                        for (int i46 = 0; i46 < size7; i46++) {
                            iW7 += AbstractC1264a0.t(i22, (W0) list13.get(i46), interfaceC1293h1K2);
                        }
                    }
                    iO += iW7;
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 50:
                    Q0 q02 = (Q0) unsafe.getObject(obj, j10);
                    androidx.appcompat.app.y.a(L(i21));
                    if (!q02.isEmpty()) {
                        Iterator it = q02.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 51:
                    break;
                case 52:
                    break;
                case 53:
                    break;
                case 54:
                    break;
                case 55:
                    break;
                case 56:
                    break;
                case 57:
                    break;
                case 58:
                    if (v(obj, i22, i21)) {
                        iK2 = AbstractC1264a0.w(i22 << 3) + 1;
                        iO += iK2;
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 59:
                    if (v(obj, i22, i21)) {
                        i17 = i22 << 3;
                        object = unsafe.getObject(obj, j10);
                        if (!(object instanceof S)) {
                            iR = AbstractC1264a0.w(i17);
                            iW9 = AbstractC1264a0.v((String) object);
                            iK2 = iR + iW9;
                            iO += iK2;
                        }
                        int iW13 = AbstractC1264a0.w(i17);
                        int iH7 = ((S) object).h();
                        iK2 = iW13 + AbstractC1264a0.w(iH7) + iH7;
                        iO += iK2;
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 60:
                    if (v(obj, i22, i21)) {
                        iK2 = AbstractC1301j1.o(i22, unsafe.getObject(obj, j10), K(i21));
                        iO += iK2;
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 61:
                    if (v(obj, i22, i21)) {
                        i17 = i22 << 3;
                        object = unsafe.getObject(obj, j10);
                        int iW132 = AbstractC1264a0.w(i17);
                        int iH72 = ((S) object).h();
                        iK2 = iW132 + AbstractC1264a0.w(iH72) + iH72;
                        iO += iK2;
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 62:
                    if (v(obj, i22, i21)) {
                        iD = D(obj, j10);
                        iR = AbstractC1264a0.w(i22 << 3);
                        iW9 = AbstractC1264a0.w(iD);
                        iK2 = iR + iW9;
                        iO += iK2;
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 63:
                    break;
                case 64:
                    break;
                case 65:
                    break;
                case 66:
                    if (v(obj, i22, i21)) {
                        int iD2 = D(obj, j10);
                        iR = AbstractC1264a0.w(i22 << 3);
                        iD = (iD2 >> 31) ^ (iD2 + iD2);
                        iW9 = AbstractC1264a0.w(iD);
                        iK2 = iR + iW9;
                        iO += iK2;
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 67:
                    if (v(obj, i22, i21)) {
                        long jI = I(obj, j10);
                        iR = AbstractC1264a0.w(i22 << 3);
                        long jI2 = (jI >> 63) ^ (jI + jI);
                        iW9 = AbstractC1264a0.x(jI2);
                        iK2 = iR + iW9;
                        iO += iK2;
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                case 68:
                    if (v(obj, i22, i21)) {
                        iK2 = AbstractC1264a0.t(i22, (W0) unsafe.getObject(obj, j10), K(i21));
                        iO += iK2;
                    }
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
                default:
                    i10 = i21;
                    i21 = i10 + 3;
                    i19 = i7;
                    i20 = i8;
                    i18 = 1048575;
                    break;
            }
        }
        int iB = 0;
        AbstractC1348x1 abstractC1348x1 = this.f15133k;
        int iA = iO + abstractC1348x1.a(abstractC1348x1.d(obj));
        if (!this.f15128f) {
            return iA;
        }
        C1304k0 c1304k0B = this.f15134l.b(obj);
        for (int i47 = 0; i47 < c1304k0B.f15210a.b(); i47++) {
            Map.Entry entryH = c1304k0B.f15210a.h(i47);
            androidx.appcompat.app.y.a(entryH.getKey());
            iB += C1304k0.b(null, entryH.getValue());
        }
        for (Map.Entry entry2 : c1304k0B.f15210a.d()) {
            androidx.appcompat.app.y.a(entry2.getKey());
            iB += C1304k0.b(null, entry2.getValue());
        }
        return iA + iB;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final void d(Object obj, byte[] bArr, int i7, int i8, D d7) throws B0 {
        y(obj, bArr, i7, i8, 0, d7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3 A[PHI: r1 r2
      0x00f3: PHI (r1v14 int) = (r1v9 int), (r1v15 int) binds: [B:74:0x010f, B:68:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r2v10 java.lang.Object) = (r2v7 java.lang.Object), (r2v11 java.lang.Object) binds: [B:74:0x010f, B:68:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(Object obj) {
        int i7;
        double dF;
        float fG;
        boolean zB;
        int i8;
        Object objK;
        int iH;
        long jI;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f15123a.length; i10 += 3) {
            int iH2 = H(i10);
            int[] iArr = this.f15123a;
            int i11 = 1048575 & iH2;
            int iG = G(iH2);
            int i12 = iArr[i10];
            long j7 = i11;
            int iHashCode = 37;
            switch (iG) {
                case 0:
                    i7 = i9 * 53;
                    dF = H1.f(obj, j7);
                    jI = Double.doubleToLongBits(dF);
                    byte[] bArr = AbstractC1353z0.f15324d;
                    iH = (int) (jI ^ (jI >>> 32));
                    i9 = i7 + iH;
                    break;
                case 1:
                    i7 = i9 * 53;
                    fG = H1.g(obj, j7);
                    iH = Float.floatToIntBits(fG);
                    i9 = i7 + iH;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i7 = i9 * 53;
                    jI = H1.i(obj, j7);
                    byte[] bArr2 = AbstractC1353z0.f15324d;
                    iH = (int) (jI ^ (jI >>> 32));
                    i9 = i7 + iH;
                    break;
                case 4:
                case 6:
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                case 12:
                case 13:
                case 15:
                    i7 = i9 * 53;
                    iH = H1.h(obj, j7);
                    i9 = i7 + iH;
                    break;
                case 7:
                    i7 = i9 * 53;
                    zB = H1.B(obj, j7);
                    iH = AbstractC1353z0.a(zB);
                    i9 = i7 + iH;
                    break;
                case 8:
                    i7 = i9 * 53;
                    iH = ((String) H1.k(obj, j7)).hashCode();
                    i9 = i7 + iH;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    i8 = i9 * 53;
                    objK = H1.k(obj, j7);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i9 = i8 + iHashCode;
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
                    i7 = i9 * 53;
                    iH = H1.k(obj, j7).hashCode();
                    i9 = i7 + iH;
                    break;
                case 17:
                    i8 = i9 * 53;
                    objK = H1.k(obj, j7);
                    if (objK != null) {
                    }
                    i9 = i8 + iHashCode;
                    break;
                case 51:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        dF = B(obj, j7);
                        jI = Double.doubleToLongBits(dF);
                        byte[] bArr22 = AbstractC1353z0.f15324d;
                        iH = (int) (jI ^ (jI >>> 32));
                        i9 = i7 + iH;
                    }
                    break;
                case 52:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        fG = C(obj, j7);
                        iH = Float.floatToIntBits(fG);
                        i9 = i7 + iH;
                    }
                    break;
                case 53:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    jI = I(obj, j7);
                    byte[] bArr222 = AbstractC1353z0.f15324d;
                    iH = (int) (jI ^ (jI >>> 32));
                    i9 = i7 + iH;
                    break;
                case 54:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    jI = I(obj, j7);
                    byte[] bArr2222 = AbstractC1353z0.f15324d;
                    iH = (int) (jI ^ (jI >>> 32));
                    i9 = i7 + iH;
                    break;
                case 55:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = D(obj, j7);
                    i9 = i7 + iH;
                    break;
                case 56:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    jI = I(obj, j7);
                    byte[] bArr22222 = AbstractC1353z0.f15324d;
                    iH = (int) (jI ^ (jI >>> 32));
                    i9 = i7 + iH;
                    break;
                case 57:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = D(obj, j7);
                    i9 = i7 + iH;
                    break;
                case 58:
                    if (v(obj, i12, i10)) {
                        i7 = i9 * 53;
                        zB = w(obj, j7);
                        iH = AbstractC1353z0.a(zB);
                        i9 = i7 + iH;
                    }
                    break;
                case 59:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = ((String) H1.k(obj, j7)).hashCode();
                    i9 = i7 + iH;
                    break;
                case 60:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = H1.k(obj, j7).hashCode();
                    i9 = i7 + iH;
                    break;
                case 61:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = H1.k(obj, j7).hashCode();
                    i9 = i7 + iH;
                    break;
                case 62:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = D(obj, j7);
                    i9 = i7 + iH;
                    break;
                case 63:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = D(obj, j7);
                    i9 = i7 + iH;
                    break;
                case 64:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = D(obj, j7);
                    i9 = i7 + iH;
                    break;
                case 65:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    jI = I(obj, j7);
                    byte[] bArr222222 = AbstractC1353z0.f15324d;
                    iH = (int) (jI ^ (jI >>> 32));
                    i9 = i7 + iH;
                    break;
                case 66:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = D(obj, j7);
                    i9 = i7 + iH;
                    break;
                case 67:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    jI = I(obj, j7);
                    byte[] bArr2222222 = AbstractC1353z0.f15324d;
                    iH = (int) (jI ^ (jI >>> 32));
                    i9 = i7 + iH;
                    break;
                case 68:
                    if (!v(obj, i12, i10)) {
                    }
                    i7 = i9 * 53;
                    iH = H1.k(obj, j7).hashCode();
                    i9 = i7 + iH;
                    break;
            }
        }
        int iHashCode2 = (i9 * 53) + this.f15133k.d(obj).hashCode();
        return this.f15128f ? (iHashCode2 * 53) + this.f15134l.b(obj).f15210a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
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
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.Z0.f(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(Object obj) {
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (i10 < this.f15130h) {
            int[] iArr = this.f15129g;
            int[] iArr2 = this.f15123a;
            int i12 = iArr[i10];
            int i13 = iArr2[i12];
            int iH = H(i12);
            int i14 = this.f15123a[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i11) {
                if (i15 != 1048575) {
                    i9 = f15122p.getInt(obj, i15);
                }
                i8 = i9;
                i7 = i15;
            } else {
                i7 = i11;
                i8 = i9;
            }
            if ((268435456 & iH) != 0 && !s(obj, i12, i7, i8, i16)) {
                return false;
            }
            int iG = G(iH);
            if (iG == 9 || iG == 17) {
                if (s(obj, i12, i7, i8, i16) && !t(obj, iH, K(i12))) {
                    return false;
                }
            } else if (iG == 27) {
                List list = (List) H1.k(obj, iH & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC1293h1 interfaceC1293h1K = K(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!interfaceC1293h1K.g(list.get(i17))) {
                            return false;
                        }
                    }
                }
            } else if (iG == 60 || iG == 68) {
                if (v(obj, i13, i12) && !t(obj, iH, K(i12))) {
                    return false;
                }
            } else if (iG != 49) {
                if (iG == 50 && !((Q0) H1.k(obj, iH & 1048575)).isEmpty()) {
                    androidx.appcompat.app.y.a(L(i12));
                    throw null;
                }
            }
            i10++;
            i11 = i7;
            i9 = i8;
        }
        return !this.f15128f || this.f15134l.b(obj).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, Object obj2) {
        j(obj);
        obj2.getClass();
        for (int i7 = 0; i7 < this.f15123a.length; i7 += 3) {
            int iH = H(i7);
            int i8 = 1048575 & iH;
            int[] iArr = this.f15123a;
            int iG = G(iH);
            int i9 = iArr[i7];
            long j7 = i8;
            switch (iG) {
                case 0:
                    if (r(obj2, i7)) {
                        H1.t(obj, j7, H1.f(obj2, j7));
                        m(obj, i7);
                    }
                    break;
                case 1:
                    if (r(obj2, i7)) {
                        H1.u(obj, j7, H1.g(obj2, j7));
                        m(obj, i7);
                    }
                    break;
                case 2:
                    if (!r(obj2, i7)) {
                    }
                    H1.w(obj, j7, H1.i(obj2, j7));
                    m(obj, i7);
                    break;
                case 3:
                    if (!r(obj2, i7)) {
                    }
                    H1.w(obj, j7, H1.i(obj2, j7));
                    m(obj, i7);
                    break;
                case 4:
                    if (!r(obj2, i7)) {
                    }
                    H1.v(obj, j7, H1.h(obj2, j7));
                    m(obj, i7);
                    break;
                case 5:
                    if (!r(obj2, i7)) {
                    }
                    H1.w(obj, j7, H1.i(obj2, j7));
                    m(obj, i7);
                    break;
                case 6:
                    if (!r(obj2, i7)) {
                    }
                    H1.v(obj, j7, H1.h(obj2, j7));
                    m(obj, i7);
                    break;
                case 7:
                    if (r(obj2, i7)) {
                        H1.r(obj, j7, H1.B(obj2, j7));
                        m(obj, i7);
                    }
                    break;
                case 8:
                    if (!r(obj2, i7)) {
                    }
                    H1.x(obj, j7, H1.k(obj2, j7));
                    m(obj, i7);
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                case 17:
                    k(obj, obj2, i7);
                    break;
                case 10:
                    if (!r(obj2, i7)) {
                    }
                    H1.x(obj, j7, H1.k(obj2, j7));
                    m(obj, i7);
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (!r(obj2, i7)) {
                    }
                    H1.v(obj, j7, H1.h(obj2, j7));
                    m(obj, i7);
                    break;
                case 12:
                    if (!r(obj2, i7)) {
                    }
                    H1.v(obj, j7, H1.h(obj2, j7));
                    m(obj, i7);
                    break;
                case 13:
                    if (!r(obj2, i7)) {
                    }
                    H1.v(obj, j7, H1.h(obj2, j7));
                    m(obj, i7);
                    break;
                case 14:
                    if (!r(obj2, i7)) {
                    }
                    H1.w(obj, j7, H1.i(obj2, j7));
                    m(obj, i7);
                    break;
                case 15:
                    if (!r(obj2, i7)) {
                    }
                    H1.v(obj, j7, H1.h(obj2, j7));
                    m(obj, i7);
                    break;
                case 16:
                    if (!r(obj2, i7)) {
                    }
                    H1.w(obj, j7, H1.i(obj2, j7));
                    m(obj, i7);
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
                    this.f15132j.b(obj, obj2, j7);
                    break;
                case 50:
                    int i10 = AbstractC1301j1.f15205d;
                    H1.x(obj, j7, R0.a(H1.k(obj, j7), H1.k(obj2, j7)));
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
                    if (v(obj2, i9, i7)) {
                        H1.x(obj, j7, H1.k(obj2, j7));
                        n(obj, i9, i7);
                    }
                    break;
                case 60:
                case 68:
                    l(obj, obj2, i7);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!v(obj2, i9, i7)) {
                        break;
                    }
                    break;
            }
        }
        AbstractC1301j1.x(this.f15133k, obj, obj2);
        if (this.f15128f) {
            AbstractC1301j1.w(this.f15134l, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1293h1
    public final boolean i(Object obj, Object obj2) {
        for (int i7 = 0; i7 < this.f15123a.length; i7 += 3) {
            int iH = H(i7);
            long j7 = iH & 1048575;
            switch (G(iH)) {
                case 0:
                    if (!q(obj, obj2, i7) || Double.doubleToLongBits(H1.f(obj, j7)) != Double.doubleToLongBits(H1.f(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!q(obj, obj2, i7) || Float.floatToIntBits(H1.g(obj, j7)) != Float.floatToIntBits(H1.g(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!q(obj, obj2, i7) || H1.i(obj, j7) != H1.i(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!q(obj, obj2, i7) || H1.i(obj, j7) != H1.i(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!q(obj, obj2, i7) || H1.h(obj, j7) != H1.h(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!q(obj, obj2, i7) || H1.i(obj, j7) != H1.i(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!q(obj, obj2, i7) || H1.h(obj, j7) != H1.h(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!q(obj, obj2, i7) || H1.B(obj, j7) != H1.B(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!q(obj, obj2, i7) || !AbstractC1301j1.g(H1.k(obj, j7), H1.k(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    if (!q(obj, obj2, i7) || !AbstractC1301j1.g(H1.k(obj, j7), H1.k(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!q(obj, obj2, i7) || !AbstractC1301j1.g(H1.k(obj, j7), H1.k(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    if (!q(obj, obj2, i7) || H1.h(obj, j7) != H1.h(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!q(obj, obj2, i7) || H1.h(obj, j7) != H1.h(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!q(obj, obj2, i7) || H1.h(obj, j7) != H1.h(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!q(obj, obj2, i7) || H1.i(obj, j7) != H1.i(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!q(obj, obj2, i7) || H1.h(obj, j7) != H1.h(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!q(obj, obj2, i7) || H1.i(obj, j7) != H1.i(obj2, j7)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!q(obj, obj2, i7) || !AbstractC1301j1.g(H1.k(obj, j7), H1.k(obj2, j7))) {
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
                    if (!AbstractC1301j1.g(H1.k(obj, j7), H1.k(obj2, j7))) {
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
                    long jE = E(i7) & 1048575;
                    if (H1.h(obj, jE) != H1.h(obj2, jE) || !AbstractC1301j1.g(H1.k(obj, j7), H1.k(obj2, j7))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.f15133k.d(obj).equals(this.f15133k.d(obj2))) {
            return false;
        }
        if (this.f15128f) {
            return this.f15134l.b(obj).equals(this.f15134l.b(obj2));
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0705, code lost:
    
        if (r2 == 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0707, code lost:
    
        r12.add(com.google.android.gms.internal.play_billing.S.f15105n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x070d, code lost:
    
        r12.add(com.google.android.gms.internal.play_billing.S.r(r15, r0, r2));
        r0 = r0 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0715, code lost:
    
        if (r0 >= r41) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0717, code lost:
    
        r2 = com.google.android.gms.internal.play_billing.E.h(r15, r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x071d, code lost:
    
        if (r40 != r10.f15039a) goto L704;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x071f, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.E.h(r15, r2, r10);
        r2 = r10.f15039a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0725, code lost:
    
        if (r2 < 0) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0729, code lost:
    
        if (r2 > (r15.length - r0)) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x072b, code lost:
    
        if (r2 != 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0732, code lost:
    
        throw com.google.android.gms.internal.play_billing.B0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0737, code lost:
    
        throw com.google.android.gms.internal.play_billing.B0.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0738, code lost:
    
        r33 = r13;
        r3 = r0;
        r8 = r41;
        r0 = r40 == true ? 1 : 0;
        r7 = r10;
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0715, code lost:
    
        r12.add(com.google.android.gms.internal.play_billing.S.r(r15, r0, r2));
        r0 = r0 + r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0d92  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0d3a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x09ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0a19 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0d56 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0248  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:281:0x072b -> B:272:0x0707). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:315:0x07e2 -> B:307:0x07c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:337:0x0833 -> B:327:0x080a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int y(Object obj, byte[] bArr, int i7, int i8, int i9, D d7) throws B0 {
        Z0 z02;
        int i10;
        Unsafe unsafe;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iF;
        D d8;
        int i16;
        int i17;
        int i18;
        Z0 z03;
        int iJ;
        byte[] bArr2;
        int i19;
        int i20;
        int i21;
        int i22;
        Z0 z04;
        int iG;
        C1284f0 c1284f0;
        int i23;
        int i24;
        int i25;
        D d9;
        int i26;
        Unsafe unsafe2;
        int i27;
        long j7;
        Unsafe unsafe3;
        Object obj2;
        long jN;
        int i28;
        int i29;
        int i30;
        byte b7;
        int i31;
        boolean z6;
        int i32;
        long j8;
        int iA;
        int i33;
        Z0 z05;
        int i34;
        D d10;
        int i35;
        int i36;
        int i37;
        int i38;
        D d11;
        int i39;
        int i40;
        int i41;
        int i42;
        Z0 z06;
        int i43;
        boolean z7;
        int iH;
        int i44;
        int i45;
        int i46;
        int i47;
        int iH2;
        int i48;
        int i49;
        int i50;
        int i51;
        int iJ2;
        int i52;
        int i53;
        int i54;
        Unsafe unsafe4;
        int iH3;
        int i55;
        long j9;
        int i56;
        long j10;
        Object objValueOf;
        long jN2;
        int iB;
        int i57;
        int i58;
        int i59;
        long j11;
        int i60;
        long j12;
        Object objValueOf2;
        Z0 z07 = this;
        Object obj3 = obj;
        byte[] bArr3 = bArr;
        int i61 = i8;
        int i62 = i9;
        D d12 = d7;
        int i63 = 3;
        j(obj);
        Unsafe unsafe5 = f15122p;
        int i64 = 0;
        int i65 = -1;
        int iL = i7;
        int i66 = -1;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        int i70 = 1048575;
        while (true) {
            if (iL < i61) {
                int i71 = iL + 1;
                int i72 = bArr3[iL];
                if (i72 < 0) {
                    i71 = E.i(i72, bArr3, i71, d12);
                    i72 = d12.f15039a;
                }
                int i73 = i72 >>> 3;
                if (i73 > i66) {
                    iF = (i73 < z07.f15125c || i73 > z07.f15126d) ? i65 : z07.F(i73, i67 / i63);
                } else if (i73 < z07.f15125c || i73 > z07.f15126d) {
                    i15 = i65;
                    if (i15 != i65) {
                        d8 = d12;
                        i10 = i62;
                        i16 = i73;
                        i17 = i65;
                        i67 = i64;
                        i18 = i67;
                        unsafe = unsafe5;
                        z03 = z07;
                        iJ = i71;
                        i13 = i72;
                        bArr2 = bArr3;
                        i19 = i68;
                        i20 = i63;
                    } else {
                        int i74 = i72 & 7;
                        int[] iArr = z07.f15123a;
                        int i75 = iArr[i15 + 1];
                        int iG2 = G(i75);
                        long j13 = i75 & 1048575;
                        int i76 = i72;
                        if (iG2 <= 17) {
                            int i77 = iArr[i15 + 2];
                            int i78 = 1 << (i77 >>> 20);
                            int i79 = i77 & 1048575;
                            int i80 = i70;
                            if (i79 != i80) {
                                if (i80 != 1048575) {
                                    unsafe5.putInt(obj3, i80, i68);
                                }
                                i70 = i79;
                                i68 = i79 == 1048575 ? 0 : unsafe5.getInt(obj3, i79);
                            } else {
                                i70 = i80;
                            }
                            switch (iG2) {
                                case 0:
                                    i25 = i76 == true ? 1 : 0;
                                    i27 = i71;
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    i26 = 3;
                                    i17 = -1;
                                    i18 = 0;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 1) {
                                        iL = i27 + 8;
                                        i68 |= i78;
                                        H1.t(obj3, j13, Double.longBitsToDouble(E.n(bArr3, i27)));
                                        i61 = i8;
                                        i62 = i9;
                                        d12 = d9;
                                        i63 = 3;
                                        i67 = i24;
                                        i69 = i25 == true ? 1 : 0;
                                        i65 = -1;
                                        i66 = i23;
                                        unsafe5 = unsafe2;
                                        i64 = i18;
                                    } else {
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 1:
                                    i25 = i76 == true ? 1 : 0;
                                    i27 = i71;
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    i26 = 3;
                                    i17 = -1;
                                    i18 = 0;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 5) {
                                        iL = i27 + 4;
                                        i68 |= i78;
                                        H1.u(obj3, j13, Float.intBitsToFloat(E.b(bArr3, i27)));
                                        i61 = i8;
                                        i62 = i9;
                                        d12 = d9;
                                        i63 = i26;
                                        i67 = i24;
                                        i69 = i25;
                                        i65 = i17;
                                        i66 = i23;
                                        unsafe5 = unsafe2;
                                        i64 = i18;
                                    } else {
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 2:
                                case 3:
                                    i25 = i76 == true ? 1 : 0;
                                    i27 = i71;
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    j7 = j13;
                                    i26 = 3;
                                    i17 = -1;
                                    i18 = 0;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 0) {
                                        i68 |= i78;
                                        iL = E.k(bArr3, i27, d9);
                                        unsafe3 = unsafe2;
                                        obj2 = obj;
                                        jN = d9.f15040b;
                                        unsafe3.putLong(obj2, j7, jN);
                                        i61 = i8;
                                        i62 = i9;
                                        d12 = d9;
                                        i63 = i26;
                                        i67 = i24;
                                        i69 = i25;
                                        i65 = i17;
                                        i66 = i23;
                                        unsafe5 = unsafe2;
                                        i64 = i18;
                                    } else {
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 4:
                                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                                    i25 = i76 == true ? 1 : 0;
                                    i27 = i71;
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    i26 = 3;
                                    i17 = -1;
                                    i18 = 0;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 0) {
                                        i68 |= i78;
                                        iL = E.h(bArr3, i27, d9);
                                        unsafe2.putInt(obj3, j13, d9.f15039a);
                                        i61 = i8;
                                        i62 = i9;
                                        d12 = d9;
                                        i63 = i26;
                                        i67 = i24;
                                        i69 = i25;
                                        i65 = i17;
                                        i66 = i23;
                                        unsafe5 = unsafe2;
                                        i64 = i18;
                                    } else {
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 5:
                                case 14:
                                    i25 = i76 == true ? 1 : 0;
                                    i27 = i71;
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    j7 = j13;
                                    i26 = 3;
                                    i17 = -1;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 1) {
                                        iL = i27 + 8;
                                        i68 |= i78;
                                        jN = E.n(bArr3, i27);
                                        unsafe3 = unsafe2;
                                        obj2 = obj;
                                        i18 = 0;
                                        unsafe3.putLong(obj2, j7, jN);
                                        i61 = i8;
                                        i62 = i9;
                                        d12 = d9;
                                        i63 = i26;
                                        i67 = i24;
                                        i69 = i25;
                                        i65 = i17;
                                        i66 = i23;
                                        unsafe5 = unsafe2;
                                        i64 = i18;
                                    } else {
                                        i18 = 0;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    i25 = i76 == true ? 1 : 0;
                                    i27 = i71;
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    i26 = 3;
                                    i17 = -1;
                                    i24 = i15;
                                    d9 = d12;
                                    i28 = 0;
                                    if (i74 == 5) {
                                        iL = i27 + 4;
                                        i68 |= i78;
                                        unsafe2.putInt(obj3, j13, E.b(bArr3, i27));
                                        i61 = i8;
                                        i62 = i9;
                                        i63 = i26;
                                        i69 = i25;
                                        i65 = i17;
                                        i66 = i23;
                                        Unsafe unsafe6 = unsafe2;
                                        i64 = i28;
                                        d12 = d9;
                                        i67 = i24;
                                        unsafe5 = unsafe6;
                                    } else {
                                        i18 = i28;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 7:
                                    i25 = i76 == true ? 1 : 0;
                                    i27 = i71;
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    i26 = 3;
                                    i17 = -1;
                                    i24 = i15;
                                    d9 = d12;
                                    i28 = 0;
                                    if (i74 == 0) {
                                        i68 |= i78;
                                        iL = E.k(bArr3, i27, d9);
                                        H1.r(obj3, j13, d9.f15040b != 0);
                                        i61 = i8;
                                        i62 = i9;
                                        i63 = i26;
                                        i69 = i25;
                                        i65 = i17;
                                        i66 = i23;
                                        Unsafe unsafe62 = unsafe2;
                                        i64 = i28;
                                        d12 = d9;
                                        i67 = i24;
                                        unsafe5 = unsafe62;
                                    } else {
                                        i18 = i28;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 8:
                                    i27 = i71;
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    i17 = -1;
                                    boolean z8 = i76 == true ? 1 : 0;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 2) {
                                        if ((i75 & 536870912) != 0) {
                                            int iH4 = E.h(bArr3, i27, d9);
                                            int i81 = d9.f15039a;
                                            if (i81 < 0) {
                                                throw B0.d();
                                            }
                                            int i82 = i68 | i78;
                                            if (i81 == 0) {
                                                d9.f15041c = "";
                                                i29 = i82;
                                                i25 = z8 ? 1 : 0;
                                                i28 = 0;
                                                i26 = 3;
                                            } else {
                                                int i83 = M1.f15066b;
                                                int length = bArr3.length;
                                                if ((((length - iH4) - i81) | iH4 | i81) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iH4), Integer.valueOf(i81)));
                                                }
                                                int i84 = iH4 + i81;
                                                char[] cArr = new char[i81];
                                                int i85 = 0;
                                                while (iH4 < i84) {
                                                    byte b8 = bArr3[iH4];
                                                    if (I1.d(b8)) {
                                                        iH4++;
                                                        cArr[i85] = (char) b8;
                                                        i85++;
                                                    } else {
                                                        while (true) {
                                                            while (iH4 < i84) {
                                                                i30 = iH4 + 1;
                                                                b7 = bArr3[iH4];
                                                                if (I1.d(b7)) {
                                                                    cArr[i85] = (char) b7;
                                                                    i85++;
                                                                    iH4 = i30;
                                                                    while (iH4 < i84) {
                                                                        byte b9 = bArr3[iH4];
                                                                        if (I1.d(b9)) {
                                                                            iH4++;
                                                                            cArr[i85] = (char) b9;
                                                                            i85++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i31 = i82;
                                                                    if (b7 < -32) {
                                                                        if (i30 >= i84) {
                                                                            throw B0.c();
                                                                        }
                                                                        iH4 += 2;
                                                                        I1.c(b7, bArr3[i30], cArr, i85);
                                                                        i85++;
                                                                        z8 = z8;
                                                                    } else if (b7 >= -16) {
                                                                        z6 = z8 ? 1 : 0;
                                                                        if (i30 >= i84 - 2) {
                                                                            throw B0.c();
                                                                        }
                                                                        byte b10 = bArr3[i30];
                                                                        int i86 = iH4 + 3;
                                                                        byte b11 = bArr3[iH4 + 2];
                                                                        iH4 += 4;
                                                                        I1.a(b7, b10, b11, bArr3[i86], cArr, i85);
                                                                        i85 += 2;
                                                                        i82 = i31;
                                                                        z8 = z6 ? 1 : 0;
                                                                    } else {
                                                                        if (i30 >= i84 - 1) {
                                                                            throw B0.c();
                                                                        }
                                                                        int i87 = iH4 + 2;
                                                                        byte b12 = bArr3[i30];
                                                                        boolean z9 = z8 ? 1 : 0;
                                                                        iH4 += 3;
                                                                        I1.b(b7, b12, bArr3[i87], cArr, i85);
                                                                        i85++;
                                                                        z8 = z9 ? 1 : 0;
                                                                    }
                                                                    i82 = i31;
                                                                }
                                                            }
                                                            i29 = i82;
                                                            i25 = z8 ? 1 : 0;
                                                            i26 = 3;
                                                            i28 = 0;
                                                            d9.f15041c = new String(cArr, 0, i85);
                                                            iH4 = i84;
                                                        }
                                                    }
                                                }
                                                while (true) {
                                                    while (iH4 < i84) {
                                                    }
                                                    i29 = i82;
                                                    i25 = z8 ? 1 : 0;
                                                    i26 = 3;
                                                    i28 = 0;
                                                    d9.f15041c = new String(cArr, 0, i85);
                                                    iH4 = i84;
                                                    byte b102 = bArr3[i30];
                                                    int i862 = iH4 + 3;
                                                    byte b112 = bArr3[iH4 + 2];
                                                    iH4 += 4;
                                                    I1.a(b7, b102, b112, bArr3[i862], cArr, i85);
                                                    i85 += 2;
                                                    i82 = i31;
                                                    z8 = z6 ? 1 : 0;
                                                }
                                            }
                                            i68 = i29;
                                            iL = iH4;
                                        } else {
                                            i28 = 0;
                                            i25 = z8 ? 1 : 0;
                                            i26 = 3;
                                            int iH5 = E.h(bArr3, i27, d9);
                                            int i88 = d9.f15039a;
                                            if (i88 < 0) {
                                                throw B0.d();
                                            }
                                            int i89 = i68 | i78;
                                            if (i88 == 0) {
                                                d9.f15041c = "";
                                            } else {
                                                d9.f15041c = new String(bArr3, iH5, i88, AbstractC1353z0.f15322b);
                                                iH5 += i88;
                                            }
                                            iL = iH5;
                                            i68 = i89;
                                        }
                                        unsafe2.putObject(obj3, j13, d9.f15041c);
                                        i61 = i8;
                                        i62 = i9;
                                        i63 = i26;
                                        i69 = i25;
                                        i65 = i17;
                                        i66 = i23;
                                        Unsafe unsafe622 = unsafe2;
                                        i64 = i28;
                                        d12 = d9;
                                        i67 = i24;
                                        unsafe5 = unsafe622;
                                    } else {
                                        i25 = z8 ? 1 : 0;
                                        i26 = 3;
                                        i18 = 0;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case ConnectionResult.SERVICE_INVALID /* 9 */:
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    i17 = -1;
                                    i32 = i76 == true ? 1 : 0;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 2) {
                                        i68 |= i78;
                                        Object objM = z07.M(obj3, i24);
                                        i61 = i8;
                                        int iM = E.m(objM, z07.K(i24), bArr, i71, i61, d7);
                                        z07.o(obj3, i24, objM);
                                        i62 = i9;
                                        iL = iM;
                                        d12 = d9;
                                        i69 = i32;
                                        i67 = i24;
                                        i65 = i17;
                                        i66 = i23;
                                        i63 = 3;
                                        unsafe5 = unsafe2;
                                        i64 = 0;
                                    } else {
                                        i27 = i71;
                                        i25 = i32;
                                        i26 = 3;
                                        i18 = 0;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 10:
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    i17 = -1;
                                    i32 = i76 == true ? 1 : 0;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 2) {
                                        i68 |= i78;
                                        iL = E.a(bArr3, i71, d9);
                                        unsafe2.putObject(obj3, j13, d9.f15041c);
                                        i61 = i8;
                                        i62 = i9;
                                        d12 = d9;
                                        i69 = i32;
                                        i67 = i24;
                                        i65 = i17;
                                        i66 = i23;
                                        i63 = 3;
                                        unsafe5 = unsafe2;
                                        i64 = 0;
                                    } else {
                                        i27 = i71;
                                        i25 = i32;
                                        i26 = 3;
                                        i18 = 0;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 12:
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    j8 = j13;
                                    i17 = -1;
                                    i32 = i76 == true ? 1 : 0;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 0) {
                                        iL = E.h(bArr3, i71, d9);
                                        iA = d9.f15039a;
                                        InterfaceC1341v0 interfaceC1341v0J = z07.J(i24);
                                        if ((i75 & Integer.MIN_VALUE) == 0 || interfaceC1341v0J == null || interfaceC1341v0J.d(iA)) {
                                            i68 |= i78;
                                            unsafe2.putInt(obj3, j8, iA);
                                            i61 = i8;
                                            i62 = i9;
                                            d12 = d9;
                                            i69 = i32;
                                            i67 = i24;
                                            i65 = i17;
                                            i66 = i23;
                                            i63 = 3;
                                            unsafe5 = unsafe2;
                                            i64 = 0;
                                        } else {
                                            z(obj).j(i32 == true ? 1 : 0, Long.valueOf(iA));
                                            i61 = i8;
                                            i62 = i9;
                                            d12 = d9;
                                            i69 = i32;
                                            i67 = i24;
                                            i65 = i17;
                                            i66 = i23;
                                            i63 = 3;
                                            unsafe5 = unsafe2;
                                            i64 = 0;
                                        }
                                    } else {
                                        i27 = i71;
                                        i25 = i32;
                                        i26 = 3;
                                        i18 = 0;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 15:
                                    i23 = i73;
                                    unsafe2 = unsafe5;
                                    i17 = -1;
                                    i32 = i76 == true ? 1 : 0;
                                    i24 = i15;
                                    d9 = d12;
                                    if (i74 == 0) {
                                        i68 |= i78;
                                        iL = E.h(bArr3, i71, d9);
                                        iA = W.a(d9.f15039a);
                                        j8 = j13;
                                        unsafe2.putInt(obj3, j8, iA);
                                        i61 = i8;
                                        i62 = i9;
                                        d12 = d9;
                                        i69 = i32;
                                        i67 = i24;
                                        i65 = i17;
                                        i66 = i23;
                                        i63 = 3;
                                        unsafe5 = unsafe2;
                                        i64 = 0;
                                    } else {
                                        i27 = i71;
                                        i25 = i32;
                                        i26 = 3;
                                        i18 = 0;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                case 16:
                                    i23 = i73;
                                    Unsafe unsafe7 = unsafe5;
                                    i17 = -1;
                                    i24 = i15;
                                    if (i74 == 0) {
                                        i68 |= i78;
                                        iL = E.k(bArr3, i71, d12);
                                        unsafe2 = unsafe7;
                                        unsafe7.putLong(obj, j13, W.b(d12.f15040b));
                                        i61 = i8;
                                        i62 = i9;
                                        i69 = i76 == true ? 1 : 0;
                                        d12 = d12;
                                        i67 = i24;
                                        i65 = i17;
                                        i66 = i23;
                                        i63 = 3;
                                        unsafe5 = unsafe2;
                                        i64 = 0;
                                    } else {
                                        unsafe2 = unsafe7;
                                        d9 = d12;
                                        i26 = 3;
                                        i25 = i76 == true ? 1 : 0;
                                        i18 = 0;
                                        i27 = i71;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                                default:
                                    i63 = 3;
                                    if (i74 == 3) {
                                        i68 |= i78;
                                        Object objM2 = z07.M(obj3, i15);
                                        int i90 = i15;
                                        iL = E.l(objM2, z07.K(i15), bArr, i71, i8, (i73 << 3) | 4, d7);
                                        z07.o(obj3, i90, objM2);
                                        i67 = i90;
                                        unsafe5 = unsafe5;
                                        i69 = i76 == true ? 1 : 0;
                                        i65 = -1;
                                        i66 = i73;
                                        i64 = 0;
                                        i61 = i8;
                                        i62 = i9;
                                    } else {
                                        i23 = i73;
                                        Unsafe unsafe8 = unsafe5;
                                        i17 = -1;
                                        i24 = i15;
                                        i25 = i76 == true ? 1 : 0;
                                        d9 = d12;
                                        i26 = 3;
                                        unsafe2 = unsafe8;
                                        i18 = 0;
                                        i27 = i71;
                                        i10 = i9;
                                        z03 = z07;
                                        iJ = i27;
                                        d8 = d9;
                                        unsafe = unsafe2;
                                        i67 = i24;
                                        bArr2 = bArr3;
                                        i19 = i68;
                                        i13 = i25;
                                        i16 = i23;
                                        i20 = i26;
                                    }
                                    break;
                            }
                        } else {
                            int i91 = i73;
                            Unsafe unsafe9 = unsafe5;
                            i17 = -1;
                            i18 = 0;
                            int i92 = i15;
                            D d13 = d12;
                            int i93 = i71;
                            int i94 = i70;
                            int i95 = i68;
                            if (iG2 != 27) {
                                i33 = i94;
                                if (iG2 <= 49) {
                                    long j14 = i75;
                                    Unsafe unsafe10 = f15122p;
                                    InterfaceC1350y0 interfaceC1350y0 = (InterfaceC1350y0) unsafe10.getObject(obj3, j13);
                                    if (interfaceC1350y0.zzc()) {
                                        i37 = i93;
                                    } else {
                                        int size = interfaceC1350y0.size();
                                        i37 = i93;
                                        InterfaceC1350y0 interfaceC1350y0G = interfaceC1350y0.g(size != 0 ? size + size : 10);
                                        unsafe10.putObject(obj3, j13, interfaceC1350y0G);
                                        interfaceC1350y0 = interfaceC1350y0G;
                                    }
                                    switch (iG2) {
                                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                        case 35:
                                            i38 = i8;
                                            d11 = d13;
                                            unsafe = unsafe9;
                                            i39 = i37;
                                            i40 = 3;
                                            i41 = i92;
                                            i42 = i91;
                                            z06 = z07;
                                            i43 = i76 == true ? 1 : 0;
                                            if (i74 == 2) {
                                                androidx.appcompat.app.y.a(interfaceC1350y0);
                                                iH = E.h(bArr3, i39, d11);
                                                int i96 = d11.f15039a + iH;
                                                if (iH < i96) {
                                                    Double.longBitsToDouble(E.n(bArr3, iH));
                                                    throw null;
                                                }
                                                if (iH != i96) {
                                                    throw B0.g();
                                                }
                                                iJ = iH;
                                                z7 = true;
                                                if (iJ != i39) {
                                                    i62 = i9;
                                                    i69 = i43;
                                                    z07 = z06;
                                                    i61 = i38;
                                                    i63 = i40;
                                                    i66 = i42;
                                                    i67 = i41;
                                                    i68 = i95;
                                                    i70 = i33;
                                                    i65 = -1;
                                                    i64 = 0;
                                                    unsafe5 = unsafe;
                                                    iL = iJ;
                                                    d12 = d11;
                                                    obj3 = obj;
                                                } else {
                                                    i10 = i9;
                                                    i13 = i43;
                                                    z03 = z06;
                                                    d8 = d11;
                                                    i20 = i40;
                                                    i16 = i42;
                                                    i67 = i41;
                                                    bArr2 = bArr3;
                                                    i19 = i95;
                                                    i70 = i33;
                                                    obj3 = obj;
                                                }
                                                break;
                                            } else {
                                                z7 = true;
                                                if (i74 == 1) {
                                                    androidx.appcompat.app.y.a(interfaceC1350y0);
                                                    Double.longBitsToDouble(E.n(bArr3, i39));
                                                    throw null;
                                                }
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                        case 19:
                                        case 36:
                                            i38 = i8;
                                            d11 = d13;
                                            unsafe = unsafe9;
                                            i39 = i37;
                                            i40 = 3;
                                            i41 = i92;
                                            i42 = i91;
                                            z06 = z07;
                                            i43 = i76 == true ? 1 : 0;
                                            if (i74 == 2) {
                                                androidx.appcompat.app.y.a(interfaceC1350y0);
                                                iH = E.h(bArr3, i39, d11);
                                                int i97 = d11.f15039a + iH;
                                                if (iH < i97) {
                                                    Float.intBitsToFloat(E.b(bArr3, iH));
                                                    throw null;
                                                }
                                                if (iH != i97) {
                                                    throw B0.g();
                                                }
                                                iJ = iH;
                                                z7 = true;
                                                if (iJ != i39) {
                                                }
                                            } else {
                                                if (i74 == 5) {
                                                    androidx.appcompat.app.y.a(interfaceC1350y0);
                                                    Float.intBitsToFloat(E.b(bArr3, i39));
                                                    throw null;
                                                }
                                                z7 = true;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                        case 20:
                                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                        case 37:
                                        case 38:
                                            i38 = i8;
                                            d11 = d13;
                                            unsafe = unsafe9;
                                            i39 = i37;
                                            i40 = 3;
                                            i41 = i92;
                                            i42 = i91;
                                            z06 = z07;
                                            i43 = i76 == true ? 1 : 0;
                                            if (i74 == 2) {
                                                androidx.appcompat.app.y.a(interfaceC1350y0);
                                                iH = E.h(bArr3, i39, d11);
                                                int i98 = d11.f15039a + iH;
                                                if (iH < i98) {
                                                    E.k(bArr3, iH, d11);
                                                    throw null;
                                                }
                                                if (iH != i98) {
                                                    throw B0.g();
                                                }
                                                iJ = iH;
                                                z7 = true;
                                                if (iJ != i39) {
                                                }
                                            } else {
                                                if (i74 == 0) {
                                                    androidx.appcompat.app.y.a(interfaceC1350y0);
                                                    E.k(bArr3, i39, d11);
                                                    long j15 = d11.f15040b;
                                                    throw null;
                                                }
                                                z7 = true;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                        case 22:
                                        case 29:
                                        case 39:
                                        case 43:
                                            i44 = i8;
                                            i43 = i76 == true ? 1 : 0;
                                            d11 = d13;
                                            unsafe = unsafe9;
                                            i45 = i37;
                                            i46 = i91;
                                            z7 = true;
                                            i47 = 3;
                                            i41 = i92;
                                            if (i74 == 2) {
                                                iJ = E.f(bArr3, i45, interfaceC1350y0, d11);
                                                i42 = i46;
                                                i38 = i44;
                                                i40 = 3;
                                                i39 = i45;
                                                z06 = this;
                                                if (iJ != i39) {
                                                }
                                            } else {
                                                if (i74 == 0) {
                                                    i42 = i46;
                                                    i38 = i44;
                                                    i40 = 3;
                                                    i39 = i45;
                                                    iJ = E.j(i43 == true ? 1 : 0, bArr, i45, i8, interfaceC1350y0, d7);
                                                    z06 = this;
                                                    z7 = true;
                                                    if (iJ != i39) {
                                                    }
                                                }
                                                i42 = i46;
                                                i38 = i44;
                                                i40 = i47;
                                                i39 = i45;
                                                z06 = this;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                        case ConnectionResult.API_DISABLED /* 23 */:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i44 = i8;
                                            i43 = i76 == true ? 1 : 0;
                                            d11 = d13;
                                            unsafe = unsafe9;
                                            i45 = i37;
                                            i46 = i91;
                                            i47 = 3;
                                            i41 = i92;
                                            if (i74 == 2) {
                                                androidx.appcompat.app.y.a(interfaceC1350y0);
                                                iH2 = E.h(bArr3, i45, d11);
                                                int i99 = d11.f15039a + iH2;
                                                if (iH2 < i99) {
                                                    E.n(bArr3, iH2);
                                                    throw null;
                                                }
                                                if (iH2 != i99) {
                                                    throw B0.g();
                                                }
                                                i42 = i46;
                                                iJ = iH2;
                                                i38 = i44;
                                                i40 = i47;
                                                i39 = i45;
                                                z7 = true;
                                                z06 = this;
                                                if (iJ != i39) {
                                                }
                                            } else {
                                                z7 = true;
                                                if (i74 == 1) {
                                                    androidx.appcompat.app.y.a(interfaceC1350y0);
                                                    E.n(bArr3, i45);
                                                    throw null;
                                                }
                                                i42 = i46;
                                                i38 = i44;
                                                i40 = i47;
                                                i39 = i45;
                                                z06 = this;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                        case 31:
                                        case 41:
                                        case 45:
                                            i44 = i8;
                                            i43 = i76 == true ? 1 : 0;
                                            d11 = d13;
                                            unsafe = unsafe9;
                                            i45 = i37;
                                            i46 = i91;
                                            i47 = 3;
                                            i41 = i92;
                                            if (i74 == 2) {
                                                C1332s0 c1332s0 = (C1332s0) interfaceC1350y0;
                                                iH2 = E.h(bArr3, i45, d11);
                                                int i100 = d11.f15039a + iH2;
                                                while (iH2 < i100) {
                                                    c1332s0.i(E.b(bArr3, iH2));
                                                    iH2 += 4;
                                                }
                                                if (iH2 != i100) {
                                                    throw B0.g();
                                                }
                                            } else {
                                                if (i74 == 5) {
                                                    iH2 = i45 + 4;
                                                    C1332s0 c1332s02 = (C1332s0) interfaceC1350y0;
                                                    c1332s02.i(E.b(bArr3, i45));
                                                    while (iH2 < i44) {
                                                        int iH6 = E.h(bArr3, iH2, d11);
                                                        if (i43 == d11.f15039a) {
                                                            c1332s02.i(E.b(bArr3, iH6));
                                                            iH2 = iH6 + 4;
                                                        }
                                                    }
                                                }
                                                i42 = i46;
                                                i38 = i44;
                                                i40 = i47;
                                                i39 = i45;
                                                z7 = true;
                                                z06 = this;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            i42 = i46;
                                            iJ = iH2;
                                            i38 = i44;
                                            i40 = i47;
                                            i39 = i45;
                                            z7 = true;
                                            z06 = this;
                                            if (iJ != i39) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i44 = i8;
                                            i43 = i76 == true ? 1 : 0;
                                            d11 = d13;
                                            unsafe = unsafe9;
                                            i45 = i37;
                                            i46 = i91;
                                            i47 = 3;
                                            i41 = i92;
                                            if (i74 == 2) {
                                                androidx.appcompat.app.y.a(interfaceC1350y0);
                                                iH2 = E.h(bArr3, i45, d11);
                                                int i101 = d11.f15039a + iH2;
                                                if (iH2 < i101) {
                                                    E.k(bArr3, iH2, d11);
                                                    throw null;
                                                }
                                                if (iH2 != i101) {
                                                    throw B0.g();
                                                }
                                                i42 = i46;
                                                iJ = iH2;
                                                i38 = i44;
                                                i40 = i47;
                                                i39 = i45;
                                                z7 = true;
                                                z06 = this;
                                                if (iJ != i39) {
                                                }
                                            } else {
                                                if (i74 == 0) {
                                                    androidx.appcompat.app.y.a(interfaceC1350y0);
                                                    E.k(bArr3, i45, d11);
                                                    long j16 = d11.f15040b;
                                                    throw null;
                                                }
                                                i42 = i46;
                                                i38 = i44;
                                                i40 = i47;
                                                i39 = i45;
                                                z7 = true;
                                                z06 = this;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                        case 26:
                                            i44 = i8;
                                            i43 = i76 == true ? 1 : 0;
                                            InterfaceC1350y0 interfaceC1350y02 = interfaceC1350y0;
                                            d11 = d13;
                                            unsafe = unsafe9;
                                            i45 = i37;
                                            i46 = i91;
                                            i47 = 3;
                                            i41 = i92;
                                            if (i74 == 2) {
                                                if ((j14 & 536870912) == 0) {
                                                    iJ = E.h(bArr3, i45, d11);
                                                    int i102 = d11.f15039a;
                                                    if (i102 < 0) {
                                                        throw B0.d();
                                                    }
                                                    if (i102 == 0) {
                                                        interfaceC1350y02.add("");
                                                    } else {
                                                        interfaceC1350y02.add(new String(bArr3, iJ, i102, AbstractC1353z0.f15322b));
                                                        iJ += i102;
                                                    }
                                                    while (iJ < i44) {
                                                        int iH7 = E.h(bArr3, iJ, d11);
                                                        if (i43 == d11.f15039a) {
                                                            iJ = E.h(bArr3, iH7, d11);
                                                            int i103 = d11.f15039a;
                                                            if (i103 < 0) {
                                                                throw B0.d();
                                                            }
                                                            if (i103 == 0) {
                                                                interfaceC1350y02.add("");
                                                                while (iJ < i44) {
                                                                }
                                                            } else {
                                                                interfaceC1350y02.add(new String(bArr3, iJ, i103, AbstractC1353z0.f15322b));
                                                                iJ += i103;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iJ = E.h(bArr3, i45, d11);
                                                    int i104 = d11.f15039a;
                                                    if (i104 < 0) {
                                                        throw B0.d();
                                                    }
                                                    if (i104 == 0) {
                                                        interfaceC1350y02.add("");
                                                    } else {
                                                        int i105 = iJ + i104;
                                                        if (!M1.e(bArr3, iJ, i105)) {
                                                            throw B0.c();
                                                        }
                                                        interfaceC1350y02.add(new String(bArr3, iJ, i104, AbstractC1353z0.f15322b));
                                                        iJ = i105;
                                                    }
                                                    while (iJ < i44) {
                                                        int iH8 = E.h(bArr3, iJ, d11);
                                                        if (i43 == d11.f15039a) {
                                                            iJ = E.h(bArr3, iH8, d11);
                                                            int i106 = d11.f15039a;
                                                            if (i106 < 0) {
                                                                throw B0.d();
                                                            }
                                                            if (i106 == 0) {
                                                                interfaceC1350y02.add("");
                                                                while (iJ < i44) {
                                                                }
                                                            } else {
                                                                int i107 = iJ + i106;
                                                                if (!M1.e(bArr3, iJ, i107)) {
                                                                    throw B0.c();
                                                                }
                                                                interfaceC1350y02.add(new String(bArr3, iJ, i106, AbstractC1353z0.f15322b));
                                                                iJ = i107;
                                                            }
                                                        }
                                                    }
                                                }
                                                i42 = i46;
                                                i38 = i44;
                                                i40 = i47;
                                                i39 = i45;
                                                z7 = true;
                                                z06 = this;
                                                if (iJ != i39) {
                                                }
                                            }
                                            i42 = i46;
                                            i38 = i44;
                                            i40 = i47;
                                            i39 = i45;
                                            z7 = true;
                                            z06 = this;
                                            iJ = i39;
                                            if (iJ != i39) {
                                            }
                                            break;
                                        case 27:
                                            int i108 = i37;
                                            i48 = i91;
                                            if (i74 == 2) {
                                                InterfaceC1293h1 interfaceC1293h1K = K(i92);
                                                i43 = i76 == true ? 1 : 0;
                                                d11 = d13;
                                                unsafe = unsafe9;
                                                int iE = E.e(interfaceC1293h1K, i76 == true ? 1 : 0, bArr, i108, i8, interfaceC1350y0, d7);
                                                i42 = i48;
                                                i41 = i92;
                                                i40 = 3;
                                                i39 = i108;
                                                iJ = iE;
                                                z7 = true;
                                                z06 = this;
                                                i38 = i8;
                                                if (iJ != i39) {
                                                }
                                            } else {
                                                unsafe = unsafe9;
                                                i43 = i76 == true ? 1 : 0;
                                                d11 = d13;
                                                i38 = i8;
                                                i39 = i108;
                                                z7 = true;
                                                i40 = 3;
                                                i41 = i92;
                                                i42 = i48;
                                                z06 = this;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            int i109 = i37;
                                            i48 = i91;
                                            if (i74 == 2) {
                                                int iH9 = E.h(bArr3, i109, d13);
                                                int i110 = d13.f15039a;
                                                if (i110 < 0) {
                                                    throw B0.d();
                                                }
                                                if (i110 > bArr3.length - iH9) {
                                                    throw B0.g();
                                                }
                                            } else {
                                                unsafe = unsafe9;
                                                i38 = i8;
                                                d11 = d13;
                                                i39 = i109;
                                                z7 = true;
                                                i43 = i76 == true ? 1 : 0;
                                                i41 = i92;
                                                i40 = 3;
                                                i42 = i48;
                                                z06 = this;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i49 = i8;
                                            i50 = i76 == true ? 1 : 0;
                                            i51 = i37;
                                            if (i74 == 2) {
                                                iJ2 = E.f(bArr3, i51, interfaceC1350y0, d13);
                                            } else if (i74 == 0) {
                                                iJ2 = E.j(i50 == true ? 1 : 0, bArr, i51, i8, interfaceC1350y0, d7);
                                            } else {
                                                z06 = this;
                                                unsafe = unsafe9;
                                                i38 = i49;
                                                i43 = i50;
                                                d11 = d13;
                                                i39 = i51;
                                                z7 = true;
                                                i40 = 3;
                                                i41 = i92;
                                                i42 = i91;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            InterfaceC1341v0 interfaceC1341v0J2 = z07.J(i92);
                                            AbstractC1348x1 abstractC1348x1 = z07.f15133k;
                                            int i111 = AbstractC1301j1.f15205d;
                                            if (interfaceC1341v0J2 == null) {
                                                i52 = iJ2;
                                                i48 = i91;
                                            } else if (interfaceC1350y0 instanceof RandomAccess) {
                                                int size2 = interfaceC1350y0.size();
                                                Object objV = null;
                                                int i112 = 0;
                                                int i113 = 0;
                                                while (i112 < size2) {
                                                    int i114 = iJ2;
                                                    Integer num = (Integer) interfaceC1350y0.get(i112);
                                                    int iIntValue = num.intValue();
                                                    if (interfaceC1341v0J2.d(iIntValue)) {
                                                        if (i112 != i113) {
                                                            interfaceC1350y0.set(i113, num);
                                                        }
                                                        i113++;
                                                        i54 = 1;
                                                        i53 = i91;
                                                    } else {
                                                        i53 = i91;
                                                        objV = AbstractC1301j1.v(obj3, i53, iIntValue, objV, abstractC1348x1);
                                                        i54 = 1;
                                                    }
                                                    i112 += i54;
                                                    i91 = i53;
                                                    iJ2 = i114;
                                                }
                                                i52 = iJ2;
                                                i48 = i91;
                                                if (i113 != size2) {
                                                    interfaceC1350y0.subList(i113, size2).clear();
                                                }
                                            } else {
                                                i52 = iJ2;
                                                i48 = i91;
                                                Iterator it = interfaceC1350y0.iterator();
                                                Object objV2 = null;
                                                while (it.hasNext()) {
                                                    int iIntValue2 = ((Integer) it.next()).intValue();
                                                    if (!interfaceC1341v0J2.d(iIntValue2)) {
                                                        objV2 = AbstractC1301j1.v(obj3, i48, iIntValue2, objV2, abstractC1348x1);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            unsafe = unsafe9;
                                            i38 = i49;
                                            i43 = i50 == true ? 1 : 0;
                                            d11 = d13;
                                            i39 = i51;
                                            iJ = i52;
                                            z7 = true;
                                            i40 = 3;
                                            i41 = i92;
                                            i42 = i48;
                                            z06 = this;
                                            if (iJ != i39) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i49 = i8;
                                            i50 = i76 == true ? 1 : 0;
                                            unsafe4 = unsafe9;
                                            i51 = i37;
                                            if (i74 == 2) {
                                                C1332s0 c1332s03 = (C1332s0) interfaceC1350y0;
                                                iH3 = E.h(bArr3, i51, d13);
                                                int i115 = d13.f15039a + iH3;
                                                while (iH3 < i115) {
                                                    iH3 = E.h(bArr3, iH3, d13);
                                                    c1332s03.i(W.a(d13.f15039a));
                                                }
                                                if (iH3 != i115) {
                                                    throw B0.g();
                                                }
                                            } else {
                                                if (i74 == 0) {
                                                    C1332s0 c1332s04 = (C1332s0) interfaceC1350y0;
                                                    iH3 = E.h(bArr3, i51, d13);
                                                    while (true) {
                                                        c1332s04.i(W.a(d13.f15039a));
                                                        if (iH3 < i49) {
                                                            int iH10 = E.h(bArr3, iH3, d13);
                                                            if (i50 == d13.f15039a) {
                                                                iH3 = E.h(bArr3, iH10, d13);
                                                            }
                                                        }
                                                    }
                                                }
                                                unsafe = unsafe4;
                                                z06 = z07;
                                                i38 = i49;
                                                i43 = i50;
                                                d11 = d13;
                                                i39 = i51;
                                                z7 = true;
                                                i40 = 3;
                                                i41 = i92;
                                                i42 = i91;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            unsafe = unsafe4;
                                            iJ = iH3;
                                            i38 = i49;
                                            d11 = d13;
                                            i39 = i51;
                                            z7 = true;
                                            z06 = z07;
                                            i43 = i50;
                                            i41 = i92;
                                            i42 = i91;
                                            i40 = 3;
                                            if (iJ != i39) {
                                            }
                                            break;
                                        case 34:
                                        case 48:
                                            i49 = i8;
                                            i50 = i76 == true ? 1 : 0;
                                            unsafe4 = unsafe9;
                                            i51 = i37;
                                            if (i74 == 2) {
                                                androidx.appcompat.app.y.a(interfaceC1350y0);
                                                iH3 = E.h(bArr3, i51, d13);
                                                int i116 = d13.f15039a + iH3;
                                                if (iH3 < i116) {
                                                    E.k(bArr3, iH3, d13);
                                                    W.b(d13.f15040b);
                                                    throw null;
                                                }
                                                if (iH3 != i116) {
                                                    throw B0.g();
                                                }
                                                unsafe = unsafe4;
                                                iJ = iH3;
                                                i38 = i49;
                                                d11 = d13;
                                                i39 = i51;
                                                z7 = true;
                                                z06 = z07;
                                                i43 = i50;
                                                i41 = i92;
                                                i42 = i91;
                                                i40 = 3;
                                                if (iJ != i39) {
                                                }
                                            } else {
                                                if (i74 == 0) {
                                                    androidx.appcompat.app.y.a(interfaceC1350y0);
                                                    E.k(bArr3, i51, d13);
                                                    W.b(d13.f15040b);
                                                    throw null;
                                                }
                                                unsafe = unsafe4;
                                                z06 = z07;
                                                i38 = i49;
                                                i43 = i50;
                                                d11 = d13;
                                                i39 = i51;
                                                z7 = true;
                                                i40 = 3;
                                                i41 = i92;
                                                i42 = i91;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                        default:
                                            i40 = 3;
                                            if (i74 == 3) {
                                                int i117 = ((i76 == true ? 1 : 0) & (-8)) | 4;
                                                InterfaceC1293h1 interfaceC1293h1K2 = z07.K(i92);
                                                int i118 = i37;
                                                unsafe4 = unsafe9;
                                                i51 = i118;
                                                i50 = i76 == true ? 1 : 0;
                                                iH3 = E.c(interfaceC1293h1K2, bArr, i118, i8, i117, d7);
                                                interfaceC1350y0.add(d13.f15041c);
                                                int i119 = i8;
                                                while (iH3 < i119) {
                                                    int iH11 = E.h(bArr3, iH3, d13);
                                                    if (i50 == d13.f15039a) {
                                                        iH3 = E.c(interfaceC1293h1K2, bArr, iH11, i8, i117, d7);
                                                        interfaceC1350y0.add(d13.f15041c);
                                                        i119 = i119;
                                                        interfaceC1293h1K2 = interfaceC1293h1K2;
                                                    } else {
                                                        i49 = i119;
                                                        unsafe = unsafe4;
                                                        iJ = iH3;
                                                        i38 = i49;
                                                        d11 = d13;
                                                        i39 = i51;
                                                        z7 = true;
                                                        z06 = z07;
                                                        i43 = i50;
                                                        i41 = i92;
                                                        i42 = i91;
                                                        i40 = 3;
                                                        if (iJ != i39) {
                                                        }
                                                    }
                                                }
                                                i49 = i119;
                                                unsafe = unsafe4;
                                                iJ = iH3;
                                                i38 = i49;
                                                d11 = d13;
                                                i39 = i51;
                                                z7 = true;
                                                z06 = z07;
                                                i43 = i50;
                                                i41 = i92;
                                                i42 = i91;
                                                i40 = 3;
                                                if (iJ != i39) {
                                                }
                                            } else {
                                                unsafe = unsafe9;
                                                i38 = i8;
                                                i41 = i92;
                                                d11 = d13;
                                                i39 = i37;
                                                i42 = i91;
                                                z7 = true;
                                                z06 = z07;
                                                i43 = i76 == true ? 1 : 0;
                                                iJ = i39;
                                                if (iJ != i39) {
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    unsafe = unsafe9;
                                    i92 = i92;
                                    i36 = i91;
                                    z05 = z07;
                                    i35 = i76 == true ? 1 : 0;
                                    i34 = i93;
                                    if (iG2 != 50) {
                                        obj3 = obj;
                                        Unsafe unsafe11 = f15122p;
                                        long j17 = iArr[i92 + 2] & 1048575;
                                        switch (iG2) {
                                            case 51:
                                                i55 = i92;
                                                bArr2 = bArr3;
                                                j9 = j13;
                                                i20 = 3;
                                                i13 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                z03 = z05;
                                                d8 = d7;
                                                i16 = i36;
                                                j10 = j17;
                                                if (i74 == 1) {
                                                    iJ = i56 + 8;
                                                    objValueOf = Double.valueOf(Double.longBitsToDouble(E.n(bArr2, i56)));
                                                    unsafe11.putObject(obj3, j9, objValueOf);
                                                    unsafe11.putInt(obj3, j10, i16);
                                                    if (iJ == i56) {
                                                        i66 = i16;
                                                        z07 = z03;
                                                        bArr3 = bArr2;
                                                        i63 = i20;
                                                        i67 = i55;
                                                        i65 = -1;
                                                        i64 = 0;
                                                        unsafe5 = unsafe;
                                                        i62 = i9;
                                                        i69 = i13 == true ? 1 : 0;
                                                        iL = iJ;
                                                        d12 = d8;
                                                        i68 = i95;
                                                        i70 = i33;
                                                        i61 = i8;
                                                    } else {
                                                        i10 = i9;
                                                        i19 = i95;
                                                        i67 = i55;
                                                        i70 = i33;
                                                    }
                                                }
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 52:
                                                i55 = i92;
                                                bArr2 = bArr3;
                                                j9 = j13;
                                                i20 = 3;
                                                i13 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                z03 = z05;
                                                d8 = d7;
                                                i16 = i36;
                                                j10 = j17;
                                                if (i74 == 5) {
                                                    iJ = i56 + 4;
                                                    objValueOf = Float.valueOf(Float.intBitsToFloat(E.b(bArr2, i56)));
                                                    unsafe11.putObject(obj3, j9, objValueOf);
                                                    unsafe11.putInt(obj3, j10, i16);
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 53:
                                            case 54:
                                                i55 = i92;
                                                bArr2 = bArr3;
                                                j9 = j13;
                                                i20 = 3;
                                                i13 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                z03 = z05;
                                                d8 = d7;
                                                i16 = i36;
                                                j10 = j17;
                                                if (i74 == 0) {
                                                    iJ = E.k(bArr2, i56, d8);
                                                    jN2 = d8.f15040b;
                                                    objValueOf = Long.valueOf(jN2);
                                                    unsafe11.putObject(obj3, j9, objValueOf);
                                                    unsafe11.putInt(obj3, j10, i16);
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 55:
                                            case 62:
                                                i55 = i92;
                                                bArr2 = bArr3;
                                                j9 = j13;
                                                i20 = 3;
                                                i13 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                z03 = z05;
                                                d8 = d7;
                                                i16 = i36;
                                                j10 = j17;
                                                if (i74 == 0) {
                                                    iJ = E.h(bArr2, i56, d8);
                                                    iB = d8.f15039a;
                                                    objValueOf = Integer.valueOf(iB);
                                                    unsafe11.putObject(obj3, j9, objValueOf);
                                                    unsafe11.putInt(obj3, j10, i16);
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i55 = i92;
                                                bArr2 = bArr3;
                                                j9 = j13;
                                                i20 = 3;
                                                i13 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                z03 = z05;
                                                d8 = d7;
                                                i16 = i36;
                                                j10 = j17;
                                                if (i74 == 1) {
                                                    iJ = i56 + 8;
                                                    jN2 = E.n(bArr2, i56);
                                                    objValueOf = Long.valueOf(jN2);
                                                    unsafe11.putObject(obj3, j9, objValueOf);
                                                    unsafe11.putInt(obj3, j10, i16);
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i55 = i92;
                                                bArr2 = bArr3;
                                                j9 = j13;
                                                i20 = 3;
                                                i13 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                z03 = z05;
                                                d8 = d7;
                                                i16 = i36;
                                                j10 = j17;
                                                if (i74 == 5) {
                                                    iJ = i56 + 4;
                                                    iB = E.b(bArr2, i56);
                                                    objValueOf = Integer.valueOf(iB);
                                                    unsafe11.putObject(obj3, j9, objValueOf);
                                                    unsafe11.putInt(obj3, j10, i16);
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 58:
                                                i55 = i92;
                                                bArr2 = bArr3;
                                                j9 = j13;
                                                i20 = 3;
                                                i13 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                z03 = z05;
                                                d8 = d7;
                                                i16 = i36;
                                                j10 = j17;
                                                if (i74 == 0) {
                                                    iJ = E.k(bArr2, i56, d8);
                                                    objValueOf = Boolean.valueOf(d8.f15040b != 0);
                                                    unsafe11.putObject(obj3, j9, objValueOf);
                                                    unsafe11.putInt(obj3, j10, i16);
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 59:
                                                bArr2 = bArr3;
                                                i20 = 3;
                                                i13 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                z03 = z05;
                                                d8 = d7;
                                                i16 = i36;
                                                j10 = j17;
                                                if (i74 == 2) {
                                                    iJ = E.h(bArr2, i56, d8);
                                                    int i120 = d8.f15039a;
                                                    if (i120 == 0) {
                                                        unsafe11.putObject(obj3, j13, "");
                                                        i55 = i92;
                                                    } else {
                                                        i55 = i92;
                                                        int i121 = iJ + i120;
                                                        if ((i75 & 536870912) != 0 && !M1.e(bArr2, iJ, i121)) {
                                                            throw B0.c();
                                                        }
                                                        unsafe11.putObject(obj3, j13, new String(bArr2, iJ, i120, AbstractC1353z0.f15322b));
                                                        iJ = i121;
                                                    }
                                                    unsafe11.putInt(obj3, j10, i16);
                                                    if (iJ == i56) {
                                                    }
                                                } else {
                                                    i55 = i92;
                                                    iJ = i56;
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                break;
                                            case 60:
                                                i56 = i34;
                                                bArr2 = bArr3;
                                                if (i74 == 2) {
                                                    Object objN = z05.N(obj3, i36, i92);
                                                    i20 = 3;
                                                    int iM2 = E.m(objN, z05.K(i92), bArr, i56, i8, d7);
                                                    z05.p(obj3, i36, i92, objN);
                                                    i13 = i35 == true ? 1 : 0;
                                                    iJ = iM2;
                                                    i55 = i92;
                                                    z03 = z05;
                                                    d8 = d7;
                                                    i16 = i36;
                                                    if (iJ == i56) {
                                                    }
                                                } else {
                                                    i57 = i35 == true ? 1 : 0;
                                                    i20 = 3;
                                                    z03 = z05;
                                                    i16 = i36;
                                                    i55 = i92;
                                                    d8 = d7;
                                                    i13 = i57;
                                                    iJ = i56;
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                break;
                                            case 61:
                                                i58 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                i59 = i36;
                                                j11 = j17;
                                                i60 = i92;
                                                bArr2 = bArr3;
                                                j12 = j13;
                                                if (i74 == 2) {
                                                    iJ = E.a(bArr2, i56, d7);
                                                    objValueOf2 = d7.f15041c;
                                                    unsafe11.putObject(obj3, j12, objValueOf2);
                                                    unsafe11.putInt(obj3, j11, i59);
                                                    z03 = z05;
                                                    i16 = i59;
                                                    i55 = i60;
                                                    i20 = 3;
                                                    d8 = d7;
                                                    i13 = i58;
                                                    if (iJ == i56) {
                                                    }
                                                } else {
                                                    z03 = z05;
                                                    i16 = i59;
                                                    i55 = i60;
                                                    i20 = 3;
                                                    d8 = d7;
                                                    i13 = i58 == true ? 1 : 0;
                                                    iJ = i56;
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                break;
                                            case 63:
                                                i57 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                i59 = i36;
                                                j11 = j17;
                                                i60 = i92;
                                                bArr2 = bArr3;
                                                j12 = j13;
                                                if (i74 == 0) {
                                                    iJ = E.h(bArr2, i56, d7);
                                                    int i122 = d7.f15039a;
                                                    InterfaceC1341v0 interfaceC1341v0J3 = z05.J(i60);
                                                    if (interfaceC1341v0J3 == null || interfaceC1341v0J3.d(i122)) {
                                                        i58 = i57 == true ? 1 : 0;
                                                        objValueOf2 = Integer.valueOf(i122);
                                                        unsafe11.putObject(obj3, j12, objValueOf2);
                                                        unsafe11.putInt(obj3, j11, i59);
                                                        z03 = z05;
                                                        i16 = i59;
                                                        i55 = i60;
                                                        i20 = 3;
                                                        d8 = d7;
                                                        i13 = i58;
                                                        if (iJ == i56) {
                                                        }
                                                    } else {
                                                        z(obj).j(i57 == true ? 1 : 0, Long.valueOf(i122));
                                                        i58 = i57 == true ? 1 : 0;
                                                        z03 = z05;
                                                        i16 = i59;
                                                        i55 = i60;
                                                        i20 = 3;
                                                        d8 = d7;
                                                        i13 = i58;
                                                        if (iJ == i56) {
                                                        }
                                                    }
                                                }
                                                z03 = z05;
                                                i16 = i59;
                                                i55 = i60;
                                                i20 = 3;
                                                d8 = d7;
                                                i13 = i57;
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 66:
                                                i57 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                i59 = i36;
                                                i60 = i92;
                                                if (i74 == 0) {
                                                    bArr2 = bArr;
                                                    iJ = E.h(bArr2, i56, d7);
                                                    unsafe11.putObject(obj3, j13, Integer.valueOf(W.a(d7.f15039a)));
                                                    unsafe11.putInt(obj3, j17, i59);
                                                    z03 = z05;
                                                    i16 = i59;
                                                    i55 = i60;
                                                    i20 = 3;
                                                    d8 = d7;
                                                    i13 = i57;
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                bArr2 = bArr;
                                                z03 = z05;
                                                i16 = i59;
                                                i55 = i60;
                                                i20 = 3;
                                                d8 = d7;
                                                i13 = i57;
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 67:
                                                i57 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                i59 = i36;
                                                i60 = i92;
                                                if (i74 == 0) {
                                                    iJ = E.k(bArr3, i56, d7);
                                                    unsafe11.putObject(obj3, j13, Long.valueOf(W.b(d7.f15040b)));
                                                    unsafe11.putInt(obj3, j17, i59);
                                                    bArr2 = bArr;
                                                    z03 = z05;
                                                    i16 = i59;
                                                    i55 = i60;
                                                    i20 = 3;
                                                    d8 = d7;
                                                    i13 = i57;
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                bArr2 = bArr;
                                                z03 = z05;
                                                i16 = i59;
                                                i55 = i60;
                                                i20 = 3;
                                                d8 = d7;
                                                i13 = i57;
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                            case 68:
                                                if (i74 == 3) {
                                                    int i123 = ((i35 == true ? 1 : 0) & (-8)) | 4;
                                                    Object objN2 = z05.N(obj3, i36, i92);
                                                    InterfaceC1293h1 interfaceC1293h1K3 = z05.K(i92);
                                                    i57 = i35 == true ? 1 : 0;
                                                    i56 = i34;
                                                    int iL2 = E.l(objN2, interfaceC1293h1K3, bArr, i34, i8, i123, d7);
                                                    z05.p(obj3, i36, i92, objN2);
                                                    z03 = z05;
                                                    i16 = i36;
                                                    i55 = i92;
                                                    iJ = iL2;
                                                    bArr2 = bArr3;
                                                    i20 = 3;
                                                    d8 = d7;
                                                    i13 = i57;
                                                    if (iJ == i56) {
                                                    }
                                                } else {
                                                    i57 = i35 == true ? 1 : 0;
                                                    i56 = i34;
                                                    z03 = z05;
                                                    d8 = d7;
                                                    i20 = 3;
                                                    i16 = i36;
                                                    i55 = i92;
                                                    bArr2 = bArr3;
                                                    i13 = i57;
                                                    iJ = i56;
                                                    if (iJ == i56) {
                                                    }
                                                }
                                                break;
                                            default:
                                                z03 = z05;
                                                d8 = d7;
                                                i16 = i36;
                                                i55 = i92;
                                                bArr2 = bArr3;
                                                i20 = 3;
                                                i13 = i35 == true ? 1 : 0;
                                                i56 = i34;
                                                iJ = i56;
                                                if (iJ == i56) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i74 == 2) {
                                            Unsafe unsafe12 = f15122p;
                                            Object objL = z05.L(i92);
                                            Object object = unsafe12.getObject(obj, j13);
                                            if (!((Q0) object).g()) {
                                                Q0 q0B = Q0.a().b();
                                                R0.a(q0B, object);
                                                unsafe12.putObject(obj, j13, q0B);
                                            }
                                            androidx.appcompat.app.y.a(objL);
                                            throw null;
                                        }
                                        obj3 = obj;
                                        d10 = d7;
                                    }
                                }
                            } else if (i74 == 2) {
                                InterfaceC1350y0 interfaceC1350y0G2 = (InterfaceC1350y0) unsafe9.getObject(obj3, j13);
                                if (!interfaceC1350y0G2.zzc()) {
                                    int size3 = interfaceC1350y0G2.size();
                                    interfaceC1350y0G2 = interfaceC1350y0G2.g(size3 != 0 ? size3 + size3 : 10);
                                    unsafe9.putObject(obj3, j13, interfaceC1350y0G2);
                                }
                                iL = E.e(z07.K(i92), i76 == true ? 1 : 0, bArr, i93, i8, interfaceC1350y0G2, d7);
                                i61 = i8;
                                i69 = i76 == true ? 1 : 0;
                                i67 = i92;
                                unsafe5 = unsafe9;
                                d12 = d13;
                                i63 = 3;
                                i68 = i95;
                                i70 = i94;
                                i65 = -1;
                                i64 = 0;
                                i66 = i91;
                                i62 = i9;
                            } else {
                                i33 = i94;
                                z05 = z07;
                                i34 = i93;
                                d10 = d13;
                                unsafe = unsafe9;
                                i35 = i76 == true ? 1 : 0;
                                i36 = i91;
                            }
                            z03 = z05;
                            d8 = d10;
                            iJ = i34;
                            i16 = i36;
                            i67 = i92;
                            bArr2 = bArr3;
                            i20 = 3;
                            i10 = i9;
                            i13 = i35;
                            i19 = i95;
                            i70 = i33;
                        }
                    }
                    if (i13 == i10 || i10 == 0) {
                        if (z03.f15128f || (c1284f0 = d8.f15042d) == C1284f0.f15175c) {
                            i21 = i16;
                            i22 = i13 == true ? 1 : 0;
                            z04 = z03;
                            iG = E.g(i22 == true ? 1 : 0, bArr, iJ, i8, z(obj), d7);
                        } else {
                            c1284f0.b(z03.f15127e, i16);
                            C1351y1 c1351y1Z = z(obj);
                            i21 = i16;
                            boolean z10 = i13 == true ? 1 : 0;
                            i22 = i13 == true ? 1 : 0;
                            z04 = z03;
                            iG = E.g(z10 ? 1 : 0, bArr, iJ, i8, c1351y1Z, d7);
                        }
                        i61 = i8;
                        d12 = d7;
                        bArr3 = bArr2;
                        i62 = i10;
                        i66 = i21;
                        i69 = i22;
                        i63 = i20;
                        i65 = i17;
                        i64 = i18;
                        unsafe5 = unsafe;
                        i68 = i19;
                        iL = iG;
                        z07 = z04;
                    } else {
                        i12 = i19;
                        iL = iJ;
                        z02 = z03;
                        i14 = i70;
                        i11 = 1048575;
                    }
                } else {
                    iF = z07.F(i73, i64);
                }
                i15 = iF;
                if (i15 != i65) {
                }
                if (i13 == i10) {
                }
                if (z03.f15128f) {
                    i21 = i16;
                    i22 = i13 == true ? 1 : 0;
                    z04 = z03;
                    iG = E.g(i22 == true ? 1 : 0, bArr, iJ, i8, z(obj), d7);
                    i61 = i8;
                    d12 = d7;
                    bArr3 = bArr2;
                    i62 = i10;
                    i66 = i21;
                    i69 = i22;
                    i63 = i20;
                    i65 = i17;
                    i64 = i18;
                    unsafe5 = unsafe;
                    i68 = i19;
                    iL = iG;
                    z07 = z04;
                }
            } else {
                z02 = z07;
                i10 = i62;
                unsafe = unsafe5;
                i11 = 1048575;
                i12 = i68;
                i13 = i69;
                i14 = i70;
            }
        }
        if (i14 != i11) {
            unsafe.putInt(obj3, i14, i12);
        }
        for (int i124 = z02.f15130h; i124 < z02.f15131i; i124++) {
            int[] iArr2 = z02.f15129g;
            int[] iArr3 = z02.f15123a;
            int i125 = iArr2[i124];
            int i126 = iArr3[i125];
            Object objK = H1.k(obj3, z02.H(i125) & i11);
            if (objK != null && z02.J(i125) != null) {
                androidx.appcompat.app.y.a(z02.L(i125));
                throw null;
            }
        }
        if (i10 == 0) {
            if (iL != i8) {
                throw B0.e();
            }
        } else if (iL > i8 || i13 != i10) {
            throw B0.e();
        }
        return iL;
    }
}
