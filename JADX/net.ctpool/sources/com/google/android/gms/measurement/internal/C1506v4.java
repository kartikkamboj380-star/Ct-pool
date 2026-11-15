package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC1260z4;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C1199s2;
import com.google.android.gms.internal.measurement.C1204s7;
import com.google.android.gms.internal.measurement.C1208t2;
import com.google.android.gms.internal.measurement.C1217u2;
import com.google.android.gms.internal.measurement.C1234w2;
import com.google.android.gms.internal.measurement.C1242x2;
import com.google.android.gms.internal.measurement.C1250y2;
import com.google.android.gms.internal.measurement.Y6;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1506v4 extends E5 {
    public C1506v4(H5 h52) {
        super(h52);
    }

    private static String i(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    public final byte[] w(E e7, String str) {
        a6 a6Var;
        Bundle bundle;
        C1242x2.a aVar;
        C1234w2.a aVar2;
        C1372c2 c1372c2;
        byte[] bArr;
        long j7;
        A a7;
        l();
        this.f16325a.O();
        Preconditions.checkNotNull(e7);
        Preconditions.checkNotEmpty(str);
        if (!b().D(str, G.f15545m0)) {
            d().D().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(e7.f15418m) && !"_iapx".equals(e7.f15418m)) {
            d().D().c("Generating a payload for this event is not available. package_name, event_name", str, e7.f15418m);
            return null;
        }
        C1234w2.a aVarJ = C1234w2.J();
        o().a1();
        try {
            C1372c2 c1372c2K0 = o().K0(str);
            if (c1372c2K0 == null) {
                d().D().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!c1372c2K0.A()) {
                d().D().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            C1242x2.a aVarY0 = C1242x2.u2().w0(1).Y0("android");
            if (!TextUtils.isEmpty(c1372c2K0.l())) {
                aVarY0.S(c1372c2K0.l());
            }
            if (!TextUtils.isEmpty(c1372c2K0.n())) {
                aVarY0.f0((String) Preconditions.checkNotNull(c1372c2K0.n()));
            }
            if (!TextUtils.isEmpty(c1372c2K0.o())) {
                aVarY0.l0((String) Preconditions.checkNotNull(c1372c2K0.o()));
            }
            if (c1372c2K0.U() != -2147483648L) {
                aVarY0.i0((int) c1372c2K0.U());
            }
            aVarY0.p0(c1372c2K0.z0()).d0(c1372c2K0.v0());
            String strQ = c1372c2K0.q();
            String strJ = c1372c2K0.j();
            if (!TextUtils.isEmpty(strQ)) {
                aVarY0.R0(strQ);
            } else if (!TextUtils.isEmpty(strJ)) {
                aVarY0.H(strJ);
            }
            aVarY0.G0(c1372c2K0.J0());
            A3 a3S = this.f15455b.S(str);
            aVarY0.W(c1372c2K0.t0());
            if (this.f16325a.n() && b().L(aVarY0.f1()) && a3S.y() && !TextUtils.isEmpty(null)) {
                aVarY0.I0(null);
            }
            aVarY0.u0(a3S.w());
            if (a3S.y() && c1372c2K0.z()) {
                Pair pairX = q().x(c1372c2K0.l(), a3S);
                if (c1372c2K0.z() && pairX != null && !TextUtils.isEmpty((CharSequence) pairX.first)) {
                    aVarY0.a1(i((String) pairX.first, Long.toString(e7.f15421p)));
                    Object obj = pairX.second;
                    if (obj != null) {
                        aVarY0.Z(((Boolean) obj).booleanValue());
                    }
                }
            }
            c().n();
            C1242x2.a aVarD0 = aVarY0.D0(Build.MODEL);
            c().n();
            aVarD0.W0(Build.VERSION.RELEASE).F0((int) c().s()).e1(c().t());
            if (a3S.z() && c1372c2K0.m() != null) {
                aVarY0.Y(i((String) Preconditions.checkNotNull(c1372c2K0.m()), Long.toString(e7.f15421p)));
            }
            if (!TextUtils.isEmpty(c1372c2K0.p())) {
                aVarY0.P0((String) Preconditions.checkNotNull(c1372c2K0.p()));
            }
            String strL = c1372c2K0.l();
            List listW0 = o().W0(strL);
            Iterator it = listW0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    a6Var = null;
                    break;
                }
                a6Var = (a6) it.next();
                if ("_lte".equals(a6Var.f15908c)) {
                    break;
                }
            }
            if (a6Var == null || a6Var.f15910e == null) {
                a6 a6Var2 = new a6(strL, "auto", "_lte", zzb().currentTimeMillis(), 0L);
                listW0.add(a6Var2);
                o().g0(a6Var2);
            }
            com.google.android.gms.internal.measurement.B2[] b2Arr = new com.google.android.gms.internal.measurement.B2[listW0.size()];
            for (int i7 = 0; i7 < listW0.size(); i7++) {
                B2.a aVarZ = com.google.android.gms.internal.measurement.B2.Q().x(((a6) listW0.get(i7)).f15908c).z(((a6) listW0.get(i7)).f15909d);
                m().T(aVarZ, ((a6) listW0.get(i7)).f15910e);
                b2Arr[i7] = (com.google.android.gms.internal.measurement.B2) ((AbstractC1260z4) aVarZ.p());
            }
            aVarY0.k0(Arrays.asList(b2Arr));
            this.f15455b.v(c1372c2K0, aVarY0);
            if (Y6.a() && b().r(G.f15499V0)) {
                this.f15455b.Y(c1372c2K0, aVarY0);
            }
            C1476r2 c1476r2B = C1476r2.b(e7);
            h().L(c1476r2B.f16256d, o().I0(str));
            h().U(c1476r2B, b().t(str));
            Bundle bundle2 = c1476r2B.f16256d;
            bundle2.putLong("_c", 1L);
            d().D().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", e7.f15420o);
            if (h().C0(aVarY0.f1(), c1372c2K0.v())) {
                h().M(bundle2, "_dbg", 1L);
                h().M(bundle2, "_r", 1L);
            }
            A aJ0 = o().J0(str, e7.f15418m);
            if (aJ0 == null) {
                bundle = bundle2;
                aVar = aVarY0;
                aVar2 = aVarJ;
                c1372c2 = c1372c2K0;
                bArr = null;
                a7 = new A(str, e7.f15418m, 0L, 0L, e7.f15421p, 0L, null, null, null, null);
                j7 = 0;
            } else {
                bundle = bundle2;
                aVar = aVarY0;
                aVar2 = aVarJ;
                c1372c2 = c1372c2K0;
                bArr = null;
                j7 = aJ0.f15340f;
                a7 = aJ0.a(e7.f15421p);
            }
            o().S(a7);
            B b7 = new B(this.f16325a, e7.f15420o, str, e7.f15418m, e7.f15421p, j7, bundle);
            C1199s2.a aVarY = C1199s2.Q().E(b7.f15371d).C(b7.f15369b).y(b7.f15372e);
            for (String str2 : b7.f15373f) {
                C1217u2.a aVarZ2 = C1217u2.S().z(str2);
                Object objH0 = b7.f15373f.H0(str2);
                if (objH0 != null) {
                    m().S(aVarZ2, objH0);
                    aVarY.z(aVarZ2);
                }
            }
            C1242x2.a aVar3 = aVar;
            aVar3.C(aVarY).D(C1250y2.E().t(C1208t2.E().t(a7.f15337c).u(e7.f15418m)));
            aVar3.G(n().x(c1372c2.l(), Collections.emptyList(), aVar3.K(), Long.valueOf(aVarY.G()), Long.valueOf(aVarY.G())));
            if (aVarY.K()) {
                aVar3.C0(aVarY.G()).j0(aVarY.G());
            }
            long jD0 = c1372c2.D0();
            if (jD0 != 0) {
                aVar3.t0(jD0);
            }
            long jH0 = c1372c2.H0();
            if (jH0 != 0) {
                aVar3.x0(jH0);
            } else if (jD0 != 0) {
                aVar3.x0(jD0);
            }
            String strU = c1372c2.u();
            if (C1204s7.a() && b().D(str, G.f15568x0) && strU != null) {
                aVar3.c1(strU);
            }
            c1372c2.y();
            aVar3.o0((int) c1372c2.F0()).O0(106000L).K0(zzb().currentTimeMillis()).g0(true);
            this.f15455b.C(aVar3.f1(), aVar3);
            C1234w2.a aVar4 = aVar2;
            aVar4.u(aVar3);
            C1372c2 c1372c22 = c1372c2;
            c1372c22.C0(aVar3.m0());
            c1372c22.y0(aVar3.h0());
            o().T(c1372c22, false, false);
            o().i1();
            try {
                return m().f0(((C1234w2) ((AbstractC1260z4) aVar4.p())).i());
            } catch (IOException e8) {
                d().E().c("Data loss. Failed to bundle and serialize. appId", C1449n2.t(str), e8);
                return bArr;
            }
        } catch (SecurityException e9) {
            d().D().b("Resettable device id encryption failed", e9.getMessage());
            return new byte[0];
        } catch (SecurityException e10) {
            d().D().b("app instance id encryption failed", e10.getMessage());
            return new byte[0];
        } finally {
            o().g1();
        }
    }
}
