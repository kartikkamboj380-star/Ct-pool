package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.Map;
import n.C1890a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1522y extends AbstractC1357a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f16353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f16354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f16355d;

    public C1522y(S2 s22) {
        super(s22);
        this.f16354c = new C1890a();
        this.f16353b = new C1890a();
    }

    static /* synthetic */ void A(C1522y c1522y, String str, long j7) {
        c1522y.l();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) c1522y.f16354c.get(str);
        if (num == null) {
            c1522y.d().E().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C1520x4 c1520x4A = c1522y.q().A(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            c1522y.f16354c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        c1522y.f16354c.remove(str);
        Long l7 = (Long) c1522y.f16353b.get(str);
        if (l7 == null) {
            c1522y.d().E().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = j7 - l7.longValue();
            c1522y.f16353b.remove(str);
            c1522y.y(str, jLongValue, c1520x4A);
        }
        if (c1522y.f16354c.isEmpty()) {
            long j8 = c1522y.f16355d;
            if (j8 == 0) {
                c1522y.d().E().a("First ad exposure time was never set");
            } else {
                c1522y.u(j7 - j8, c1520x4A);
                c1522y.f16355d = 0L;
            }
        }
    }

    private final void u(long j7, C1520x4 c1520x4) {
        if (c1520x4 == null) {
            d().I().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            d().I().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j7);
        d6.V(c1520x4, bundle, true);
        p().Z0("am", "_xa", bundle);
    }

    static /* synthetic */ void w(C1522y c1522y, String str, long j7) {
        c1522y.l();
        Preconditions.checkNotEmpty(str);
        if (c1522y.f16354c.isEmpty()) {
            c1522y.f16355d = j7;
        }
        Integer num = (Integer) c1522y.f16354c.get(str);
        if (num != null) {
            c1522y.f16354c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c1522y.f16354c.size() >= 100) {
            c1522y.d().J().a("Too many ads visible");
        } else {
            c1522y.f16354c.put(str, 1);
            c1522y.f16353b.put(str, Long.valueOf(j7));
        }
    }

    private final void y(String str, long j7, C1520x4 c1520x4) {
        if (c1520x4 == null) {
            d().I().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            d().I().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j7);
        d6.V(c1520x4, bundle, true);
        p().Z0("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(long j7) {
        Iterator it = this.f16353b.keySet().iterator();
        while (it.hasNext()) {
            this.f16353b.put((String) it.next(), Long.valueOf(j7));
        }
        if (this.f16353b.isEmpty()) {
            return;
        }
        this.f16355d = j7;
    }

    public final void B(String str, long j7) {
        if (str == null || str.length() == 0) {
            d().E().a("Ad unit id must be a non-empty string");
        } else {
            f().B(new RunnableC1530z0(this, str, j7));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1, com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1522y m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1400g2 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1393f2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ F3 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1513w4 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ F4 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1357a1
    public final /* bridge */ /* synthetic */ C1466p5 s() {
        return super.s();
    }

    public final void t(long j7) {
        C1520x4 c1520x4A = q().A(false);
        for (String str : this.f16353b.keySet()) {
            y(str, j7 - ((Long) this.f16353b.get(str)).longValue(), c1520x4A);
        }
        if (!this.f16353b.isEmpty()) {
            u(j7 - this.f16355d, c1520x4A);
        }
        z(j7);
    }

    public final void x(String str, long j7) {
        if (str == null || str.length() == 0) {
            d().E().a("Ad unit id must be a non-empty string");
        } else {
            f().B(new RunnableC1355a(this, str, j7));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1369c zzd() {
        return super.zzd();
    }
}
