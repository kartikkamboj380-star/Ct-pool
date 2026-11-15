package G1;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class u implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final B f1222a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final H f1225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1226e;

    public u(int i7, int i8, H h7, R0.d dVar) {
        this.f1223b = i7;
        this.f1224c = i8;
        this.f1225d = h7;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private Bitmap f(int i7) {
        this.f1225d.a(i7);
        return Bitmap.createBitmap(1, i7, Bitmap.Config.ALPHA_8);
    }

    private synchronized void i(int i7) {
        Bitmap bitmap;
        while (this.f1226e > i7 && (bitmap = (Bitmap) this.f1222a.b()) != null) {
            int iA = this.f1222a.a(bitmap);
            this.f1226e -= iA;
            this.f1225d.e(iA);
        }
    }

    @Override // R0.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized Bitmap get(int i7) {
        try {
            int i8 = this.f1226e;
            int i9 = this.f1223b;
            if (i8 > i9) {
                i(i9);
            }
            Bitmap bitmap = (Bitmap) this.f1222a.get(i7);
            if (bitmap == null) {
                return f(i7);
            }
            int iA = this.f1222a.a(bitmap);
            this.f1226e -= iA;
            this.f1225d.b(iA);
            return bitmap;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // R0.f, S0.g
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(Bitmap bitmap) {
        int iA = this.f1222a.a(bitmap);
        if (iA <= this.f1224c) {
            this.f1225d.g(iA);
            this.f1222a.c(bitmap);
            synchronized (this) {
                this.f1226e += iA;
            }
        }
    }
}
