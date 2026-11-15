package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import w3.InterfaceC2195f;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1361a5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f15899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f15900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ String f15901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ String f15902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ M5 f15903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ boolean f15904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final /* synthetic */ F4 f15905s;

    RunnableC1361a5(F4 f42, AtomicReference atomicReference, String str, String str2, String str3, M5 m52, boolean z6) {
        this.f15899m = atomicReference;
        this.f15900n = str;
        this.f15901o = str2;
        this.f15902p = str3;
        this.f15903q = m52;
        this.f15904r = z6;
        this.f15905s = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC2195f interfaceC2195f;
        AtomicReference atomicReference2;
        List listL;
        synchronized (this.f15899m) {
            try {
                try {
                    interfaceC2195f = this.f15905s.f15449d;
                } catch (RemoteException e7) {
                    this.f15905s.d().E().d("(legacy) Failed to get user properties; remote exception", C1449n2.t(this.f15900n), this.f15901o, e7);
                    this.f15899m.set(Collections.emptyList());
                    atomicReference = this.f15899m;
                }
                if (interfaceC2195f == null) {
                    this.f15905s.d().E().d("(legacy) Failed to get user properties; not connected to service", C1449n2.t(this.f15900n), this.f15901o, this.f15902p);
                    this.f15899m.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f15900n)) {
                    Preconditions.checkNotNull(this.f15903q);
                    atomicReference2 = this.f15899m;
                    listL = interfaceC2195f.R(this.f15901o, this.f15902p, this.f15904r, this.f15903q);
                } else {
                    atomicReference2 = this.f15899m;
                    listL = interfaceC2195f.l(this.f15900n, this.f15901o, this.f15902p, this.f15904r);
                }
                atomicReference2.set(listL);
                this.f15905s.k0();
                atomicReference = this.f15899m;
                atomicReference.notify();
            } finally {
                this.f15899m.notify();
            }
        }
    }
}
