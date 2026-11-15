package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f12271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0866b0 f12272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f12273c = new SparseBooleanArray();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final U f12274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12275b;

        a(U u6, int i7) {
            this.f12274a = u6;
            this.f12275b = i7;
        }
    }

    public D(p0 p0Var, C0866b0 c0866b0) {
        this.f12271a = p0Var;
        this.f12272b = c0866b0;
    }

    private void a(U u6, U u7, int i7) {
        O1.a.a(u7.H() != B.f12244m);
        for (int i8 = 0; i8 < u7.b(); i8++) {
            U uA = u7.a(i8);
            O1.a.a(uA.Z() == null);
            int iW = u6.w();
            if (uA.H() == B.f12246o) {
                d(u6, uA, i7);
            } else {
                b(u6, uA, i7);
            }
            i7 += u6.w() - iW;
        }
    }

    private void b(U u6, U u7, int i7) {
        u6.y(u7, i7);
        this.f12271a.G(u6.r(), null, new y0[]{new y0(u7.r(), i7)}, null);
        if (u7.H() != B.f12244m) {
            a(u6, u7, i7 + 1);
        }
    }

    private void c(U u6, U u7, int i7) {
        int iV = u6.v(u6.a(i7));
        if (u6.H() != B.f12244m) {
            a aVarS = s(u6, iV);
            if (aVarS == null) {
                return;
            }
            U u8 = aVarS.f12274a;
            iV = aVarS.f12275b;
            u6 = u8;
        }
        if (u7.H() != B.f12246o) {
            b(u6, u7, iV);
        } else {
            d(u6, u7, iV);
        }
    }

    private void d(U u6, U u7, int i7) {
        a(u6, u7, i7);
    }

    private void e(U u6) {
        int iR = u6.r();
        if (this.f12273c.get(iR)) {
            return;
        }
        this.f12273c.put(iR, true);
        int iS = u6.S();
        int iE = u6.E();
        for (U parent = u6.getParent(); parent != null && parent.H() != B.f12244m; parent = parent.getParent()) {
            if (!parent.u()) {
                iS += Math.round(parent.U());
                iE += Math.round(parent.Q());
            }
        }
        f(u6, iS, iE);
    }

    private void f(U u6, int i7, int i8) {
        if (u6.H() != B.f12246o && u6.Z() != null) {
            this.f12271a.P(u6.X().r(), u6.r(), i7, i8, u6.C(), u6.d());
            return;
        }
        for (int i9 = 0; i9 < u6.b(); i9++) {
            U uA = u6.a(i9);
            int iR = uA.r();
            if (!this.f12273c.get(iR)) {
                this.f12273c.put(iR, true);
                f(uA, uA.S() + i7, uA.E() + i8);
            }
        }
    }

    public static void j(U u6) {
        u6.s();
    }

    private static boolean n(W w6) {
        if (w6 == null) {
            return true;
        }
        if (w6.c("collapsable") && !w6.a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = w6.f12479a.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            if (!K0.a(w6.f12479a, readableMapKeySetIteratorKeySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void q(U u6, boolean z6) {
        if (u6.H() != B.f12244m) {
            for (int iB = u6.b() - 1; iB >= 0; iB--) {
                q(u6.a(iB), z6);
            }
        }
        U uZ = u6.Z();
        if (uZ != null) {
            int iX = uZ.x(u6);
            uZ.T(iX);
            this.f12271a.G(uZ.r(), new int[]{iX}, null, z6 ? new int[]{u6.r()} : null);
        }
    }

    private void r(U u6, W w6) {
        U parent = u6.getParent();
        if (parent == null) {
            u6.a0(false);
            return;
        }
        int iM = parent.M(u6);
        parent.f(iM);
        q(u6, false);
        u6.a0(false);
        this.f12271a.C(u6.G(), u6.r(), u6.N(), w6);
        parent.J(u6, iM);
        c(parent, u6, iM);
        for (int i7 = 0; i7 < u6.b(); i7++) {
            c(u6, u6.a(i7), i7);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Transitioning LayoutOnlyView - tag: ");
        sb.append(u6.r());
        sb.append(" - rootTag: ");
        sb.append(u6.I());
        sb.append(" - hasProps: ");
        sb.append(w6 != null);
        sb.append(" - tagsWithLayout.size: ");
        sb.append(this.f12273c.size());
        P0.a.p("NativeViewHierarchyOptimizer", sb.toString());
        O1.a.a(this.f12273c.size() == 0);
        e(u6);
        for (int i8 = 0; i8 < u6.b(); i8++) {
            e(u6.a(i8));
        }
        this.f12273c.clear();
    }

    private a s(U u6, int i7) {
        while (u6.H() != B.f12244m) {
            U parent = u6.getParent();
            if (parent == null) {
                return null;
            }
            i7 = i7 + (u6.H() == B.f12245n ? 1 : 0) + parent.v(u6);
            u6 = parent;
        }
        return new a(u6, i7);
    }

    public void g(U u6, C0872e0 c0872e0, W w6) {
        u6.a0(u6.N().equals(ReactViewManager.REACT_CLASS) && n(w6));
        if (u6.H() != B.f12246o) {
            this.f12271a.C(c0872e0, u6.r(), u6.N(), w6);
        }
    }

    public void h(U u6) {
        if (u6.c0()) {
            r(u6, null);
        }
    }

    public void i(U u6, int[] iArr, int[] iArr2, y0[] y0VarArr, int[] iArr3) {
        boolean z6;
        for (int i7 : iArr2) {
            int i8 = 0;
            while (true) {
                if (i8 >= iArr3.length) {
                    z6 = false;
                    break;
                } else {
                    if (iArr3[i8] == i7) {
                        z6 = true;
                        break;
                    }
                    i8++;
                }
            }
            q(this.f12272b.c(i7), z6);
        }
        for (y0 y0Var : y0VarArr) {
            c(u6, this.f12272b.c(y0Var.f12745a), y0Var.f12746b);
        }
    }

    public void k(U u6, ReadableArray readableArray) {
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            c(u6, this.f12272b.c(readableArray.getInt(i7)), i7);
        }
    }

    public void l(U u6) {
        e(u6);
    }

    public void m(U u6, String str, W w6) {
        if (u6.c0() && !n(w6)) {
            r(u6, w6);
        } else {
            if (u6.c0()) {
                return;
            }
            this.f12271a.Q(u6.r(), str, w6);
        }
    }

    public void o() {
        this.f12273c.clear();
    }

    void p(U u6) {
        this.f12273c.clear();
    }
}
