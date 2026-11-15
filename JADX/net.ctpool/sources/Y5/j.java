package Y5;

import i5.AbstractC1744a;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f4593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final IOException f4594n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(IOException iOException) {
        super(iOException);
        w5.k.f(iOException, "firstConnectException");
        this.f4594n = iOException;
        this.f4593m = iOException;
    }

    public final void a(IOException iOException) {
        w5.k.f(iOException, "e");
        AbstractC1744a.a(this.f4594n, iOException);
        this.f4593m = iOException;
    }

    public final IOException b() {
        return this.f4594n;
    }

    public final IOException c() {
        return this.f4593m;
    }
}
