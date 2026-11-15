package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class e extends Pools$SimplePool {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f7263c;

    public e(int i7) {
        super(i7);
        this.f7263c = new Object();
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.d
    public boolean a(Object obj) {
        boolean zA;
        synchronized (this.f7263c) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // androidx.core.util.Pools$SimplePool, androidx.core.util.d
    public Object b() {
        Object objB;
        synchronized (this.f7263c) {
            objB = super.b();
        }
        return objB;
    }
}
