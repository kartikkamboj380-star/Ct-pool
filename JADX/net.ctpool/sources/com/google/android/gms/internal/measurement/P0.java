package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface P0 extends IInterface {
    void beginAdUnitExposure(String str, long j7);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j7);

    void endAdUnitExposure(String str, long j7);

    void generateEventId(U0 u02);

    void getAppInstanceId(U0 u02);

    void getCachedAppInstanceId(U0 u02);

    void getConditionalUserProperties(String str, String str2, U0 u02);

    void getCurrentScreenClass(U0 u02);

    void getCurrentScreenName(U0 u02);

    void getGmpAppId(U0 u02);

    void getMaxUserProperties(String str, U0 u02);

    void getSessionId(U0 u02);

    void getTestFlag(U0 u02, int i7);

    void getUserProperties(String str, String str2, boolean z6, U0 u02);

    void initForTests(Map map);

    void initialize(com.google.android.gms.dynamic.a aVar, C1055c1 c1055c1, long j7);

    void isDataCollectionEnabled(U0 u02);

    void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z7, long j7);

    void logEventAndBundle(String str, String str2, Bundle bundle, U0 u02, long j7);

    void logHealthData(int i7, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3);

    void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j7);

    void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j7);

    void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j7);

    void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j7);

    void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, U0 u02, long j7);

    void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j7);

    void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j7);

    void performAction(Bundle bundle, U0 u02, long j7);

    void registerOnMeasurementEventListener(V0 v02);

    void resetAnalyticsData(long j7);

    void setConditionalUserProperty(Bundle bundle, long j7);

    void setConsent(Bundle bundle, long j7);

    void setConsentThirdParty(Bundle bundle, long j7);

    void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j7);

    void setDataCollectionEnabled(boolean z6);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(V0 v02);

    void setInstanceIdProvider(InterfaceC1037a1 interfaceC1037a1);

    void setMeasurementEnabled(boolean z6, long j7);

    void setMinimumSessionDuration(long j7);

    void setSessionTimeoutDuration(long j7);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j7);

    void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z6, long j7);

    void unregisterOnMeasurementEventListener(V0 v02);
}
