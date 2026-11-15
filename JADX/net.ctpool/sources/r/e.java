package r;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import q.C1980b;
import q.C1981c;
import q.C1982d;
import r.d;
import s.l;
import s.m;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static float f21937v0 = 0.5f;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    d f21946I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public d[] f21947J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    protected ArrayList f21948K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean[] f21949L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public b[] f21950M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public e f21951N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f21952O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f21953P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f21954Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected int f21955R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected int f21956S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected int f21957T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    int f21958U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    int f21959V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected int f21960W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    protected int f21961X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    int f21962Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected int f21963Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected int f21965a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    float f21967b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s.c f21968c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    float f21969c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s.c f21970d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Object f21971d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f21973e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f21975f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private String f21977g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private String f21979h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    boolean f21981i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    boolean f21983j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    boolean f21985k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    boolean f21987l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    int f21989m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    int f21991n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    boolean f21993o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f21995p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float[] f21997q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    protected e[] f21999r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    protected e[] f22001s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    e f22003t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    e f22005u0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f22010z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21964a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m[] f21966b = new m[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.j f21972e = new s.j(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f21974f = new l(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f21976g = {true, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f21978h = {0, 0, 0, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f21980i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21982j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21984k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21986l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21988m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f21990n = new int[2];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21992o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21994p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f21996q = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21998r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22000s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f22002t = 1.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f22004u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f22006v = 1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f22007w = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f22008x = 0.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f22009y = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f21938A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public d f21939B = new d(this, d.b.LEFT);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public d f21940C = new d(this, d.b.TOP);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public d f21941D = new d(this, d.b.RIGHT);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public d f21942E = new d(this, d.b.BOTTOM);

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    d f21943F = new d(this, d.b.BASELINE);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    d f21944G = new d(this, d.b.CENTER_X);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    d f21945H = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f22012b;

        static {
            int[] iArr = new int[b.values().length];
            f22012b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22012b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22012b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22012b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f22011a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22011a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22011a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22011a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22011a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22011a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22011a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22011a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f22011a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.f21946I = dVar;
        this.f21947J = new d[]{this.f21939B, this.f21941D, this.f21940C, this.f21942E, this.f21943F, dVar};
        this.f21948K = new ArrayList();
        this.f21949L = new boolean[2];
        b bVar = b.FIXED;
        this.f21950M = new b[]{bVar, bVar};
        this.f21951N = null;
        this.f21952O = 0;
        this.f21953P = 0;
        this.f21954Q = 0.0f;
        this.f21955R = -1;
        this.f21956S = 0;
        this.f21957T = 0;
        this.f21958U = 0;
        this.f21959V = 0;
        this.f21960W = 0;
        this.f21961X = 0;
        this.f21962Y = 0;
        float f7 = f21937v0;
        this.f21967b0 = f7;
        this.f21969c0 = f7;
        this.f21973e0 = 0;
        this.f21975f0 = 0;
        this.f21977g0 = null;
        this.f21979h0 = null;
        this.f21985k0 = false;
        this.f21987l0 = false;
        this.f21989m0 = 0;
        this.f21991n0 = 0;
        this.f21997q0 = new float[]{-1.0f, -1.0f};
        this.f21999r0 = new e[]{null, null};
        this.f22001s0 = new e[]{null, null};
        this.f22003t0 = null;
        this.f22005u0 = null;
        d();
    }

    private boolean S(int i7) {
        d dVar;
        d dVar2;
        int i8 = i7 * 2;
        d[] dVarArr = this.f21947J;
        d dVar3 = dVarArr[i8];
        d dVar4 = dVar3.f21922d;
        return (dVar4 == null || dVar4.f21922d == dVar3 || (dVar2 = (dVar = dVarArr[i8 + 1]).f21922d) == null || dVar2.f21922d != dVar) ? false : true;
    }

    private void d() {
        this.f21948K.add(this.f21939B);
        this.f21948K.add(this.f21940C);
        this.f21948K.add(this.f21941D);
        this.f21948K.add(this.f21942E);
        this.f21948K.add(this.f21944G);
        this.f21948K.add(this.f21945H);
        this.f21948K.add(this.f21946I);
        this.f21948K.add(this.f21943F);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void h(C1982d c1982d, boolean z6, boolean z7, boolean z8, boolean z9, q.i iVar, q.i iVar2, b bVar, boolean z10, d dVar, d dVar2, int i7, int i8, int i9, int i10, float f7, boolean z11, boolean z12, boolean z13, boolean z14, int i11, int i12, int i13, int i14, float f8, boolean z15) {
        int i15;
        boolean z16;
        int iMin;
        q.i iVar3;
        int i16;
        int i17;
        q.i iVar4;
        q.i iVar5;
        q.i iVar6;
        int i18;
        int i19;
        boolean z17;
        boolean z18;
        q.i iVarQ;
        e eVar;
        d.b bVar2;
        q.i iVar7;
        q.i iVar8;
        q.i iVar9;
        q.i iVar10;
        int i20;
        char c7;
        char c8;
        int i21;
        d dVar3;
        boolean z19;
        boolean z20;
        boolean z21;
        int i22;
        int i23;
        boolean z22;
        int i24;
        boolean z23;
        boolean z24;
        q.i iVar11;
        e eVar2;
        boolean z25;
        e eVar3;
        q.i iVar12;
        int i25;
        int i26;
        int i27;
        e eVar4;
        q.i iVar13;
        e eVar5;
        q.i iVar14;
        int i28;
        int i29;
        boolean z26;
        int i30;
        int i31;
        int iMin2;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z27;
        q.i iVar15;
        int iB;
        q.i iVarQ2 = c1982d.q(dVar);
        q.i iVarQ3 = c1982d.q(dVar2);
        q.i iVarQ4 = c1982d.q(dVar.f());
        q.i iVarQ5 = c1982d.q(dVar2.f());
        C1982d.w();
        boolean zI = dVar.i();
        boolean zI2 = dVar2.i();
        boolean zI3 = this.f21946I.i();
        int i37 = zI2 ? (zI ? 1 : 0) + 1 : zI ? 1 : 0;
        if (zI3) {
            i37++;
        }
        int i38 = z11 ? 3 : i11;
        int i39 = a.f22012b[bVar.ordinal()];
        if (i39 == 1 || i39 == 2 || i39 == 3 || i39 != 4) {
            i15 = i38;
        } else {
            i15 = i38;
            if (i15 != 4) {
                z16 = true;
            }
            if (this.f21975f0 != 8) {
                iMin = 0;
                z16 = false;
            } else {
                iMin = i8;
            }
            if (z15) {
                iVar3 = iVarQ5;
                i16 = 8;
            } else {
                if (!zI && !zI2 && !zI3) {
                    c1982d.f(iVarQ2, i7);
                } else if (zI && !zI2) {
                    iVar3 = iVarQ5;
                    i16 = 8;
                    c1982d.e(iVarQ2, iVarQ4, dVar.b(), 8);
                }
                iVar3 = iVarQ5;
                i16 = 8;
            }
            if (z16) {
                if (z10) {
                    c1982d.e(iVarQ3, iVarQ2, 0, 3);
                    if (i9 > 0) {
                        c1982d.h(iVarQ3, iVarQ2, i9, 8);
                    }
                    if (i10 < Integer.MAX_VALUE) {
                        c1982d.j(iVarQ3, iVarQ2, i10, 8);
                    }
                } else {
                    c1982d.e(iVarQ3, iVarQ2, iMin, i16);
                }
                i19 = i13;
                i17 = i14;
                iVar4 = iVarQ4;
                iVar5 = iVarQ3;
            } else {
                if (i37 != 2 && !z11 && (i15 == 1 || i15 == 0)) {
                    int iMax = Math.max(i13, iMin);
                    if (i14 > 0) {
                        iMax = Math.min(i14, iMax);
                    }
                    c1982d.e(iVarQ3, iVarQ2, iMax, 8);
                    z18 = z9;
                    i19 = i13;
                    i17 = i14;
                    iVar4 = iVarQ4;
                    iVar5 = iVarQ3;
                    iVar6 = iVar3;
                    z17 = false;
                    i18 = i37;
                    if (z15) {
                    }
                    if (i21 >= c7) {
                        return;
                    } else {
                        return;
                    }
                }
                int i40 = i13 == -2 ? iMin : i13;
                i17 = i14 == -2 ? iMin : i14;
                if (iMin > 0 && i15 != 1) {
                    iMin = 0;
                }
                if (i40 > 0) {
                    c1982d.h(iVarQ3, iVarQ2, i40, 8);
                    iMin = Math.max(iMin, i40);
                }
                if (i17 > 0) {
                    if (!z7 || i15 != 1) {
                        c1982d.j(iVarQ3, iVarQ2, i17, 8);
                    }
                    iMin = Math.min(iMin, i17);
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        d.b bVarG = dVar.g();
                        d.b bVar3 = d.b.TOP;
                        if (bVarG == bVar3 || dVar.g() == d.b.BOTTOM) {
                            iVarQ = c1982d.q(this.f21951N.k(bVar3));
                            eVar = this.f21951N;
                            bVar2 = d.b.BOTTOM;
                        } else {
                            iVarQ = c1982d.q(this.f21951N.k(d.b.LEFT));
                            eVar = this.f21951N;
                            bVar2 = d.b.RIGHT;
                        }
                        q.i iVarQ6 = c1982d.q(eVar.k(bVar2));
                        q.i iVar16 = iVarQ;
                        C1980b c1980bR = c1982d.r();
                        int i41 = i40;
                        iVar6 = iVar3;
                        iVar4 = iVarQ4;
                        i18 = i37 == true ? 1 : 0;
                        iVar5 = iVarQ3;
                        c1982d.d(c1980bR.k(iVarQ3, iVarQ2, iVarQ6, iVar16, f8));
                        z18 = z9;
                        i19 = i41;
                        z17 = false;
                    } else {
                        iVar4 = iVarQ4;
                        iVar5 = iVarQ3;
                        int i42 = i40;
                        iVar6 = iVar3;
                        i18 = i37;
                        i19 = i42;
                        z17 = z16;
                        z18 = true;
                    }
                    if (z15) {
                        iVar7 = iVar2;
                        iVar8 = iVar5;
                        iVar9 = iVarQ2;
                        iVar10 = iVar;
                        i20 = 8;
                        c7 = 2;
                        c8 = 1;
                        i21 = i18;
                    } else {
                        if (!z12) {
                            if ((zI || zI2 || zI3) && (!zI || zI2)) {
                                if (!zI && zI2) {
                                    c1982d.e(iVar5, iVar6, -dVar2.b(), 8);
                                    if (z7) {
                                        c1982d.h(iVarQ2, iVar, 0, 5);
                                    }
                                } else if (zI && zI2) {
                                    e eVar6 = dVar.f21922d.f21920b;
                                    e eVar7 = dVar2.f21922d.f21920b;
                                    e eVarE = E();
                                    int i43 = 6;
                                    if (!z17) {
                                        z19 = true;
                                        z20 = true;
                                        z21 = true;
                                        i22 = 6;
                                        i23 = 4;
                                        z22 = false;
                                    } else if (i15 == 0) {
                                        if (i17 == 0 && i19 == 0) {
                                            z27 = false;
                                            i35 = 8;
                                            i36 = 8;
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                            i35 = 5;
                                            i36 = 5;
                                            z27 = true;
                                        }
                                        if ((eVar6 instanceof C2004a) || (eVar7 instanceof C2004a)) {
                                            i24 = i35;
                                            i22 = 6;
                                            z21 = z27;
                                            z20 = false;
                                            z19 = true;
                                            i23 = 4;
                                            if (z20 || iVar4 != iVar6 || eVar6 == eVarE) {
                                                z23 = z20;
                                                z24 = z19;
                                            } else {
                                                z23 = false;
                                                z24 = false;
                                            }
                                            if (z21) {
                                                iVar11 = iVar5;
                                                eVar2 = eVarE;
                                                z25 = z19;
                                                eVar3 = eVar6;
                                                iVar12 = iVarQ2;
                                                i25 = i15;
                                                i26 = 8;
                                                i27 = 4;
                                                eVar4 = eVar7;
                                            } else {
                                                iVar11 = iVar5;
                                                i27 = 4;
                                                z25 = true;
                                                eVar2 = eVarE;
                                                i25 = i15;
                                                eVar4 = eVar7;
                                                i26 = 8;
                                                eVar3 = eVar6;
                                                iVar12 = iVarQ2;
                                                c1982d.c(iVarQ2, iVar4, dVar.b(), f7, iVar6, iVar11, dVar2.b(), this.f21975f0 == 8 ? 4 : i22);
                                            }
                                            if (this.f21975f0 != i26) {
                                                return;
                                            }
                                            if (z23) {
                                                if (!z7 || iVar4 == iVar6 || z17) {
                                                    eVar5 = eVar3;
                                                } else {
                                                    eVar5 = eVar3;
                                                    if ((eVar5 instanceof C2004a) || (eVar4 instanceof C2004a)) {
                                                        i32 = 6;
                                                    }
                                                    iVar14 = iVar12;
                                                    c1982d.h(iVar14, iVar4, dVar.b(), i32);
                                                    iVar13 = iVar11;
                                                    c1982d.j(iVar13, iVar6, -dVar2.b(), i32);
                                                    i24 = i32;
                                                }
                                                i32 = i24;
                                                iVar14 = iVar12;
                                                c1982d.h(iVar14, iVar4, dVar.b(), i32);
                                                iVar13 = iVar11;
                                                c1982d.j(iVar13, iVar6, -dVar2.b(), i32);
                                                i24 = i32;
                                            } else {
                                                iVar13 = iVar11;
                                                eVar5 = eVar3;
                                                iVar14 = iVar12;
                                            }
                                            if (!z7 || !z14 || (eVar5 instanceof C2004a) || (eVar4 instanceof C2004a)) {
                                                i28 = i23;
                                                i29 = i24;
                                                z26 = z24;
                                            } else {
                                                i28 = 6;
                                                i29 = 6;
                                                z26 = z25;
                                            }
                                            if (z26) {
                                                if (!z22 || (z13 && !z8)) {
                                                    iMin2 = i28;
                                                } else {
                                                    if (eVar5 != eVar2 && eVar4 != eVar2) {
                                                        i43 = i28;
                                                    }
                                                    if ((eVar5 instanceof g) || (eVar4 instanceof g)) {
                                                        i43 = 5;
                                                    }
                                                    if ((eVar5 instanceof C2004a) || (eVar4 instanceof C2004a)) {
                                                        i43 = 5;
                                                    }
                                                    iMin2 = Math.max(z13 ? 5 : i43, i28);
                                                }
                                                if (z7) {
                                                    iMin2 = Math.min(i29, iMin2);
                                                    if (z11 && !z13 && (eVar5 == eVar2 || eVar4 == eVar2)) {
                                                        iMin2 = i27;
                                                    }
                                                }
                                                c1982d.e(iVar14, iVar4, dVar.b(), iMin2);
                                                c1982d.e(iVar13, iVar6, -dVar2.b(), iMin2);
                                            }
                                            if (z7) {
                                                i30 = i26;
                                                int iB2 = iVar == iVar4 ? dVar.b() : 0;
                                                if (iVar4 != iVar) {
                                                    c1982d.h(iVar14, iVar, iB2, 5);
                                                }
                                            } else {
                                                i30 = i26;
                                            }
                                            if (z7 && z17 && i9 == 0 && i19 == 0) {
                                                if (z17 && i25 == 3) {
                                                    i31 = 0;
                                                } else {
                                                    i31 = 0;
                                                    i30 = 5;
                                                }
                                                c1982d.h(iVar13, iVar14, i31, i30);
                                            }
                                        } else {
                                            i24 = i35;
                                            i22 = 6;
                                            z21 = z27;
                                            z20 = false;
                                            z19 = true;
                                            i23 = i36;
                                            if (z20) {
                                                z23 = z20;
                                                z24 = z19;
                                                if (z21) {
                                                }
                                                if (this.f21975f0 != i26) {
                                                }
                                            }
                                        }
                                    } else {
                                        if (i15 == 1) {
                                            i24 = 8;
                                            i22 = 6;
                                            z20 = true;
                                            z19 = true;
                                            i23 = 4;
                                            z22 = false;
                                            z21 = true;
                                        } else if (i15 != 3) {
                                            z19 = true;
                                            i22 = 6;
                                            z20 = false;
                                            i23 = 4;
                                            z22 = false;
                                            z21 = false;
                                        } else if (this.f22004u == -1) {
                                            i22 = z13 ? z7 ? 5 : 4 : 8;
                                            z20 = true;
                                            z19 = true;
                                            i23 = 5;
                                            z22 = true;
                                            z21 = true;
                                            i24 = 8;
                                        } else if (z11) {
                                            if (i12 != 2) {
                                                z19 = true;
                                                if (i12 != 1) {
                                                    i33 = 8;
                                                    i34 = 5;
                                                }
                                                i24 = i33;
                                                i23 = i34;
                                                z20 = z19;
                                                z22 = z20;
                                                z21 = z22;
                                                i22 = 6;
                                            } else {
                                                z19 = true;
                                            }
                                            i33 = 5;
                                            i34 = 4;
                                            i24 = i33;
                                            i23 = i34;
                                            z20 = z19;
                                            z22 = z20;
                                            z21 = z22;
                                            i22 = 6;
                                        } else {
                                            z19 = true;
                                            if (i17 > 0) {
                                                z20 = true;
                                                z22 = true;
                                                z21 = true;
                                                i22 = 6;
                                                i23 = 5;
                                            } else if (i17 != 0 || i19 != 0) {
                                                z20 = true;
                                                z22 = true;
                                                z21 = true;
                                                i22 = 6;
                                                i23 = 4;
                                            } else if (z13) {
                                                i24 = (eVar6 == eVarE || eVar7 == eVarE) ? 5 : 4;
                                                z20 = true;
                                                z22 = true;
                                                z21 = true;
                                                i22 = 6;
                                                i23 = 4;
                                            } else {
                                                z20 = true;
                                                z22 = true;
                                                z21 = true;
                                                i22 = 6;
                                                i23 = 8;
                                            }
                                        }
                                        if (z20) {
                                        }
                                    }
                                    i24 = 5;
                                    if (z20) {
                                    }
                                }
                                iVar13 = iVar5;
                            } else {
                                iVar13 = iVar5;
                            }
                            if (z7 && z18) {
                                if (dVar2.f21922d != null) {
                                    iB = dVar2.b();
                                    iVar15 = iVar2;
                                } else {
                                    iVar15 = iVar2;
                                    iB = 0;
                                }
                                if (iVar6 != iVar15) {
                                    c1982d.h(iVar15, iVar13, iB, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        iVar7 = iVar2;
                        iVar8 = iVar5;
                        iVar9 = iVarQ2;
                        iVar10 = iVar;
                        i21 = i18;
                        i20 = 8;
                        c7 = 2;
                        c8 = 1;
                    }
                    if (i21 >= c7 && z7 && z18) {
                        c1982d.h(iVar9, iVar10, 0, i20);
                        char c9 = (z6 || this.f21943F.f21922d == null) ? c8 : (char) 0;
                        if (z6 || (dVar3 = this.f21943F.f21922d) == null) {
                            c8 = c9;
                        } else {
                            e eVar8 = dVar3.f21920b;
                            if (eVar8.f21954Q != 0.0f) {
                                b[] bVarArr = eVar8.f21950M;
                                b bVar4 = bVarArr[0];
                                b bVar5 = b.MATCH_CONSTRAINT;
                                if (bVar4 != bVar5 || bVarArr[c8] != bVar5) {
                                    c8 = 0;
                                }
                            }
                        }
                        if (c8 != 0) {
                            c1982d.h(iVar7, iVar8, 0, i20);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (z7) {
                    c1982d.e(iVarQ3, iVarQ2, iMin, 8);
                } else {
                    c1982d.e(iVarQ3, iVarQ2, iMin, 5);
                    c1982d.j(iVarQ3, iVarQ2, iMin, 8);
                }
                iVar4 = iVarQ4;
                iVar5 = iVarQ3;
                i19 = i40;
            }
            z17 = z16;
            iVar6 = iVar3;
            z18 = z9;
            i18 = i37;
            if (z15) {
            }
            if (i21 >= c7) {
            }
        }
        z16 = false;
        if (this.f21975f0 != 8) {
        }
        if (z15) {
        }
        if (z16) {
        }
        z17 = z16;
        iVar6 = iVar3;
        z18 = z9;
        i18 = i37;
        if (z15) {
        }
        if (i21 >= c7) {
        }
    }

    public int A() {
        return this.f22007w[0];
    }

    public void A0(int i7) {
        this.f21952O = i7;
        int i8 = this.f21963Z;
        if (i7 < i8) {
            this.f21952O = i8;
        }
    }

    public int B() {
        return this.f21965a0;
    }

    public void B0(int i7) {
        this.f21956S = i7;
    }

    public int C() {
        return this.f21963Z;
    }

    public void C0(int i7) {
        this.f21957T = i7;
    }

    public e D(int i7) {
        d dVar;
        d dVar2;
        if (i7 != 0) {
            if (i7 == 1 && (dVar2 = (dVar = this.f21942E).f21922d) != null && dVar2.f21922d == dVar) {
                return dVar2.f21920b;
            }
            return null;
        }
        d dVar3 = this.f21941D;
        d dVar4 = dVar3.f21922d;
        if (dVar4 == null || dVar4.f21922d != dVar3) {
            return null;
        }
        return dVar4.f21920b;
    }

    public void D0(boolean z6, boolean z7, boolean z8, boolean z9) {
        if (this.f22004u == -1) {
            if (z8 && !z9) {
                this.f22004u = 0;
            } else if (!z8 && z9) {
                this.f22004u = 1;
                if (this.f21955R == -1) {
                    this.f22006v = 1.0f / this.f22006v;
                }
            }
        }
        if (this.f22004u == 0 && (!this.f21940C.i() || !this.f21942E.i())) {
            this.f22004u = 1;
        } else if (this.f22004u == 1 && (!this.f21939B.i() || !this.f21941D.i())) {
            this.f22004u = 0;
        }
        if (this.f22004u == -1 && (!this.f21940C.i() || !this.f21942E.i() || !this.f21939B.i() || !this.f21941D.i())) {
            if (this.f21940C.i() && this.f21942E.i()) {
                this.f22004u = 0;
            } else if (this.f21939B.i() && this.f21941D.i()) {
                this.f22006v = 1.0f / this.f22006v;
                this.f22004u = 1;
            }
        }
        if (this.f22004u == -1) {
            int i7 = this.f21992o;
            if (i7 > 0 && this.f21998r == 0) {
                this.f22004u = 0;
            } else {
                if (i7 != 0 || this.f21998r <= 0) {
                    return;
                }
                this.f22006v = 1.0f / this.f22006v;
                this.f22004u = 1;
            }
        }
    }

    public e E() {
        return this.f21951N;
    }

    public void E0(boolean z6, boolean z7) {
        int i7;
        int i8;
        boolean zK = z6 & this.f21972e.k();
        boolean zK2 = z7 & this.f21974f.k();
        s.j jVar = this.f21972e;
        int i9 = jVar.f22206h.f22170g;
        l lVar = this.f21974f;
        int i10 = lVar.f22206h.f22170g;
        int i11 = jVar.f22207i.f22170g;
        int i12 = lVar.f22207i.f22170g;
        int i13 = i12 - i10;
        if (i11 - i9 < 0 || i13 < 0 || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE) {
            i11 = 0;
            i9 = 0;
            i12 = 0;
            i10 = 0;
        }
        int i14 = i11 - i9;
        int i15 = i12 - i10;
        if (zK) {
            this.f21956S = i9;
        }
        if (zK2) {
            this.f21957T = i10;
        }
        if (this.f21975f0 == 8) {
            this.f21952O = 0;
            this.f21953P = 0;
            return;
        }
        if (zK) {
            if (this.f21950M[0] == b.FIXED && i14 < (i8 = this.f21952O)) {
                i14 = i8;
            }
            this.f21952O = i14;
            int i16 = this.f21963Z;
            if (i14 < i16) {
                this.f21952O = i16;
            }
        }
        if (zK2) {
            if (this.f21950M[1] == b.FIXED && i15 < (i7 = this.f21953P)) {
                i15 = i7;
            }
            this.f21953P = i15;
            int i17 = this.f21965a0;
            if (i15 < i17) {
                this.f21953P = i17;
            }
        }
    }

    public e F(int i7) {
        d dVar;
        d dVar2;
        if (i7 != 0) {
            if (i7 == 1 && (dVar2 = (dVar = this.f21940C).f21922d) != null && dVar2.f21922d == dVar) {
                return dVar2.f21920b;
            }
            return null;
        }
        d dVar3 = this.f21939B;
        d dVar4 = dVar3.f21922d;
        if (dVar4 == null || dVar4.f21922d != dVar3) {
            return null;
        }
        return dVar4.f21920b;
    }

    public void F0(C1982d c1982d) {
        int iX = c1982d.x(this.f21939B);
        int iX2 = c1982d.x(this.f21940C);
        int iX3 = c1982d.x(this.f21941D);
        int iX4 = c1982d.x(this.f21942E);
        s.j jVar = this.f21972e;
        s.f fVar = jVar.f22206h;
        if (fVar.f22173j) {
            s.f fVar2 = jVar.f22207i;
            if (fVar2.f22173j) {
                iX = fVar.f22170g;
                iX3 = fVar2.f22170g;
            }
        }
        l lVar = this.f21974f;
        s.f fVar3 = lVar.f22206h;
        if (fVar3.f22173j) {
            s.f fVar4 = lVar.f22207i;
            if (fVar4.f22173j) {
                iX2 = fVar3.f22170g;
                iX4 = fVar4.f22170g;
            }
        }
        int i7 = iX4 - iX2;
        if (iX3 - iX < 0 || i7 < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX = 0;
            iX4 = 0;
            iX2 = 0;
            iX3 = 0;
        }
        c0(iX, iX2, iX3, iX4);
    }

    public int G() {
        return O() + this.f21952O;
    }

    public m H(int i7) {
        if (i7 == 0) {
            return this.f21972e;
        }
        if (i7 == 1) {
            return this.f21974f;
        }
        return null;
    }

    public float I() {
        return this.f21969c0;
    }

    public int J() {
        return this.f21991n0;
    }

    public b K() {
        return this.f21950M[1];
    }

    public int L() {
        int i7 = this.f21939B != null ? this.f21940C.f21923e : 0;
        return this.f21941D != null ? i7 + this.f21942E.f21923e : i7;
    }

    public int M() {
        return this.f21975f0;
    }

    public int N() {
        if (this.f21975f0 == 8) {
            return 0;
        }
        return this.f21952O;
    }

    public int O() {
        e eVar = this.f21951N;
        return (eVar == null || !(eVar instanceof f)) ? this.f21956S : ((f) eVar).f22020C0 + this.f21956S;
    }

    public int P() {
        e eVar = this.f21951N;
        return (eVar == null || !(eVar instanceof f)) ? this.f21957T : ((f) eVar).f22021D0 + this.f21957T;
    }

    public boolean Q() {
        return this.f22009y;
    }

    public void R(d.b bVar, e eVar, d.b bVar2, int i7, int i8) {
        k(bVar).a(eVar.k(bVar2), i7, i8, true);
    }

    public boolean T() {
        d dVar = this.f21939B;
        d dVar2 = dVar.f21922d;
        if (dVar2 != null && dVar2.f21922d == dVar) {
            return true;
        }
        d dVar3 = this.f21941D;
        d dVar4 = dVar3.f21922d;
        return dVar4 != null && dVar4.f21922d == dVar3;
    }

    public boolean U() {
        return this.f22010z;
    }

    public boolean V() {
        d dVar = this.f21940C;
        d dVar2 = dVar.f21922d;
        if (dVar2 != null && dVar2.f21922d == dVar) {
            return true;
        }
        d dVar3 = this.f21942E;
        d dVar4 = dVar3.f21922d;
        return dVar4 != null && dVar4.f21922d == dVar3;
    }

    public void W() {
        this.f21939B.k();
        this.f21940C.k();
        this.f21941D.k();
        this.f21942E.k();
        this.f21943F.k();
        this.f21944G.k();
        this.f21945H.k();
        this.f21946I.k();
        this.f21951N = null;
        this.f22008x = 0.0f;
        this.f21952O = 0;
        this.f21953P = 0;
        this.f21954Q = 0.0f;
        this.f21955R = -1;
        this.f21956S = 0;
        this.f21957T = 0;
        this.f21960W = 0;
        this.f21961X = 0;
        this.f21962Y = 0;
        this.f21963Z = 0;
        this.f21965a0 = 0;
        float f7 = f21937v0;
        this.f21967b0 = f7;
        this.f21969c0 = f7;
        b[] bVarArr = this.f21950M;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f21971d0 = null;
        this.f21973e0 = 0;
        this.f21975f0 = 0;
        this.f21979h0 = null;
        this.f21981i0 = false;
        this.f21983j0 = false;
        this.f21989m0 = 0;
        this.f21991n0 = 0;
        this.f21993o0 = false;
        this.f21995p0 = false;
        float[] fArr = this.f21997q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f21982j = -1;
        this.f21984k = -1;
        int[] iArr = this.f22007w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f21986l = 0;
        this.f21988m = 0;
        this.f21996q = 1.0f;
        this.f22002t = 1.0f;
        this.f21994p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f22000s = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f21992o = 0;
        this.f21998r = 0;
        this.f21980i = false;
        this.f22004u = -1;
        this.f22006v = 1.0f;
        this.f21985k0 = false;
        this.f21987l0 = false;
        boolean[] zArr = this.f21976g;
        zArr[0] = true;
        zArr[1] = true;
        this.f21938A = false;
        boolean[] zArr2 = this.f21949L;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void X(C1981c c1981c) {
        this.f21939B.l(c1981c);
        this.f21940C.l(c1981c);
        this.f21941D.l(c1981c);
        this.f21942E.l(c1981c);
        this.f21943F.l(c1981c);
        this.f21946I.l(c1981c);
        this.f21944G.l(c1981c);
        this.f21945H.l(c1981c);
    }

    public void Y(int i7) {
        this.f21962Y = i7;
        this.f22009y = i7 > 0;
    }

    public void Z(Object obj) {
        this.f21971d0 = obj;
    }

    public void a0(String str) {
        this.f21977g0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b0(String str) {
        float fAbs;
        int i7 = 0;
        if (str == null || str.length() == 0) {
            this.f21954Q = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i8 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            i8 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            i = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
            String strSubstring2 = str.substring(i);
            fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : i7;
        } else {
            String strSubstring3 = str.substring(i, iIndexOf2);
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                float f7 = Float.parseFloat(strSubstring3);
                float f8 = Float.parseFloat(strSubstring4);
                if (f7 > 0.0f && f8 > 0.0f) {
                    fAbs = i8 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                }
            }
        }
        i7 = (fAbs > i7 ? 1 : (fAbs == i7 ? 0 : -1));
        if (i7 > 0) {
            this.f21954Q = fAbs;
            this.f21955R = i8;
        }
    }

    public void c0(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13 = i9 - i7;
        int i14 = i10 - i8;
        this.f21956S = i7;
        this.f21957T = i8;
        if (this.f21975f0 == 8) {
            this.f21952O = 0;
            this.f21953P = 0;
            return;
        }
        b[] bVarArr = this.f21950M;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i13 < (i12 = this.f21952O)) {
            i13 = i12;
        }
        if (bVarArr[1] == bVar2 && i14 < (i11 = this.f21953P)) {
            i14 = i11;
        }
        this.f21952O = i13;
        this.f21953P = i14;
        int i15 = this.f21965a0;
        if (i14 < i15) {
            this.f21953P = i15;
        }
        int i16 = this.f21963Z;
        if (i13 < i16) {
            this.f21952O = i16;
        }
    }

    public void d0(boolean z6) {
        this.f22009y = z6;
    }

    boolean e() {
        return this instanceof g;
    }

    public void e0(int i7) {
        this.f21953P = i7;
        int i8 = this.f21965a0;
        if (i7 < i8) {
            this.f21953P = i8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(C1982d c1982d) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        b bVar;
        boolean z12;
        q.i iVar;
        q.i iVar2;
        q.i iVar3;
        q.i iVar4;
        q.i iVar5;
        boolean z13;
        e eVar;
        s.f fVar;
        C1982d c1982d2;
        q.i iVar6;
        q.i iVar7;
        q.i iVar8;
        int i11;
        int i12;
        int i13;
        int i14;
        q.i iVar9;
        q.i iVar10;
        C1982d c1982d3;
        q.i iVar11;
        q.i iVar12;
        q.i iVar13;
        q.i iVar14;
        boolean z14;
        int i15;
        int i16;
        boolean zT;
        boolean zV;
        e eVar2 = this;
        q.i iVarQ = c1982d.q(eVar2.f21939B);
        q.i iVarQ2 = c1982d.q(eVar2.f21941D);
        q.i iVarQ3 = c1982d.q(eVar2.f21940C);
        q.i iVarQ4 = c1982d.q(eVar2.f21942E);
        q.i iVarQ5 = c1982d.q(eVar2.f21943F);
        boolean z15 = C1982d.f21681r;
        s.j jVar = eVar2.f21972e;
        s.f fVar2 = jVar.f22206h;
        if (fVar2.f22173j && jVar.f22207i.f22173j) {
            l lVar = eVar2.f21974f;
            if (lVar.f22206h.f22173j && lVar.f22207i.f22173j) {
                c1982d.f(iVarQ, fVar2.f22170g);
                c1982d.f(iVarQ2, eVar2.f21972e.f22207i.f22170g);
                c1982d.f(iVarQ3, eVar2.f21974f.f22206h.f22170g);
                c1982d.f(iVarQ4, eVar2.f21974f.f22207i.f22170g);
                c1982d.f(iVarQ5, eVar2.f21974f.f22196k.f22170g);
                e eVar3 = eVar2.f21951N;
                if (eVar3 != null) {
                    boolean z16 = eVar3 != null && eVar3.f21950M[0] == b.WRAP_CONTENT;
                    boolean z17 = eVar3 != null && eVar3.f21950M[1] == b.WRAP_CONTENT;
                    if (z16 && eVar2.f21976g[0] && !T()) {
                        c1982d.h(c1982d.q(eVar2.f21951N.f21941D), iVarQ2, 0, 8);
                    }
                    if (z17 && eVar2.f21976g[1] && !V()) {
                        c1982d.h(c1982d.q(eVar2.f21951N.f21942E), iVarQ4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        e eVar4 = eVar2.f21951N;
        if (eVar4 != null) {
            z7 = eVar4 != null && eVar4.f21950M[0] == b.WRAP_CONTENT;
            z6 = eVar4 != null && eVar4.f21950M[1] == b.WRAP_CONTENT;
            if (eVar2.S(0)) {
                ((f) eVar2.f21951N).J0(eVar2, 0);
                zT = true;
            } else {
                zT = T();
            }
            if (eVar2.S(1)) {
                ((f) eVar2.f21951N).J0(eVar2, 1);
                zV = true;
            } else {
                zV = V();
            }
            if (!zT && z7 && eVar2.f21975f0 != 8 && eVar2.f21939B.f21922d == null && eVar2.f21941D.f21922d == null) {
                c1982d.h(c1982d.q(eVar2.f21951N.f21941D), iVarQ2, 0, 1);
            }
            if (!zV && z6 && eVar2.f21975f0 != 8 && eVar2.f21940C.f21922d == null && eVar2.f21942E.f21922d == null && eVar2.f21943F == null) {
                c1982d.h(c1982d.q(eVar2.f21951N.f21942E), iVarQ4, 0, 1);
            }
            z9 = zT;
            z8 = zV;
        } else {
            z6 = false;
            z7 = false;
            z8 = false;
            z9 = false;
        }
        int i17 = eVar2.f21952O;
        int i18 = eVar2.f21963Z;
        if (i17 >= i18) {
            i18 = i17;
        }
        int i19 = eVar2.f21953P;
        int i20 = eVar2.f21965a0;
        if (i19 >= i20) {
            i20 = i19;
        }
        b[] bVarArr = eVar2.f21950M;
        b bVar2 = bVarArr[0];
        b bVar3 = b.MATCH_CONSTRAINT;
        boolean z18 = bVar2 != bVar3;
        b bVar4 = bVarArr[1];
        boolean z19 = bVar4 != bVar3;
        int i21 = eVar2.f21955R;
        eVar2.f22004u = i21;
        int i22 = i18;
        float f7 = eVar2.f21954Q;
        eVar2.f22006v = f7;
        int i23 = i20;
        int i24 = eVar2.f21986l;
        int i25 = eVar2.f21988m;
        if (f7 <= 0.0f || eVar2.f21975f0 == 8) {
            i7 = i25;
            i8 = i24;
            i9 = i22;
        } else {
            if (bVar2 == bVar3 && i24 == 0) {
                i24 = 3;
            }
            if (bVar4 == bVar3 && i25 == 0) {
                i25 = 3;
            }
            if (bVar2 == bVar3 && bVar4 == bVar3 && i24 == 3 && i25 == 3) {
                eVar2.D0(z7, z6, z18, z19);
            } else if (bVar2 == bVar3 && i24 == 3) {
                eVar2.f22004u = 0;
                i9 = (int) (f7 * i19);
                if (bVar4 != bVar3) {
                    i8 = 4;
                    i7 = i25;
                } else {
                    i7 = i25;
                    i8 = i24;
                    i10 = i23;
                    z10 = true;
                    int[] iArr = eVar2.f21990n;
                    iArr[0] = i8;
                    iArr[1] = i7;
                    eVar2.f21980i = z10;
                    if (z10) {
                    }
                    b bVar5 = eVar2.f21950M[0];
                    b bVar6 = b.WRAP_CONTENT;
                    if (bVar5 == bVar6) {
                    }
                    if (z) {
                    }
                    boolean z20 = !eVar2.f21946I.i();
                    boolean[] zArr = eVar2.f21949L;
                    boolean z21 = zArr[0];
                    boolean z22 = zArr[1];
                    if (eVar2.f21982j != 2) {
                    }
                    eVar = this;
                    l lVar2 = eVar.f21974f;
                    fVar = lVar2.f22206h;
                    if (fVar.f22173j) {
                    }
                    if ((eVar.f21984k != 2 ? i12 : i14) == 0) {
                    }
                    if (z12) {
                    }
                    if (this.f21946I.i()) {
                    }
                }
            } else if (bVar4 == bVar3 && i25 == 3) {
                eVar2.f22004u = 1;
                if (i21 == -1) {
                    eVar2.f22006v = 1.0f / f7;
                }
                int i26 = (int) (eVar2.f22006v * i17);
                if (bVar2 != bVar3) {
                    i7 = 4;
                    i10 = i26;
                    i8 = i24;
                    i9 = i22;
                    z10 = false;
                    int[] iArr2 = eVar2.f21990n;
                    iArr2[0] = i8;
                    iArr2[1] = i7;
                    eVar2.f21980i = z10;
                    boolean z23 = z10 && ((i16 = eVar2.f22004u) == 0 || i16 == -1);
                    b bVar52 = eVar2.f21950M[0];
                    b bVar62 = b.WRAP_CONTENT;
                    boolean z24 = bVar52 == bVar62 && (eVar2 instanceof f);
                    int i27 = z24 ? 0 : i9;
                    boolean z202 = !eVar2.f21946I.i();
                    boolean[] zArr2 = eVar2.f21949L;
                    boolean z212 = zArr2[0];
                    boolean z222 = zArr2[1];
                    if (eVar2.f21982j != 2) {
                        s.j jVar2 = eVar2.f21972e;
                        s.f fVar3 = jVar2.f22206h;
                        if (fVar3.f22173j && jVar2.f22207i.f22173j) {
                            c1982d.f(iVarQ, fVar3.f22170g);
                            c1982d.f(iVarQ2, eVar2.f21972e.f22207i.f22170g);
                            if (eVar2.f21951N != null && z7 && eVar2.f21976g[0] && !T()) {
                                c1982d.h(c1982d.q(eVar2.f21951N.f21941D), iVarQ2, 0, 8);
                            }
                            z11 = z6;
                            z13 = z7;
                            bVar = bVar62;
                            z12 = z10;
                            iVar4 = iVarQ2;
                            iVar5 = iVarQ;
                            iVar = iVarQ5;
                            iVar2 = iVarQ4;
                            iVar3 = iVarQ3;
                            eVar = eVar2;
                            l lVar22 = eVar.f21974f;
                            fVar = lVar22.f22206h;
                            if (fVar.f22173j || !lVar22.f22207i.f22173j) {
                                c1982d2 = c1982d;
                                iVar6 = iVar;
                                iVar7 = iVar2;
                                iVar8 = iVar3;
                                i11 = 8;
                                i12 = 0;
                                i13 = 1;
                                i14 = 1;
                            } else {
                                c1982d2 = c1982d;
                                iVar8 = iVar3;
                                c1982d2.f(iVar8, fVar.f22170g);
                                iVar7 = iVar2;
                                c1982d2.f(iVar7, eVar.f21974f.f22207i.f22170g);
                                iVar6 = iVar;
                                c1982d2.f(iVar6, eVar.f21974f.f22196k.f22170g);
                                e eVar5 = eVar.f21951N;
                                if (eVar5 == null || z8 || !z11) {
                                    i11 = 8;
                                    i12 = 0;
                                    i13 = 1;
                                } else {
                                    i13 = 1;
                                    if (eVar.f21976g[1]) {
                                        i11 = 8;
                                        i12 = 0;
                                        c1982d2.h(c1982d2.q(eVar5.f21942E), iVar7, 0, 8);
                                    } else {
                                        i11 = 8;
                                        i12 = 0;
                                    }
                                }
                                i14 = i12;
                            }
                            if ((eVar.f21984k != 2 ? i12 : i14) == 0) {
                                int i28 = (eVar.f21950M[i13] == bVar && (eVar instanceof f)) ? i13 : i12;
                                if (i28 != 0) {
                                    i10 = i12;
                                }
                                int i29 = (z12 && ((i15 = eVar.f22004u) == i13 || i15 == -1)) ? i13 : i12;
                                e eVar6 = eVar.f21951N;
                                q.i iVarQ6 = eVar6 != null ? c1982d2.q(eVar6.f21942E) : null;
                                e eVar7 = eVar.f21951N;
                                q.i iVarQ7 = eVar7 != null ? c1982d2.q(eVar7.f21940C) : null;
                                if (eVar.f21962Y > 0 || eVar.f21975f0 == i11) {
                                    c1982d2.e(iVar6, iVar8, l(), i11);
                                    d dVar = eVar.f21943F.f21922d;
                                    if (dVar != null) {
                                        c1982d2.e(iVar6, c1982d2.q(dVar), i12, i11);
                                        if (z11) {
                                            c1982d2.h(iVarQ6, c1982d2.q(eVar.f21942E), i12, 5);
                                        }
                                        z14 = i12;
                                        boolean z25 = z13;
                                        iVar9 = iVar7;
                                        iVar10 = iVar8;
                                        h(c1982d, false, z11, z25, eVar.f21976g[i13], iVarQ7, iVarQ6, eVar.f21950M[i13], i28, eVar.f21940C, eVar.f21942E, eVar.f21957T, i10, eVar.f21965a0, eVar.f22007w[i13], eVar.f21969c0, i29, z8, z9, z222, i7, i8, eVar.f21998r, eVar.f22000s, eVar.f22002t, z14);
                                    } else {
                                        if (eVar.f21975f0 == i11) {
                                            c1982d2.e(iVar6, iVar8, i12, i11);
                                        }
                                        z14 = z202;
                                        boolean z252 = z13;
                                        iVar9 = iVar7;
                                        iVar10 = iVar8;
                                        h(c1982d, false, z11, z252, eVar.f21976g[i13], iVarQ7, iVarQ6, eVar.f21950M[i13], i28, eVar.f21940C, eVar.f21942E, eVar.f21957T, i10, eVar.f21965a0, eVar.f22007w[i13], eVar.f21969c0, i29, z8, z9, z222, i7, i8, eVar.f21998r, eVar.f22000s, eVar.f22002t, z14);
                                    }
                                } else {
                                    z14 = z202;
                                    boolean z2522 = z13;
                                    iVar9 = iVar7;
                                    iVar10 = iVar8;
                                    h(c1982d, false, z11, z2522, eVar.f21976g[i13], iVarQ7, iVarQ6, eVar.f21950M[i13], i28, eVar.f21940C, eVar.f21942E, eVar.f21957T, i10, eVar.f21965a0, eVar.f22007w[i13], eVar.f21969c0, i29, z8, z9, z222, i7, i8, eVar.f21998r, eVar.f22000s, eVar.f22002t, z14);
                                }
                            } else {
                                iVar9 = iVar7;
                                iVar10 = iVar8;
                            }
                            if (z12) {
                                int i30 = this.f22004u;
                                float f8 = this.f22006v;
                                if (i30 == 1) {
                                    c1982d3 = c1982d;
                                    iVar11 = iVar9;
                                    iVar12 = iVar10;
                                    iVar13 = iVar4;
                                    iVar14 = iVar5;
                                } else {
                                    c1982d3 = c1982d;
                                    iVar11 = iVar4;
                                    iVar12 = iVar5;
                                    iVar13 = iVar9;
                                    iVar14 = iVar10;
                                }
                                c1982d3.k(iVar11, iVar12, iVar13, iVar14, f8, 8);
                            }
                            if (this.f21946I.i()) {
                                return;
                            }
                            c1982d.b(this, this.f21946I.f().d(), (float) Math.toRadians(this.f22008x + 90.0f), this.f21946I.b());
                            return;
                        }
                        e eVar8 = eVar2.f21951N;
                        q.i iVarQ8 = eVar8 != null ? c1982d.q(eVar8.f21941D) : null;
                        e eVar9 = eVar2.f21951N;
                        z13 = z7;
                        iVar4 = iVarQ2;
                        iVar5 = iVarQ;
                        z11 = z6;
                        iVar = iVarQ5;
                        iVar2 = iVarQ4;
                        iVar3 = iVarQ3;
                        bVar = bVar62;
                        z12 = z10;
                        h(c1982d, true, z13, z11, eVar2.f21976g[0], eVar9 != null ? c1982d.q(eVar9.f21939B) : null, iVarQ8, eVar2.f21950M[0], z24, eVar2.f21939B, eVar2.f21941D, eVar2.f21956S, i27, eVar2.f21963Z, eVar2.f22007w[0], eVar2.f21967b0, z23, z9, z8, z212, i8, i7, eVar2.f21992o, eVar2.f21994p, eVar2.f21996q, z202);
                    } else {
                        z11 = z6;
                        bVar = bVar62;
                        z12 = z10;
                        iVar = iVarQ5;
                        iVar2 = iVarQ4;
                        iVar3 = iVarQ3;
                        iVar4 = iVarQ2;
                        iVar5 = iVarQ;
                        z13 = z7;
                    }
                    eVar = this;
                    l lVar222 = eVar.f21974f;
                    fVar = lVar222.f22206h;
                    if (fVar.f22173j) {
                        c1982d2 = c1982d;
                        iVar6 = iVar;
                        iVar7 = iVar2;
                        iVar8 = iVar3;
                        i11 = 8;
                        i12 = 0;
                        i13 = 1;
                        i14 = 1;
                    }
                    if ((eVar.f21984k != 2 ? i12 : i14) == 0) {
                    }
                    if (z12) {
                    }
                    if (this.f21946I.i()) {
                    }
                } else {
                    i10 = i26;
                    i7 = i25;
                    i8 = i24;
                    i9 = i22;
                    z10 = true;
                    int[] iArr22 = eVar2.f21990n;
                    iArr22[0] = i8;
                    iArr22[1] = i7;
                    eVar2.f21980i = z10;
                    if (z10) {
                    }
                    b bVar522 = eVar2.f21950M[0];
                    b bVar622 = b.WRAP_CONTENT;
                    if (bVar522 == bVar622) {
                    }
                    if (z24) {
                    }
                    boolean z2022 = !eVar2.f21946I.i();
                    boolean[] zArr22 = eVar2.f21949L;
                    boolean z2122 = zArr22[0];
                    boolean z2222 = zArr22[1];
                    if (eVar2.f21982j != 2) {
                    }
                    eVar = this;
                    l lVar2222 = eVar.f21974f;
                    fVar = lVar2222.f22206h;
                    if (fVar.f22173j) {
                    }
                    if ((eVar.f21984k != 2 ? i12 : i14) == 0) {
                    }
                    if (z12) {
                    }
                    if (this.f21946I.i()) {
                    }
                }
            }
            i7 = i25;
            i8 = i24;
            i9 = i22;
            i10 = i23;
            z10 = true;
            int[] iArr222 = eVar2.f21990n;
            iArr222[0] = i8;
            iArr222[1] = i7;
            eVar2.f21980i = z10;
            if (z10) {
            }
            b bVar5222 = eVar2.f21950M[0];
            b bVar6222 = b.WRAP_CONTENT;
            if (bVar5222 == bVar6222) {
            }
            if (z24) {
            }
            boolean z20222 = !eVar2.f21946I.i();
            boolean[] zArr222 = eVar2.f21949L;
            boolean z21222 = zArr222[0];
            boolean z22222 = zArr222[1];
            if (eVar2.f21982j != 2) {
            }
            eVar = this;
            l lVar22222 = eVar.f21974f;
            fVar = lVar22222.f22206h;
            if (fVar.f22173j) {
            }
            if ((eVar.f21984k != 2 ? i12 : i14) == 0) {
            }
            if (z12) {
            }
            if (this.f21946I.i()) {
            }
        }
        i10 = i23;
        z10 = false;
        int[] iArr2222 = eVar2.f21990n;
        iArr2222[0] = i8;
        iArr2222[1] = i7;
        eVar2.f21980i = z10;
        if (z10) {
        }
        b bVar52222 = eVar2.f21950M[0];
        b bVar62222 = b.WRAP_CONTENT;
        if (bVar52222 == bVar62222) {
        }
        if (z24) {
        }
        boolean z202222 = !eVar2.f21946I.i();
        boolean[] zArr2222 = eVar2.f21949L;
        boolean z212222 = zArr2222[0];
        boolean z222222 = zArr2222[1];
        if (eVar2.f21982j != 2) {
        }
        eVar = this;
        l lVar222222 = eVar.f21974f;
        fVar = lVar222222.f22206h;
        if (fVar.f22173j) {
        }
        if ((eVar.f21984k != 2 ? i12 : i14) == 0) {
        }
        if (z12) {
        }
        if (this.f21946I.i()) {
        }
    }

    public void f0(float f7) {
        this.f21967b0 = f7;
    }

    public boolean g() {
        return this.f21975f0 != 8;
    }

    public void g0(int i7) {
        this.f21989m0 = i7;
    }

    public void h0(int i7, int i8) {
        this.f21956S = i7;
        int i9 = i8 - i7;
        this.f21952O = i9;
        int i10 = this.f21963Z;
        if (i9 < i10) {
            this.f21952O = i10;
        }
    }

    public void i(e eVar, float f7, int i7) {
        d.b bVar = d.b.CENTER;
        R(bVar, eVar, bVar, i7, 0);
        this.f22008x = f7;
    }

    public void i0(b bVar) {
        this.f21950M[0] = bVar;
    }

    public void j(C1982d c1982d) {
        c1982d.q(this.f21939B);
        c1982d.q(this.f21940C);
        c1982d.q(this.f21941D);
        c1982d.q(this.f21942E);
        if (this.f21962Y > 0) {
            c1982d.q(this.f21943F);
        }
    }

    public void j0(int i7, int i8, int i9, float f7) {
        this.f21986l = i7;
        this.f21992o = i8;
        if (i9 == Integer.MAX_VALUE) {
            i9 = 0;
        }
        this.f21994p = i9;
        this.f21996q = f7;
        if (f7 <= 0.0f || f7 >= 1.0f || i7 != 0) {
            return;
        }
        this.f21986l = 2;
    }

    public d k(d.b bVar) {
        switch (a.f22011a[bVar.ordinal()]) {
            case 1:
                return this.f21939B;
            case 2:
                return this.f21940C;
            case 3:
                return this.f21941D;
            case 4:
                return this.f21942E;
            case 5:
                return this.f21943F;
            case 6:
                return this.f21946I;
            case 7:
                return this.f21944G;
            case 8:
                return this.f21945H;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void k0(float f7) {
        this.f21997q0[0] = f7;
    }

    public int l() {
        return this.f21962Y;
    }

    protected void l0(int i7, boolean z6) {
        this.f21949L[i7] = z6;
    }

    public float m(int i7) {
        if (i7 == 0) {
            return this.f21967b0;
        }
        if (i7 == 1) {
            return this.f21969c0;
        }
        return -1.0f;
    }

    public void m0(boolean z6) {
        this.f22010z = z6;
    }

    public int n() {
        return P() + this.f21953P;
    }

    public void n0(int i7) {
        this.f22007w[1] = i7;
    }

    public Object o() {
        return this.f21971d0;
    }

    public void o0(int i7) {
        this.f22007w[0] = i7;
    }

    public String p() {
        return this.f21977g0;
    }

    public void p0(int i7) {
        if (i7 < 0) {
            i7 = 0;
        }
        this.f21965a0 = i7;
    }

    public b q(int i7) {
        if (i7 == 0) {
            return w();
        }
        if (i7 == 1) {
            return K();
        }
        return null;
    }

    public void q0(int i7) {
        if (i7 < 0) {
            i7 = 0;
        }
        this.f21963Z = i7;
    }

    public float r() {
        return this.f21954Q;
    }

    public void r0(int i7, int i8) {
        this.f21956S = i7;
        this.f21957T = i8;
    }

    public int s() {
        return this.f21955R;
    }

    public void s0(e eVar) {
        this.f21951N = eVar;
    }

    public int t() {
        if (this.f21975f0 == 8) {
            return 0;
        }
        return this.f21953P;
    }

    public void t0(float f7) {
        this.f21969c0 = f7;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f21979h0 != null) {
            str = "type: " + this.f21979h0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f21977g0 != null) {
            str2 = "id: " + this.f21977g0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f21956S);
        sb.append(", ");
        sb.append(this.f21957T);
        sb.append(") - (");
        sb.append(this.f21952O);
        sb.append(" x ");
        sb.append(this.f21953P);
        sb.append(")");
        return sb.toString();
    }

    public float u() {
        return this.f21967b0;
    }

    public void u0(int i7) {
        this.f21991n0 = i7;
    }

    public int v() {
        return this.f21989m0;
    }

    public void v0(int i7, int i8) {
        this.f21957T = i7;
        int i9 = i8 - i7;
        this.f21953P = i9;
        int i10 = this.f21965a0;
        if (i9 < i10) {
            this.f21953P = i10;
        }
    }

    public b w() {
        return this.f21950M[0];
    }

    public void w0(b bVar) {
        this.f21950M[1] = bVar;
    }

    public int x() {
        d dVar = this.f21939B;
        int i7 = dVar != null ? dVar.f21923e : 0;
        d dVar2 = this.f21941D;
        return dVar2 != null ? i7 + dVar2.f21923e : i7;
    }

    public void x0(int i7, int i8, int i9, float f7) {
        this.f21988m = i7;
        this.f21998r = i8;
        if (i9 == Integer.MAX_VALUE) {
            i9 = 0;
        }
        this.f22000s = i9;
        this.f22002t = f7;
        if (f7 <= 0.0f || f7 >= 1.0f || i7 != 0) {
            return;
        }
        this.f21988m = 2;
    }

    public int y(int i7) {
        if (i7 == 0) {
            return N();
        }
        if (i7 == 1) {
            return t();
        }
        return 0;
    }

    public void y0(float f7) {
        this.f21997q0[1] = f7;
    }

    public int z() {
        return this.f22007w[1];
    }

    public void z0(int i7) {
        this.f21975f0 = i7;
    }
}
