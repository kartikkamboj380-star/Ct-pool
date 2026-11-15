package r5;

import java.lang.reflect.InvocationTargetException;
import q5.AbstractC2001a;
import w5.k;

/* JADX INFO: renamed from: r5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2030a extends AbstractC2001a {

    /* JADX INFO: renamed from: r5.a$a, reason: collision with other inner class name */
    private static final class C0308a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0308a f22138a = new C0308a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f22139b;

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
            f22139b = num;
        }

        private C0308a() {
        }
    }

    private final boolean c(int i7) {
        Integer num = C0308a.f22139b;
        return num == null || num.intValue() >= i7;
    }

    @Override // q5.AbstractC2001a
    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        k.f(th, "cause");
        k.f(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
