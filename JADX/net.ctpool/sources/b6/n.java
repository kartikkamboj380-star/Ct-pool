package b6;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends IOException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f9958m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super("stream was reset: " + bVar);
        w5.k.f(bVar, "errorCode");
        this.f9958m = bVar;
    }
}
