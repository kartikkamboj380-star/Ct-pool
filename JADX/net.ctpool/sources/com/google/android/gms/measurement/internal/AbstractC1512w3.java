package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1512w3 implements InterfaceC1526y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final S2 f16325a;

    AbstractC1512w3(S2 s22) {
        Preconditions.checkNotNull(s22);
        this.f16325a = s22;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public Context a() {
        return this.f16325a.a();
    }

    public C1397g b() {
        return this.f16325a.x();
    }

    public C1515x c() {
        return this.f16325a.y();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public C1449n2 d() {
        return this.f16325a.d();
    }

    public C1407h2 e() {
        return this.f16325a.B();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public P2 f() {
        return this.f16325a.f();
    }

    public C1532z2 g() {
        return this.f16325a.D();
    }

    public d6 h() {
        return this.f16325a.J();
    }

    public void j() {
        this.f16325a.f().j();
    }

    public void k() {
        this.f16325a.O();
    }

    public void l() {
        this.f16325a.f().l();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public Clock zzb() {
        return this.f16325a.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1526y3
    public C1369c zzd() {
        return this.f16325a.zzd();
    }
}
