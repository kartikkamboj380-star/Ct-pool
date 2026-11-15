package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder zaa;
    private final Feature[] zab;
    private final boolean zac;
    private final int zad;

    @KeepForSdk
    protected RegisterListenerMethod(ListenerHolder<L> listenerHolder) {
        this(listenerHolder, null, false, 0);
    }

    @KeepForSdk
    public void clearListener() {
        this.zaa.clear();
    }

    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa.getListenerKey();
    }

    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return this.zab;
    }

    @KeepForSdk
    protected abstract void registerListener(A a7, C2273m c2273m);

    public final int zaa() {
        return this.zad;
    }

    public final boolean zab() {
        return this.zac;
    }

    @KeepForSdk
    protected RegisterListenerMethod(ListenerHolder<L> listenerHolder, Feature[] featureArr, boolean z6) {
        this(listenerHolder, featureArr, z6, 0);
    }

    @KeepForSdk
    protected RegisterListenerMethod(ListenerHolder<L> listenerHolder, Feature[] featureArr, boolean z6, int i7) {
        this.zaa = listenerHolder;
        this.zab = featureArr;
        this.zac = z6;
        this.zad = i7;
    }
}
