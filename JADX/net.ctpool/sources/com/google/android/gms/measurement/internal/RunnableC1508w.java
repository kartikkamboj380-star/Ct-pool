package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1508w implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ InterfaceC1526y3 f16320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ AbstractC1487t f16321n;

    RunnableC1508w(AbstractC1487t abstractC1487t, InterfaceC1526y3 interfaceC1526y3) {
        this.f16320m = interfaceC1526y3;
        this.f16321n = abstractC1487t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16320m.zzd();
        if (C1369c.a()) {
            this.f16320m.f().B(this);
            return;
        }
        boolean zE = this.f16321n.e();
        this.f16321n.f16277c = 0L;
        if (zE) {
            this.f16321n.d();
        }
    }
}
