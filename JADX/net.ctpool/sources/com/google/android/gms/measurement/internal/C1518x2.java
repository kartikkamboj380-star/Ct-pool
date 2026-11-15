package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1518x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C1532z2 f16343e;

    public C1518x2(C1532z2 c1532z2, String str, boolean z6) {
        this.f16343e = c1532z2;
        Preconditions.checkNotEmpty(str);
        this.f16339a = str;
        this.f16340b = z6;
    }

    public final void a(boolean z6) {
        SharedPreferences.Editor editorEdit = this.f16343e.H().edit();
        editorEdit.putBoolean(this.f16339a, z6);
        editorEdit.apply();
        this.f16342d = z6;
    }

    public final boolean b() {
        if (!this.f16341c) {
            this.f16341c = true;
            this.f16342d = this.f16343e.H().getBoolean(this.f16339a, this.f16340b);
        }
        return this.f16342d;
    }
}
