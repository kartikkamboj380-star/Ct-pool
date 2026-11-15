package i6;

import com.tenjin.android.utils.adnetwork.TradPlusHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f20064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final AtomicReference[] f20065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f20066e = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f20062a = 65536;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x f20063b = new x(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f20064c = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i7 = 0; i7 < iHighestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f20065d = atomicReferenceArr;
    }

    private y() {
    }

    private final AtomicReference a() {
        Thread threadCurrentThread = Thread.currentThread();
        w5.k.e(threadCurrentThread, "Thread.currentThread()");
        return f20065d[(int) (threadCurrentThread.getId() & (((long) f20064c) - 1))];
    }

    public static final void b(x xVar) {
        w5.k.f(xVar, TradPlusHelper.KEY_SEGMENT);
        if (!(xVar.f20060f == null && xVar.f20061g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (xVar.f20058d) {
            return;
        }
        AtomicReference atomicReferenceA = f20066e.a();
        x xVar2 = (x) atomicReferenceA.get();
        if (xVar2 == f20063b) {
            return;
        }
        int i7 = xVar2 != null ? xVar2.f20057c : 0;
        if (i7 >= f20062a) {
            return;
        }
        xVar.f20060f = xVar2;
        xVar.f20056b = 0;
        xVar.f20057c = i7 + 8192;
        if (com.facebook.jni.a.a(atomicReferenceA, xVar2, xVar)) {
            return;
        }
        xVar.f20060f = null;
    }

    public static final x c() {
        AtomicReference atomicReferenceA = f20066e.a();
        x xVar = f20063b;
        x xVar2 = (x) atomicReferenceA.getAndSet(xVar);
        if (xVar2 == xVar) {
            return new x();
        }
        if (xVar2 == null) {
            atomicReferenceA.set(null);
            return new x();
        }
        atomicReferenceA.set(xVar2.f20060f);
        xVar2.f20060f = null;
        xVar2.f20057c = 0;
        return xVar2;
    }
}
