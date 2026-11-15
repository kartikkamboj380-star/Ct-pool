package C5;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f965q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final f f966r = new f(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public f(long j7, long j8) {
        super(j7, j8, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (f() != fVar.f() || h() != fVar.h()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (f() ^ (f() >>> 32))) + (h() ^ (h() >>> 32)));
    }

    public boolean isEmpty() {
        return f() > h();
    }

    public boolean k(long j7) {
        return f() <= j7 && j7 <= h();
    }

    public String toString() {
        return f() + ".." + h();
    }
}
