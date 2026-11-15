package V3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: V3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0476d implements A {
    AbstractC0476d() {
    }

    public boolean a(Object obj) {
        Iterator it = asMap().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // V3.A
    public abstract Map asMap();

    public boolean equals(Object obj) {
        return B.a(this, obj);
    }

    public int hashCode() {
        return asMap().hashCode();
    }

    public String toString() {
        return asMap().toString();
    }
}
