package J5;

import H5.InterfaceC0404l;
import M5.F;
import M5.I;
import v5.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f1794a = new h(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1795b = I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f1796c = I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f1797d = new F("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final F f1798e = new F("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final F f1799f = new F("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final F f1800g = new F("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final F f1801h = new F("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final F f1802i = new F("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final F f1803j = new F("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final F f1804k = new F("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final F f1805l = new F("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final F f1806m = new F("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final F f1807n = new F("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final F f1808o = new F("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final F f1809p = new F("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final F f1810q = new F("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final F f1811r = new F("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final F f1812s = new F("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends w5.i implements p {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f1813v = new a();

        a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final h l(long j7, h hVar) {
            return c.w(j7, hVar);
        }

        @Override // v5.p
        public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
            return l(((Number) obj).longValue(), (h) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(InterfaceC0404l interfaceC0404l, Object obj, v5.l lVar) {
        Object objQ = interfaceC0404l.q(obj, null, lVar);
        if (objQ == null) {
            return false;
        }
        interfaceC0404l.r(objQ);
        return true;
    }

    static /* synthetic */ boolean B(InterfaceC0404l interfaceC0404l, Object obj, v5.l lVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            lVar = null;
        }
        return A(interfaceC0404l, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long u(long j7, boolean z6) {
        return (z6 ? 4611686018427387904L : 0L) + j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j7, int i7) {
        return (((long) i7) << 60) + j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h w(long j7, h hVar) {
        return new h(j7, hVar, hVar.u(), 0);
    }

    public static final D5.d x() {
        return a.f1813v;
    }

    public static final F y() {
        return f1805l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long z(int i7) {
        if (i7 == 0) {
            return 0L;
        }
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        return Long.MAX_VALUE;
    }
}
