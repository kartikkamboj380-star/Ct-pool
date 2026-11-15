package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import k3.AbstractC1823f;
import k3.C1819b;

/* JADX INFO: loaded from: classes.dex */
final class f implements PendingResultUtil.ResultConverter {
    /* synthetic */ f(AbstractC1823f abstractC1823f) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        return ((C1819b) result).a();
    }
}
