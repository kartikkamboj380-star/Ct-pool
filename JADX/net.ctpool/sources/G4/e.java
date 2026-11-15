package G4;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f1259d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f1260e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f1261a = i.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1263c;

    e() {
    }

    private synchronized long a(int i7) {
        if (c(i7)) {
            return (long) Math.min(Math.pow(2.0d, this.f1263c) + this.f1261a.e(), f1260e);
        }
        return f1259d;
    }

    private static boolean c(int i7) {
        return i7 == 429 || (i7 >= 500 && i7 < 600);
    }

    private static boolean d(int i7) {
        return (i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404;
    }

    private synchronized void e() {
        this.f1263c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean b() {
        boolean z6;
        if (this.f1263c != 0) {
            z6 = this.f1261a.a() > this.f1262b;
        }
        return z6;
    }

    public synchronized void f(int i7) {
        if (d(i7)) {
            e();
            return;
        }
        this.f1263c++;
        this.f1262b = this.f1261a.a() + a(i7);
    }
}
