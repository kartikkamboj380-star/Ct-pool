package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.InterfaceC0870d0;
import e2.C1619a;

/* JADX INFO: loaded from: classes.dex */
@R1.a
final class IntBufferBatchMountItem implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f11741g = "IntBufferBatchMountItem";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f11744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object[] f11745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f11746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f11747f;

    IntBufferBatchMountItem(int i7, int[] iArr, Object[] objArr, int i8) {
        this.f11742a = i7;
        this.f11743b = i8;
        this.f11744c = iArr;
        this.f11745d = objArr;
        this.f11746e = iArr.length;
        this.f11747f = objArr.length;
    }

    private static String b(int i7) {
        return i7 == 2 ? "CREATE" : i7 == 4 ? "DELETE" : i7 == 8 ? "INSERT" : i7 == 16 ? "REMOVE" : i7 == 2048 ? "REMOVE_DELETE_TREE" : i7 == 32 ? "UPDATE_PROPS" : i7 == 64 ? "UPDATE_STATE" : i7 == 128 ? "UPDATE_LAYOUT" : i7 == 512 ? "UPDATE_PADDING" : i7 == 1024 ? "UPDATE_OVERFLOW_INSET" : i7 == 256 ? "UPDATE_EVENT_EMITTER" : "UNKNOWN";
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.a
    public boolean a() {
        return this.f11746e == 0;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(a2.c cVar) {
        int i7;
        int i8;
        long j7;
        int i9;
        int i10;
        int i11;
        a2.f fVarE = cVar.e(this.f11742a);
        if (fVarE == null) {
            P0.a.l(f11741g, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.f11742a));
            return;
        }
        if (fVarE.y()) {
            P0.a.l(f11741g, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.f11742a));
            return;
        }
        if (FabricUIManager.ENABLE_FABRIC_LOGS) {
            P0.a.c(f11741g, "Executing IntBufferBatchMountItem on surface [%d]", Integer.valueOf(this.f11742a));
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.f11746e) {
            int[] iArr = this.f11744c;
            int i14 = i12 + 1;
            int i15 = iArr[i12];
            int i16 = i15 & (-2);
            if ((i15 & 1) != 0) {
                int i17 = iArr[i14];
                i14 = i12 + 2;
                i7 = i17;
            } else {
                i7 = 1;
            }
            long j8 = 0;
            P2.a.c(0L, "IntBufferBatchMountItem::mountInstructions::" + b(i16));
            int i18 = i13;
            i12 = i14;
            int i19 = 0;
            while (i19 < i7) {
                if (i16 == 2) {
                    String strA = e.a((String) this.f11745d[i18]);
                    int[] iArr2 = this.f11744c;
                    int i20 = iArr2[i12];
                    Object[] objArr = this.f11745d;
                    ReadableMap readableMap = (ReadableMap) objArr[i18 + 1];
                    int i21 = i18 + 3;
                    InterfaceC0870d0 interfaceC0870d0 = (InterfaceC0870d0) objArr[i18 + 2];
                    i18 += 4;
                    int i22 = i12 + 2;
                    i8 = i19;
                    fVarE.k(strA, i20, readableMap, interfaceC0870d0, (EventEmitterWrapper) objArr[i21], iArr2[i12 + 1] == 1);
                    i12 = i22;
                } else {
                    i8 = i19;
                    if (i16 == 4) {
                        fVarE.m(this.f11744c[i12]);
                        i12++;
                    } else if (i16 == 8) {
                        int[] iArr3 = this.f11744c;
                        int i23 = iArr3[i12];
                        int i24 = i12 + 2;
                        int i25 = iArr3[i12 + 1];
                        i12 += 3;
                        fVarE.i(i25, i23, iArr3[i24]);
                    } else if (i16 == 16) {
                        int[] iArr4 = this.f11744c;
                        int i26 = iArr4[i12];
                        int i27 = i12 + 2;
                        int i28 = iArr4[i12 + 1];
                        i12 += 3;
                        fVarE.I(i26, i28, iArr4[i27]);
                    } else if (i16 == 2048) {
                        int[] iArr5 = this.f11744c;
                        int i29 = iArr5[i12];
                        int i30 = i12 + 2;
                        int i31 = iArr5[i12 + 1];
                        i12 += 3;
                        fVarE.H(i29, i31, iArr5[i30]);
                    } else {
                        if (i16 == 32) {
                            i10 = i12 + 1;
                            i11 = i18 + 1;
                            fVarE.R(this.f11744c[i12], (ReadableMap) this.f11745d[i18]);
                        } else if (i16 == 64) {
                            i10 = i12 + 1;
                            i11 = i18 + 1;
                            fVarE.S(this.f11744c[i12], (InterfaceC0870d0) this.f11745d[i18]);
                        } else {
                            if (i16 == 128) {
                                int[] iArr6 = this.f11744c;
                                int i32 = iArr6[i12];
                                int i33 = iArr6[i12 + 1];
                                int i34 = iArr6[i12 + 2];
                                int i35 = iArr6[i12 + 3];
                                int i36 = iArr6[i12 + 4];
                                int i37 = iArr6[i12 + 5];
                                int i38 = i12 + 7;
                                int i39 = iArr6[i12 + 6];
                                if (C1619a.d()) {
                                    j7 = 0;
                                    fVarE.O(i32, i33, i34, i35, i36, i37, i39, this.f11744c[i38]);
                                    i38 = i12 + 8;
                                } else {
                                    j7 = 0;
                                    fVarE.O(i32, i33, i34, i35, i36, i37, i39, 0);
                                }
                                i12 = i38;
                            } else {
                                j7 = 0;
                                if (i16 == 512) {
                                    int[] iArr7 = this.f11744c;
                                    i9 = i12 + 5;
                                    fVarE.Q(iArr7[i12], iArr7[i12 + 1], iArr7[i12 + 2], iArr7[i12 + 3], iArr7[i12 + 4]);
                                } else if (i16 == 1024) {
                                    int[] iArr8 = this.f11744c;
                                    i9 = i12 + 5;
                                    fVarE.P(iArr8[i12], iArr8[i12 + 1], iArr8[i12 + 2], iArr8[i12 + 3], iArr8[i12 + 4]);
                                } else {
                                    if (i16 != 256) {
                                        throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i16 + " at index: " + i12);
                                    }
                                    fVarE.N(this.f11744c[i12], (EventEmitterWrapper) this.f11745d[i18]);
                                    i12++;
                                    i18++;
                                }
                                i12 = i9;
                            }
                            i19 = i8 + 1;
                            j8 = j7;
                        }
                        i12 = i10;
                        i18 = i11;
                    }
                }
                j7 = 0;
                i19 = i8 + 1;
                j8 = j7;
            }
            P2.a.g(j8);
            i13 = i18;
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.f11742a;
    }

    public String toString() {
        int i7;
        String str;
        String str2;
        int i8;
        int i9;
        String str3;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("IntBufferBatchMountItem [surface:%d]:\n", Integer.valueOf(this.f11742a)));
            int i10 = 0;
            int i11 = 0;
            while (i10 < this.f11746e) {
                int[] iArr = this.f11744c;
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                int i14 = i13 & (-2);
                int i15 = 1;
                if ((i13 & 1) != 0) {
                    i15 = iArr[i12];
                    i12 = i10 + 2;
                }
                i10 = i12;
                for (int i16 = 0; i16 < i15; i16++) {
                    if (i14 == 2) {
                        String strA = e.a((String) this.f11745d[i11]);
                        i11 += 4;
                        int i17 = i10 + 1;
                        Integer numValueOf = Integer.valueOf(this.f11744c[i10]);
                        i10 += 2;
                        str2 = String.format("CREATE [%d] - layoutable:%d - %s\n", numValueOf, Integer.valueOf(this.f11744c[i17]), strA);
                    } else {
                        if (i14 == 4) {
                            i7 = i10 + 1;
                            str = String.format("DELETE [%d]\n", Integer.valueOf(this.f11744c[i10]));
                        } else if (i14 == 8) {
                            Integer numValueOf2 = Integer.valueOf(this.f11744c[i10]);
                            int i18 = i10 + 2;
                            Integer numValueOf3 = Integer.valueOf(this.f11744c[i10 + 1]);
                            i10 += 3;
                            str2 = String.format("INSERT [%d]->[%d] @%d\n", numValueOf2, numValueOf3, Integer.valueOf(this.f11744c[i18]));
                        } else if (i14 == 16) {
                            Integer numValueOf4 = Integer.valueOf(this.f11744c[i10]);
                            int i19 = i10 + 2;
                            Integer numValueOf5 = Integer.valueOf(this.f11744c[i10 + 1]);
                            i10 += 3;
                            str2 = String.format("REMOVE [%d]->[%d] @%d\n", numValueOf4, numValueOf5, Integer.valueOf(this.f11744c[i19]));
                        } else if (i14 == 2048) {
                            Integer numValueOf6 = Integer.valueOf(this.f11744c[i10]);
                            int i20 = i10 + 2;
                            Integer numValueOf7 = Integer.valueOf(this.f11744c[i10 + 1]);
                            i10 += 3;
                            str2 = String.format("REMOVE+DELETE TREE [%d]->[%d] @%d\n", numValueOf6, numValueOf7, Integer.valueOf(this.f11744c[i20]));
                        } else {
                            if (i14 == 32) {
                                i8 = i11 + 1;
                                Object obj = this.f11745d[i11];
                                i9 = i10 + 1;
                                str3 = String.format("UPDATE PROPS [%d]: %s\n", Integer.valueOf(this.f11744c[i10]), "<hidden>");
                            } else if (i14 == 64) {
                                i8 = i11 + 1;
                                i9 = i10 + 1;
                                str3 = String.format("UPDATE STATE [%d]: %s\n", Integer.valueOf(this.f11744c[i10]), "<hidden>");
                            } else if (i14 == 128) {
                                int[] iArr2 = this.f11744c;
                                int i21 = iArr2[i10];
                                Integer numValueOf8 = Integer.valueOf(iArr2[i10 + 1]);
                                Integer numValueOf9 = Integer.valueOf(i21);
                                Integer numValueOf10 = Integer.valueOf(this.f11744c[i10 + 2]);
                                Integer numValueOf11 = Integer.valueOf(this.f11744c[i10 + 3]);
                                Integer numValueOf12 = Integer.valueOf(this.f11744c[i10 + 4]);
                                int i22 = i10 + 6;
                                Integer numValueOf13 = Integer.valueOf(this.f11744c[i10 + 5]);
                                i10 += 7;
                                str2 = String.format("UPDATE LAYOUT [%d]->[%d]: x:%d y:%d w:%d h:%d displayType:%d\n", numValueOf8, numValueOf9, numValueOf10, numValueOf11, numValueOf12, numValueOf13, Integer.valueOf(this.f11744c[i22]));
                            } else if (i14 == 512) {
                                Integer numValueOf14 = Integer.valueOf(this.f11744c[i10]);
                                Integer numValueOf15 = Integer.valueOf(this.f11744c[i10 + 1]);
                                Integer numValueOf16 = Integer.valueOf(this.f11744c[i10 + 2]);
                                int i23 = i10 + 4;
                                Integer numValueOf17 = Integer.valueOf(this.f11744c[i10 + 3]);
                                i10 += 5;
                                str2 = String.format("UPDATE PADDING [%d]: top:%d right:%d bottom:%d left:%d\n", numValueOf14, numValueOf15, numValueOf16, numValueOf17, Integer.valueOf(this.f11744c[i23]));
                            } else if (i14 == 1024) {
                                Integer numValueOf18 = Integer.valueOf(this.f11744c[i10]);
                                Integer numValueOf19 = Integer.valueOf(this.f11744c[i10 + 1]);
                                Integer numValueOf20 = Integer.valueOf(this.f11744c[i10 + 2]);
                                int i24 = i10 + 4;
                                Integer numValueOf21 = Integer.valueOf(this.f11744c[i10 + 3]);
                                i10 += 5;
                                str2 = String.format("UPDATE OVERFLOWINSET [%d]: left:%d top:%d right:%d bottom:%d\n", numValueOf18, numValueOf19, numValueOf20, numValueOf21, Integer.valueOf(this.f11744c[i24]));
                            } else {
                                if (i14 != 256) {
                                    P0.a.j(f11741g, "String so far: " + sb.toString());
                                    throw new IllegalArgumentException("Invalid type argument to IntBufferBatchMountItem: " + i14 + " at index: " + i10);
                                }
                                i11++;
                                i7 = i10 + 1;
                                str = String.format("UPDATE EVENTEMITTER [%d]\n", Integer.valueOf(this.f11744c[i10]));
                            }
                            sb.append(str3);
                            i11 = i8;
                            i10 = i9;
                        }
                        sb.append(str);
                        i10 = i7;
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        } catch (Exception e7) {
            P0.a.k(f11741g, "Caught exception trying to print", e7);
            StringBuilder sb2 = new StringBuilder();
            for (int i25 = 0; i25 < this.f11746e; i25++) {
                sb2.append(this.f11744c[i25]);
                sb2.append(", ");
            }
            P0.a.j(f11741g, sb2.toString());
            for (int i26 = 0; i26 < this.f11747f; i26++) {
                String str4 = f11741g;
                Object obj2 = this.f11745d[i26];
                P0.a.j(str4, obj2 != null ? obj2.toString() : "null");
            }
            return "";
        }
    }
}
