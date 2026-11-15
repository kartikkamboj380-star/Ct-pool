package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C1195r7;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class CallableC1491t3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f16278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f16279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X2 f16280c;

    CallableC1491t3(X2 x22, M5 m52, Bundle bundle) {
        this.f16278a = m52;
        this.f16279b = bundle;
        this.f16280c = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f16280c.f15844a.x0();
        H5 h52 = this.f16280c.f15844a;
        M5 m52 = this.f16278a;
        Bundle bundle = this.f16279b;
        h52.f().l();
        if (!C1195r7.a() || !h52.g0().D(m52.f15695m, G.f15473I0) || m52.f15695m == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    h52.d().E().a("Uri sources and timestamps do not match");
                } else {
                    for (int i7 = 0; i7 < intArray.length; i7++) {
                        C1425k c1425kJ0 = h52.j0();
                        String str = m52.f15695m;
                        int i8 = intArray[i7];
                        long j7 = longArray[i7];
                        Preconditions.checkNotEmpty(str);
                        c1425kJ0.l();
                        c1425kJ0.s();
                        try {
                            int iDelete = c1425kJ0.z().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i8), String.valueOf(j7)});
                            c1425kJ0.d().I().d("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i8), Long.valueOf(j7));
                        } catch (SQLiteException e7) {
                            c1425kJ0.d().E().c("Error pruning trigger URIs. appId", C1449n2.t(str), e7);
                        }
                    }
                }
            }
        }
        return h52.j0().V0(m52.f15695m);
    }
}
