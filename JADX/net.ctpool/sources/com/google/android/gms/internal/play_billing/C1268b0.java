package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1268b0 implements P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1264a0 f15163a;

    private C1268b0(AbstractC1264a0 abstractC1264a0) {
        byte[] bArr = AbstractC1353z0.f15324d;
        this.f15163a = abstractC1264a0;
        abstractC1264a0.f15157a = this;
    }

    public static C1268b0 L(AbstractC1264a0 abstractC1264a0) {
        C1268b0 c1268b0 = abstractC1264a0.f15157a;
        return c1268b0 != null ? c1268b0 : new C1268b0(abstractC1264a0);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void A(int i7, Object obj) {
        if (obj instanceof S) {
            X x6 = (X) this.f15163a;
            x6.q(11);
            x6.p(2, i7);
            x6.f(3, (S) obj);
            x6.q(12);
            return;
        }
        AbstractC1264a0 abstractC1264a0 = this.f15163a;
        W0 w02 = (W0) obj;
        X x7 = (X) abstractC1264a0;
        x7.q(11);
        x7.p(2, i7);
        x7.q(26);
        x7.q(w02.c());
        w02.b(abstractC1264a0);
        x7.q(12);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void B(int i7, Object obj, InterfaceC1293h1 interfaceC1293h1) {
        W0 w02 = (W0) obj;
        X x6 = (X) this.f15163a;
        x6.q((i7 << 3) | 2);
        x6.q(((AbstractC1352z) w02).d(interfaceC1293h1));
        interfaceC1293h1.a(w02, x6.f15157a);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void C(int i7, int i8) {
        this.f15163a.g(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void D(int i7, List list, boolean z6) {
        if (list instanceof M0) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f15163a.o(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                AbstractC1264a0 abstractC1264a0 = this.f15163a;
                long jLongValue = ((Long) list.get(i8)).longValue();
                abstractC1264a0.r(i7, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int iX = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            long jLongValue2 = ((Long) list.get(i9)).longValue();
            iX += AbstractC1264a0.x((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f15163a.q(iX);
        while (i8 < list.size()) {
            AbstractC1264a0 abstractC1264a02 = this.f15163a;
            long jLongValue3 = ((Long) list.get(i8)).longValue();
            abstractC1264a02.s((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void E(int i7, List list, boolean z6) {
        if (list instanceof AbstractC1312m0) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f15163a.o(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f15163a.g(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).floatValue();
            i9 += 4;
        }
        this.f15163a.q(i9);
        while (i8 < list.size()) {
            this.f15163a.h(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void F(int i7, int i8) {
        this.f15163a.p(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void G(int i7, long j7) {
        this.f15163a.i(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void H(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof F0)) {
            while (i8 < list.size()) {
                this.f15163a.n(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        F0 f02 = (F0) list;
        while (i8 < list.size()) {
            Object objU = f02.U(i8);
            if (objU instanceof String) {
                this.f15163a.n(i7, (String) objU);
            } else {
                this.f15163a.f(i7, (S) objU);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void I(int i7, long j7) {
        this.f15163a.r(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void J(int i7) {
        this.f15163a.o(i7, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void K(int i7) {
        this.f15163a.o(i7, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void a(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f15163a.f(i7, (S) list.get(i8));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.P1
    public final void b(int i7, List list, boolean z6) {
        if (list instanceof F) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f15163a.o(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f15163a.e(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).booleanValue();
            i9++;
        }
        this.f15163a.q(i9);
        while (i8 < list.size()) {
            this.f15163a.d(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void c(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C1332s0)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f15163a.g(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f15163a.o(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).intValue();
                i9 += 4;
            }
            this.f15163a.q(i9);
            while (i8 < list.size()) {
                this.f15163a.h(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C1332s0 c1332s0 = (C1332s0) list;
        if (!z6) {
            while (i8 < c1332s0.size()) {
                this.f15163a.g(i7, c1332s0.f(i8));
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c1332s0.size(); i12++) {
            c1332s0.f(i12);
            i11 += 4;
        }
        this.f15163a.q(i11);
        while (i8 < c1332s0.size()) {
            this.f15163a.h(c1332s0.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void d(int i7, String str) {
        this.f15163a.n(i7, str);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void e(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C1332s0)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f15163a.k(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f15163a.o(i7, 2);
            int iX = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iX += AbstractC1264a0.x(((Integer) list.get(i9)).intValue());
            }
            this.f15163a.q(iX);
            while (i8 < list.size()) {
                this.f15163a.l(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C1332s0 c1332s0 = (C1332s0) list;
        if (!z6) {
            while (i8 < c1332s0.size()) {
                this.f15163a.k(i7, c1332s0.f(i8));
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int iX2 = 0;
        for (int i10 = 0; i10 < c1332s0.size(); i10++) {
            iX2 += AbstractC1264a0.x(c1332s0.f(i10));
        }
        this.f15163a.q(iX2);
        while (i8 < c1332s0.size()) {
            this.f15163a.l(c1332s0.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void f(int i7, List list, boolean z6) {
        if (list instanceof M0) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f15163a.o(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f15163a.i(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).longValue();
            i9 += 8;
        }
        this.f15163a.q(i9);
        while (i8 < list.size()) {
            this.f15163a.j(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void g(int i7, List list, boolean z6) {
        if (list instanceof AbstractC1272c0) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f15163a.o(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f15163a.i(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).doubleValue();
            i9 += 8;
        }
        this.f15163a.q(i9);
        while (i8 < list.size()) {
            this.f15163a.j(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void h(int i7, Object obj, InterfaceC1293h1 interfaceC1293h1) {
        AbstractC1264a0 abstractC1264a0 = this.f15163a;
        abstractC1264a0.o(i7, 3);
        interfaceC1293h1.a((W0) obj, abstractC1264a0.f15157a);
        abstractC1264a0.o(i7, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void i(int i7, int i8) {
        this.f15163a.p(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void j(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C1332s0)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f15163a.g(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f15163a.o(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).intValue();
                i9 += 4;
            }
            this.f15163a.q(i9);
            while (i8 < list.size()) {
                this.f15163a.h(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C1332s0 c1332s0 = (C1332s0) list;
        if (!z6) {
            while (i8 < c1332s0.size()) {
                this.f15163a.g(i7, c1332s0.f(i8));
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < c1332s0.size(); i12++) {
            c1332s0.f(i12);
            i11 += 4;
        }
        this.f15163a.q(i11);
        while (i8 < c1332s0.size()) {
            this.f15163a.h(c1332s0.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void k(int i7, int i8) {
        this.f15163a.g(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void l(int i7, boolean z6) {
        this.f15163a.e(i7, z6);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void m(int i7, S s6) {
        this.f15163a.f(i7, s6);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void n(int i7, long j7) {
        this.f15163a.r(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void o(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C1332s0)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f15163a.p(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f15163a.o(i7, 2);
            int iW = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iW += AbstractC1264a0.w(((Integer) list.get(i9)).intValue());
            }
            this.f15163a.q(iW);
            while (i8 < list.size()) {
                this.f15163a.q(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C1332s0 c1332s0 = (C1332s0) list;
        if (!z6) {
            while (i8 < c1332s0.size()) {
                this.f15163a.p(i7, c1332s0.f(i8));
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int iW2 = 0;
        for (int i10 = 0; i10 < c1332s0.size(); i10++) {
            iW2 += AbstractC1264a0.w(c1332s0.f(i10));
        }
        this.f15163a.q(iW2);
        while (i8 < c1332s0.size()) {
            this.f15163a.q(c1332s0.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void p(int i7, List list, boolean z6) {
        if (list instanceof M0) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f15163a.o(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f15163a.i(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).longValue();
            i9 += 8;
        }
        this.f15163a.q(i9);
        while (i8 < list.size()) {
            this.f15163a.j(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void q(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C1332s0)) {
            if (!z6) {
                while (i8 < list.size()) {
                    this.f15163a.k(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.f15163a.o(i7, 2);
            int iX = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                iX += AbstractC1264a0.x(((Integer) list.get(i9)).intValue());
            }
            this.f15163a.q(iX);
            while (i8 < list.size()) {
                this.f15163a.l(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        C1332s0 c1332s0 = (C1332s0) list;
        if (!z6) {
            while (i8 < c1332s0.size()) {
                this.f15163a.k(i7, c1332s0.f(i8));
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int iX2 = 0;
        for (int i10 = 0; i10 < c1332s0.size(); i10++) {
            iX2 += AbstractC1264a0.x(c1332s0.f(i10));
        }
        this.f15163a.q(iX2);
        while (i8 < c1332s0.size()) {
            this.f15163a.l(c1332s0.f(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void r(int i7, long j7) {
        this.f15163a.i(i7, j7);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void s(int i7, int i8) {
        this.f15163a.k(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void t(int i7, int i8) {
        this.f15163a.k(i7, i8);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void u(int i7, List list, boolean z6) {
        int i8 = 0;
        if (!(list instanceof C1332s0)) {
            if (!z6) {
                while (i8 < list.size()) {
                    AbstractC1264a0 abstractC1264a0 = this.f15163a;
                    int iIntValue = ((Integer) list.get(i8)).intValue();
                    abstractC1264a0.p(i7, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i8++;
                }
                return;
            }
            this.f15163a.o(i7, 2);
            int iW = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int iIntValue2 = ((Integer) list.get(i9)).intValue();
                iW += AbstractC1264a0.w((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f15163a.q(iW);
            while (i8 < list.size()) {
                AbstractC1264a0 abstractC1264a02 = this.f15163a;
                int iIntValue3 = ((Integer) list.get(i8)).intValue();
                abstractC1264a02.q((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i8++;
            }
            return;
        }
        C1332s0 c1332s0 = (C1332s0) list;
        if (!z6) {
            while (i8 < c1332s0.size()) {
                AbstractC1264a0 abstractC1264a03 = this.f15163a;
                int iF = c1332s0.f(i8);
                abstractC1264a03.p(i7, (iF >> 31) ^ (iF + iF));
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int iW2 = 0;
        for (int i10 = 0; i10 < c1332s0.size(); i10++) {
            int iF2 = c1332s0.f(i10);
            iW2 += AbstractC1264a0.w((iF2 >> 31) ^ (iF2 + iF2));
        }
        this.f15163a.q(iW2);
        while (i8 < c1332s0.size()) {
            AbstractC1264a0 abstractC1264a04 = this.f15163a;
            int iF3 = c1332s0.f(i8);
            abstractC1264a04.q((iF3 >> 31) ^ (iF3 + iF3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void v(int i7, double d7) {
        this.f15163a.i(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void w(int i7, long j7) {
        this.f15163a.r(i7, (j7 >> 63) ^ (j7 + j7));
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void x(int i7, List list, boolean z6) {
        if (list instanceof M0) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f15163a.o(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f15163a.r(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int iX = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iX += AbstractC1264a0.x(((Long) list.get(i9)).longValue());
        }
        this.f15163a.q(iX);
        while (i8 < list.size()) {
            this.f15163a.s(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void y(int i7, float f7) {
        this.f15163a.g(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void z(int i7, List list, boolean z6) {
        if (list instanceof M0) {
            androidx.appcompat.app.y.a(list);
            if (!z6) {
                throw null;
            }
            this.f15163a.o(i7, 2);
            throw null;
        }
        int i8 = 0;
        if (!z6) {
            while (i8 < list.size()) {
                this.f15163a.r(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.f15163a.o(i7, 2);
        int iX = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            iX += AbstractC1264a0.x(((Long) list.get(i9)).longValue());
        }
        this.f15163a.q(iX);
        while (i8 < list.size()) {
            this.f15163a.s(((Long) list.get(i8)).longValue());
            i8++;
        }
    }
}
