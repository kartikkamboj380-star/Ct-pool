package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f15399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f15400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C1532z2 f15401e;

    private D2(C1532z2 c1532z2, String str, long j7) {
        this.f15401e = c1532z2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j7 > 0);
        this.f15397a = str + ":start";
        this.f15398b = str + ":count";
        this.f15399c = str + ":value";
        this.f15400d = j7;
    }

    private final long c() {
        return this.f15401e.H().getLong(this.f15397a, 0L);
    }

    private final void d() {
        this.f15401e.l();
        long jCurrentTimeMillis = this.f15401e.zzb().currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.f15401e.H().edit();
        editorEdit.remove(this.f15398b);
        editorEdit.remove(this.f15399c);
        editorEdit.putLong(this.f15397a, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public final Pair a() {
        long jAbs;
        this.f15401e.l();
        this.f15401e.l();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jC - this.f15401e.zzb().currentTimeMillis());
        }
        long j7 = this.f15400d;
        if (jAbs < j7) {
            return null;
        }
        if (jAbs > (j7 << 1)) {
            d();
            return null;
        }
        String string = this.f15401e.H().getString(this.f15399c, null);
        long j8 = this.f15401e.H().getLong(this.f15398b, 0L);
        d();
        return (string == null || j8 <= 0) ? C1532z2.f16368B : new Pair(string, Long.valueOf(j8));
    }

    public final void b(String str, long j7) {
        this.f15401e.l();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j8 = this.f15401e.H().getLong(this.f15398b, 0L);
        if (j8 <= 0) {
            SharedPreferences.Editor editorEdit = this.f15401e.H().edit();
            editorEdit.putString(this.f15399c, str);
            editorEdit.putLong(this.f15398b, 1L);
            editorEdit.apply();
            return;
        }
        long j9 = j8 + 1;
        boolean z6 = (this.f15401e.h().U0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j9;
        SharedPreferences.Editor editorEdit2 = this.f15401e.H().edit();
        if (z6) {
            editorEdit2.putString(this.f15399c, str);
        }
        editorEdit2.putLong(this.f15398b, j9);
        editorEdit2.apply();
    }
}
