package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7158a = new c();

    private c() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        w5.k.f(bundle, "bundle");
        w5.k.f(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        w5.k.f(bundle, "bundle");
        w5.k.f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
