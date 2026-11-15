package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1073e1;

/* JADX INFO: loaded from: classes.dex */
final class I1 extends C1073e1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Bundle f14219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ Activity f14220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ C1073e1.c f14221s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I1(C1073e1.c cVar, Bundle bundle, Activity activity) {
        super(C1073e1.this);
        this.f14219q = bundle;
        this.f14220r = activity;
        this.f14221s = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C1073e1.a
    final void a() {
        Bundle bundle;
        if (this.f14219q != null) {
            bundle = new Bundle();
            if (this.f14219q.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f14219q.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((P0) Preconditions.checkNotNull(C1073e1.this.f14567i)).onActivityCreated(com.google.android.gms.dynamic.b.k0(this.f14220r), bundle, this.f14569n);
    }
}
