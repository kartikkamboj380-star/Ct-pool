package T0;

import O0.q;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f2994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f2995i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile File f2997b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile File f2999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f3000e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile StatFs f2996a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile StatFs f2998c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f3002g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lock f3001f = new ReentrantLock();

    /* JADX INFO: renamed from: T0.a$a, reason: collision with other inner class name */
    public enum EnumC0068a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f3002g) {
            return;
        }
        this.f3001f.lock();
        try {
            if (!this.f3002g) {
                this.f2997b = Environment.getDataDirectory();
                this.f2999d = Environment.getExternalStorageDirectory();
                g();
                this.f3002g = true;
            }
        } finally {
            this.f3001f.unlock();
        }
    }

    public static synchronized a d() {
        try {
            if (f2994h == null) {
                f2994h = new a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2994h;
    }

    private void e() {
        if (this.f3001f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f3000e > f2995i) {
                    g();
                }
            } finally {
                this.f3001f.unlock();
            }
        }
    }

    private void g() {
        this.f2996a = h(this.f2996a, this.f2997b);
        this.f2998c = h(this.f2998c, this.f2999d);
        this.f3000e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        StatFs statFs2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = a(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            statFs2 = statFs;
            return statFs2;
        } catch (IllegalArgumentException unused) {
            return statFs2;
        } catch (Throwable th) {
            throw q.a(th);
        }
    }

    public long c(EnumC0068a enumC0068a) {
        b();
        e();
        StatFs statFs = enumC0068a == EnumC0068a.INTERNAL ? this.f2996a : this.f2998c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public boolean f(EnumC0068a enumC0068a, long j7) {
        b();
        long jC = c(enumC0068a);
        return jC <= 0 || jC < j7;
    }
}
