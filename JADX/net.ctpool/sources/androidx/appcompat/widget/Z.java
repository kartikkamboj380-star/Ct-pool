package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5965a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5966b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5967c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5968d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5969e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5970f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f5971g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5972h = false;

    Z() {
    }

    public int a() {
        return this.f5971g ? this.f5965a : this.f5966b;
    }

    public int b() {
        return this.f5965a;
    }

    public int c() {
        return this.f5966b;
    }

    public int d() {
        return this.f5971g ? this.f5966b : this.f5965a;
    }

    public void e(int i7, int i8) {
        this.f5972h = false;
        if (i7 != Integer.MIN_VALUE) {
            this.f5969e = i7;
            this.f5965a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f5970f = i8;
            this.f5966b = i8;
        }
    }

    public void f(boolean z6) {
        int i7;
        if (z6 == this.f5971g) {
            return;
        }
        this.f5971g = z6;
        if (this.f5972h) {
            if (z6) {
                int i8 = this.f5968d;
                if (i8 == Integer.MIN_VALUE) {
                    i8 = this.f5969e;
                }
                this.f5965a = i8;
                i7 = this.f5967c;
                if (i7 == Integer.MIN_VALUE) {
                }
            } else {
                int i9 = this.f5967c;
                if (i9 == Integer.MIN_VALUE) {
                    i9 = this.f5969e;
                }
                this.f5965a = i9;
                i7 = this.f5968d;
                if (i7 == Integer.MIN_VALUE) {
                }
            }
            this.f5966b = i7;
        }
        this.f5965a = this.f5969e;
        i7 = this.f5970f;
        this.f5966b = i7;
    }

    public void g(int i7, int i8) {
        this.f5967c = i7;
        this.f5968d = i8;
        this.f5972h = true;
        if (this.f5971g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f5965a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f5966b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f5965a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f5966b = i8;
        }
    }
}
