package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import y3.C2240a;
import z3.AbstractC2272l;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f17686a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f17687b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C2240a f17688c;

    private static void b(Context context) {
        if (f17688c == null) {
            C2240a c2240a = new C2240a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f17688c = c2240a;
            c2240a.d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Intent intent) {
        synchronized (f17687b) {
            try {
                if (f17688c != null && d(intent)) {
                    g(intent, false);
                    f17688c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    static void f(Context context, q0 q0Var, final Intent intent) {
        synchronized (f17687b) {
            try {
                b(context);
                boolean zD = d(intent);
                g(intent, true);
                if (!zD) {
                    f17688c.a(f17686a);
                }
                q0Var.c(intent).c(new InterfaceC2266f() { // from class: com.google.firebase.messaging.k0
                    @Override // z3.InterfaceC2266f
                    public final void a(AbstractC2272l abstractC2272l) {
                        l0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void g(Intent intent, boolean z6) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z6);
    }

    static ComponentName h(Context context, Intent intent) {
        synchronized (f17687b) {
            try {
                b(context);
                boolean zD = d(intent);
                g(intent, true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!zD) {
                    f17688c.a(f17686a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
