package U3;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    static class a implements k, Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final k f3849m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile transient boolean f3850n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        transient Object f3851o;

        a(k kVar) {
            this.f3849m = (k) h.i(kVar);
        }

        @Override // U3.k
        public Object get() {
            if (!this.f3850n) {
                synchronized (this) {
                    try {
                        if (!this.f3850n) {
                            Object obj = this.f3849m.get();
                            this.f3851o = obj;
                            this.f3850n = true;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f3851o);
        }

        public String toString() {
            Object string;
            if (this.f3850n) {
                String strValueOf = String.valueOf(this.f3851o);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            } else {
                string = this.f3849m;
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static class b implements k {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile k f3852m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        volatile boolean f3853n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f3854o;

        b(k kVar) {
            this.f3852m = (k) h.i(kVar);
        }

        @Override // U3.k
        public Object get() {
            if (!this.f3853n) {
                synchronized (this) {
                    try {
                        if (!this.f3853n) {
                            k kVar = this.f3852m;
                            Objects.requireNonNull(kVar);
                            Object obj = kVar.get();
                            this.f3854o = obj;
                            this.f3853n = true;
                            this.f3852m = null;
                            return obj;
                        }
                    } finally {
                    }
                }
            }
            return e.a(this.f3854o);
        }

        public String toString() {
            Object string = this.f3852m;
            if (string == null) {
                String strValueOf = String.valueOf(this.f3854o);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(strValueOf);
                sb.append(">");
                string = sb.toString();
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(strValueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class c implements k, Serializable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final Object f3855m;

        c(Object obj) {
            this.f3855m = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return f.a(this.f3855m, ((c) obj).f3855m);
            }
            return false;
        }

        @Override // U3.k
        public Object get() {
            return this.f3855m;
        }

        public int hashCode() {
            return f.b(this.f3855m);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f3855m);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(strValueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static k a(k kVar) {
        return ((kVar instanceof b) || (kVar instanceof a)) ? kVar : kVar instanceof Serializable ? new a(kVar) : new b(kVar);
    }

    public static k b(Object obj) {
        return new c(obj);
    }
}
