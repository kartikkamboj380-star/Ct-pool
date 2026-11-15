package j1;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class f extends AbstractC1774a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    long f20217A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int[] f20218B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int[] f20219C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f20220D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean[] f20221E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    int f20222F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private p1.k f20223G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f20224H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f20225I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f20226J;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Drawable[] f20227u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f20228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f20229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f20230x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f20231y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f20232z;

    public f(Drawable[] drawableArr, boolean z6, int i7) {
        super(drawableArr);
        this.f20226J = true;
        O0.l.j(drawableArr.length >= 1, "At least one layer required!");
        this.f20227u = drawableArr;
        this.f20218B = new int[drawableArr.length];
        this.f20219C = new int[drawableArr.length];
        this.f20220D = 255;
        this.f20221E = new boolean[drawableArr.length];
        this.f20222F = 0;
        this.f20228v = z6;
        this.f20229w = z6 ? 255 : 0;
        this.f20230x = i7;
        t();
    }

    private void h(Canvas canvas, Drawable drawable, int i7) {
        if (drawable == null || i7 <= 0) {
            return;
        }
        this.f20222F++;
        if (this.f20226J) {
            drawable.mutate();
        }
        drawable.setAlpha(i7);
        this.f20222F--;
        drawable.draw(canvas);
    }

    private void q() {
        if (this.f20224H) {
            this.f20224H = false;
            p1.k kVar = this.f20223G;
            if (kVar != null) {
                kVar.c();
            }
        }
    }

    private void r() {
        int i7;
        if (!this.f20224H && (i7 = this.f20230x) >= 0) {
            boolean[] zArr = this.f20221E;
            if (i7 < zArr.length && zArr[i7]) {
                this.f20224H = true;
                p1.k kVar = this.f20223G;
                if (kVar != null) {
                    kVar.a();
                }
            }
        }
    }

    private void s() {
        if (this.f20225I && this.f20231y == 2 && this.f20221E[this.f20230x]) {
            p1.k kVar = this.f20223G;
            if (kVar != null) {
                kVar.b();
            }
            this.f20225I = false;
        }
    }

    private void t() {
        this.f20231y = 2;
        Arrays.fill(this.f20218B, this.f20229w);
        this.f20218B[0] = 255;
        Arrays.fill(this.f20219C, this.f20229w);
        this.f20219C[0] = 255;
        Arrays.fill(this.f20221E, this.f20228v);
        this.f20221E[0] = true;
    }

    private boolean v(float f7) {
        boolean z6 = true;
        for (int i7 = 0; i7 < this.f20227u.length; i7++) {
            boolean z7 = this.f20221E[i7];
            int i8 = z7 ? 1 : -1;
            int[] iArr = this.f20219C;
            int i9 = (int) (this.f20218B[i7] + (i8 * 255 * f7));
            iArr[i7] = i9;
            if (i9 < 0) {
                iArr[i7] = 0;
            }
            if (iArr[i7] > 255) {
                iArr[i7] = 255;
            }
            if (z7 && iArr[i7] < 255) {
                z6 = false;
            }
            if (!z7 && iArr[i7] > 0) {
                z6 = false;
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[PHI: r0
      0x0027: PHI (r0v10 boolean) = (r0v5 boolean), (r0v16 boolean) binds: [B:20:0x004b, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean zV;
        int i7 = this.f20231y;
        int i8 = 2;
        int i9 = 0;
        boolean z6 = true;
        if (i7 == 0) {
            System.arraycopy(this.f20219C, 0, this.f20218B, 0, this.f20227u.length);
            this.f20217A = p();
            zV = v(this.f20232z == 0 ? 1.0f : 0.0f);
            r();
            if (!zV) {
            }
            this.f20231y = i8;
            z6 = zV;
        } else if (i7 == 1) {
            O0.l.i(this.f20232z > 0);
            zV = v((p() - this.f20217A) / this.f20232z);
            if (!zV) {
                i8 = 1;
            }
            this.f20231y = i8;
            z6 = zV;
        }
        while (true) {
            Drawable[] drawableArr = this.f20227u;
            if (i9 >= drawableArr.length) {
                break;
            }
            h(canvas, drawableArr[i9], (int) Math.ceil(((double) (this.f20219C[i9] * this.f20220D)) / 255.0d));
            i9++;
        }
        if (!z6) {
            invalidateSelf();
        } else {
            q();
            s();
        }
    }

    public void g() {
        this.f20222F++;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20220D;
    }

    public void i() {
        this.f20222F--;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f20222F == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f20231y = 0;
        Arrays.fill(this.f20221E, true);
        invalidateSelf();
    }

    public void k(int i7) {
        this.f20231y = 0;
        this.f20221E[i7] = true;
        invalidateSelf();
    }

    public void l(int i7) {
        this.f20231y = 0;
        this.f20221E[i7] = false;
        invalidateSelf();
    }

    public void o() {
        this.f20231y = 2;
        for (int i7 = 0; i7 < this.f20227u.length; i7++) {
            this.f20219C[i7] = this.f20221E[i7] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long p() {
        return SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (this.f20220D != i7) {
            this.f20220D = i7;
            invalidateSelf();
        }
    }

    public void u(int i7) {
        this.f20232z = i7;
        if (this.f20231y == 1) {
            this.f20231y = 0;
        }
    }
}
