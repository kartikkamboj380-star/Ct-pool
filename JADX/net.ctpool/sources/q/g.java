package q;

/* JADX INFO: loaded from: classes.dex */
class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f21701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21702b;

    g(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f21701a = new Object[i7];
    }

    @Override // q.f
    public boolean a(Object obj) {
        int i7 = this.f21702b;
        Object[] objArr = this.f21701a;
        if (i7 >= objArr.length) {
            return false;
        }
        objArr[i7] = obj;
        this.f21702b = i7 + 1;
        return true;
    }

    @Override // q.f
    public Object b() {
        int i7 = this.f21702b;
        if (i7 <= 0) {
            return null;
        }
        int i8 = i7 - 1;
        Object[] objArr = this.f21701a;
        Object obj = objArr[i8];
        objArr[i8] = null;
        this.f21702b = i7 - 1;
        return obj;
    }

    @Override // q.f
    public void c(Object[] objArr, int i7) {
        if (i7 > objArr.length) {
            i7 = objArr.length;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = objArr[i8];
            int i9 = this.f21702b;
            Object[] objArr2 = this.f21701a;
            if (i9 < objArr2.length) {
                objArr2[i9] = obj;
                this.f21702b = i9 + 1;
            }
        }
    }
}
