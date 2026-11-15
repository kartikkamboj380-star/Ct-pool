package K2;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1844a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1845b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1846c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f1847d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f1848e = -11;

    public float a() {
        return this.f1846c;
    }

    public float b() {
        return this.f1847d;
    }

    public boolean c(int i7, int i8) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j7 = this.f1848e;
        boolean z6 = (jUptimeMillis - j7 <= 10 && this.f1844a == i7 && this.f1845b == i8) ? false : true;
        if (jUptimeMillis - j7 != 0) {
            this.f1846c = (i7 - this.f1844a) / (jUptimeMillis - j7);
            this.f1847d = (i8 - this.f1845b) / (jUptimeMillis - j7);
        }
        this.f1848e = jUptimeMillis;
        this.f1844a = i7;
        this.f1845b = i8;
        return z6;
    }
}
