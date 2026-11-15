package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n.C1890a;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
class i0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f17661i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f17663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G f17664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FirebaseMessaging f17665d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f17667f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g0 f17669h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f17666e = new C1890a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17668g = false;

    private i0(FirebaseMessaging firebaseMessaging, L l7, g0 g0Var, G g7, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f17665d = firebaseMessaging;
        this.f17663b = l7;
        this.f17669h = g0Var;
        this.f17664c = g7;
        this.f17662a = context;
        this.f17667f = scheduledExecutorService;
    }

    private void b(f0 f0Var, C2273m c2273m) {
        ArrayDeque arrayDeque;
        synchronized (this.f17666e) {
            try {
                String strE = f0Var.e();
                if (this.f17666e.containsKey(strE)) {
                    arrayDeque = (ArrayDeque) this.f17666e.get(strE);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f17666e.put(strE, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(c2273m);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void c(AbstractC2272l abstractC2272l) throws IOException {
        try {
            AbstractC2275o.b(abstractC2272l, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            e = e7;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e8);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e9) {
            e = e9;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void d(String str) throws IOException {
        c(this.f17664c.n(this.f17665d.n(), str));
    }

    private void e(String str) throws IOException {
        c(this.f17664c.o(this.f17665d.n(), str));
    }

    static AbstractC2272l f(final FirebaseMessaging firebaseMessaging, final L l7, final G g7, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return AbstractC2275o.d(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.h0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i0.j(context, scheduledExecutorService, firebaseMessaging, l7, g7);
            }
        });
    }

    static boolean h() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i0 j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, L l7, G g7) {
        return new i0(firebaseMessaging, l7, g0.b(context, scheduledExecutorService), g7, context, scheduledExecutorService);
    }

    private void k(f0 f0Var) {
        synchronized (this.f17666e) {
            try {
                String strE = f0Var.e();
                if (this.f17666e.containsKey(strE)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.f17666e.get(strE);
                    C2273m c2273m = (C2273m) arrayDeque.poll();
                    if (c2273m != null) {
                        c2273m.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.f17666e.remove(strE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void p() {
        if (i()) {
            return;
        }
        t(0L);
    }

    boolean g() {
        return this.f17669h.c() != null;
    }

    synchronized boolean i() {
        return this.f17668g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean l(f0 f0Var) throws IOException {
        String str;
        byte b7;
        String str2;
        try {
            String strB = f0Var.b();
            int iHashCode = strB.hashCode();
            if (iHashCode != 83) {
                b7 = (iHashCode == 85 && strB.equals("U")) ? (byte) 1 : (byte) -1;
            } else if (strB.equals("S")) {
                b7 = 0;
            }
            if (b7 == 0) {
                d(f0Var.c());
                if (h()) {
                    str2 = "Subscribe to topic: " + f0Var.c() + " succeeded.";
                    Log.d("FirebaseMessaging", str2);
                }
            } else if (b7 == 1) {
                e(f0Var.c());
                if (h()) {
                    str2 = "Unsubscribe from topic: " + f0Var.c() + " succeeded.";
                    Log.d("FirebaseMessaging", str2);
                }
            } else if (h()) {
                str2 = "Unknown topic operation" + f0Var + ".";
                Log.d("FirebaseMessaging", str2);
            }
            return true;
        } catch (IOException e7) {
            if ("SERVICE_NOT_AVAILABLE".equals(e7.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e7.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e7.getMessage())) {
                str = "Topic operation failed: " + e7.getMessage() + ". Will retry Topic operation.";
            } else {
                if (e7.getMessage() != null) {
                    throw e7;
                }
                str = "Topic operation failed without exception message. Will retry Topic operation.";
            }
            Log.e("FirebaseMessaging", str);
            return false;
        }
    }

    void m(Runnable runnable, long j7) {
        this.f17667f.schedule(runnable, j7, TimeUnit.SECONDS);
    }

    AbstractC2272l n(f0 f0Var) {
        this.f17669h.a(f0Var);
        C2273m c2273m = new C2273m();
        b(f0Var, c2273m);
        return c2273m.a();
    }

    synchronized void o(boolean z6) {
        this.f17668g = z6;
    }

    void q() {
        if (g()) {
            p();
        }
    }

    AbstractC2272l r(String str) {
        AbstractC2272l abstractC2272lN = n(f0.f(str));
        q();
        return abstractC2272lN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (h() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean s() {
        while (true) {
            synchronized (this) {
                try {
                    f0 f0VarC = this.f17669h.c();
                    if (f0VarC == null) {
                        break;
                    }
                    if (!l(f0VarC)) {
                        return false;
                    }
                    this.f17669h.e(f0VarC);
                    k(f0VarC);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    void t(long j7) {
        m(new j0(this, this.f17662a, this.f17663b, Math.min(Math.max(30L, 2 * j7), f17661i)), j7);
        o(true);
    }

    AbstractC2272l u(String str) {
        AbstractC2272l abstractC2272lN = n(f0.g(str));
        q();
        return abstractC2272lN;
    }
}
