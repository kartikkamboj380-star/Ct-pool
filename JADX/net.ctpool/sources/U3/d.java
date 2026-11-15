package U3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f3841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f3842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3844e;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f3845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f3846b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f3847c;

            private a() {
            }
        }

        private b(String str) {
            a aVar = new a();
            this.f3841b = aVar;
            this.f3842c = aVar;
            this.f3843d = false;
            this.f3844e = false;
            this.f3840a = (String) h.i(str);
        }

        private a a() {
            a aVar = new a();
            this.f3842c.f3847c = aVar;
            this.f3842c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f3846b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof g ? !((g) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            boolean z6 = this.f3843d;
            boolean z7 = this.f3844e;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f3840a);
            sb.append('{');
            String str = "";
            for (a aVar = this.f3841b.f3847c; aVar != null; aVar = aVar.f3847c) {
                Object obj = aVar.f3846b;
                if (obj == null) {
                    if (!z6) {
                        sb.append(str);
                        String str2 = aVar.f3845a;
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
                } else if (!z7 || !d(obj)) {
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
