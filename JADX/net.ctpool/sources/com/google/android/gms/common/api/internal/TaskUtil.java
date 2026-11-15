package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import z3.AbstractC2272l;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class TaskUtil {
    @KeepForSdk
    public static <ResultT> void setResultOrApiException(Status status, ResultT resultt, C2273m c2273m) {
        if (status.isSuccess()) {
            c2273m.c(resultt);
        } else {
            c2273m.b(ApiExceptionUtil.fromStatus(status));
        }
    }

    @KeepForSdk
    @Deprecated
    public static AbstractC2272l toVoidTaskThatFailsOnFalse(AbstractC2272l abstractC2272l) {
        return abstractC2272l.i(new O());
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(Status status, ResultT resultt, C2273m c2273m) {
        return status.isSuccess() ? c2273m.e(resultt) : c2273m.d(ApiExceptionUtil.fromStatus(status));
    }

    @KeepForSdk
    public static void setResultOrApiException(Status status, C2273m c2273m) {
        setResultOrApiException(status, null, c2273m);
    }
}
