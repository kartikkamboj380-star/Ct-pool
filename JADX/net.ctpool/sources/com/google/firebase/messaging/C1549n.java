package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.InterfaceC2263c;

/* JADX INFO: renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1549n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17690c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static q0 f17691d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f17693b = new U.m();

    public C1549n(Context context) {
        this.f17692a = context;
    }

    private static AbstractC2272l e(Context context, Intent intent, boolean z6) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        q0 q0VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z6) {
            return q0VarF.c(intent).h(new U.m(), new InterfaceC2263c() { // from class: com.google.firebase.messaging.m
                @Override // z3.InterfaceC2263c
                public final Object a(AbstractC2272l abstractC2272l) {
                    return C1549n.g(abstractC2272l);
                }
            });
        }
        if (a0.b().e(context)) {
            l0.f(context, q0VarF, intent);
        } else {
            q0VarF.c(intent);
        }
        return AbstractC2275o.f(-1);
    }

    private static q0 f(Context context, String str) {
        q0 q0Var;
        synchronized (f17690c) {
            try {
                if (f17691d == null) {
                    f17691d = new q0(context, str);
                }
                q0Var = f17691d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer g(AbstractC2272l abstractC2272l) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(a0.b().g(context, intent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer i(AbstractC2272l abstractC2272l) {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC2272l j(Context context, Intent intent, boolean z6, AbstractC2272l abstractC2272l) {
        return (PlatformVersion.isAtLeastO() && ((Integer) abstractC2272l.l()).intValue() == 402) ? e(context, intent, z6).h(new U.m(), new InterfaceC2263c() { // from class: com.google.firebase.messaging.l
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l2) {
                return C1549n.i(abstractC2272l2);
            }
        }) : abstractC2272l;
    }

    public AbstractC2272l k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f17692a, intent);
    }

    public AbstractC2272l l(final Context context, final Intent intent) {
        boolean z6 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z7 = (intent.getFlags() & 268435456) != 0;
        return (!z6 || z7) ? AbstractC2275o.d(this.f17693b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1549n.h(context, intent);
            }
        }).j(this.f17693b, new InterfaceC2263c() { // from class: com.google.firebase.messaging.k
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l) {
                return C1549n.j(context, intent, z7, abstractC2272l);
            }
        }) : e(context, intent, z7);
    }
}
