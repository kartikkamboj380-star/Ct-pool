package S1;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f2926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2927b = 0;

    private d(int i7) {
        this.f2926a = new long[i7];
    }

    public static d b(int i7) {
        return new d(i7);
    }

    private void e() {
        int i7 = this.f2927b;
        if (i7 == this.f2926a.length) {
            long[] jArr = new long[Math.max(i7 + 1, (int) (((double) i7) * 1.8d))];
            System.arraycopy(this.f2926a, 0, jArr, 0, this.f2927b);
            this.f2926a = jArr;
        }
    }

    public void a(long j7) {
        e();
        long[] jArr = this.f2926a;
        int i7 = this.f2927b;
        this.f2927b = i7 + 1;
        jArr[i7] = j7;
    }

    public void c(int i7) {
        int i8 = this.f2927b;
        if (i7 <= i8) {
            this.f2927b = i8 - i7;
            return;
        }
        throw new IndexOutOfBoundsException("Trying to drop " + i7 + " items from array of length " + this.f2927b);
    }

    public long d(int i7) {
        if (i7 < this.f2927b) {
            return this.f2926a[i7];
        }
        throw new IndexOutOfBoundsException("" + i7 + " >= " + this.f2927b);
    }

    public void f(int i7, long j7) {
        if (i7 < this.f2927b) {
            this.f2926a[i7] = j7;
            return;
        }
        throw new IndexOutOfBoundsException("" + i7 + " >= " + this.f2927b);
    }

    public int g() {
        return this.f2927b;
    }
}
