package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C6;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class M2 implements C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f15672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ I2 f15673b;

    M2(I2 i22, String str) {
        this.f15672a = str;
        this.f15673b = i22;
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final String f(String str) {
        Map map = (Map) this.f15673b.f15622d.get(this.f15672a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
