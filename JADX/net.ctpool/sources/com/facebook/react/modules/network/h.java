package com.facebook.react.modules.network;

import T5.C0457c;
import T5.z;
import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static z a() {
        return c().b();
    }

    public static z b(Context context) {
        return d(context).b();
    }

    public static z.a c() {
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return aVar.e(0L, timeUnit).M(0L, timeUnit).N(0L, timeUnit).f(new m());
    }

    public static z.a d(Context context) {
        return e(context, 10485760);
    }

    public static z.a e(Context context, int i7) {
        z.a aVarC = c();
        return i7 == 0 ? aVarC : aVarC.c(new C0457c(new File(context.getCacheDir(), "http-cache"), i7));
    }
}
