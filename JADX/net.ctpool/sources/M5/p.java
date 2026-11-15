package M5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f2103a = new F("CONDITION_FALSE");

    public static final Object a() {
        return f2103a;
    }

    public static final q b(Object obj) {
        q qVar;
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null && (qVar = zVar.f2124a) != null) {
            return qVar;
        }
        w5.k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (q) obj;
    }
}
