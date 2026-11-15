package X2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f4325c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4327b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4328a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f4329b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f4328a, Collections.unmodifiableList(this.f4329b));
        }

        public a b(List list) {
            this.f4329b = list;
            return this;
        }

        public a c(String str) {
            this.f4328a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f4326a = str;
        this.f4327b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f4327b;
    }

    public String b() {
        return this.f4326a;
    }
}
