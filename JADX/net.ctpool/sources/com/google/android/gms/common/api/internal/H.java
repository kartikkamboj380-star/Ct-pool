package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import z3.AbstractC2272l;
import z3.InterfaceC2266f;

/* JADX INFO: loaded from: classes.dex */
final class H implements InterfaceC2266f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GoogleApiManager f13566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ApiKey f13568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f13569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f13570e;

    H(GoogleApiManager googleApiManager, int i7, ApiKey apiKey, long j7, long j8, String str, String str2) {
        this.f13566a = googleApiManager;
        this.f13567b = i7;
        this.f13568c = apiKey;
        this.f13569d = j7;
        this.f13570e = j8;
    }

    static H b(GoogleApiManager googleApiManager, int i7, ApiKey apiKey) {
        boolean methodTimingTelemetryEnabled;
        if (!googleApiManager.zaD()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            methodTimingTelemetryEnabled = true;
        } else {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            methodTimingTelemetryEnabled = config.getMethodTimingTelemetryEnabled();
            zabq zabqVarZai = googleApiManager.zai(apiKey);
            if (zabqVarZai != null) {
                if (!(zabqVarZai.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zabqVarZai.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationC = c(zabqVarZai, baseGmsClient, i7);
                    if (connectionTelemetryConfigurationC == null) {
                        return null;
                    }
                    zabqVarZai.zaq();
                    methodTimingTelemetryEnabled = connectionTelemetryConfigurationC.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new H(googleApiManager, i7, apiKey, methodTimingTelemetryEnabled ? System.currentTimeMillis() : 0L, methodTimingTelemetryEnabled ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static ConnectionTelemetryConfiguration c(zabq zabqVar, BaseGmsClient baseGmsClient, int i7) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i7) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i7))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // z3.InterfaceC2266f
    public final void a(AbstractC2272l abstractC2272l) {
        zabq zabqVarZai;
        int version;
        int i7;
        int i8;
        int errorCode;
        long j7;
        long j8;
        int iElapsedRealtime;
        if (this.f13566a.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zabqVarZai = this.f13566a.zai(this.f13568c)) != null && (zabqVarZai.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zabqVarZai.zaf();
                int i9 = 0;
                boolean methodTimingTelemetryEnabled = this.f13569d > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int statusCode = 100;
                if (config != null) {
                    methodTimingTelemetryEnabled &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    version = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationC = c(zabqVarZai, baseGmsClient, this.f13567b);
                        if (connectionTelemetryConfigurationC == null) {
                            return;
                        }
                        boolean z6 = connectionTelemetryConfigurationC.getMethodTimingTelemetryEnabled() && this.f13569d > 0;
                        maxMethodInvocationsInBatch = connectionTelemetryConfigurationC.getMaxMethodInvocationsLogged();
                        methodTimingTelemetryEnabled = z6;
                    }
                    i8 = batchPeriodMillis;
                    i7 = maxMethodInvocationsInBatch;
                } else {
                    version = 0;
                    i7 = 100;
                    i8 = 5000;
                }
                GoogleApiManager googleApiManager = this.f13566a;
                if (abstractC2272l.p()) {
                    errorCode = 0;
                } else if (abstractC2272l.n()) {
                    i9 = statusCode;
                    errorCode = -1;
                } else {
                    Exception excK = abstractC2272l.k();
                    if (excK instanceof ApiException) {
                        Status status = ((ApiException) excK).getStatus();
                        statusCode = status.getStatusCode();
                        ConnectionResult connectionResult = status.getConnectionResult();
                        if (connectionResult != null) {
                            errorCode = connectionResult.getErrorCode();
                            i9 = statusCode;
                        }
                        i9 = statusCode;
                        errorCode = -1;
                    } else {
                        i9 = 101;
                        errorCode = -1;
                    }
                }
                if (methodTimingTelemetryEnabled) {
                    long j9 = this.f13569d;
                    long j10 = this.f13570e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j10);
                    j8 = jCurrentTimeMillis;
                    j7 = j9;
                } else {
                    j7 = 0;
                    j8 = 0;
                    iElapsedRealtime = -1;
                }
                googleApiManager.zaw(new MethodInvocation(this.f13567b, i9, errorCode, j7, j8, null, null, gCoreServiceId, iElapsedRealtime), version, i8, i7);
            }
        }
    }
}
