package O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f2460a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f2461b = new c();

    class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f2462a;

        a(Object obj) {
            this.f2462a = obj;
        }

        @Override // O0.o
        public Object get() {
            return this.f2462a;
        }
    }

    class b implements o {
        b() {
        }

        @Override // O0.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    class c implements o {
        c() {
        }

        @Override // O0.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    public static o a(Object obj) {
        return new a(obj);
    }
}
