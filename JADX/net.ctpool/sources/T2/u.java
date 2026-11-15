package T2;

import T2.k;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    public static abstract class a {
        public abstract u a();

        public abstract a b(o oVar);

        public abstract a c(List list);

        abstract a d(Integer num);

        abstract a e(String str);

        public abstract a f(x xVar);

        public abstract a g(long j7);

        public abstract a h(long j7);

        public a i(int i7) {
            return d(Integer.valueOf(i7));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new k.b();
    }

    public abstract o b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract x f();

    public abstract long g();

    public abstract long h();
}
