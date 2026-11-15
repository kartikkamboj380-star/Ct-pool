package y2;

import android.view.View;
import w5.k;

/* JADX INFO: renamed from: y2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2239a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2239a f23191a = new C2239a();

    private C2239a() {
    }

    public static final int a(int i7) {
        return i7 % 2 == 0 ? 2 : 1;
    }

    public static final int b(int i7, int i8) {
        int i9 = i8 == -1 ? 1 : 2;
        if (i9 == 1 && !d(i7) && i7 % 2 == 0) {
            return 2;
        }
        return i9;
    }

    public static final int c(View view) {
        k.f(view, "view");
        return a(view.getId());
    }

    public static final boolean d(int i7) {
        return i7 % 10 == 1;
    }
}
