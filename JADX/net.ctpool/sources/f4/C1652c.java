package f4;

import android.os.Bundle;
import e4.C1629g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: f4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1652c implements InterfaceC1651b, InterfaceC1650a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f19299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f19301c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CountDownLatch f19303e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f19302d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19304f = false;

    public C1652c(e eVar, int i7, TimeUnit timeUnit) {
        this.f19299a = eVar;
        this.f19300b = i7;
        this.f19301c = timeUnit;
    }

    @Override // f4.InterfaceC1650a
    public void a(String str, Bundle bundle) {
        synchronized (this.f19302d) {
            try {
                C1629g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f19303e = new CountDownLatch(1);
                this.f19304f = false;
                this.f19299a.a(str, bundle);
                C1629g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f19303e.await(this.f19300b, this.f19301c)) {
                        this.f19304f = true;
                        C1629g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        C1629g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    C1629g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f19303e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f4.InterfaceC1651b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f19303e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
