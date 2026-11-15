package b4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: b4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f9671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f9672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f9673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0692g f9675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f9676g;

    private C0688c(String str, Set set, Set set2, int i7, int i8, InterfaceC0692g interfaceC0692g, Set set3) {
        this.f9670a = str;
        this.f9671b = Collections.unmodifiableSet(set);
        this.f9672c = Collections.unmodifiableSet(set2);
        this.f9673d = i7;
        this.f9674e = i8;
        this.f9675f = interfaceC0692g;
        this.f9676g = Collections.unmodifiableSet(set3);
    }

    public static b c(C0684E c0684e) {
        return new b(c0684e, new C0684E[0]);
    }

    public static b d(C0684E c0684e, C0684E... c0684eArr) {
        return new b(c0684e, c0684eArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C0688c l(final Object obj, Class cls) {
        return m(cls).f(new InterfaceC0692g() { // from class: b4.a
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return C0688c.q(obj, interfaceC0689d);
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C0688c s(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new InterfaceC0692g() { // from class: b4.b
            @Override // b4.InterfaceC0692g
            public final Object a(InterfaceC0689d interfaceC0689d) {
                return C0688c.r(obj, interfaceC0689d);
            }
        }).d();
    }

    public Set g() {
        return this.f9672c;
    }

    public InterfaceC0692g h() {
        return this.f9675f;
    }

    public String i() {
        return this.f9670a;
    }

    public Set j() {
        return this.f9671b;
    }

    public Set k() {
        return this.f9676g;
    }

    public boolean n() {
        return this.f9673d == 1;
    }

    public boolean o() {
        return this.f9673d == 2;
    }

    public boolean p() {
        return this.f9674e == 0;
    }

    public C0688c t(InterfaceC0692g interfaceC0692g) {
        return new C0688c(this.f9670a, this.f9671b, this.f9672c, this.f9673d, this.f9674e, interfaceC0692g, this.f9676g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f9671b.toArray()) + ">{" + this.f9673d + ", type=" + this.f9674e + ", deps=" + Arrays.toString(this.f9672c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: b4.c$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f9678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f9679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f9680d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC0692g f9682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set f9683g;

        private b(C0684E c0684e, C0684E... c0684eArr) {
            this.f9677a = null;
            HashSet hashSet = new HashSet();
            this.f9678b = hashSet;
            this.f9679c = new HashSet();
            this.f9680d = 0;
            this.f9681e = 0;
            this.f9683g = new HashSet();
            AbstractC0683D.c(c0684e, "Null interface");
            hashSet.add(c0684e);
            for (C0684E c0684e2 : c0684eArr) {
                AbstractC0683D.c(c0684e2, "Null interface");
            }
            Collections.addAll(this.f9678b, c0684eArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f9681e = 1;
            return this;
        }

        private b i(int i7) {
            AbstractC0683D.d(this.f9680d == 0, "Instantiation type has already been set.");
            this.f9680d = i7;
            return this;
        }

        private void j(C0684E c0684e) {
            AbstractC0683D.a(!this.f9678b.contains(c0684e), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(C0702q c0702q) {
            AbstractC0683D.c(c0702q, "Null dependency");
            j(c0702q.c());
            this.f9679c.add(c0702q);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C0688c d() {
            AbstractC0683D.d(this.f9682f != null, "Missing required property: factory.");
            return new C0688c(this.f9677a, new HashSet(this.f9678b), new HashSet(this.f9679c), this.f9680d, this.f9681e, this.f9682f, this.f9683g);
        }

        public b e() {
            return i(2);
        }

        public b f(InterfaceC0692g interfaceC0692g) {
            this.f9682f = (InterfaceC0692g) AbstractC0683D.c(interfaceC0692g, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f9677a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f9677a = null;
            HashSet hashSet = new HashSet();
            this.f9678b = hashSet;
            this.f9679c = new HashSet();
            this.f9680d = 0;
            this.f9681e = 0;
            this.f9683g = new HashSet();
            AbstractC0683D.c(cls, "Null interface");
            hashSet.add(C0684E.b(cls));
            for (Class cls2 : clsArr) {
                AbstractC0683D.c(cls2, "Null interface");
                this.f9678b.add(C0684E.b(cls2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, InterfaceC0689d interfaceC0689d) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, InterfaceC0689d interfaceC0689d) {
        return obj;
    }
}
