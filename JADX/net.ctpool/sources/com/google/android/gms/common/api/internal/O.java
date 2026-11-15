package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import z3.AbstractC2272l;
import z3.InterfaceC2263c;

/* JADX INFO: loaded from: classes.dex */
final class O implements InterfaceC2263c {
    O() {
    }

    @Override // z3.InterfaceC2263c
    public final /* bridge */ /* synthetic */ Object a(AbstractC2272l abstractC2272l) throws ApiException {
        if (((Boolean) abstractC2272l.l()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
