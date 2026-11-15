package H5;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends CancellationException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient InterfaceC0415q0 f1446m;

    public r0(String str, Throwable th, InterfaceC0415q0 interfaceC0415q0) {
        super(str);
        this.f1446m = interfaceC0415q0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof r0) {
                r0 r0Var = (r0) obj;
                if (!w5.k.b(r0Var.getMessage(), getMessage()) || !w5.k.b(r0Var.f1446m, this.f1446m) || !w5.k.b(r0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        w5.k.c(message);
        int iHashCode = ((message.hashCode() * 31) + this.f1446m.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f1446m;
    }
}
