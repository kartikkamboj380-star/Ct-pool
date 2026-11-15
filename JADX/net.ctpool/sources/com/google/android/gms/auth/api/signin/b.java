package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.dynamite.DynamiteModule;
import i3.AbstractC1742a;
import l3.q;
import z3.AbstractC2272l;

/* JADX INFO: loaded from: classes.dex */
public class b extends GoogleApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f13533a = new f(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f13534b = 1;

    b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, (Api<GoogleSignInOptions>) AbstractC1742a.f19923b, googleSignInOptions, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    private final synchronized int g() {
        int i7;
        try {
            i7 = f13534b;
            if (i7 == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
                int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(applicationContext, 12451000);
                if (iIsGooglePlayServicesAvailable == 0) {
                    i7 = 4;
                    f13534b = 4;
                } else if (googleApiAvailability.getErrorResolutionIntent(applicationContext, iIsGooglePlayServicesAvailable, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i7 = 2;
                    f13534b = 2;
                } else {
                    i7 = 3;
                    f13534b = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i7;
    }

    public Intent c() {
        Context applicationContext = getApplicationContext();
        int iG = g();
        int i7 = iG - 1;
        if (iG != 0) {
            return i7 != 2 ? i7 != 3 ? q.b(applicationContext, (GoogleSignInOptions) getApiOptions()) : q.c(applicationContext, (GoogleSignInOptions) getApiOptions()) : q.a(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
        throw null;
    }

    public AbstractC2272l d() {
        return PendingResultUtil.toVoidTask(q.f(asGoogleApiClient(), getApplicationContext(), g() == 3));
    }

    public AbstractC2272l e() {
        return PendingResultUtil.toVoidTask(q.g(asGoogleApiClient(), getApplicationContext(), g() == 3));
    }

    public AbstractC2272l f() {
        return PendingResultUtil.toTask(q.e(asGoogleApiClient(), getApplicationContext(), (GoogleSignInOptions) getApiOptions(), g() == 3), f13533a);
    }

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, (Api<GoogleSignInOptions>) AbstractC1742a.f19923b, googleSignInOptions, new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
    }
}
