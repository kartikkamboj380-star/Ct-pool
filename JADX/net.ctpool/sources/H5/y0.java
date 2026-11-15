package H5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final M5.F f1468a = new M5.F("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M5.F f1469b = new M5.F("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final M5.F f1470c = new M5.F("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final M5.F f1471d = new M5.F("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final M5.F f1472e = new M5.F("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Z f1473f = new Z(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Z f1474g = new Z(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC0405l0 ? new C0407m0((InterfaceC0405l0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC0405l0 interfaceC0405l0;
        C0407m0 c0407m0 = obj instanceof C0407m0 ? (C0407m0) obj : null;
        return (c0407m0 == null || (interfaceC0405l0 = c0407m0.f1436a) == null) ? obj : interfaceC0405l0;
    }
}
