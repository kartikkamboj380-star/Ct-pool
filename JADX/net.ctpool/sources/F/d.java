package F;

import j5.AbstractC1787F;
import java.util.Map;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1062a;

        public a(String str) {
            k.f(str, "name");
            this.f1062a = str;
        }

        public final String a() {
            return this.f1062a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return k.b(this.f1062a, ((a) obj).f1062a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1062a.hashCode();
        }

        public String toString() {
            return this.f1062a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final F.a c() {
        return new F.a(AbstractC1787F.s(a()), false);
    }

    public final d d() {
        return new F.a(AbstractC1787F.s(a()), true);
    }
}
