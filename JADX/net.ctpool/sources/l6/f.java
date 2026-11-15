package l6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class f extends Handler implements l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final k f21166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f21167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c f21168o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21169p;

    public f(c cVar, Looper looper, int i7) {
        super(looper);
        this.f21168o = cVar;
        this.f21167n = i7;
        this.f21166m = new k();
    }

    @Override // l6.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            try {
                this.f21166m.a(jVarA);
                if (!this.f21169p) {
                    this.f21169p = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new e("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                j jVarB = this.f21166m.b();
                if (jVarB == null) {
                    synchronized (this) {
                        jVarB = this.f21166m.b();
                        if (jVarB == null) {
                            this.f21169p = false;
                            return;
                        }
                    }
                }
                this.f21168o.g(jVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f21167n);
            if (!sendMessage(obtainMessage())) {
                throw new e("Could not send handler message");
            }
            this.f21169p = true;
        } catch (Throwable th) {
            this.f21169p = false;
            throw th;
        }
    }
}
