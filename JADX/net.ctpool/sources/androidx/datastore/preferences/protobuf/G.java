package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class G implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final N f7526b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N f7527a;

    static class a implements N {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public M a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private N[] f7528a;

        b(N... nArr) {
            this.f7528a = nArr;
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public M a(Class cls) {
            for (N n7 : this.f7528a) {
                if (n7.b(cls)) {
                    return n7.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.N
        public boolean b(Class cls) {
            for (N n7 : this.f7528a) {
                if (n7.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public G() {
        this(b());
    }

    private static N b() {
        return new b(C0626v.c(), c());
    }

    private static N c() {
        try {
            return (N) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f7526b;
        }
    }

    private static boolean d(M m7) {
        return m7.c() == Z.PROTO2;
    }

    private static e0 e(Class cls, M m7) {
        return AbstractC0627w.class.isAssignableFrom(cls) ? d(m7) ? S.M(cls, m7, W.b(), E.b(), g0.L(), r.b(), L.b()) : S.M(cls, m7, W.b(), E.b(), g0.L(), null, L.b()) : d(m7) ? S.M(cls, m7, W.a(), E.a(), g0.G(), r.a(), L.a()) : S.M(cls, m7, W.a(), E.a(), g0.H(), null, L.a());
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public e0 a(Class cls) {
        l0 l0VarG;
        AbstractC0621p abstractC0621pA;
        g0.I(cls);
        M mA = this.f7527a.a(cls);
        if (!mA.a()) {
            return e(cls, mA);
        }
        if (AbstractC0627w.class.isAssignableFrom(cls)) {
            l0VarG = g0.L();
            abstractC0621pA = r.b();
        } else {
            l0VarG = g0.G();
            abstractC0621pA = r.a();
        }
        return T.l(l0VarG, abstractC0621pA, mA.b());
    }

    private G(N n7) {
        this.f7527a = (N) AbstractC0629y.b(n7, "messageInfoFactory");
    }
}
