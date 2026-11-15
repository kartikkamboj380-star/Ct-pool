package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7157a = new b();

    private b() {
    }

    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        w5.k.f(bundle, "bundle");
        w5.k.f(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
