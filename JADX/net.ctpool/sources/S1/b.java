package S1;

/* JADX INFO: loaded from: classes.dex */
public class b implements androidx.core.util.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f2923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2924b = 0;

    public b(int i7) {
        this.f2923a = new Object[i7];
    }

    @Override // androidx.core.util.d
    public synchronized boolean a(Object obj) {
        int i7 = this.f2924b;
        Object[] objArr = this.f2923a;
        if (i7 == objArr.length) {
            return false;
        }
        objArr[i7] = obj;
        this.f2924b = i7 + 1;
        return true;
    }

    @Override // androidx.core.util.d
    public synchronized Object b() {
        int i7 = this.f2924b;
        if (i7 == 0) {
            return null;
        }
        int i8 = i7 - 1;
        this.f2924b = i8;
        Object[] objArr = this.f2923a;
        Object obj = objArr[i8];
        objArr[i8] = null;
        return obj;
    }

    public synchronized void c() {
        for (int i7 = 0; i7 < this.f2924b; i7++) {
            try {
                this.f2923a[i7] = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2924b = 0;
    }
}
