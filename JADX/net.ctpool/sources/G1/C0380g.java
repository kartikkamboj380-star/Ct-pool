package G1;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: G1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0380g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S0.g f1198e;

    /* JADX INFO: renamed from: G1.g$a */
    class a implements S0.g {
        a() {
        }

        @Override // S0.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
            try {
                C0380g.this.a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public C0380g(int i7, int i8) {
        O0.l.b(Boolean.valueOf(i7 > 0));
        O0.l.b(Boolean.valueOf(i8 > 0));
        this.f1196c = i7;
        this.f1197d = i8;
        this.f1198e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int iG = N1.b.g(bitmap);
        O0.l.c(this.f1194a > 0, "No bitmaps registered.");
        long j7 = iG;
        O0.l.d(j7 <= this.f1195b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iG), Long.valueOf(this.f1195b));
        this.f1195b -= j7;
        this.f1194a--;
    }

    public synchronized int b() {
        return this.f1194a;
    }

    public synchronized int c() {
        return this.f1196c;
    }

    public synchronized int d() {
        return this.f1197d;
    }

    public S0.g e() {
        return this.f1198e;
    }

    public synchronized long f() {
        return this.f1195b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int iG = N1.b.g(bitmap);
        int i7 = this.f1194a;
        if (i7 < this.f1196c) {
            long j7 = this.f1195b;
            long j8 = iG;
            if (j7 + j8 <= this.f1197d) {
                this.f1194a = i7 + 1;
                this.f1195b = j7 + j8;
                return true;
            }
        }
        return false;
    }
}
