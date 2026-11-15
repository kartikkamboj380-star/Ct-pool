package s;

import java.util.ArrayList;
import java.util.Iterator;
import r.e;

/* JADX INFO: loaded from: classes.dex */
public class c extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    ArrayList f22153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f22154l;

    public c(r.e eVar, int i7) {
        super(eVar);
        this.f22153k = new ArrayList();
        this.f22204f = i7;
        q();
    }

    private void q() {
        r.e eVar;
        r.e eVarF = this.f22200b;
        do {
            eVar = eVarF;
            eVarF = eVarF.F(this.f22204f);
        } while (eVarF != null);
        this.f22200b = eVar;
        this.f22153k.add(eVar.H(this.f22204f));
        r.e eVarD = eVar.D(this.f22204f);
        while (eVarD != null) {
            this.f22153k.add(eVarD.H(this.f22204f));
            eVarD = eVarD.D(this.f22204f);
        }
        for (m mVar : this.f22153k) {
            int i7 = this.f22204f;
            if (i7 == 0) {
                mVar.f22200b.f21968c = this;
            } else if (i7 == 1) {
                mVar.f22200b.f21970d = this;
            }
        }
        if (this.f22204f == 0 && ((r.f) this.f22200b.E()).V0() && this.f22153k.size() > 1) {
            ArrayList arrayList = this.f22153k;
            this.f22200b = ((m) arrayList.get(arrayList.size() - 1)).f22200b;
        }
        this.f22154l = this.f22204f == 0 ? this.f22200b.v() : this.f22200b.J();
    }

    private r.e r() {
        for (int i7 = 0; i7 < this.f22153k.size(); i7++) {
            m mVar = (m) this.f22153k.get(i7);
            if (mVar.f22200b.M() != 8) {
                return mVar.f22200b;
            }
        }
        return null;
    }

    private r.e s() {
        for (int size = this.f22153k.size() - 1; size >= 0; size--) {
            m mVar = (m) this.f22153k.get(size);
            if (mVar.f22200b.M() != 8) {
                return mVar.f22200b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01cf A[PHI: r1 r22 r23 r24
      0x01cf: PHI (r1v52 int) = (r1v50 int), (r1v58 int) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r23v4 boolean) = (r23v3 boolean), (r23v6 boolean) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]
      0x01cf: PHI (r24v4 int) = (r24v3 int), (r24v6 int) binds: [B:119:0x01cd, B:110:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014f  */
    @Override // s.m, s.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(d dVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f7;
        boolean z6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z7;
        int i18;
        float f8;
        int iMax;
        int i19;
        int i20;
        if (this.f22206h.f22173j && this.f22207i.f22173j) {
            r.e eVarE = this.f22200b.E();
            boolean zV0 = (eVarE == null || !(eVarE instanceof r.f)) ? false : ((r.f) eVarE).V0();
            int i21 = this.f22207i.f22170g - this.f22206h.f22170g;
            int size = this.f22153k.size();
            int i22 = 0;
            while (true) {
                i7 = -1;
                i8 = 8;
                if (i22 >= size) {
                    i22 = -1;
                    break;
                } else if (((m) this.f22153k.get(i22)).f22200b.M() != 8) {
                    break;
                } else {
                    i22++;
                }
            }
            int i23 = size - 1;
            int i24 = i23;
            while (true) {
                if (i24 < 0) {
                    break;
                }
                if (((m) this.f22153k.get(i24)).f22200b.M() != 8) {
                    i7 = i24;
                    break;
                }
                i24--;
            }
            int i25 = 0;
            while (i25 < 2) {
                int i26 = 0;
                i10 = 0;
                i11 = 0;
                int i27 = 0;
                f7 = 0.0f;
                while (i26 < size) {
                    m mVar = (m) this.f22153k.get(i26);
                    if (mVar.f22200b.M() != i8) {
                        i27++;
                        if (i26 > 0 && i26 >= i22) {
                            i10 += mVar.f22206h.f22169f;
                        }
                        g gVar = mVar.f22203e;
                        int i28 = gVar.f22170g;
                        boolean z8 = mVar.f22202d != e.b.MATCH_CONSTRAINT;
                        if (z8) {
                            int i29 = this.f22204f;
                            if (i29 == 0 && !mVar.f22200b.f21972e.f22203e.f22173j) {
                                return;
                            }
                            if (i29 == 1 && !mVar.f22200b.f21974f.f22203e.f22173j) {
                                return;
                            } else {
                                i19 = i28;
                            }
                        } else {
                            i19 = i28;
                            if (mVar.f22199a == 1 && i25 == 0) {
                                i20 = gVar.f22185m;
                                i11++;
                            } else if (gVar.f22173j) {
                                i20 = i19;
                            }
                            z8 = true;
                            if (z8) {
                                i11++;
                                float f9 = mVar.f22200b.f21997q0[this.f22204f];
                                if (f9 >= 0.0f) {
                                    f7 += f9;
                                }
                            } else {
                                i10 += i20;
                            }
                            if (i26 >= i23 && i26 < i7) {
                                i10 += -mVar.f22207i.f22169f;
                            }
                        }
                        i20 = i19;
                        if (z8) {
                        }
                        if (i26 >= i23) {
                        }
                    }
                    i26++;
                    i8 = 8;
                }
                if (i10 < i21 || i11 == 0) {
                    i9 = i27;
                    break;
                } else {
                    i25++;
                    i8 = 8;
                }
            }
            i9 = 0;
            i10 = 0;
            i11 = 0;
            f7 = 0.0f;
            int i30 = this.f22206h.f22170g;
            if (zV0) {
                i30 = this.f22207i.f22170g;
            }
            if (i10 > i21) {
                int i31 = (int) (((i10 - i21) / 2.0f) + 0.5f);
                i30 = zV0 ? i30 + i31 : i30 - i31;
            }
            if (i11 > 0) {
                float f10 = i21 - i10;
                int i32 = (int) ((f10 / i11) + 0.5f);
                int i33 = 0;
                int i34 = 0;
                while (i33 < size) {
                    m mVar2 = (m) this.f22153k.get(i33);
                    int i35 = i32;
                    int i36 = i10;
                    if (mVar2.f22200b.M() != 8 && mVar2.f22202d == e.b.MATCH_CONSTRAINT) {
                        g gVar2 = mVar2.f22203e;
                        if (gVar2.f22173j) {
                            z7 = zV0;
                            i18 = i9;
                            i16 = i30;
                            f8 = f10;
                        } else {
                            if (f7 > 0.0f) {
                                i16 = i30;
                                i17 = (int) (((mVar2.f22200b.f21997q0[this.f22204f] * f10) / f7) + 0.5f);
                            } else {
                                i16 = i30;
                                i17 = i35;
                            }
                            if (this.f22204f == 0) {
                                r.e eVar = mVar2.f22200b;
                                f8 = f10;
                                int i37 = eVar.f21994p;
                                z7 = zV0;
                                i18 = i9;
                                iMax = Math.max(eVar.f21992o, mVar2.f22199a == 1 ? Math.min(i17, gVar2.f22185m) : i17);
                                if (i37 > 0) {
                                    iMax = Math.min(i37, iMax);
                                }
                                if (iMax != i17) {
                                    i34++;
                                    i17 = iMax;
                                }
                                mVar2.f22203e.d(i17);
                            } else {
                                z7 = zV0;
                                i18 = i9;
                                f8 = f10;
                                r.e eVar2 = mVar2.f22200b;
                                int i38 = eVar2.f22000s;
                                iMax = Math.max(eVar2.f21998r, mVar2.f22199a == 1 ? Math.min(i17, gVar2.f22185m) : i17);
                                if (i38 > 0) {
                                    iMax = Math.min(i38, iMax);
                                }
                                if (iMax != i17) {
                                }
                                mVar2.f22203e.d(i17);
                            }
                        }
                    }
                    i33++;
                    i32 = i35;
                    i10 = i36;
                    i30 = i16;
                    f10 = f8;
                    zV0 = z7;
                    i9 = i18;
                }
                z6 = zV0;
                i12 = i9;
                i13 = i30;
                int i39 = i10;
                if (i34 > 0) {
                    i11 -= i34;
                    i10 = 0;
                    for (int i40 = 0; i40 < size; i40++) {
                        m mVar3 = (m) this.f22153k.get(i40);
                        if (mVar3.f22200b.M() != 8) {
                            if (i40 > 0 && i40 >= i22) {
                                i10 += mVar3.f22206h.f22169f;
                            }
                            i10 += mVar3.f22203e.f22170g;
                            if (i40 < i23 && i40 < i7) {
                                i10 += -mVar3.f22207i.f22169f;
                            }
                        }
                    }
                } else {
                    i10 = i39;
                }
                i15 = 2;
                if (this.f22154l == 2 && i34 == 0) {
                    i14 = 0;
                    this.f22154l = 0;
                } else {
                    i14 = 0;
                }
            } else {
                z6 = zV0;
                i12 = i9;
                i13 = i30;
                i14 = 0;
                i15 = 2;
            }
            if (i10 > i21) {
                this.f22154l = i15;
            }
            if (i12 > 0 && i11 == 0 && i22 == i7) {
                this.f22154l = i15;
            }
            int i41 = this.f22154l;
            int i42 = i12;
            if (i41 == 1) {
                int i43 = i42 > 1 ? (i21 - i10) / (i42 - 1) : i42 == 1 ? (i21 - i10) / 2 : i14;
                if (i11 > 0) {
                    i43 = i14;
                }
                int i44 = i13;
                for (int i45 = i14; i45 < size; i45++) {
                    m mVar4 = (m) this.f22153k.get(z6 ? size - (i45 + 1) : i45);
                    if (mVar4.f22200b.M() == 8) {
                        mVar4.f22206h.d(i44);
                        mVar4.f22207i.d(i44);
                    } else {
                        if (i45 > 0) {
                            i44 = z6 ? i44 - i43 : i44 + i43;
                        }
                        if (i45 > 0 && i45 >= i22) {
                            int i46 = mVar4.f22206h.f22169f;
                            i44 = z6 ? i44 - i46 : i44 + i46;
                        }
                        (z6 ? mVar4.f22207i : mVar4.f22206h).d(i44);
                        g gVar3 = mVar4.f22203e;
                        int i47 = gVar3.f22170g;
                        if (mVar4.f22202d == e.b.MATCH_CONSTRAINT && mVar4.f22199a == 1) {
                            i47 = gVar3.f22185m;
                        }
                        i44 = z6 ? i44 - i47 : i44 + i47;
                        (z6 ? mVar4.f22206h : mVar4.f22207i).d(i44);
                        mVar4.f22205g = true;
                        if (i45 < i23 && i45 < i7) {
                            int i48 = -mVar4.f22207i.f22169f;
                            i44 = z6 ? i44 - i48 : i44 + i48;
                        }
                    }
                }
                return;
            }
            if (i41 == 0) {
                int i49 = (i21 - i10) / (i42 + 1);
                if (i11 > 0) {
                    i49 = i14;
                }
                int i50 = i13;
                for (int i51 = i14; i51 < size; i51++) {
                    m mVar5 = (m) this.f22153k.get(z6 ? size - (i51 + 1) : i51);
                    if (mVar5.f22200b.M() == 8) {
                        mVar5.f22206h.d(i50);
                        mVar5.f22207i.d(i50);
                    } else {
                        int i52 = z6 ? i50 - i49 : i50 + i49;
                        if (i51 > 0 && i51 >= i22) {
                            int i53 = mVar5.f22206h.f22169f;
                            i52 = z6 ? i52 - i53 : i52 + i53;
                        }
                        (z6 ? mVar5.f22207i : mVar5.f22206h).d(i52);
                        g gVar4 = mVar5.f22203e;
                        int iMin = gVar4.f22170g;
                        if (mVar5.f22202d == e.b.MATCH_CONSTRAINT && mVar5.f22199a == 1) {
                            iMin = Math.min(iMin, gVar4.f22185m);
                        }
                        i50 = z6 ? i52 - iMin : i52 + iMin;
                        (z6 ? mVar5.f22206h : mVar5.f22207i).d(i50);
                        if (i51 < i23 && i51 < i7) {
                            int i54 = -mVar5.f22207i.f22169f;
                            i50 = z6 ? i50 - i54 : i50 + i54;
                        }
                    }
                }
                return;
            }
            if (i41 == 2) {
                float fU = this.f22204f == 0 ? this.f22200b.u() : this.f22200b.I();
                if (z6) {
                    fU = 1.0f - fU;
                }
                int i55 = (int) (((i21 - i10) * fU) + 0.5f);
                if (i55 < 0 || i11 > 0) {
                    i55 = i14;
                }
                int i56 = z6 ? i13 - i55 : i13 + i55;
                for (int i57 = i14; i57 < size; i57++) {
                    m mVar6 = (m) this.f22153k.get(z6 ? size - (i57 + 1) : i57);
                    if (mVar6.f22200b.M() == 8) {
                        mVar6.f22206h.d(i56);
                        mVar6.f22207i.d(i56);
                    } else {
                        if (i57 > 0 && i57 >= i22) {
                            int i58 = mVar6.f22206h.f22169f;
                            i56 = z6 ? i56 - i58 : i56 + i58;
                        }
                        (z6 ? mVar6.f22207i : mVar6.f22206h).d(i56);
                        g gVar5 = mVar6.f22203e;
                        int i59 = gVar5.f22170g;
                        if (mVar6.f22202d == e.b.MATCH_CONSTRAINT && mVar6.f22199a == 1) {
                            i59 = gVar5.f22185m;
                        }
                        i56 = z6 ? i56 - i59 : i56 + i59;
                        (z6 ? mVar6.f22206h : mVar6.f22207i).d(i56);
                        if (i57 < i23 && i57 < i7) {
                            int i60 = -mVar6.f22207i.f22169f;
                            i56 = z6 ? i56 - i60 : i56 + i60;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[PHI: r0 r1
      0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r1v3 s.f) = (r1v2 s.f), (r1v7 s.f) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // s.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void d() {
        f fVarI;
        int iB;
        Iterator it = this.f22153k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = this.f22153k.size();
        if (size < 1) {
            return;
        }
        r.e eVar = ((m) this.f22153k.get(0)).f22200b;
        r.e eVar2 = ((m) this.f22153k.get(size - 1)).f22200b;
        if (this.f22204f == 0) {
            r.d dVar = eVar.f21939B;
            r.d dVar2 = eVar2.f21941D;
            f fVarI2 = i(dVar, 0);
            int iB2 = dVar.b();
            r.e eVarR = r();
            if (eVarR != null) {
                iB2 = eVarR.f21939B.b();
            }
            if (fVarI2 != null) {
                b(this.f22206h, fVarI2, iB2);
            }
            fVarI = i(dVar2, 0);
            iB = dVar2.b();
            r.e eVarS = s();
            if (eVarS != null) {
                iB = eVarS.f21941D.b();
            }
            if (fVarI != null) {
                b(this.f22207i, fVarI, -iB);
            }
        } else {
            r.d dVar3 = eVar.f21940C;
            r.d dVar4 = eVar2.f21942E;
            f fVarI3 = i(dVar3, 1);
            int iB3 = dVar3.b();
            r.e eVarR2 = r();
            if (eVarR2 != null) {
                iB3 = eVarR2.f21940C.b();
            }
            if (fVarI3 != null) {
                b(this.f22206h, fVarI3, iB3);
            }
            fVarI = i(dVar4, 1);
            iB = dVar4.b();
            r.e eVarS2 = s();
            if (eVarS2 != null) {
                iB = eVarS2.f21942E.b();
            }
            if (fVarI != null) {
            }
        }
        this.f22206h.f22164a = this;
        this.f22207i.f22164a = this;
    }

    @Override // s.m
    public void e() {
        for (int i7 = 0; i7 < this.f22153k.size(); i7++) {
            ((m) this.f22153k.get(i7)).e();
        }
    }

    @Override // s.m
    void f() {
        this.f22201c = null;
        Iterator it = this.f22153k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // s.m
    public long j() {
        int size = this.f22153k.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = (m) this.f22153k.get(i7);
            j7 = j7 + ((long) mVar.f22206h.f22169f) + mVar.j() + ((long) mVar.f22207i.f22169f);
        }
        return j7;
    }

    @Override // s.m
    boolean m() {
        int size = this.f22153k.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((m) this.f22153k.get(i7)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f22204f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator it = this.f22153k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + ((m) it.next())) + "> ";
        }
        return string;
    }
}
