package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0627w;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0620o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f7664b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile C0620o f7666d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7668a = Collections.emptyMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f7665c = c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final C0620o f7667e = new C0620o(true);

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f7669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7670b;

        a(Object obj, int i7) {
            this.f7669a = obj;
            this.f7670b = i7;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7669a == aVar.f7669a && this.f7670b == aVar.f7670b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f7669a) * 65535) + this.f7670b;
        }
    }

    C0620o(boolean z6) {
    }

    public static C0620o b() {
        C0620o c0620oA = f7666d;
        if (c0620oA == null) {
            synchronized (C0620o.class) {
                try {
                    c0620oA = f7666d;
                    if (c0620oA == null) {
                        c0620oA = f7664b ? AbstractC0619n.a() : f7667e;
                        f7666d = c0620oA;
                    }
                } finally {
                }
            }
        }
        return c0620oA;
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public AbstractC0627w.c a(O o6, int i7) {
        androidx.appcompat.app.y.a(this.f7668a.get(new a(o6, i7)));
        return null;
    }
}
