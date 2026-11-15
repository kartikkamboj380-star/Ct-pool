package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;
import w3.z;

/* JADX INFO: loaded from: classes.dex */
final class a extends AppMeasurement.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f15332a;

    public a(z zVar) {
        super();
        Preconditions.checkNotNull(zVar);
        this.f15332a = zVar;
    }

    @Override // w3.z
    public final void a(String str) {
        this.f15332a.a(str);
    }

    @Override // w3.z
    public final void b(Bundle bundle) {
        this.f15332a.b(bundle);
    }

    @Override // w3.z
    public final long c() {
        return this.f15332a.c();
    }

    @Override // w3.z
    public final String d() {
        return this.f15332a.d();
    }

    @Override // w3.z
    public final String e() {
        return this.f15332a.e();
    }

    @Override // w3.z
    public final int f(String str) {
        return this.f15332a.f(str);
    }

    @Override // w3.z
    public final void g(String str, String str2, Bundle bundle) {
        this.f15332a.g(str, str2, bundle);
    }

    @Override // w3.z
    public final void h(String str) {
        this.f15332a.h(str);
    }

    @Override // w3.z
    public final List i(String str, String str2) {
        return this.f15332a.i(str, str2);
    }

    @Override // w3.z
    public final Map j(String str, String str2, boolean z6) {
        return this.f15332a.j(str, str2, z6);
    }

    @Override // w3.z
    public final void k(String str, String str2, Bundle bundle) {
        this.f15332a.k(str, str2, bundle);
    }

    @Override // w3.z
    public final String zzg() {
        return this.f15332a.zzg();
    }

    @Override // w3.z
    public final String zzi() {
        return this.f15332a.zzi();
    }
}
