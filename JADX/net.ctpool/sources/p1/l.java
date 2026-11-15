package p1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public enum l {
    UNKNOWN(-1),
    VISIBLE(1),
    INVISIBLE(2);


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f21601n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final l[] f21602o = values();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f21607m;

    public static final class a {
        private a() {
        }

        public final l a(int i7) {
            for (l lVar : l.f21602o) {
                if (lVar.j() == i7) {
                    return lVar;
                }
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    l(int i7) {
        this.f21607m = i7;
    }

    public final int j() {
        return this.f21607m;
    }
}
