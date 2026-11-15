package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f8412I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    int f8413J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    int[] f8414K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    View[] f8415L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final SparseIntArray f8416M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    final SparseIntArray f8417N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    c f8418O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    final Rect f8419P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f8420Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i7, int i8) {
            return i7 % i8;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i7) {
            return 1;
        }
    }

    public static class b extends RecyclerView.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f8422f;

        public b(int i7, int i8) {
            super(i7, i8);
            this.f8421e = -1;
            this.f8422f = 0;
        }

        public int e() {
            return this.f8421e;
        }

        public int f() {
            return this.f8422f;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8421e = -1;
            this.f8422f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8421e = -1;
            this.f8422f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8421e = -1;
            this.f8422f = 0;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f8423a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseIntArray f8424b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8425c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8426d = false;

        static int a(SparseIntArray sparseIntArray, int i7) {
            int size = sparseIntArray.size() - 1;
            int i8 = 0;
            while (i8 <= size) {
                int i9 = (i8 + size) >>> 1;
                if (sparseIntArray.keyAt(i9) < i7) {
                    i8 = i9 + 1;
                } else {
                    size = i9 - 1;
                }
            }
            int i10 = i8 - 1;
            if (i10 < 0 || i10 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i10);
        }

        int b(int i7, int i8) {
            if (!this.f8426d) {
                return d(i7, i8);
            }
            int i9 = this.f8424b.get(i7, -1);
            if (i9 != -1) {
                return i9;
            }
            int iD = d(i7, i8);
            this.f8424b.put(i7, iD);
            return iD;
        }

        int c(int i7, int i8) {
            if (!this.f8425c) {
                return e(i7, i8);
            }
            int i9 = this.f8423a.get(i7, -1);
            if (i9 != -1) {
                return i9;
            }
            int iE = e(i7, i8);
            this.f8423a.put(i7, iE);
            return iE;
        }

        public int d(int i7, int i8) {
            int i9;
            int i10;
            int iC;
            int iA;
            if (!this.f8426d || (iA = a(this.f8424b, i7)) == -1) {
                i9 = 0;
                i10 = 0;
                iC = 0;
            } else {
                i9 = this.f8424b.get(iA);
                i10 = iA + 1;
                iC = c(iA, i8) + f(iA);
                if (iC == i8) {
                    i9++;
                    iC = 0;
                }
            }
            int iF = f(i7);
            while (i10 < i7) {
                int iF2 = f(i10);
                iC += iF2;
                if (iC == i8) {
                    i9++;
                    iC = 0;
                } else if (iC > i8) {
                    i9++;
                    iC = iF2;
                }
                i10++;
            }
            return iC + iF > i8 ? i9 + 1 : i9;
        }

        public abstract int e(int i7, int i8);

        public abstract int f(int i7);

        public void g() {
            this.f8424b.clear();
        }

        public void h() {
            this.f8423a.clear();
        }
    }

    public GridLayoutManager(Context context, int i7, int i8, boolean z6) {
        super(context, i8, z6);
        this.f8412I = false;
        this.f8413J = -1;
        this.f8416M = new SparseIntArray();
        this.f8417N = new SparseIntArray();
        this.f8418O = new a();
        this.f8419P = new Rect();
        d3(i7);
    }

    private void N2(RecyclerView.u uVar, RecyclerView.z zVar, int i7, boolean z6) {
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        if (z6) {
            i10 = 1;
            i9 = i7;
            i8 = 0;
        } else {
            i8 = i7 - 1;
            i9 = -1;
            i10 = -1;
        }
        while (i8 != i9) {
            View view = this.f8415L[i8];
            b bVar = (b) view.getLayoutParams();
            int iZ2 = Z2(uVar, zVar, h0(view));
            bVar.f8422f = iZ2;
            bVar.f8421e = i11;
            i11 += iZ2;
            i8 += i10;
        }
    }

    private void O2() {
        int iJ = J();
        for (int i7 = 0; i7 < iJ; i7++) {
            b bVar = (b) I(i7).getLayoutParams();
            int iA = bVar.a();
            this.f8416M.put(iA, bVar.f());
            this.f8417N.put(iA, bVar.e());
        }
    }

    private void P2(int i7) {
        this.f8414K = Q2(this.f8414K, this.f8413J, i7);
    }

    static int[] Q2(int[] iArr, int i7, int i8) {
        int i9;
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i8) {
            iArr = new int[i7 + 1];
        }
        int i10 = 0;
        iArr[0] = 0;
        int i11 = i8 / i7;
        int i12 = i8 % i7;
        int i13 = 0;
        for (int i14 = 1; i14 <= i7; i14++) {
            i10 += i12;
            if (i10 <= 0 || i7 - i10 >= i12) {
                i9 = i11;
            } else {
                i9 = i11 + 1;
                i10 -= i7;
            }
            i13 += i9;
            iArr[i14] = i13;
        }
        return iArr;
    }

    private void R2() {
        this.f8416M.clear();
        this.f8417N.clear();
    }

    private int S2(RecyclerView.z zVar) {
        if (J() != 0 && zVar.b() != 0) {
            T1();
            boolean zR2 = r2();
            View viewY1 = Y1(!zR2, true);
            View viewX1 = X1(!zR2, true);
            if (viewY1 != null && viewX1 != null) {
                int iB = this.f8418O.b(h0(viewY1), this.f8413J);
                int iB2 = this.f8418O.b(h0(viewX1), this.f8413J);
                int iMax = this.f8440x ? Math.max(0, ((this.f8418O.b(zVar.b() - 1, this.f8413J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zR2) {
                    return Math.round((iMax * (Math.abs(this.f8437u.d(viewX1) - this.f8437u.g(viewY1)) / ((this.f8418O.b(h0(viewX1), this.f8413J) - this.f8418O.b(h0(viewY1), this.f8413J)) + 1))) + (this.f8437u.m() - this.f8437u.g(viewY1)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int T2(RecyclerView.z zVar) {
        if (J() != 0 && zVar.b() != 0) {
            T1();
            View viewY1 = Y1(!r2(), true);
            View viewX1 = X1(!r2(), true);
            if (viewY1 != null && viewX1 != null) {
                if (!r2()) {
                    return this.f8418O.b(zVar.b() - 1, this.f8413J) + 1;
                }
                int iD = this.f8437u.d(viewX1) - this.f8437u.g(viewY1);
                int iB = this.f8418O.b(h0(viewY1), this.f8413J);
                return (int) ((iD / ((this.f8418O.b(h0(viewX1), this.f8413J) - iB) + 1)) * (this.f8418O.b(zVar.b() - 1, this.f8413J) + 1));
            }
        }
        return 0;
    }

    private void U2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i7) {
        boolean z6 = i7 == 1;
        int iY2 = Y2(uVar, zVar, aVar.f8444b);
        if (z6) {
            while (iY2 > 0) {
                int i8 = aVar.f8444b;
                if (i8 <= 0) {
                    return;
                }
                int i9 = i8 - 1;
                aVar.f8444b = i9;
                iY2 = Y2(uVar, zVar, i9);
            }
            return;
        }
        int iB = zVar.b() - 1;
        int i10 = aVar.f8444b;
        while (i10 < iB) {
            int i11 = i10 + 1;
            int iY22 = Y2(uVar, zVar, i11);
            if (iY22 <= iY2) {
                break;
            }
            i10 = i11;
            iY2 = iY22;
        }
        aVar.f8444b = i10;
    }

    private void V2() {
        View[] viewArr = this.f8415L;
        if (viewArr == null || viewArr.length != this.f8413J) {
            this.f8415L = new View[this.f8413J];
        }
    }

    private int X2(RecyclerView.u uVar, RecyclerView.z zVar, int i7) {
        if (!zVar.e()) {
            return this.f8418O.b(i7, this.f8413J);
        }
        int iF = uVar.f(i7);
        if (iF != -1) {
            return this.f8418O.b(iF, this.f8413J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i7);
        return 0;
    }

    private int Y2(RecyclerView.u uVar, RecyclerView.z zVar, int i7) {
        if (!zVar.e()) {
            return this.f8418O.c(i7, this.f8413J);
        }
        int i8 = this.f8417N.get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        int iF = uVar.f(i7);
        if (iF != -1) {
            return this.f8418O.c(iF, this.f8413J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 0;
    }

    private int Z2(RecyclerView.u uVar, RecyclerView.z zVar, int i7) {
        if (!zVar.e()) {
            return this.f8418O.f(i7);
        }
        int i8 = this.f8416M.get(i7, -1);
        if (i8 != -1) {
            return i8;
        }
        int iF = uVar.f(i7);
        if (iF != -1) {
            return this.f8418O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i7);
        return 1;
    }

    private void a3(float f7, int i7) {
        P2(Math.max(Math.round(f7 * this.f8413J), i7));
    }

    private void b3(View view, int i7, boolean z6) {
        int iK;
        int iK2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f8617b;
        int i8 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i9 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iW2 = W2(bVar.f8421e, bVar.f8422f);
        if (this.f8435s == 1) {
            iK2 = RecyclerView.o.K(iW2, i7, i9, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iK = RecyclerView.o.K(this.f8437u.n(), X(), i8, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iK3 = RecyclerView.o.K(iW2, i7, i8, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iK4 = RecyclerView.o.K(this.f8437u.n(), p0(), i9, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iK = iK3;
            iK2 = iK4;
        }
        c3(view, iK2, iK, z6);
    }

    private void c3(View view, int i7, int i8, boolean z6) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z6 ? H1(view, i7, i8, pVar) : F1(view, i7, i8, pVar)) {
            view.measure(i7, i8);
        }
    }

    private void e3() {
        int iW;
        int iG0;
        if (p2() == 1) {
            iW = o0() - f0();
            iG0 = e0();
        } else {
            iW = W() - d0();
            iG0 = g0();
        }
        P2(iW - iG0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i7, int i8) {
        int iN;
        int iN2;
        if (this.f8414K == null) {
            super.C1(rect, i7, i8);
        }
        int iE0 = e0() + f0();
        int iG0 = g0() + d0();
        if (this.f8435s == 1) {
            iN2 = RecyclerView.o.n(i8, rect.height() + iG0, b0());
            int[] iArr = this.f8414K;
            iN = RecyclerView.o.n(i7, iArr[iArr.length - 1] + iE0, c0());
        } else {
            iN = RecyclerView.o.n(i7, rect.width() + iE0, c0());
            int[] iArr2 = this.f8414K;
            iN2 = RecyclerView.o.n(i8, iArr2[iArr2.length - 1] + iG0, b0());
        }
        B1(iN, iN2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return this.f8435s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View J0(View view, int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iJ;
        int i8;
        int iJ2;
        View view2;
        View view3;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView.u uVar2 = uVar;
        RecyclerView.z zVar2 = zVar;
        View viewB = B(view);
        View view4 = null;
        if (viewB == null) {
            return null;
        }
        b bVar = (b) viewB.getLayoutParams();
        int i13 = bVar.f8421e;
        int i14 = bVar.f8422f + i13;
        if (super.J0(view, i7, uVar, zVar) == null) {
            return null;
        }
        if ((R1(i7) == 1) != this.f8440x) {
            iJ2 = J() - 1;
            iJ = -1;
            i8 = -1;
        } else {
            iJ = J();
            i8 = 1;
            iJ2 = 0;
        }
        boolean z6 = this.f8435s == 1 && q2();
        int iX2 = X2(uVar2, zVar2, iJ2);
        int i15 = -1;
        int i16 = -1;
        int iMin = 0;
        int iMin2 = 0;
        int i17 = iJ2;
        View view5 = null;
        while (i17 != iJ) {
            int iX22 = X2(uVar2, zVar2, i17);
            View viewI = I(i17);
            if (viewI == viewB) {
                break;
            }
            if (!viewI.hasFocusable() || iX22 == iX2) {
                b bVar2 = (b) viewI.getLayoutParams();
                int i18 = bVar2.f8421e;
                view2 = viewB;
                int i19 = bVar2.f8422f + i18;
                if (viewI.hasFocusable() && i18 == i13 && i19 == i14) {
                    return viewI;
                }
                if (!(viewI.hasFocusable() && view4 == null) && (viewI.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i19, i14) - Math.max(i18, i13);
                    if (!viewI.hasFocusable()) {
                        if (view4 == null) {
                            i9 = iMin;
                            i10 = iJ;
                            if (y0(viewI, false, true)) {
                                i11 = iMin2;
                                if (iMin3 > i11) {
                                    i12 = i16;
                                } else if (iMin3 == i11) {
                                    i12 = i16;
                                    if (z6 == (i18 > i12)) {
                                    }
                                    i17 += i8;
                                    uVar2 = uVar;
                                    zVar2 = zVar;
                                    viewB = view2;
                                    iJ = i10;
                                } else {
                                    i12 = i16;
                                }
                                if (viewI.hasFocusable()) {
                                    int i20 = bVar2.f8421e;
                                    iMin2 = Math.min(i19, i14) - Math.max(i18, i13);
                                    i16 = i20;
                                    iMin = i9;
                                    view5 = viewI;
                                } else {
                                    i15 = bVar2.f8421e;
                                    i16 = i12;
                                    iMin2 = i11;
                                    view5 = view3;
                                    view4 = viewI;
                                    iMin = Math.min(i19, i14) - Math.max(i18, i13);
                                }
                                i17 += i8;
                                uVar2 = uVar;
                                zVar2 = zVar;
                                viewB = view2;
                                iJ = i10;
                            }
                            i16 = i12;
                            iMin2 = i11;
                            iMin = i9;
                            view5 = view3;
                            i17 += i8;
                            uVar2 = uVar;
                            zVar2 = zVar;
                            viewB = view2;
                            iJ = i10;
                        }
                        i12 = i16;
                        i11 = iMin2;
                        i16 = i12;
                        iMin2 = i11;
                        iMin = i9;
                        view5 = view3;
                        i17 += i8;
                        uVar2 = uVar;
                        zVar2 = zVar;
                        viewB = view2;
                        iJ = i10;
                    } else if (iMin3 <= iMin) {
                        if (iMin3 == iMin) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                i9 = iMin;
                i10 = iJ;
                i12 = i16;
                i11 = iMin2;
                if (viewI.hasFocusable()) {
                }
                i17 += i8;
                uVar2 = uVar;
                zVar2 = zVar;
                viewB = view2;
                iJ = i10;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewB;
                view3 = view5;
            }
            i9 = iMin;
            i10 = iJ;
            i12 = i16;
            i11 = iMin2;
            i16 = i12;
            iMin2 = i11;
            iMin = i9;
            view5 = view3;
            i17 += i8;
            uVar2 = uVar;
            zVar2 = zVar;
            viewB = view2;
            iJ = i10;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.f8430D == null && !this.f8412I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f8435s == 1) {
            return this.f8413J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return X2(uVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void N1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int iF = this.f8413J;
        for (int i7 = 0; i7 < this.f8413J && cVar.c(zVar) && iF > 0; i7++) {
            int i8 = cVar.f8455d;
            cVar2.a(i8, Math.max(0, cVar.f8458g));
            iF -= this.f8418O.f(i8);
            cVar.f8455d += cVar.f8456e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.u uVar, RecyclerView.z zVar, View view, C c7) {
        int iE;
        int iF;
        boolean z6;
        boolean z7;
        int iF2;
        int iE2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, c7);
            return;
        }
        b bVar = (b) layoutParams;
        int iX2 = X2(uVar, zVar, bVar.a());
        if (this.f8435s == 0) {
            iE2 = bVar.e();
            iF2 = bVar.f();
            z6 = false;
            z7 = false;
            iF = 1;
            iE = iX2;
        } else {
            iE = bVar.e();
            iF = bVar.f();
            z6 = false;
            z7 = false;
            iF2 = 1;
            iE2 = iX2;
        }
        c7.j0(C.c.b(iE2, iF2, iE, iF, z6, z7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i7, int i8) {
        this.f8418O.h();
        this.f8418O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.f8418O.h();
        this.f8418O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i7, int i8, int i9) {
        this.f8418O.h();
        this.f8418O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i7, int i8) {
        this.f8418O.h();
        this.f8418O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i7, int i8, Object obj) {
        this.f8418O.h();
        this.f8418O.g();
    }

    int W2(int i7, int i8) {
        if (this.f8435s != 1 || !q2()) {
            int[] iArr = this.f8414K;
            return iArr[i8 + i7] - iArr[i7];
        }
        int[] iArr2 = this.f8414K;
        int i9 = this.f8413J;
        return iArr2[i9 - i7] - iArr2[(i9 - i7) - i8];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            O2();
        }
        super.X0(uVar, zVar);
        R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.f8412I = false;
    }

    public void d3(int i7) {
        if (i7 == this.f8413J) {
            return;
        }
        this.f8412I = true;
        if (i7 >= 1) {
            this.f8413J = i7;
            this.f8418O.h();
            t1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i7);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View h2(RecyclerView.u uVar, RecyclerView.z zVar, int i7, int i8, int i9) {
        T1();
        int iM = this.f8437u.m();
        int i10 = this.f8437u.i();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i7 != i8) {
            View viewI = I(i7);
            int iH0 = h0(viewI);
            if (iH0 >= 0 && iH0 < i9 && Y2(uVar, zVar, iH0) == 0) {
                if (((RecyclerView.p) viewI.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewI;
                    }
                } else {
                    if (this.f8437u.g(viewI) < i10 && this.f8437u.d(viewI) >= iM) {
                        return viewI;
                    }
                    if (view == null) {
                        view = viewI;
                    }
                }
            }
            i7 += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f8435s == 0) {
            return this.f8413J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return X2(uVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.z zVar) {
        return this.f8420Q ? S2(zVar) : super.r(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.z zVar) {
        return this.f8420Q ? T2(zVar) : super.s(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0213  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void s2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i7;
        int i8;
        int iF;
        int i9;
        int i10;
        int i11;
        int i12;
        int iF2;
        int iF3;
        int i13;
        int i14;
        int iK;
        int iK2;
        View viewD;
        int iL = this.f8437u.l();
        boolean z6 = iL != 1073741824;
        int i15 = J() > 0 ? this.f8414K[this.f8413J] : 0;
        if (z6) {
            e3();
        }
        boolean z7 = cVar.f8456e == 1;
        int iY2 = this.f8413J;
        if (!z7) {
            iY2 = Y2(uVar, zVar, cVar.f8455d) + Z2(uVar, zVar, cVar.f8455d);
        }
        int i16 = 0;
        while (i16 < this.f8413J && cVar.c(zVar) && iY2 > 0) {
            int i17 = cVar.f8455d;
            int iZ2 = Z2(uVar, zVar, i17);
            if (iZ2 > this.f8413J) {
                throw new IllegalArgumentException("Item at position " + i17 + " requires " + iZ2 + " spans but GridLayoutManager has only " + this.f8413J + " spans.");
            }
            iY2 -= iZ2;
            if (iY2 < 0 || (viewD = cVar.d(uVar)) == null) {
                break;
            }
            this.f8415L[i16] = viewD;
            i16++;
        }
        if (i16 == 0) {
            bVar.f8449b = true;
            return;
        }
        N2(uVar, zVar, i16, z7);
        float f7 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            View view = this.f8415L[i19];
            if (cVar.f8463l == null) {
                if (z7) {
                    d(view);
                } else {
                    e(view, 0);
                }
            } else if (z7) {
                b(view);
            } else {
                c(view, 0);
            }
            j(view, this.f8419P);
            b3(view, iL, false);
            int iE = this.f8437u.e(view);
            if (iE > i18) {
                i18 = iE;
            }
            float f8 = (this.f8437u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f8422f;
            if (f8 > f7) {
                f7 = f8;
            }
        }
        if (z6) {
            a3(f7, i15);
            i18 = 0;
            for (int i20 = 0; i20 < i16; i20++) {
                View view2 = this.f8415L[i20];
                b3(view2, 1073741824, true);
                int iE2 = this.f8437u.e(view2);
                if (iE2 > i18) {
                    i18 = iE2;
                }
            }
        }
        for (int i21 = 0; i21 < i16; i21++) {
            View view3 = this.f8415L[i21];
            if (this.f8437u.e(view3) != i18) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f8617b;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iW2 = W2(bVar2.f8421e, bVar2.f8422f);
                if (this.f8435s == 1) {
                    iK2 = RecyclerView.o.K(iW2, 1073741824, i23, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iK = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iK = RecyclerView.o.K(iW2, 1073741824, i22, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iK2 = iMakeMeasureSpec;
                }
                c3(view3, iK2, iK, true);
            }
        }
        bVar.f8448a = i18;
        if (this.f8435s == 1) {
            if (cVar.f8457f == -1) {
                i11 = cVar.f8453b;
                i14 = i11 - i18;
            } else {
                i14 = cVar.f8453b;
                i11 = i14 + i18;
            }
            i9 = i14;
            i10 = 0;
            iF = 0;
        } else {
            if (cVar.f8457f == -1) {
                i8 = cVar.f8453b;
                i7 = i8 - i18;
            } else {
                i7 = cVar.f8453b;
                i8 = i7 + i18;
            }
            iF = i7;
            i9 = 0;
            i10 = i8;
            i11 = 0;
        }
        int i24 = 0;
        while (i24 < i16) {
            View view4 = this.f8415L[i24];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f8435s != 1) {
                int iG0 = g0() + this.f8414K[bVar3.f8421e];
                i12 = iG0;
                iF2 = i10;
                iF3 = this.f8437u.f(view4) + iG0;
            } else if (q2()) {
                int iE0 = e0() + this.f8414K[this.f8413J - bVar3.f8421e];
                iF = iE0 - this.f8437u.f(view4);
                iF3 = i11;
                iF2 = iE0;
                i12 = i9;
            } else {
                int iE02 = e0() + this.f8414K[bVar3.f8421e];
                iF3 = i11;
                i13 = iE02;
                i12 = i9;
                iF2 = this.f8437u.f(view4) + iE02;
                z0(view4, i13, i12, iF2, iF3);
                if (!bVar3.c() || bVar3.b()) {
                    bVar.f8450c = true;
                }
                bVar.f8451d |= view4.hasFocusable();
                i24++;
                i11 = iF3;
                i10 = iF2;
                i9 = i12;
                iF = i13;
            }
            i13 = iF;
            z0(view4, i13, i12, iF2, iF3);
            if (!bVar3.c()) {
                bVar.f8450c = true;
            }
            bVar.f8451d |= view4.hasFocusable();
            i24++;
            i11 = iF3;
            i10 = iF2;
            i9 = i12;
            iF = i13;
        }
        Arrays.fill(this.f8415L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.z zVar) {
        return this.f8420Q ? S2(zVar) : super.u(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void u2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i7) {
        super.u2(uVar, zVar, aVar, i7);
        e3();
        if (zVar.b() > 0 && !zVar.e()) {
            U2(uVar, zVar, aVar, i7);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return this.f8420Q ? T2(zVar) : super.v(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        e3();
        V2();
        return super.w1(i7, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        e3();
        V2();
        return super.y1(i7, uVar, zVar);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
        this.f8412I = false;
        this.f8413J = -1;
        this.f8416M = new SparseIntArray();
        this.f8417N = new SparseIntArray();
        this.f8418O = new a();
        this.f8419P = new Rect();
        d3(RecyclerView.o.i0(context, attributeSet, i7, i8).f8613b);
    }
}
