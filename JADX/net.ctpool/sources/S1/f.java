package S1;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map f2928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2929b;

        private a() {
            this.f2928a = f.b();
            this.f2929b = true;
        }

        public Map a() {
            if (!this.f2929b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f2929b = false;
            return this.f2928a;
        }

        public a b(Object obj, Object obj2) {
            if (!this.f2929b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f2928a.put(obj, obj2);
            return this;
        }
    }

    public static a a() {
        return new a();
    }

    public static HashMap b() {
        return new HashMap();
    }

    public static Map c() {
        return b();
    }

    public static Map d(Object obj, Object obj2) {
        Map mapC = c();
        mapC.put(obj, obj2);
        return mapC;
    }

    public static Map e(Object obj, Object obj2, Object obj3, Object obj4) {
        Map mapC = c();
        mapC.put(obj, obj2);
        mapC.put(obj3, obj4);
        return mapC;
    }

    public static Map f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Map mapC = c();
        mapC.put(obj, obj2);
        mapC.put(obj3, obj4);
        mapC.put(obj5, obj6);
        return mapC;
    }

    public static Map g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Map mapC = c();
        mapC.put(obj, obj2);
        mapC.put(obj3, obj4);
        mapC.put(obj5, obj6);
        mapC.put(obj7, obj8);
        return mapC;
    }

    public static Map h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Map mapC = c();
        mapC.put(obj, obj2);
        mapC.put(obj3, obj4);
        mapC.put(obj5, obj6);
        mapC.put(obj7, obj8);
        mapC.put(obj9, obj10);
        return mapC;
    }

    public static Map i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        Map mapC = c();
        mapC.put(obj, obj2);
        mapC.put(obj3, obj4);
        mapC.put(obj5, obj6);
        mapC.put(obj7, obj8);
        mapC.put(obj9, obj10);
        mapC.put(obj11, obj12);
        return mapC;
    }
}
