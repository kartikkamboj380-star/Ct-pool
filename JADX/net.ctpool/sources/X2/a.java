package X2;

import U2.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f4299e = new C0099a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f4300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f4302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4303d;

    /* JADX INFO: renamed from: X2.a$a, reason: collision with other inner class name */
    public static final class C0099a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f4304a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f4305b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f4306c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f4307d = "";

        C0099a() {
        }

        public C0099a a(d dVar) {
            this.f4305b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f4304a, Collections.unmodifiableList(this.f4305b), this.f4306c, this.f4307d);
        }

        public C0099a c(String str) {
            this.f4307d = str;
            return this;
        }

        public C0099a d(b bVar) {
            this.f4306c = bVar;
            return this;
        }

        public C0099a e(f fVar) {
            this.f4304a = fVar;
            return this;
        }
    }

    a(f fVar, List list, b bVar, String str) {
        this.f4300a = fVar;
        this.f4301b = list;
        this.f4302c = bVar;
        this.f4303d = str;
    }

    public static C0099a e() {
        return new C0099a();
    }

    public String a() {
        return this.f4303d;
    }

    public b b() {
        return this.f4302c;
    }

    public List c() {
        return this.f4301b;
    }

    public f d() {
        return this.f4300a;
    }

    public byte[] f() {
        return m.a(this);
    }
}
