package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1139l4 implements InterfaceC1069d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1112i4 f14730a;

    private C1139l4(AbstractC1112i4 abstractC1112i4) {
        AbstractC1112i4 abstractC1112i42 = (AbstractC1112i4) B4.f(abstractC1112i4, "output");
        this.f14730a = abstractC1112i42;
        abstractC1112i42.f14620a = this;
    }

    public static C1139l4 P(AbstractC1112i4 abstractC1112i4) {
        C1139l4 c1139l4 = abstractC1112i4.f14620a;
        return c1139l4 != null ? c1139l4 : new C1139l4(abstractC1112i4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void A(int i7, double d7) {
        this.f14730a.I(i7, d7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void B(int i7, float f7) {
        this.f14730a.J(i7, f7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void C(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof Q4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.m(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iS = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iS += AbstractC1112i4.S(((Long) list.get(i9)).longValue());
            }
            this.f14730a.U(iS);
            while (i8 < list.size()) {
                this.f14730a.s(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        Q4 q42 = (Q4) list;
        if (!z6) {
            while (i8 < q42.size()) {
                this.f14730a.m(i7, q42.j(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iS2 = 0;
        for (int i10 = 0; i10 < q42.size(); i10++) {
            iS2 += AbstractC1112i4.S(q42.j(i10));
        }
        this.f14730a.U(iS2);
        while (i8 < q42.size()) {
            this.f14730a.s(q42.j(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void D(int i7, int i8) {
        this.f14730a.b0(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void E(int i7, Object obj, InterfaceC1229v5 interfaceC1229v5) {
        AbstractC1112i4 abstractC1112i4 = this.f14730a;
        abstractC1112i4.V(i7, 3);
        interfaceC1229v5.b((InterfaceC1095g5) obj, abstractC1112i4.f14620a);
        abstractC1112i4.V(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void F(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.l(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iC0 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iC0 += AbstractC1112i4.c0(((Integer) list.get(i9)).intValue());
            }
            this.f14730a.U(iC0);
            while (i8 < list.size()) {
                this.f14730a.k(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C4 c42 = (C4) list;
        if (!z6) {
            while (i8 < c42.size()) {
                this.f14730a.l(i7, c42.f(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iC02 = 0;
        for (int i10 = 0; i10 < c42.size(); i10++) {
            iC02 += AbstractC1112i4.c0(c42.f(i10));
        }
        this.f14730a.U(iC02);
        while (i8 < c42.size()) {
            this.f14730a.k(c42.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void G(int i7, Object obj, InterfaceC1229v5 interfaceC1229v5) {
        this.f14730a.p(i7, (InterfaceC1095g5) obj, interfaceC1229v5);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void H(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.b0(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iV0 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iV0 += AbstractC1112i4.v0(((Integer) list.get(i9)).intValue());
            }
            this.f14730a.U(iV0);
            while (i8 < list.size()) {
                this.f14730a.U(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C4 c42 = (C4) list;
        if (!z6) {
            while (i8 < c42.size()) {
                this.f14730a.b0(i7, c42.f(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iV02 = 0;
        for (int i10 = 0; i10 < c42.size(); i10++) {
            iV02 += AbstractC1112i4.v0(c42.f(i10));
        }
        this.f14730a.U(iV02);
        while (i8 < c42.size()) {
            this.f14730a.U(c42.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void I(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof N4)) {
            while (i8 < list.size()) {
                this.f14730a.q(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        N4 n42 = (N4) list;
        while (i8 < list.size()) {
            Object objD = n42.d(i8);
            if (objD instanceof String) {
                this.f14730a.q(i7, (String) objD);
            } else {
                this.f14730a.n(i7, (R3) objD);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void J(int i7, int i8) {
        this.f14730a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void K(int i7, long j7) {
        this.f14730a.q0(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void L(int i7, List list, boolean z6) {
        if (list instanceof AbstractC1252y4) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f14730a.V(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f14730a.J(i7, ((Float) list.get(i8)).floatValue());
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iD = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iD += AbstractC1112i4.d(((Float) list.get(i9)).floatValue());
        }
        this.f14730a.U(iD);
        while (i8 < list.size()) {
            this.f14730a.G(((Float) list.get(i8)).floatValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void M(int i7, int i8) {
        this.f14730a.y0(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void N(int i7, long j7) {
        this.f14730a.L(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void O(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f14730a.n(i7, (R3) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void b(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.K(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iX = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iX += AbstractC1112i4.X(((Integer) list.get(i9)).intValue());
            }
            this.f14730a.U(iX);
            while (i8 < list.size()) {
                this.f14730a.H(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C4 c42 = (C4) list;
        if (!z6) {
            while (i8 < c42.size()) {
                this.f14730a.K(i7, c42.f(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iX2 = 0;
        for (int i10 = 0; i10 < c42.size(); i10++) {
            iX2 += AbstractC1112i4.X(c42.f(i10));
        }
        this.f14730a.U(iX2);
        while (i8 < c42.size()) {
            this.f14730a.H(c42.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void c(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof Q4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.q0(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iJ0 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iJ0 += AbstractC1112i4.j0(((Long) list.get(i9)).longValue());
            }
            this.f14730a.U(iJ0);
            while (i8 < list.size()) {
                this.f14730a.r0(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        Q4 q42 = (Q4) list;
        if (!z6) {
            while (i8 < q42.size()) {
                this.f14730a.q0(i7, q42.j(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iJ02 = 0;
        for (int i10 = 0; i10 < q42.size(); i10++) {
            iJ02 += AbstractC1112i4.j0(q42.j(i10));
        }
        this.f14730a.U(iJ02);
        while (i8 < q42.size()) {
            this.f14730a.r0(q42.j(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void d(int i7) {
        this.f14730a.V(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void e(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof Q4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.m(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iF0 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iF0 += AbstractC1112i4.f0(((Long) list.get(i9)).longValue());
            }
            this.f14730a.U(iF0);
            while (i8 < list.size()) {
                this.f14730a.s(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        Q4 q42 = (Q4) list;
        if (!z6) {
            while (i8 < q42.size()) {
                this.f14730a.m(i7, q42.j(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iF02 = 0;
        for (int i10 = 0; i10 < q42.size(); i10++) {
            iF02 += AbstractC1112i4.f0(q42.j(i10));
        }
        this.f14730a.U(iF02);
        while (i8 < q42.size()) {
            this.f14730a.s(q42.j(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void f(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof Q4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.L(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iN0 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iN0 += AbstractC1112i4.n0(((Long) list.get(i9)).longValue());
            }
            this.f14730a.U(iN0);
            while (i8 < list.size()) {
                this.f14730a.N(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        Q4 q42 = (Q4) list;
        if (!z6) {
            while (i8 < q42.size()) {
                this.f14730a.L(i7, q42.j(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iN02 = 0;
        for (int i10 = 0; i10 < q42.size(); i10++) {
            iN02 += AbstractC1112i4.n0(q42.j(i10));
        }
        this.f14730a.U(iN02);
        while (i8 < q42.size()) {
            this.f14730a.N(q42.j(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void g(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.K(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iG0 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iG0 += AbstractC1112i4.g0(((Integer) list.get(i9)).intValue());
            }
            this.f14730a.U(iG0);
            while (i8 < list.size()) {
                this.f14730a.H(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C4 c42 = (C4) list;
        if (!z6) {
            while (i8 < c42.size()) {
                this.f14730a.K(i7, c42.f(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iG02 = 0;
        for (int i10 = 0; i10 < c42.size(); i10++) {
            iG02 += AbstractC1112i4.g0(c42.f(i10));
        }
        this.f14730a.U(iG02);
        while (i8 < c42.size()) {
            this.f14730a.H(c42.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void h(int i7, boolean z6) {
        this.f14730a.r(i7, z6);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void i(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.l(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iK0 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iK0 += AbstractC1112i4.k0(((Integer) list.get(i9)).intValue());
            }
            this.f14730a.U(iK0);
            while (i8 < list.size()) {
                this.f14730a.k(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C4 c42 = (C4) list;
        if (!z6) {
            while (i8 < c42.size()) {
                this.f14730a.l(i7, c42.f(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iK02 = 0;
        for (int i10 = 0; i10 < c42.size(); i10++) {
            iK02 += AbstractC1112i4.k0(c42.f(i10));
        }
        this.f14730a.U(iK02);
        while (i8 < c42.size()) {
            this.f14730a.k(c42.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void j(int i7) {
        this.f14730a.V(i7, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void k(int i7, List list, InterfaceC1229v5 interfaceC1229v5) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            G(i7, list.get(i8), interfaceC1229v5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void l(int i7, long j7) {
        this.f14730a.L(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void m(int i7, W4 w42, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f14730a.V(i7, 2);
            this.f14730a.U(X4.a(w42, entry.getKey(), entry.getValue()));
            X4.b(this.f14730a, w42, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void n(int i7, int i8) {
        this.f14730a.l(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void o(int i7, List list, boolean z6) {
        if (list instanceof P3) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f14730a.V(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f14730a.r(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iH = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iH += AbstractC1112i4.h(((Boolean) list.get(i9)).booleanValue());
        }
        this.f14730a.U(iH);
        while (i8 < list.size()) {
            this.f14730a.O(((Boolean) list.get(i8)).booleanValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void p(int i7, R3 r32) {
        this.f14730a.n(i7, r32);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void q(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof Q4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.L(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iA0 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iA0 += AbstractC1112i4.a0(((Long) list.get(i9)).longValue());
            }
            this.f14730a.U(iA0);
            while (i8 < list.size()) {
                this.f14730a.N(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        Q4 q42 = (Q4) list;
        if (!z6) {
            while (i8 < q42.size()) {
                this.f14730a.L(i7, q42.j(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iA02 = 0;
        for (int i10 = 0; i10 < q42.size(); i10++) {
            iA02 += AbstractC1112i4.a0(q42.j(i10));
        }
        this.f14730a.U(iA02);
        while (i8 < q42.size()) {
            this.f14730a.N(q42.j(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void r(int i7, List list, InterfaceC1229v5 interfaceC1229v5) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            E(i7, list.get(i8), interfaceC1229v5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void s(int i7, int i8) {
        this.f14730a.K(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void t(int i7, long j7) {
        this.f14730a.m(i7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void u(int i7, Object obj) {
        if (obj instanceof R3) {
            this.f14730a.M(i7, (R3) obj);
        } else {
            this.f14730a.o(i7, (InterfaceC1095g5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void v(int i7, List list, boolean z6) {
        if (list instanceof AbstractC1130k4) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f14730a.V(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f14730a.I(i7, ((Double) list.get(i8)).doubleValue());
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iC = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iC += AbstractC1112i4.c(((Double) list.get(i9)).doubleValue());
        }
        this.f14730a.U(iC);
        while (i8 < list.size()) {
            this.f14730a.F(((Double) list.get(i8)).doubleValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void w(int i7, String str) {
        this.f14730a.q(i7, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void x(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C4)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f14730a.y0(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f14730a.V(i7, 2);
            int iO0 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iO0 += AbstractC1112i4.o0(((Integer) list.get(i9)).intValue());
            }
            this.f14730a.U(iO0);
            while (i8 < list.size()) {
                this.f14730a.x0(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C4 c42 = (C4) list;
        if (!z6) {
            while (i8 < c42.size()) {
                this.f14730a.y0(i7, c42.f(i8));
                i8++;
            }
            return;
        }
        this.f14730a.V(i7, 2);
        int iO02 = 0;
        for (int i10 = 0; i10 < c42.size(); i10++) {
            iO02 += AbstractC1112i4.o0(c42.f(i10));
        }
        this.f14730a.U(iO02);
        while (i8 < c42.size()) {
            this.f14730a.x0(c42.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void y(int i7, int i8) {
        this.f14730a.K(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1069d6
    public final void z(int i7, long j7) {
        this.f14730a.m(i7, j7);
    }
}
