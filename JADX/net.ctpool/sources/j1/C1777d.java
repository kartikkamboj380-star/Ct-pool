package j1;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: j1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1777d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20212a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20213b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorFilter f20214c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20215d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20216e = -1;

    public void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i7 = this.f20212a;
        if (i7 != -1) {
            drawable.setAlpha(i7);
        }
        if (this.f20213b) {
            drawable.setColorFilter(this.f20214c);
        }
        int i8 = this.f20215d;
        if (i8 != -1) {
            drawable.setDither(i8 != 0);
        }
        int i9 = this.f20216e;
        if (i9 != -1) {
            drawable.setFilterBitmap(i9 != 0);
        }
    }

    public void b(int i7) {
        this.f20212a = i7;
    }

    public void c(ColorFilter colorFilter) {
        this.f20214c = colorFilter;
        this.f20213b = colorFilter != null;
    }

    public void d(boolean z6) {
        this.f20215d = z6 ? 1 : 0;
    }

    public void e(boolean z6) {
        this.f20216e = z6 ? 1 : 0;
    }
}
