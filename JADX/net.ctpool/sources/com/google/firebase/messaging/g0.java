package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference f17643d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f17644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c0 f17645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f17646c;

    private g0(SharedPreferences sharedPreferences, Executor executor) {
        this.f17646c = executor;
        this.f17644a = sharedPreferences;
    }

    public static synchronized g0 b(Context context, Executor executor) {
        g0 g0Var;
        try {
            WeakReference weakReference = f17643d;
            g0Var = weakReference != null ? (g0) weakReference.get() : null;
            if (g0Var == null) {
                g0Var = new g0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                g0Var.d();
                f17643d = new WeakReference(g0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return g0Var;
    }

    private synchronized void d() {
        this.f17645b = c0.d(this.f17644a, "topic_operation_queue", ",", this.f17646c);
    }

    synchronized boolean a(f0 f0Var) {
        return this.f17645b.b(f0Var.e());
    }

    synchronized f0 c() {
        return f0.a(this.f17645b.f());
    }

    synchronized boolean e(f0 f0Var) {
        return this.f17645b.g(f0Var.e());
    }
}
