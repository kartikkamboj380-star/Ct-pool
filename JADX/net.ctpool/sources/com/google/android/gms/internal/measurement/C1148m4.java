package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC1260z4;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1148m4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile C1148m4 f14738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1148m4 f14739c = new C1148m4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14740a = Collections.emptyMap();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m4$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f14741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14742b;

        a(Object obj, int i7) {
            this.f14741a = obj;
            this.f14742b = i7;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14741a == aVar.f14741a && this.f14742b == aVar.f14742b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f14741a) * 65535) + this.f14742b;
        }
    }

    private C1148m4(boolean z6) {
    }

    public static C1148m4 a() {
        C1148m4 c1148m4 = f14738b;
        if (c1148m4 != null) {
            return c1148m4;
        }
        synchronized (C1148m4.class) {
            try {
                C1148m4 c1148m42 = f14738b;
                if (c1148m42 != null) {
                    return c1148m42;
                }
                C1148m4 c1148m4A = AbstractC1244x4.a(C1148m4.class);
                f14738b = c1148m4A;
                return c1148m4A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC1260z4.d b(InterfaceC1095g5 interfaceC1095g5, int i7) {
        androidx.appcompat.app.y.a(this.f14740a.get(new a(interfaceC1095g5, i7)));
        return null;
    }
}
