package k0;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WebViewProviderFactoryBoundaryInterface f20504a;

    public h(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f20504a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // k0.g
    public String[] a() {
        return this.f20504a.getSupportedFeatures();
    }

    @Override // k0.g
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) k6.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f20504a.getWebkitToCompatConverter());
    }
}
