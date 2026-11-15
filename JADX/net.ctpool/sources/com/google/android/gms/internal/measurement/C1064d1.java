package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1064d1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ String f14544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ String f14545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ Context f14546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final /* synthetic */ Bundle f14547t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final /* synthetic */ C1073e1 f14548u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1064d1(C1073e1 c1073e1, String str, String str2, Context context, Bundle bundle) {
        super(c1073e1);
        this.f14544q = str;
        this.f14545r = str2;
        this.f14546s = context;
        this.f14547t = bundle;
        this.f14548u = c1073e1;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f14548u.J(this.f14544q, this.f14545r)) {
                str3 = this.f14545r;
                str2 = this.f14544q;
                str = this.f14548u.f14559a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.f14546s);
            C1073e1 c1073e1 = this.f14548u;
            c1073e1.f14567i = c1073e1.c(this.f14546s, true);
            if (this.f14548u.f14567i == null) {
                Log.w(this.f14548u.f14559a, "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(this.f14546s, ModuleDescriptor.MODULE_ID);
            ((P0) Preconditions.checkNotNull(this.f14548u.f14567i)).initialize(com.google.android.gms.dynamic.b.k0(this.f14546s), new C1055c1(106000L, Math.max(iA, r0), DynamiteModule.b(this.f14546s, ModuleDescriptor.MODULE_ID) < iA, str, str2, str3, this.f14547t, w3.p.a(this.f14546s)), this.f14568m);
        } catch (Exception e7) {
            this.f14548u.r(e7, true, false);
        }
    }
}
