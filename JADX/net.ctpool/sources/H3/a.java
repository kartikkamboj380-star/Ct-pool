package H3;

import K3.b;
import android.content.Context;
import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f1369f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f1374e;

    public a(Context context) {
        this(b.b(context, A3.a.f116p, false), E3.a.b(context, A3.a.f115o, 0), E3.a.b(context, A3.a.f114n, 0), E3.a.b(context, A3.a.f112l, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i7) {
        return androidx.core.graphics.a.k(i7, 255) == this.f1373d;
    }

    public float a(float f7) {
        if (this.f1374e <= 0.0f || f7 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f7 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i7, float f7) {
        int i8;
        float fA = a(f7);
        int iAlpha = Color.alpha(i7);
        int iH = E3.a.h(androidx.core.graphics.a.k(i7, 255), this.f1371b, fA);
        if (fA > 0.0f && (i8 = this.f1372c) != 0) {
            iH = E3.a.g(iH, androidx.core.graphics.a.k(i8, f1369f));
        }
        return androidx.core.graphics.a.k(iH, iAlpha);
    }

    public int c(int i7, float f7) {
        return (this.f1370a && e(i7)) ? b(i7, f7) : i7;
    }

    public boolean d() {
        return this.f1370a;
    }

    public a(boolean z6, int i7, int i8, int i9, float f7) {
        this.f1370a = z6;
        this.f1371b = i7;
        this.f1372c = i8;
        this.f1373d = i9;
        this.f1374e = f7;
    }
}
