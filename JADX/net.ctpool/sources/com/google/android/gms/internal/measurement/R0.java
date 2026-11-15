package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends Y implements P0 {
    R0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void beginAdUnitExposure(String str, long j7) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeLong(j7);
        k0(23, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        AbstractC1036a0.d(parcelI0, bundle);
        k0(9, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void clearMeasurementEnabled(long j7) {
        Parcel parcelI0 = i0();
        parcelI0.writeLong(j7);
        k0(43, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void endAdUnitExposure(String str, long j7) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeLong(j7);
        k0(24, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void generateEventId(U0 u02) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, u02);
        k0(22, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getAppInstanceId(U0 u02) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, u02);
        k0(20, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCachedAppInstanceId(U0 u02) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, u02);
        k0(19, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getConditionalUserProperties(String str, String str2, U0 u02) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        AbstractC1036a0.c(parcelI0, u02);
        k0(10, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenClass(U0 u02) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, u02);
        k0(17, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getCurrentScreenName(U0 u02) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, u02);
        k0(16, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getGmpAppId(U0 u02) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, u02);
        k0(21, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getMaxUserProperties(String str, U0 u02) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        AbstractC1036a0.c(parcelI0, u02);
        k0(6, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getSessionId(U0 u02) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, u02);
        k0(46, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void getUserProperties(String str, String str2, boolean z6, U0 u02) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        AbstractC1036a0.e(parcelI0, z6);
        AbstractC1036a0.c(parcelI0, u02);
        k0(5, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void initialize(com.google.android.gms.dynamic.a aVar, C1055c1 c1055c1, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, aVar);
        AbstractC1036a0.d(parcelI0, c1055c1);
        parcelI0.writeLong(j7);
        k0(1, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z6, boolean z7, long j7) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        AbstractC1036a0.d(parcelI0, bundle);
        AbstractC1036a0.e(parcelI0, z6);
        AbstractC1036a0.e(parcelI0, z7);
        parcelI0.writeLong(j7);
        k0(2, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void logHealthData(int i7, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        Parcel parcelI0 = i0();
        parcelI0.writeInt(i7);
        parcelI0.writeString(str);
        AbstractC1036a0.c(parcelI0, aVar);
        AbstractC1036a0.c(parcelI0, aVar2);
        AbstractC1036a0.c(parcelI0, aVar3);
        k0(33, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, aVar);
        AbstractC1036a0.d(parcelI0, bundle);
        parcelI0.writeLong(j7);
        k0(27, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, aVar);
        parcelI0.writeLong(j7);
        k0(28, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, aVar);
        parcelI0.writeLong(j7);
        k0(29, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, aVar);
        parcelI0.writeLong(j7);
        k0(30, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, U0 u02, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, aVar);
        AbstractC1036a0.c(parcelI0, u02);
        parcelI0.writeLong(j7);
        k0(31, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, aVar);
        parcelI0.writeLong(j7);
        k0(25, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, aVar);
        parcelI0.writeLong(j7);
        k0(26, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void registerOnMeasurementEventListener(V0 v02) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, v02);
        k0(35, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void resetAnalyticsData(long j7) {
        Parcel parcelI0 = i0();
        parcelI0.writeLong(j7);
        k0(12, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setConditionalUserProperty(Bundle bundle, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, bundle);
        parcelI0.writeLong(j7);
        k0(8, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setConsentThirdParty(Bundle bundle, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, bundle);
        parcelI0.writeLong(j7);
        k0(45, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.c(parcelI0, aVar);
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        parcelI0.writeLong(j7);
        k0(15, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setDataCollectionEnabled(boolean z6) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.e(parcelI0, z6);
        k0(39, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.d(parcelI0, bundle);
        k0(42, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setMeasurementEnabled(boolean z6, long j7) {
        Parcel parcelI0 = i0();
        AbstractC1036a0.e(parcelI0, z6);
        parcelI0.writeLong(j7);
        k0(11, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setSessionTimeoutDuration(long j7) {
        Parcel parcelI0 = i0();
        parcelI0.writeLong(j7);
        k0(14, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setUserId(String str, long j7) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeLong(j7);
        k0(7, parcelI0);
    }

    @Override // com.google.android.gms.internal.measurement.P0
    public final void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z6, long j7) {
        Parcel parcelI0 = i0();
        parcelI0.writeString(str);
        parcelI0.writeString(str2);
        AbstractC1036a0.c(parcelI0, aVar);
        AbstractC1036a0.e(parcelI0, z6);
        parcelI0.writeLong(j7);
        k0(4, parcelI0);
    }
}
