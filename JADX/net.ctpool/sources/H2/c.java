package H2;

import android.graphics.RectF;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f1367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1368c;

    public c(int i7, RectF rectF, int i8) {
        k.f(rectF, "rectangle");
        this.f1366a = i7;
        this.f1367b = rectF;
        this.f1368c = i8;
    }

    public final int a() {
        return this.f1368c;
    }

    public final int b() {
        return this.f1366a;
    }

    public final RectF c() {
        return this.f1367b;
    }
}
