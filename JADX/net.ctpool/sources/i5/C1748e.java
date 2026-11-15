package i5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1748e implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f19958q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1748e f19959r = f.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f19960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f19961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f19962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f19963p;

    /* JADX INFO: renamed from: i5.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C1748e(int i7, int i8, int i9) {
        this.f19960m = i7;
        this.f19961n = i8;
        this.f19962o = i9;
        this.f19963p = h(i7, i8, i9);
    }

    private final int h(int i7, int i8, int i9) {
        if (new C5.c(0, 255).j0(i7) && new C5.c(0, 255).j0(i8) && new C5.c(0, 255).j0(i9)) {
            return (i7 << 16) + (i8 << 8) + i9;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i7 + '.' + i8 + '.' + i9).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1748e c1748e) {
        w5.k.f(c1748e, "other");
        return this.f19963p - c1748e.f19963p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1748e c1748e = obj instanceof C1748e ? (C1748e) obj : null;
        return c1748e != null && this.f19963p == c1748e.f19963p;
    }

    public int hashCode() {
        return this.f19963p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19960m);
        sb.append('.');
        sb.append(this.f19961n);
        sb.append('.');
        sb.append(this.f19962o);
        return sb.toString();
    }
}
