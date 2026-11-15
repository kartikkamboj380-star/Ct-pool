package H5;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L0 f1395a = new L0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f1396b = M5.K.a(new M5.F("ThreadLocalEventLoop"));

    private L0() {
    }

    public final AbstractC0383a0 a() {
        return (AbstractC0383a0) f1396b.get();
    }

    public final AbstractC0383a0 b() {
        ThreadLocal threadLocal = f1396b;
        AbstractC0383a0 abstractC0383a0 = (AbstractC0383a0) threadLocal.get();
        if (abstractC0383a0 != null) {
            return abstractC0383a0;
        }
        AbstractC0383a0 abstractC0383a0A = AbstractC0389d0.a();
        threadLocal.set(abstractC0383a0A);
        return abstractC0383a0A;
    }

    public final void c() {
        f1396b.set(null);
    }

    public final void d(AbstractC0383a0 abstractC0383a0) {
        f1396b.set(abstractC0383a0);
    }
}
