package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static D0 f14157a = new C0();

    public static synchronized D0 a() {
        return f14157a;
    }

    public abstract URLConnection b(URL url, String str);
}
