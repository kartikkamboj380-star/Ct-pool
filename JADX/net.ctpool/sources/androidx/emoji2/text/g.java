package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f7881d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f7883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f7884c = 0;

    g(m mVar, int i7) {
        this.f7883b = mVar;
        this.f7882a = i7;
    }

    private I.a g() {
        ThreadLocal threadLocal = f7881d;
        I.a aVar = (I.a) threadLocal.get();
        if (aVar == null) {
            aVar = new I.a();
            threadLocal.set(aVar);
        }
        this.f7883b.d().j(aVar, this.f7882a);
        return aVar;
    }

    public void a(Canvas canvas, float f7, float f8, Paint paint) {
        Typeface typefaceG = this.f7883b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f7883b.c(), this.f7882a * 2, 2, f7, f8, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i7) {
        return g().h(i7);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f7884c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z6) {
        this.f7884c = z6 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i7 = 0; i7 < iC; i7++) {
            sb.append(Integer.toHexString(b(i7)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
