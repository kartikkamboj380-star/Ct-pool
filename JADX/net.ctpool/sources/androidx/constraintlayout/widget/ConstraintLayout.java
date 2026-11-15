package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.HashMap;
import r.d;
import r.e;
import s.C2032b;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f6273A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f6274B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f6275C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f6276D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f6277E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private SparseArray f6278F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    c f6279G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f6280H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f6281I;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    SparseArray f6282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList f6283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected r.f f6284o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f6285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f6286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f6289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f6290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private d f6291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f6292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f6293x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private HashMap f6294y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f6295z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6296a;

        static {
            int[] iArr = new int[e.b.values().length];
            f6296a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6296a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6296a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6296a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public float f6297A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public String f6298B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        float f6299C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f6300D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f6301E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f6302F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f6303G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f6304H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f6305I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f6306J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f6307K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f6308L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f6309M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f6310N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f6311O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f6312P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f6313Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f6314R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f6315S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f6316T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public boolean f6317U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public String f6318V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        boolean f6319W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        boolean f6320X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        boolean f6321Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        boolean f6322Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6323a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        boolean f6324a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6325b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        boolean f6326b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f6327c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        boolean f6328c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6329d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        int f6330d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6331e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        int f6332e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6333f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        int f6334f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f6335g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        int f6336g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6337h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        int f6338h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6339i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        int f6340i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6341j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        float f6342j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6343k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        int f6344k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6345l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f6346l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f6347m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        float f6348m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f6349n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        r.e f6350n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f6351o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f6352o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f6353p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6354q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f6355r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6356s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f6357t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f6358u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6359v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f6360w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f6361x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f6362y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f6363z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f6364a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f6364a = sparseIntArray;
                sparseIntArray.append(g.f6575K1, 8);
                sparseIntArray.append(g.f6581L1, 9);
                sparseIntArray.append(g.f6593N1, 10);
                sparseIntArray.append(g.f6599O1, 11);
                sparseIntArray.append(g.f6635U1, 12);
                sparseIntArray.append(g.f6629T1, 13);
                sparseIntArray.append(g.f6774s1, 14);
                sparseIntArray.append(g.f6768r1, 15);
                sparseIntArray.append(g.f6756p1, 16);
                sparseIntArray.append(g.f6780t1, 2);
                sparseIntArray.append(g.f6792v1, 3);
                sparseIntArray.append(g.f6786u1, 4);
                sparseIntArray.append(g.f6679c2, 49);
                sparseIntArray.append(g.f6685d2, 50);
                sparseIntArray.append(g.f6816z1, 5);
                sparseIntArray.append(g.f6515A1, 6);
                sparseIntArray.append(g.f6521B1, 7);
                sparseIntArray.append(g.f6672b1, 1);
                sparseIntArray.append(g.f6605P1, 17);
                sparseIntArray.append(g.f6611Q1, 18);
                sparseIntArray.append(g.f6810y1, 19);
                sparseIntArray.append(g.f6804x1, 20);
                sparseIntArray.append(g.f6703g2, 21);
                sparseIntArray.append(g.f6721j2, 22);
                sparseIntArray.append(g.f6709h2, 23);
                sparseIntArray.append(g.f6691e2, 24);
                sparseIntArray.append(g.f6715i2, 25);
                sparseIntArray.append(g.f6697f2, 26);
                sparseIntArray.append(g.f6551G1, 29);
                sparseIntArray.append(g.f6641V1, 30);
                sparseIntArray.append(g.f6798w1, 44);
                sparseIntArray.append(g.f6563I1, 45);
                sparseIntArray.append(g.f6651X1, 46);
                sparseIntArray.append(g.f6557H1, 47);
                sparseIntArray.append(g.f6646W1, 48);
                sparseIntArray.append(g.f6744n1, 27);
                sparseIntArray.append(g.f6738m1, 28);
                sparseIntArray.append(g.f6656Y1, 31);
                sparseIntArray.append(g.f6527C1, 32);
                sparseIntArray.append(g.f6667a2, 33);
                sparseIntArray.append(g.f6661Z1, 34);
                sparseIntArray.append(g.f6673b2, 35);
                sparseIntArray.append(g.f6539E1, 36);
                sparseIntArray.append(g.f6533D1, 37);
                sparseIntArray.append(g.f6545F1, 38);
                sparseIntArray.append(g.f6569J1, 39);
                sparseIntArray.append(g.f6623S1, 40);
                sparseIntArray.append(g.f6587M1, 41);
                sparseIntArray.append(g.f6762q1, 42);
                sparseIntArray.append(g.f6750o1, 43);
                sparseIntArray.append(g.f6617R1, 51);
            }
        }

        public b(int i7, int i8) {
            super(i7, i8);
            this.f6323a = -1;
            this.f6325b = -1;
            this.f6327c = -1.0f;
            this.f6329d = -1;
            this.f6331e = -1;
            this.f6333f = -1;
            this.f6335g = -1;
            this.f6337h = -1;
            this.f6339i = -1;
            this.f6341j = -1;
            this.f6343k = -1;
            this.f6345l = -1;
            this.f6347m = -1;
            this.f6349n = 0;
            this.f6351o = 0.0f;
            this.f6353p = -1;
            this.f6354q = -1;
            this.f6355r = -1;
            this.f6356s = -1;
            this.f6357t = -1;
            this.f6358u = -1;
            this.f6359v = -1;
            this.f6360w = -1;
            this.f6361x = -1;
            this.f6362y = -1;
            this.f6363z = 0.5f;
            this.f6297A = 0.5f;
            this.f6298B = null;
            this.f6299C = 0.0f;
            this.f6300D = 1;
            this.f6301E = -1.0f;
            this.f6302F = -1.0f;
            this.f6303G = 0;
            this.f6304H = 0;
            this.f6305I = 0;
            this.f6306J = 0;
            this.f6307K = 0;
            this.f6308L = 0;
            this.f6309M = 0;
            this.f6310N = 0;
            this.f6311O = 1.0f;
            this.f6312P = 1.0f;
            this.f6313Q = -1;
            this.f6314R = -1;
            this.f6315S = -1;
            this.f6316T = false;
            this.f6317U = false;
            this.f6318V = null;
            this.f6319W = true;
            this.f6320X = true;
            this.f6321Y = false;
            this.f6322Z = false;
            this.f6324a0 = false;
            this.f6326b0 = false;
            this.f6328c0 = false;
            this.f6330d0 = -1;
            this.f6332e0 = -1;
            this.f6334f0 = -1;
            this.f6336g0 = -1;
            this.f6338h0 = -1;
            this.f6340i0 = -1;
            this.f6342j0 = 0.5f;
            this.f6350n0 = new r.e();
            this.f6352o0 = false;
        }

        public void a() {
            this.f6322Z = false;
            this.f6319W = true;
            this.f6320X = true;
            int i7 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i7 == -2 && this.f6316T) {
                this.f6319W = false;
                if (this.f6305I == 0) {
                    this.f6305I = 1;
                }
            }
            int i8 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i8 == -2 && this.f6317U) {
                this.f6320X = false;
                if (this.f6306J == 0) {
                    this.f6306J = 1;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.f6319W = false;
                if (i7 == 0 && this.f6305I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f6316T = true;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f6320X = false;
                if (i8 == 0 && this.f6306J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f6317U = true;
                }
            }
            if (this.f6327c == -1.0f && this.f6323a == -1 && this.f6325b == -1) {
                return;
            }
            this.f6322Z = true;
            this.f6319W = true;
            this.f6320X = true;
            if (!(this.f6350n0 instanceof r.g)) {
                this.f6350n0 = new r.g();
            }
            ((r.g) this.f6350n0).N0(this.f6315S);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void resolveLayoutDirection(int i7) {
            int i8;
            int i9;
            int i10;
            int i11;
            int i12 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i13 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i7);
            boolean z6 = false;
            boolean z7 = 1 == getLayoutDirection();
            this.f6334f0 = -1;
            this.f6336g0 = -1;
            this.f6330d0 = -1;
            this.f6332e0 = -1;
            this.f6338h0 = this.f6357t;
            this.f6340i0 = this.f6359v;
            float f7 = this.f6363z;
            this.f6342j0 = f7;
            int i14 = this.f6323a;
            this.f6344k0 = i14;
            int i15 = this.f6325b;
            this.f6346l0 = i15;
            float f8 = this.f6327c;
            this.f6348m0 = f8;
            if (z7) {
                int i16 = this.f6353p;
                if (i16 != -1) {
                    this.f6334f0 = i16;
                } else {
                    int i17 = this.f6354q;
                    if (i17 != -1) {
                        this.f6336g0 = i17;
                    }
                    i8 = this.f6355r;
                    if (i8 != -1) {
                        this.f6332e0 = i8;
                        z6 = true;
                    }
                    i9 = this.f6356s;
                    if (i9 != -1) {
                        this.f6330d0 = i9;
                        z6 = true;
                    }
                    i10 = this.f6361x;
                    if (i10 != -1) {
                        this.f6340i0 = i10;
                    }
                    i11 = this.f6362y;
                    if (i11 != -1) {
                        this.f6338h0 = i11;
                    }
                    if (z6) {
                        this.f6342j0 = 1.0f - f7;
                    }
                    if (this.f6322Z && this.f6315S == 1) {
                        if (f8 == -1.0f) {
                            this.f6348m0 = 1.0f - f8;
                            this.f6344k0 = -1;
                            this.f6346l0 = -1;
                        } else {
                            if (i14 != -1) {
                                this.f6346l0 = i14;
                                this.f6344k0 = -1;
                            } else if (i15 != -1) {
                                this.f6344k0 = i15;
                                this.f6346l0 = -1;
                            }
                            this.f6348m0 = -1.0f;
                        }
                    }
                }
                z6 = true;
                i8 = this.f6355r;
                if (i8 != -1) {
                }
                i9 = this.f6356s;
                if (i9 != -1) {
                }
                i10 = this.f6361x;
                if (i10 != -1) {
                }
                i11 = this.f6362y;
                if (i11 != -1) {
                }
                if (z6) {
                }
                if (this.f6322Z) {
                    if (f8 == -1.0f) {
                    }
                }
            } else {
                int i18 = this.f6353p;
                if (i18 != -1) {
                    this.f6332e0 = i18;
                }
                int i19 = this.f6354q;
                if (i19 != -1) {
                    this.f6330d0 = i19;
                }
                int i20 = this.f6355r;
                if (i20 != -1) {
                    this.f6334f0 = i20;
                }
                int i21 = this.f6356s;
                if (i21 != -1) {
                    this.f6336g0 = i21;
                }
                int i22 = this.f6361x;
                if (i22 != -1) {
                    this.f6338h0 = i22;
                }
                int i23 = this.f6362y;
                if (i23 != -1) {
                    this.f6340i0 = i23;
                }
            }
            if (this.f6355r == -1 && this.f6356s == -1 && this.f6354q == -1 && this.f6353p == -1) {
                int i24 = this.f6333f;
                if (i24 != -1) {
                    this.f6334f0 = i24;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i13;
                    }
                } else {
                    int i25 = this.f6335g;
                    if (i25 != -1) {
                        this.f6336g0 = i25;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                        }
                    }
                }
                int i26 = this.f6329d;
                if (i26 != -1) {
                    this.f6330d0 = i26;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                        return;
                    }
                } else {
                    int i27 = this.f6331e;
                    if (i27 == -1) {
                        return;
                    }
                    this.f6332e0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i12;
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            String str;
            int i7;
            float fAbs;
            super(context, attributeSet);
            this.f6323a = -1;
            this.f6325b = -1;
            this.f6327c = -1.0f;
            this.f6329d = -1;
            this.f6331e = -1;
            this.f6333f = -1;
            this.f6335g = -1;
            this.f6337h = -1;
            this.f6339i = -1;
            this.f6341j = -1;
            this.f6343k = -1;
            this.f6345l = -1;
            this.f6347m = -1;
            this.f6349n = 0;
            this.f6351o = 0.0f;
            this.f6353p = -1;
            this.f6354q = -1;
            this.f6355r = -1;
            this.f6356s = -1;
            this.f6357t = -1;
            this.f6358u = -1;
            this.f6359v = -1;
            this.f6360w = -1;
            this.f6361x = -1;
            this.f6362y = -1;
            this.f6363z = 0.5f;
            this.f6297A = 0.5f;
            this.f6298B = null;
            this.f6299C = 0.0f;
            this.f6300D = 1;
            this.f6301E = -1.0f;
            this.f6302F = -1.0f;
            this.f6303G = 0;
            this.f6304H = 0;
            this.f6305I = 0;
            this.f6306J = 0;
            this.f6307K = 0;
            this.f6308L = 0;
            this.f6309M = 0;
            this.f6310N = 0;
            this.f6311O = 1.0f;
            this.f6312P = 1.0f;
            this.f6313Q = -1;
            this.f6314R = -1;
            this.f6315S = -1;
            this.f6316T = false;
            this.f6317U = false;
            this.f6318V = null;
            this.f6319W = true;
            this.f6320X = true;
            this.f6321Y = false;
            this.f6322Z = false;
            this.f6324a0 = false;
            this.f6326b0 = false;
            this.f6328c0 = false;
            this.f6330d0 = -1;
            this.f6332e0 = -1;
            this.f6334f0 = -1;
            this.f6336g0 = -1;
            this.f6338h0 = -1;
            this.f6340i0 = -1;
            this.f6342j0 = 0.5f;
            this.f6350n0 = new r.e();
            this.f6352o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f6666a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                int i9 = a.f6364a.get(index);
                switch (i9) {
                    case 1:
                        this.f6315S = typedArrayObtainStyledAttributes.getInt(index, this.f6315S);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6347m);
                        this.f6347m = resourceId;
                        if (resourceId == -1) {
                            this.f6347m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.f6349n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6349n);
                        continue;
                        break;
                    case 4:
                        float f7 = typedArrayObtainStyledAttributes.getFloat(index, this.f6351o) % 360.0f;
                        this.f6351o = f7;
                        if (f7 < 0.0f) {
                            this.f6351o = (360.0f - f7) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f6323a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6323a);
                        continue;
                        break;
                    case 6:
                        this.f6325b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6325b);
                        continue;
                        break;
                    case 7:
                        this.f6327c = typedArrayObtainStyledAttributes.getFloat(index, this.f6327c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6329d);
                        this.f6329d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f6329d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6331e);
                        this.f6331e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f6331e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6333f);
                        this.f6333f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f6333f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6335g);
                        this.f6335g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f6335g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6337h);
                        this.f6337h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f6337h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6339i);
                        this.f6339i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f6339i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6341j);
                        this.f6341j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f6341j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6343k);
                        this.f6343k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f6343k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6345l);
                        this.f6345l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f6345l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6353p);
                        this.f6353p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f6353p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6354q);
                        this.f6354q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f6354q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6355r);
                        this.f6355r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f6355r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f6356s);
                        this.f6356s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f6356s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        this.f6357t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6357t);
                        continue;
                        break;
                    case 22:
                        this.f6358u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6358u);
                        continue;
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.f6359v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6359v);
                        continue;
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        this.f6360w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6360w);
                        continue;
                        break;
                    case 25:
                        this.f6361x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6361x);
                        continue;
                        break;
                    case 26:
                        this.f6362y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6362y);
                        continue;
                        break;
                    case 27:
                        this.f6316T = typedArrayObtainStyledAttributes.getBoolean(index, this.f6316T);
                        continue;
                        break;
                    case 28:
                        this.f6317U = typedArrayObtainStyledAttributes.getBoolean(index, this.f6317U);
                        continue;
                        break;
                    case 29:
                        this.f6363z = typedArrayObtainStyledAttributes.getFloat(index, this.f6363z);
                        continue;
                        break;
                    case 30:
                        this.f6297A = typedArrayObtainStyledAttributes.getFloat(index, this.f6297A);
                        continue;
                        break;
                    case 31:
                        int i10 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f6305I = i10;
                        if (i10 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        }
                        break;
                    case 32:
                        int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f6306J = i11;
                        if (i11 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        }
                        break;
                    case 33:
                        try {
                            this.f6307K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6307K);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f6307K) == -2) {
                                this.f6307K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f6309M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6309M);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f6309M) == -2) {
                                this.f6309M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f6311O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f6311O));
                        this.f6305I = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.f6308L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6308L);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f6308L) == -2) {
                                this.f6308L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f6310N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6310N);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f6310N) == -2) {
                                this.f6310N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f6312P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f6312P));
                        this.f6306J = 2;
                        continue;
                        break;
                    default:
                        switch (i9) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f6298B = string;
                                this.f6299C = Float.NaN;
                                this.f6300D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f6298B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i7 = 0;
                                    } else {
                                        String strSubstring = this.f6298B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f6300D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f6300D = 1;
                                        }
                                        i7 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f6298B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f6298B.substring(i7);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring2);
                                            this.f6299C = fAbs;
                                        }
                                    } else {
                                        String strSubstring3 = this.f6298B.substring(i7, iIndexOf2);
                                        String strSubstring4 = this.f6298B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f8 = Float.parseFloat(strSubstring3);
                                                float f9 = Float.parseFloat(strSubstring4);
                                                if (f8 > 0.0f && f9 > 0.0f) {
                                                    fAbs = this.f6300D == 1 ? Math.abs(f9 / f8) : Math.abs(f8 / f9);
                                                    this.f6299C = fAbs;
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f6301E = typedArrayObtainStyledAttributes.getFloat(index, this.f6301E);
                                break;
                            case 46:
                                this.f6302F = typedArrayObtainStyledAttributes.getFloat(index, this.f6302F);
                                break;
                            case 47:
                                this.f6303G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f6304H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f6313Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6313Q);
                                break;
                            case 50:
                                this.f6314R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6314R);
                                break;
                            case 51:
                                this.f6318V = typedArrayObtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6323a = -1;
            this.f6325b = -1;
            this.f6327c = -1.0f;
            this.f6329d = -1;
            this.f6331e = -1;
            this.f6333f = -1;
            this.f6335g = -1;
            this.f6337h = -1;
            this.f6339i = -1;
            this.f6341j = -1;
            this.f6343k = -1;
            this.f6345l = -1;
            this.f6347m = -1;
            this.f6349n = 0;
            this.f6351o = 0.0f;
            this.f6353p = -1;
            this.f6354q = -1;
            this.f6355r = -1;
            this.f6356s = -1;
            this.f6357t = -1;
            this.f6358u = -1;
            this.f6359v = -1;
            this.f6360w = -1;
            this.f6361x = -1;
            this.f6362y = -1;
            this.f6363z = 0.5f;
            this.f6297A = 0.5f;
            this.f6298B = null;
            this.f6299C = 0.0f;
            this.f6300D = 1;
            this.f6301E = -1.0f;
            this.f6302F = -1.0f;
            this.f6303G = 0;
            this.f6304H = 0;
            this.f6305I = 0;
            this.f6306J = 0;
            this.f6307K = 0;
            this.f6308L = 0;
            this.f6309M = 0;
            this.f6310N = 0;
            this.f6311O = 1.0f;
            this.f6312P = 1.0f;
            this.f6313Q = -1;
            this.f6314R = -1;
            this.f6315S = -1;
            this.f6316T = false;
            this.f6317U = false;
            this.f6318V = null;
            this.f6319W = true;
            this.f6320X = true;
            this.f6321Y = false;
            this.f6322Z = false;
            this.f6324a0 = false;
            this.f6326b0 = false;
            this.f6328c0 = false;
            this.f6330d0 = -1;
            this.f6332e0 = -1;
            this.f6334f0 = -1;
            this.f6336g0 = -1;
            this.f6338h0 = -1;
            this.f6340i0 = -1;
            this.f6342j0 = 0.5f;
            this.f6350n0 = new r.e();
            this.f6352o0 = false;
        }
    }

    class c implements C2032b.InterfaceC0309b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f6365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f6367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f6368d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6369e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6370f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f6371g;

        public c(ConstraintLayout constraintLayout) {
            this.f6365a = constraintLayout;
        }

        @Override // s.C2032b.InterfaceC0309b
        public final void a() {
            int childCount = this.f6365a.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.f6365a.getChildAt(i7);
            }
            int size = this.f6365a.f6283n.size();
            if (size > 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    ((androidx.constraintlayout.widget.b) this.f6365a.f6283n.get(i8)).h(this.f6365a);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x016b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
        @Override // s.C2032b.InterfaceC0309b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(r.e eVar, C2032b.a aVar) {
            int iMakeMeasureSpec;
            boolean z6;
            int i7;
            int iMakeMeasureSpec2;
            boolean z7;
            boolean z8;
            boolean z9;
            int measuredWidth;
            int measuredHeight;
            int i8;
            int iMax;
            int i9;
            int iMax2;
            int i10;
            int measuredWidth2;
            int measuredHeight2;
            int baseline;
            int i11;
            boolean z10;
            int childMeasureSpec;
            int childMeasureSpec2;
            if (eVar == null) {
                return;
            }
            if (eVar.M() == 8 && !eVar.U()) {
                aVar.f22147e = 0;
                aVar.f22148f = 0;
                aVar.f22149g = 0;
                return;
            }
            e.b bVar = aVar.f22143a;
            e.b bVar2 = aVar.f22144b;
            int i12 = aVar.f22145c;
            int i13 = aVar.f22146d;
            int i14 = this.f6366b + this.f6367c;
            int i15 = this.f6368d;
            View view = (View) eVar.o();
            int[] iArr = a.f6296a;
            int i16 = iArr[bVar.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6370f, i15, -2);
                    eVar.f21978h[2] = -2;
                } else if (i16 == 3) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6370f, i15 + eVar.x(), -1);
                    eVar.f21978h[2] = -1;
                } else if (i16 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6370f, i15, -2);
                    boolean z11 = eVar.f21986l == 1;
                    int[] iArr2 = eVar.f21978h;
                    iArr2[2] = 0;
                    if (aVar.f22152j) {
                        boolean z12 = (!z11 || iArr2[3] == 0 || iArr2[0] == eVar.N()) ? false : true;
                        if (!z11 || z12) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.N(), 1073741824);
                        }
                    }
                }
                z6 = true;
                i7 = iArr[bVar2.ordinal()];
                if (i7 == 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f6371g, i14 + eVar.L(), -1);
                            eVar.f21978h[3] = -1;
                        } else {
                            if (i7 != 4) {
                                z7 = false;
                                iMakeMeasureSpec2 = 0;
                                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                                boolean z13 = bVar != bVar3;
                                boolean z14 = bVar2 != bVar3;
                                e.b bVar4 = e.b.MATCH_PARENT;
                                boolean z15 = bVar2 != bVar4 || bVar2 == e.b.FIXED;
                                boolean z16 = bVar != bVar4 || bVar == e.b.FIXED;
                                z8 = !z13 && eVar.f21954Q > 0.0f;
                                z9 = !z14 && eVar.f21954Q > 0.0f;
                                b bVar5 = (b) view.getLayoutParams();
                                if (aVar.f22152j && z13 && eVar.f21986l == 0 && z14 && eVar.f21988m == 0) {
                                    measuredWidth2 = 0;
                                    measuredHeight2 = 0;
                                    baseline = 0;
                                    i11 = -1;
                                    i8 = 0;
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth = view.getMeasuredWidth();
                                    measuredHeight = view.getMeasuredHeight();
                                    int baseline2 = view.getBaseline();
                                    if (z6) {
                                        i8 = 0;
                                        int[] iArr3 = eVar.f21978h;
                                        iArr3[0] = 0;
                                        iArr3[2] = 0;
                                    } else {
                                        int[] iArr4 = eVar.f21978h;
                                        i8 = 0;
                                        iArr4[0] = measuredWidth;
                                        iArr4[2] = measuredHeight;
                                    }
                                    if (z7) {
                                        int[] iArr5 = eVar.f21978h;
                                        iArr5[1] = i8;
                                        iArr5[3] = i8;
                                    } else {
                                        int[] iArr6 = eVar.f21978h;
                                        iArr6[1] = measuredHeight;
                                        iArr6[3] = measuredWidth;
                                    }
                                    int i17 = eVar.f21992o;
                                    iMax = i17 <= 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                                    i9 = eVar.f21994p;
                                    if (i9 > 0) {
                                        iMax = Math.min(i9, iMax);
                                    }
                                    int i18 = eVar.f21998r;
                                    iMax2 = i18 <= 0 ? Math.max(i18, measuredHeight) : measuredHeight;
                                    i10 = eVar.f22000s;
                                    if (i10 > 0) {
                                        iMax2 = Math.min(i10, iMax2);
                                    }
                                    if (!z8 && z15) {
                                        iMax = (int) ((iMax2 * eVar.f21954Q) + 0.5f);
                                    } else if (z9 && z16) {
                                        iMax2 = (int) ((iMax / eVar.f21954Q) + 0.5f);
                                    }
                                    if (measuredWidth == iMax || measuredHeight != iMax2) {
                                        if (measuredWidth != iMax) {
                                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                                        }
                                        if (measuredHeight != iMax2) {
                                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                                        }
                                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        measuredWidth2 = view.getMeasuredWidth();
                                        measuredHeight2 = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                    } else {
                                        measuredWidth2 = iMax;
                                        measuredHeight2 = iMax2;
                                        baseline = baseline2;
                                    }
                                    i11 = -1;
                                }
                                int i19 = baseline == i11 ? 1 : i8;
                                aVar.f22151i = (measuredWidth2 == aVar.f22145c || measuredHeight2 != aVar.f22146d) ? 1 : i8;
                                z10 = !bVar5.f6321Y ? 1 : i19;
                                if (z10 != 0 && baseline != -1 && eVar.l() != baseline) {
                                    aVar.f22151i = true;
                                }
                                aVar.f22147e = measuredWidth2;
                                aVar.f22148f = measuredHeight2;
                                aVar.f22150h = z10;
                                aVar.f22149g = baseline;
                            }
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6371g, i14, -2);
                            boolean z17 = eVar.f21988m == 1;
                            int[] iArr7 = eVar.f21978h;
                            iArr7[3] = 0;
                            if (aVar.f22152j) {
                                boolean z18 = (!z17 || iArr7[2] == 0 || iArr7[1] == eVar.t()) ? false : true;
                                if (!z17 || z18) {
                                    childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.t(), 1073741824);
                                }
                            }
                        }
                        iMakeMeasureSpec2 = childMeasureSpec2;
                    } else {
                        childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f6371g, i14, -2);
                        eVar.f21978h[3] = -2;
                    }
                    iMakeMeasureSpec2 = childMeasureSpec;
                    z7 = true;
                    e.b bVar32 = e.b.MATCH_CONSTRAINT;
                    if (bVar != bVar32) {
                    }
                    if (bVar2 != bVar32) {
                    }
                    e.b bVar42 = e.b.MATCH_PARENT;
                    if (bVar2 != bVar42) {
                    }
                    if (bVar != bVar42) {
                    }
                    if (z13) {
                    }
                    if (z14) {
                    }
                    b bVar52 = (b) view.getLayoutParams();
                    if (aVar.f22152j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        int baseline22 = view.getBaseline();
                        if (z6) {
                        }
                        if (z7) {
                        }
                        int i172 = eVar.f21992o;
                        if (i172 <= 0) {
                        }
                        i9 = eVar.f21994p;
                        if (i9 > 0) {
                        }
                        int i182 = eVar.f21998r;
                        if (i182 <= 0) {
                        }
                        i10 = eVar.f22000s;
                        if (i10 > 0) {
                        }
                        if (!z8) {
                            if (z9) {
                                iMax2 = (int) ((iMax / eVar.f21954Q) + 0.5f);
                            }
                            if (measuredWidth == iMax) {
                                if (measuredWidth != iMax) {
                                }
                                if (measuredHeight != iMax2) {
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                i11 = -1;
                            }
                        }
                    }
                    if (baseline == i11) {
                    }
                    aVar.f22151i = (measuredWidth2 == aVar.f22145c || measuredHeight2 != aVar.f22146d) ? 1 : i8;
                    if (!bVar52.f6321Y) {
                    }
                    if (z10 != 0) {
                        aVar.f22151i = true;
                    }
                    aVar.f22147e = measuredWidth2;
                    aVar.f22148f = measuredHeight2;
                    aVar.f22150h = z10;
                    aVar.f22149g = baseline;
                }
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                eVar.f21978h[3] = i13;
                z7 = false;
                e.b bVar322 = e.b.MATCH_CONSTRAINT;
                if (bVar != bVar322) {
                }
                if (bVar2 != bVar322) {
                }
                e.b bVar422 = e.b.MATCH_PARENT;
                if (bVar2 != bVar422) {
                }
                if (bVar != bVar422) {
                }
                if (z13) {
                }
                if (z14) {
                }
                b bVar522 = (b) view.getLayoutParams();
                if (aVar.f22152j) {
                }
                if (baseline == i11) {
                }
                aVar.f22151i = (measuredWidth2 == aVar.f22145c || measuredHeight2 != aVar.f22146d) ? 1 : i8;
                if (!bVar522.f6321Y) {
                }
                if (z10 != 0) {
                }
                aVar.f22147e = measuredWidth2;
                aVar.f22148f = measuredHeight2;
                aVar.f22150h = z10;
                aVar.f22149g = baseline;
            }
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            eVar.f21978h[2] = i12;
            iMakeMeasureSpec = iMakeMeasureSpec3;
            z6 = false;
            i7 = iArr[bVar2.ordinal()];
            if (i7 == 1) {
            }
            z7 = false;
            e.b bVar3222 = e.b.MATCH_CONSTRAINT;
            if (bVar != bVar3222) {
            }
            if (bVar2 != bVar3222) {
            }
            e.b bVar4222 = e.b.MATCH_PARENT;
            if (bVar2 != bVar4222) {
            }
            if (bVar != bVar4222) {
            }
            if (z13) {
            }
            if (z14) {
            }
            b bVar5222 = (b) view.getLayoutParams();
            if (aVar.f22152j) {
            }
            if (baseline == i11) {
            }
            aVar.f22151i = (measuredWidth2 == aVar.f22145c || measuredHeight2 != aVar.f22146d) ? 1 : i8;
            if (!bVar5222.f6321Y) {
            }
            if (z10 != 0) {
            }
            aVar.f22147e = measuredWidth2;
            aVar.f22148f = measuredHeight2;
            aVar.f22150h = z10;
            aVar.f22149g = baseline;
        }

        public void c(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f6366b = i9;
            this.f6367c = i10;
            this.f6368d = i11;
            this.f6369e = i12;
            this.f6370f = i7;
            this.f6371g = i8;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6282m = new SparseArray();
        this.f6283n = new ArrayList(4);
        this.f6284o = new r.f();
        this.f6285p = 0;
        this.f6286q = 0;
        this.f6287r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6288s = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6289t = true;
        this.f6290u = 263;
        this.f6291v = null;
        this.f6292w = null;
        this.f6293x = -1;
        this.f6294y = new HashMap();
        this.f6295z = -1;
        this.f6273A = -1;
        this.f6274B = -1;
        this.f6275C = -1;
        this.f6276D = 0;
        this.f6277E = 0;
        this.f6278F = new SparseArray();
        this.f6279G = new c(this);
        this.f6280H = 0;
        this.f6281I = 0;
        j(attributeSet, 0, 0);
    }

    private final r.e g(int i7) {
        if (i7 == 0) {
            return this.f6284o;
        }
        View viewFindViewById = (View) this.f6282m.get(i7);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i7)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f6284o;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f6350n0;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private void j(AttributeSet attributeSet, int i7, int i8) {
        this.f6284o.Z(this);
        this.f6284o.a1(this.f6279G);
        this.f6282m.put(getId(), this);
        this.f6291v = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f6666a1, i7, i8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index == g.f6690e1) {
                    this.f6285p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6285p);
                } else if (index == g.f6696f1) {
                    this.f6286q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6286q);
                } else if (index == g.f6678c1) {
                    this.f6287r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6287r);
                } else if (index == g.f6684d1) {
                    this.f6288s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6288s);
                } else if (index == g.f6727k2) {
                    this.f6290u = typedArrayObtainStyledAttributes.getInt(index, this.f6290u);
                } else if (index == g.f6732l1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f6292w = null;
                        }
                    }
                } else if (index == g.f6720j1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f6291v = dVar;
                        dVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f6291v = null;
                    }
                    this.f6293x = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6284o.b1(this.f6290u);
    }

    private void l() {
        this.f6289t = true;
        this.f6295z = -1;
        this.f6273A = -1;
        this.f6274B = -1;
        this.f6275C = -1;
        this.f6276D = 0;
        this.f6277E = 0;
    }

    private void p() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r.e eVarI = i(getChildAt(i7));
            if (eVarI != null) {
                eVarI.W();
            }
        }
        if (zIsInEditMode) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f6293x != -1) {
            for (int i9 = 0; i9 < childCount; i9++) {
                getChildAt(i9).getId();
            }
        }
        d dVar = this.f6291v;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f6284o.I0();
        int size = this.f6283n.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.b) this.f6283n.get(i10)).j(this);
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11);
        }
        this.f6278F.clear();
        this.f6278F.put(0, this.f6284o);
        this.f6278F.put(getId(), this.f6284o);
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            this.f6278F.put(childAt2.getId(), i(childAt2));
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt3 = getChildAt(i13);
            r.e eVarI2 = i(childAt3);
            if (eVarI2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f6284o.c(eVarI2);
                c(zIsInEditMode, childAt3, eVarI2, bVar, this.f6278F);
            }
        }
    }

    private boolean s() {
        int childCount = getChildCount();
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            if (getChildAt(i7).isLayoutRequested()) {
                z6 = true;
                break;
            }
            i7++;
        }
        if (z6) {
            p();
        }
        return z6;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void c(boolean z6, View view, r.e eVar, b bVar, SparseArray sparseArray) {
        float f7;
        r.e eVar2;
        d.b bVar2;
        d.b bVar3;
        int i7;
        r.e eVar3;
        r.e eVar4;
        d.b bVar4;
        int i8;
        r.e eVar5;
        d.b bVar5;
        int i9;
        r.e eVar6;
        d.b bVar6;
        d.b bVar7;
        int i10;
        int i11;
        r.e eVar7;
        int i12;
        r.e eVar8;
        d.b bVar8;
        int i13;
        int i14;
        r.e eVar9;
        d.b bVar9;
        int i15;
        float f8;
        float f9;
        int i16;
        bVar.a();
        bVar.f6352o0 = false;
        eVar.z0(view.getVisibility());
        if (bVar.f6326b0) {
            eVar.m0(true);
            eVar.z0(8);
        }
        eVar.Z(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).f(eVar, this.f6284o.V0());
        }
        if (bVar.f6322Z) {
            r.g gVar = (r.g) eVar;
            int i17 = bVar.f6344k0;
            int i18 = bVar.f6346l0;
            float f10 = bVar.f6348m0;
            if (f10 != -1.0f) {
                gVar.M0(f10);
                return;
            } else if (i17 != -1) {
                gVar.K0(i17);
                return;
            } else {
                if (i18 != -1) {
                    gVar.L0(i18);
                    return;
                }
                return;
            }
        }
        int i19 = bVar.f6330d0;
        int i20 = bVar.f6332e0;
        int i21 = bVar.f6334f0;
        int i22 = bVar.f6336g0;
        int i23 = bVar.f6338h0;
        int i24 = bVar.f6340i0;
        float f11 = bVar.f6342j0;
        int i25 = bVar.f6347m;
        if (i25 != -1) {
            r.e eVar10 = (r.e) sparseArray.get(i25);
            if (eVar10 != null) {
                eVar.i(eVar10, bVar.f6351o, bVar.f6349n);
            }
        } else if (i19 != -1) {
            eVar2 = (r.e) sparseArray.get(i19);
            if (eVar2 != null) {
                bVar3 = d.b.LEFT;
                eVar3 = eVar;
                bVar2 = bVar3;
                f7 = f11;
                i7 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar3.R(bVar2, eVar2, bVar3, i7, i23);
                if (i21 != -1) {
                    eVar4 = (r.e) sparseArray.get(i21);
                    if (eVar4 != null) {
                        bVar5 = d.b.RIGHT;
                        bVar4 = d.b.LEFT;
                        i8 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                        eVar5 = eVar;
                        eVar5.R(bVar5, eVar4, bVar4, i8, i24);
                    }
                    i9 = bVar.f6337h;
                    if (i9 == -1) {
                        eVar6 = (r.e) sparseArray.get(i9);
                        if (eVar6 != null) {
                            bVar7 = d.b.TOP;
                            i10 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                            i11 = bVar.f6358u;
                            eVar7 = eVar;
                            bVar6 = bVar7;
                            eVar7.R(bVar6, eVar6, bVar7, i10, i11);
                        }
                        i12 = bVar.f6341j;
                        if (i12 == -1) {
                            eVar8 = (r.e) sparseArray.get(i12);
                            if (eVar8 != null) {
                                bVar9 = d.b.BOTTOM;
                                bVar8 = d.b.TOP;
                                i13 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                                i14 = bVar.f6360w;
                                eVar9 = eVar;
                                eVar9.R(bVar9, eVar8, bVar8, i13, i14);
                            }
                            i15 = bVar.f6345l;
                            if (i15 != -1) {
                                View view2 = (View) this.f6282m.get(i15);
                                r.e eVar11 = (r.e) sparseArray.get(bVar.f6345l);
                                if (eVar11 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                                    b bVar10 = (b) view2.getLayoutParams();
                                    bVar.f6321Y = true;
                                    bVar10.f6321Y = true;
                                    d.b bVar11 = d.b.BASELINE;
                                    eVar.k(bVar11).a(eVar11.k(bVar11), 0, -1, true);
                                    eVar.d0(true);
                                    bVar10.f6350n0.d0(true);
                                    eVar.k(d.b.TOP).k();
                                    eVar.k(d.b.BOTTOM).k();
                                }
                            }
                            f8 = f7;
                            if (f8 >= 0.0f) {
                                eVar.f0(f8);
                            }
                            f9 = bVar.f6297A;
                            if (f9 >= 0.0f) {
                                eVar.t0(f9);
                            }
                        } else {
                            int i26 = bVar.f6343k;
                            if (i26 != -1 && (eVar8 = (r.e) sparseArray.get(i26)) != null) {
                                bVar8 = d.b.BOTTOM;
                                i13 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                                i14 = bVar.f6360w;
                                eVar9 = eVar;
                                bVar9 = bVar8;
                                eVar9.R(bVar9, eVar8, bVar8, i13, i14);
                            }
                            i15 = bVar.f6345l;
                            if (i15 != -1) {
                            }
                            f8 = f7;
                            if (f8 >= 0.0f) {
                            }
                            f9 = bVar.f6297A;
                            if (f9 >= 0.0f) {
                            }
                        }
                    } else {
                        int i27 = bVar.f6339i;
                        if (i27 != -1 && (eVar6 = (r.e) sparseArray.get(i27)) != null) {
                            bVar6 = d.b.TOP;
                            bVar7 = d.b.BOTTOM;
                            i10 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                            i11 = bVar.f6358u;
                            eVar7 = eVar;
                            eVar7.R(bVar6, eVar6, bVar7, i10, i11);
                        }
                        i12 = bVar.f6341j;
                        if (i12 == -1) {
                        }
                    }
                } else {
                    if (i22 != -1 && (eVar4 = (r.e) sparseArray.get(i22)) != null) {
                        bVar4 = d.b.RIGHT;
                        i8 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                        eVar5 = eVar;
                        bVar5 = bVar4;
                        eVar5.R(bVar5, eVar4, bVar4, i8, i24);
                    }
                    i9 = bVar.f6337h;
                    if (i9 == -1) {
                    }
                }
            } else {
                f7 = f11;
                if (i21 != -1) {
                }
            }
        } else {
            f7 = f11;
            if (i20 != -1 && (eVar2 = (r.e) sparseArray.get(i20)) != null) {
                bVar2 = d.b.LEFT;
                bVar3 = d.b.RIGHT;
                i7 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar3 = eVar;
                eVar3.R(bVar2, eVar2, bVar3, i7, i23);
            }
            if (i21 != -1) {
            }
        }
        if (z6 && ((i16 = bVar.f6313Q) != -1 || bVar.f6314R != -1)) {
            eVar.r0(i16, bVar.f6314R);
        }
        if (bVar.f6319W) {
            eVar.i0(e.b.FIXED);
            eVar.A0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.i0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            eVar.i0(bVar.f6316T ? e.b.MATCH_CONSTRAINT : e.b.MATCH_PARENT);
            eVar.k(d.b.LEFT).f21923e = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.k(d.b.RIGHT).f21923e = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.i0(e.b.MATCH_CONSTRAINT);
            eVar.A0(0);
        }
        if (bVar.f6320X) {
            eVar.w0(e.b.FIXED);
            eVar.e0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.w0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            eVar.w0(bVar.f6317U ? e.b.MATCH_CONSTRAINT : e.b.MATCH_PARENT);
            eVar.k(d.b.TOP).f21923e = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.k(d.b.BOTTOM).f21923e = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.w0(e.b.MATCH_CONSTRAINT);
            eVar.e0(0);
        }
        eVar.b0(bVar.f6298B);
        eVar.k0(bVar.f6301E);
        eVar.y0(bVar.f6302F);
        eVar.g0(bVar.f6303G);
        eVar.u0(bVar.f6304H);
        eVar.j0(bVar.f6305I, bVar.f6307K, bVar.f6309M, bVar.f6311O);
        eVar.x0(bVar.f6306J, bVar.f6308L, bVar.f6310N, bVar.f6312P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f6283n;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((androidx.constraintlayout.widget.b) this.f6283n.get(i7)).i(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i9 = Integer.parseInt(strArrSplit[0]);
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        int i11 = Integer.parseInt(strArrSplit[2]);
                        int i12 = (int) ((i9 / 1080.0f) * width);
                        int i13 = (int) ((i10 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f7 = i12;
                        float f8 = i13;
                        float f9 = i12 + ((int) ((i11 / 1080.0f) * width));
                        canvas.drawLine(f7, f8, f9, f8, paint);
                        float f10 = i13 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f9, f8, f9, f10, paint);
                        canvas.drawLine(f9, f10, f7, f10, paint);
                        canvas.drawLine(f7, f10, f7, f8, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f7, f8, f9, f10, paint);
                        canvas.drawLine(f7, f10, f9, f8, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i7, Object obj) {
        if (i7 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f6294y;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f6294y.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f6288s;
    }

    public int getMaxWidth() {
        return this.f6287r;
    }

    public int getMinHeight() {
        return this.f6286q;
    }

    public int getMinWidth() {
        return this.f6285p;
    }

    public int getOptimizationLevel() {
        return this.f6284o.R0();
    }

    public View h(int i7) {
        return (View) this.f6282m.get(i7);
    }

    public final r.e i(View view) {
        if (view == this) {
            return this.f6284o;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f6350n0;
    }

    protected boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void m(int i7) {
        this.f6292w = new androidx.constraintlayout.widget.c(getContext(), this, i7);
    }

    protected void n(int i7, int i8, int i9, int i10, boolean z6, boolean z7) {
        c cVar = this.f6279G;
        int i11 = cVar.f6369e;
        int iResolveSizeAndState = View.resolveSizeAndState(i9 + cVar.f6368d, i7, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i10 + i11, i8, 0) & 16777215;
        int iMin = Math.min(this.f6287r, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f6288s, iResolveSizeAndState2);
        if (z6) {
            iMin |= 16777216;
        }
        if (z7) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f6295z = iMin;
        this.f6273A = iMin2;
    }

    protected void o(r.f fVar, int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i10 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f6279G.c(i8, i9, iMax, iMax2, paddingWidth, i10);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? k() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i11 = size - paddingWidth;
        int i12 = size2 - i10;
        r(fVar, mode, i11, mode2, i12);
        fVar.X0(i7, mode, i11, mode2, i12, this.f6295z, this.f6273A, iMax5, iMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            b bVar = (b) childAt.getLayoutParams();
            r.e eVar = bVar.f6350n0;
            if ((childAt.getVisibility() != 8 || bVar.f6322Z || bVar.f6324a0 || bVar.f6328c0 || zIsInEditMode) && !bVar.f6326b0) {
                int iO = eVar.O();
                int iP = eVar.P();
                childAt.layout(iO, iP, eVar.N() + iO, eVar.t() + iP);
            }
        }
        int size = this.f6283n.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((androidx.constraintlayout.widget.b) this.f6283n.get(i12)).g(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        this.f6280H = i7;
        this.f6281I = i8;
        this.f6284o.c1(k());
        if (this.f6289t) {
            this.f6289t = false;
            if (s()) {
                this.f6284o.e1();
            }
        }
        o(this.f6284o, this.f6290u, i7, i8);
        n(i7, i8, this.f6284o.N(), this.f6284o.t(), this.f6284o.W0(), this.f6284o.U0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        r.e eVarI = i(view);
        if ((view instanceof Guideline) && !(eVarI instanceof r.g)) {
            b bVar = (b) view.getLayoutParams();
            r.g gVar = new r.g();
            bVar.f6350n0 = gVar;
            bVar.f6322Z = true;
            gVar.N0(bVar.f6315S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.k();
            ((b) view.getLayoutParams()).f6324a0 = true;
            if (!this.f6283n.contains(bVar2)) {
                this.f6283n.add(bVar2);
            }
        }
        this.f6282m.put(view.getId(), view);
        this.f6289t = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f6282m.remove(view.getId());
        this.f6284o.H0(i(view));
        this.f6283n.remove(view);
        this.f6289t = true;
    }

    public void q(int i7, Object obj, Object obj2) {
        if (i7 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f6294y == null) {
                this.f6294y = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f6294y.put(strSubstring, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r9
      0x0027: PHI (r9v2 r.e$b) = (r9v1 r.e$b), (r9v8 r.e$b) binds: [B:13:0x0030, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[PHI: r2
      0x0047: PHI (r2v2 r.e$b) = (r2v1 r.e$b), (r2v4 r.e$b) binds: [B:24:0x0050, B:21:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void r(r.f fVar, int i7, int i8, int i9, int i10) {
        e.b bVar;
        c cVar = this.f6279G;
        int i11 = cVar.f6369e;
        int i12 = cVar.f6368d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i7 != Integer.MIN_VALUE) {
            if (i7 == 0) {
                bVar = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i8 = Math.max(0, this.f6285p);
                }
            } else if (i7 != 1073741824) {
                bVar = bVar2;
            } else {
                i8 = Math.min(this.f6287r - i12, i8);
                bVar = bVar2;
            }
            i8 = 0;
        } else {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
            }
        }
        if (i9 != Integer.MIN_VALUE) {
            if (i9 == 0) {
                bVar2 = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i10 = Math.max(0, this.f6286q);
                }
            } else if (i9 == 1073741824) {
                i10 = Math.min(this.f6288s - i11, i10);
            }
            i10 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
            }
        }
        if (i8 != fVar.N() || i10 != fVar.t()) {
            fVar.T0();
        }
        fVar.B0(0);
        fVar.C0(0);
        fVar.o0(this.f6287r - i12);
        fVar.n0(this.f6288s - i11);
        fVar.q0(0);
        fVar.p0(0);
        fVar.i0(bVar);
        fVar.A0(i8);
        fVar.w0(bVar2);
        fVar.e0(i10);
        fVar.q0(this.f6285p - i12);
        fVar.p0(this.f6286q - i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f6291v = dVar;
    }

    @Override // android.view.View
    public void setId(int i7) {
        this.f6282m.remove(getId());
        super.setId(i7);
        this.f6282m.put(getId(), this);
    }

    public void setMaxHeight(int i7) {
        if (i7 == this.f6288s) {
            return;
        }
        this.f6288s = i7;
        requestLayout();
    }

    public void setMaxWidth(int i7) {
        if (i7 == this.f6287r) {
            return;
        }
        this.f6287r = i7;
        requestLayout();
    }

    public void setMinHeight(int i7) {
        if (i7 == this.f6286q) {
            return;
        }
        this.f6286q = i7;
        requestLayout();
    }

    public void setMinWidth(int i7) {
        if (i7 == this.f6285p) {
            return;
        }
        this.f6285p = i7;
        requestLayout();
    }

    public void setOnConstraintsChanged(e eVar) {
        androidx.constraintlayout.widget.c cVar = this.f6292w;
        if (cVar != null) {
            cVar.c(eVar);
        }
    }

    public void setOptimizationLevel(int i7) {
        this.f6290u = i7;
        this.f6284o.b1(i7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f6282m = new SparseArray();
        this.f6283n = new ArrayList(4);
        this.f6284o = new r.f();
        this.f6285p = 0;
        this.f6286q = 0;
        this.f6287r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6288s = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f6289t = true;
        this.f6290u = 263;
        this.f6291v = null;
        this.f6292w = null;
        this.f6293x = -1;
        this.f6294y = new HashMap();
        this.f6295z = -1;
        this.f6273A = -1;
        this.f6274B = -1;
        this.f6275C = -1;
        this.f6276D = 0;
        this.f6277E = 0;
        this.f6278F = new SparseArray();
        this.f6279G = new c(this);
        this.f6280H = 0;
        this.f6281I = 0;
        j(attributeSet, i7, 0);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }
}
