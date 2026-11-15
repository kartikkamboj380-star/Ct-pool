package q0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    public static final class a {
        public static i a(j jVar, m mVar) {
            w5.k.f(mVar, "id");
            return jVar.g(mVar.b(), mVar.a());
        }

        public static void b(j jVar, m mVar) {
            w5.k.f(mVar, "id");
            jVar.d(mVar.b(), mVar.a());
        }
    }

    List a();

    void b(i iVar);

    void c(m mVar);

    void d(String str, int i7);

    i e(m mVar);

    void f(String str);

    i g(String str, int i7);
}
