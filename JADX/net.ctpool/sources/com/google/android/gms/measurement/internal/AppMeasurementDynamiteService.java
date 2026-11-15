package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C1055c1;
import com.google.android.gms.internal.measurement.InterfaceC1037a1;
import java.util.Map;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    S2 f15362a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f15363b = new C1890a();

    class a implements w3.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.V0 f15364a;

        a(com.google.android.gms.internal.measurement.V0 v02) {
            this.f15364a = v02;
        }

        @Override // w3.w
        public final void a(String str, String str2, Bundle bundle, long j7) {
            try {
                this.f15364a.L(str, str2, bundle, j7);
            } catch (RemoteException e7) {
                S2 s22 = AppMeasurementDynamiteService.this.f15362a;
                if (s22 != null) {
                    s22.d().J().b("Event interceptor threw exception", e7);
                }
            }
        }
    }

    class b implements w3.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.measurement.V0 f15366a;

        b(com.google.android.gms.internal.measurement.V0 v02) {
            this.f15366a = v02;
        }

        @Override // w3.v
        public final void a(String str, String str2, Bundle bundle, long j7) {
            try {
                this.f15366a.L(str, str2, bundle, j7);
            } catch (RemoteException e7) {
                S2 s22 = AppMeasurementDynamiteService.this.f15362a;
                if (s22 != null) {
                    s22.d().J().b("Event listener threw exception", e7);
                }
            }
        }
    }

    private final void j0() {
        if (this.f15362a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void k0(com.google.android.gms.internal.measurement.U0 u02, String str) {
        j0();
        this.f15362a.J().Q(u02, str);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void beginAdUnitExposure(String str, long j7) {
        j0();
        this.f15362a.w().x(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        j0();
        this.f15362a.F().d0(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void clearMeasurementEnabled(long j7) {
        j0();
        this.f15362a.F().X(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void endAdUnitExposure(String str, long j7) {
        j0();
        this.f15362a.w().B(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void generateEventId(com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        long jP0 = this.f15362a.J().P0();
        j0();
        this.f15362a.J().O(u02, jP0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getAppInstanceId(com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        this.f15362a.f().B(new U2(this, u02));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        k0(u02, this.f15362a.F().t0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        this.f15362a.f().B(new RunnableC1458o4(this, u02, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        k0(u02, this.f15362a.F().u0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        k0(u02, this.f15362a.F().v0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getGmpAppId(com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        k0(u02, this.f15362a.F().w0());
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        this.f15362a.F();
        F3.C(str);
        j0();
        this.f15362a.J().N(u02, 25);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getSessionId(com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        this.f15362a.F().N(u02);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getTestFlag(com.google.android.gms.internal.measurement.U0 u02, int i7) {
        j0();
        if (i7 == 0) {
            this.f15362a.J().Q(u02, this.f15362a.F().x0());
            return;
        }
        if (i7 == 1) {
            this.f15362a.J().O(u02, this.f15362a.F().s0().longValue());
            return;
        }
        if (i7 != 2) {
            if (i7 == 3) {
                this.f15362a.J().N(u02, this.f15362a.F().r0().intValue());
                return;
            } else {
                if (i7 != 4) {
                    return;
                }
                this.f15362a.J().S(u02, this.f15362a.F().p0().booleanValue());
                return;
            }
        }
        d6 d6VarJ = this.f15362a.J();
        double dDoubleValue = this.f15362a.F().q0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            u02.b(bundle);
        } catch (RemoteException e7) {
            d6VarJ.f16325a.d().J().b("Error returning double value to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void getUserProperties(String str, String str2, boolean z6, com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        this.f15362a.f().B(new RunnableC1505v3(this, u02, str, str2, z6));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initForTests(Map map) {
        j0();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void initialize(com.google.android.gms.dynamic.a aVar, C1055c1 c1055c1, long j7) {
        S2 s22 = this.f15362a;
        if (s22 == null) {
            this.f15362a = S2.b((Context) Preconditions.checkNotNull((Context) com.google.android.gms.dynamic.b.j0(aVar)), c1055c1, Long.valueOf(j7));
        } else {
            s22.d().J().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.U0 u02) {
        j0();
        this.f15362a.f().B(new RunnableC1452n5(this, u02));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z7, long j7) {
        j0();
        this.f15362a.F().f0(str, str2, bundle, z6, z7, j7);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.U0 u02, long j7) {
        j0();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f15362a.f().B(new O3(this, u02, new E(str2, new D(bundle), "app", j7), str));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void logHealthData(int i7, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        j0();
        this.f15362a.d().x(i7, true, false, str, aVar == null ? null : com.google.android.gms.dynamic.b.j0(aVar), aVar2 == null ? null : com.google.android.gms.dynamic.b.j0(aVar2), aVar3 != null ? com.google.android.gms.dynamic.b.j0(aVar3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j7) {
        j0();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksN0 = this.f15362a.F().n0();
        if (activityLifecycleCallbacksN0 != null) {
            this.f15362a.F().B0();
            activityLifecycleCallbacksN0.onActivityCreated((Activity) com.google.android.gms.dynamic.b.j0(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j7) {
        j0();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksN0 = this.f15362a.F().n0();
        if (activityLifecycleCallbacksN0 != null) {
            this.f15362a.F().B0();
            activityLifecycleCallbacksN0.onActivityDestroyed((Activity) com.google.android.gms.dynamic.b.j0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j7) {
        j0();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksN0 = this.f15362a.F().n0();
        if (activityLifecycleCallbacksN0 != null) {
            this.f15362a.F().B0();
            activityLifecycleCallbacksN0.onActivityPaused((Activity) com.google.android.gms.dynamic.b.j0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j7) {
        j0();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksN0 = this.f15362a.F().n0();
        if (activityLifecycleCallbacksN0 != null) {
            this.f15362a.F().B0();
            activityLifecycleCallbacksN0.onActivityResumed((Activity) com.google.android.gms.dynamic.b.j0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, com.google.android.gms.internal.measurement.U0 u02, long j7) {
        j0();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksN0 = this.f15362a.F().n0();
        Bundle bundle = new Bundle();
        if (activityLifecycleCallbacksN0 != null) {
            this.f15362a.F().B0();
            activityLifecycleCallbacksN0.onActivitySaveInstanceState((Activity) com.google.android.gms.dynamic.b.j0(aVar), bundle);
        }
        try {
            u02.b(bundle);
        } catch (RemoteException e7) {
            this.f15362a.d().J().b("Error returning bundle value to wrapper", e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j7) {
        j0();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksN0 = this.f15362a.F().n0();
        if (activityLifecycleCallbacksN0 != null) {
            this.f15362a.F().B0();
            activityLifecycleCallbacksN0.onActivityStarted((Activity) com.google.android.gms.dynamic.b.j0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j7) {
        j0();
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacksN0 = this.f15362a.F().n0();
        if (activityLifecycleCallbacksN0 != null) {
            this.f15362a.F().B0();
            activityLifecycleCallbacksN0.onActivityStopped((Activity) com.google.android.gms.dynamic.b.j0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.U0 u02, long j7) {
        j0();
        u02.b(null);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.V0 v02) {
        w3.v bVar;
        j0();
        synchronized (this.f15363b) {
            try {
                bVar = (w3.v) this.f15363b.get(Integer.valueOf(v02.a()));
                if (bVar == null) {
                    bVar = new b(v02);
                    this.f15363b.put(Integer.valueOf(v02.a()), bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15362a.F().l0(bVar);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void resetAnalyticsData(long j7) {
        j0();
        this.f15362a.F().G(j7);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConditionalUserProperty(Bundle bundle, long j7) {
        j0();
        if (bundle == null) {
            this.f15362a.d().E().a("Conditional user property must not be null");
        } else {
            this.f15362a.F().M0(bundle, j7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsent(Bundle bundle, long j7) {
        j0();
        this.f15362a.F().W0(bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setConsentThirdParty(Bundle bundle, long j7) {
        j0();
        this.f15362a.F().b1(bundle, j7);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j7) {
        j0();
        this.f15362a.G().F((Activity) com.google.android.gms.dynamic.b.j0(aVar), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDataCollectionEnabled(boolean z6) {
        j0();
        this.f15362a.F().a1(z6);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setDefaultEventParameters(Bundle bundle) {
        j0();
        this.f15362a.F().V0(bundle);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setEventInterceptor(com.google.android.gms.internal.measurement.V0 v02) {
        j0();
        a aVar = new a(v02);
        if (this.f15362a.f().H()) {
            this.f15362a.F().m0(aVar);
        } else {
            this.f15362a.f().B(new M4(this, aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setInstanceIdProvider(InterfaceC1037a1 interfaceC1037a1) {
        j0();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMeasurementEnabled(boolean z6, long j7) {
        j0();
        this.f15362a.F().X(Boolean.valueOf(z6));
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setMinimumSessionDuration(long j7) {
        j0();
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSessionTimeoutDuration(long j7) {
        j0();
        this.f15362a.F().U0(j7);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setSgtmDebugInfo(Intent intent) {
        j0();
        this.f15362a.F().I(intent);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserId(String str, long j7) {
        j0();
        this.f15362a.F().Z(str, j7);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z6, long j7) {
        j0();
        this.f15362a.F().i0(str, str2, com.google.android.gms.dynamic.b.j0(aVar), z6, j7);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.V0 v02) {
        w3.v bVar;
        j0();
        synchronized (this.f15363b) {
            bVar = (w3.v) this.f15363b.remove(Integer.valueOf(v02.a()));
        }
        if (bVar == null) {
            bVar = new b(v02);
        }
        this.f15362a.F().S0(bVar);
    }
}
