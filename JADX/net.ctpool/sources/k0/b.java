package k0;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f20450a = new String[0];

    @Override // k0.g
    public String[] a() {
        return f20450a;
    }

    @Override // k0.g
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
