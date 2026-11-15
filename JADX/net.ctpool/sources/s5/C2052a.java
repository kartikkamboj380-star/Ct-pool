package s5;

import A5.c;
import r5.AbstractC2030a;

/* JADX INFO: renamed from: s5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2052a extends AbstractC2030a {

    /* JADX INFO: renamed from: s5.a$a, reason: collision with other inner class name */
    private static final class C0311a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0311a f22265a = new C0311a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f22266b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f22266b = num;
        }

        private C0311a() {
        }
    }

    private final boolean c(int i7) {
        Integer num = C0311a.f22266b;
        return num == null || num.intValue() >= i7;
    }

    @Override // q5.AbstractC2001a
    public c b() {
        return c(34) ? new B5.a() : super.b();
    }
}
