package J0;

import I0.c;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class o implements I0.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f1641i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static o f1642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f1643k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private I0.d f1644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f1645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f1646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f1647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f1648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f1649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c.a f1650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o f1651h;

    private o() {
    }

    public static o a() {
        synchronized (f1641i) {
            try {
                o oVar = f1642j;
                if (oVar == null) {
                    return new o();
                }
                f1642j = oVar.f1651h;
                oVar.f1651h = null;
                f1643k--;
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c() {
        this.f1644a = null;
        this.f1645b = null;
        this.f1646c = 0L;
        this.f1647d = 0L;
        this.f1648e = 0L;
        this.f1649f = null;
        this.f1650g = null;
    }

    public void b() {
        synchronized (f1641i) {
            try {
                if (f1643k < 5) {
                    c();
                    f1643k++;
                    o oVar = f1642j;
                    if (oVar != null) {
                        this.f1651h = oVar;
                    }
                    f1642j = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public o d(I0.d dVar) {
        this.f1644a = dVar;
        return this;
    }

    public o e(long j7) {
        this.f1647d = j7;
        return this;
    }

    public o f(long j7) {
        this.f1648e = j7;
        return this;
    }

    public o g(c.a aVar) {
        this.f1650g = aVar;
        return this;
    }

    public o h(IOException iOException) {
        this.f1649f = iOException;
        return this;
    }

    public o i(long j7) {
        this.f1646c = j7;
        return this;
    }

    public o j(String str) {
        this.f1645b = str;
        return this;
    }
}
