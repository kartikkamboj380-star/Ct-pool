package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.F3;
import com.google.android.gms.measurement.internal.S2;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class b extends AppMeasurement.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f15333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F3 f15334b;

    public b(S2 s22) {
        super();
        Preconditions.checkNotNull(s22);
        this.f15333a = s22;
        this.f15334b = s22.F();
    }

    @Override // w3.z
    public final void a(String str) {
        this.f15333a.w().x(str, this.f15333a.zzb().elapsedRealtime());
    }

    @Override // w3.z
    public final void b(Bundle bundle) {
        this.f15334b.L0(bundle);
    }

    @Override // w3.z
    public final long c() {
        return this.f15333a.J().P0();
    }

    @Override // w3.z
    public final String d() {
        return this.f15334b.t0();
    }

    @Override // w3.z
    public final String e() {
        return this.f15334b.u0();
    }

    @Override // w3.z
    public final int f(String str) {
        return F3.C(str);
    }

    @Override // w3.z
    public final void g(String str, String str2, Bundle bundle) {
        this.f15333a.F().d0(str, str2, bundle);
    }

    @Override // w3.z
    public final void h(String str) {
        this.f15333a.w().B(str, this.f15333a.zzb().elapsedRealtime());
    }

    @Override // w3.z
    public final List i(String str, String str2) {
        return this.f15334b.E(str, str2);
    }

    @Override // w3.z
    public final Map j(String str, String str2, boolean z6) {
        return this.f15334b.F(str, str2, z6);
    }

    @Override // w3.z
    public final void k(String str, String str2, Bundle bundle) {
        this.f15334b.R0(str, str2, bundle);
    }

    @Override // w3.z
    public final String zzg() {
        return this.f15334b.t0();
    }

    @Override // w3.z
    public final String zzi() {
        return this.f15334b.v0();
    }
}
