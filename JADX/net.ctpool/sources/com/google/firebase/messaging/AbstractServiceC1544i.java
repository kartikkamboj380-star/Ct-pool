package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.n0;
import java.util.concurrent.ExecutorService;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;
import z3.InterfaceC2266f;

/* JADX INFO: renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC1544i extends Service {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Binder f17656n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17658p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ExecutorService f17655m = AbstractC1550o.d();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f17657o = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f17659q = 0;

    /* JADX INFO: renamed from: com.google.firebase.messaging.i$a */
    class a implements n0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.n0.a
        public AbstractC2272l a(Intent intent) {
            return AbstractServiceC1544i.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            l0.c(intent);
        }
        synchronized (this.f17657o) {
            try {
                int i7 = this.f17659q - 1;
                this.f17659q = i7;
                if (i7 == 0) {
                    k(this.f17658p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, AbstractC2272l abstractC2272l) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, C2273m c2273m) {
        try {
            f(intent);
        } finally {
            c2273m.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC2272l j(final Intent intent) {
        if (g(intent)) {
            return AbstractC2275o.f(null);
        }
        final C2273m c2273m = new C2273m();
        this.f17655m.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f17647m.i(intent, c2273m);
            }
        });
        return c2273m.a();
    }

    protected abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i7) {
        return stopSelfResult(i7);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f17656n == null) {
                this.f17656n = new n0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17656n;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f17655m.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i7, int i8) {
        synchronized (this.f17657o) {
            this.f17658p = i8;
            this.f17659q++;
        }
        Intent intentE = e(intent);
        if (intentE == null) {
            d(intent);
            return 2;
        }
        AbstractC2272l abstractC2272lJ = j(intentE);
        if (abstractC2272lJ.o()) {
            d(intent);
            return 2;
        }
        abstractC2272lJ.b(new U.m(), new InterfaceC2266f() { // from class: com.google.firebase.messaging.g
            @Override // z3.InterfaceC2266f
            public final void a(AbstractC2272l abstractC2272l) {
                this.f17641a.h(intent, abstractC2272l);
            }
        });
        return 3;
    }
}
