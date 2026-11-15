package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import z3.AbstractC2272l;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class PendingResultUtil {
    private static final zas zaa = new f();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        T convert(R r6);
    }

    @KeepForSdk
    public static <R extends Result, T extends Response<R>> AbstractC2272l toResponseTask(PendingResult<R> pendingResult, T t6) {
        return toTask(pendingResult, new h(t6));
    }

    @KeepForSdk
    public static <R extends Result, T> AbstractC2272l toTask(PendingResult<R> pendingResult, ResultConverter<R, T> resultConverter) {
        zas zasVar = zaa;
        C2273m c2273m = new C2273m();
        pendingResult.addStatusListener(new g(pendingResult, c2273m, resultConverter, zasVar));
        return c2273m.a();
    }

    @KeepForSdk
    public static <R extends Result> AbstractC2272l toVoidTask(PendingResult<R> pendingResult) {
        return toTask(pendingResult, new i());
    }
}
