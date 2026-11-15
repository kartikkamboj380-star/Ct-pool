package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f15368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f15369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f15370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f15371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f15372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final D f15373f;

    B(S2 s22, String str, String str2, String str3, long j7, long j8, Bundle bundle) {
        D d7;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f15368a = str2;
        this.f15369b = str3;
        this.f15370c = TextUtils.isEmpty(str) ? null : str;
        this.f15371d = j7;
        this.f15372e = j8;
        if (j8 != 0 && j8 > j7) {
            s22.d().J().b("Event created with reverse previous/current timestamps. appId", C1449n2.t(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            d7 = new D(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    s22.d().E().a("Param name can't be null");
                } else {
                    Object objQ0 = s22.J().q0(next, bundle2.get(next));
                    if (objQ0 == null) {
                        s22.d().J().b("Param value can't be null", s22.B().f(next));
                    } else {
                        s22.J().M(bundle2, next, objQ0);
                    }
                }
                it.remove();
            }
            d7 = new D(bundle2);
        }
        this.f15373f = d7;
    }

    final B a(S2 s22, long j7) {
        return new B(s22, this.f15370c, this.f15368a, this.f15369b, this.f15371d, j7, this.f15373f);
    }

    public final String toString() {
        return "Event{appId='" + this.f15368a + "', name='" + this.f15369b + "', params=" + String.valueOf(this.f15373f) + "}";
    }

    private B(S2 s22, String str, String str2, String str3, long j7, long j8, D d7) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(d7);
        this.f15368a = str2;
        this.f15369b = str3;
        this.f15370c = TextUtils.isEmpty(str) ? null : str;
        this.f15371d = j7;
        this.f15372e = j8;
        if (j8 != 0 && j8 > j7) {
            s22.d().J().c("Event created with reverse previous/current timestamps. appId, name", C1449n2.t(str2), C1449n2.t(str3));
        }
        this.f15373f = d7;
    }
}
