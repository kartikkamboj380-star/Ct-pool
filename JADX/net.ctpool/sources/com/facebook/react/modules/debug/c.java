package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import z2.InterfaceC2256a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements NotThreadSafeBridgeIdleDebugListener, InterfaceC2256a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11857f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S1.d f11858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S1.d f11859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S1.d f11860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S1.d f11861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f11862e;

    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(S1.d dVar, long j7) {
            int iG = dVar.g();
            int i7 = 0;
            for (int i8 = 0; i8 < iG; i8++) {
                if (dVar.d(i8) < j7) {
                    i7++;
                }
            }
            if (i7 > 0) {
                int i9 = iG - i7;
                for (int i10 = 0; i10 < i9; i10++) {
                    dVar.f(i10, dVar.d(i10 + i7));
                }
                dVar.c(i7);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long e(S1.d dVar, long j7, long j8) {
            int iG = dVar.g();
            long j9 = -1;
            for (int i7 = 0; i7 < iG; i7++) {
                long jD = dVar.d(i7);
                if (j7 > jD || jD >= j8) {
                    if (jD >= j8) {
                        break;
                    }
                } else {
                    j9 = jD;
                }
            }
            return j9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f(S1.d dVar, long j7, long j8) {
            int iG = dVar.g();
            for (int i7 = 0; i7 < iG; i7++) {
                long jD = dVar.d(i7);
                if (j7 <= jD && jD < j8) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c() {
        S1.d dVarB = S1.d.b(20);
        k.e(dVarB, "createWithInitialCapacity(...)");
        this.f11858a = dVarB;
        S1.d dVarB2 = S1.d.b(20);
        k.e(dVarB2, "createWithInitialCapacity(...)");
        this.f11859b = dVarB2;
        S1.d dVarB3 = S1.d.b(20);
        k.e(dVarB3, "createWithInitialCapacity(...)");
        this.f11860c = dVarB3;
        S1.d dVarB4 = S1.d.b(20);
        k.e(dVarB4, "createWithInitialCapacity(...)");
        this.f11861d = dVarB4;
        this.f11862e = true;
    }

    private final boolean c(long j7, long j8) {
        a aVar = f11857f;
        long jE = aVar.e(this.f11858a, j7, j8);
        long jE2 = aVar.e(this.f11859b, j7, j8);
        return (jE == -1 && jE2 == -1) ? this.f11862e : jE > jE2;
    }

    @Override // z2.InterfaceC2256a
    public synchronized void a() {
        this.f11860c.a(System.nanoTime());
    }

    @Override // z2.InterfaceC2256a
    public synchronized void b() {
        this.f11861d.a(System.nanoTime());
    }

    public final synchronized boolean d(long j7, long j8) {
        boolean z6;
        try {
            a aVar = f11857f;
            boolean zF = aVar.f(this.f11861d, j7, j8);
            boolean zC = c(j7, j8);
            z6 = true;
            if (!zF && (!zC || aVar.f(this.f11860c, j7, j8))) {
                z6 = false;
            }
            aVar.d(this.f11858a, j8);
            aVar.d(this.f11859b, j8);
            aVar.d(this.f11860c, j8);
            aVar.d(this.f11861d, j8);
            this.f11862e = zC;
        } catch (Throwable th) {
            throw th;
        }
        return z6;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f11859b.a(System.nanoTime());
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f11858a.a(System.nanoTime());
    }
}
