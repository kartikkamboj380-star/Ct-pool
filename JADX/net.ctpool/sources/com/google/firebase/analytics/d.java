package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1073e1;
import java.util.List;
import java.util.Map;
import w3.z;

/* JADX INFO: loaded from: classes.dex */
final class d implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f17365a;

    d(C1073e1 c1073e1) {
        this.f17365a = c1073e1;
    }

    @Override // w3.z
    public final void a(String str) {
        this.f17365a.B(str);
    }

    @Override // w3.z
    public final void b(Bundle bundle) {
        this.f17365a.l(bundle);
    }

    @Override // w3.z
    public final long c() {
        return this.f17365a.b();
    }

    @Override // w3.z
    public final String d() {
        return this.f17365a.Q();
    }

    @Override // w3.z
    public final String e() {
        return this.f17365a.O();
    }

    @Override // w3.z
    public final int f(String str) {
        return this.f17365a.a(str);
    }

    @Override // w3.z
    public final void g(String str, String str2, Bundle bundle) {
        this.f17365a.t(str, str2, bundle);
    }

    @Override // w3.z
    public final void h(String str) {
        this.f17365a.H(str);
    }

    @Override // w3.z
    public final List i(String str, String str2) {
        return this.f17365a.g(str, str2);
    }

    @Override // w3.z
    public final Map j(String str, String str2, boolean z6) {
        return this.f17365a.h(str, str2, z6);
    }

    @Override // w3.z
    public final void k(String str, String str2, Bundle bundle) {
        this.f17365a.D(str, str2, bundle);
    }

    @Override // w3.z
    public final String zzg() {
        return this.f17365a.N();
    }

    @Override // w3.z
    public final String zzi() {
        return this.f17365a.P();
    }
}
