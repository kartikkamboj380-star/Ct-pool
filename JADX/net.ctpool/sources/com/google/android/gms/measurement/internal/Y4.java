package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import w3.InterfaceC2195f;

/* JADX INFO: loaded from: classes.dex */
final class Y4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f15869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f15870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f15871o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ String f15872p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ M5 f15873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ F4 f15874r;

    Y4(F4 f42, AtomicReference atomicReference, String str, String str2, String str3, M5 m52) {
        this.f15869m = atomicReference;
        this.f15870n = str;
        this.f15871o = str2;
        this.f15872p = str3;
        this.f15873q = m52;
        this.f15874r = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC2195f interfaceC2195f;
        AtomicReference atomicReference2;
        List listD;
        synchronized (this.f15869m) {
            try {
                try {
                    interfaceC2195f = this.f15874r.f15449d;
                } catch (RemoteException e7) {
                    this.f15874r.d().E().d("(legacy) Failed to get conditional properties; remote exception", C1449n2.t(this.f15870n), this.f15871o, e7);
                    this.f15869m.set(Collections.emptyList());
                    atomicReference = this.f15869m;
                }
                if (interfaceC2195f == null) {
                    this.f15874r.d().E().d("(legacy) Failed to get conditional properties; not connected to service", C1449n2.t(this.f15870n), this.f15871o, this.f15872p);
                    this.f15869m.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f15870n)) {
                    Preconditions.checkNotNull(this.f15873q);
                    atomicReference2 = this.f15869m;
                    listD = interfaceC2195f.c(this.f15871o, this.f15872p, this.f15873q);
                } else {
                    atomicReference2 = this.f15869m;
                    listD = interfaceC2195f.D(this.f15870n, this.f15871o, this.f15872p);
                }
                atomicReference2.set(listD);
                this.f15874r.k0();
                atomicReference = this.f15869m;
                atomicReference.notify();
            } finally {
                this.f15869m.notify();
            }
        }
    }
}
