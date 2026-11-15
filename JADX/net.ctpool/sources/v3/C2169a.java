package v3;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1073e1;
import w3.v;

/* JADX INFO: renamed from: v3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2169a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1073e1 f22583a;

    /* JADX INFO: renamed from: v3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0323a extends v {
    }

    public C2169a(C1073e1 c1073e1) {
        this.f22583a = c1073e1;
    }

    public void a(String str, String str2, Bundle bundle) {
        this.f22583a.D(str, str2, bundle);
    }

    public void b(InterfaceC0323a interfaceC0323a) {
        this.f22583a.w(interfaceC0323a);
    }

    public void c(String str, String str2, Object obj) {
        this.f22583a.v(str, str2, obj, true);
    }

    public final void d(boolean z6) {
        this.f22583a.x(z6);
    }
}
