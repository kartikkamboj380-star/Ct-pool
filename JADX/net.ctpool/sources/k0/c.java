package k0;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebSettingsBoundaryInterface f20451a;

    public c(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f20451a = webSettingsBoundaryInterface;
    }

    public void a(int i7) {
        this.f20451a.setForceDark(i7);
    }

    public void b(int i7) {
        this.f20451a.setForceDarkBehavior(i7);
    }
}
