package com.reactnativegooglesignin;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import k3.AbstractC1820c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f18314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18315b;

    public a(Exception exc, String str) {
        w5.k.f(exc, "e");
        String localizedMessage = exc.getLocalizedMessage();
        localizedMessage = localizedMessage == null ? exc.getMessage() : localizedMessage;
        if (exc instanceof ApiException) {
            ApiException apiException = (ApiException) exc;
            int statusCode = apiException.getStatusCode();
            if (localizedMessage == null || localizedMessage.length() <= 10 || localizedMessage == null) {
                localizedMessage = AbstractC1820c.getStatusCodeString(statusCode);
                w5.k.e(localizedMessage, "getStatusCodeString(...)");
            } else {
                localizedMessage = new F5.f(statusCode + ": ").c(localizedMessage, "");
            }
            this.f18314a = String.valueOf((statusCode == 12501 || apiException.getStatus().isCanceled()) ? 12501 : statusCode);
        } else {
            boolean z6 = exc instanceof UnsupportedApiCallException;
            this.f18314a = str;
            if (z6) {
                this.f18315b = localizedMessage + " Make sure you have the latest version of Google Play Services installed.";
                return;
            }
        }
        this.f18315b = localizedMessage;
    }

    public final String a() {
        return this.f18314a;
    }

    public final String b() {
        return this.f18315b;
    }
}
