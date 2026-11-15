package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class Pools$SimplePool implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f7259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7260b;

    public Pools$SimplePool(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f7259a = new Object[i7];
    }

    private boolean c(Object obj) {
        for (int i7 = 0; i7 < this.f7260b; i7++) {
            if (this.f7259a[i7] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.d
    public boolean a(Object obj) {
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i7 = this.f7260b;
        Object[] objArr = this.f7259a;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = obj;
        this.f7260b = i7 + 1;
        return true;
    }

    @Override // androidx.core.util.d
    public Object b() {
        int i7 = this.f7260b;
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        Object[] objArr = this.f7259a;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f7260b = i7 - 1;
        return obj;
    }
}
