package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import w3.InterfaceC2195f;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1368b5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ String f15929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f15930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ M5 f15931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f15932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ F4 f15933q;

    RunnableC1368b5(F4 f42, String str, String str2, M5 m52, com.google.android.gms.internal.measurement.U0 u02) {
        this.f15929m = str;
        this.f15930n = str2;
        this.f15931o = m52;
        this.f15932p = u02;
        this.f15933q = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                InterfaceC2195f interfaceC2195f = this.f15933q.f15449d;
                if (interfaceC2195f == null) {
                    this.f15933q.d().E().c("Failed to get conditional properties; not connected to service", this.f15929m, this.f15930n);
                } else {
                    Preconditions.checkNotNull(this.f15931o);
                    arrayList = d6.r0(interfaceC2195f.c(this.f15929m, this.f15930n, this.f15931o));
                    this.f15933q.k0();
                }
            } catch (RemoteException e7) {
                this.f15933q.d().E().d("Failed to get conditional properties; remote exception", this.f15929m, this.f15930n, e7);
            }
        } finally {
            this.f15933q.h().R(this.f15932p, arrayList);
        }
    }
}
