package M5;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2110e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f2111f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f2112g = AtomicLongFieldUpdater.newUpdater(s.class, "_state");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final F f2113h = new F("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReferenceArray f2117d;

    public static final class a {
        private a() {
        }

        public final int a(long j7) {
            return (j7 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j7, int i7) {
            return d(j7, 1073741823L) | ((long) i7);
        }

        public final long c(long j7, int i7) {
            return d(j7, 1152921503533105152L) | (((long) i7) << 30);
        }

        public final long d(long j7, long j8) {
            return j7 & (~j8);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2118a;

        public b(int i7) {
            this.f2118a = i7;
        }
    }

    public s(int i7, boolean z6) {
        this.f2114a = i7;
        this.f2115b = z6;
        int i8 = i7 - 1;
        this.f2116c = i8;
        this.f2117d = new AtomicReferenceArray(i7);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i7 & i8) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final s b(long j7) {
        s sVar = new s(this.f2114a * 2, this.f2115b);
        int i7 = (int) (1073741823 & j7);
        int i8 = (int) ((1152921503533105152L & j7) >> 30);
        while (true) {
            int i9 = this.f2116c;
            if ((i7 & i9) == (i8 & i9)) {
                f2112g.set(sVar, f2110e.d(j7, 1152921504606846976L));
                return sVar;
            }
            Object bVar = this.f2117d.get(i9 & i7);
            if (bVar == null) {
                bVar = new b(i7);
            }
            sVar.f2117d.set(sVar.f2116c & i7, bVar);
            i7++;
        }
    }

    private final s c(long j7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2111f;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar != null) {
                return sVar;
            }
            androidx.concurrent.futures.b.a(f2111f, this, null, b(j7));
        }
    }

    private final s e(int i7, Object obj) {
        Object obj2 = this.f2117d.get(this.f2116c & i7);
        if (!(obj2 instanceof b) || ((b) obj2).f2118a != i7) {
            return null;
        }
        this.f2117d.set(i7 & this.f2116c, obj);
        return this;
    }

    private final long h() {
        long j7;
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2112g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                return j7;
            }
            j8 = j7 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j8));
        return j8;
    }

    private final s k(int i7, int i8) {
        long j7;
        int i9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2112g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            i9 = (int) (1073741823 & j7);
            if ((1152921504606846976L & j7) != 0) {
                return i();
            }
        } while (!f2112g.compareAndSet(this, j7, f2110e.b(j7, i8)));
        this.f2117d.set(this.f2116c & i9, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2112g;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j7) != 0) {
                return f2110e.a(j7);
            }
            int i7 = (int) (1073741823 & j7);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            int i9 = this.f2116c;
            if (((i8 + 2) & i9) == (i7 & i9)) {
                return 1;
            }
            if (!this.f2115b && this.f2117d.get(i8 & i9) != null) {
                int i10 = this.f2114a;
                if (i10 < 1024 || ((i8 - i7) & 1073741823) > (i10 >> 1)) {
                    break;
                }
            } else if (f2112g.compareAndSet(this, j7, f2110e.c(j7, (i8 + 1) & 1073741823))) {
                this.f2117d.set(i8 & i9, obj);
                s sVarE = this;
                while ((f2112g.get(sVarE) & 1152921504606846976L) != 0 && (sVarE = sVarE.i().e(i8, obj)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2112g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j7 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j7 = f2112g.get(this);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    public final boolean g() {
        long j7 = f2112g.get(this);
        return ((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30));
    }

    public final s i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2112g;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j7) != 0) {
                return f2113h;
            }
            int i7 = (int) (1073741823 & j7);
            int i8 = this.f2116c;
            if ((((int) ((1152921503533105152L & j7) >> 30)) & i8) == (i7 & i8)) {
                return null;
            }
            Object obj = this.f2117d.get(i8 & i7);
            if (obj == null) {
                if (this.f2115b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i9 = (i7 + 1) & 1073741823;
                if (f2112g.compareAndSet(this, j7, f2110e.b(j7, i9))) {
                    this.f2117d.set(this.f2116c & i7, null);
                    return obj;
                }
                if (this.f2115b) {
                    s sVarK = this;
                    do {
                        sVarK = sVarK.k(i7, i9);
                    } while (sVarK != null);
                    return obj;
                }
            }
        }
    }
}
