package w4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f22711b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f22713b = null;

        b(String str) {
            this.f22712a = str;
        }

        public c a() {
            return new c(this.f22712a, this.f22713b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f22713b)));
        }

        public b b(Annotation annotation) {
            if (this.f22713b == null) {
                this.f22713b = new HashMap();
            }
            this.f22713b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    private c(String str, Map map) {
        this.f22710a = str;
        this.f22711b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f22710a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f22711b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22710a.equals(cVar.f22710a) && this.f22711b.equals(cVar.f22711b);
    }

    public int hashCode() {
        return (this.f22710a.hashCode() * 31) + this.f22711b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f22710a + ", properties=" + this.f22711b.values() + "}";
    }
}
