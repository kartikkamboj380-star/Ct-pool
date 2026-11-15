package B3;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f750e;

    public d(long j7, long j8) {
        this.f748c = null;
        this.f749d = 0;
        this.f750e = 1;
        this.f746a = j7;
        this.f747b = j8;
    }

    static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f749d = valueAnimator.getRepeatCount();
        dVar.f750e = valueAnimator.getRepeatMode();
        return dVar;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f740b : interpolator instanceof AccelerateInterpolator ? a.f741c : interpolator instanceof DecelerateInterpolator ? a.f742d : interpolator;
    }

    public long b() {
        return this.f746a;
    }

    public long c() {
        return this.f747b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f748c;
        return timeInterpolator != null ? timeInterpolator : a.f740b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f749d;
    }

    public int g() {
        return this.f750e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public d(long j7, long j8, TimeInterpolator timeInterpolator) {
        this.f749d = 0;
        this.f750e = 1;
        this.f746a = j7;
        this.f747b = j8;
        this.f748c = timeInterpolator;
    }
}
