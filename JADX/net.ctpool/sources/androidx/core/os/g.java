package androidx.core.os;

import android.os.OutcomeReceiver;
import app.notifee.core.event.LogEvent;
import i5.m;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.InterfaceC1885d;

/* JADX INFO: loaded from: classes.dex */
final class g extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1885d f7163m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC1885d interfaceC1885d) {
        super(false);
        w5.k.f(interfaceC1885d, "continuation");
        this.f7163m = interfaceC1885d;
    }

    public void onError(Throwable th) {
        w5.k.f(th, LogEvent.LEVEL_ERROR);
        if (compareAndSet(false, true)) {
            InterfaceC1885d interfaceC1885d = this.f7163m;
            m.a aVar = i5.m.f19973m;
            interfaceC1885d.h(i5.m.a(i5.n.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f7163m.h(i5.m.a(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
