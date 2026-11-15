package L4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f1989b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f1990a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f1989b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f1989b;
                    if (dVar == null) {
                        dVar = new d();
                        f1989b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    Set b() {
        Set setUnmodifiableSet;
        synchronized (this.f1990a) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f1990a);
        }
        return setUnmodifiableSet;
    }
}
