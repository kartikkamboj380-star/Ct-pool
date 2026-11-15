package C5;

import j5.AbstractC1785D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q5.AbstractC2003c;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements Iterable, InterfaceC2227a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f957p = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f959n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f960o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d(long j7, long j8, long j9) {
        if (j9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j9 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f958m = j7;
        this.f959n = AbstractC2003c.d(j7, j8, j9);
        this.f960o = j9;
    }

    public final long f() {
        return this.f958m;
    }

    public final long h() {
        return this.f959n;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC1785D iterator() {
        return new e(this.f958m, this.f959n, this.f960o);
    }
}
