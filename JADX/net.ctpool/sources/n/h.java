package n;

/* JADX INFO: loaded from: classes.dex */
public class h implements Cloneable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Object f21323q = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f21325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Object[] f21326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21327p;

    public h() {
        this(10);
    }

    private void e() {
        int i7 = this.f21327p;
        int[] iArr = this.f21325n;
        Object[] objArr = this.f21326o;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (obj != f21323q) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        this.f21324m = false;
        this.f21327p = i8;
    }

    public void a(int i7, Object obj) {
        int i8 = this.f21327p;
        if (i8 != 0 && i7 <= this.f21325n[i8 - 1]) {
            l(i7, obj);
            return;
        }
        if (this.f21324m && i8 >= this.f21325n.length) {
            e();
        }
        int i9 = this.f21327p;
        if (i9 >= this.f21325n.length) {
            int iE = c.e(i9 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f21325n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f21326o;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f21325n = iArr;
            this.f21326o = objArr;
        }
        this.f21325n[i9] = i7;
        this.f21326o[i9] = obj;
        this.f21327p = i9 + 1;
    }

    public void b() {
        int i7 = this.f21327p;
        Object[] objArr = this.f21326o;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = null;
        }
        this.f21327p = 0;
        this.f21324m = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f21325n = (int[]) this.f21325n.clone();
            hVar.f21326o = (Object[]) this.f21326o.clone();
            return hVar;
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError(e7);
        }
    }

    public boolean d(int i7) {
        return i(i7) >= 0;
    }

    public Object g(int i7) {
        return h(i7, null);
    }

    public Object h(int i7, Object obj) {
        Object obj2;
        int iA = c.a(this.f21325n, this.f21327p, i7);
        return (iA < 0 || (obj2 = this.f21326o[iA]) == f21323q) ? obj : obj2;
    }

    public int i(int i7) {
        if (this.f21324m) {
            e();
        }
        return c.a(this.f21325n, this.f21327p, i7);
    }

    public int j(Object obj) {
        if (this.f21324m) {
            e();
        }
        for (int i7 = 0; i7 < this.f21327p; i7++) {
            if (this.f21326o[i7] == obj) {
                return i7;
            }
        }
        return -1;
    }

    public int k(int i7) {
        if (this.f21324m) {
            e();
        }
        return this.f21325n[i7];
    }

    public void l(int i7, Object obj) {
        int iA = c.a(this.f21325n, this.f21327p, i7);
        if (iA >= 0) {
            this.f21326o[iA] = obj;
            return;
        }
        int i8 = ~iA;
        int i9 = this.f21327p;
        if (i8 < i9) {
            Object[] objArr = this.f21326o;
            if (objArr[i8] == f21323q) {
                this.f21325n[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f21324m && i9 >= this.f21325n.length) {
            e();
            i8 = ~c.a(this.f21325n, this.f21327p, i7);
        }
        int i10 = this.f21327p;
        if (i10 >= this.f21325n.length) {
            int iE = c.e(i10 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f21325n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f21326o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f21325n = iArr;
            this.f21326o = objArr2;
        }
        int i11 = this.f21327p;
        if (i11 - i8 != 0) {
            int[] iArr3 = this.f21325n;
            int i12 = i8 + 1;
            System.arraycopy(iArr3, i8, iArr3, i12, i11 - i8);
            Object[] objArr4 = this.f21326o;
            System.arraycopy(objArr4, i8, objArr4, i12, this.f21327p - i8);
        }
        this.f21325n[i8] = i7;
        this.f21326o[i8] = obj;
        this.f21327p++;
    }

    public int m() {
        if (this.f21324m) {
            e();
        }
        return this.f21327p;
    }

    public Object p(int i7) {
        if (this.f21324m) {
            e();
        }
        return this.f21326o[i7];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f21327p * 28);
        sb.append('{');
        for (int i7 = 0; i7 < this.f21327p; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(k(i7));
            sb.append('=');
            Object objP = p(i7);
            if (objP != this) {
                sb.append(objP);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i7) {
        this.f21324m = false;
        if (i7 == 0) {
            this.f21325n = c.f21285a;
            this.f21326o = c.f21287c;
        } else {
            int iE = c.e(i7);
            this.f21325n = new int[iE];
            this.f21326o = new Object[iE];
        }
    }
}
