package b4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: b4.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0685F implements InterfaceC0689d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f9659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f9660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f9661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f9662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f9663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f9664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0689d f9665g;

    /* JADX INFO: renamed from: b4.F$a */
    private static class a implements A4.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f9666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final A4.c f9667b;

        public a(Set set, A4.c cVar) {
            this.f9666a = set;
            this.f9667b = cVar;
        }

        @Override // A4.c
        public void d(A4.a aVar) {
            if (!this.f9666a.contains(aVar.b())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f9667b.d(aVar);
        }
    }

    C0685F(C0688c c0688c, InterfaceC0689d interfaceC0689d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C0702q c0702q : c0688c.g()) {
            if (c0702q.e()) {
                boolean zG = c0702q.g();
                C0684E c0684eC = c0702q.c();
                if (zG) {
                    hashSet4.add(c0684eC);
                } else {
                    hashSet.add(c0684eC);
                }
            } else if (c0702q.d()) {
                hashSet3.add(c0702q.c());
            } else {
                boolean zG2 = c0702q.g();
                C0684E c0684eC2 = c0702q.c();
                if (zG2) {
                    hashSet5.add(c0684eC2);
                } else {
                    hashSet2.add(c0684eC2);
                }
            }
        }
        if (!c0688c.k().isEmpty()) {
            hashSet.add(C0684E.b(A4.c.class));
        }
        this.f9659a = Collections.unmodifiableSet(hashSet);
        this.f9660b = Collections.unmodifiableSet(hashSet2);
        this.f9661c = Collections.unmodifiableSet(hashSet3);
        this.f9662d = Collections.unmodifiableSet(hashSet4);
        this.f9663e = Collections.unmodifiableSet(hashSet5);
        this.f9664f = c0688c.k();
        this.f9665g = interfaceC0689d;
    }

    @Override // b4.InterfaceC0689d
    public Object a(Class cls) {
        if (!this.f9659a.contains(C0684E.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f9665g.a(cls);
        return !cls.equals(A4.c.class) ? objA : new a(this.f9664f, (A4.c) objA);
    }

    @Override // b4.InterfaceC0689d
    public D4.b b(Class cls) {
        return f(C0684E.b(cls));
    }

    @Override // b4.InterfaceC0689d
    public D4.b c(C0684E c0684e) {
        if (this.f9663e.contains(c0684e)) {
            return this.f9665g.c(c0684e);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c0684e));
    }

    @Override // b4.InterfaceC0689d
    public Set d(C0684E c0684e) {
        if (this.f9662d.contains(c0684e)) {
            return this.f9665g.d(c0684e);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", c0684e));
    }

    @Override // b4.InterfaceC0689d
    public Object e(C0684E c0684e) {
        if (this.f9659a.contains(c0684e)) {
            return this.f9665g.e(c0684e);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", c0684e));
    }

    @Override // b4.InterfaceC0689d
    public D4.b f(C0684E c0684e) {
        if (this.f9660b.contains(c0684e)) {
            return this.f9665g.f(c0684e);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", c0684e));
    }

    @Override // b4.InterfaceC0689d
    public D4.a h(C0684E c0684e) {
        if (this.f9661c.contains(c0684e)) {
            return this.f9665g.h(c0684e);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c0684e));
    }

    @Override // b4.InterfaceC0689d
    public D4.a i(Class cls) {
        return h(C0684E.b(cls));
    }
}
