package P3;

import android.app.PendingIntent;
import java.util.Map;

/* JADX INFO: renamed from: P3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0449a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f2588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f2589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f2590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f2591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f2592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f2593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PendingIntent f2594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PendingIntent f2595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final PendingIntent f2596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PendingIntent f2597n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map f2598o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f2599p = false;

    private C0449a(String str, int i7, int i8, int i9, Integer num, int i10, long j7, long j8, long j9, long j10, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.f2584a = str;
        this.f2585b = i7;
        this.f2586c = i8;
        this.f2587d = i9;
        this.f2588e = num;
        this.f2589f = i10;
        this.f2590g = j7;
        this.f2591h = j8;
        this.f2592i = j9;
        this.f2593j = j10;
        this.f2594k = pendingIntent;
        this.f2595l = pendingIntent2;
        this.f2596m = pendingIntent3;
        this.f2597n = pendingIntent4;
        this.f2598o = map;
    }

    public static C0449a d(String str, int i7, int i8, int i9, Integer num, int i10, long j7, long j8, long j9, long j10, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        return new C0449a(str, i7, i8, i9, num, i10, j7, j8, j9, j10, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private final boolean g(d dVar) {
        return dVar.a() && this.f2592i <= this.f2593j;
    }

    public boolean a(d dVar) {
        return c(dVar) != null;
    }

    public int b() {
        return this.f2586c;
    }

    final PendingIntent c(d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f2595l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (g(dVar)) {
                return this.f2597n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f2594k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (g(dVar)) {
                return this.f2596m;
            }
        }
        return null;
    }

    final void e() {
        this.f2599p = true;
    }

    final boolean f() {
        return this.f2599p;
    }
}
