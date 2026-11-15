package q0;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface z {

    public static final class a {
        public static void a(z zVar, String str, Set set) {
            w5.k.f(str, "id");
            w5.k.f(set, "tags");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                zVar.a(new y((String) it.next(), str));
            }
        }
    }

    void a(y yVar);

    List b(String str);

    void c(String str, Set set);

    void d(String str);
}
