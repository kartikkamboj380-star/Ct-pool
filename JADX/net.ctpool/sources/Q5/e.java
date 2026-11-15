package Q5;

import M5.F;
import M5.I;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f2816a = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final F f2817b = new F("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final F f2818c = new F("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final F f2819d = new F("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final F f2820e = new F("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f2821f = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final f h(long j7, f fVar) {
        return new f(j7, fVar, 0);
    }
}
