package P2;

import java.util.ArrayList;
import java.util.List;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2569a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2570b;

    public static abstract class a {
        public abstract a a(String str, int i7);

        public abstract a b(String str, Object obj);

        public abstract void c();
    }

    /* JADX INFO: renamed from: P2.b$b, reason: collision with other inner class name */
    private static final class C0054b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f2571a;

        public C0054b(long j7) {
            this.f2571a = j7;
        }

        @Override // P2.b.a
        public a a(String str, int i7) {
            k.f(str, "key");
            return this;
        }

        @Override // P2.b.a
        public a b(String str, Object obj) {
            k.f(str, "key");
            k.f(obj, "value");
            return this;
        }

        @Override // P2.b.a
        public void c() {
            P2.a.g(this.f2571a);
        }
    }

    private static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f2572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f2573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f2574c;

        public c(long j7, String str) {
            k.f(str, "sectionName");
            this.f2572a = j7;
            this.f2573b = str;
            this.f2574c = new ArrayList();
        }

        private final void d(String str, String str2) {
            this.f2574c.add(str + ": " + str2);
        }

        @Override // P2.b.a
        public a a(String str, int i7) {
            k.f(str, "key");
            d(str, String.valueOf(i7));
            return this;
        }

        @Override // P2.b.a
        public a b(String str, Object obj) {
            k.f(str, "key");
            k.f(obj, "value");
            d(str, obj.toString());
            return this;
        }

        @Override // P2.b.a
        public void c() {
            String str;
            long j7 = this.f2572a;
            String str2 = this.f2573b;
            if (b.f2570b && (!this.f2574c.isEmpty())) {
                str = " (" + P2.c.a(", ", this.f2574c) + ")";
            } else {
                str = "";
            }
            P2.a.c(j7, str2 + str);
        }
    }

    private b() {
    }

    public static final a a(long j7, String str) {
        k.f(str, "sectionName");
        return new c(j7, str);
    }

    public static final a b(long j7) {
        return new C0054b(j7);
    }
}
