package D1;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface e extends c {
    static e P0(Bitmap bitmap, S0.g gVar, l lVar, int i7, int i8) {
        return b.j0() ? new b(bitmap, gVar, lVar, i7, i8) : new f(bitmap, gVar, lVar, i7, i8);
    }

    static e Q0(S0.a aVar, l lVar, int i7, int i8) {
        return b.j0() ? new b(aVar, lVar, i7, i8) : new f(aVar, lVar, i7, i8);
    }

    static e y(Bitmap bitmap, S0.g gVar, l lVar, int i7) {
        return P0(bitmap, gVar, lVar, i7, 0);
    }

    int T();

    int g1();
}
