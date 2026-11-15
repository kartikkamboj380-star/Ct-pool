package G1;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f1227a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f1228b = new l();

    private Object d(Object obj) {
        if (obj != null) {
            synchronized (this) {
                this.f1227a.remove(obj);
            }
        }
        return obj;
    }

    @Override // G1.B
    public Object b() {
        return d(this.f1228b.f());
    }

    @Override // G1.B
    public void c(Object obj) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f1227a.add(obj);
        }
        if (zAdd) {
            this.f1228b.e(a(obj), obj);
        }
    }

    @Override // G1.B
    public Object get(int i7) {
        return d(this.f1228b.a(i7));
    }
}
