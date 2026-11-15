package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class T5 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f15808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ H5 f15809b;

    T5(H5 h52, M5 m52) {
        this.f15808a = m52;
        this.f15809b = h52;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        C1463p2 c1463p2I;
        String str;
        if (this.f15809b.S((String) Preconditions.checkNotNull(this.f15808a.f15695m)).z() && A3.q(this.f15808a.f15684H).z()) {
            C1372c2 c1372c2H = this.f15809b.h(this.f15808a);
            if (c1372c2H != null) {
                return c1372c2H.m();
            }
            c1463p2I = this.f15809b.d().J();
            str = "App info was null when attempting to get app instance id";
        } else {
            c1463p2I = this.f15809b.d().I();
            str = "Analytics storage consent denied. Returning null app instance id";
        }
        c1463p2I.a(str);
        return null;
    }
}
