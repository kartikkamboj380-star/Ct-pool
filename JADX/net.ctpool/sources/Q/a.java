package Q;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.core.os.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f2701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile RunnableC0056a f2702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile RunnableC0056a f2703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f2704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f2705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f2706n;

    /* JADX INFO: renamed from: Q.a$a, reason: collision with other inner class name */
    final class RunnableC0056a extends d implements Runnable {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f2707r;

        RunnableC0056a() {
        }

        @Override // Q.d
        protected Object b() {
            try {
                return a.this.I();
            } catch (l e7) {
                if (f()) {
                    return null;
                }
                throw e7;
            }
        }

        @Override // Q.d
        protected void g(Object obj) {
            a.this.B(this, obj);
        }

        @Override // Q.d
        protected void h(Object obj) {
            a.this.C(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2707r = false;
            a.this.D();
        }
    }

    public a(Context context) {
        super(context);
        this.f2705m = -10000L;
    }

    void B(RunnableC0056a runnableC0056a, Object obj) {
        H(obj);
        if (this.f2703k == runnableC0056a) {
            v();
            this.f2705m = SystemClock.uptimeMillis();
            this.f2703k = null;
            e();
            D();
        }
    }

    void C(RunnableC0056a runnableC0056a, Object obj) {
        if (this.f2702j != runnableC0056a) {
            B(runnableC0056a, obj);
            return;
        }
        if (j()) {
            H(obj);
            return;
        }
        c();
        this.f2705m = SystemClock.uptimeMillis();
        this.f2702j = null;
        f(obj);
    }

    void D() {
        if (this.f2703k != null || this.f2702j == null) {
            return;
        }
        if (this.f2702j.f2707r) {
            this.f2702j.f2707r = false;
            this.f2706n.removeCallbacks(this.f2702j);
        }
        if (this.f2704l > 0 && SystemClock.uptimeMillis() < this.f2705m + this.f2704l) {
            this.f2702j.f2707r = true;
            this.f2706n.postAtTime(this.f2702j, this.f2705m + this.f2704l);
        } else {
            if (this.f2701i == null) {
                this.f2701i = E();
            }
            this.f2702j.c(this.f2701i);
        }
    }

    protected Executor E() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean F() {
        return this.f2703k != null;
    }

    public abstract Object G();

    protected Object I() {
        return G();
    }

    @Override // Q.c
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f2702j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f2702j);
            printWriter.print(" waiting=");
            printWriter.println(this.f2702j.f2707r);
        }
        if (this.f2703k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f2703k);
            printWriter.print(" waiting=");
            printWriter.println(this.f2703k.f2707r);
        }
        if (this.f2704l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f2704l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f2705m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f2705m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // Q.c
    protected boolean n() {
        if (this.f2702j == null) {
            return false;
        }
        if (!l()) {
            o();
        }
        if (this.f2703k != null) {
            if (this.f2702j.f2707r) {
                this.f2702j.f2707r = false;
                this.f2706n.removeCallbacks(this.f2702j);
            }
            this.f2702j = null;
            return false;
        }
        if (this.f2702j.f2707r) {
            this.f2702j.f2707r = false;
            this.f2706n.removeCallbacks(this.f2702j);
            this.f2702j = null;
            return false;
        }
        boolean zA = this.f2702j.a(false);
        if (zA) {
            this.f2703k = this.f2702j;
            A();
        }
        this.f2702j = null;
        return zA;
    }

    @Override // Q.c
    protected void p() {
        super.p();
        b();
        this.f2702j = new RunnableC0056a();
        D();
    }

    public void A() {
    }

    public void H(Object obj) {
    }
}
