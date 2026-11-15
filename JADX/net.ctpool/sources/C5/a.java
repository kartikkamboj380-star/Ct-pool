package C5;

import j5.AbstractC1784C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q5.AbstractC2003c;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Iterable, InterfaceC2227a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0013a f947p = new C0013a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f949n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f950o;

    /* JADX INFO: renamed from: C5.a$a, reason: collision with other inner class name */
    public static final class C0013a {
        private C0013a() {
        }

        public final a a(int i7, int i8, int i9) {
            return new a(i7, i8, i9);
        }

        public /* synthetic */ C0013a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f948m = i7;
        this.f949n = AbstractC2003c.c(i7, i8, i9);
        this.f950o = i9;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f948m != aVar.f948m || this.f949n != aVar.f949n || this.f950o != aVar.f950o) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f948m;
    }

    public final int h() {
        return this.f949n;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f948m * 31) + this.f949n) * 31) + this.f950o;
    }

    public final int i() {
        return this.f950o;
    }

    public boolean isEmpty() {
        if (this.f950o > 0) {
            if (this.f948m <= this.f949n) {
                return false;
            }
        } else if (this.f948m >= this.f949n) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC1784C iterator() {
        return new b(this.f948m, this.f949n, this.f950o);
    }

    public String toString() {
        StringBuilder sb;
        int i7;
        if (this.f950o > 0) {
            sb = new StringBuilder();
            sb.append(this.f948m);
            sb.append("..");
            sb.append(this.f949n);
            sb.append(" step ");
            i7 = this.f950o;
        } else {
            sb = new StringBuilder();
            sb.append(this.f948m);
            sb.append(" downTo ");
            sb.append(this.f949n);
            sb.append(" step ");
            i7 = -this.f950o;
        }
        sb.append(i7);
        return sb.toString();
    }
}
