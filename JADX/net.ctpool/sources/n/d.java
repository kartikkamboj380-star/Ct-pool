package n;

/* JADX INFO: loaded from: classes.dex */
public class d implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f21288q = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long[] f21290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Object[] f21291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21292p;

    public d() {
        this(10);
    }

    private void c() {
        int i7 = this.f21292p;
        long[] jArr = this.f21290n;
        Object[] objArr = this.f21291o;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f21288q) {
                if (i9 != i8) {
                    jArr[i8] = jArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f21289m = false;
        this.f21292p = i8;
    }

    public void a() {
        int i7 = this.f21292p;
        Object[] objArr = this.f21291o;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f21292p = 0;
        this.f21289m = false;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f21290n = (long[]) this.f21290n.clone();
            dVar.f21291o = (Object[]) this.f21291o.clone();
            return dVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public Object d(long j7) {
        return e(j7, null);
    }

    public Object e(long j7, Object obj) {
        Object obj2;
        int iB = c.b(this.f21290n, this.f21292p, j7);
        return (iB < 0 || (obj2 = this.f21291o[iB]) == f21288q) ? obj : obj2;
    }

    public int g(long j7) {
        if (this.f21289m) {
            c();
        }
        return c.b(this.f21290n, this.f21292p, j7);
    }

    public long h(int i7) {
        if (this.f21289m) {
            c();
        }
        return this.f21290n[i7];
    }

    public void i(long j7, Object obj) {
        int iB = c.b(this.f21290n, this.f21292p, j7);
        if (iB >= 0) {
            this.f21291o[iB] = obj;
            return;
        }
        int i7 = ~iB;
        int i8 = this.f21292p;
        if (i7 < i8) {
            Object[] objArr = this.f21291o;
            if (objArr[i7] == f21288q) {
                this.f21290n[i7] = j7;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f21289m && i8 >= this.f21290n.length) {
            c();
            i7 = ~c.b(this.f21290n, this.f21292p, j7);
        }
        int i9 = this.f21292p;
        if (i9 >= this.f21290n.length) {
            int iF = c.f(i9 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f21290n;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f21291o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f21290n = jArr;
            this.f21291o = objArr2;
        }
        int i10 = this.f21292p;
        if (i10 - i7 != 0) {
            long[] jArr3 = this.f21290n;
            int i11 = i7 + 1;
            System.arraycopy(jArr3, i7, jArr3, i11, i10 - i7);
            Object[] objArr4 = this.f21291o;
            System.arraycopy(objArr4, i7, objArr4, i11, this.f21292p - i7);
        }
        this.f21290n[i7] = j7;
        this.f21291o[i7] = obj;
        this.f21292p++;
    }

    public void j(long j7) {
        int iB = c.b(this.f21290n, this.f21292p, j7);
        if (iB >= 0) {
            Object[] objArr = this.f21291o;
            Object obj = objArr[iB];
            Object obj2 = f21288q;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f21289m = true;
            }
        }
    }

    public void k(int i7) {
        Object[] objArr = this.f21291o;
        Object obj = objArr[i7];
        Object obj2 = f21288q;
        if (obj != obj2) {
            objArr[i7] = obj2;
            this.f21289m = true;
        }
    }

    public int l() {
        if (this.f21289m) {
            c();
        }
        return this.f21292p;
    }

    public Object m(int i7) {
        if (this.f21289m) {
            c();
        }
        return this.f21291o[i7];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21292p * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f21292p; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(h(i7));
            sb.append('=');
            Object objM = m(i7);
            if (objM != this) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public d(int i7) {
        this.f21289m = false;
        if (i7 == 0) {
            this.f21290n = c.f21286b;
            this.f21291o = c.f21287c;
        } else {
            int iF = c.f(i7);
            this.f21290n = new long[iF];
            this.f21291o = new Object[iF];
        }
    }
}
