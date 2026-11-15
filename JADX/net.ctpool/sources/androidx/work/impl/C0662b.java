package androidx.work.impl;

import android.content.ContentValues;

/* JADX INFO: renamed from: androidx.work.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0662b implements W.a {
    @Override // W.a
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        gVar.g0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
