package L5;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient K5.c f1993m;

    public a(K5.c cVar) {
        super("Flow was aborted, no more elements needed");
        this.f1993m = cVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
