package P;

import java.util.LinkedHashMap;
import java.util.Map;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f2549a = new LinkedHashMap();

    /* JADX INFO: renamed from: P.a$a, reason: collision with other inner class name */
    public static final class C0052a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0052a f2550b = new C0052a();

        private C0052a() {
        }

        @Override // P.a
        public Object a(b bVar) {
            k.f(bVar, "key");
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f2549a;
    }
}
