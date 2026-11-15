package n3;

import android.os.Bundle;
import android.util.Log;
import z3.C2273m;

/* JADX INFO: renamed from: n3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1900A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f21352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final C2273m f21353b = new C2273m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f21354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Bundle f21355d;

    AbstractC1900A(int i7, int i8, Bundle bundle) {
        this.f21352a = i7;
        this.f21354c = i8;
        this.f21355d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(C1901B c1901b) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + c1901b.toString());
        }
        this.f21353b.b(c1901b);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f21353b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f21354c + " id=" + this.f21352a + " oneWay=" + b() + "}";
    }
}
