package r;

import java.util.ArrayList;
import q.C1980b;
import q.C1982d;
import r.e;

/* JADX INFO: renamed from: r.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2005b {
    static void a(f fVar, C1982d c1982d, int i7) {
        int i8;
        c[] cVarArr;
        int i9;
        if (i7 == 0) {
            i8 = fVar.f22024G0;
            cVarArr = fVar.f22027J0;
            i9 = 0;
        } else {
            i8 = fVar.f22025H0;
            cVarArr = fVar.f22026I0;
            i9 = 2;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            c cVar = cVarArr[i10];
            cVar.a();
            b(fVar, c1982d, i7, i9, cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[PHI: r8 r15
      0x002f: PHI (r8v43 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x002f: PHI (r15v31 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[PHI: r8 r15
      0x0031: PHI (r8v3 boolean) = (r8v1 boolean), (r8v45 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r15v3 boolean) = (r15v1 boolean), (r15v33 boolean) binds: [B:26:0x0044, B:15:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    /* JADX WARN: Type inference failed for: r38v0, types: [q.d] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [q.i] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [r.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void b(f fVar, C1982d c1982d, int i7, int i8, c cVar) {
        boolean z6;
        boolean z7;
        boolean z8;
        e eVar;
        int i9;
        d dVar;
        q.i iVar;
        d dVar2;
        q.i iVar2;
        e eVar2;
        d dVar3;
        d dVar4;
        q.i iVar3;
        q.i iVar4;
        e eVar3;
        int size;
        ArrayList arrayList;
        boolean z9;
        boolean z10;
        boolean z11;
        e eVar4;
        int i10;
        e eVar5 = cVar.f21897a;
        e eVar6 = cVar.f21899c;
        e eVar7 = cVar.f21898b;
        e eVar8 = cVar.f21900d;
        e eVar9 = cVar.f21901e;
        float f7 = cVar.f21907k;
        boolean z12 = fVar.f21950M[i7] == e.b.WRAP_CONTENT;
        if (i7 == 0) {
            int i11 = eVar9.f21989m0;
            z6 = i11 == 0;
            z7 = i11 == 1;
            z8 = i11 == 2;
        } else {
            int i12 = eVar9.f21991n0;
            z6 = i12 == 0;
            z7 = i12 == 1;
            if (i12 == 2) {
            }
        }
        boolean z13 = z7;
        boolean z14 = false;
        boolean z15 = z6;
        ?? r8 = eVar5;
        while (true) {
            if (z14) {
                break;
            }
            d dVar5 = r8.f21947J[i8];
            int i13 = z8 ? 1 : 4;
            int iB = dVar5.b();
            e.b bVar = r8.f21950M[i7];
            float f8 = f7;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && r8.f21990n[i7] == 0) {
                z9 = z14;
                z10 = true;
            } else {
                z9 = z14;
                z10 = false;
            }
            d dVar6 = dVar5.f21922d;
            if (dVar6 != null && r8 != eVar5) {
                iB += dVar6.b();
            }
            int i14 = iB;
            if (!z8 || r8 == eVar5 || r8 == eVar7) {
                z11 = z15;
            } else {
                z11 = z15;
                i13 = 5;
            }
            d dVar7 = dVar5.f21922d;
            e eVar10 = eVar9;
            if (dVar7 != null) {
                if (r8 == eVar7) {
                    eVar4 = eVar5;
                    c1982d.h(dVar5.f21925g, dVar7.f21925g, i14, 6);
                } else {
                    eVar4 = eVar5;
                    c1982d.h(dVar5.f21925g, dVar7.f21925g, i14, 8);
                }
                c1982d.e(dVar5.f21925g, dVar5.f21922d.f21925g, i14, (!z10 || z8) ? i13 : 5);
            } else {
                eVar4 = eVar5;
            }
            if (z12) {
                if (r8.M() == 8 || r8.f21950M[i7] != bVar2) {
                    i10 = 0;
                } else {
                    d[] dVarArr = r8.f21947J;
                    i10 = 0;
                    c1982d.h(dVarArr[i8 + 1].f21925g, dVarArr[i8].f21925g, 0, 5);
                }
                c1982d.h(r8.f21947J[i8].f21925g, fVar.f21947J[i8].f21925g, i10, 8);
            }
            d dVar8 = r8.f21947J[i8 + 1].f21922d;
            if (dVar8 != null) {
                e eVar11 = dVar8.f21920b;
                d dVar9 = eVar11.f21947J[i8].f21922d;
                if (dVar9 != null && dVar9.f21920b == r8) {
                    obj = eVar11;
                }
            }
            if (obj != null) {
                r8 = obj;
                z14 = z9;
            } else {
                z14 = true;
            }
            z15 = z11;
            f7 = f8;
            eVar9 = eVar10;
            eVar5 = eVar4;
            r8 = r8;
        }
        e eVar12 = eVar9;
        float f9 = f7;
        e eVar13 = eVar5;
        boolean z16 = z15;
        if (eVar8 != null) {
            int i15 = i8 + 1;
            if (eVar6.f21947J[i15].f21922d != null) {
                d dVar10 = eVar8.f21947J[i15];
                if (eVar8.f21950M[i7] == e.b.MATCH_CONSTRAINT && eVar8.f21990n[i7] == 0 && !z8) {
                    d dVar11 = dVar10.f21922d;
                    if (dVar11.f21920b == fVar) {
                        c1982d.e(dVar10.f21925g, dVar11.f21925g, -dVar10.b(), 5);
                    }
                    c1982d.j(dVar10.f21925g, eVar6.f21947J[i15].f21922d.f21925g, -dVar10.b(), 6);
                } else {
                    if (z8) {
                        d dVar12 = dVar10.f21922d;
                        if (dVar12.f21920b == fVar) {
                            c1982d.e(dVar10.f21925g, dVar12.f21925g, -dVar10.b(), 4);
                        }
                    }
                    c1982d.j(dVar10.f21925g, eVar6.f21947J[i15].f21922d.f21925g, -dVar10.b(), 6);
                }
            }
        }
        if (z12) {
            int i16 = i8 + 1;
            q.i iVar5 = fVar.f21947J[i16].f21925g;
            d dVar13 = eVar6.f21947J[i16];
            c1982d.h(iVar5, dVar13.f21925g, dVar13.b(), 8);
        }
        ArrayList arrayList2 = cVar.f21904h;
        if (arrayList2 != null && (size = arrayList2.size()) > 1) {
            float f10 = (!cVar.f21914r || cVar.f21916t) ? f9 : cVar.f21906j;
            float f11 = 0.0f;
            float f12 = 0.0f;
            e eVar14 = null;
            int i17 = 0;
            while (i17 < size) {
                e eVar15 = (e) arrayList2.get(i17);
                float f13 = eVar15.f21997q0[i7];
                if (f13 < f11) {
                    if (cVar.f21916t) {
                        d[] dVarArr2 = eVar15.f21947J;
                        c1982d.e(dVarArr2[i8 + 1].f21925g, dVarArr2[i8].f21925g, 0, 4);
                        arrayList = arrayList2;
                        i17++;
                        arrayList2 = arrayList;
                        f11 = 0.0f;
                    } else {
                        f13 = 1.0f;
                    }
                }
                if (f13 == f11) {
                    d[] dVarArr3 = eVar15.f21947J;
                    c1982d.e(dVarArr3[i8 + 1].f21925g, dVarArr3[i8].f21925g, 0, 8);
                    arrayList = arrayList2;
                    i17++;
                    arrayList2 = arrayList;
                    f11 = 0.0f;
                } else {
                    if (eVar14 != null) {
                        d[] dVarArr4 = eVar14.f21947J;
                        q.i iVar6 = dVarArr4[i8].f21925g;
                        int i18 = i8 + 1;
                        q.i iVar7 = dVarArr4[i18].f21925g;
                        d[] dVarArr5 = eVar15.f21947J;
                        q.i iVar8 = dVarArr5[i8].f21925g;
                        q.i iVar9 = dVarArr5[i18].f21925g;
                        arrayList = arrayList2;
                        C1980b c1980bR = c1982d.r();
                        c1980bR.l(f12, f10, f13, iVar6, iVar7, iVar8, iVar9);
                        c1982d.d(c1980bR);
                    } else {
                        arrayList = arrayList2;
                    }
                    eVar14 = eVar15;
                    f12 = f13;
                    i17++;
                    arrayList2 = arrayList;
                    f11 = 0.0f;
                }
            }
        }
        if (eVar7 != null && (eVar7 == eVar8 || z8)) {
            d dVar14 = eVar13.f21947J[i8];
            int i19 = i8 + 1;
            d dVar15 = eVar6.f21947J[i19];
            d dVar16 = dVar14.f21922d;
            q.i iVar10 = dVar16 != null ? dVar16.f21925g : null;
            d dVar17 = dVar15.f21922d;
            q.i iVar11 = dVar17 != null ? dVar17.f21925g : null;
            d dVar18 = eVar7.f21947J[i8];
            d dVar19 = eVar8.f21947J[i19];
            if (iVar10 != null && iVar11 != null) {
                c1982d.c(dVar18.f21925g, iVar10, dVar18.b(), i7 == 0 ? eVar12.f21967b0 : eVar12.f21969c0, iVar11, dVar19.f21925g, dVar19.b(), 7);
            }
        } else if (!z16 || eVar7 == null) {
            int i20 = 8;
            if (z13 && eVar7 != null) {
                int i21 = cVar.f21906j;
                boolean z17 = i21 > 0 && cVar.f21905i == i21;
                e eVar16 = eVar7;
                e eVar17 = eVar16;
                while (eVar16 != null) {
                    e eVar18 = eVar16.f22001s0[i7];
                    while (eVar18 != null && eVar18.M() == i20) {
                        eVar18 = eVar18.f22001s0[i7];
                    }
                    if (eVar16 == eVar7 || eVar16 == eVar8 || eVar18 == null) {
                        eVar = eVar17;
                        i9 = i20;
                    } else {
                        e eVar19 = eVar18 == eVar8 ? null : eVar18;
                        d dVar20 = eVar16.f21947J[i8];
                        q.i iVar12 = dVar20.f21925g;
                        d dVar21 = dVar20.f21922d;
                        if (dVar21 != null) {
                            q.i iVar13 = dVar21.f21925g;
                        }
                        int i22 = i8 + 1;
                        q.i iVar14 = eVar17.f21947J[i22].f21925g;
                        int iB2 = dVar20.b();
                        int iB3 = eVar16.f21947J[i22].b();
                        if (eVar19 != null) {
                            dVar = eVar19.f21947J[i8];
                            iVar = dVar.f21925g;
                            dVar2 = dVar.f21922d;
                            if (dVar2 == null) {
                                iVar2 = null;
                            }
                            if (dVar != null) {
                                iB3 += dVar.b();
                            }
                            int i23 = iB3;
                            int iB4 = eVar17.f21947J[i22].b() + iB2;
                            int i24 = !z17 ? 8 : 4;
                            if (iVar12 != null || iVar14 == null || iVar == null || iVar2 == null) {
                                eVar2 = eVar19;
                                eVar = eVar17;
                                i9 = 8;
                            } else {
                                eVar2 = eVar19;
                                eVar = eVar17;
                                i9 = 8;
                                c1982d.c(iVar12, iVar14, iB4, 0.5f, iVar, iVar2, i23, i24);
                            }
                            eVar18 = eVar2;
                        } else {
                            dVar = eVar8.f21947J[i8];
                            iVar = dVar != null ? dVar.f21925g : null;
                            dVar2 = eVar16.f21947J[i22];
                        }
                        iVar2 = dVar2.f21925g;
                        if (dVar != null) {
                        }
                        int i232 = iB3;
                        int iB42 = eVar17.f21947J[i22].b() + iB2;
                        if (!z17) {
                        }
                        if (iVar12 != null) {
                            eVar2 = eVar19;
                            eVar = eVar17;
                            i9 = 8;
                            eVar18 = eVar2;
                        }
                    }
                    if (eVar16.M() == i9) {
                        eVar16 = eVar;
                    }
                    i20 = i9;
                    eVar17 = eVar16;
                    eVar16 = eVar18;
                }
                d dVar22 = eVar7.f21947J[i8];
                d dVar23 = eVar13.f21947J[i8].f21922d;
                int i25 = i8 + 1;
                d dVar24 = eVar8.f21947J[i25];
                d dVar25 = eVar6.f21947J[i25].f21922d;
                if (dVar23 != null) {
                    if (eVar7 != eVar8) {
                        c1982d.e(dVar22.f21925g, dVar23.f21925g, dVar22.b(), 5);
                    } else if (dVar25 != null) {
                        c1982d.c(dVar22.f21925g, dVar23.f21925g, dVar22.b(), 0.5f, dVar24.f21925g, dVar25.f21925g, dVar24.b(), 5);
                    }
                }
                if (dVar25 != null && eVar7 != eVar8) {
                    c1982d.e(dVar24.f21925g, dVar25.f21925g, -dVar24.b(), 5);
                }
            }
        } else {
            int i26 = cVar.f21906j;
            boolean z18 = i26 > 0 && cVar.f21905i == i26;
            e eVar20 = eVar7;
            e eVar21 = eVar20;
            while (eVar20 != null) {
                e eVar22 = eVar20.f22001s0[i7];
                while (eVar22 != null && eVar22.M() == 8) {
                    eVar22 = eVar22.f22001s0[i7];
                }
                if (eVar22 != null || eVar20 == eVar8) {
                    d dVar26 = eVar20.f21947J[i8];
                    q.i iVar15 = dVar26.f21925g;
                    d dVar27 = dVar26.f21922d;
                    q.i iVar16 = dVar27 != null ? dVar27.f21925g : null;
                    if (eVar21 != eVar20) {
                        dVar3 = eVar21.f21947J[i8 + 1];
                    } else {
                        if (eVar20 == eVar7 && eVar21 == eVar20) {
                            dVar3 = eVar13.f21947J[i8].f21922d;
                            if (dVar3 == null) {
                                iVar16 = null;
                            }
                        }
                        int iB5 = dVar26.b();
                        int i27 = i8 + 1;
                        int iB6 = eVar20.f21947J[i27].b();
                        if (eVar22 == null) {
                            dVar4 = eVar22.f21947J[i8];
                            q.i iVar17 = dVar4.f21925g;
                            iVar4 = eVar20.f21947J[i27].f21925g;
                            iVar3 = iVar17;
                        } else {
                            dVar4 = eVar6.f21947J[i27].f21922d;
                            iVar3 = dVar4 != null ? dVar4.f21925g : null;
                            iVar4 = eVar20.f21947J[i27].f21925g;
                        }
                        if (dVar4 != null) {
                            iB6 += dVar4.b();
                        }
                        if (eVar21 != null) {
                            iB5 += eVar21.f21947J[i27].b();
                        }
                        if (iVar15 != null || iVar16 == null || iVar3 == null || iVar4 == null) {
                            eVar3 = eVar22;
                        } else {
                            if (eVar20 == eVar7) {
                                iB5 = eVar7.f21947J[i8].b();
                            }
                            int i28 = iB5;
                            eVar3 = eVar22;
                            c1982d.c(iVar15, iVar16, i28, 0.5f, iVar3, iVar4, eVar20 == eVar8 ? eVar8.f21947J[i27].b() : iB6, z18 ? 8 : 5);
                        }
                    }
                    iVar16 = dVar3.f21925g;
                    int iB52 = dVar26.b();
                    int i272 = i8 + 1;
                    int iB62 = eVar20.f21947J[i272].b();
                    if (eVar22 == null) {
                    }
                    if (dVar4 != null) {
                    }
                    if (eVar21 != null) {
                    }
                    if (iVar15 != null) {
                        eVar3 = eVar22;
                    }
                }
                if (eVar20.M() != 8) {
                    eVar21 = eVar20;
                }
                eVar20 = eVar3;
            }
        }
        if ((!z16 && !z13) || eVar7 == null || eVar7 == eVar8) {
            return;
        }
        d[] dVarArr6 = eVar7.f21947J;
        d dVar28 = dVarArr6[i8];
        int i29 = i8 + 1;
        d dVar29 = eVar8.f21947J[i29];
        d dVar30 = dVar28.f21922d;
        q.i iVar18 = dVar30 != null ? dVar30.f21925g : null;
        d dVar31 = dVar29.f21922d;
        ?? r52 = dVar31 != null ? dVar31.f21925g : 0;
        if (eVar6 != eVar8) {
            d dVar32 = eVar6.f21947J[i29].f21922d;
            r52 = dVar32 != null ? dVar32.f21925g : null;
        }
        if (eVar7 == eVar8) {
            dVar29 = dVarArr6[i29];
        }
        if (iVar18 == null || r52 == 0) {
            return;
        }
        c1982d.c(dVar28.f21925g, iVar18, dVar28.b(), 0.5f, r52, dVar29.f21925g, eVar8.f21947J[i29].b(), 5);
    }
}
