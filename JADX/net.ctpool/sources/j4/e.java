package j4;

import java.io.File;
import n4.C1928g;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f20358c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1928g f20359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f20360b;

    public e(C1928g c1928g) {
        this.f20359a = c1928g;
        this.f20360b = f20358c;
    }

    private File d(String str) {
        return this.f20359a.q(str, "userlog");
    }

    public void a() {
        this.f20360b.d();
    }

    public byte[] b() {
        return this.f20360b.c();
    }

    public String c() {
        return this.f20360b.b();
    }

    public final void e(String str) {
        this.f20360b.a();
        this.f20360b = f20358c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i7) {
        this.f20360b = new h(file, i7);
    }

    public void g(long j7, String str) {
        this.f20360b.e(j7, str);
    }

    public e(C1928g c1928g, String str) {
        this(c1928g);
        e(str);
    }

    private static final class b implements c {
        private b() {
        }

        @Override // j4.c
        public String b() {
            return null;
        }

        @Override // j4.c
        public byte[] c() {
            return null;
        }

        @Override // j4.c
        public void a() {
        }

        @Override // j4.c
        public void d() {
        }

        @Override // j4.c
        public void e(long j7, String str) {
        }
    }
}
