package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1337u extends AbstractC1311m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final AbstractC1311m f15305s = new C1337u(null, new Object[0], 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final transient Object f15306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final transient Object[] f15307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final transient int f15308r;

    private C1337u(Object obj, Object[] objArr, int i7) {
        this.f15306p = obj;
        this.f15307q = objArr;
        this.f15308r = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static C1337u h(int i7, Object[] objArr, C1307l c1307l) {
        int iHighestOneBit;
        short[] sArr;
        char c7;
        char c8;
        ?? r32;
        ?? r33;
        int i8 = i7;
        Object[] objArrCopyOf = objArr;
        if (i8 == 0) {
            return (C1337u) f15305s;
        }
        C1303k c1303k = null;
        ?? r34 = 0;
        C1303k c1303k2 = null;
        C1303k c1303k3 = null;
        int i9 = 1;
        if (i8 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            AbstractC1279e.a(obj, obj2);
            return new C1337u(null, objArrCopyOf, 1);
        }
        AbstractC1267b.b(i8, objArrCopyOf.length >> 1, "index");
        int iMax = Math.max(i8, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i8 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            AbstractC1279e.a(obj3, obj4);
            i8 = 1;
            c7 = 1;
            c8 = 2;
        } else {
            int i10 = iHighestOneBit - 1;
            byte b7 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i11 = 0;
                int i12 = 0;
                while (i11 < i8) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj5 = objArrCopyOf[i14];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i14 ^ i9];
                    Objects.requireNonNull(obj6);
                    AbstractC1279e.a(obj5, obj6);
                    int iA = AbstractC1283f.a(obj5.hashCode());
                    while (true) {
                        int i15 = iA & i10;
                        int i16 = bArr[i15] & 255;
                        if (i16 == 255) {
                            bArr[i15] = (byte) i13;
                            if (i12 < i11) {
                                objArrCopyOf[i13] = obj5;
                                objArrCopyOf[i13 ^ 1] = obj6;
                            }
                            i12++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i16 == true ? 1 : 0])) {
                                int i17 = ~i16;
                                Object obj7 = objArrCopyOf[i17 == true ? 1 : 0];
                                Objects.requireNonNull(obj7);
                                C1303k c1303k4 = new C1303k(obj5, obj6, obj7);
                                objArrCopyOf[i17 == true ? 1 : 0] = obj6;
                                c1303k2 = c1303k4;
                                break;
                            }
                            iA = i15 + 1;
                        }
                    }
                    i11++;
                    i9 = 1;
                }
                if (i12 == i8) {
                    r32 = bArr;
                } else {
                    r33 = new Object[]{bArr, Integer.valueOf(i12), c1303k2};
                    c8 = 2;
                    c7 = 1;
                    r34 = r33;
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i18 = 0;
                for (int i19 = 0; i19 < i8; i19++) {
                    int i20 = i18 + i18;
                    int i21 = i19 + i19;
                    Object obj8 = objArrCopyOf[i21];
                    Objects.requireNonNull(obj8);
                    Object obj9 = objArrCopyOf[i21 ^ 1];
                    Objects.requireNonNull(obj9);
                    AbstractC1279e.a(obj8, obj9);
                    int iA2 = AbstractC1283f.a(obj8.hashCode());
                    while (true) {
                        int i22 = iA2 & i10;
                        char c9 = (char) sArr[i22];
                        if (c9 == 65535) {
                            sArr[i22] = (short) i20;
                            if (i18 < i19) {
                                objArrCopyOf[i20] = obj8;
                                objArrCopyOf[i20 ^ 1] = obj9;
                            }
                            i18++;
                        } else {
                            if (obj8.equals(objArrCopyOf[c9])) {
                                int i23 = c9 ^ 1;
                                Object obj10 = objArrCopyOf[i23 == true ? 1 : 0];
                                Objects.requireNonNull(obj10);
                                C1303k c1303k5 = new C1303k(obj8, obj9, obj10);
                                objArrCopyOf[i23 == true ? 1 : 0] = obj9;
                                c1303k3 = c1303k5;
                                break;
                            }
                            iA2 = i22 + 1;
                        }
                    }
                }
                if (i18 != i8) {
                    c8 = 2;
                    r34 = new Object[]{sArr, Integer.valueOf(i18), c1303k3};
                    c7 = 1;
                }
                r32 = sArr;
            } else {
                int i24 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i25 = 0;
                int i26 = 0;
                while (i25 < i8) {
                    int i27 = i26 + i26;
                    int i28 = i25 + i25;
                    Object obj11 = objArrCopyOf[i28];
                    Objects.requireNonNull(obj11);
                    Object obj12 = objArrCopyOf[i28 ^ i24];
                    Objects.requireNonNull(obj12);
                    AbstractC1279e.a(obj11, obj12);
                    int iA3 = AbstractC1283f.a(obj11.hashCode());
                    while (true) {
                        int i29 = iA3 & i10;
                        ?? r15 = sArr[i29];
                        if (r15 == b7) {
                            sArr[i29] = i27;
                            if (i26 < i25) {
                                objArrCopyOf[i27] = obj11;
                                objArrCopyOf[i27 ^ 1] = obj12;
                            }
                            i26++;
                        } else {
                            if (obj11.equals(objArrCopyOf[r15])) {
                                int i30 = r15 ^ 1;
                                Object obj13 = objArrCopyOf[i30 == true ? 1 : 0];
                                Objects.requireNonNull(obj13);
                                C1303k c1303k6 = new C1303k(obj11, obj12, obj13);
                                objArrCopyOf[i30 == true ? 1 : 0] = obj12;
                                c1303k = c1303k6;
                                break;
                            }
                            iA3 = i29 + 1;
                            b7 = -1;
                        }
                    }
                    i25++;
                    i24 = 1;
                    b7 = -1;
                }
                if (i26 != i8) {
                    c7 = 1;
                    c8 = 2;
                    r34 = new Object[]{sArr, Integer.valueOf(i26), c1303k};
                }
                r32 = sArr;
            }
            c8 = 2;
            r33 = r32;
            c7 = 1;
            r34 = r33;
        }
        boolean z6 = r34 instanceof Object[];
        ?? r35 = r34;
        if (z6) {
            Object[] objArr2 = (Object[]) r34;
            C1303k c1303k7 = (C1303k) objArr2[c8];
            if (c1307l == null) {
                throw c1303k7.a();
            }
            c1307l.f15215c = c1303k7;
            Object obj14 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c7]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r35 = obj14;
            i8 = iIntValue;
        }
        return new C1337u(r35, objArrCopyOf, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1311m
    final AbstractC1287g a() {
        return new C1334t(this.f15307q, 1, this.f15308r);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1311m
    final AbstractC1315n e() {
        return new r(this, this.f15307q, 0, this.f15308r);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1311m
    final AbstractC1315n f() {
        return new C1331s(this, new C1334t(this.f15307q, 0, this.f15308r));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.play_billing.AbstractC1311m, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i7 = this.f15308r;
            Object[] objArr = this.f15307q;
            if (i7 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f15306p;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iA = AbstractC1283f.a(obj.hashCode());
                        while (true) {
                            int i8 = iA & length;
                            int i9 = bArr[i8] & 255;
                            if (i9 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            iA = i8 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iA2 = AbstractC1283f.a(obj.hashCode());
                        while (true) {
                            int i10 = iA2 & length2;
                            char c7 = (char) sArr[i10];
                            if (c7 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c7])) {
                                obj2 = objArr[c7 ^ 1];
                                break;
                            }
                            iA2 = i10 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iA3 = AbstractC1283f.a(obj.hashCode());
                        while (true) {
                            int i11 = iA3 & length3;
                            int i12 = iArr[i11];
                            if (i12 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i12])) {
                                obj2 = objArr[i12 ^ 1];
                                break;
                            }
                            iA3 = i11 + 1;
                        }
                    }
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f15308r;
    }
}
