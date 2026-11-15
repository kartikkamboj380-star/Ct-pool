package androidx.work.impl;

import android.content.Context;
import r0.AbstractC2021l;

/* JADX INFO: loaded from: classes.dex */
public final class F extends W.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f9281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Context context) {
        super(9, 10);
        w5.k.f(context, "context");
        this.f9281c = context;
    }

    @Override // W.b
    public void a(Z.g gVar) {
        w5.k.f(gVar, "db");
        gVar.u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        r0.q.c(this.f9281c, gVar);
        AbstractC2021l.c(this.f9281c, gVar);
    }
}
