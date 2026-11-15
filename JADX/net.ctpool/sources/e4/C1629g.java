package e4;

import android.util.Log;

/* JADX INFO: renamed from: e4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1629g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final C1629g f19208c = new C1629g("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19210b = 4;

    public C1629g(String str) {
        this.f19209a = str;
    }

    private boolean a(int i7) {
        return this.f19210b <= i7 || Log.isLoggable(this.f19209a, i7);
    }

    public static C1629g f() {
        return f19208c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f19209a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f19209a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f19209a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f19209a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f19209a, str, th);
        }
    }
}
