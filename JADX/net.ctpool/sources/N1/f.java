package N1;

import android.graphics.ColorSpace;
import i5.l;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ColorSpace f2133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f2134b;

    public f(int i7, int i8, ColorSpace colorSpace) {
        this.f2133a = colorSpace;
        this.f2134b = (i7 == -1 || i8 == -1) ? null : new l(Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public final ColorSpace a() {
        return this.f2133a;
    }

    public final l b() {
        return this.f2134b;
    }
}
