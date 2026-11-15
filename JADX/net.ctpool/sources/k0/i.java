package k0;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f20505a;

    public i(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f20505a = webkitToCompatConverterBoundaryInterface;
    }

    public c a(WebSettings webSettings) {
        return new c((WebSettingsBoundaryInterface) k6.a.a(WebSettingsBoundaryInterface.class, this.f20505a.convertSettings(webSettings)));
    }
}
