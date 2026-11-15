package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
final class Q2 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f15744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final boolean f15745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f15746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ P2 f15747p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q2(P2 p22, Runnable runnable, boolean z6, String str) {
        super(com.google.android.gms.internal.measurement.M0.a().b(runnable), null);
        this.f15747p = p22;
        Preconditions.checkNotNull(str);
        long andIncrement = P2.f15726l.getAndIncrement();
        this.f15744m = andIncrement;
        this.f15746o = str;
        this.f15745n = z6;
        if (andIncrement == Long.MAX_VALUE) {
            p22.d().E().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        Q2 q22 = (Q2) obj;
        boolean z6 = this.f15745n;
        if (z6 != q22.f15745n) {
            return z6 ? -1 : 1;
        }
        long j7 = this.f15744m;
        long j8 = q22.f15744m;
        if (j7 < j8) {
            return -1;
        }
        if (j7 > j8) {
            return 1;
        }
        this.f15747p.d().G().b("Two tasks share the same index. index", Long.valueOf(this.f15744m));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f15747p.d().E().b(this.f15746o, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q2(P2 p22, Callable callable, boolean z6, String str) {
        super(com.google.android.gms.internal.measurement.M0.a().a(callable));
        this.f15747p = p22;
        Preconditions.checkNotNull(str);
        long andIncrement = P2.f15726l.getAndIncrement();
        this.f15744m = andIncrement;
        this.f15746o = str;
        this.f15745n = z6;
        if (andIncrement == Long.MAX_VALUE) {
            p22.d().E().a("Tasks index overflow");
        }
    }
}
