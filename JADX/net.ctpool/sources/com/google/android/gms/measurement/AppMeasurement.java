package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.C1055c1;
import com.google.android.gms.measurement.internal.S2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w3.q;
import w3.z;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f15327b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f15328a;

    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mAppId;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mOrigin;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mTriggerEventName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public Object mValue;

        ConditionalUserProperty(Bundle bundle) {
            Preconditions.checkNotNull(bundle);
            this.mAppId = (String) q.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) q.a(bundle, "origin", String.class, null);
            this.mName = (String) q.a(bundle, "name", String.class, null);
            this.mValue = q.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) q.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) q.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) q.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) q.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) q.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) q.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) q.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) q.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) q.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) q.a(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) q.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) q.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class a implements z {
        private a() {
        }
    }

    private AppMeasurement(S2 s22) {
        this.f15328a = new b(s22);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f15327b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f15327b == null) {
                        z zVarB = b(context, null);
                        if (zVarB != null) {
                            f15327b = new AppMeasurement(zVarB);
                        } else {
                            f15327b = new AppMeasurement(S2.b(context, new C1055c1(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f15327b;
    }

    private static z b(Context context, Bundle bundle) {
        return (z) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @Keep
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurement getInstance(Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f15328a.a(str);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f15328a.g(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f15328a.h(str);
    }

    @Keep
    public long generateEventId() {
        return this.f15328a.c();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f15328a.zzg();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listI = this.f15328a.i(str, str2);
        ArrayList arrayList = new ArrayList(listI == null ? 0 : listI.size());
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f15328a.e();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f15328a.zzi();
    }

    @Keep
    public String getGmpAppId() {
        return this.f15328a.d();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public int getMaxUserProperties(String str) {
        return this.f15328a.f(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z6) {
        return this.f15328a.j(str, str2, z6);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f15328a.k(str, str2, bundle);
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        Preconditions.checkNotNull(conditionalUserProperty);
        a aVar = this.f15328a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            q.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.b(bundle);
    }

    private AppMeasurement(z zVar) {
        this.f15328a = new com.google.android.gms.measurement.a(zVar);
    }
}
