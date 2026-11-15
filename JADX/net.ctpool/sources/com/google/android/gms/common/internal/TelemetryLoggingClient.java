package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import z3.AbstractC2272l;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
public interface TelemetryLoggingClient extends HasApiKey<TelemetryLoggingOptions> {
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    AbstractC2272l log(TelemetryData telemetryData);
}
