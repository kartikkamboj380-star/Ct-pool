package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C1532z2 f15392d;

    public C2(C1532z2 c1532z2, String str, String str2) {
        this.f15392d = c1532z2;
        Preconditions.checkNotEmpty(str);
        this.f15389a = str;
    }

    public final String a() {
        if (!this.f15390b) {
            this.f15390b = true;
            this.f15391c = this.f15392d.H().getString(this.f15389a, null);
        }
        return this.f15391c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f15392d.H().edit();
        editorEdit.putString(this.f15389a, str);
        editorEdit.apply();
        this.f15391c = str;
    }
}
