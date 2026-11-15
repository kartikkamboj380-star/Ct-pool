package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1284f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile C1284f0 f15174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1284f0 f15175c = new C1284f0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f15176a = Collections.emptyMap();

    C1284f0(boolean z6) {
    }

    public static C1284f0 a() {
        C1284f0 c1284f0 = f15174b;
        if (c1284f0 != null) {
            return c1284f0;
        }
        synchronized (C1284f0.class) {
            try {
                C1284f0 c1284f02 = f15174b;
                if (c1284f02 != null) {
                    return c1284f02;
                }
                C1284f0 c1284f0A = AbstractC1316n0.a(C1284f0.class);
                f15174b = c1284f0A;
                return c1284f0A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC1327q0 b(W0 w02, int i7) {
        androidx.appcompat.app.y.a(this.f15176a.get(new C1280e0(w02, i7)));
        return null;
    }
}
