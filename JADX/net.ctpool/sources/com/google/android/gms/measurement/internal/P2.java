package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class P2 extends AbstractC1533z3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicLong f15726l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T2 f15727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T2 f15728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PriorityBlockingQueue f15729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BlockingQueue f15730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f15731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f15732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f15733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Semaphore f15734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f15735k;

    P2(S2 s22) {
        super(s22);
        this.f15733i = new Object();
        this.f15734j = new Semaphore(2);
        this.f15729e = new PriorityBlockingQueue();
        this.f15730f = new LinkedBlockingQueue();
        this.f15731g = new R2(this, "Thread death: Uncaught exception on worker thread");
        this.f15732h = new R2(this, "Thread death: Uncaught exception on network thread");
    }

    private final void w(Q2 q22) {
        synchronized (this.f15733i) {
            try {
                this.f15729e.add(q22);
                T2 t22 = this.f15727c;
                if (t22 == null) {
                    T2 t23 = new T2(this, "Measurement Worker", this.f15729e);
                    this.f15727c = t23;
                    t23.setUncaughtExceptionHandler(this.f15731g);
                    this.f15727c.start();
                } else {
                    t22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(Runnable runnable) {
        n();
        Preconditions.checkNotNull(runnable);
        w(new Q2(this, runnable, false, "Task exception on worker thread"));
    }

    public final void E(Runnable runnable) {
        n();
        Preconditions.checkNotNull(runnable);
        w(new Q2(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean H() {
        return Thread.currentThread() == this.f15727c;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1397g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1515x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1449n2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1407h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ C1532z2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ d6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final void j() {
        if (Thread.currentThread() != this.f15728d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3
    public final void l() {
        if (Thread.currentThread() != this.f15727c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1533z3
    protected final boolean r() {
        return false;
    }

    final Object t(AtomicReference atomicReference, long j7, String str, Runnable runnable) {
        synchronized (atomicReference) {
            f().B(runnable);
            try {
                atomicReference.wait(j7);
            } catch (InterruptedException unused) {
                d().J().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            d().J().a("Timed out waiting for " + str);
        }
        return obj;
    }

    public final Future u(Callable callable) {
        n();
        Preconditions.checkNotNull(callable);
        Q2 q22 = new Q2(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f15727c) {
            if (!this.f15729e.isEmpty()) {
                d().J().a("Callable skipped the worker queue.");
            }
            q22.run();
        } else {
            w(q22);
        }
        return q22;
    }

    public final void x(Runnable runnable) {
        n();
        Preconditions.checkNotNull(runnable);
        Q2 q22 = new Q2(this, runnable, false, "Task exception on network thread");
        synchronized (this.f15733i) {
            try {
                this.f15730f.add(q22);
                T2 t22 = this.f15728d;
                if (t22 == null) {
                    T2 t23 = new T2(this, "Measurement Network", this.f15730f);
                    this.f15728d = t23;
                    t23.setUncaughtExceptionHandler(this.f15732h);
                    this.f15728d.start();
                } else {
                    t22.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future z(Callable callable) {
        n();
        Preconditions.checkNotNull(callable);
        Q2 q22 = new Q2(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f15727c) {
            q22.run();
        } else {
            w(q22);
        }
        return q22;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1512w3, com.google.android.gms.measurement.internal.InterfaceC1526y3
    public final /* bridge */ /* synthetic */ C1369c zzd() {
        return super.zzd();
    }
}
