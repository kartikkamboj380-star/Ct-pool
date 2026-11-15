package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1055c1;

/* JADX INFO: loaded from: classes.dex */
public final class D3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f15402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f15403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f15404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f15405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Boolean f15406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f15407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    C1055c1 f15408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f15409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Long f15410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f15411j;

    public D3(Context context, C1055c1 c1055c1, Long l7) {
        this.f15409h = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f15402a = applicationContext;
        this.f15410i = l7;
        if (c1055c1 != null) {
            this.f15408g = c1055c1;
            this.f15403b = c1055c1.f14533r;
            this.f15404c = c1055c1.f14532q;
            this.f15405d = c1055c1.f14531p;
            this.f15409h = c1055c1.f14530o;
            this.f15407f = c1055c1.f14529n;
            this.f15411j = c1055c1.f14535t;
            Bundle bundle = c1055c1.f14534s;
            if (bundle != null) {
                this.f15406e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
