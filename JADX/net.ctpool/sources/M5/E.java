package M5;

import a.C0492a;
import i5.m;
import o5.AbstractC1946a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f2063a = new C0492a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f2064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f2065c;

    static {
        Object objA;
        Object objA2;
        try {
            m.a aVar = i5.m.f19973m;
            objA = i5.m.a(AbstractC1946a.class.getCanonicalName());
        } catch (Throwable th) {
            m.a aVar2 = i5.m.f19973m;
            objA = i5.m.a(i5.n.a(th));
        }
        if (i5.m.b(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f2064b = (String) objA;
        try {
            objA2 = i5.m.a(E.class.getCanonicalName());
        } catch (Throwable th2) {
            m.a aVar3 = i5.m.f19973m;
            objA2 = i5.m.a(i5.n.a(th2));
        }
        if (i5.m.b(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f2065c = (String) objA2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
