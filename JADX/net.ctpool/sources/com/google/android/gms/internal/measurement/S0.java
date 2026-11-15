package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamic.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class S0 extends AbstractBinderC1045b0 implements P0 {
    public S0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static P0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof P0 ? (P0) iInterfaceQueryLocalInterface : new R0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1045b0
    protected final boolean i0(int i7, Parcel parcel, Parcel parcel2, int i8) {
        U0 w02;
        U0 w03 = null;
        U0 w04 = null;
        U0 w05 = null;
        U0 w06 = null;
        V0 x02 = null;
        V0 x03 = null;
        V0 x04 = null;
        U0 w07 = null;
        U0 w08 = null;
        U0 w09 = null;
        U0 w010 = null;
        U0 w011 = null;
        U0 w012 = null;
        InterfaceC1037a1 z02 = null;
        U0 w013 = null;
        U0 w014 = null;
        U0 w015 = null;
        U0 w016 = null;
        switch (i7) {
            case 1:
                com.google.android.gms.dynamic.a aVarI0 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                C1055c1 c1055c1 = (C1055c1) AbstractC1036a0.a(parcel, C1055c1.CREATOR);
                long j7 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                initialize(aVarI0, c1055c1, j7);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                boolean zH = AbstractC1036a0.h(parcel);
                boolean zH2 = AbstractC1036a0.h(parcel);
                long j8 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                logEvent(string, string2, bundle, zH, zH2, j8);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    w02 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w02 = iInterfaceQueryLocalInterface instanceof U0 ? (U0) iInterfaceQueryLocalInterface : new W0(strongBinder);
                }
                long j9 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                logEventAndBundle(string3, string4, bundle2, w02, j9);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                com.google.android.gms.dynamic.a aVarI02 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                boolean zH3 = AbstractC1036a0.h(parcel);
                long j10 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                setUserProperty(string5, string6, aVarI02, zH3, j10);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zH4 = AbstractC1036a0.h(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w03 = iInterfaceQueryLocalInterface2 instanceof U0 ? (U0) iInterfaceQueryLocalInterface2 : new W0(strongBinder2);
                }
                AbstractC1036a0.f(parcel);
                getUserProperties(string7, string8, zH4, w03);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w016 = iInterfaceQueryLocalInterface3 instanceof U0 ? (U0) iInterfaceQueryLocalInterface3 : new W0(strongBinder3);
                }
                AbstractC1036a0.f(parcel);
                getMaxUserProperties(string9, w016);
                break;
            case 7:
                String string10 = parcel.readString();
                long j11 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                setUserId(string10, j11);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                long j12 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                setConditionalUserProperty(bundle3, j12);
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                AbstractC1036a0.f(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w015 = iInterfaceQueryLocalInterface4 instanceof U0 ? (U0) iInterfaceQueryLocalInterface4 : new W0(strongBinder4);
                }
                AbstractC1036a0.f(parcel);
                getConditionalUserProperties(string13, string14, w015);
                break;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                boolean zH5 = AbstractC1036a0.h(parcel);
                long j13 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                setMeasurementEnabled(zH5, j13);
                break;
            case 12:
                long j14 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                resetAnalyticsData(j14);
                break;
            case 13:
                long j15 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                setMinimumSessionDuration(j15);
                break;
            case 14:
                long j16 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                setSessionTimeoutDuration(j16);
                break;
            case 15:
                com.google.android.gms.dynamic.a aVarI03 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j17 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                setCurrentScreen(aVarI03, string15, string16, j17);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w014 = iInterfaceQueryLocalInterface5 instanceof U0 ? (U0) iInterfaceQueryLocalInterface5 : new W0(strongBinder5);
                }
                AbstractC1036a0.f(parcel);
                getCurrentScreenName(w014);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w013 = iInterfaceQueryLocalInterface6 instanceof U0 ? (U0) iInterfaceQueryLocalInterface6 : new W0(strongBinder6);
                }
                AbstractC1036a0.f(parcel);
                getCurrentScreenClass(w013);
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    z02 = iInterfaceQueryLocalInterface7 instanceof InterfaceC1037a1 ? (InterfaceC1037a1) iInterfaceQueryLocalInterface7 : new Z0(strongBinder7);
                }
                AbstractC1036a0.f(parcel);
                setInstanceIdProvider(z02);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w012 = iInterfaceQueryLocalInterface8 instanceof U0 ? (U0) iInterfaceQueryLocalInterface8 : new W0(strongBinder8);
                }
                AbstractC1036a0.f(parcel);
                getCachedAppInstanceId(w012);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w011 = iInterfaceQueryLocalInterface9 instanceof U0 ? (U0) iInterfaceQueryLocalInterface9 : new W0(strongBinder9);
                }
                AbstractC1036a0.f(parcel);
                getAppInstanceId(w011);
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w010 = iInterfaceQueryLocalInterface10 instanceof U0 ? (U0) iInterfaceQueryLocalInterface10 : new W0(strongBinder10);
                }
                AbstractC1036a0.f(parcel);
                getGmpAppId(w010);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w09 = iInterfaceQueryLocalInterface11 instanceof U0 ? (U0) iInterfaceQueryLocalInterface11 : new W0(strongBinder11);
                }
                AbstractC1036a0.f(parcel);
                generateEventId(w09);
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                String string17 = parcel.readString();
                long j18 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                beginAdUnitExposure(string17, j18);
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                String string18 = parcel.readString();
                long j19 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                endAdUnitExposure(string18, j19);
                break;
            case 25:
                com.google.android.gms.dynamic.a aVarI04 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                long j20 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                onActivityStarted(aVarI04, j20);
                break;
            case 26:
                com.google.android.gms.dynamic.a aVarI05 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                long j21 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                onActivityStopped(aVarI05, j21);
                break;
            case 27:
                com.google.android.gms.dynamic.a aVarI06 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                long j22 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                onActivityCreated(aVarI06, bundle5, j22);
                break;
            case 28:
                com.google.android.gms.dynamic.a aVarI07 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                long j23 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                onActivityDestroyed(aVarI07, j23);
                break;
            case 29:
                com.google.android.gms.dynamic.a aVarI08 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                onActivityPaused(aVarI08, j24);
                break;
            case 30:
                com.google.android.gms.dynamic.a aVarI09 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                onActivityResumed(aVarI09, j25);
                break;
            case 31:
                com.google.android.gms.dynamic.a aVarI010 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w08 = iInterfaceQueryLocalInterface12 instanceof U0 ? (U0) iInterfaceQueryLocalInterface12 : new W0(strongBinder12);
                }
                long j26 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                onActivitySaveInstanceState(aVarI010, w08, j26);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w07 = iInterfaceQueryLocalInterface13 instanceof U0 ? (U0) iInterfaceQueryLocalInterface13 : new W0(strongBinder13);
                }
                long j27 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                performAction(bundle6, w07, j27);
                break;
            case 33:
                int i9 = parcel.readInt();
                String string19 = parcel.readString();
                com.google.android.gms.dynamic.a aVarI011 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarI012 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarI013 = a.AbstractBinderC0223a.i0(parcel.readStrongBinder());
                AbstractC1036a0.f(parcel);
                logHealthData(i9, string19, aVarI011, aVarI012, aVarI013);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    x04 = iInterfaceQueryLocalInterface14 instanceof V0 ? (V0) iInterfaceQueryLocalInterface14 : new X0(strongBinder14);
                }
                AbstractC1036a0.f(parcel);
                setEventInterceptor(x04);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    x03 = iInterfaceQueryLocalInterface15 instanceof V0 ? (V0) iInterfaceQueryLocalInterface15 : new X0(strongBinder15);
                }
                AbstractC1036a0.f(parcel);
                registerOnMeasurementEventListener(x03);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    x02 = iInterfaceQueryLocalInterface16 instanceof V0 ? (V0) iInterfaceQueryLocalInterface16 : new X0(strongBinder16);
                }
                AbstractC1036a0.f(parcel);
                unregisterOnMeasurementEventListener(x02);
                break;
            case 37:
                HashMap mapB = AbstractC1036a0.b(parcel);
                AbstractC1036a0.f(parcel);
                initForTests(mapB);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w06 = iInterfaceQueryLocalInterface17 instanceof U0 ? (U0) iInterfaceQueryLocalInterface17 : new W0(strongBinder17);
                }
                int i10 = parcel.readInt();
                AbstractC1036a0.f(parcel);
                getTestFlag(w06, i10);
                break;
            case 39:
                boolean zH6 = AbstractC1036a0.h(parcel);
                AbstractC1036a0.f(parcel);
                setDataCollectionEnabled(zH6);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w05 = iInterfaceQueryLocalInterface18 instanceof U0 ? (U0) iInterfaceQueryLocalInterface18 : new W0(strongBinder18);
                }
                AbstractC1036a0.f(parcel);
                isDataCollectionEnabled(w05);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                AbstractC1036a0.f(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j28 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                clearMeasurementEnabled(j28);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                long j29 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                setConsent(bundle8, j29);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC1036a0.a(parcel, Bundle.CREATOR);
                long j30 = parcel.readLong();
                AbstractC1036a0.f(parcel);
                setConsentThirdParty(bundle9, j30);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    w04 = iInterfaceQueryLocalInterface19 instanceof U0 ? (U0) iInterfaceQueryLocalInterface19 : new W0(strongBinder19);
                }
                AbstractC1036a0.f(parcel);
                getSessionId(w04);
                break;
            case 48:
                Intent intent = (Intent) AbstractC1036a0.a(parcel, Intent.CREATOR);
                AbstractC1036a0.f(parcel);
                setSgtmDebugInfo(intent);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
