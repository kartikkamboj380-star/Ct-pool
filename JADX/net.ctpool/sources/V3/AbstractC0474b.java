package V3;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: V3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0474b extends S {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private EnumC0091b f4081m = EnumC0091b.NOT_READY;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f4082n;

    /* JADX INFO: renamed from: V3.b$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4083a;

        static {
            int[] iArr = new int[EnumC0091b.values().length];
            f4083a = iArr;
            try {
                iArr[EnumC0091b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4083a[EnumC0091b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: V3.b$b, reason: collision with other inner class name */
    private enum EnumC0091b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC0474b() {
    }

    private boolean e() {
        this.f4081m = EnumC0091b.FAILED;
        this.f4082n = c();
        if (this.f4081m == EnumC0091b.DONE) {
            return false;
        }
        this.f4081m = EnumC0091b.READY;
        return true;
    }

    protected abstract Object c();

    protected final Object d() {
        this.f4081m = EnumC0091b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        U3.h.n(this.f4081m != EnumC0091b.FAILED);
        int i7 = a.f4083a[this.f4081m.ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            return e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4081m = EnumC0091b.NOT_READY;
        Object objA = E.a(this.f4082n);
        this.f4082n = null;
        return objA;
    }
}
