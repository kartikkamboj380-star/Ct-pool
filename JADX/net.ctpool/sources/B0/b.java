package B0;

import A0.g;
import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f661c;

    public b(g.a aVar, String str) {
        k.f(aVar, "attempt");
        k.f(str, "javascriptToInject");
        this.f659a = aVar;
        this.f660b = str;
        this.f661c = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(WebView webView, b bVar) {
        k.f(bVar, "this$0");
        if (webView != null) {
            webView.stopLoading();
        }
        if (webView != null) {
            webView.loadUrl("javascript:" + bVar.f660b);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(final WebView webView, WebResourceRequest webResourceRequest) {
        if (k.b(webResourceRequest != null ? webResourceRequest.getMethod() : null, "POST")) {
            String string = webResourceRequest.getUrl().toString();
            k.e(string, "toString(...)");
            if (F5.g.G(string, this.f659a.b(), false, 2, null)) {
                try {
                    Thread.currentThread().interrupt();
                } catch (Exception unused) {
                }
                this.f661c.post(new Runnable() { // from class: B0.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.b(webView, this);
                    }
                });
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}
