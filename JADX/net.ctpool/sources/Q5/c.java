package Q5;

import M5.F;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f2804a = new F("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final F f2805b = new F("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z6) {
        return new b(z6);
    }

    public static /* synthetic */ a b(boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        return a(z6);
    }
}
