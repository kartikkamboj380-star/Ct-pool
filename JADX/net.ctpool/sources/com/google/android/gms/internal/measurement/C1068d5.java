package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1068d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f14552a = new HashMap();

    public final InterfaceC1196s a(String str) {
        if (!this.f14552a.containsKey(str)) {
            return InterfaceC1196s.f14815d;
        }
        try {
            return (InterfaceC1196s) ((Callable) this.f14552a.get(str)).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable callable) {
        this.f14552a.put(str, callable);
    }
}
