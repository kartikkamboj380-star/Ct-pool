package androidx.work.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class s extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f9472c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, int i7, int i8) {
        super(i7, i8);
        w5.k.f(context, "mContext");
        this.f9472c = context;
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        if (this.f4156b >= 10) {
            gVar.e0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.f9472c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
