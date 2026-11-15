package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7119e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7123d;

    static class a {
        static Insets a(int i7, int i8, int i9, int i10) {
            return Insets.of(i7, i8, i9, i10);
        }
    }

    private b(int i7, int i8, int i9, int i10) {
        this.f7120a = i7;
        this.f7121b = i8;
        this.f7122c = i9;
        this.f7123d = i10;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f7120a, bVar2.f7120a), Math.max(bVar.f7121b, bVar2.f7121b), Math.max(bVar.f7122c, bVar2.f7122c), Math.max(bVar.f7123d, bVar2.f7123d));
    }

    public static b b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f7119e : new b(i7, i8, i9, i10);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f7120a, this.f7121b, this.f7122c, this.f7123d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7123d == bVar.f7123d && this.f7120a == bVar.f7120a && this.f7122c == bVar.f7122c && this.f7121b == bVar.f7121b;
    }

    public int hashCode() {
        return (((((this.f7120a * 31) + this.f7121b) * 31) + this.f7122c) * 31) + this.f7123d;
    }

    public String toString() {
        return "Insets{left=" + this.f7120a + ", top=" + this.f7121b + ", right=" + this.f7122c + ", bottom=" + this.f7123d + '}';
    }
}
