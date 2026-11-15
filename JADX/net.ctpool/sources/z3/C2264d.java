package z3;

/* JADX INFO: renamed from: z3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2264d extends IllegalStateException {
    private C2264d(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(AbstractC2272l abstractC2272l) {
        if (!abstractC2272l.o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excK = abstractC2272l.k();
        return new C2264d("Complete with: ".concat(excK != null ? "failure" : abstractC2272l.p() ? "result ".concat(String.valueOf(abstractC2272l.l())) : abstractC2272l.n() ? "cancellation" : "unknown issue"), excK);
    }
}
