package O0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f2453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0048a f2454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0048a f2455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f2456d;

        /* JADX INFO: renamed from: O0.j$a$a, reason: collision with other inner class name */
        private static final class C0048a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f2457a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f2458b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C0048a f2459c;

            private C0048a() {
            }
        }

        private a(String str) {
            C0048a c0048a = new C0048a();
            this.f2454b = c0048a;
            this.f2455c = c0048a;
            this.f2456d = false;
            this.f2453a = (String) l.g(str);
        }

        private C0048a d() {
            C0048a c0048a = new C0048a();
            this.f2455c.f2459c = c0048a;
            this.f2455c = c0048a;
            return c0048a;
        }

        private a e(String str, Object obj) {
            C0048a c0048aD = d();
            c0048aD.f2458b = obj;
            c0048aD.f2457a = (String) l.g(str);
            return this;
        }

        public a a(String str, int i7) {
            return e(str, String.valueOf(i7));
        }

        public a b(String str, Object obj) {
            return e(str, obj);
        }

        public a c(String str, boolean z6) {
            return e(str, String.valueOf(z6));
        }

        public String toString() {
            boolean z6 = this.f2456d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f2453a);
            sb.append('{');
            String str = "";
            for (C0048a c0048a = this.f2454b.f2459c; c0048a != null; c0048a = c0048a.f2459c) {
                Object obj = c0048a.f2458b;
                if (!z6 || obj != null) {
                    sb.append(str);
                    String str2 = c0048a.f2457a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
