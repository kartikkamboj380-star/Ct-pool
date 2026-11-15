package com.android.billingclient.api;

import C0.AbstractC0348o;
import C0.InterfaceC0336c;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC1271c;
import com.google.android.gms.internal.play_billing.D2;
import com.google.android.gms.internal.play_billing.I2;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class u implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10343a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10344b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0336c f10345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C0749c f10346d;

    /* synthetic */ u(C0749c c0749c, InterfaceC0336c interfaceC0336c, AbstractC0348o abstractC0348o) {
        this.f10346d = c0749c;
        this.f10345c = interfaceC0336c;
    }

    private final void d(C0751e c0751e) {
        synchronized (this.f10343a) {
            try {
                InterfaceC0336c interfaceC0336c = this.f10345c;
                if (interfaceC0336c != null) {
                    interfaceC0336c.a(c0751e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ Object a() {
        Bundle bundle;
        int i7;
        int i8;
        String strSubstring;
        int iK;
        synchronized (this.f10343a) {
            try {
                if (!this.f10344b) {
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                    }
                    int i9 = 3;
                    try {
                        String packageName = this.f10346d.f10210e.getPackageName();
                        iK = 3;
                        int i10 = 22;
                        while (true) {
                            if (i10 < 3) {
                                i10 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    iK = this.f10346d.f10212g.k(i10, packageName, "subs");
                                } catch (Exception e7) {
                                    e = e7;
                                    i9 = iK;
                                    com.google.android.gms.internal.play_billing.A.j("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                    if (e instanceof DeadObjectException) {
                                        i8 = 101;
                                    } else if (e instanceof RemoteException) {
                                        i8 = 100;
                                    } else if (e instanceof SecurityException) {
                                        i8 = 102;
                                    } else {
                                        i7 = 42;
                                        if (i7 != 42) {
                                            strSubstring = e.getClass().getSimpleName() + ": " + AbstractC1271c.b(e.getMessage());
                                            if (strSubstring.length() > 70) {
                                                strSubstring = strSubstring.substring(0, 70);
                                            }
                                        } else {
                                            strSubstring = null;
                                        }
                                        this.f10346d.f10206a = 0;
                                        this.f10346d.f10212g = null;
                                        iK = i9;
                                    }
                                    i7 = i8;
                                    if (i7 != 42) {
                                    }
                                    this.f10346d.f10206a = 0;
                                    this.f10346d.f10212g = null;
                                    iK = i9;
                                }
                            } else {
                                iK = this.f10346d.f10212g.V(i10, packageName, "subs", bundle);
                            }
                            if (iK == 0) {
                                com.google.android.gms.internal.play_billing.A.h("BillingClient", "highestLevelSupportedForSubs: " + i10);
                                break;
                            }
                            i10--;
                        }
                        boolean z6 = true;
                        this.f10346d.f10215j = i10 >= 5;
                        this.f10346d.f10214i = i10 >= 3;
                        if (i10 < 3) {
                            com.google.android.gms.internal.play_billing.A.h("BillingClient", "In-app billing API does not support subscription on this device.");
                            i7 = 9;
                        } else {
                            i7 = 1;
                        }
                        int i11 = 22;
                        while (true) {
                            if (i11 < 3) {
                                break;
                            }
                            iK = bundle == null ? this.f10346d.f10212g.k(i11, packageName, "inapp") : this.f10346d.f10212g.V(i11, packageName, "inapp", bundle);
                            if (iK == 0) {
                                this.f10346d.f10216k = i11;
                                com.google.android.gms.internal.play_billing.A.h("BillingClient", "mHighestLevelSupportedForInApp: " + this.f10346d.f10216k);
                                break;
                            }
                            i11--;
                        }
                        C0749c c0749c = this.f10346d;
                        c0749c.f10230y = c0749c.f10216k >= 22;
                        C0749c c0749c2 = this.f10346d;
                        c0749c2.f10229x = c0749c2.f10216k >= 21;
                        C0749c c0749c3 = this.f10346d;
                        c0749c3.f10228w = c0749c3.f10216k >= 20;
                        C0749c c0749c4 = this.f10346d;
                        c0749c4.f10227v = c0749c4.f10216k >= 19;
                        C0749c c0749c5 = this.f10346d;
                        c0749c5.f10226u = c0749c5.f10216k >= 18;
                        C0749c c0749c6 = this.f10346d;
                        c0749c6.f10225t = c0749c6.f10216k >= 17;
                        C0749c c0749c7 = this.f10346d;
                        c0749c7.f10224s = c0749c7.f10216k >= 16;
                        C0749c c0749c8 = this.f10346d;
                        c0749c8.f10223r = c0749c8.f10216k >= 15;
                        C0749c c0749c9 = this.f10346d;
                        c0749c9.f10222q = c0749c9.f10216k >= 14;
                        C0749c c0749c10 = this.f10346d;
                        c0749c10.f10221p = c0749c10.f10216k >= 12;
                        C0749c c0749c11 = this.f10346d;
                        c0749c11.f10220o = c0749c11.f10216k >= 10;
                        C0749c c0749c12 = this.f10346d;
                        c0749c12.f10219n = c0749c12.f10216k >= 9;
                        C0749c c0749c13 = this.f10346d;
                        c0749c13.f10218m = c0749c13.f10216k >= 8;
                        C0749c c0749c14 = this.f10346d;
                        if (c0749c14.f10216k < 6) {
                            z6 = false;
                        }
                        c0749c14.f10217l = z6;
                        if (this.f10346d.f10216k < 3) {
                            com.google.android.gms.internal.play_billing.A.i("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            i7 = 36;
                        }
                        if (iK == 0) {
                            this.f10346d.f10206a = 2;
                            if (this.f10346d.f10209d != null) {
                                this.f10346d.f10209d.g(this.f10346d.f10229x);
                            }
                        } else {
                            this.f10346d.f10206a = 0;
                            this.f10346d.f10212g = null;
                        }
                        strSubstring = null;
                    } catch (Exception e8) {
                        e = e8;
                    }
                    if (iK == 0) {
                        this.f10346d.V(w.c(6));
                        d(y.f10368l);
                    } else {
                        C0749c c0749c15 = this.f10346d;
                        C0751e c0751e = y.f10357a;
                        c0749c15.U(w.b(i7, 6, c0751e, strSubstring));
                        d(c0751e);
                    }
                }
            } finally {
            }
        }
        return null;
    }

    final /* synthetic */ void b() {
        this.f10346d.f10206a = 0;
        this.f10346d.f10212g = null;
        C0751e c0751e = y.f10370n;
        this.f10346d.U(w.a(24, 6, c0751e));
        d(c0751e);
    }

    final void c() {
        synchronized (this.f10343a) {
            this.f10345c = null;
            this.f10344b = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.A.h("BillingClient", "Billing service connected.");
        this.f10346d.f10212g = I2.i0(iBinder);
        Callable callable = new Callable() { // from class: com.android.billingclient.api.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f10341a.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f10342m.b();
            }
        };
        C0749c c0749c = this.f10346d;
        if (c0749c.T(callable, 30000L, runnable, c0749c.O()) == null) {
            C0749c c0749c2 = this.f10346d;
            C0751e c0751eQ = c0749c2.Q();
            c0749c2.U(w.a(25, 6, c0751eQ));
            d(c0751eQ);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.A.i("BillingClient", "Billing service disconnected.");
        this.f10346d.f10211f.a(D2.B());
        this.f10346d.f10212g = null;
        this.f10346d.f10206a = 0;
        synchronized (this.f10343a) {
            try {
                InterfaceC0336c interfaceC0336c = this.f10345c;
                if (interfaceC0336c != null) {
                    interfaceC0336c.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
