package n3;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: n3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class HandlerC1916i extends s3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1910c f21388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC1916i(C1910c c1910c, Looper looper) {
        super(looper);
        this.f21388b = c1910c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1910c.g(this.f21388b, message);
    }
}
