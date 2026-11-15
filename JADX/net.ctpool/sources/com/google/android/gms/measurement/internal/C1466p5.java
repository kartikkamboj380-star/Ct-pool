package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1466p5 extends AbstractC1525y2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f16238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final C1514w5 f16240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final C1500u5 f16241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1493t5 f16242g;

    C1466p5(S2 s22) {
        super(s22);
        this.f16239d = true;
        this.f16240e = new C1514w5(this);
        this.f16241f = new C1500u5(this);
        this.f16242g = new C1493t5(this);
    }

    static /* synthetic */ void A(C1466p5 c1466p5, long j7) {
        c1466p5.l();
        c1466p5.E();
        c1466p5.d().I().b("Activity paused, time", Long.valueOf(j7));
        c1466p5.f16242g.b(j7);
        if (c1466p5.b().T()) {
            c1466p5.f16241f.e(j7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        l();
        if (this.f16238c == null) {
            this.f16238c = new com.google.android.gms.internal.measurement.N0(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void G(C1466p5 c1466p5, long j7) {
        c1466p5.l();
        c1466p5.E();
        c1466p5.d().I().b("Activity resumed, time", Long.valueOf(j7));
        if (!c1466p5.b().r(G.f15487P0) ? c1466p5.b().T() || c1466p5.g().f16388u.b() : c1466p5.b().T() || c1466p5.f16239d) {
            c1466p5.f16241f.f(j7);
        }
        c1466p5.f16242g.a();
        C1514w5 c1514w5 = c1466p5.f16240e;
        c1514w5.f16336a.l();
        if (c1514w5.f16336a.f16325a.n()) {
            c1514w5.b(c1514w5.f16336a.zzb().currentTimeMillis(), false);
        }
    }

    final void B(boolean z6) {
        l();
        this.f16239d = z6;
    }

    public final boolean C(boolean z6, boolean z7, long j7) {
        return this.f16241f.d(z6, z7, j7);
    }

    final boolean D() {
        l();
        return this.f16239d;
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

    @Override // com.google.android.gms.measurement.internal.AbstractC1525y2
    protected final boolean y() {
        return false;
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
