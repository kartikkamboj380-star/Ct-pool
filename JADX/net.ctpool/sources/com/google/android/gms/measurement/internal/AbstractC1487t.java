package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1487t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Handler f16274d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1526y3 f16275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f16276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile long f16277c;

    AbstractC1487t(InterfaceC1526y3 interfaceC1526y3) {
        Preconditions.checkNotNull(interfaceC1526y3);
        this.f16275a = interfaceC1526y3;
        this.f16276b = new RunnableC1508w(this, interfaceC1526y3);
    }

    private final Handler f() {
        Handler handler;
        if (f16274d != null) {
            return f16274d;
        }
        synchronized (AbstractC1487t.class) {
            try {
                if (f16274d == null) {
                    f16274d = new com.google.android.gms.internal.measurement.N0(this.f16275a.a().getMainLooper());
                }
                handler = f16274d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void a() {
        this.f16277c = 0L;
        f().removeCallbacks(this.f16276b);
    }

    public final void b(long j7) {
        a();
        if (j7 >= 0) {
            this.f16277c = this.f16275a.zzb().currentTimeMillis();
            if (f().postDelayed(this.f16276b, j7)) {
                return;
            }
            this.f16275a.d().E().b("Failed to schedule delayed post. time", Long.valueOf(j7));
        }
    }

    public abstract void d();

    public final boolean e() {
        return this.f16277c != 0;
    }
}
