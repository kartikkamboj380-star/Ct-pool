package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f15347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f15349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C1532z2 f15350e;

    public A2(C1532z2 c1532z2, String str, long j7) {
        this.f15350e = c1532z2;
        Preconditions.checkNotEmpty(str);
        this.f15346a = str;
        this.f15347b = j7;
    }

    public final long a() {
        if (!this.f15348c) {
            this.f15348c = true;
            this.f15349d = this.f15350e.H().getLong(this.f15346a, this.f15347b);
        }
        return this.f15349d;
    }

    public final void b(long j7) {
        SharedPreferences.Editor editorEdit = this.f15350e.H().edit();
        editorEdit.putLong(this.f15346a, j7);
        editorEdit.apply();
        this.f15349d = j7;
    }
}
