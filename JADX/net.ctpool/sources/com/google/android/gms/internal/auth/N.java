package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import n.C1890a;

/* JADX INFO: loaded from: classes.dex */
public abstract class N implements InterfaceC1007u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f13831a = new C1890a();

    static N b(Context context, String str, Runnable runnable) {
        if (AbstractC0984m.b()) {
            throw null;
        }
        synchronized (N.class) {
            androidx.appcompat.app.y.a(f13831a.get(null));
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                throw null;
            } finally {
            }
        }
    }

    static synchronized void c() {
        Map map = f13831a;
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.y.a(it.next());
            throw null;
        }
        map.clear();
    }
}
