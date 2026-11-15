package D1;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class b extends a implements e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f971u = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private S0.a f972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile Bitmap f973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final l f974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f976t;

    protected b(S0.a aVar, l lVar, int i7, int i8) {
        S0.a aVar2 = (S0.a) O0.l.g(aVar.d());
        this.f972p = aVar2;
        this.f973q = (Bitmap) aVar2.j();
        this.f974r = lVar;
        this.f975s = i7;
        this.f976t = i8;
    }

    private synchronized S0.a W() {
        S0.a aVar;
        aVar = this.f972p;
        this.f972p = null;
        this.f973q = null;
        return aVar;
    }

    private static int a0(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    private static int h0(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public static boolean j0() {
        return f971u;
    }

    @Override // D1.e
    public int T() {
        return this.f975s;
    }

    @Override // D1.d
    public int T0() {
        return N1.b.g(this.f973q);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        S0.a aVarW = W();
        if (aVarW != null) {
            aVarW.close();
        }
    }

    @Override // D1.e
    public int g1() {
        return this.f976t;
    }

    @Override // D1.d, D1.i
    public int getHeight() {
        int i7;
        return (this.f975s % 180 != 0 || (i7 = this.f976t) == 5 || i7 == 7) ? h0(this.f973q) : a0(this.f973q);
    }

    @Override // D1.d, D1.i
    public int getWidth() {
        int i7;
        return (this.f975s % 180 != 0 || (i7 = this.f976t) == 5 || i7 == 7) ? a0(this.f973q) : h0(this.f973q);
    }

    @Override // D1.d
    public synchronized boolean isClosed() {
        return this.f972p == null;
    }

    @Override // D1.a, D1.d
    public l t0() {
        return this.f974r;
    }

    @Override // D1.c
    public Bitmap z0() {
        return this.f973q;
    }

    protected b(Bitmap bitmap, S0.g gVar, l lVar, int i7, int i8) {
        this.f973q = (Bitmap) O0.l.g(bitmap);
        this.f972p = S0.a.W(this.f973q, (S0.g) O0.l.g(gVar));
        this.f974r = lVar;
        this.f975s = i7;
        this.f976t = i8;
    }
}
